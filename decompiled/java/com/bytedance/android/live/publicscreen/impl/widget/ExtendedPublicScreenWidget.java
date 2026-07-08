package com.bytedance.android.live.publicscreen.impl.widget;

import X.AbstractC1110800f0o;
import X.AbstractC1111060f1E;
import X.AbstractC1111600f26;
import X.AbstractC1111810f2R;
import X.AbstractC1113400f50;
import X.AbstractC1113530f5D;
import X.AbstractC1136060ffY;
import X.AbstractC21673719rz;
import X.C011Z;
import X.C01GW;
import X.C07WS;
import X.C0IJ7;
import X.C1085120eLO;
import X.C1109770ez9;
import X.C1111050f1D;
import X.C1111150f1N;
import X.C1111570f23;
import X.C1111930f2d;
import X.C1111950f2f;
import X.C1111990f2j;
import X.C1112390f3N;
import X.C1113410f51;
import X.C1113490f59;
import X.C1113540f5E;
import X.C1114920f7S;
import X.C1161920gLG;
import X.C1300480jwk;
import X.C1338270kvh;
import X.C1361400lX0;
import X.C13LQ;
import X.C16FT;
import X.C1EOY;
import X.C226800uA;
import X.C227800uK;
import X.C259800zU;
import X.C292401Bi;
import X.C354201Zc;
import X.C485950J3x;
import X.C486790J7d;
import X.C497740JfY;
import X.C500260Jjc;
import X.C538540LAe;
import X.C781550UlF;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1083260eIO;
import X.EnumC19356910oB;
import X.EnumC584680MwU;
import X.InterfaceC1109090ey3;
import X.InterfaceC1112060f2q;
import X.InterfaceC1112710f3t;
import X.InterfaceC772190UQv;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS117S0100000_17;
import Y.AfS186S0100000_17;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.publicscreen.api.GiftHistoryManagerChannel;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.livesdk.api.revenue.crm.FullScreenCsCompanionSetting;
import com.bytedance.android.livesdk.chatroom.ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenType;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveNotShowGuideAgain;
import com.bytedance.android.livesdk.dataChannel.PublicScreenWidgetTopMessage;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveExtendedScreenGiftOptimizeSetting;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS44S0102000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class ExtendedPublicScreenWidget extends PublicScreenWidget implements InterfaceC1112710f3t {
    public C16FT LLLF;
    public int LLLFF;
    public int LLLFFI;
    public boolean LLLFZ;
    public boolean LLLII;
    public final BPEAHandler LLLIIIIL;
    public final C01GW LLLIIIL;
    public final int LLLI = (int) C497740JfY.LIZIZ(90.0f);
    public boolean LLLIIII = true;

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final boolean L1() {
        return true;
    }

    @Override // X.InterfaceC1112050f2p
    public final boolean fu() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void G1() {
        T1(C227800uK.class);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = this.dataChannel.gg0(LiveExtendedScreenStatus.class);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, LiveExtendedScreenStatus.class, new AwS383S0200000_17(c259800zU, (C259800zU<EnumC1083260eIO>) this, (ExtendedPublicScreenWidget) 14));
        dataChannel.BQ2(this, PublicScreenWidgetTopMessage.class, new AwS596S0100000_17(this, 65));
        dataChannel.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 66));
        dataChannel.BQ2(this, LiveNotShowGuideAgain.class, new AwS596S0100000_17(this, 67));
        C784440Upu.LIZ().LIZJ(this, C1085120eLO.class).LIZJ(new AfS186S0100000_17(this, 11));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void H1() {
        AbstractC1111600f26 abstractC1111600f26 = new AbstractC1111600f26() { // from class: X.0f1y
            @Override // X.AbstractC1111600f26
            public final void LLLIL() {
                LLLIILIL();
                LLLILZ(AbstractC1110520f0M.class, new AbstractC1111540f20<AbstractC1110520f0M<? extends AbstractC1136060ffY>, C1111130f1L>() { // from class: X.0f2D
                    @Override // X.AbstractC1111810f2R
                    public final int LJIIIIZZ() {
                        return R.layout.gfy;
                    }

                    @Override // X.AbstractC1111810f2R
                    public final String LJIIJ() {
                        return "extended_chat";
                    }

                    @Override // X.AbstractC1111810f2R
                    public final boolean LJIIL() {
                        return true;
                    }

                    @Override // X.AbstractC1111810f2R
                    public final AbstractC1111020f1A LJIILJJIL(View view) {
                        return new C1111130f1L(view, LJIIZILJ(view), true, true, true);
                    }
                });
                if (LiveExtendedScreenUiOptimizeSetting.INSTANCE.giftTrayOptimize(LLLIIIIL().LJIIIZ) || LiveExtendedScreenGiftOptimizeSetting.INSTANCE.giftMessageViewHolder()) {
                    LLLILZ(C1111000f18.class, new AbstractC1111540f20<C1111000f18, C1111150f1N>() { // from class: X.0f1z
                        @Override // X.AbstractC1111810f2R
                        public final int LJIIIIZZ() {
                            return R.layout.gg2;
                        }

                        @Override // X.AbstractC1111810f2R
                        public final String LJIIJ() {
                            return "extended_gift_message";
                        }

                        @Override // X.AbstractC1111810f2R
                        public final AbstractC1111020f1A LJIILJJIL(View view) {
                            return new C1111150f1N(view, LJIIZILJ(view));
                        }
                    });
                }
                if (LiveMinusOneScreenTipsInFeedSetting.isTipsInFeedEnabled()) {
                    LLLILZ(C226800uA.class, new AbstractC1111540f20<C226800uA, C1113540f5E>() { // from class: X.0f2G
                        @Override // X.AbstractC1111810f2R
                        public final int LJIIIIZZ() {
                            return R.layout.gg3;
                        }

                        @Override // X.AbstractC1111810f2R
                        public final String LJIIJ() {
                            return "extended_tips";
                        }

                        @Override // X.AbstractC1111810f2R
                        public final boolean LJIIL() {
                            return true;
                        }

                        @Override // X.AbstractC1111810f2R
                        public final AbstractC1111020f1A LJIILJJIL(View view) {
                            return new C1113540f5E(view, LJIIZILJ(view));
                        }
                    });
                }
                LLLILZ(AbstractC1110800f0o.class, new C1111570f23(false));
                LLLILZ(C176500m3.class, new AbstractC1111810f2R<C176500m3, C1111270f1Z>() { // from class: X.0f1f
                    @Override // X.AbstractC1111810f2R
                    public final int LJIIIIZZ() {
                        return R.layout.hk8;
                    }

                    @Override // X.AbstractC1111810f2R
                    public final String LJIIJ() {
                        return "extended_in_game_rank";
                    }

                    @Override // X.AbstractC1111810f2R
                    public final AbstractC1111020f1A LJIILJJIL(View view) {
                        return new C1111270f1Z(view);
                    }
                });
                LLLILZ(C160900jX.class, new AbstractC1111810f2R<C160900jX, C1111160f1O>() { // from class: X.0f1w
                    @Override // X.AbstractC1111810f2R
                    public final int LJIIIIZZ() {
                        return R.layout.gfz;
                    }

                    @Override // X.AbstractC1111810f2R
                    public final String LJIIJ() {
                        return "extended_ai_summary";
                    }

                    @Override // X.AbstractC1111810f2R
                    public final LayoutInflater LJIIIZ(LayoutInflater layoutInflater) {
                        return C1834150xpV.LIZJ(layoutInflater);
                    }

                    @Override // X.AbstractC1111810f2R
                    public final AbstractC1111020f1A LJIILJJIL(View view) {
                        return new C1111160f1O(view, LJIIJJI().LIZLLL, LJIIJJI().LJJ, LJIIJJI().LJI);
                    }
                });
                LLLILZ(C1110490f0J.class, new AbstractC1111810f2R<C1110490f0J, C1111120f1K>() { // from class: X.0f1t
                    @Override // X.AbstractC1111810f2R
                    public final int LJIIIIZZ() {
                        return R.layout.gg1;
                    }

                    @Override // X.AbstractC1111810f2R
                    public final String LJIIJ() {
                        return "extended_enigma_whisper";
                    }

                    @Override // X.AbstractC1111810f2R
                    public final LayoutInflater LJIIIZ(LayoutInflater layoutInflater) {
                        return C1834150xpV.LIZJ(layoutInflater);
                    }

                    @Override // X.AbstractC1111810f2R
                    public final AbstractC1111020f1A LJIILJJIL(View view) {
                        return new C1111120f1K(view, view, LJIIJJI().LIZLLL, LJIIJJI().LJJ, LJIIJJI().LJI);
                    }
                });
            }
        };
        C1112390f3N c1112390f3N = this.LLJLLIL;
        c1112390f3N.LIZJ = abstractC1111600f26;
        C781550UlF c781550UlF = c1112390f3N.LIZ;
        if (c781550UlF != null) {
            c781550UlF.setAdapter(abstractC1111600f26);
        }
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        SmoothLinearLayoutManager smoothLinearLayoutManager = new SmoothLinearLayoutManager(this.context);
        c1112390f3N2.LIZLLL = smoothLinearLayoutManager;
        C781550UlF c781550UlF2 = c1112390f3N2.LIZ;
        if (c781550UlF2 != null) {
            c781550UlF2.setLayoutManager(smoothLinearLayoutManager);
        }
        SmoothLinearLayoutManager smoothLinearLayoutManager2 = this.LLJLLIL.LIZLLL;
        if (smoothLinearLayoutManager2 != null) {
            smoothLinearLayoutManager2.setStackFromEnd(true);
        }
        SmoothLinearLayoutManager smoothLinearLayoutManager3 = this.LLJLLIL.LIZLLL;
        if (smoothLinearLayoutManager3 != null) {
            smoothLinearLayoutManager3.LL = 1.0f;
            smoothLinearLayoutManager3.mRecycleChildrenOnDetach = true;
            smoothLinearLayoutManager3.LLILLJJLI = true;
        }
        if (D1()) {
            this.LLJLLIL.LJII((AbstractC21673719rz) this.LLLIIIL.getValue());
        } else {
            this.LLJLLIL.LJII(null);
        }
        C1112390f3N c1112390f3N3 = this.LLJLLIL;
        C1114920f7S c1114920f7S = new C1114920f7S((int) C497740JfY.LIZIZ(11.0f));
        C781550UlF c781550UlF3 = c1112390f3N3.LIZ;
        if (c781550UlF3 != null) {
            c781550UlF3.addItemDecoration(c1114920f7S);
        }
        this.LLJLLL.setFadingEdgeLength((int) C497740JfY.LIZIZ(88.0f));
        C1112390f3N c1112390f3N4 = this.LLJLLIL;
        int iLIZIZ = (int) C497740JfY.LIZIZ(88.0f);
        C781550UlF c781550UlF4 = c1112390f3N4.LIZ;
        if (c781550UlF4 != null) {
            c781550UlF4.setFadingEdgeLength(iLIZIZ);
        }
        C781550UlF c781550UlF5 = this.LLJLLIL.LIZ;
        if (c781550UlF5 != null) {
            c781550UlF5.setHasFixedSize(true);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final AbstractC1111810f2R<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> P1() {
        return new C1111570f23(true);
    }

    @Override // X.InterfaceC1112710f3t
    public final void ay1() {
        C500260Jjc.LJIILIIL(this.LLLF);
    }

    @Override // com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget
    public final C07WS x1() {
        C1112390f3N c1112390f3N;
        C1113490f59 c1113490f59;
        List<String> listLJIIJ;
        AbstractC1111060f1E abstractC1111060f1E;
        C1113540f5E c1113540f5E;
        String strLLJLIL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            c1112390f3N = this.LLJLLIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (c1112390f3N == null) {
            return new C07WS(0, 0, arrayList, arrayList2);
        }
        int iLJ = c1112390f3N.LJ();
        int iLJFF = c1112390f3N.LJFF();
        int iMax = Math.max(iLJ, 0);
        if (iMax <= iLJFF) {
            while (true) {
                RecyclerView.ViewHolder viewHolderLJI = c1112390f3N.LJI(iMax);
                if (viewHolderLJI != null) {
                    AbstractC1113530f5D abstractC1113530f5D = null;
                    if ((viewHolderLJI instanceof C1113540f5E) && (c1113540f5E = (C1113540f5E) viewHolderLJI) != null) {
                        C226800uA c226800uA = c1113540f5E.LLILLJJLI;
                        if (c226800uA == null || (strLLJLIL = c226800uA.LLJLIL()) == null) {
                            strLLJLIL = "";
                        }
                        if (strLLJLIL.length() > 0) {
                            arrayList.add(strLLJLIL);
                        }
                    }
                    if ((viewHolderLJI instanceof AbstractC1111060f1E) && (abstractC1111060f1E = (AbstractC1111060f1E) viewHolderLJI) != null) {
                        abstractC1113530f5D = abstractC1111060f1E.LLILZ;
                    }
                    if ((abstractC1113530f5D instanceof C1113490f59) && (c1113490f59 = (C1113490f59) abstractC1113530f5D) != null && (listLJIIJ = c1113490f59.LJIIJ()) != null) {
                        arrayList2.addAll(listLJIIJ);
                    }
                }
                if (iMax == iLJFF) {
                    break;
                }
                iMax++;
            }
        }
        return new C07WS(arrayList.size(), arrayList2.size(), arrayList, arrayList2);
    }

    public ExtendedPublicScreenWidget() {
        Looper looperMyLooper = Looper.myLooper();
        this.LLLIIIIL = looperMyLooper != null ? new BPEAHandler(looperMyLooper) : null;
        this.LLLIIIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 74));
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void R1() {
        super.R1();
        C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("panel_extended_public_screen_auto_slide");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(null);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void S1() {
        super.S1();
        C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("panel_extended_public_screen_auto_slide");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    public final void Wd0(int i) {
        super.Wd0(i);
    }

    @Override // X.InterfaceC1112710f3t
    public final void cI1(String str) {
        ViewGroup viewGroup;
        if (this.LLLF == null) {
            C16FT c16ft = new C16FT(new C1361400lX0(getContext(), C011Z.LIZ.LJ()), 0);
            View view = getView();
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                viewGroup.addView(c16ft, 0);
            }
            c16ft.setButtonText("");
            c16ft.setIconAttr(R.attr.dxm);
            c16ft.setMessage(2131843078);
            ViewGroup.LayoutParams layoutParams = c16ft.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            ViewGroup.LayoutParams layoutParams2 = c16ft.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
            }
            HandlerHook.viewPost(c16ft, new ARunnableS117S0100000_17(c16ft, 37));
            this.LLLF = c16ft;
        }
        C16FT c16ft2 = this.LLLF;
        if (c16ft2 != null) {
            c16ft2.setTitle(str);
        }
        C500260Jjc.LLFFF(this.LLLF);
    }

    public final void f2(boolean z) {
        C1111150f1N c1111150f1N;
        GiftMessage giftMessage;
        int i;
        if (!z && LiveExtendedScreenGiftOptimizeSetting.INSTANCE.shouldAnimateCombo()) {
            int iLJ = this.LLJLLIL.LJ();
            int iLJFF = this.LLJLLIL.LJFF();
            if (iLJ == -1 || iLJFF == -1 || iLJ > iLJFF) {
                return;
            }
            while (true) {
                RecyclerView.ViewHolder viewHolderLJI = this.LLJLLIL.LJI(iLJ);
                if ((viewHolderLJI instanceof C1111150f1N) && (c1111150f1N = (C1111150f1N) viewHolderLJI) != null) {
                    AbstractC1110800f0o abstractC1110800f0o = c1111150f1N.LLILLJJLI;
                    if (abstractC1110800f0o != null && (giftMessage = (GiftMessage) abstractC1110800f0o.LJIL) != null && (i = giftMessage.repeatCount) > 0) {
                        c1111150f1N.U5();
                        c1111150f1N.LLJJ = i;
                        c1111150f1N.S5(i);
                    } else {
                        c1111150f1N.U5();
                        c1111150f1N.LLJJ = 0;
                        c1111150f1N.LLJILJILJ.setText("");
                    }
                }
                if (iLJ != iLJFF) {
                    iLJ++;
                } else {
                    return;
                }
            }
        }
    }

    public final void g2(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = getView();
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.height = i;
            View view2 = getView();
            if (view2 != null) {
                C786410Ut5.W5(view2, marginLayoutParams);
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        C1113410f51 c1113410f51;
        C1111990f2j<? extends InterfaceC1112060f2q> c1111990f2j;
        if (LiveMinusOneScreenTipsInFeedSetting.isPhase3TagsAndGuideEnabled()) {
            AbstractC1113400f50 abstractC1113400f50LIZJ = this.LLJILJILJ.LLLJL.LIZJ();
            if ((abstractC1113400f50LIZJ instanceof C1113410f51) && (c1113410f51 = (C1113410f51) abstractC1113400f50LIZJ) != null) {
                C1111990f2j<InterfaceC1112060f2q> c1111990f2j2 = this.LLJILJILJ.LLJLL;
                WeakReference<C1111990f2j<? extends InterfaceC1112060f2q>> weakReference = c1113410f51.LJIILIIL;
                if (weakReference != null) {
                    c1111990f2j = weakReference.get();
                } else {
                    c1111990f2j = null;
                }
                if (c1111990f2j == c1111990f2j2) {
                    c1113410f51.LJIILIIL = null;
                }
            }
        }
        super.onUnload(recycleSource);
        C16FT c16ft = this.LLLF;
        if (c16ft != null) {
            C500260Jjc.LJIILIIL(c16ft);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    public final void GU0(int i, int i2) {
        super.GU0(i, i2);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget
    public final void Q1(RecyclerView recyclerView, int i) {
        super.Q1(recyclerView, i);
        if (i == 0) {
            C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("panel_extended_public_screen_auto_slide");
            if (c1300480jwkLIZIZ != null) {
                c1300480jwkLIZIZ.stop();
                return;
            }
            return;
        }
        C1300480jwk c1300480jwkLIZIZ2 = C1EOY.LIZ.LIZIZ("panel_extended_public_screen_slide");
        if (c1300480jwkLIZIZ2 == null) {
            return;
        }
        c1300480jwkLIZIZ2.LIZJ(null);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Object objLJJIIZ;
        C1111930f2d c1111950f2f;
        View viewSd;
        AbstractC1111600f26 abstractC1111600f26;
        LiveMode liveMode;
        BPEAHandler bPEAHandler;
        C1113410f51 c1113410f51;
        if (objArr != null) {
            objLJJIIZ = C13LQ.LJJIIZ(0, objArr);
        } else {
            objLJJIIZ = null;
        }
        this.LLL = 0;
        Object objGg0 = this.dataChannel.gg0(UserIsAnchorChannel.class);
        Boolean bool = Boolean.TRUE;
        final boolean zLJFF = Intrinsics.LJFF(objGg0, bool);
        if (Intrinsics.LJFF(objLJJIIZ, bool)) {
            c1111950f2f = new C1111930f2d<InterfaceC1112710f3t>(zLJFF) { // from class: X.0f2s
                public final C1112500f3Y e = new AnonymousClass0128() { // from class: X.0f3Y
                    @Override // X.AnonymousClass0128
                    public final void LIZ(IMessage iMessage) {
                        onMessage(iMessage);
                    }
                };

                @Override // X.C1111930f2d
                public final int LJJZZI() {
                    return Integer.MAX_VALUE;
                }

                @Override // X.C1111930f2d
                public final void LJLIIL() {
                }

                @Override // X.C1111930f2d
                public final boolean LJLJJL() {
                    return false;
                }

                @Override // X.C1111930f2d
                public final void LJJJLIIL() {
                    DataChannel dataChannel;
                    InterfaceC776970Udr interfaceC776970Udr;
                    C1109770ez9 c1109770ez9 = this.LLLJL;
                    if (c1109770ez9 == null || (dataChannel = c1109770ez9.LJIIIZ) == null || (interfaceC776970Udr = (InterfaceC776970Udr) dataChannel.gg0(GiftHistoryManagerChannel.class)) == null) {
                        return;
                    }
                    interfaceC776970Udr.LIZJ(this.e);
                }

                @Override // X.C1111930f2d, X.AbstractC945390ai1, X.C0JSV
                public final void detachView() {
                    DataChannel dataChannel;
                    InterfaceC776970Udr interfaceC776970Udr;
                    super.detachView();
                    C1109770ez9 c1109770ez9 = this.LLLJL;
                    if (c1109770ez9 == null || (dataChannel = c1109770ez9.LJIIIZ) == null || (interfaceC776970Udr = (InterfaceC776970Udr) dataChannel.gg0(GiftHistoryManagerChannel.class)) == null) {
                        return;
                    }
                    interfaceC776970Udr.LJ(this.e);
                }

                @Override // X.C1111930f2d
                public final EnumC1112150f2z LJLZ() {
                    return EnumC1112150f2z.ExtendedGift;
                }

                @Override // X.AbstractC1112030f2n, X.AbstractC945390ai1
                /* JADX INFO: renamed from: LLII, reason: merged with bridge method [inline-methods] */
                public final void attachView(InterfaceC1112710f3t interfaceC1112710f3t) {
                    InterfaceC776970Udr interfaceC776970Udr;
                    DataChannel dataChannelProvideDataChannel = interfaceC1112710f3t.provideDataChannel();
                    this.dataChannel = dataChannelProvideDataChannel;
                    if (dataChannelProvideDataChannel != null && (interfaceC776970Udr = (InterfaceC776970Udr) dataChannelProvideDataChannel.gg0(GiftHistoryManagerChannel.class)) != null) {
                        List<GiftMessage> listLIZ = interfaceC776970Udr.LIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("manager size =");
                        sbLIZ.append(listLIZ.size());
                        C20441214yg.LJIIIZ("ExtendedPublicScreenGiftPresenter", C2188811AlT.LIZIZ(sbLIZ));
                        Iterator<GiftMessage> it2 = listLIZ.iterator();
                        while (it2.hasNext()) {
                            AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0oLJ = C175200lq.LJ(it2.next());
                            if (abstractC1110800f0oLJ != null) {
                                C1111990f2j<InterfaceC1112060f2q> c1111990f2j = this.LLJLL;
                                c1111990f2j.LIZIZ.add(abstractC1110800f0oLJ);
                                if (c1111990f2j.LJI && !c1111990f2j.LIZ(abstractC1110800f0oLJ)) {
                                    c1111990f2j.LIZJ.add(abstractC1110800f0oLJ);
                                }
                            }
                        }
                        interfaceC776970Udr.LIZIZ();
                    }
                    super.attachView(interfaceC1112710f3t);
                    this.LLLJL.LJJ = true;
                    DataChannel dataChannel = this.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.BQ2((LifecycleOwner) this.mView, LiveExtendedScreenStatus.class, new AwS596S0100000_17(this, 368));
                        dataChannel.BQ2((LifecycleOwner) this.mView, LiveExtendedScreenType.class, new AwS596S0100000_17(this, 369));
                    }
                }
            };
        } else {
            c1111950f2f = new C1111950f2f(zLJFF);
        }
        this.LLJILJILJ = c1111950f2f;
        this.LLJILJILJ.attachView(this);
        if (!Intrinsics.LJFF(objLJJIIZ, bool) && LiveMinusOneScreenTipsInFeedSetting.isPhase3TagsAndGuideEnabled()) {
            AbstractC1113400f50 abstractC1113400f50LIZJ = this.LLJILJILJ.LLLJL.LIZJ();
            if ((abstractC1113400f50LIZJ instanceof C1113410f51) && (c1113410f51 = (C1113410f51) abstractC1113400f50LIZJ) != null) {
                c1113410f51.LJIILIIL = new WeakReference<>(this.LLJILJILJ.LLJLL);
            }
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        BPEAHandler bPEAHandler2 = this.LLLIIIIL;
        if (bPEAHandler2 != null) {
            C786410Ut5.LJLIIL((long) (C538540LAe.LLJJJIL * 6.0f), bPEAHandler2, new ARunnableS112S0100000_12(this, 37));
        }
        if (FullScreenCsCompanionSetting.INSTANCE.getValue(this.dataChannel) > 0 && C500260Jjc.LJJJI(InterfaceC772190UQv.r3.LIZIZ()) && (bPEAHandler = this.LLLIIIIL) != null) {
            C786410Ut5.LJLIIL((long) (C538540LAe.LLJJJIL * 10.0f), bPEAHandler, new ARunnableS112S0100000_12(this, 38));
        }
        this.LLJLLL.setOverScrollMode(EnumC19356910oB.NONE);
        this.LLJLLL.setScrollMode(EnumC584680MwU.NONE);
        this.LLJJJJJIL = (Room) this.dataChannel.gg0(RoomChannel.class);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && C354201Zc.LIZLLL(liveMode)) {
            this.LLLII = true;
        }
        G1();
        C1112390f3N c1112390f3N = this.LLJLLIL;
        C1109770ez9 c1109770ez9 = this.LLJILJILJ.LLLJL;
        AbstractC1111600f26 abstractC1111600f262 = c1112390f3N.LIZJ;
        if (abstractC1111600f262 != null) {
            abstractC1111600f262.LLILLL = c1109770ez9;
        }
        this.LLJLIL.LIZIZ = c1109770ez9;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.idr);
        int iLJIIIIZZ = this.LLJLIL.LJIIIIZZ();
        AbstractC1111810f2R<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> abstractC1111810f2R = this.LLJLIL;
        C01GW c01gw = C485950J3x.LIZ;
        if (C485950J3x.LIZ(iLJIIIIZZ) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            viewSd = C485950J3x.LIZJ(viewGroup, iLJIIIIZZ);
        } else {
            viewSd = C786410Ut5.Sd(iLJIIIIZZ, C786410Ut5.ne(getContext()), viewGroup);
        }
        this.LLJLILLLLZIIL = (C1111050f1D) abstractC1111810f2R.LJIILJJIL(viewSd);
        F1(viewGroup);
        AbstractC1111600f26 abstractC1111600f263 = this.LLJLLIL.LIZJ;
        if (abstractC1111600f263 != null) {
            abstractC1111600f263.LLLIL();
        }
        List<InterfaceC1109090ey3> listIS0 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).IS0();
        if (!listIS0.isEmpty()) {
            for (InterfaceC1109090ey3 interfaceC1109090ey3 : listIS0) {
                if (interfaceC1109090ey3 != null && (abstractC1111600f26 = this.LLJLLIL.LIZJ) != null) {
                    interfaceC1109090ey3.LJ(abstractC1111600f26);
                }
            }
        }
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        List<InterfaceC1112060f2q> listLIZLLL = this.LLJILJILJ.LLJLL.LIZLLL();
        AbstractC1111600f26 abstractC1111600f264 = c1112390f3N2.LIZJ;
        if (abstractC1111600f264 != null) {
            abstractC1111600f264.LL = listLIZLLL;
        }
        C1112390f3N c1112390f3N3 = this.LLJLLIL;
        int iLJ = this.LLJILJILJ.LLJLL.LJ();
        c1112390f3N3.getClass();
        c1112390f3N3.LIZIZ(new AwS44S0102000_17(c1112390f3N3, 0, iLJ, 1));
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS112S0100000_12(this, 39));
        }
        enableSubWidgetManager(new WidgetCreateTimeUtil(null), C486790J7d.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C0IJ7.LIZLLL(getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cr1(int r5, int r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r4.D1()
            r3 = 0
            if (r0 == 0) goto L22
            X.0f3N r0 = r4.LLJLLIL
            X.0UlF r0 = r0.LIZ
            if (r0 == 0) goto L13
            X.19rz r0 = r0.getItemAnimator()
            if (r0 != 0) goto L22
        L13:
            X.0f3N r1 = r4.LLJLLIL
            if (r1 == 0) goto L22
            X.01GW r0 = r4.LLLIIIL
            java.lang.Object r0 = r0.getValue()
            X.19rz r0 = (X.AbstractC21673719rz) r0
            r1.LJII(r0)
        L22:
            r4.f2(r7)
            super.cr1(r5, r6, r7)
            boolean r0 = r4.LLLII
            if (r0 == 0) goto Lc0
            X.0f2d r0 = r4.LLJILJILJ
            X.0ez9 r0 = r0.LLLJL
            boolean r0 = r0.LJI
            if (r0 == 0) goto Lc0
            X.0f3N r0 = r4.LLJLLIL
            X.0f26 r0 = r0.LIZJ
            r2 = 0
            if (r0 == 0) goto Lc0
            int r1 = r0.getItemCount()
            r0 = 10
            if (r1 < r0) goto Lc0
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC772390URp.j
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc0
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC772190UQv.q3
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 == 0) goto Lc0
            X.0Igp r0 = X.C473050Igp.LIZIZ()
            boolean r0 = r0.LIZJ()
            if (r0 != 0) goto Lc0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel> r0 = com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel.class
            java.lang.Object r1 = r1.gg0(r0)
            X.0UVH r0 = X.C0UVH.DISMISS
            if (r1 != r0) goto Lc0
            boolean r0 = r4.LLLFZ
            if (r0 != 0) goto Lc0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel> r0 = com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0eFi r0 = (X.C1081600eFi) r0
            if (r0 == 0) goto L9b
            X.0a1P r0 = r0.LIZ
            if (r0 == 0) goto L9b
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel> r0 = com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            X.0eFi r0 = (X.C1081600eFi) r0
            if (r0 == 0) goto L97
            X.0a1P r3 = r0.LIZ
        L97:
            X.0a1P r0 = X.EnumC918970a1P.NORMAL
            if (r3 != r0) goto Lc0
        L9b:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel> r0 = com.bytedance.android.live.liveinteract.api.LinkGuestCountChangeChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lad
            int r0 = r0.intValue()
            if (r0 > 0) goto Lc0
        Lad:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel> r0 = com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            if (r0 != 0) goto Lc0
            r4.LLLII = r2
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.LiveGameExtendedScreenShowGuide> r0 = com.bytedance.android.livesdk.dataChannel.LiveGameExtendedScreenShowGuide.class
            r1.FQ2(r0)
        Lc0:
            r4.ay1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.widget.ExtendedPublicScreenWidget.cr1(int, int, boolean):void");
    }
}
