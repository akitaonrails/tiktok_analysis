package X;

import android.os.Handler;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorApplogOpt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761830TuX implements InterfaceC761840TuY {
    public static AbstractC765580U1k LIZIZ;
    public static AbstractC768410UCh LIZJ;
    public static DataChannel LIZLLL;
    public static InterfaceC761710TuL LJI;
    public static InterfaceC761800TuU LJII;
    public static LiveEffect LJIIIIZZ;
    public static Function1<? super Boolean, Unit> LJIIIZ;
    public static boolean LJIIJ;
    public static final C01GW LJIIJJI;
    public static final C761830TuX LIZ = new C761830TuX();
    public static final Map<Long, Long> LJ = new LinkedHashMap();
    public static final Map<Long, C761820TuW> LJFF = new LinkedHashMap();

    static {
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(35);
        c1276840jKc.getClass();
        C1276840jKc.LJJJJI = aFwS199S0000000_12;
        LJIIJJI = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(36));
    }

    public static void LIZ() {
        AbstractC768410UCh abstractC768410UChLIZIZ;
        InterfaceC761860Tua echoHelper = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getEchoHelper();
        if (echoHelper != null && !echoHelper.LJ() && (abstractC768410UChLIZIZ = LIZIZ()) != null) {
            abstractC768410UChLIZIZ.enablePlayerMode(false, false);
        }
        LJIIJ = false;
        InterfaceC761800TuU interfaceC761800TuU = LJII;
        if (interfaceC761800TuU != null) {
            interfaceC761800TuU.Cx(false);
        }
    }

    public static AbstractC768410UCh LIZIZ() {
        if (LIZJ == null) {
            AbstractC765580U1k abstractC765580U1k = LIZIZ;
            LIZJ = abstractC765580U1k != null ? abstractC765580U1k.LLJJJ() : null;
        }
        return LIZJ;
    }

    public static final boolean LIZJ() {
        LiveEffect liveEffect = LJIIIIZZ;
        if (liveEffect != null) {
            return C500260Jjc.LJJIFFI(Boolean.valueOf(LIZLLL(liveEffect)));
        }
        return false;
    }

    public static final void LJ() {
        LiveEffect liveEffect = LJIIIIZZ;
        if (liveEffect != null && !LIZLLL(liveEffect)) {
            Map<Long, C761820TuW> map = LJFF;
            LiveEffect liveEffect2 = LJIIIIZZ;
            C761820TuW c761820TuW = (C761820TuW) ((LinkedHashMap) map).get(liveEffect2 != null ? Long.valueOf(liveEffect2.getEffectId()) : null);
            if (c761820TuW != null) {
                C768300UBw.LIZIZ(4L);
                C768300UBw.LJIIIZ(liveEffect, Long.valueOf(c761820TuW.LIZ), c761820TuW.LIZIZ);
                C768300UBw.LJIILIIL(4L);
            }
        }
        LJFF(LJIIIIZZ);
        LJIIIIZZ = null;
        LJI = null;
        LJII = null;
        ((Handler) LJIIJJI.getValue()).removeCallbacksAndMessages(null);
        LIZLLL = null;
        LIZIZ = null;
        LIZJ = null;
        ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
        C0U3P.LJ(C0U3Q.VOICE_EFFECT);
    }

    public static boolean LIZLLL(LiveEffect liveEffect) {
        try {
            String extra = liveEffect.getExtra();
            if (extra != null) {
                return JSONObjectProtectorUtils.getBoolean(new JSONObject(extra), "Original");
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LJFF(LiveEffect liveEffect) {
        AbstractC765580U1k abstractC765580U1k = LIZIZ;
        if (abstractC765580U1k != null) {
            abstractC765580U1k.setEnable(false);
        }
        AbstractC768410UCh abstractC768410UChLIZIZ = LIZIZ();
        if (abstractC768410UChLIZIZ != null) {
            abstractC768410UChLIZIZ.setEnable(false);
        }
        AbstractC768410UCh abstractC768410UChLIZIZ2 = LIZIZ();
        if (abstractC768410UChLIZIZ2 != null) {
            abstractC768410UChLIZIZ2.setAudioStrangeResource(null, null);
        }
        if (liveEffect == null) {
            return;
        }
        C761760TuQ.LIZ(liveEffect, LIZLLL);
        ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
        C0U3P.LJ(C0U3Q.VOICE_EFFECT);
    }

    public static void LJI(LiveEffect liveEffect, boolean z) {
        InterfaceC761710TuL interfaceC761710TuL = LJI;
        if (interfaceC761710TuL != null) {
            interfaceC761710TuL.zu(liveEffect, LIZLLL(liveEffect));
        }
        if (!z && Intrinsics.LJFF(LJIIIIZZ, liveEffect)) {
            return;
        }
        LiveEffect liveEffect2 = LJIIIIZZ;
        LJIIIIZZ = liveEffect;
        if (LIZLLL(liveEffect)) {
            C20441214yg.LIZIZ("EffectMonitor#voice", "isOrigin");
            if (liveEffect2 != null) {
                C761820TuW c761820TuW = (C761820TuW) ((LinkedHashMap) LJFF).get(Long.valueOf(liveEffect2.getEffectId()));
                if (c761820TuW != null) {
                    C768300UBw.LIZIZ(4L);
                    C768300UBw.LJIIIZ(liveEffect2, Long.valueOf(c761820TuW.LIZ), c761820TuW.LIZIZ);
                    C768300UBw.LJIILIIL(4L);
                }
            }
            LJFF(liveEffect2);
            Function1<? super Boolean, Unit> function1 = LJIIIZ;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        C20441214yg.LIZIZ("EffectMonitor#voice", "isNotOrigin");
        LiveEffect liveEffect3 = LJIIIIZZ;
        if (liveEffect3 != null) {
            liveEffect3.LJJLIL(true);
            if (LiveAnchorApplogOpt.INSTANCE.enable()) {
                if (liveEffect2 != null) {
                    C761760TuQ.LIZ(liveEffect2, LIZLLL);
                }
                ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
                C0U3Q c0u3q = C0U3Q.VOICE_EFFECT;
                if (!C0U3P.LIZIZ(c0u3q)) {
                    C0U3P.LIZLLL(c0u3q);
                }
                AbstractC765580U1k abstractC765580U1k = LIZIZ;
                if (abstractC765580U1k != null) {
                    abstractC765580U1k.setEnable(true);
                }
                AbstractC768410UCh abstractC768410UChLIZIZ = LIZIZ();
                if (abstractC768410UChLIZIZ != null) {
                    abstractC768410UChLIZIZ.setEnable(true);
                }
                AbstractC768410UCh abstractC768410UChLIZIZ2 = LIZIZ();
                if (abstractC768410UChLIZIZ2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(liveEffect3.getFilePath());
                    sbLIZ.append("/mdsp_preset.json");
                    abstractC768410UChLIZIZ2.setAudioStrangeResource(C2188811AlT.LIZIZ(sbLIZ), liveEffect3.getFilePath());
                }
                LJFF.put(Long.valueOf(liveEffect3.getEffectId()), new C761820TuW(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene()));
            } else {
                LJFF(liveEffect2);
                ConcurrentHashSet<C0U3Q> concurrentHashSet2 = C0U3P.LIZ;
                C0U3P.LIZLLL(C0U3Q.VOICE_EFFECT);
                AbstractC765580U1k abstractC765580U1k2 = LIZIZ;
                if (abstractC765580U1k2 != null) {
                    abstractC765580U1k2.setEnable(true);
                }
                AbstractC768410UCh abstractC768410UChLIZIZ3 = LIZIZ();
                if (abstractC768410UChLIZIZ3 != null) {
                    abstractC768410UChLIZIZ3.setEnable(true);
                }
                AbstractC768410UCh abstractC768410UChLIZIZ4 = LIZIZ();
                if (abstractC768410UChLIZIZ4 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(liveEffect3.getFilePath());
                    sbLIZ2.append("/mdsp_preset.json");
                    abstractC768410UChLIZIZ4.setAudioStrangeResource(C2188811AlT.LIZIZ(sbLIZ2), liveEffect3.getFilePath());
                }
                LJFF.put(Long.valueOf(liveEffect3.getEffectId()), new C761820TuW(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene()));
            }
            Function1<? super Boolean, Unit> function12 = LJIIIZ;
            if (function12 != null) {
                function12.invoke(Boolean.TRUE);
            }
        }
    }
}
