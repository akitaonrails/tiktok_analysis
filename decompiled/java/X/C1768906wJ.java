package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.06wJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768906wJ implements InterfaceC863600XuI {
    public final int $t;

    public static final void LIZIZ$0(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$1(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$10(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$2(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$3(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$4(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$5(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$6(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$7(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    public static final void LIZIZ$8(C1768906wJ c1768906wJ, C0YMW c0ymw) {
    }

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
            case 3:
                LIZIZ$3(this, c0ymw);
                break;
            case 4:
                LIZIZ$4(this, c0ymw);
                break;
            case 5:
                LIZIZ$5(this, c0ymw);
                break;
            case 6:
                LIZIZ$6(this, c0ymw);
                break;
            case 7:
                LIZIZ$7(this, c0ymw);
                break;
            case 8:
                LIZIZ$8(this, c0ymw);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this, c0ymw);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZIZ$10(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
            case 4:
                onSuccess$4(this, obj);
                break;
            case 5:
                onSuccess$5(this, obj);
                break;
            case 6:
                onSuccess$6(this, obj);
                break;
            case 7:
                onSuccess$7(this, obj);
                break;
            case 8:
                onSuccess$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C21290718Tp.LIZIZ("AiChatGenerateService", "onSuccess: updateMessage");
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onSuccess$10(this, obj);
                break;
        }
    }

    public C1768906wJ(int i) {
        this.$t = i;
    }

    public static final void LIZIZ$9(C1768906wJ c1768906wJ, C0YMW c0ymw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailure: updateMessage ");
        sbLIZ.append(c0ymw);
        C21290718Tp.LIZ("AiChatGenerateService", C2188811AlT.LIZIZ(sbLIZ), null);
    }

    public static final void onSuccess$1(C1768906wJ c1768906wJ, Object obj) {
        new C1619080sEc(1).post();
    }

    public static final void onSuccess$2(C1768906wJ c1768906wJ, Object obj) {
        new C1619080sEc(1).post();
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$0(C1768906wJ c1768906wJ, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$10(C1768906wJ c1768906wJ, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$3(C1768906wJ c1768906wJ, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$4(C1768906wJ c1768906wJ, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$5(C1768906wJ c1768906wJ, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$6(C1768906wJ c1768906wJ, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$7(C1768906wJ c1768906wJ, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$8(C1768906wJ c1768906wJ, Object obj) {
    }
}
