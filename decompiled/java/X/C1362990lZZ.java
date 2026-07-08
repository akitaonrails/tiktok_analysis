package X;

import Y.AObserverS224S0100000_21;
import Y.ARunnableS121S0100000_21;
import Y.ATListenerS0S0110001_4;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lZZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362990lZZ extends FrameLayout implements InterfaceC1364650lcF {
    public SharePackage LL;
    public List<? extends InterfaceC1369790lkX> LLILLJJLI;
    public C1371590lnR LLILLL;
    public SharePanelImHeadViewModel LLILZ;
    public C0I1X LLILZIL;
    public C1364640lcE LLILZLL;
    public C1363050lZf LLIZ;
    public InterfaceC1362600lYw LLIZLLLIL;
    public Fragment LLJ;
    public boolean LLJI;
    public View LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C459790I1h LLJL;

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
    }

    private final View getDivider() {
        return (View) this.LLJJJJLIIL.getValue();
    }

    private final View getEditLayout() {
        return (View) this.LLJJJJ.getValue();
    }

    private final ViewGroup getEtAvatarLayout() {
        return (ViewGroup) this.LLJJL.getValue();
    }

    private final ViewGroup getEtContainer() {
        return (ViewGroup) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final ViewGroup getLlImOperationRoot() {
        return (ViewGroup) this.LLJJJJJIL.getValue();
    }

    private final RemoteImageView getMultiShareCover() {
        return (RemoteImageView) this.LLJJIJIIJIL.getValue();
    }

    private final TuxIconView getMultiShareIcon() {
        return (TuxIconView) this.LLJJJ.getValue();
    }

    private final LinearLayout getSendContainer() {
        return (LinearLayout) this.LLJJIII.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[PHI: r11
      0x007f: PHI (r11v1 java.lang.Object) = (r11v4 java.lang.Object), (r11v0 java.lang.Object), (r11v7 java.lang.Object) binds: [B:16:0x0030, B:18:0x0034, B:34:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String[], java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0lct] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.0lZZ, android.view.View] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0ldQ] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1362990lZZ.LIZ():void");
    }

    public final void LIZIZ() {
        SkeletonSharePanelFragment skeletonSharePanelFragment;
        Fragment fragment = this.LLJ;
        Fragment fragment2 = fragment == null ? null : fragment;
        if ((fragment2 instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment = (SkeletonSharePanelFragment) fragment2) != null && skeletonSharePanelFragment.LLJJJIL) {
            KeyboardUtils.LIZIZ(getMultiShareEt());
            return;
        }
        if (fragment == null) {
            fragment = null;
        }
        if (!(fragment instanceof InterfaceC1363000lZa) || fragment == null) {
            return;
        }
        KeyboardUtils.LIZIZ(getMultiShareEt());
    }

    public final void LJII() {
        SharePanelViewModel sharePanelViewModel;
        String strLIZLLL;
        Bundle bundle;
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LLILZ;
        if (sharePanelImHeadViewModel == null || (sharePanelViewModel = sharePanelImHeadViewModel.LLJJIJIL) == null || sharePanelViewModel.LLJJJJ) {
            return;
        }
        if (sharePanelViewModel.LJIILL().isEmpty() && !this.LLJI) {
            C786410Ut5.LLLLLLJ(getSend(), 8);
            return;
        }
        C786410Ut5.LLLLLLJ(getSend(), 0);
        getSend().setEnabled(!sharePanelViewModel.LJIILL().isEmpty());
        C197039127h send = getSend();
        C1364640lcE c1364640lcE = this.LLILZLL;
        if (c1364640lcE != null && c1364640lcE.LJ) {
            strLIZLLL = LIZLLL(2131835413);
        } else if (sharePanelViewModel.LJIILL().size() <= 1) {
            strLIZLLL = LIZLLL(R.string.sxo);
        } else {
            C1364640lcE c1364640lcE2 = this.LLILZLL;
            strLIZLLL = (c1364640lcE2 == null || !c1364640lcE2.isChecked()) ? LIZLLL(2131832048) : LIZLLL(2131835372);
        }
        send.setText(strLIZLLL);
        SharePackage sharePackage = this.LL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || !bundle.getBoolean("show_edit_send_direct_im_share")) {
            return;
        }
        C197039127h send2 = getSend();
        send2.setBackgroundResource(R.drawable.c_p);
        send2.setTextColorRes(send2.isEnabled() ? R.attr.ef : R.attr.a1p);
    }

    public final C0HZQ getCheckbox() {
        return (C0HZQ) this.LLJILJIL.getValue();
    }

    public final TuxTextView getCheckboxTv() {
        return (TuxTextView) this.LLJILJILJ.getValue();
    }

    public final C197039127h getCreateGroupButtonV2() {
        return (C197039127h) this.LLJILLL.getValue();
    }

    public final LinearLayout getGroupChatHint() {
        return (LinearLayout) this.LLJJ.getValue();
    }

    public final TuxTextView getMultiShareCommentContent() {
        return (TuxTextView) this.LLJJIJI.getValue();
    }

    public final C0I7D getMultiShareEt() {
        return (C0I7D) this.LLJJIJIL.getValue();
    }

    public final C197039127h getSend() {
        return (C197039127h) this.LLJJI.getValue();
    }

    public final FrameLayout getShareMiniEmojiContainer() {
        return (FrameLayout) this.LLJJJIL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC1362600lYw interfaceC1362600lYw;
        View viewFindViewById;
        Bundle bundle;
        super.onAttachedToWindow();
        SharePackage sharePackage = this.LL;
        if (sharePackage == null || (interfaceC1362600lYw = this.LLIZLLLIL) == null) {
            return;
        }
        Fragment fragment = this.LLJ;
        if (fragment == null) {
            fragment = null;
        }
        List<? extends InterfaceC1369790lkX> list = this.LLILLJJLI;
        if (list == null) {
            list = null;
        }
        SharePanelImHeadViewModel sharePanelImHeadViewModel = (SharePanelImHeadViewModel) new ViewModelProvider(fragment, new C1362320lYU(sharePackage, list, interfaceC1362600lYw, null)).get(SharePanelImHeadViewModel.class);
        this.LLILZ = sharePanelImHeadViewModel;
        if (sharePanelImHeadViewModel != null) {
            C2296808zG.LIZJ(sharePanelImHeadViewModel.LLJJIJIIJIL, null);
            sharePanelImHeadViewModel.xQ2();
        }
        SharePackage sharePackage2 = this.LL;
        int width = 0;
        boolean z = (sharePackage2 == null || (bundle = sharePackage2.extras) == null || !bundle.getBoolean("key_disable_emoji_panel")) ? false : true;
        SharePackage sharePackage3 = this.LL;
        if ((sharePackage3 == null || sharePackage3.LJIILJJIL()) && !z) {
            SharePackage sharePackage4 = this.LL;
            if (sharePackage4 == null || !sharePackage4.LJIJJ()) {
                width = -1;
            } else {
                Fragment fragment2 = this.LLJ;
                if (fragment2 == null) {
                    fragment2 = null;
                }
                View view = fragment2.getView();
                if (view != null && (viewFindViewById = view.findViewById(R.id.nhw)) != null) {
                    width = viewFindViewById.getWidth();
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C459770I1f(this, width, null), 3);
        } else {
            getMultiShareEt().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(107));
        }
        SharePanelImHeadViewModel sharePanelImHeadViewModel2 = this.LLILZ;
        if (sharePanelImHeadViewModel2 != null) {
            MutableLiveData<Set<IMContact>> mutableLiveData = sharePanelImHeadViewModel2.LLJI;
            Fragment fragment3 = this.LLJ;
            if (fragment3 == null) {
                fragment3 = null;
            }
            mutableLiveData.observe(fragment3, new AObserverS224S0100000_21(this, 72));
            MutableLiveData<Pair<IMContact, Boolean>> mutableLiveData2 = sharePanelImHeadViewModel2.LLJILJILJ;
            Fragment fragment4 = this.LLJ;
            if (fragment4 == null) {
                fragment4 = null;
            }
            mutableLiveData2.observe(fragment4, new AObserverS224S0100000_21(this, 73));
            MutableLiveData<Pair<List<IMContact>, Boolean>> mutableLiveData3 = sharePanelImHeadViewModel2.LLJILLL;
            Fragment fragment5 = this.LLJ;
            if (fragment5 == null) {
                fragment5 = null;
            }
            mutableLiveData3.observe(fragment5, new AObserverS224S0100000_21(this, 74));
            MutableLiveData<Boolean> mutableLiveData4 = sharePanelImHeadViewModel2.LLJJI;
            Fragment fragment6 = this.LLJ;
            mutableLiveData4.observe(fragment6 != null ? fragment6 : null, new AObserverS224S0100000_21(this, 75));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
        SharePanelViewModel sharePanelViewModel;
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LLILZ;
        if (sharePanelImHeadViewModel != null && (sharePanelViewModel = sharePanelImHeadViewModel.LLJJIJIL) != null) {
            sharePanelViewModel.LLJJJIL = true;
        }
        LIZ();
    }

    public final void LIZJ(List<IMContact> list) {
        String string;
        IMContact next;
        IMContact next2;
        C1363190lZt c1363190lZt;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        SharePanelViewModel sharePanelViewModel;
        Bundle bundle;
        String string7;
        String str;
        C1362500lYm bbDetailInfo;
        String str2;
        String str3;
        Bundle bundle2;
        Iterator<IMContact> it2 = list.iterator();
        while (true) {
            string = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1363710laj) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Iterator<IMContact> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (next2 instanceof C1363190lZt) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        if (next2 instanceof C1363190lZt) {
            c1363190lZt = (C1363190lZt) next2;
        } else {
            c1363190lZt = null;
        }
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : list) {
            if (!(iMContact instanceof C1363710laj) && !(iMContact instanceof C1363190lZt)) {
                arrayList.add(iMContact);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        SharePackage sharePackage = this.LL;
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            string2 = bundle2.getString("enter_from");
        } else {
            string2 = null;
        }
        C013C c013c = new C013C();
        c013c.element = true;
        if (c1363190lZt != null) {
            int size = list.size();
            SharePackage sharePackage2 = this.LL;
            Editable editableLLLLJI = C2204961BRm.LLLLJI(getMultiShareEt(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9M1UW/N8riSTM3RMZIftQU", null));
            if (editableLLLLJI != null) {
                string = editableLLLLJI.toString();
            }
            C1362500lYm bbDetailInfo2 = c1363190lZt.getBbDetailInfo();
            if (bbDetailInfo2 != null && (str = bbDetailInfo2.LIZ) != null && (bbDetailInfo = c1363190lZt.getBbDetailInfo()) != null && (str2 = bbDetailInfo.LIZIZ) != null && sharePackage2 != null) {
                if (size == 1) {
                    C786410Ut5.LJJJI("cancel_live_toast", "1", sharePackage2.extras);
                    InterfaceC1362600lYw interfaceC1362600lYw = this.LLIZLLLIL;
                    if (interfaceC1362600lYw != null) {
                        interfaceC1362600lYw.LJIIL(sharePackage2);
                    }
                }
                if (Intrinsics.LJFF(sharePackage2.extras.getString("live_event_is_anchor", CardStruct.IStatusCode.DEFAULT), "1")) {
                    str3 = "livesdk_live_event_anchor_share_confirm";
                } else {
                    str3 = "livesdk_live_event_user_share_confirm";
                }
                if (Intrinsics.LJFF("live_event", sharePackage2.itemType)) {
                    C1367430lgj c1367430lgj = C1367430lgj.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                    c1367430lgj.getClass();
                    C1367430lgj.LJI(str3, sharePackage2, c1363190lZt, false, jCurrentTimeMillis, interfaceC1493505szLIZIZ);
                }
                int i = c1363190lZt.displayPosition;
                C214824195i c214824195i = C214824195i.LIZIZ;
                Fragment fragment = this.LLJ;
                if (fragment == null) {
                    fragment = null;
                }
                c214824195i.LIZIZ(fragment, str, str2, sharePackage2, size, true, string, i, string2, new AwS600S0100000_21(this, 335), null);
            }
            c013c.element = false;
        }
        String str4 = "";
        if (next != null && ((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJJIJIIJI(getContext())) {
            if (Intrinsics.LJFF(C13LP.LJJJLL(list), next)) {
                c013c.element = false;
            }
            ITakoService iTakoService = (ITakoService) ServiceManager.get().getService(ITakoService.class);
            Aweme awemeLJJIJIL = C621180OYa.LIZ.LJJIJIL(this.LL);
            Editable editableLLLLJI2 = C2204961BRm.LLLLJI(getMultiShareEt(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9M1UW/N8riSTM3RMZIftQU", null));
            if (editableLLLLJI2 != null) {
                string7 = editableLLLLJI2.toString();
            } else {
                string7 = null;
            }
            boolean z = !c013c.element;
            Context context = getContext();
            if (string2 == null) {
                string2 = "";
            }
            iTakoService.LJJLJLI(new C1388100mE4(awemeLJJIJIL, string7, z, Integer.valueOf(list.size()), context, string2, EnumC1373490lqV.NORMAL_SHARE));
        }
        if (arrayList2.isEmpty()) {
            InterfaceC1362600lYw interfaceC1362600lYw2 = this.LLIZLLLIL;
            if (interfaceC1362600lYw2 != null) {
                interfaceC1362600lYw2.LJIILIIL();
                return;
            }
            return;
        }
        LIZIZ();
        SharePackage sharePackage3 = this.LL;
        if (sharePackage3 != null) {
            if (!c013c.element && (bundle = sharePackage3.extras) != null) {
                C786410Ut5.LJJJI("cancel_toast", "true", bundle);
            }
            SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LLILZ;
            if (sharePanelImHeadViewModel != null && (sharePanelViewModel = sharePanelImHeadViewModel.LLJJIJIL) != null) {
                AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(c013c, this, 109);
                String str5 = sharePanelViewModel.LLJJLIIIJLLLLLLLZ;
                if (str5 != null && str5.length() > 0) {
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        String strLIZIZ = C1529905yr.LIZIZ((IMContact) it4.next());
                        if (strLIZIZ == null) {
                            strLIZIZ = "";
                        }
                        MediaModel mediaModel = new MediaModel("");
                        mediaModel.LJIILL(sharePanelViewModel.LLJJLIIIJLLLLLLLZ);
                        mediaModel.type = 1;
                        C1440005kM.LIZ(new IMMediaPublishEvent.DMAlbumMediaPublishEvent(strLIZIZ, Collections.singletonList(mediaModel), C2097608Jq.LJIIJ(new Pair("enter_from", sharePanelViewModel.LJIIL()), new Pair("enter_method", "screenshot_share_panel")), null, QuoteMode.None.INSTANCE, null, null, null, null));
                    }
                    awS422S0200000_21.invoke();
                }
            }
            C1364620lcC c1364620lcC = C1364620lcC.LIZ;
            int size2 = arrayList2.size();
            InterfaceC1493505sz interfaceC1493505szLIZIZ2 = C0I0B.LJFF.LIZIZ();
            c1364620lcC.getClass();
            C1364620lcC.LJJ(sharePackage3, null, size2, interfaceC1493505szLIZIZ2);
            Editable editableLLLLJI3 = C2204961BRm.LLLLJI(getMultiShareEt(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9M1UW/N8riSTM3RMZIftQU", null));
            if (editableLLLLJI3 != null) {
                string3 = editableLLLLJI3.toString();
            } else {
                string3 = null;
            }
            C1363050lZf c1363050lZf = this.LLIZ;
            if (c1363050lZf != null && !c1363050lZf.LJJ && (string3 == null || string3.length() == 0)) {
                IMSharePanelApi.LIZ.getClass();
                InterfaceC1365380ldQ shareService = C1599690rjL.LIZ().getShareService();
                Editable editableLLLLJI4 = C2204961BRm.LLLLJI(getMultiShareEt(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9M1UW/N8riSTM3RMZIftQU", null));
                if (editableLLLLJI4 != null && (string6 = editableLLLLJI4.toString()) != null) {
                    str4 = string6;
                }
                shareService.LJJIJLIJ(this.LLIZLLLIL, sharePackage3, str4, arrayList2);
                InterfaceC1362600lYw interfaceC1362600lYw3 = this.LLIZLLLIL;
                if (interfaceC1362600lYw3 != null) {
                    interfaceC1362600lYw3.LJIILIIL();
                    return;
                }
                return;
            }
            C1364580lc8 c1364580lc8 = C1364580lc8.LIZ;
            TextContent textContentObtain = null;
            Editable editableLLLLJI5 = C2204961BRm.LLLLJI(getMultiShareEt(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9M1UW/N8riSTM3RMZIftQU", null));
            if (editableLLLLJI5 != null) {
                string4 = editableLLLLJI5.toString();
            } else {
                string4 = null;
            }
            InterfaceC1362600lYw interfaceC1362600lYw4 = this.LLIZLLLIL;
            boolean z2 = c013c.element;
            Integer numValueOf = Integer.valueOf(list.size());
            Editable editableLLLLJI6 = C2204961BRm.LLLLJI(getMultiShareEt(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQfaiBUijQRkh9M1UW/N8riSTM3RMZIftQU", null));
            if (editableLLLLJI6 != null) {
                string5 = editableLLLLJI6.toString();
            } else {
                string5 = null;
            }
            C1363050lZf c1363050lZf2 = this.LLIZ;
            if (c1363050lZf2 != null && !c1363050lZf2.LJJ) {
                sharePackage3.extras.putBoolean("key_only_share_with_text_content", true);
                textContentObtain = TextContent.Companion.obtain(string5, null, null, null, null, null);
                IMSharePanelApi.LIZ.getClass();
                C1599690rjL.LIZ().getShareService().LJJIJ(textContentObtain, textContentObtain, sharePackage3);
            }
            Map mapLJ = C2097608Jq.LJ();
            c1364580lc8.getClass();
            C1364580lc8.LIZ(sharePackage3, arrayList2, string4, interfaceC1362600lYw4, z2, numValueOf, textContentObtain, mapLJ);
        }
    }

    public final String LIZLLL(int i) {
        String strLIZ = C1368890lj5.LIZ(i);
        if (strLIZ == null) {
            return getContext().getString(i);
        }
        return strLIZ;
    }

    public final void LJ(boolean z) {
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LLILZ;
        if (sharePanelImHeadViewModel != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelImHeadViewModel.LLJJIJIL;
            if (sharePanelViewModel != null) {
                sharePanelViewModel.LLJJJJ = z;
            }
            sharePanelImHeadViewModel.LLJILJIL.setValue(Boolean.TRUE);
        }
        getSend().setLoading(z);
        getSend().setBackgroundResource(R.drawable.c_q);
        if (!z) {
            C1364640lcE c1364640lcE = this.LLILZLL;
            if (c1364640lcE != null) {
                c1364640lcE.LJIIJJI = false;
            }
            C1363050lZf c1363050lZf = this.LLIZ;
            if (c1363050lZf != null) {
                c1363050lZf.LJIIJJI = false;
            }
            LJII();
        }
    }

    public final void LJI(Set<IMContact> set) {
        C128Y c128y;
        SkeletonSharePanelFragment skeletonSharePanelFragment;
        InterfaceC1363000lZa interfaceC1363000lZa;
        boolean z;
        C0I1X c0i1x;
        SkeletonSharePanelFragment skeletonSharePanelFragment2;
        SkeletonSharePanelFragment skeletonSharePanelFragment3;
        C128Y c128y2 = this.LLJ;
        if (c128y2 == null) {
            c128y = null;
        } else {
            c128y = c128y2;
        }
        if (c128y instanceof SkeletonSharePanelFragment) {
            skeletonSharePanelFragment = (SkeletonSharePanelFragment) c128y;
        } else {
            skeletonSharePanelFragment = null;
        }
        if (c128y2 == null) {
            c128y2 = null;
        }
        if (c128y2 instanceof InterfaceC1363000lZa) {
            interfaceC1363000lZa = (InterfaceC1363000lZa) c128y2;
        } else {
            interfaceC1363000lZa = null;
        }
        if (set.isEmpty() && !this.LLJI) {
            SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LLILZ;
            if (sharePanelImHeadViewModel != null) {
                sharePanelImHeadViewModel.LLJJ.setValue(Boolean.FALSE);
            }
            C786410Ut5.LJZ(8, getShareMiniEmojiContainer());
            if (skeletonSharePanelFragment != null) {
                skeletonSharePanelFragment.FS(8);
            } else if (interfaceC1363000lZa != null) {
                interfaceC1363000lZa.gF(false);
            }
            LIZIZ();
            Fragment fragment = this.LLJ;
            if (fragment == null) {
                fragment = null;
            }
            if ((fragment instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment3 = (SkeletonSharePanelFragment) fragment) != null) {
                skeletonSharePanelFragment3.PS(0);
                return;
            }
            return;
        }
        Fragment fragment2 = this.LLJ;
        if (fragment2 == null) {
            fragment2 = null;
        }
        if ((fragment2 instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment2 = (SkeletonSharePanelFragment) fragment2) != null) {
            skeletonSharePanelFragment2.PS(8);
        }
        if (getShareMiniEmojiContainer().getVisibility() == 8) {
            C1362630lYz.LIZ.getClass();
            C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
            if (c2096308Jd != null) {
                c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.SHOW_OPERATION_LAYOUT.getValue()));
            }
        }
        if (skeletonSharePanelFragment != null) {
            skeletonSharePanelFragment.FS(0);
        } else if (interfaceC1363000lZa != null) {
            interfaceC1363000lZa.gF(true);
        }
        C786410Ut5.LJLLLLLL(0, getEditLayout());
        C786410Ut5.LLLLLLJ(getSend(), 0);
        C197039127h send = getSend();
        if (set.size() != 0) {
            z = true;
        } else {
            z = false;
        }
        send.setEnabled(z);
        if (getShareMiniEmojiContainer().getVisibility() == 8 && (c0i1x = this.LLILZIL) != null) {
            int i = c0i1x.LJII;
            List<C0I1Z> listLIZ = c0i1x.LIZ();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
            Iterator it2 = ((ArrayList) listLIZ).iterator();
            while (it2.hasNext()) {
                arrayList.add(((C0I1Z) it2.next()).LIZ);
            }
            List listLL = C13LP.LL(arrayList, i);
            C1364620lcC c1364620lcC = C1364620lcC.LIZ;
            SharePackage sharePackage = this.LL;
            C1227904rF.LIZ.getClass();
            String strLJI = C1227904rF.LJI(listLL);
            if (strLJI == null) {
                strLJI = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("reason", strLJI));
            InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
            c1364620lcC.getClass();
            C1364620lcC.LJIIJ(sharePackage, i, null, mapLIZJ, interfaceC1493505szLIZIZ);
        }
        InterfaceC1366500lfE interfaceC1366500lfE = C1370370llT.LJIIIIZZ;
        if (interfaceC1366500lfE != null && interfaceC1366500lfE.LJIIJJI(this.LL)) {
            C339190DRl.LIZIZ(getMultiShareCover());
            C0I7D multiShareEt = getMultiShareEt();
            if (multiShareEt != null) {
                C426750GoL.LJIIIZ(multiShareEt, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, false, 27);
            }
        } else {
            DialogC1367400lgg.LJJZ(getMultiShareCover(), getMultiShareIcon(), this.LL, Boolean.FALSE);
        }
        SharePackage sharePackage2 = this.LL;
        if (sharePackage2 != null) {
            int i2 = C1058570deZ.LIZ;
            C1058570deZ.LIZ(getEditLayout(), sharePackage2);
        }
        C786410Ut5.LJZ(0, getShareMiniEmojiContainer());
        SharePanelImHeadViewModel sharePanelImHeadViewModel2 = this.LLILZ;
        if (sharePanelImHeadViewModel2 == null) {
            return;
        }
        sharePanelImHeadViewModel2.LLJJ.setValue(Boolean.TRUE);
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        InterfaceC1363000lZa interfaceC1363000lZa;
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LLILZ;
        if (sharePanelImHeadViewModel != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelImHeadViewModel.LLJJIJIL;
            if (sharePanelViewModel != null) {
                sharePanelViewModel.LLJJJ = z;
            }
            sharePanelImHeadViewModel.LLJILJIL.setValue(Boolean.TRUE);
        }
        C128Y c128y = this.LLJ;
        if (c128y == null) {
            c128y = null;
        }
        if ((c128y instanceof InterfaceC1363000lZa) && (interfaceC1363000lZa = (InterfaceC1363000lZa) c128y) != null) {
            interfaceC1363000lZa.sd();
        }
        LJII();
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
        InterfaceC1363000lZa interfaceC1363000lZa;
        C128Y c128y = this.LLJ;
        if (c128y == null) {
            c128y = null;
        }
        if ((c128y instanceof InterfaceC1363000lZa) && (interfaceC1363000lZa = (InterfaceC1363000lZa) c128y) != null) {
            interfaceC1363000lZa.h(z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.0I1h] */
    public C1362990lZZ(Context context, boolean z) {
        int i;
        super(context, null, 0);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1423));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1424));
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1425));
        this.LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1430));
        this.LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1436));
        this.LLJJIII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1437));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1432));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1433));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1434));
        this.LLJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1435));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1438));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1427));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1431));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1426));
        this.LLJJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1428));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1429));
        this.LLJL = new C0I1Y() { // from class: X.0I1h
            @Override // X.C0I1Y
            public final void LIZ(int i2, String str, Map map) {
                C1364620lcC c1364620lcC = C1364620lcC.LIZ;
                SharePackage sharePackage = this.LIZ.LL;
                InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                c1364620lcC.getClass();
                C1364620lcC.LJIIIIZZ(sharePackage, i2, str, false, map, interfaceC1493505szLIZIZ);
            }
        };
        if (z) {
            i = R.layout.crx;
        } else {
            i = R.layout.crw;
        }
        C21146717pB.LIZ(getContext(), i, this);
        getMultiShareCover().setCornerRadius(C418440Gaw.LIZIZ(4));
        getMultiShareEt().setOnTouchListener(new ATListenerS0S0110001_4(1));
    }

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
        AbstractC1363040lZe abstractC1363040lZe;
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLIZLLLIL;
        if ((interfaceC1362600lYw instanceof AbstractC1363040lZe) && (abstractC1363040lZe = (AbstractC1363040lZe) interfaceC1362600lYw) != null) {
            abstractC1363040lZe.LJIILJJIL();
        }
    }

    public final void LJFF(C1371590lnR c1371590lnR, Fragment fragment, InterfaceC1362600lYw interfaceC1362600lYw) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        int iLJFF;
        Bundle bundle;
        int iIntValue;
        Bundle bundle2;
        int i;
        int iIntValue2;
        Bundle bundle3;
        String nickname;
        String text;
        final String replyToUserName;
        int commentMediaType;
        boolean z4;
        String cid;
        User user;
        User user2;
        Bundle bundle4;
        SharePackage sharePackage;
        Bundle bundle5;
        this.LLILLL = c1371590lnR;
        SharePackage sharePackage2 = (SharePackage) c1371590lnR.LJIJJ;
        this.LL = sharePackage2;
        this.LLILLJJLI = c1371590lnR.LIZ;
        this.LLJ = fragment;
        this.LLIZLLLIL = interfaceC1362600lYw;
        Bundle bundle6 = sharePackage2.extras;
        boolean zLJIJJ = false;
        if (bundle6 != null) {
            z = bundle6.getBoolean("comment_direct_share");
        } else {
            z = false;
        }
        if (z || ((sharePackage = this.LL) != null && (bundle5 = sharePackage.extras) != null && bundle5.getBoolean("show_edit_send_direct_im_share"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJI = z2;
        if (z2) {
            LJI(new LinkedHashSet());
        }
        UrlModel avatarThumb = null;
        if (c1371590lnR.LJIJJ.LJIILL()) {
            C1371590lnR c1371590lnR2 = this.LLILLL;
            if (c1371590lnR2 == null) {
                c1371590lnR2 = null;
            }
            C1362230lYL c1362230lYL = c1371590lnR2.LJJLIIIJILLIZJL;
            if (c1362230lYL != null) {
                if (c1362230lYL.LJIIL >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56))) {
                    C0I7D multiShareEt = getMultiShareEt();
                    ViewGroup.LayoutParams layoutParams = getMultiShareEt().getLayoutParams();
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                    C786410Ut5.P6(multiShareEt, layoutParams);
                } else {
                    C0I7D multiShareEt2 = getMultiShareEt();
                    ViewGroup.LayoutParams layoutParams2 = getMultiShareEt().getLayoutParams();
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                    C786410Ut5.P6(multiShareEt2, layoutParams2);
                }
            }
        }
        SharePackage sharePackage3 = this.LL;
        if (sharePackage3 != null && (bundle4 = sharePackage3.extras) != null) {
            z3 = bundle4.getBoolean("key_force_cover_style");
        } else {
            z3 = false;
        }
        SharePackage sharePackage4 = this.LL;
        if (sharePackage4 != null) {
            str = sharePackage4.itemType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "comment") && !z3) {
            C786410Ut5.l(getMultiShareCover(), 8);
            C786410Ut5.LLLLZLL(getMultiShareCommentContent(), 0);
            TuxTextView multiShareCommentContent = getMultiShareCommentContent();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.c7);
            multiShareCommentContent.setBackground(c384050F3z.LIZ(getMultiShareCommentContent().getContext()));
            CommentSharePackage commentSharePackage = (CommentSharePackage) this.LL;
            Comment comment = commentSharePackage.comment;
            if (comment != null && (user2 = comment.getUser()) != null) {
                nickname = user2.getNickname();
            } else {
                nickname = null;
            }
            String str2 = "";
            if (nickname == null) {
                nickname = "";
            }
            Comment comment2 = commentSharePackage.comment;
            if (comment2 == null || (text = comment2.getText()) == null) {
                text = "";
            }
            Comment comment3 = commentSharePackage.comment;
            if (comment3 == null || (replyToUserName = comment3.getReplyToUserName()) == null) {
                replyToUserName = "";
            }
            Comment comment4 = commentSharePackage.comment;
            if (comment4 != null && (user = comment4.getUser()) != null) {
                avatarThumb = user.getAvatarThumb();
            }
            Comment comment5 = commentSharePackage.comment;
            if (comment5 != null) {
                commentMediaType = comment5.getCommentMediaType();
            } else {
                commentMediaType = 0;
            }
            if (nickname.length() == 0 || text.length() == 0 || avatarThumb == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Share data error, [");
                Comment comment6 = commentSharePackage.comment;
                if (comment6 != null && (cid = comment6.getCid()) != null) {
                    str2 = cid;
                }
                sbLIZ.append(str2);
                sbLIZ.append("] creatorName:");
                sbLIZ.append(nickname);
                sbLIZ.append(" comment:");
                sbLIZ.append(text);
                sbLIZ.append(" avatarIsNull:");
                if (avatarThumb == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sbLIZ.append(z4);
                C1720006oQ.LIZIZ("SharePanelOperationLayout", C2188811AlT.LIZIZ(sbLIZ));
            }
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.caz);
            C1351870lHd c1351870lHd = CommentSharePackage.Companion;
            Context context = getContext();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c1351870lHd.getClass();
            getMultiShareCommentContent().setText(C1351870lHd.LIZ(context, nickname, text, bitmapDecodeResource, iLIZIZ, commentMediaType));
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
            c1331670kl3LJIIIIZZ.LJJIJL(getContext());
            c1331670kl3LJIIIIZZ.LIZLLL("CommentShare");
            final String str3 = nickname;
            final String str4 = text;
            final int i2 = commentMediaType;
            c1331670kl3LJIIIIZZ.LJJII(new AbstractC468201s0(str3, replyToUserName, str4, i2) { // from class: X.0lNg
                public final /* synthetic */ String LLILLJJLI;
                public final /* synthetic */ String LLILLL;
                public final /* synthetic */ int LLILZ;

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    C1351870lHd c1351870lHd2 = CommentSharePackage.Companion;
                    Context context2 = this.LL.getContext();
                    String str5 = this.LLILLJJLI;
                    String str6 = this.LLILLL;
                    int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    int i3 = this.LLILZ;
                    c1351870lHd2.getClass();
                    this.LL.getMultiShareCommentContent().setText(C1351870lHd.LIZ(context2, str5, str6, bitmap, iLIZIZ2, i3));
                }

                {
                    this.LLILLL = str4;
                    this.LLILZ = i2;
                }
            });
        }
        SharePackage sharePackage5 = this.LL;
        if (sharePackage5 != null && (bundle3 = sharePackage5.extras) != null && bundle3.getBoolean("key_force_ui_sheet_flat_background")) {
            ViewGroup llImOperationRoot = getLlImOperationRoot();
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a1b);
            llImOperationRoot.setBackground(c384050F3z2.LIZ(llImOperationRoot.getContext()));
        } else {
            C1362230lYL c1362230lYL2 = c1371590lnR.LJJLIIIJILLIZJL;
            if (c1362230lYL2 != null && c1362230lYL2.LJIILJJIL) {
                getLlImOperationRoot().setBackgroundResource(R.drawable.cab);
            } else {
                ViewGroup llImOperationRoot2 = getLlImOperationRoot();
                C384050F3z c384050F3z3 = new C384050F3z();
                c384050F3z3.LIZIZ = Integer.valueOf(R.attr.a1f);
                llImOperationRoot2.setBackground(c384050F3z3.LIZ(llImOperationRoot2.getContext()));
            }
        }
        SharePackage sharePackage6 = this.LL;
        if (sharePackage6 != null && (bundle2 = sharePackage6.extras) != null && bundle2.getBoolean("key_force_operation_layout_divider")) {
            View view = new View(getContext());
            Context context2 = view.getContext();
            SharePackage sharePackage7 = this.LL;
            if (sharePackage7 != null && sharePackage7.LJIILL()) {
                i = R.attr.a02;
            } else {
                i = R.attr.ng;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i, context2);
            if (numLIZJ != null) {
                iIntValue2 = numLIZJ.intValue();
            } else {
                iIntValue2 = 0;
            }
            view.setBackgroundColor(iIntValue2);
            addView(view, new FrameLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), 48));
        }
        SharePackage sharePackage8 = this.LL;
        if (sharePackage8 != null && (bundle = sharePackage8.extras) != null && bundle.getBoolean("key_force_operation_layout_background")) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c3, getContext());
            if (numLIZJ2 != null) {
                iIntValue = numLIZJ2.intValue();
            } else {
                iIntValue = 0;
            }
            setBackgroundColor(iIntValue);
        }
        InterfaceC1370540llk interfaceC1370540llk = C1370370llT.LJII;
        if (interfaceC1370540llk != null) {
            SharePackage sharePackage9 = this.LL;
            if (sharePackage9 != null) {
                iLJFF = sharePackage9.LJFF();
            } else {
                iLJFF = 0;
            }
            SharePackage sharePackage10 = this.LL;
            if (sharePackage10 != null) {
                zLJIJJ = sharePackage10.LJIJJ();
            }
            interfaceC1370540llk.LIZLLL(iLJFF, getMultiShareCover(), getMultiShareEt(), zLJIJJ);
        }
        HandlerHook.viewPost(this, new ARunnableS121S0100000_21(this, 131));
    }
}
