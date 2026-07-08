package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.im.common.model.SharePanelItemInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.minis.page.main.morepanel.view.MinisInternalShareVM;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366200lek extends FrameLayout implements LifecycleOwner, InterfaceC1356390lOv, InterfaceC1363760lao {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public InterfaceC1356400lOw LL;
    public InterfaceC1356370lOt LLILLJJLI;
    public InterfaceC1356390lOv LLILLL;
    public LinearLayout LLILZ;
    public RecyclerView LLILZIL;
    public TuxTextView LLILZLL;
    public SharePackage LLIZ;
    public AbstractC1363040lZe LLIZLLLIL;
    public InterfaceC1366230len LLJ;
    public String LLJI;
    public List<SharePanelItemInfo> LLJIJIL;
    public InterfaceC1366250lep LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public MinisInternalShareVM LLJJ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C1366200lek.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
    }

    @Override // X.InterfaceC1363760lao
    public final void LJLJJLL() {
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LLJILLL.getValue();
    }

    public final void LIZ() {
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
        SpannableString spannableString = new SpannableString(C1710306mr.LIZIZ(2131822342, C1383370m6R.LJIIJ(2131822343)));
        C786410Ut5.p2(spannableString, new AbstractC426530Gnz() { // from class: X.0lem
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                IInternalShareApi.LIZ.getClass();
                InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("minis_client_key:");
                sbLIZ.append(this.LL.LLJI);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int value = EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL.getValue();
                final C1366200lek c1366200lek = this.LL;
                interfaceC1364710lcLLIZIZ.LJIJI(strLIZIZ, value, new InterfaceC1366080leY() { // from class: X.0lel
                    @Override // X.InterfaceC1366080leY
                    public final void LIZ() {
                        InterfaceC1356370lOt interfaceC1356370lOt = c1366200lek.LLILLJJLI;
                        if (interfaceC1356370lOt != null) {
                            interfaceC1356370lOt.refresh();
                        }
                    }
                });
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(R.attr.a1n);
                textPaint.setUnderlineText(false);
            }
        }, a0.LJJJ(spannableString, C1383370m6R.LJIIJ(2131822343), 0, false, 6), spannableString.length(), 17);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableString);
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setClickable(true);
        }
        TuxTextView tuxTextView3 = this.LLILZLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TuxTextView tuxTextView4 = this.LLILZLL;
        if (tuxTextView4 != null) {
            C786410Ut5.LLLLZLL(tuxTextView4, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        FragmentManager childFragmentManager;
        Fragment fragmentLJJJJZI;
        SharePackage sharePackage;
        AbstractC1363040lZe abstractC1363040lZe;
        super.onAttachedToWindow();
        C19EG c19egLJJIII = SAFExtensionKt.LJJIII(getContext());
        if (c19egLJJIII != null && this.LLJJ == null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(MinisInternalShareVM.class);
            AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(c19egLJJIII, c19719912DlLIZ), new AwS565S0100000_21(c19719912DlLIZ, 1319), new C452070Ho5(), C724750Sbp.LJII(c19egLJJIII), C724750Sbp.LJIIIZ(c19egLJJIII), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) c19egLJJIII, 1320), AFwS259S0000000_21.get$arr$(359));
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            this.LLJJ = (MinisInternalShareVM) assemVMLazy.getValue();
        }
        this.LLILZ = (LinearLayout) findViewById(R.id.of_);
        IInternalShareApi.LIZ.getClass();
        InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
        SharePackage sharePackage2 = this.LLIZ;
        C1362230lYL c1362230lYL = new C1362230lYL();
        c1362230lYL.LJIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c1362230lYL.LJIIJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
        c1362230lYL.LJIILLIIL = C1308910kAL.LIZJ(R.attr.a1j, getContext());
        c1362230lYL.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c1362230lYL.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c1362230lYL.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C1363630lab c1363630lab = new C1363630lab(false, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), 2, true, EnumC1364050lbH.MASK_WITH_CHECK_MARK, AFwS259S0000000_21.get$arr$(360));
        EnumC1364450lbv enumC1364450lbv = EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL;
        Pair<InterfaceC1356400lOw, InterfaceC1356370lOt> pairLJJJJL = interfaceC1364710lcLLIZIZ.LJJJJL(sharePackage2, this, false, false, false, this, this, c1363630lab, true, c1362230lYL, null, null, enumC1364450lbv);
        InterfaceC1356400lOw first = pairLJJJJL.getFirst();
        InterfaceC1356370lOt second = pairLJJJJL.getSecond();
        this.LL = first;
        this.LLILZLL = (TuxTextView) findViewById(R.id.nkp);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.of9);
        Object obj = this.LL;
        recyclerView.setAdapter(obj instanceof AbstractC21673619ry ? (AbstractC21673619ry) obj : null);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        this.LLILZIL = recyclerView;
        recyclerView.addItemDecoration(new C424780GlA(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0));
        this.LLILLJJLI = second;
        if (second != null) {
            second.refresh();
        }
        getLifecycleRegistry().setCurrentState(Lifecycle.State.STARTED);
        String str = ShareSheetPanelFragment._pnsPageId;
        Fragment fragmentLIZIZ = C1378440lyU.LIZIZ(getContext());
        if (fragmentLIZIZ != null && (childFragmentManager = fragmentLIZIZ.getChildFragmentManager()) != null && (fragmentLJJJJZI = childFragmentManager.LJJJJZI("sheet_content_fragment")) != null && (sharePackage = this.LLIZ) != null && (abstractC1363040lZe = this.LLIZLLLIL) != null) {
            this.LLILLL = C1370970lmR.LIZ().LIZIZ().LJJIJIIJI(fragmentLJJJJZI, sharePackage, C13BV.INSTANCE, abstractC1363040lZe, this.LLILLJJLI);
        }
        InterfaceC1366230len interfaceC1366230len = this.LLJ;
        if (interfaceC1366230len != null) {
            interfaceC1366230len.LIZJ();
        }
        this.LLJIJIL = C1370970lmR.LIZ().LIZIZ().LJIILL(Integer.valueOf(enumC1364450lbv.getValue()));
        if (C1370970lmR.LIZ().LIZIZ().LJJIJIIJIL(Integer.valueOf(enumC1364450lbv.getValue()))) {
            LIZ();
            return;
        }
        RecyclerView recyclerView2 = this.LLILZIL;
        if (recyclerView2 != null) {
            C786410Ut5.LLIZLLLIL(recyclerView2, 0);
        }
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView != null) {
            C2211751BhN.LIZIZ(recyclerView);
        }
        this.LLJILJILJ = false;
    }

    public C1366200lek(Context context) {
        super(context, null);
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1321));
        FrameLayout.inflate(context, R.layout.dok, this);
    }

    @Override // X.InterfaceC1363760lao
    public final void Sc(IMContact iMContact) {
        InterfaceC1356370lOt interfaceC1356370lOt;
        if (((iMContact instanceof IMUser) || (iMContact instanceof IMConversation)) && (interfaceC1356370lOt = this.LLILLJJLI) != null) {
            interfaceC1356370lOt.LIZ(iMContact);
        }
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        if (list.isEmpty()) {
            LinearLayout linearLayout = this.LLILZ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.LLILZ;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
        RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
        }
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        if (!this.LLJILJILJ) {
            C2196701AyC.LIZ.getClass();
            C2196701AyC.LJJII("tm_more_functional_panel_icon_show", "dm_friend_icon");
            this.LLJILJILJ = true;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadComplete: list: ");
        sbLIZ.append(list.size());
        sbLIZ.append("  config maxContactCount = 15");
        C1720106oR.LJI("MinisInternalShareView", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1356400lOw interfaceC1356400lOw = this.LL;
        if (interfaceC1356400lOw != null) {
            if (list.size() > 15) {
                list = list.subList(0, 15);
            }
            getContext();
            interfaceC1356400lOw.LLJILJILJ(this, list);
        }
    }

    public final void setCallBack(AbstractC1363040lZe abstractC1363040lZe) {
        this.LLIZLLLIL = abstractC1363040lZe;
    }

    public final void setClientKey(String str) {
        this.LLJI = str;
    }

    public final void setMinisShareCallback(InterfaceC1366230len interfaceC1366230len) {
        this.LLJ = interfaceC1366230len;
    }

    public final void setSharePackage(SharePackage sharePackage) {
        this.LLIZ = sharePackage;
        InterfaceC1366250lep interfaceC1366250lep = this.LLJILJIL;
        if (interfaceC1366250lep != null) {
            interfaceC1366250lep.E3(sharePackage);
        }
    }

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
        LIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0155, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    @Override // X.InterfaceC1356390lOv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean eJ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366200lek.eJ2(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, boolean):boolean");
    }

    public final void LIZIZ(String str, InterfaceC1366240leo interfaceC1366240leo, int i) {
        Map<String, String> mapLIZLLL = null;
        InterfaceC1366240leo interfaceC1366240leo2 = interfaceC1366240leo;
        if (interfaceC1366240leo == null) {
            IInternalShareApi.LIZ.getClass();
            C1214160hhW c1214160hhWLJIIIIZZ = C1370970lmR.LIZ().LIZIZ().LJIIIIZZ(getContext(), Integer.valueOf(R.raw.icon_info_circle), str, null, true, false);
            c1214160hhWLJIIIIZZ.setId(R.id.ogp);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            LinearLayout linearLayout = this.LLILZ;
            if (linearLayout != null) {
                linearLayout.addView(c1214160hhWLJIIIIZZ, layoutParams);
            }
            boolean z = c1214160hhWLJIIIIZZ instanceof InterfaceC1366240leo;
            interfaceC1366240leo2 = c1214160hhWLJIIIIZZ;
            if (!z) {
                interfaceC1366240leo2 = null;
            }
        }
        InterfaceC1366230len interfaceC1366230len = this.LLJ;
        if (interfaceC1366230len != null) {
            interfaceC1366230len.LIZLLL(true);
        }
        if (interfaceC1366240leo2 != null) {
            interfaceC1366240leo2.LIZIZ(str, Float.valueOf(13.0f));
            interfaceC1366240leo2.LIZ(true);
        }
        C2196701AyC.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        }
        c2344009Gk.LJII(mapLIZLLL);
        c2344009Gk.LIZJ(i, "error_msg_key");
        c2344009Gk.LJFF("enter_method", "share_panel");
        Map<String, String> map = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("tm_send_dm_error_banner_show", map);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSendDMErrorBannerShow, data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z2 = interfaceC1366240leo2 instanceof FrameLayout;
    }
}
