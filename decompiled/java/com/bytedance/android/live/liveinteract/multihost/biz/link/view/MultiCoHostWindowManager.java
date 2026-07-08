package com.bytedance.android.live.liveinteract.multihost.biz.link.view;

import X.C01GW;
import X.C0IWY;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C473410IhP;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917240Zyc;
import X.C942620adY;
import X.C945320ahu;
import X.C946660ak4;
import X.C948780anU;
import X.C954460awe;
import X.C955010axX;
import X.C955080axe;
import X.C955230axt;
import X.C955330ay3;
import X.C957010b0l;
import X.C958040b2Q;
import X.C963580bBM;
import X.EnumC452301pR;
import X.EnumC918810a19;
import X.InterfaceC1294060jmO;
import X.InterfaceC937820aVo;
import X.InterfaceC937840aVq;
import X.InterfaceC937900aVw;
import X.InterfaceC951900asW;
import X.InterfaceC954180awC;
import X.InterfaceC956450azr;
import X.ViewOnClickListenerC986770bml;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS46S0300000_13;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.liveinteract.api.AllLinkMicWindowRenderedEvent;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.room.SeiCacheChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeStageGiftTrayMarginFixSetting;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS2S1211000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.CohostTypeSpotExtra;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostWindowManager {
    public static final Map<String, ViewOnClickListenerC986770bml> LJJ = new LinkedHashMap();
    public boolean LIZIZ;
    public DataChannel LIZJ;
    public Context LIZLLL;
    public FrameLayout LJ;
    public FrameLayout LJFF;
    public LifecycleOwner LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public final String LIZ = "MultiCoHostWindowManager";
    public List<AnimatorSet> LJI = new ArrayList();
    public final C946660ak4 LJIIJ = new C946660ak4();
    public final C01GW LJIIJJI = C452501pT.LIZ(EnumC452301pR.NONE, AFwS203S0000000_15.get$arr$(144));
    public final AwS629S0100000_15 LJIIL = new AwS629S0100000_15(this, 38);
    public final AwS629S0100000_15 LJIILIIL = new AwS629S0100000_15(this, 37);
    public final AwS629S0100000_15 LJIILJJIL = new AwS629S0100000_15(this, 34);
    public final AwS629S0100000_15 LJIILL = new AwS629S0100000_15(this, 31);
    public final AwS629S0100000_15 LJIILLIIL = new AwS629S0100000_15(this, 32);
    public final AwS629S0100000_15 LJIIZILJ = new AwS629S0100000_15(this, 29);
    public final AwS629S0100000_15 LJIJ = new AwS629S0100000_15(this, 35);
    public final AwS629S0100000_15 LJIJI = new AwS629S0100000_15(this, 30);
    public final AwS629S0100000_15 LJIJJ = new AwS629S0100000_15(this, 36);
    public final MultiCoHostWindowManager$lifecycleObserver$1 LJIJJLI = new GenericLifecycleObserver() { // from class: com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager$lifecycleObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public final void onResume() {
            boolean z = this.LL.LJIIIIZZ;
            if (C963580bBM.LIZ()) {
                C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
                z = (c955010axXI30 == null || c955010axXI30.LJI() == null) ? false : true;
            }
            String str = this.LL.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onResume, shouldSendCrossRoomEvent = ");
            sbLIZ.append(z);
            sbLIZ.append(", needResendRoomEventOnResume=");
            sbLIZ.append(this.LL.LJIIIIZZ);
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                C473410IhP.LIZIZ(new ARunnableS115S0100000_15(this.LL, 68));
            }
        }
    };
    public final AwS629S0100000_15 LJIL = new AwS629S0100000_15(this, 33);

    public final InterfaceC956450azr LIZJ(String str) {
        boolean z;
        KeyEvent.Callback callbackFindViewWithTag;
        View rootView;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            FrameLayout frameLayout = this.LJ;
            if (frameLayout != null && (rootView = frameLayout.getRootView()) != null) {
                callbackFindViewWithTag = rootView.findViewWithTag(str);
            } else {
                callbackFindViewWithTag = null;
            }
            if (!(callbackFindViewWithTag instanceof InterfaceC956450azr)) {
                return null;
            }
            return (InterfaceC956450azr) callbackFindViewWithTag;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str2 = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("findWindowViewByTag, tag = ");
            sbLIZ.append(str);
            C20441214yg.LJFF(str2, C2188811AlT.LIZIZ(sbLIZ), e);
            return null;
        }
    }

    public final ViewOnClickListenerC986770bml LJ(String str) {
        View viewFindViewWithTag;
        View rootView;
        try {
            FrameLayout frameLayout = this.LJ;
            if (frameLayout != null && (rootView = frameLayout.getRootView()) != null) {
                viewFindViewWithTag = rootView.findViewWithTag(str);
            } else {
                viewFindViewWithTag = null;
            }
            if (!(viewFindViewWithTag instanceof ViewOnClickListenerC986770bml)) {
                return null;
            }
            return (ViewOnClickListenerC986770bml) viewFindViewWithTag;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str2 = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getWindowViewByLinkMicId, linkMicId = ");
            sbLIZ.append(str);
            C20441214yg.LJFF(str2, C2188811AlT.LIZIZ(sbLIZ), e);
            return null;
        }
    }

    public final boolean LJI(C955080axe c955080axe) {
        String strLIZ;
        boolean z;
        DataChannel dataChannel;
        C945320ahu c945320ahu;
        LiveSeiStruct liveSeiStruct;
        SeiAppData seiAppData;
        C955230axt c955230axt;
        if (c955080axe != null && (c955230axt = c955080axe.LJIIZILJ) != null) {
            strLIZ = C955330ay3.LIZ(c955230axt);
        } else {
            strLIZ = null;
        }
        boolean zLJFF = Intrinsics.LJFF(strLIZ, "3");
        if (!this.LIZIZ && (dataChannel = this.LIZJ) != null && (c945320ahu = (C945320ahu) dataChannel.gg0(SeiCacheChannel.class)) != null && (liveSeiStruct = c945320ahu.LIZ) != null && (seiAppData = liveSeiStruct.LIZ) != null && seiAppData.battleId > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean zCo0 = C915980Zwa.LJFF().co0();
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isFromMatch isAnchorFromMatchStart = ");
        sbLIZ.append(zLJFF);
        sbLIZ.append(" isAudienceFromMatch ");
        sbLIZ.append(z);
        sbLIZ.append(" isInMatch ");
        sbLIZ.append(zCo0);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (zLJFF || z || zCo0) {
            return true;
        }
        return false;
    }

    @InterfaceC1294060jmO
    public final void LIZ(String str, boolean z) {
        C955080axe c955080axeLJIIJ;
        InterfaceC954180awC interfaceC954180awCLJIIIZ;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        InterfaceC937840aVq interfaceC937840aVqLJI;
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        int size = listLLILZLL.size();
        for (C954460awe c954460awe : listLLILZLL) {
            if (C963580bBM.LIZ()) {
                C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
                if (c955010axXI30 != null && (c955080axeLJIIJ = c955010axXI30.LJIIJ(c954460awe.LJIIJJI)) != null && c955080axeLJIIJ.LIZJ) {
                    LJIIIZ(null, c955080axeLJIIJ, size, z, str);
                }
            } else {
                IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
                if (iMultiHostServiceLJII != null && (interfaceC954180awCLJIIIZ = iMultiHostServiceLJII.LJIIIZ()) != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL.LJJJJZ()) != null && (interfaceC937840aVqLJI = interfaceC937820aVoLJJJJZ.LJI(c954460awe.LJIIJJI)) != null && interfaceC937840aVqLJI.LIZJ()) {
                    LJIIIZ(interfaceC937840aVqLJI, null, size, z, str);
                }
            }
        }
    }

    public final void LIZIZ(View view, Function1<? super View, Unit> function1) {
        if (view.getWidth() > 0) {
            function1.invoke(view);
        } else {
            HandlerHook.viewPost(view, new ARunnableS46S0300000_13(this, view, function1, 6));
        }
    }

    public final void LJFF(InterfaceC937840aVq interfaceC937840aVq, C955080axe c955080axe) {
        boolean z;
        int size = C915980Zwa.LJII().LJIJJ().size();
        if (interfaceC937840aVq != null) {
            if (LiveCoHostTakeStageGiftTrayMarginFixSetting.INSTANCE.isEnable()) {
                this.LJIIJJI.getValue().getClass();
                EnumC918810a19 enumC918810a19State = interfaceC937840aVq.state();
                if (enumC918810a19State.compareTo(EnumC918810a19.StatePreparing) >= 0 && enumC918810a19State.compareTo(EnumC918810a19.StateLinked) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Window is not ready yet. windowState=");
                    sbLIZ.append(interfaceC937840aVq.state());
                    sbLIZ.append('.');
                    C20441214yg.LIZIZ("TakeStageSmallWindowVerifier", C2188811AlT.LIZIZ(sbLIZ));
                } else if (!C958040b2Q.LIZLLL()) {
                    C20441214yg.LIZIZ("TakeStageSmallWindowVerifier", "currentLayout is not TakeStageLayout");
                } else {
                    int iLJIIIIZZ = interfaceC937840aVq.LJIIIIZZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("currentLayout is TakeStageLayout. uiPos=");
                    sbLIZ2.append(iLJIIIIZZ);
                    C20441214yg.LIZIZ("TakeStageSmallWindowVerifier", C2188811AlT.LIZIZ(sbLIZ2));
                    if (!C963580bBM.LIZ() ? !(iLJIIIIZZ <= 0 ? iLJIIIIZZ != 0 || !C958040b2Q.LIZIZ() : !C958040b2Q.LIZJ()) : iLJIIIIZZ > 0) {
                        Rect rectLJFF = interfaceC937840aVq.LJFF();
                        String str = this.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("TakeStageSmallWindow. left=");
                        sbLIZ3.append(rectLJFF.left);
                        sbLIZ3.append(" width=");
                        sbLIZ3.append(rectLJFF.width());
                        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ3));
                        C915980Zwa.LJI().LJIIIZ().LJFF(rectLJFF);
                    }
                }
            }
            if (interfaceC937840aVq.LIZJ() && interfaceC937840aVq.state() == EnumC918810a19.StateLinked) {
                LJIIIZ(interfaceC937840aVq, null, size, false, "WindowStateChangeMessage");
            }
            LJIIJJI(interfaceC937840aVq, null, size);
        } else if (c955080axe != null) {
            String str2 = this.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("handleCoHostWindow, coHostWindowLayoutInfo = ");
            sbLIZ4.append(c955080axe);
            C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ4));
            if (c955080axe.LJIIL) {
                C786410Ut5.LJJJJIZL(c955080axe.LIZ);
            } else {
                LJIIJJI(null, c955080axe, size);
            }
        }
        String str3 = this.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("WindowStateChangeMessage : CoHostUserList size = ");
        sbLIZ5.append(size);
        C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ5));
        C942620adY.LIZ(this.LIZIZ, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[PHI: r13
      0x0015: PHI (r13v3 java.lang.String) = (r13v0 java.lang.String), (r13v4 java.lang.String) binds: [B:9:0x0013, B:5:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02fb A[PHI: r11
      0x02fb: PHI (r11v1 X.0bml) = (r11v15 X.0bml), (r11v16 X.0bml), (r11v4 X.0bml) binds: [B:99:0x027b, B:101:0x0283, B:106:0x0297] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r13
      0x001b: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:9:0x0013, B:11:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee A[PHI: r0
      0x00ee: PHI (r0v2 boolean) = (r0v0 boolean), (r0v46 boolean) binds: [B:48:0x00ed, B:23:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v13, types: [X.0azr] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [androidx.constraintlayout.widget.ConstraintLayout] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC956450azr LIZLLL(X.InterfaceC937840aVq r22, X.C955080axe r23, int r24) {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager.LIZLLL(X.0aVq, X.0axe, int):X.0azr");
    }

    public final void LJII(InterfaceC956450azr interfaceC956450azr, int i, int i2) {
        InterfaceC951900asW interfaceC951900asW;
        this.LJIIIZ++;
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWindowAdded:coHostWindowView:");
        sbLIZ.append(interfaceC956450azr.hashCode());
        sbLIZ.append(",allUserSize:");
        sbLIZ.append(i2);
        sbLIZ.append(", pos:");
        sbLIZ.append(i);
        sbLIZ.append(", timeMs:");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(", currentWindowAddedCount:");
        sbLIZ.append(this.LJIIIZ);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIIZ == 1) {
            C20441214yg.LIZIZ("LayoutFirstFrameOptLog", "firstWindowRender");
            DataChannel dataChannel = this.LIZJ;
            if (dataChannel != null && (interfaceC951900asW = (InterfaceC951900asW) dataChannel.gg0(C957010b0l.class)) != null) {
                interfaceC951900asW.LJIL();
            }
        }
        if (this.LJIIIZ >= i2) {
            this.LJIIIZ = 0;
            C20441214yg.LIZIZ("LayoutFirstFrameOptLog", "AllLinkMicWindowRenderedEvent");
            DataChannel dataChannel2 = this.LIZJ;
            if (dataChannel2 != null) {
                dataChannel2.LC0(AllLinkMicWindowRenderedEvent.class, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final void LJIIJ(InterfaceC937840aVq interfaceC937840aVq, C955080axe c955080axe, int i) {
        InterfaceC956450azr interfaceC956450azrLIZLLL;
        int i2 = 0;
        if (interfaceC937840aVq != null) {
            int i3 = C917240Zyc.LIZ[interfaceC937840aVq.state().ordinal()];
            if ((i3 != 1 && i3 != 2 && i3 != 3) || (interfaceC956450azrLIZLLL = LIZLLL(interfaceC937840aVq, null, i)) == null) {
                return;
            }
            interfaceC956450azrLIZLLL.LLL(interfaceC937840aVq.state());
            interfaceC956450azrLIZLLL.LLFZ(interfaceC937840aVq.LJIIIIZZ(), interfaceC937840aVq.LJIIL(), interfaceC937840aVq.LIZIZ(false), null, false);
            return;
        }
        if (c955080axe == null) {
            return;
        }
        int i4 = C917240Zyc.LIZ[c955080axe.LJIIJJI.ordinal()];
        if (i4 != 1 && i4 != 2 && i4 != 3) {
            return;
        }
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateHostWindow, getWindowView, coHostWindowLayoutInfo = ");
        sbLIZ.append(c955080axe);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC956450azr interfaceC956450azrLIZLLL2 = LIZLLL(null, c955080axe, i);
        if (interfaceC956450azrLIZLLL2 == null) {
            return;
        }
        interfaceC956450azrLIZLLL2.LLL(c955080axe.LJIIJJI);
        int i5 = c955080axe.LJ;
        Rect rect = c955080axe.LJFF;
        CohostTypeSpotExtra cohostTypeSpotExtra = c955080axe.LJIILJJIL;
        if (cohostTypeSpotExtra != null) {
            i2 = cohostTypeSpotExtra.contentType;
        }
        interfaceC956450azrLIZLLL2.LLFZ(i5, rect, i2, cohostTypeSpotExtra, LJI(c955080axe));
    }

    public final void LJIIJJI(InterfaceC937840aVq interfaceC937840aVq, C955080axe c955080axe, int i) {
        if (interfaceC937840aVq != null) {
            String strLJ = interfaceC937840aVq.LJ();
            if (!interfaceC937840aVq.LJIIZILJ(false) && !C948780anU.LJIIJJI(C915980Zwa.LJII().LJIIIZ(), strLJ)) {
                if (C948780anU.LJIIJ(C915980Zwa.LJII().LJIIIZ(), strLJ)) {
                    String str = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateWindow for guest: ");
                    sbLIZ.append(strLJ);
                    C20441214yg.LJIIIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                    this.LJIIJ.LIZJ(this.LIZLLL, this.LIZJ, interfaceC937840aVq, c955080axe);
                    return;
                }
                return;
            }
            String str2 = this.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateWindow for host: ");
            sbLIZ2.append(strLJ);
            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            LJIIJ(interfaceC937840aVq, null, i);
            return;
        }
        if (c955080axe == null) {
            return;
        }
        String str3 = this.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateWindow, coHostWindowLayoutInfo = ");
        sbLIZ3.append(c955080axe);
        C20441214yg.LIZIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
        String strLIZ = c955080axe.LIZ();
        if (!c955080axe.LJIIIZ && !C948780anU.LJIIJJI(C915980Zwa.LJII().LJIIIZ(), strLIZ)) {
            if (!C948780anU.LJIIJ(C915980Zwa.LJII().LJIIIZ(), strLIZ)) {
                return;
            }
            String str4 = this.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("updateWindow for guest: ");
            sbLIZ4.append(strLIZ);
            C20441214yg.LJIIIZ(str4, C2188811AlT.LIZIZ(sbLIZ4));
            this.LJIIJ.LIZJ(this.LIZLLL, this.LIZJ, interfaceC937840aVq, c955080axe);
            return;
        }
        String str5 = this.LIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("updateWindow for host: ");
        sbLIZ5.append(strLIZ);
        C20441214yg.LJIIIZ(str5, C2188811AlT.LIZIZ(sbLIZ5));
        LJIIJ(null, c955080axe, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.InterfaceC937840aVq r14, X.C955080axe r15, int r16, boolean r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager.LJIIIIZZ(X.0aVq, X.0axe, int, boolean, java.lang.String):void");
    }

    @InterfaceC1294060jmO
    public final void LJIIIZ(InterfaceC937840aVq interfaceC937840aVq, C955080axe c955080axe, int i, boolean z, String str) {
        if (interfaceC937840aVq != null) {
            if (C0IWY.LIZ && !LinkCoreModelKt.currentUserIsAnchor()) {
                LIZIZ(interfaceC937840aVq.LJJIIJ(), new AwS2S1211000_15(this, interfaceC937840aVq, i, z, str, 0));
                return;
            } else {
                LJIIIIZZ(interfaceC937840aVq, null, i, z, str);
                return;
            }
        }
        if (c955080axe == null) {
            return;
        }
        if (C0IWY.LIZ && !LinkCoreModelKt.currentUserIsAnchor()) {
            LIZIZ(c955080axe.LIZ, new AwS2S1211000_15(this, c955080axe, i, z, str, 1));
        } else {
            LJIIIIZZ(null, c955080axe, i, z, str);
        }
    }
}
