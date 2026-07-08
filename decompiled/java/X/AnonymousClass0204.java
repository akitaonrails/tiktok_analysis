package X;

import android.util.Log;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0204, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0204 extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$2(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
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
                LJJ$2(this, coroutineContext, th);
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
                LJJ$13(this, coroutineContext, th);
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
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LJJ$17(this, coroutineContext, th);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LJJ$18(this, coroutineContext, th);
                break;
            case 19:
                LJJ$19(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0204(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$0(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        Npth.reportBizException("photomode", th, "ab-preload fail", C2097908Jt.LIZJ(new Pair("ab_preload", "fail")));
    }

    public static final void LJJ$1(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TaskExecutor#execute handler catch: ");
        sbLIZ.append(th);
        C20441214yg.LJ("AutoAdaptiveCenter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$10(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("relation kv coroutine error: ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$11(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadLottieAndUpdateImages ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJIIIZ("FastGiftConfirmDialog", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$12(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        new C5182020e(th, 145);
    }

    public static final void LJJ$13(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preCheckPublicGroupCreation error ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$14(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        if (th instanceof C386801es) {
            C392601fo.LJI(new C392701fp((C386801es) th));
        } else {
            if (th instanceof CancellationException) {
                return;
            }
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            C392601fo.LJI(new C392701fp(new C386801es(-999, message)));
        }
    }

    public static final void LJJ$15(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("batchQueryIMUserList error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$16(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearRecentMentions error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$17(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessageSent error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$18(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preGetAnchorShareList error: ");
        sbLIZ.append(th);
        C20441214yg.LJ("HostShareHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$19(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uploadAvatar failed, exception = ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$3(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconPrefetchManager: ");
        sbLIZ.append(th);
        sbLIZ.append(" swallowed");
        C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$4(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendSeiField failed: ");
        sbLIZ.append(Log.getStackTraceString(th));
        C20441214yg.LJ("LiveBoardsEffectHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$5(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        C19319410i8 c19319410i8 = C380901dv.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Gate] uncaught in ioScope: ");
        sbLIZ.append(th);
        c19319410i8.LJ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$6(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error ");
        sbLIZ.append(th.getMessage());
        C20441214yg.LJIIIZ("SponsoredComboProgressView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$7(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportEnterB2CChatToServer error, ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$8(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reportLeaveB2CChatToServer error, ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$9(AnonymousClass0204 anonymousClass0204, CoroutineContext coroutineContext, Throwable th) throws Throwable {
        if (th instanceof IllegalStateException) {
            C1AF0.LJFF(th, "imAssemIllegalStateExceptionHandler");
            return;
        }
        throw th;
    }
}
