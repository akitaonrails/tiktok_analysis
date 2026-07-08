package Y;

import X.AbstractC1080560eE2;
import X.AbstractC1136420fg8;
import X.AbstractC1136440fgA;
import X.AbstractC21674019s2;
import X.C1082400eH0;
import X.C1124290fMZ;
import X.C1135260feG;
import X.C1135280feI;
import X.C1136050ffX;
import X.C1136430fg9;
import X.C1139230fkf;
import X.C1139310fkn;
import X.C1142700fqG;
import X.C1145600fuw;
import X.C1161920gLG;
import X.C1802410x0J;
import X.C1803800x2Y;
import X.C1C7U;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501470JlZ;
import X.C766270U4b;
import X.C814420VxA;
import X.InterfaceC1085710eML;
import X.InterfaceC1136020ffU;
import X.InterfaceC1142720fqI;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchBottomNoticeCard;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.GiftDownloadEffectBeforeMsgEnqueueMockFailSettings;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS74S0301000_17;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS23S0201000_17 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    public final void LIZ$0() {
        DataChannel dataChannel = ((AbstractC1136440fgA) this.l0).LIZLLL;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        C1135280feI c1135280feILIZJ = C1135260feG.LIZJ((GiftMessage) this.l1, room != null ? room.getOwner() : null);
        if (c1135280feILIZJ == null) {
            AbstractC1136440fgA abstractC1136440fgA = (AbstractC1136440fgA) this.l0;
            int i = this.i2;
            GiftMessage giftMessage = (GiftMessage) this.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startDownload create EffectMessage fail, messageId:");
            sbLIZ.append(((GiftMessage) this.l1).getMessageId());
            abstractC1136440fgA.LJIILJJIL(i, giftMessage, null, C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        c1135280feILIZJ.LJIJ = 1001;
        AbstractC1136440fgA abstractC1136440fgA2 = (AbstractC1136440fgA) this.l0;
        int i2 = this.i2;
        GiftMessage giftMessage2 = (GiftMessage) this.l1;
        if (abstractC1136440fgA2.LJIIIIZZ(i2)) {
            abstractC1136440fgA2.LJIILIIL(i2, giftMessage2);
            return;
        }
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockAssetModelFail()) {
            abstractC1136440fgA2.LJIILJJIL(i2, giftMessage2, c1135280feILIZJ, "mock sync asset model fail", null);
            return;
        }
        Set setLJ = C1136430fg9.LJ(giftMessage2, c1135280feILIZJ);
        if (setLJ.isEmpty()) {
            abstractC1136440fgA2.LJIIL(i2, giftMessage2, c1135280feILIZJ);
        } else {
            C1136430fg9.LJFF(setLJ, new AwS74S0301000_17(abstractC1136440fgA2, i2, giftMessage2, c1135280feILIZJ, 0), new AwS74S0301000_17(abstractC1136440fgA2, i2, giftMessage2, c1135280feILIZJ, 1));
        }
    }

    public final void LIZ$4() {
        DataChannel dataChannel = ((AbstractC1136420fg8) this.l0).LJ;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        C1135280feI c1135280feILIZIZ = C1135260feG.LIZIZ((InterfaceC1136020ffU) this.l1, room != null ? room.getOwner() : null);
        if (c1135280feILIZIZ == null) {
            AbstractC1136420fg8 abstractC1136420fg8 = (AbstractC1136420fg8) this.l0;
            int i = this.i2;
            InterfaceC1136020ffU interfaceC1136020ffU = (InterfaceC1136020ffU) this.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startDownload create EffectMessage fail, messageId:");
            sbLIZ.append(((InterfaceC1136020ffU) this.l1).getMessageId());
            abstractC1136420fg8.LJIILLIIL(i, interfaceC1136020ffU, null, C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        c1135280feILIZIZ.LJIJ = 1001;
        AbstractC1136420fg8 abstractC1136420fg82 = (AbstractC1136420fg8) this.l0;
        int i2 = this.i2;
        InterfaceC1136020ffU interfaceC1136020ffU2 = (InterfaceC1136020ffU) this.l1;
        if (abstractC1136420fg82.LJIIIZ(i2)) {
            abstractC1136420fg82.LJIILL(i2, interfaceC1136020ffU2);
            return;
        }
        if (GiftDownloadEffectBeforeMsgEnqueueMockFailSettings.INSTANCE.mockAssetModelFail()) {
            abstractC1136420fg82.LJIILLIIL(i2, interfaceC1136020ffU2, c1135280feILIZIZ, "mock sync asset model fail", null);
            return;
        }
        Set setLIZJ = C1136050ffX.LIZJ(interfaceC1136020ffU2, c1135280feILIZIZ);
        if (setLIZJ.isEmpty()) {
            abstractC1136420fg82.LJIILJJIL(i2, interfaceC1136020ffU2, c1135280feILIZIZ);
        } else {
            C1136050ffX.LIZLLL(setLIZJ, new AwS74S0301000_17(abstractC1136420fg82, i2, interfaceC1136020ffU2, c1135280feILIZIZ, 3), new AwS74S0301000_17(abstractC1136420fg82, i2, interfaceC1136020ffU2, c1135280feILIZIZ, 4));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        String strLJIJI;
        String message;
        C501470JlZ c501470JlZ;
        Throwable th = (Throwable) this.l0;
        if (!(th instanceof C501470JlZ) || (c501470JlZ = (C501470JlZ) th) == null || (strLJIJI = c501470JlZ.getPrompt()) == null || strLJIJI.length() <= 0) {
            strLJIJI = C497740JfY.LJIJI(this.i2);
        }
        C766270U4b.LJIIJJI(strLJIJI);
        C1802410x0J c1802410x0J = (C1802410x0J) this.l1;
        if (c1802410x0J.LJI) {
            return;
        }
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        Integer numValueOf = Integer.valueOf(c1802410x0J.LJFF);
        C1802410x0J c1802410x0J2 = (C1802410x0J) this.l1;
        String str = c1802410x0J2.LJ;
        int i = c1802410x0J2.LIZIZ;
        int i2 = c1802410x0J2.LIZJ;
        int i3 = c1802410x0J2.LJIIIZ;
        Exception exc = c1802410x0J2.LIZLLL;
        if (exc == null || (message = exc.getMessage()) == null) {
            message = "";
        }
        C1803800x2Y.LJIJ(c1803800x2Y, numValueOf, null, null, str, "toast", i, i2, i3, message, null, null, null, null, null, 24070);
    }

    public final void LIZ$2() {
        if (((UniversalPopupBlocksUI) this.l0).isAdded() && ((View) this.l1).isAttachedToWindow()) {
            UniversalPopupBlocksUI universalPopupBlocksUI = (UniversalPopupBlocksUI) this.l0;
            View view = (View) this.l1;
            universalPopupBlocksUI.getClass();
            while (view != null) {
                if (!view.isShown() || view.getAlpha() < 0.99f || Math.abs(view.getScaleX() - 1.0f) > 0.01f || Math.abs(view.getScaleY() - 1.0f) > 0.01f) {
                    int i = this.i2;
                    if (i < 15) {
                        UniversalPopupBlocksUI universalPopupBlocksUI2 = (UniversalPopupBlocksUI) this.l0;
                        View view2 = (View) this.l1;
                        universalPopupBlocksUI2.getClass();
                        HandlerHook.viewPostDelay(view2, new ARunnableS23S0201000_17(i + 1, view2, universalPopupBlocksUI2, 6), 16L);
                        return;
                    }
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            UniversalPopupBlocksUI universalPopupBlocksUI3 = (UniversalPopupBlocksUI) this.l0;
            View view3 = (View) this.l1;
            if (universalPopupBlocksUI3.LLJI || !view3.isShown()) {
                return;
            }
            int height = view3.getHeight();
            int width = view3.getWidth();
            if (height <= 0 || width <= 0) {
                return;
            }
            Rect rect = new Rect();
            boolean globalVisibleRect = view3.getGlobalVisibleRect(rect);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            int iWidth = width - rect.width();
            int iHeight = height - rect.height();
            if (!globalVisibleRect || iWidth > iLIZIZ || iHeight > iLIZIZ) {
                universalPopupBlocksUI3.LLJI = true;
                InterfaceC1085710eML interfaceC1085710eML = universalPopupBlocksUI3.LLILLL;
                if (interfaceC1085710eML != null) {
                    interfaceC1085710eML.Sj1();
                }
            }
        }
    }

    public final void LIZ$3() {
        C1082400eH0 c1082400eH0 = (C1082400eH0) this.l0;
        if (c1082400eH0.LLJLILLLLZIIL && c1082400eH0.LLJ.LJII) {
            c1082400eH0.LJIIJJI(c1082400eH0.LLJLL, true);
            return;
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && C500260Jjc.LJJII(C497740JfY.LIZ)) {
            int height = ((AbstractC1080560eE2) this.l1).getContainer().getHeight() - this.i2;
            AbstractC1080560eE2 abstractC1080560eE2 = (AbstractC1080560eE2) this.l1;
            int i = height - abstractC1080560eE2.LJIIIZ;
            C1082400eH0 c1082400eH02 = (C1082400eH0) this.l0;
            c1082400eH02.LJIIJJI(i + (c1082400eH02.LLJI ? abstractC1080560eE2.LIZLLL : 0), false);
            return;
        }
        if (!((C1082400eH0) this.l0).LLJ.LJII) {
            int height2 = ((AbstractC1080560eE2) this.l1).getContainer().getHeight() - this.i2;
            AbstractC1080560eE2 abstractC1080560eE22 = (AbstractC1080560eE2) this.l1;
            int i2 = height2 - abstractC1080560eE22.LJIIIZ;
            C1082400eH0 c1082400eH03 = (C1082400eH0) this.l0;
            c1082400eH03.LJIIJJI(i2 + (c1082400eH03.LLJI ? abstractC1080560eE22.LIZLLL : 0), false);
            return;
        }
        Room room = (Room) ((AbstractC1080560eE2) this.l1).getDataChannel().gg0(RoomChannel.class);
        if ((room != null ? room.getStreamType() : null) != LiveMode.LIVE_STUDIO || !((C1082400eH0) this.l0).LLJI) {
            ((C1082400eH0) this.l0).LJIIJJI(((((AbstractC1080560eE2) this.l1).getContainer().getHeight() - ((AbstractC1080560eE2) this.l1).getContainer().getPaddingTop()) - ((C1082400eH0) this.l0).LLJ.LJIIJJI) - ((AbstractC1080560eE2) this.l1).LJIIIZ, true);
            return;
        }
        int height3 = ((AbstractC1080560eE2) this.l1).getContainer().getHeight() - this.i2;
        AbstractC1080560eE2 abstractC1080560eE23 = (AbstractC1080560eE2) this.l1;
        ((C1082400eH0) this.l0).LJIIJJI((height3 - abstractC1080560eE23.LJIIIZ) + abstractC1080560eE23.LIZLLL, false);
    }

    public static final void run$0(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        C1142700fqG c1142700fqG = (C1142700fqG) aRunnableS23S0201000_17.l0;
        C1139230fkf c1139230fkf = (C1139230fkf) aRunnableS23S0201000_17.l1;
        int i = aRunnableS23S0201000_17.i2;
        c1142700fqG.getClass();
        C1C7U.LIZ("GiftResourceManager@58b9.onProgress$1L");
        C1139310fkn c1139310fkn = (C1139310fkn) ((HashMap) c1142700fqG.LIZ).get(c1139230fkf.LIZ);
        if (c1139310fkn == null) {
            C1C7U.LIZIZ("GiftResourceManager@58b9.onProgress$1L");
            return;
        }
        Iterator it2 = ((CopyOnWriteArrayList) c1139310fkn.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1142720fqI) it2.next()).onProgress(i);
        }
        C1C7U.LIZIZ("GiftResourceManager@58b9.onProgress$1L");
    }

    public static final void run$1(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        boolean zLIZ;
        C1C7U.LIZ("SpecialGiftEffectBasePreDownloader@878a.startDownload$runnable$1");
        try {
            aRunnableS23S0201000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecialGiftEffectBasePreDownloader@878a.startDownload$runnable$1");
    }

    public static final void run$2(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        boolean zLIZ;
        C1C7U.LIZ("MatchBottomNoticeCard@8c49.showVirtualTicketGuideWithRetry$runnable$1");
        try {
            ((MatchBottomNoticeCard) aRunnableS23S0201000_17.l0).ap((C1145600fuw) aRunnableS23S0201000_17.l1, aRunnableS23S0201000_17.i2 - 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchBottomNoticeCard@8c49.showVirtualTicketGuideWithRetry$runnable$1");
    }

    public static final void run$3(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        boolean zLIZ;
        C1C7U.LIZ("RechargeExceptionUtils@d8cf.handleToast$1");
        try {
            aRunnableS23S0201000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RechargeExceptionUtils@d8cf.handleToast$1");
    }

    public static final void run$4(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        boolean zLIZ;
        RecyclerView.LayoutManager layoutManager;
        C1C7U.LIZ("GiftPanelBottomLeaf@1211.playAutoScrollToPositionAndBackAnimation$1");
        try {
            ((AbstractC21674019s2) aRunnableS23S0201000_17.l0).LIZ = aRunnableS23S0201000_17.i2;
            RecyclerView recyclerView = ((C1124290fMZ) aRunnableS23S0201000_17.l1).LLJ;
            if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                layoutManager.startSmoothScroll((AbstractC21674019s2) aRunnableS23S0201000_17.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelBottomLeaf@1211.playAutoScrollToPositionAndBackAnimation$1");
    }

    public static final void run$5(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        boolean zLIZ;
        RecyclerView.LayoutManager layoutManager;
        C1C7U.LIZ("GiftPanelBottomLeaf@1211.playAutoScrollToPositionAndBackAnimation$2");
        try {
            ((AbstractC21674019s2) aRunnableS23S0201000_17.l0).LIZ = aRunnableS23S0201000_17.i2;
            RecyclerView recyclerView = ((C1124290fMZ) aRunnableS23S0201000_17.l1).LLJ;
            if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                layoutManager.startSmoothScroll((AbstractC21674019s2) aRunnableS23S0201000_17.l0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftPanelBottomLeaf@1211.playAutoScrollToPositionAndBackAnimation$2");
    }

    public static final void run$6(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        boolean zLIZ;
        C1C7U.LIZ("UniversalPopupBlocksUI@db40.waitForBottomPinnedVisibilityCheckStability$1");
        try {
            aRunnableS23S0201000_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UniversalPopupBlocksUI@db40.waitForBottomPinnedVisibilityCheckStability$1");
    }

    public static final void run$7(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        boolean zLIZ;
        C1C7U.LIZ("InteractiveZoneBottomGroupTopGuidelineSpec@447c.l$1$task$1");
        try {
            aRunnableS23S0201000_17.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractiveZoneBottomGroupTopGuidelineSpec@447c.l$1$task$1");
    }

    public static final void run$8(ARunnableS23S0201000_17 aRunnableS23S0201000_17) {
        boolean zLIZ;
        C1C7U.LIZ("SpecialGiftEffectBasePreDownloaderNew@5411.startDownload$runnable$1");
        try {
            aRunnableS23S0201000_17.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecialGiftEffectBasePreDownloaderNew@5411.startDownload$runnable$1");
    }

    public ARunnableS23S0201000_17(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.i2 = i;
        this.l1 = obj;
    }
}
