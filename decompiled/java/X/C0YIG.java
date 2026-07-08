package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEPRECATED_INVALID_TOKEN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0YIG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIG implements WireEnum {
    public static final ProtoAdapter<C0YIG> ADAPTER;
    public static final C0YIG BAD_REQUEST;
    public static final C0YIG CALLBACK_DENY;
    public static final C0YIG CONVERSATION_NOT_FOUND;
    public static final C0YIG CONV_DISSOLVED;
    public static final C0YIG CONV_NOT_FOUND;
    public static final C0YIG DEGRADATION_ERROR;
    public static final C0YIG DEPRECATED_INVALID_TOKEN;
    public static final C0YIG DEVICE_NOT_BIND;
    public static final C0YIG EXPIRED_TOKEN;
    public static final C0YIG INTERNAL_ERROR;
    public static final C0YIG INVALID_CMD;
    public static final C0YIG INVALID_REQUEST;
    public static final C0YIG INVALID_TICKET;
    public static final C0YIG INVALID_TOKEN;
    public static final /* synthetic */ C0YIG[] LLILLJJLI;
    public static final C0YIG MESSAGE_ILLEGAL;
    public static final C0YIG MESSAGE_TARGET_CONVERSATION_NOT_EXIST;
    public static final C0YIG MSG_NOT_FOUND;
    public static final C0YIG OK;
    public static final C0YIG PREASSIGNED_ID_NOT_FOUND;
    public static final C0YIG RECALL_TIMEOUT;
    public static final C0YIG SERVER_ERR;
    public static final C0YIG STATUS_CODE_FLOW_BLOCK;
    public static final C0YIG STATUS_CODE_REPEATED_REQUEST;
    public static final C0YIG STATUS_CODE_TIME_LIMIT_EXCEEDED;
    public static final C0YIG TOUCH_LIMIT;
    public static final C0YIG USER_BANNED_TO_POST;
    public static final C0YIG USER_BIZ_ROLE_DENY;
    public static final C0YIG USER_FORBIDDEN;
    public static final C0YIG USER_ILLEGAL;
    public static final C0YIG USER_NOT_FRIENDS;
    public static final C0YIG USER_NOT_IN_GROUP;
    public static final C0YIG USER_SILENCE;
    public final int LL;
    public final Boolean deprecated;

    static {
        C0YIG c0yig = new C0YIG(0, 0, null, "OK");
        OK = c0yig;
        Boolean bool = Boolean.TRUE;
        C0YIG c0yig2 = new C0YIG(1, 1, bool, "DEPRECATED_INVALID_TOKEN");
        DEPRECATED_INVALID_TOKEN = c0yig2;
        C0YIG c0yig3 = new C0YIG(2, 2, null, "INVALID_TICKET");
        INVALID_TICKET = c0yig3;
        C0YIG c0yig4 = new C0YIG(3, 3, bool, "CONVERSATION_NOT_FOUND");
        CONVERSATION_NOT_FOUND = c0yig4;
        C0YIG c0yig5 = new C0YIG(4, 4, null, "INVALID_REQUEST");
        INVALID_REQUEST = c0yig5;
        C0YIG c0yig6 = new C0YIG(5, 5, null, "INVALID_CMD");
        INVALID_CMD = c0yig6;
        C0YIG c0yig7 = new C0YIG(6, 6, null, "SERVER_ERR");
        SERVER_ERR = c0yig7;
        C0YIG c0yig8 = new C0YIG(7, 7, bool, "DEVICE_NOT_BIND");
        DEVICE_NOT_BIND = c0yig8;
        C0YIG c0yig9 = new C0YIG(8, 8, bool, "MESSAGE_ILLEGAL");
        MESSAGE_ILLEGAL = c0yig9;
        C0YIG c0yig10 = new C0YIG(9, 9, bool, "USER_ILLEGAL");
        USER_ILLEGAL = c0yig10;
        C0YIG c0yig11 = new C0YIG(10, 10, bool, "USER_NOT_FRIENDS");
        USER_NOT_FRIENDS = c0yig11;
        C0YIG c0yig12 = new C0YIG(11, 11, null, "USER_FORBIDDEN");
        USER_FORBIDDEN = c0yig12;
        C0YIG c0yig13 = new C0YIG(12, 12, bool, "USER_SILENCE");
        USER_SILENCE = c0yig13;
        C0YIG c0yig14 = new C0YIG(13, 13, bool, "USER_NOT_IN_GROUP");
        USER_NOT_IN_GROUP = c0yig14;
        C0YIG c0yig15 = new C0YIG(14, 14, bool, "USER_BANNED_TO_POST");
        USER_BANNED_TO_POST = c0yig15;
        C0YIG c0yig16 = new C0YIG(15, 15, null, "MESSAGE_TARGET_CONVERSATION_NOT_EXIST");
        MESSAGE_TARGET_CONVERSATION_NOT_EXIST = c0yig16;
        C0YIG c0yig17 = new C0YIG(16, 16, null, "DEGRADATION_ERROR");
        DEGRADATION_ERROR = c0yig17;
        C0YIG c0yig18 = new C0YIG(17, 17, bool, "RECALL_TIMEOUT");
        RECALL_TIMEOUT = c0yig18;
        C0YIG c0yig19 = new C0YIG(18, 18, bool, "TOUCH_LIMIT");
        TOUCH_LIMIT = c0yig19;
        C0YIG c0yig20 = new C0YIG(19, 19, bool, "CALLBACK_DENY");
        CALLBACK_DENY = c0yig20;
        C0YIG c0yig21 = new C0YIG(20, 100, null, "EXPIRED_TOKEN");
        EXPIRED_TOKEN = c0yig21;
        C0YIG c0yig22 = new C0YIG(21, 500, null, "INTERNAL_ERROR");
        INTERNAL_ERROR = c0yig22;
        C0YIG c0yig23 = new C0YIG(22, 100017, null, "CONV_NOT_FOUND");
        CONV_NOT_FOUND = c0yig23;
        C0YIG c0yig24 = new C0YIG(23, 100021, null, "CONV_DISSOLVED");
        CONV_DISSOLVED = c0yig24;
        C0YIG c0yig25 = new C0YIG(24, 100022, null, "MSG_NOT_FOUND");
        MSG_NOT_FOUND = c0yig25;
        C0YIG c0yig26 = new C0YIG(25, 101004, null, "PREASSIGNED_ID_NOT_FOUND");
        PREASSIGNED_ID_NOT_FOUND = c0yig26;
        C0YIG c0yig27 = new C0YIG(26, 200001, null, "BAD_REQUEST");
        BAD_REQUEST = c0yig27;
        C0YIG c0yig28 = new C0YIG(27, 200005, null, "INVALID_TOKEN");
        INVALID_TOKEN = c0yig28;
        C0YIG c0yig29 = new C0YIG(28, 200008, null, "STATUS_CODE_REPEATED_REQUEST");
        STATUS_CODE_REPEATED_REQUEST = c0yig29;
        C0YIG c0yig30 = new C0YIG(29, 200009, null, "STATUS_CODE_TIME_LIMIT_EXCEEDED");
        STATUS_CODE_TIME_LIMIT_EXCEEDED = c0yig30;
        C0YIG c0yig31 = new C0YIG(30, 200010, null, "STATUS_CODE_FLOW_BLOCK");
        STATUS_CODE_FLOW_BLOCK = c0yig31;
        C0YIG c0yig32 = new C0YIG(31, 300001, null, "USER_BIZ_ROLE_DENY");
        USER_BIZ_ROLE_DENY = c0yig32;
        LLILLJJLI = new C0YIG[]{c0yig, c0yig2, c0yig3, c0yig4, c0yig5, c0yig6, c0yig7, c0yig8, c0yig9, c0yig10, c0yig11, c0yig12, c0yig13, c0yig14, c0yig15, c0yig16, c0yig17, c0yig18, c0yig19, c0yig20, c0yig21, c0yig22, c0yig23, c0yig24, c0yig25, c0yig26, c0yig27, c0yig28, c0yig29, c0yig30, c0yig31, c0yig32};
        ADAPTER = new EnumAdapter<C0YIG>() { // from class: X.0YIT
            @Override // com.squareup.wire.EnumAdapter
            public final WireEnum LIZ(int i) {
                return C0YIG.fromValue(i);
            }
        };
    }

    public static C0YIG[] values() {
        return (C0YIG[]) LLILLJJLI.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YIG fromValue(int i) {
        switch (i) {
            case 0:
                return OK;
            case 1:
                return DEPRECATED_INVALID_TOKEN;
            case 2:
                return INVALID_TICKET;
            case 3:
                return CONVERSATION_NOT_FOUND;
            case 4:
                return INVALID_REQUEST;
            case 5:
                return INVALID_CMD;
            case 6:
                return SERVER_ERR;
            case 7:
                return DEVICE_NOT_BIND;
            case 8:
                return MESSAGE_ILLEGAL;
            case BdTuring.TYPE_ECAF /* 9 */:
                return USER_ILLEGAL;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return USER_NOT_FRIENDS;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return USER_FORBIDDEN;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return USER_SILENCE;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return USER_NOT_IN_GROUP;
            case 14:
                return USER_BANNED_TO_POST;
            case 15:
                return MESSAGE_TARGET_CONVERSATION_NOT_EXIST;
            case 16:
                return DEGRADATION_ERROR;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return RECALL_TIMEOUT;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return TOUCH_LIMIT;
            case 19:
                return CALLBACK_DENY;
            default:
                switch (i) {
                    case 100:
                        return EXPIRED_TOKEN;
                    case 500:
                        return INTERNAL_ERROR;
                    case 100017:
                        return CONV_NOT_FOUND;
                    case 101004:
                        return PREASSIGNED_ID_NOT_FOUND;
                    case 200001:
                        return BAD_REQUEST;
                    case 200005:
                        return INVALID_TOKEN;
                    case 300001:
                        return USER_BIZ_ROLE_DENY;
                    default:
                        switch (i) {
                            case 100021:
                                return CONV_DISSOLVED;
                            case 100022:
                                return MSG_NOT_FOUND;
                            default:
                                switch (i) {
                                    case 200008:
                                        return STATUS_CODE_REPEATED_REQUEST;
                                    case 200009:
                                        return STATUS_CODE_TIME_LIMIT_EXCEEDED;
                                    case 200010:
                                        return STATUS_CODE_FLOW_BLOCK;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static C0YIG valueOf(String str) {
        return (C0YIG) C08FF.LIZ(C0YIG.class, str);
    }

    public C0YIG(int i, int i2, Boolean bool, String str) {
        this.LL = i2;
        this.deprecated = bool;
    }
}
