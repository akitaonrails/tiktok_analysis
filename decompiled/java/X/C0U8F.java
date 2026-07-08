package X;

import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.performance.PerformanceManagerImpl;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U8F, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U8F {
    public static final C0U8F LIZ = new C0U8F();
    public static final ConcurrentHashMap<String, List<LiveEffect>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, LiveEffect> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashSet<String> LIZLLL = new ConcurrentHashSet<>();
    public static int LJ;

    public static void LIZIZ(LiveEffect liveEffect) {
        C0U78 c0u78LIZ = C0UA1.LIZ();
        String str = C0UD4.LIZIZ;
        LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLL(c0u78LIZ.qr(str));
        if (liveEffect2 == null) {
            return;
        }
        if (Intrinsics.LJFF(liveEffect2.getResourceId(), liveEffect.getResourceId()) && !Intrinsics.LJFF(liveEffect2.Wp(), liveEffect.Wp())) {
            LIZLLL.add(liveEffect.getResourceId());
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJIIJ(liveEffect, false);
            PerformanceManagerImpl performanceManagerImplRs = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs();
            String resourceId = liveEffect.getResourceId();
            String strWp = liveEffect.Wp();
            performanceManagerImplRs.getClass();
            C405701hv.LJIIIZ = resourceId;
            C405701hv.LJIIIIZZ = strWp;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyAdaptedEffect: ");
            sbLIZ.append(liveEffect.getEffectId());
            sbLIZ.append(' ');
            sbLIZ.append(liveEffect.Wp());
            sbLIZ.append(", currentEffect: ");
            sbLIZ.append(liveEffect2.getEffectId());
            sbLIZ.append(' ');
            sbLIZ.append(liveEffect2.Wp());
            C20441214yg.LIZIZ("StickerEffectDynamicAdaptiveManager", C2188811AlT.LIZIZ(sbLIZ));
            C0UA1.LIZ().LJIIIIZZ(liveEffect, str);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("currentResourceId: ");
        sbLIZ2.append(liveEffect2.getResourceId());
        sbLIZ2.append(", adaptedResourceId: ");
        sbLIZ2.append(liveEffect.getResourceId());
        sbLIZ2.append(", currentGradeKey: ");
        sbLIZ2.append(liveEffect2.Wp());
        sbLIZ2.append(", adaptedGradeKey: ");
        sbLIZ2.append(liveEffect.Wp());
        C20441214yg.LIZIZ("StickerEffectDynamicAdaptiveManager", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.livesdkapi.depend.model.LiveEffect LIZJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r7) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8F.LIZJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect):com.bytedance.android.livesdkapi.depend.model.LiveEffect");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r1 = "loki_astc_";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(int r9, com.bytedance.android.livesdkapi.depend.model.LiveEffect r10) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8F.LIZ(int, com.bytedance.android.livesdkapi.depend.model.LiveEffect):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.bytedance.android.livesdkapi.depend.model.LiveEffect r14, X.C0U8C r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U8F.LIZLLL(com.bytedance.android.livesdkapi.depend.model.LiveEffect, X.0U8C, X.05Vn):java.lang.Object");
    }
}
