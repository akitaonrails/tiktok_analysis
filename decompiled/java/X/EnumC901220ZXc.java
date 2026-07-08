package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0ZXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public enum EnumC901220ZXc implements WireEnum {
    MemberStatusUnknown(0),
    MemberStatusStartCall(1),
    MemberStatusPending(2),
    MemberStatusRinging(3),
    MemberStatusOnCall(4),
    MemberStatusPaused(5),
    MemberStatusInterrupted(6),
    MemberStatusDropped(7),
    MemberStatusNoAnswer(8),
    MemberStatusMissed(9),
    MemberStatusCancelled(10),
    MemberStatusBeCancelled(11),
    MemberStatusRejected(12),
    MemberStatusBeRejected(13),
    MemberStatusEnded(14),
    MemberStatusFailed(15);

    public static final ProtoAdapter<EnumC901220ZXc> ADAPTER = new EnumAdapter<EnumC901220ZXc>() { // from class: X.0ZXd
        @Override // com.squareup.wire.EnumAdapter
        public final WireEnum LIZ(int i) {
            return EnumC901220ZXc.fromValue(i);
        }
    };
    public final int LL;

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC901220ZXc fromValue(int i) {
        switch (i) {
            case 0:
                return MemberStatusUnknown;
            case 1:
                return MemberStatusStartCall;
            case 2:
                return MemberStatusPending;
            case 3:
                return MemberStatusRinging;
            case 4:
                return MemberStatusOnCall;
            case 5:
                return MemberStatusPaused;
            case 6:
                return MemberStatusInterrupted;
            case 7:
                return MemberStatusDropped;
            case 8:
                return MemberStatusNoAnswer;
            case BdTuring.TYPE_ECAF /* 9 */:
                return MemberStatusMissed;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return MemberStatusCancelled;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return MemberStatusBeCancelled;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return MemberStatusRejected;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return MemberStatusBeRejected;
            case 14:
                return MemberStatusEnded;
            case 15:
                return MemberStatusFailed;
            default:
                return null;
        }
    }

    public static EnumC901220ZXc valueOf(String str) {
        return (EnumC901220ZXc) C08FF.LIZ(EnumC901220ZXc.class, str);
    }

    EnumC901220ZXc(int i) {
        this.LL = i;
    }
}
