package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.06wU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1770006wU extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;

    public static final void LJJ$0(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$1(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$10(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$16(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$17(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$2(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$3(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$4(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$5(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    public static final void LJJ$6(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
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
                C1AF0.LJFF(th, "GroupChatNewMemberObserver: New member message error");
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
                C1AF0.LJFF(th, "ConvStreamingSessionTracker");
                break;
            case 15:
                C2344809Gs.LJI(th);
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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LJJ$20(this, coroutineContext, th);
                break;
            case 21:
                LJJ$21(this, coroutineContext, th);
                break;
            case 22:
                LJJ$22(this, coroutineContext, th);
                break;
            case 23:
                LJJ$23(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770006wU(C2185208hG c2185208hG, int i) {
        super(c2185208hG);
        this.$t = i;
    }

    public static final void LJJ$11(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakInviteUtil error ");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(' ');
        sbLIZ.append(C13SZ.LIZIZ(th));
        C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$12(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchUserInfo error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$13(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchUserInfo error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$18(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        C1734106qh.LIZ.LIZIZ();
    }

    public static final void LJJ$19(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetDataSource error ");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(' ');
        sbLIZ.append(C13SZ.LIZIZ(th));
        C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$20(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoroutineExceptionHandler: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$21(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        C201955140j.LJIIJ(C0MAY.LIZIZ, "createDraftCoroutineScope handleException", th);
    }

    public static final void LJJ$22(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchUserInfo error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$23(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchUserInfo error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJ$7(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        C1AF0.LJ(th);
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardCeleEnv exception: ");
        sbLIZ.append(th);
        C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJJ$8(C1770006wU c1770006wU, CoroutineContext coroutineContext, Throwable th) {
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakPetDataSource error ");
        sbLIZ.append(th.getMessage());
        sbLIZ.append(' ');
        sbLIZ.append(C13SZ.LIZIZ(th));
        C1590806Ks.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}
