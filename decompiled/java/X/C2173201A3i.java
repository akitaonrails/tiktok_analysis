package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS167S0100000_33;
import Y.ARunnableS102S0200000_33;
import Y.ARunnableS98S0200000_29;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.services.publish.IPublishShareProvider;
import com.ss.android.ugc.aweme.share.silent.ShareSelectorPanelFragment;
import com.zhiliaoapp.musically.R;
import irm.AkS99S0100000_33;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173201A3i extends AbstractC2173191A3h {
    public View LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxIconView LLJJJ;
    public Integer LLJJJIL;
    public final BPEAHandler LLJJJJ;
    public ShareSelectorPanelFragment LLJJJJJIL;

    @Override // X.AbstractC2173191A3h
    public int getLayoutResId() {
        return R.layout.f80;
    }

    public static final boolean LJIJJ() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        return iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableUseShareSheet();
    }

    @Override // X.AbstractC855590XhN
    public final boolean LJII() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService == null || !iAVPublishPageUIRefactorService.enableUseShareSheet()) {
            return getChannels().isEmpty();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.bytedance.tux.icon.TuxIconView] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.bytedance.tux.input.TuxTextView] */
    @Override // X.AbstractC2173191A3h
    public final void LJIILIIL() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        TuxIconView tuxIconView;
        View viewFindViewById5;
        C21458918yR c21458918yR;
        TextView textView;
        TuxTextView tuxTextView;
        TuxIconView tuxIconView2;
        View layoutRoot = getLayoutRoot();
        if (layoutRoot != null && (tuxIconView2 = (TuxIconView) layoutRoot.findViewById(R.id.uzg)) != null) {
            tuxIconView2.setTintColorRes(R.attr.a1h);
            IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
            if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableRefactorPublishUI()) {
                tuxIconView2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
                tuxIconView2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
            }
        }
        View layoutRoot2 = getLayoutRoot();
        if (layoutRoot2 != null && (tuxTextView = (TuxTextView) layoutRoot2.findViewById(R.id.v1t)) != null) {
            tuxTextView.setTuxFont(42);
            tuxTextView.setTextColorRes(R.attr.a1h);
            if (C297750Bll.LIZ()) {
                tuxTextView.setText(2131830028);
            }
        }
        View layoutRoot3 = getLayoutRoot();
        if (layoutRoot3 != null && (textView = (TextView) layoutRoot3.findViewById(R.id.v1t)) != null) {
            textView.setMaxLines(1);
        }
        this.LLJILJILJ = 36;
        this.LLJILLL = 22;
        boolean z = C1375000lsw.LIZ;
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService2 = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        Integer num = null;
        num = null;
        Integer num2 = null;
        if (!(iAVPublishPageUIRefactorService2 != null && iAVPublishPageUIRefactorService2.enableUseShareSheet()) && C1388190mED.LIZ(getContext()) != null) {
            C1377920lxe c1377920lxe = EnumC1377930lxf.Companion;
            Activity activityLIZ = C1388190mED.LIZ(getContext());
            if (activityLIZ == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            c1377920lxe.getClass();
            List listLIZ = C1377920lxe.LIZ(activityLIZ);
            if (listLIZ.isEmpty()) {
                LJIIJJI();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLIZ) {
                    if (!Intrinsics.LJFF(((EnumC1377930lxf) obj).getKey(), EnumC1377930lxf.SPARK.getKey()) || this.LLILLL.canSparkShow()) {
                        arrayList.add(obj);
                    }
                }
                for (EnumC1377930lxf enumC1377930lxf : C13LP.LL(arrayList, 5)) {
                    View viewLJIJI = LJIJI(getContext(), R.layout.f81, getRadioGroup(), false, "BaseSyncShareViewV2#share_layout_radio_button");
                    if ((viewLJIJI instanceof C21458918yR) && (c21458918yR = (C21458918yR) viewLJIJI) != null) {
                        c21458918yR.setTag(enumC1377930lxf);
                        c21458918yR.setContentDescription(enumC1377930lxf.getKey());
                        int i = this.LLJILLL;
                        Intrinsics.LJFF(enumC1377930lxf.getKey(), "facebook");
                        c21458918yR.setBackground(C1375340ltU.LIZ(getContext(), enumC1377930lxf.getUncheckedIconRes(), enumC1377930lxf.getCheckedIconRes(), this.LLJILJILJ, i));
                        c21458918yR.setId(View.generateViewId());
                        LJIJJLI(c21458918yR);
                        C786410Ut5.J9(c21458918yR, new ACListenerS131S0200000_29(c21458918yR, this, 65));
                        getRadioGroup().addView(c21458918yR);
                        ((ArrayList) this.LLIZ).add(new Pair(enumC1377930lxf, c21458918yR));
                    }
                }
                int iLIZ = C1238740iLA.LIZ().LIZ(0, "key_silent_share_save");
                if (this.LLILLL.needDefaultSelectSpark()) {
                    iLIZ = 20;
                }
                for (Pair pair : (ArrayList) this.LLIZ) {
                    if (((EnumC1377930lxf) pair.getFirst()).getSaveType() == iLIZ) {
                        ((CompoundButton) pair.getSecond()).setChecked(true);
                        this.LLJILJIL = ((View) pair.getSecond()).getId();
                        C1238740iLA.LIZ().LJ("key_silent_share_save", ((EnumC1377930lxf) pair.getFirst()).getSaveType());
                        if (iLIZ == 20) {
                            this.LLILLL.onSparkSelectChanged(true);
                            if (this.LLILLL.needShowSparkTips()) {
                                HandlerHook.viewPostDelay(this, new ARunnableS102S0200000_33(pair, this, 31), 300L);
                            }
                        }
                    }
                }
                LJIILL();
                C786410Ut5.x7(getRadioGroup(), new RadioGroup.OnCheckedChangeListener() { // from class: X.1A3j
                    @Override // android.widget.RadioGroup.OnCheckedChangeListener
                    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                        AbstractC2173191A3h abstractC2173191A3h = this;
                        if (abstractC2173191A3h.LLJILJIL == i2) {
                            return;
                        }
                        if (i2 == -1 && !SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue() && (C1238740iLA.LIZ().LIZ(0, "key_silent_share_save") != 20 || (abstractC2173191A3h.getPrivacyType() == 0 && !abstractC2173191A3h.LLJJ))) {
                            C1238740iLA.LIZ().LJ("key_silent_share_save", 0);
                        } else {
                            abstractC2173191A3h.LLJJ = false;
                        }
                        if (!abstractC2173191A3h.getHasCancelSynthetise()) {
                            abstractC2173191A3h.setHasCancelSynthetise(true);
                            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().cancelSynthesis(abstractC2173191A3h.getContext(), "base_sync_share_view_v2");
                        }
                        for (Pair<EnumC1377930lxf, C21458918yR> pair2 : abstractC2173191A3h.getButtonPairList()) {
                            if (pair2.getSecond().getId() == i2) {
                                View viewFindViewById6 = abstractC2173191A3h.getRadioGroup().findViewById(i2);
                                if (viewFindViewById6 != null) {
                                    List<InterfaceC21459018yS> list = abstractC2173191A3h.LLJJI.get(Integer.valueOf(pair2.getFirst().getSaveType()));
                                    if (list != null) {
                                        for (InterfaceC21459018yS interfaceC21459018yS : list) {
                                            if (interfaceC21459018yS != null) {
                                                interfaceC21459018yS.LIZ(viewFindViewById6);
                                            }
                                        }
                                    }
                                    List<InterfaceC21459018yS> list2 = abstractC2173191A3h.LLJJI.get(-2);
                                    if (list2 != null) {
                                        for (InterfaceC21459018yS interfaceC21459018yS2 : list2) {
                                            if (interfaceC21459018yS2 != null) {
                                                interfaceC21459018yS2.LIZ(viewFindViewById6);
                                            }
                                        }
                                    }
                                }
                                C1238740iLA.LIZ().LJ("key_silent_share_save", pair2.getFirst().getSaveType());
                                abstractC2173191A3h.LJIIZILJ(pair2.getSecond(), pair2.getFirst().getLabel(), pair2.getFirst().getKey());
                                abstractC2173191A3h.LJIILJJIL(pair2.getFirst().getKey(), true);
                                if (Intrinsics.LJFF(pair2.getFirst().getKey(), EnumC1377930lxf.SPARK.getKey())) {
                                    abstractC2173191A3h.getPublishProvider().onSparkSelectChanged(true);
                                }
                            }
                            if (pair2.getSecond().getId() == abstractC2173191A3h.LLJILJIL) {
                                abstractC2173191A3h.LJIILJJIL(pair2.getFirst().getKey(), false);
                                if (Intrinsics.LJFF(pair2.getFirst().getKey(), EnumC1377930lxf.SPARK.getKey())) {
                                    abstractC2173191A3h.getPublishProvider().onSparkSelectChanged(false);
                                }
                            }
                        }
                        abstractC2173191A3h.LLJILJIL = i2;
                    }
                });
                View view = this.LLJ;
                if (view == null || (viewFindViewById5 = view.findViewById(R.id.mf0)) == null || viewFindViewById5.getVisibility() != 0) {
                    LJIILLIIL();
                } else if (viewFindViewById5.getVisibility() == 0) {
                    HandlerHook.viewPost(viewFindViewById5, new ARunnableS98S0200000_29(viewFindViewById5, this, 74));
                }
            }
        }
        setSyncIconSize((int) C12ES.LIZJ(36.0f, getContext()));
        if (getPublishProvider().enableSettingItemOpt()) {
            View layoutRoot4 = getLayoutRoot();
            if (layoutRoot4 != null && (tuxIconView = (TuxIconView) layoutRoot4.findViewById(R.id.uzg)) != null) {
                tuxIconView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                tuxIconView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                C426750GoL.LJIIIZ(tuxIconView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), false, 17);
            }
            View layoutRoot5 = getLayoutRoot();
            if (layoutRoot5 != null && (viewFindViewById4 = layoutRoot5.findViewById(R.id.vye)) != null) {
                num2 = null;
                C426750GoL.LJIIIZ(viewFindViewById4, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))), false, 21);
            }
            View layoutRoot6 = getLayoutRoot();
            num = num2;
            if (layoutRoot6 != null) {
                View viewFindViewById6 = layoutRoot6.findViewById(R.id.m8g);
                num = num2;
                if (viewFindViewById6 != null) {
                    Integer num3 = num2;
                    C426750GoL.LJIIIZ(viewFindViewById6, num3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), num3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), false, 21);
                    num = num3;
                }
            }
        }
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService3 = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, num);
        if (iAVPublishPageUIRefactorService3 == null || !iAVPublishPageUIRefactorService3.enableUseShareSheet()) {
            View layoutRoot7 = getLayoutRoot();
            if (layoutRoot7 == null || (viewFindViewById = layoutRoot7.findViewById(R.id.m8g)) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            return;
        }
        View layoutRoot8 = getLayoutRoot();
        if (layoutRoot8 != null && (viewFindViewById3 = layoutRoot8.findViewById(R.id.uzg)) != null) {
            C426750GoL.LJIIIZ(viewFindViewById3, num, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), false, 17);
        }
        View layoutRoot9 = getLayoutRoot();
        this.LLJJIJIIJIL = layoutRoot9 != null ? layoutRoot9.findViewById(R.id.mf0) : num;
        View layoutRoot10 = getLayoutRoot();
        this.LLJJIJIL = layoutRoot10 != null ? (TuxTextView) layoutRoot10.findViewById(R.id.umj) : num;
        View layoutRoot11 = getLayoutRoot();
        ?? r14 = num;
        if (layoutRoot11 != null) {
            r14 = (TuxIconView) layoutRoot11.findViewById(R.id.uma);
        }
        this.LLJJJ = r14;
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        View view3 = this.LLJJIJIIJIL;
        if (view3 != null && view3.getVisibility() == 0) {
            HandlerHook.viewPost(view3, new ARunnableS98S0200000_29(view3, this, 74));
        }
        TuxIconView tuxIconView3 = this.LLJJJ;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS167S0100000_33(this, 108));
        }
        View layoutRoot12 = getLayoutRoot();
        if (layoutRoot12 != null && (viewFindViewById2 = layoutRoot12.findViewById(R.id.m8g)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View layoutRoot13 = getLayoutRoot();
        if (layoutRoot13 != null) {
            C786410Ut5.I7(new AkS99S0100000_33(this, 5), layoutRoot13);
        }
        getLayoutRoot();
        int iLIZ2 = C1238740iLA.LIZ().LIZ(0, "key_silent_share_save");
        List<EnumC1377930lxf> channels = getChannels();
        if (channels.isEmpty()) {
            return;
        }
        for (EnumC1377930lxf enumC1377930lxf2 : channels) {
            if (enumC1377930lxf2.getSaveType() == iLIZ2) {
                this.LLJJJIL = Integer.valueOf(enumC1377930lxf2.getSaveType());
                TuxTextView tuxTextView2 = this.LLJJIJIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(enumC1377930lxf2.getLabel());
                }
                TuxTextView tuxTextView3 = this.LLJJIJIL;
                if (tuxTextView3 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 0);
                }
            }
        }
        LJIL();
    }

    public final void LJIL() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        TuxIconView tuxIconView = this.LLJJJ;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = this.LLJJJIL != null ? R.raw.icon_x_mark : R.raw.icon_chevron_right_slim_thin_ltr;
            c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, getContext());
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        if (this.LLJJJIL != null) {
            TuxIconView tuxIconView2 = this.LLJJJ;
            if (tuxIconView2 != null && (layoutParams4 = tuxIconView2.getLayoutParams()) != null) {
                layoutParams4.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            TuxIconView tuxIconView3 = this.LLJJJ;
            if (tuxIconView3 != null && (layoutParams3 = tuxIconView3.getLayoutParams()) != null) {
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            TuxTextView tuxTextView = this.LLJJIJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
        } else {
            TuxIconView tuxIconView4 = this.LLJJJ;
            if (tuxIconView4 != null && (layoutParams2 = tuxIconView4.getLayoutParams()) != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
            TuxIconView tuxIconView5 = this.LLJJJ;
            if (tuxIconView5 != null && (layoutParams = tuxIconView5.getLayoutParams()) != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            TuxTextView tuxTextView2 = this.LLJJIJIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        }
        TuxIconView tuxIconView6 = this.LLJJJ;
        if (tuxIconView6 != null) {
            tuxIconView6.requestLayout();
        }
        List<EnumC1377930lxf> channels = getChannels();
        if (channels == null || channels.size() <= 0) {
            TuxTextView tuxTextView3 = this.LLJJIJIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
                return;
            }
            return;
        }
        for (EnumC1377930lxf enumC1377930lxf : channels) {
            int saveType = enumC1377930lxf.getSaveType();
            Integer num = this.LLJJJIL;
            if (num != null && saveType == num.intValue()) {
                TuxTextView tuxTextView4 = this.LLJJIJIL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(enumC1377930lxf.getLabel());
                }
                TuxTextView tuxTextView5 = this.LLJJIJIL;
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                }
            }
        }
    }

    @Override // X.AbstractC2173191A3h, X.AbstractC855590XhN
    public int getSaveUploadType() {
        EnumC1377930lxf next;
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService == null || !iAVPublishPageUIRefactorService.enableUseShareSheet()) {
            return super.getSaveUploadType();
        }
        List<EnumC1377930lxf> channels = getChannels();
        if (channels.isEmpty()) {
            return super.getSaveUploadType();
        }
        Iterator<EnumC1377930lxf> it2 = channels.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int saveType = next.getSaveType();
            Integer num = this.LLJJJIL;
            if (num != null && saveType == num.intValue()) {
                break;
            }
        }
        EnumC1377930lxf enumC1377930lxf = next;
        if (enumC1377930lxf != null) {
            return enumC1377930lxf.getSaveType();
        }
        return 0;
    }

    public final long getSharePanelDismissDuration() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService != null) {
            return iAVPublishPageUIRefactorService.getSharePanelDismissDuration();
        }
        return 0L;
    }

    @Override // X.AbstractC2173191A3h
    public final boolean LJIIL() {
        if (!LJIJJ()) {
            return super.LJIIL();
        }
        List<EnumC1377930lxf> shareChannels = getShareChannels();
        ArrayList arrayList = new ArrayList();
        for (EnumC1377930lxf enumC1377930lxf : shareChannels) {
            if (!Intrinsics.LJFF(enumC1377930lxf.getKey(), EnumC1377930lxf.SPARK.getKey())) {
                arrayList.add(enumC1377930lxf);
            }
        }
        return !C13LP.LL(arrayList, 5).isEmpty();
    }

    @Override // X.AbstractC2173191A3h
    public final void LJIILL() {
        TuxTextView tuxTextView;
        String string;
        EnumC1377930lxf first;
        EnumC1377930lxf first2;
        View layoutRoot = getLayoutRoot();
        if (layoutRoot == null || (tuxTextView = (TuxTextView) layoutRoot.findViewById(R.id.uyz)) == null) {
            return;
        }
        Pair<EnumC1377930lxf, C21458918yR> currentChannelPair = getCurrentChannelPair();
        if (Intrinsics.LJFF((currentChannelPair == null || (first2 = currentChannelPair.getFirst()) == null) ? null : first2.getKey(), EnumC1377930lxf.SPARK.getKey())) {
            string = tuxTextView.getContext().getString(2131839886);
        } else {
            Pair<EnumC1377930lxf, C21458918yR> currentChannelPair2 = getCurrentChannelPair();
            if (currentChannelPair2 == null || (first = currentChannelPair2.getFirst()) == null || (string = first.getLabel()) == null) {
                string = tuxTextView.getContext().getString(2131848256);
            }
        }
        tuxTextView.setText(string);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
    }

    public final List<EnumC1377930lxf> getChannels() {
        List<EnumC1377930lxf> shareChannels = getShareChannels();
        ArrayList arrayList = new ArrayList();
        for (EnumC1377930lxf enumC1377930lxf : shareChannels) {
            if (!Intrinsics.LJFF(enumC1377930lxf.getKey(), EnumC1377930lxf.SPARK.getKey())) {
                arrayList.add(enumC1377930lxf);
            }
        }
        return C13LP.LL(arrayList, 5);
    }

    public static final void LJIJJLI(C21458918yR c21458918yR) {
        C426750GoL.LJIIIZ(c21458918yR, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), null, 0, null, false, 26);
    }

    @Override // X.AbstractC2173191A3h, X.AbstractC855590XhN
    public final void LIZJ(int i) {
        boolean z;
        EnumC1377930lxf next;
        super.LIZJ(i);
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = this.LLJJIJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            if (!SharePrefCache.inst().getIsAwemePrivate().LIZ().booleanValue()) {
                C1238740iLA.LIZ().LJ("key_silent_share_save", 0);
            }
        } else if (this.LLJJJIL != null) {
            Iterator<EnumC1377930lxf> it2 = getChannels().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    int saveType = next.getSaveType();
                    Integer num = this.LLJJJIL;
                    if (num != null && saveType == num.intValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EnumC1377930lxf enumC1377930lxf = next;
            if (enumC1377930lxf != null) {
                C1238740iLA.LIZ().LJ("key_silent_share_save", enumC1377930lxf.getSaveType());
                TuxTextView tuxTextView2 = this.LLJJIJIL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
            }
        }
        LJIL();
    }

    @Override // X.AbstractC2173191A3h, X.AbstractC855590XhN
    public final void LJIIIZ(boolean z) {
        Integer num;
        if (LJIJJ()) {
            if (!z && (num = this.LLJJJIL) != null && num.intValue() == 1) {
                TuxTextView tuxTextView = this.LLJJIJIL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                this.LLJJJIL = null;
            }
            ShareSelectorPanelFragment shareSelectorPanelFragment = this.LLJJJJJIL;
            if (shareSelectorPanelFragment != null) {
                shareSelectorPanelFragment.OR(z);
            }
        }
    }

    public C2173201A3i(Context context, IPublishShareProvider iPublishShareProvider) {
        super(context, iPublishShareProvider);
        this.LLJJJJ = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.1A3n
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                DialogFragment dialogFragment;
                if (message.what == 1) {
                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                    if ((messageObj instanceof TuxSheet) && (dialogFragment = (DialogFragment) messageObj) != null) {
                        dialogFragment.dismiss();
                    }
                }
                return true;
            }
        });
    }

    @Override // X.AbstractC2173191A3h, X.AbstractC855590XhN
    public final void LIZ(int i, C855810Xhj c855810Xhj) {
        Integer num;
        super.LIZ(i, c855810Xhj);
        if (LJIJJ() && (num = this.LLJJJIL) != null && num.intValue() == i && !c855810Xhj.LIZ(getLayoutRoot())) {
            TuxTextView tuxTextView = this.LLJJIJIL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            this.LLJJJIL = null;
        }
    }
}
