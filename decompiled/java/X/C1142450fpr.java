package X;

import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0fpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142450fpr implements InterfaceC1141350fo5 {
    public static final long LJIIJ;
    public final Context LIZ;
    public final FrameLayout LIZIZ;
    public final InterfaceC2246631CwX LIZJ;
    public InterfaceC2247071CxF LIZLLL;
    public final C1142470fpt LJ;
    public InterfaceC1142460fps LJFF;
    public final ARunnableS117S0100000_17 LJI = new ARunnableS117S0100000_17(this, 244);
    public boolean LJII = true;
    public boolean LJIIIIZZ;
    public volatile long LJIIIZ;

    static {
        LJIIJ = LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReplay() ? r1.playerAliveDuration() : 60000L;
    }

    @Override // X.InterfaceC1141350fo5
    public final float LIZIZ() {
        InterfaceC1142460fps interfaceC1142460fps = this.LJFF;
        if (interfaceC1142460fps != null) {
            return interfaceC1142460fps.LIZIZ();
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1141350fo5
    public final float getFps() {
        InterfaceC1142460fps interfaceC1142460fps = this.LJFF;
        if (interfaceC1142460fps != null) {
            return interfaceC1142460fps.LJ();
        }
        return -1.0f;
    }

    @Override // X.InterfaceC1141350fo5
    public final String getPlayerType() {
        String playerType;
        InterfaceC1142460fps interfaceC1142460fps = this.LJFF;
        return (interfaceC1142460fps == null || (playerType = interfaceC1142460fps.getPlayerType()) == null) ? "unknown" : playerType;
    }

    public final int LIZLLL() {
        if (C1141290fnz.LIZ().LJIIIIZZ) {
            FrameLayout frameLayout = this.LIZIZ;
            if (frameLayout != null) {
                return frameLayout.hashCode();
            }
            return 0;
        }
        Context context = this.LIZ;
        if (context != null) {
            return context.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1141350fo5
    public final void release() {
        InterfaceC1142460fps interfaceC1142460fpsRemove;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release, msgId=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", isPlayEnd=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", liveGiftPlayController=");
        sbLIZ.append(this.LJFF);
        C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        C1141290fnz.LIZ.removeCallbacks(this.LJI);
        InterfaceC1142460fps interfaceC1142460fps = this.LJFF;
        if (interfaceC1142460fps != null) {
            interfaceC1142460fps.LJIIL();
            InterfaceC1142460fps interfaceC1142460fps2 = this.LJFF;
            if (interfaceC1142460fps2 != null) {
                interfaceC1142460fps2.LJIIIZ();
            }
            InterfaceC1142460fps interfaceC1142460fps3 = this.LJFF;
            if (interfaceC1142460fps3 != null) {
                interfaceC1142460fps3.LJIILIIL();
            }
            InterfaceC1142460fps interfaceC1142460fps4 = this.LJFF;
            if (interfaceC1142460fps4 != null) {
                interfaceC1142460fps4.detachAlphaView(this.LIZIZ);
            }
        }
        InterfaceC1141280fny interfaceC1141280fny = (InterfaceC1141280fny) C2043807zY.LIZ(InterfaceC1141280fny.class);
        if (interfaceC1141280fny != null) {
            this.LIZLLL = interfaceC1141280fny.LIZJ();
        }
        this.LJFF = null;
        C1141760fok.LIZ();
        int iLIZLLL = LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("release player containerHashCode=");
        sbLIZ2.append(iLIZLLL);
        C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
        if (C1141290fnz.LIZ().LJIIIIZZ) {
            for (Map.Entry<String, InterfaceC1142460fps> entry : C1141750foj.LIZ.entrySet()) {
                String key = entry.getKey();
                if (key != null && u.LJJIIJZLJL(key, String.valueOf(iLIZLLL), false) && (interfaceC1142460fpsRemove = C1141750foj.LIZ.remove(entry.getKey())) != null) {
                    interfaceC1142460fpsRemove.release();
                }
            }
        } else {
            Iterator<Map.Entry<String, InterfaceC1142460fps>> it2 = C1141750foj.LIZ.entrySet().iterator();
            while (it2.hasNext()) {
                InterfaceC1142460fps value = it2.next().getValue();
                if (value != null) {
                    value.release();
                }
            }
            C1141750foj.LIZ.clear();
        }
        C2246671Cwb.LIZ.getClass();
        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnable()) {
            ((Handler) C2246671Cwb.LIZJ.getValue()).removeCallbacksAndMessages(null);
            ((Handler) C2246671Cwb.LIZIZ.getValue()).removeCallbacksAndMessages(null);
            C2246671Cwb.LJ();
            C2246671Cwb.LIZJ(false);
            C2246671Cwb.LIZLLL(false);
        }
    }

    @Override // X.InterfaceC1141350fo5
    public final void stop() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop, msgId=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", isPlayEnd=");
        sbLIZ.append(this.LJII);
        C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1142460fps interfaceC1142460fps = this.LJFF;
        if (interfaceC1142460fps != null) {
            interfaceC1142460fps.stop();
        }
    }

    public static MaskSrc LJI(C1141870fov c1141870fov) {
        MaskSrc maskSrc = new MaskSrc();
        maskSrc.setBitmap(c1141870fov.LIZJ);
        maskSrc.setText(null);
        maskSrc.setName(c1141870fov.LIZ);
        maskSrc.setType(c1141870fov.LIZIZ);
        return maskSrc;
    }

    @Override // X.InterfaceC1141350fo5
    public final C1141050fnb LIZJ(C1141100fng c1141100fng) {
        long jLongValue;
        Boolean boolValueOf;
        long jLongValue2;
        System.currentTimeMillis();
        Long l = c1141100fng.LIZJ.LIZ;
        long jLongValue3 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LJIIIZ = jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start enter (sync), msgId=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", container=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(", hasLiveCore=");
        sbLIZ.append(this.LJIIIIZZ);
        C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        C1141290fnz.LIZ.removeCallbacks(this.LJI);
        InterfaceC2247071CxF interfaceC2247071CxF = this.LIZLLL;
        if (interfaceC2247071CxF == null || interfaceC2247071CxF.LIZJ() != this.LJIIIIZZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("audio handler changed, force release, msgId=");
            sbLIZ2.append(this.LJIIIZ);
            C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
            release();
        }
        InterfaceC2247071CxF interfaceC2247071CxF2 = this.LIZLLL;
        if (interfaceC2247071CxF2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC2247071CxF2.LIZJ());
        } else {
            boolValueOf = null;
        }
        this.LJIIIIZZ = C500260Jjc.LJJJI(boolValueOf);
        InterfaceC1142460fps interfaceC1142460fpsLJ = LJ(c1141100fng);
        if (interfaceC1142460fpsLJ == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("start fail, player is null, msgId=");
            sbLIZ3.append(this.LJIIIZ);
            C20441214yg.LJ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ3));
            return new C1141050fnb(-20, "play gift video fail, because player is null.", null);
        }
        interfaceC1142460fpsLJ.setVolume(c1141100fng.LIZ);
        C1141710fof c1141710fof = c1141100fng.LIZJ;
        c1141710fof.getClass();
        C0N7I c0n7i = C0N7I.PLAYCONTROLLER_START;
        Long l2 = c1141710fof.LIZ;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        C1141740foi.LIZ(c0n7i, jLongValue2, c1141710fof.LIZIZ);
        List<? extends C1141870fov> list = c1141100fng.LJFF;
        if (list != null) {
            Iterator<? extends C1141870fov> it2 = list.iterator();
            while (it2.hasNext()) {
                MaskSrc maskSrcLJI = LJI(it2.next());
                if (maskSrcLJI.getType() == 0) {
                    interfaceC1142460fpsLJ.LJFF(maskSrcLJI.getTextSize(), maskSrcLJI.getName(), maskSrcLJI.getText(), maskSrcLJI.getTextColor(), maskSrcLJI.isBold());
                } else if (maskSrcLJI.getType() == 1) {
                    interfaceC1142460fpsLJ.LJIIJJI(maskSrcLJI.getName(), maskSrcLJI.getBitmap(), 1.0f);
                }
            }
        }
        Long l3 = c1141100fng.LIZJ.LIZ;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        }
        List arrayList = c1141100fng.LJ;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return interfaceC1142460fpsLJ.LIZJ(jLongValue3, arrayList);
    }

    public final InterfaceC1142460fps LJ(C1141100fng c1141100fng) {
        boolean zLJIIIIZZ;
        C2246651CwZ c2246651CwZ;
        Integer numValueOf;
        Context context;
        Context contextN3;
        InterfaceC1142460fps interfaceC1142460fps;
        Integer numValueOf2;
        boolean z;
        C2246651CwZ c2246651CwZ2;
        InterfaceC1142460fps interfaceC1142460fps2 = this.LJFF;
        if (interfaceC1142460fps2 != null && c1141100fng != null) {
            zLJIIIIZZ = interfaceC1142460fps2.LJIIIIZZ(c1141100fng);
        } else {
            zLJIIIIZZ = false;
        }
        Integer numValueOf3 = null;
        if (!zLJIIIIZZ && this.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPlayer, player not support request, release & re-init, msgId=");
            sbLIZ.append(this.LJIIIZ);
            C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
            LiveGiftVideoPlayerPerfOptSetting liveGiftVideoPlayerPerfOptSetting = LiveGiftVideoPlayerPerfOptSetting.INSTANCE;
            if (liveGiftVideoPlayerPerfOptSetting.isEnable()) {
                InterfaceC1142460fps interfaceC1142460fps3 = this.LJFF;
                if (interfaceC1142460fps3 != null) {
                    interfaceC1142460fps3.release();
                }
                C1141760fok.LIZ();
                C1141750foj.LIZ.remove(C1141750foj.LIZ(LIZLLL(), c1141100fng));
            }
            C1141760fok.LIZ();
            String strLIZ = C1141750foj.LIZ(LIZLLL(), c1141100fng);
            ConcurrentHashMap<String, InterfaceC1142460fps> concurrentHashMap = C1141750foj.LIZ;
            InterfaceC1142460fps interfaceC1142460fps4 = concurrentHashMap.get(strLIZ);
            this.LJFF = interfaceC1142460fps4;
            if (interfaceC1142460fps4 == null) {
                Context context2 = this.LIZ;
                if (context2 instanceof LifecycleOwner) {
                    LifecycleOwner lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(context2, false);
                    C1141760fok.LIZ();
                    int iLIZLLL = LIZLLL();
                    InterfaceC2247071CxF interfaceC2247071CxF = this.LIZLLL;
                    String strLIZ2 = C1141750foj.LIZ(iLIZLLL, c1141100fng);
                    if (Intrinsics.LJFF(C1141750foj.LIZIZ, strLIZ2) && concurrentHashMap.get(strLIZ2) != null) {
                        InterfaceC1142460fps interfaceC1142460fps5 = concurrentHashMap.get(strLIZ2);
                        if (liveGiftVideoPlayerPerfOptSetting.isEnableReplay() && ((z = interfaceC1142460fps5 instanceof C2246651CwZ))) {
                            C2246651CwZ c2246651CwZ3 = (C2246651CwZ) interfaceC1142460fps5;
                            if (c2246651CwZ3 != null) {
                                c2246651CwZ3.LJIIJ(interfaceC2247071CxF);
                            }
                            if (z && (c2246651CwZ2 = (C2246651CwZ) interfaceC1142460fps5) != null) {
                                c2246651CwZ2.LJI(c1141100fng);
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("initializeForPlay, reuse player inputGiftPlayerControllerKey=");
                        sbLIZ2.append(strLIZ2);
                        sbLIZ2.append(" giftPlayControllerCache=");
                        if (interfaceC1142460fps5 != null) {
                            numValueOf2 = Integer.valueOf(interfaceC1142460fps5.hashCode());
                        } else {
                            numValueOf2 = null;
                        }
                        sbLIZ2.append(numValueOf2);
                        sbLIZ2.append(" isEnableReplay=");
                        sbLIZ2.append(liveGiftVideoPlayerPerfOptSetting.isEnableReplay());
                        C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
                        interfaceC1142460fps = interfaceC1142460fps5;
                    } else {
                        InterfaceC1141280fny interfaceC1141280fny = (InterfaceC1141280fny) C2043807zY.LIZ(InterfaceC1141280fny.class);
                        if (interfaceC1141280fny != null && (context = interfaceC1141280fny.context()) != null && (contextN3 = C786410Ut5.N3(context)) != null) {
                            C2246651CwZ c2246651CwZ4 = new C2246651CwZ(contextN3, interfaceC2247071CxF, true);
                            c2246651CwZ4.LJI(c1141100fng);
                            c2246651CwZ4.LJIJJLI(lifecycleOwnerLJJIFFI, c1141100fng.LJ);
                            C1141750foj.LIZIZ = strLIZ2;
                            concurrentHashMap.put(strLIZ2, c2246651CwZ4);
                            c2246651CwZ = c2246651CwZ4;
                        } else {
                            c2246651CwZ = null;
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("create new player inputGiftPlayerControllerKey=");
                        sbLIZ3.append(strLIZ2);
                        sbLIZ3.append(" giftPlayController=");
                        if (c2246651CwZ != null) {
                            numValueOf = Integer.valueOf(c2246651CwZ.hashCode());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ3.append(numValueOf);
                        C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ3));
                        interfaceC1142460fps = c2246651CwZ;
                    }
                    this.LJFF = interfaceC1142460fps;
                }
            }
            InterfaceC1142460fps interfaceC1142460fps6 = this.LJFF;
            if (interfaceC1142460fps6 == null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("getPlayer fail, liveGiftPlayController is null, msgId=");
                sbLIZ4.append(this.LJIIIZ);
                C20441214yg.LJ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ4));
                return null;
            }
            interfaceC1142460fps6.LIZ(this.LJ);
            InterfaceC1142460fps interfaceC1142460fps7 = this.LJFF;
            if (interfaceC1142460fps7 != null) {
                interfaceC1142460fps7.LIZLLL(this.LIZJ);
            }
            InterfaceC1142460fps interfaceC1142460fps8 = this.LJFF;
            if (interfaceC1142460fps8 != null) {
                interfaceC1142460fps8.attachAlphaView(this.LIZIZ);
            }
            InterfaceC1142460fps interfaceC1142460fps9 = this.LJFF;
            if (interfaceC1142460fps9 != null) {
                interfaceC1142460fps9.LJIIJ(this.LIZLLL);
            }
            InterfaceC1142460fps interfaceC1142460fps10 = this.LJFF;
            if (interfaceC1142460fps10 != null) {
                interfaceC1142460fps10.LJI(c1141100fng);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getPlayer, player wired, msgId=");
            sbLIZ5.append(this.LJIIIZ);
            sbLIZ5.append(", playerHash=");
            InterfaceC1142460fps interfaceC1142460fps11 = this.LJFF;
            if (interfaceC1142460fps11 != null) {
                numValueOf3 = Integer.valueOf(interfaceC1142460fps11.hashCode());
            }
            sbLIZ5.append(numValueOf3);
            C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ5));
        } else {
            InterfaceC1142460fps interfaceC1142460fps12 = this.LJFF;
            if (interfaceC1142460fps12 != null) {
                interfaceC1142460fps12.LJIIJ(this.LIZLLL);
            }
            InterfaceC1142460fps interfaceC1142460fps13 = this.LJFF;
            if (interfaceC1142460fps13 != null) {
                interfaceC1142460fps13.LJI(c1141100fng);
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("getPlayer, player reused, msgId=");
            sbLIZ6.append(this.LJIIIZ);
            sbLIZ6.append(", playerHash=");
            InterfaceC1142460fps interfaceC1142460fps14 = this.LJFF;
            if (interfaceC1142460fps14 != null) {
                numValueOf3 = Integer.valueOf(interfaceC1142460fps14.hashCode());
            }
            sbLIZ6.append(numValueOf3);
            C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ6));
        }
        return this.LJFF;
    }

    public final void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startReleaseTimer() called, source = ");
        sbLIZ.append(str);
        sbLIZ.append(", ALIVE_DURATION=");
        long j = LJIIJ;
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        BPEAHandler bPEAHandler = C1141290fnz.LIZ;
        bPEAHandler.removeCallbacks(this.LJI);
        C786410Ut5.LJLIIL(j, bPEAHandler, this.LJI);
    }

    @Override // X.InterfaceC1141350fo5
    public final void LIZ(C1141100fng c1141100fng, AwS596S0100000_17 awS596S0100000_17) {
        long jLongValue;
        Boolean boolValueOf;
        long jLongValue2;
        System.currentTimeMillis();
        Long l = c1141100fng.LIZJ.LIZ;
        long jLongValue3 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LJIIIZ = jLongValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start enter (async), msgId=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", container=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(", hasLiveCore=");
        sbLIZ.append(this.LJIIIIZZ);
        C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ));
        C1141290fnz.LIZ.removeCallbacks(this.LJI);
        InterfaceC2247071CxF interfaceC2247071CxF = this.LIZLLL;
        if (interfaceC2247071CxF == null || interfaceC2247071CxF.LIZJ() != this.LJIIIIZZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("audio handler changed, force release, msgId=");
            sbLIZ2.append(this.LJIIIZ);
            C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ2));
            release();
        }
        InterfaceC2247071CxF interfaceC2247071CxF2 = this.LIZLLL;
        if (interfaceC2247071CxF2 != null) {
            boolValueOf = Boolean.valueOf(interfaceC2247071CxF2.LIZJ());
        } else {
            boolValueOf = null;
        }
        this.LJIIIIZZ = C500260Jjc.LJJJI(boolValueOf);
        InterfaceC1142460fps interfaceC1142460fpsLJ = LJ(c1141100fng);
        if (interfaceC1142460fpsLJ == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("start fail, player is null, msgId=");
            sbLIZ3.append(this.LJIIIZ);
            C20441214yg.LJIIIZ("GiftCtlManagerKt_gift_video_engine", C2188811AlT.LIZIZ(sbLIZ3));
            awS596S0100000_17.invoke(new C1141050fnb(-20, "play gift video fail, because player is null.", null));
            return;
        }
        interfaceC1142460fpsLJ.setVolume(c1141100fng.LIZ);
        C1141710fof c1141710fof = c1141100fng.LIZJ;
        c1141710fof.getClass();
        C0N7I c0n7i = C0N7I.PLAYCONTROLLER_START;
        Long l2 = c1141710fof.LIZ;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        C1141740foi.LIZ(c0n7i, jLongValue2, c1141710fof.LIZIZ);
        List<? extends C1141870fov> list = c1141100fng.LJFF;
        if (list != null) {
            Iterator<? extends C1141870fov> it2 = list.iterator();
            while (it2.hasNext()) {
                MaskSrc maskSrcLJI = LJI(it2.next());
                if (maskSrcLJI.getType() == 0) {
                    interfaceC1142460fpsLJ.LJFF(maskSrcLJI.getTextSize(), maskSrcLJI.getName(), maskSrcLJI.getText(), maskSrcLJI.getTextColor(), maskSrcLJI.isBold());
                } else if (maskSrcLJI.getType() == 1) {
                    interfaceC1142460fpsLJ.LJIIJJI(maskSrcLJI.getName(), maskSrcLJI.getBitmap(), 1.0f);
                }
            }
        }
        Long l3 = c1141100fng.LIZJ.LIZ;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        }
        List arrayList = c1141100fng.LJ;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        interfaceC1142460fpsLJ.LJII(arrayList, jLongValue3, new AwS383S0200000_17(this, awS596S0100000_17, 101));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fpt] */
    public C1142450fpr(Context context, C1141310fo1 c1141310fo1, final C1141300fo0 c1141300fo0, C1141410foB c1141410foB, InterfaceC2247071CxF interfaceC2247071CxF) {
        Boolean boolValueOf;
        this.LIZ = context;
        this.LIZIZ = c1141310fo1;
        this.LIZJ = c1141410foB;
        this.LIZLLL = interfaceC2247071CxF;
        if (interfaceC2247071CxF != null) {
            boolValueOf = Boolean.valueOf(interfaceC2247071CxF.LIZJ());
        } else {
            boolValueOf = null;
        }
        this.LJIIIIZZ = C500260Jjc.LJJJI(boolValueOf);
        this.LJ = new InterfaceC1142480fpu() { // from class: X.0fpt
            @Override // X.InterfaceC1142480fpu
            public final void LJII() {
                InterfaceC1142480fpu interfaceC1142480fpu = c1141300fo0;
                if (interfaceC1142480fpu != null) {
                    interfaceC1142480fpu.LJII();
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void onStart() {
                this.LJII = false;
                InterfaceC1142480fpu interfaceC1142480fpu = c1141300fo0;
                if (interfaceC1142480fpu != null) {
                    interfaceC1142480fpu.onStart();
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void onStop() {
                C1142450fpr c1142450fpr = this;
                c1142450fpr.LJII = true;
                c1142450fpr.LJFF("onStop");
                InterfaceC1142480fpu interfaceC1142480fpu = c1141300fo0;
                if (interfaceC1142480fpu != null) {
                    interfaceC1142480fpu.onStop();
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void LIZ(C1141460foG c1141460foG) {
                C1142450fpr c1142450fpr = this;
                c1142450fpr.LJII = true;
                c1142450fpr.LJFF("onEnd_suc");
                InterfaceC1142480fpu interfaceC1142480fpu = c1141300fo0;
                if (interfaceC1142480fpu != null) {
                    interfaceC1142480fpu.LIZ(c1141460foG);
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void LIZJ(C1141050fnb c1141050fnb) {
                C1142450fpr c1142450fpr = this;
                c1142450fpr.LJII = true;
                c1142450fpr.LJFF("onEnd_err");
                InterfaceC1142480fpu interfaceC1142480fpu = c1141300fo0;
                if (interfaceC1142480fpu != null) {
                    interfaceC1142480fpu.LIZJ(c1141050fnb);
                }
            }

            @Override // X.InterfaceC1142480fpu
            public final void LIZIZ(float f, float f2, float f3, float f4) {
                InterfaceC1142480fpu interfaceC1142480fpu = c1141300fo0;
                if (interfaceC1142480fpu != null) {
                    interfaceC1142480fpu.LIZIZ(f, f2, f3, f4);
                }
            }
        };
    }
}
