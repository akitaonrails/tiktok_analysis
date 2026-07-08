package X;

import android.util.Log;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.09rL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2502509rL extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$6(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) throws Throwable {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                C1AF0.LJFF(th, "IMMessageListFMPTrackerImpl");
                break;
            case 3:
                LJJ$3(this, coroutineContext, th);
                break;
            case 4:
                LJJ$4(this, coroutineContext, th);
                break;
            case 5:
                LJJ$5(this, coroutineContext, th);
                break;
            case 6:
                LJJ$6(this, coroutineContext, th);
                break;
            case 7:
                LJJ$7(this, coroutineContext, th);
                break;
            case 8:
                LJJ$8(this, coroutineContext, th);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJ$9(this, coroutineContext, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJ$10(this, coroutineContext, th);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJ$11(this, coroutineContext, th);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJ$12(this, coroutineContext, th);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                th.getMessage();
                break;
            case 14:
                LJJ$14(this, coroutineContext, th);
                break;
            case 15:
                LJJ$15(this, coroutineContext, th);
                break;
            case 16:
                LJJ$16(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2502509rL(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2502509rL(C2185208hG c2185208hG, String str, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task run error: ");
        sbLIZ.append(th.getMessage());
        sbLIZ.append("  ");
        sbLIZ.append(Unit.LIZ);
        C201955140j.LJFF("EPTrackFramePreLoader", C2188811AlT.LIZIZ(sbLIZ));
        C1AF0.LJFF(th, "EditPreviewComponent-loader-fail");
    }

    public static final void LJJ$1(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Thread[");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append("], exception: ");
        sbLIZ.append(Log.getStackTraceString(th));
        C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$10(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("publishScope: uncaught coroutine exception: ");
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(' ');
        sbLIZ.append(th.getMessage());
        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$11(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobPublishInternal on background failed: ");
        sbLIZ.append(th.getMessage());
        C201955140j.LJIIJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public static final void LJJ$12(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        Npth.reportBizException("explore", th, "preload cache fail", C2097908Jt.LIZJ(new Pair("cache_preload", "fail")));
    }

    public static final void LJJ$14(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        C2153908cD.LIZ.getClass();
        C2153908cD.LIZJ(6, "fetch hot cache data", "explore_hot_cache_data_manager");
        Npth.reportBizException("explore", th, "preload hot cache fail", C2097908Jt.LIZJ(new Pair("explore_hot_cache", "fail")));
    }

    public static final void LJJ$15(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        Npth.reportBizException("explore", th, "media hot cache fail", C2097908Jt.LIZJ(new Pair("explore_hot_cache_media", "fail")));
    }

    public static final void LJJ$16(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        if (C2344809Gs.LIZ) {
            C2344809Gs.LJI(th);
        }
    }

    public static final void LJJ$3(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinMediaViewModel scope: uncaught ");
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(th.getMessage());
        C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$4(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        C1632470saD c1632470saD = C1632470saD.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Throwable: ");
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(' ');
        sbLIZ.append(th.getMessage());
        C201955140j.LJIILL(c1632470saD, "EffectPrefetcherComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$5(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        C1632470saD c1632470saD = C1632470saD.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Throwable: ");
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(' ');
        sbLIZ.append(th.getMessage());
        C201955140j.LJIILL(c1632470saD, "EffectPrefetcherComponentV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$7(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load friend list failed, reason: ");
        sbLIZ.append(Log.getStackTraceString(th));
        C201955140j.LIZIZ("SharedAR", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$8(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) throws Throwable {
        C1AF0.LJ(th);
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (!c2213981Bky.isDebug() && !c2213981Bky.isRegressionTest() && !Intrinsics.LJFF(c2213981Bky.getChannel(), "local_test")) {
        } else {
            throw th;
        }
    }

    public static final void LJJ$9(C2502509rL c2502509rL, CoroutineContext coroutineContext, Throwable th) {
        if (!(th instanceof CancellationException) && C2344809Gs.LIZ) {
            C2344809Gs.LJI(th);
        }
    }
}
