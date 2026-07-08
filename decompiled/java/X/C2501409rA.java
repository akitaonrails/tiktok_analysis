package X;

import android.app.job.JobParameters;
import com.aweme.storage.CompatJobService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.effect.EffectCompatJobService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09rA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501409rA implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C2501409rA c2501409rA, C15O7 c15o7) {
        Function0 function0;
        C1C7U.LIZ("FileCopyUtilsKt@2056.copyVideoToMediaLibrary$2");
        try {
            if (((C013C) c2501409rA.l0).element && (function0 = (Function0) c2501409rA.l1) != null) {
                function0.invoke();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "open share video failed");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FileCopyUtilsKt@2056.copyVideoToMediaLibrary$2");
        return unit;
    }

    public static final Object then$1(C2501409rA c2501409rA, C15O7 c15o7) {
        C1C7U.LIZ("LocalVideoLegalChecker@3c01.getVideoFileInfo$2");
        ((Function2) c2501409rA.l0).invoke(c15o7.LJIIL(), Integer.valueOf(((C118300cf) c2501409rA.l1).element));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalVideoLegalChecker@3c01.getVideoFileInfo$2");
        return unit;
    }

    public static final Object then$2(C2501409rA c2501409rA, C15O7 c15o7) {
        C1C7U.LIZ("CompatJobService@3e1c.onStartJob$1");
        C2426709f7.LIZ = false;
        C2426709f7.LIZIZ = false;
        C2426709f7.LIZJ = false;
        ((CompatJobService) c2501409rA.l1).jobFinished((JobParameters) c2501409rA.l0, false);
        CompatJobService.LL = false;
        C1C7U.LIZIZ("CompatJobService@3e1c.onStartJob$1");
        return null;
    }

    public static final Object then$3(C2501409rA c2501409rA, C15O7 c15o7) {
        EffectCompatJobService effectCompatJobService = (EffectCompatJobService) c2501409rA.l0;
        JobParameters jobParameters = (JobParameters) c2501409rA.l1;
        effectCompatJobService.getClass();
        C1C7U.LIZ("EffectCompatJobService@67d4.onStartJob$2L");
        InterfaceC1594010raB interfaceC1594010raB = (InterfaceC1594010raB) C2419309dv.LIZ(effectCompatJobService, InterfaceC1594010raB.class);
        interfaceC1594010raB.LIZJ(System.currentTimeMillis());
        interfaceC1594010raB.LIZ();
        effectCompatJobService.jobFinished(jobParameters, false);
        EffectCompatJobService.LL = false;
        C1C7U.LIZIZ("EffectCompatJobService@67d4.onStartJob$2L");
        return null;
    }

    public static final Object then$4(C2501409rA c2501409rA, C15O7 c15o7) {
        C1C7U.LIZ("FileAdapterUtils@6392.isMediaUriExist$4");
        ((C013C) c2501409rA.l0).element = true;
        ((InterfaceC2286808xe) c2501409rA.l1).LIZ(Boolean.valueOf(Intrinsics.LJFF(c15o7.LJIIL(), Boolean.TRUE)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FileAdapterUtils@6392.isMediaUriExist$4");
        return unit;
    }

    public C2501409rA(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
