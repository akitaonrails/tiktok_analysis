package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchDegradationDeviceScore;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLowEndOptimizationSettings;
import com.bytedance.android.livesdk.livesetting.performance.BroadcastFunctionMask2Setting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.android.performanhtune.IPTFService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS319S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20483515Dd {
    public static long LIZJ;
    public static boolean LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static float LJI;
    public static InterfaceC974780bTQ LIZ = new InterfaceC974780bTQ() { // from class: X.15Da
        @Override // X.InterfaceC974780bTQ
        public final long LIZ() {
            return 0L;
        }

        @Override // X.InterfaceC974780bTQ
        public final int LIZIZ() {
            return 12;
        }

        @Override // X.InterfaceC974780bTQ
        public final boolean LIZLLL() {
            return true;
        }

        @Override // X.InterfaceC974780bTQ
        public final boolean LJ() {
            return false;
        }

        @Override // X.InterfaceC974780bTQ
        public final long LJI() {
            return LiveMatchLowEndOptimizationSettings.INSTANCE.getHammerNormalInterval();
        }

        @Override // X.InterfaceC974780bTQ
        public final void LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z, boolean z2) {
            ISmokeAnimationAbility iSmokeAnimationAbility;
            ISmokeAnimationAbility iSmokeAnimationAbility2;
            C20441214yg.LJ("MatchItemSmoke", "play power up smoke animation");
            if (z) {
                if (interfaceC665370Q7z != null && (iSmokeAnimationAbility2 = (ISmokeAnimationAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISmokeAnimationAbility.class, null)) != null) {
                    iSmokeAnimationAbility2.sh2(z2);
                    return;
                }
                return;
            }
            if (interfaceC665370Q7z == null || (iSmokeAnimationAbility = (ISmokeAnimationAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISmokeAnimationAbility.class, null)) == null) {
                return;
            }
            iSmokeAnimationAbility.WK1(z2);
        }

        @Override // X.InterfaceC974780bTQ
        public final void LJFF(C1324720kZq c1324720kZq, String str, String str2) {
            Object tag;
            if (c1324720kZq != null) {
                tag = c1324720kZq.getTag(R.id.yv7);
            } else {
                tag = null;
            }
            if (Intrinsics.LJFF(tag, str2)) {
                return;
            }
            if (c1324720kZq != null) {
                c1324720kZq.setTag(R.id.yv7, str2);
            }
            C1143680frq.LIZLLL(c1324720kZq, str, str2);
        }
    };
    public static float LIZIZ = 100.0f;
    public static final AFwS276S0000000_31 LJII = AFwS276S0000000_31.get$arr$(281);
    public static final List<InterfaceC20483715Df> LJIIIIZZ = new ArrayList();
    public static String LJIIIZ = EnumC775860Uc4.NONE.getLevelName();

    public static boolean LIZJ() {
        float f = LJI;
        if (f > 0.0f) {
            return f >= LiveMatchDegradationDeviceScore.INSTANCE.getHighEndDeviceLowestScore();
        }
        InterfaceC1101100elA interfaceC1101100elAOK1 = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).OK1();
        LJI = interfaceC1101100elAOK1.LJ();
        return interfaceC1101100elAOK1.LJ() >= LiveMatchDegradationDeviceScore.INSTANCE.getHighEndDeviceLowestScore();
    }

    public static void LIZ(InterfaceC20483715Df interfaceC20483715Df) {
        ArrayList arrayList = (ArrayList) LJIIIIZZ;
        if (!arrayList.contains(interfaceC20483715Df)) {
            arrayList.add(interfaceC20483715Df);
        }
    }

    public static void LIZLLL(boolean z) {
        if (z && BroadcastFunctionMask2Setting.INSTANCE.value() == 2) {
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C09AE c09aeRemove = C775900Uc8.LJFF.remove(EnumC775910Uc9.LINK_MIC.getModuleName());
            if (c09aeRemove != null) {
                c09aeRemove.LIZIZ(null);
                return;
            }
            return;
        }
        ((ArrayList) LJIIIIZZ).clear();
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdaptLiveMatchDowngrade()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.LIVE_MATCH_DOWNGRADE);
        } else {
            ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIIIZZ(LJII);
        }
    }

    public static void LJ(boolean z) {
        if (z) {
            C2252331DDr c2252331DDr = C775900Uc8.LIZ;
            C775900Uc8.LIZJ(EnumC2005307tL.PK_ANIMATION_DEGRADE, true, AFwS319S0000000_31.get$arr$(31), 4);
            return;
        }
        LiveInnerDowngradeAdaptExp liveInnerDowngradeAdaptExp = LiveInnerDowngradeAdaptExp.INSTANCE;
        if (liveInnerDowngradeAdaptExp.getExpValue().getAdaptLiveMatchDowngrade()) {
            if (!liveInnerDowngradeAdaptExp.getExpValue().getAdaptLiveMatchDowngrade()) {
                return;
            }
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.LIVE_MATCH_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.15De
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    int iIntValue = ((Number) c0is4.LIZ).intValue();
                    if (System.currentTimeMillis() - C973890bRz.LIZ.LJIJJLI < Mp4ScreenVideoLoadTimeout.CONTROL || !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt() || C20483515Dd.LIZJ()) {
                        return;
                    }
                    InterfaceC974780bTQ interfaceC974780bTQ = C20483515Dd.LIZ;
                    boolean z2 = interfaceC974780bTQ instanceof C20483215Da;
                    boolean z3 = !z2;
                    if (iIntValue != 1) {
                        if (iIntValue == 2 && !(interfaceC974780bTQ instanceof C15DX)) {
                            C20483515Dd.LIZ = new C15DX();
                            Iterator it2 = ((ArrayList) C20483515Dd.LJIIIIZZ).iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC20483715Df) it2.next()).dx();
                            }
                            C20483515Dd.LJFF = 6;
                            if (!z3) {
                                C20483515Dd.LIZJ = C974520bT0.LIZ();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (z2) {
                        C20483515Dd.LIZ = new C15DZ();
                        C20483515Dd.LJ = 6;
                        C20483515Dd.LIZLLL = true;
                        if (!z3) {
                            C20483515Dd.LIZJ = C974520bT0.LIZ();
                        }
                    }
                }
            });
            return;
        }
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIJJI(LJII);
    }

    public static void LIZIZ(final float f, final float f2, final float f3, final int i) {
        final boolean z = !(LIZ instanceof C20483215Da);
        C473410IhP.LIZIZ(new Runnable() { // from class: X.15Dc
            public final void LIZ() {
                float f4 = f;
                if (f4 >= f2 || (C20483515Dd.LIZ instanceof C15DX)) {
                    if (f4 >= f3 || !(C20483515Dd.LIZ instanceof C20483215Da)) {
                        return;
                    }
                    C20483515Dd.LIZ = new C15DZ();
                    C20483515Dd.LJ = i;
                    C20483515Dd.LIZLLL = true;
                    if (z) {
                        return;
                    }
                    C20483515Dd.LIZJ = C974520bT0.LIZ();
                    return;
                }
                C20483515Dd.LIZ = new C15DX();
                Iterator it2 = ((ArrayList) C20483515Dd.LJIIIIZZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC20483715Df) it2.next()).dx();
                }
                InterfaceC974780bTQ interfaceC974780bTQ = C20483515Dd.LIZ;
                C20483515Dd.LJFF = i;
                if (z) {
                    return;
                }
                C20483515Dd.LIZJ = C974520bT0.LIZ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MatchDowngradeManager@dadc.detect$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MatchDowngradeManager@dadc.detect$1");
            }
        });
    }
}
