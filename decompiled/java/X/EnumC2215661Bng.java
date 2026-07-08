package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Bng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2215661Bng {
    public static final EnumC2215661Bng ADD;
    public static final EnumC2215661Bng AND;
    public static final EnumC2215661Bng DIV;
    public static final EnumC2215661Bng EQ;
    public static final EnumC2215661Bng GT;
    public static final EnumC2215661Bng GTE;
    public static final /* synthetic */ EnumC2215661Bng[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2215661Bng LT;
    public static final EnumC2215661Bng LTE;
    public static final EnumC2215661Bng MOD;
    public static final EnumC2215661Bng MUL;
    public static final EnumC2215661Bng NE;
    public static final EnumC2215661Bng OR;
    public static final EnumC2215661Bng SUB;

    public static InterfaceC2044707zh<EnumC2215661Bng> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2215661Bng enumC2215661Bng = new EnumC2215661Bng("OR", 0);
        OR = enumC2215661Bng;
        EnumC2215661Bng enumC2215661Bng2 = new EnumC2215661Bng("AND", 1);
        AND = enumC2215661Bng2;
        EnumC2215661Bng enumC2215661Bng3 = new EnumC2215661Bng("EQ", 2);
        EQ = enumC2215661Bng3;
        EnumC2215661Bng enumC2215661Bng4 = new EnumC2215661Bng("NE", 3);
        NE = enumC2215661Bng4;
        EnumC2215661Bng enumC2215661Bng5 = new EnumC2215661Bng("LT", 4);
        LT = enumC2215661Bng5;
        EnumC2215661Bng enumC2215661Bng6 = new EnumC2215661Bng("GT", 5);
        GT = enumC2215661Bng6;
        EnumC2215661Bng enumC2215661Bng7 = new EnumC2215661Bng("LTE", 6);
        LTE = enumC2215661Bng7;
        EnumC2215661Bng enumC2215661Bng8 = new EnumC2215661Bng("GTE", 7);
        GTE = enumC2215661Bng8;
        EnumC2215661Bng enumC2215661Bng9 = new EnumC2215661Bng("ADD", 8);
        ADD = enumC2215661Bng9;
        EnumC2215661Bng enumC2215661Bng10 = new EnumC2215661Bng("SUB", 9);
        SUB = enumC2215661Bng10;
        EnumC2215661Bng enumC2215661Bng11 = new EnumC2215661Bng("MUL", 10);
        MUL = enumC2215661Bng11;
        EnumC2215661Bng enumC2215661Bng12 = new EnumC2215661Bng("DIV", 11);
        DIV = enumC2215661Bng12;
        EnumC2215661Bng enumC2215661Bng13 = new EnumC2215661Bng("MOD", 12);
        MOD = enumC2215661Bng13;
        EnumC2215661Bng[] enumC2215661BngArr = {enumC2215661Bng, enumC2215661Bng2, enumC2215661Bng3, enumC2215661Bng4, enumC2215661Bng5, enumC2215661Bng6, enumC2215661Bng7, enumC2215661Bng8, enumC2215661Bng9, enumC2215661Bng10, enumC2215661Bng11, enumC2215661Bng12, enumC2215661Bng13};
        LL = enumC2215661BngArr;
        LLILLJJLI = new C2254308sP(enumC2215661BngArr);
    }

    public static EnumC2215661Bng[] values() {
        return (EnumC2215661Bng[]) LL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (C2215671Bnh.LIZ[ordinal()]) {
            case 1:
                return "||";
            case 2:
                return "&&";
            case 3:
                return "==";
            case 4:
                return "!=";
            case 5:
                return "<";
            case 6:
                return ">";
            case 7:
                return "<=";
            case 8:
                return ">=";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "+";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "-";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "*";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "/";
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return "%";
            default:
                throw new C1954807lC();
        }
    }

    public static EnumC2215661Bng valueOf(String str) {
        return (EnumC2215661Bng) C08FF.LIZ(EnumC2215661Bng.class, str);
    }

    public EnumC2215661Bng(String str, int i) {
    }
}
