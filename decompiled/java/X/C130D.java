package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.130D, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C130D implements InterfaceC19935612zK {
    TYPE_DOUBLE(1),
    TYPE_FLOAT(2),
    TYPE_INT64(3),
    TYPE_UINT64(4),
    TYPE_INT32(5),
    TYPE_FIXED64(6),
    TYPE_FIXED32(7),
    TYPE_BOOL(8),
    TYPE_STRING(9),
    TYPE_GROUP(10),
    TYPE_MESSAGE(11),
    TYPE_BYTES(12),
    TYPE_UINT32(13),
    TYPE_ENUM(14),
    TYPE_SFIXED32(15),
    TYPE_SFIXED64(16),
    TYPE_SINT32(17),
    TYPE_SINT64(18);

    public static final C130E LLILLJJLI;
    public static final C130D[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v38, types: [X.130E] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "Type");
        LLILLJJLI = new InterfaceC19922212xA<C130D>() { // from class: X.130E
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C130D.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(C199412130o.getDescriptor().LJIJI(), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C130D> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C130D forNumber(int i) {
        switch (i) {
            case 1:
                return TYPE_DOUBLE;
            case 2:
                return TYPE_FLOAT;
            case 3:
                return TYPE_INT64;
            case 4:
                return TYPE_UINT64;
            case 5:
                return TYPE_INT32;
            case 6:
                return TYPE_FIXED64;
            case 7:
                return TYPE_FIXED32;
            case 8:
                return TYPE_BOOL;
            case BdTuring.TYPE_ECAF /* 9 */:
                return TYPE_STRING;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return TYPE_GROUP;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return TYPE_MESSAGE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return TYPE_BYTES;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return TYPE_UINT32;
            case 14:
                return TYPE_ENUM;
            case 15:
                return TYPE_SFIXED32;
            case 16:
                return TYPE_SFIXED64;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return TYPE_SINT32;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return TYPE_SINT64;
            default:
                return null;
        }
    }

    public static C130D valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C130D valueOf(String str) {
        return (C130D) C08FF.LIZ(C130D.class, str);
    }

    public static C130D valueOf(int i) {
        return forNumber(i);
    }

    C130D(int i) {
        this.LL = i;
    }
}
