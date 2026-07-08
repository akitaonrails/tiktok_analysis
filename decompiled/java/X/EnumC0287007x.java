package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.007x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0287007x {
    public static final EnumC0287007x AWARD_CARD_NOTICE;
    public static final EnumC0287007x CARD_OBTAIN_GUIDE;
    public static final C008M Companion;
    public static final /* synthetic */ EnumC0287007x[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC0287007x SPECIAL_EFFECT_NOTICE;
    public static final EnumC0287007x UNKNOWN_CARD_ACTION;
    public static final EnumC0287007x USE_CRITICAL_STRIKE_CARD;
    public static final EnumC0287007x USE_EXTRA_TIME_CARD;
    public static final EnumC0287007x USE_POTION_CARD;
    public static final EnumC0287007x USE_SMOKE_CARD;
    public static final EnumC0287007x USE_SPECIAL_EFFECT_CARD;
    public static final EnumC0287007x USE_TOP2_CARD;
    public static final EnumC0287007x USE_TOP3_CARD;
    public static final EnumC0287007x USE_VAULT_GLOVE_CARD;
    public static final EnumC0287007x USE_WAVE_CARD;
    public static final Map<Integer, EnumC0287007x> byRawType;
    public final int LL;
    public final String LLILLJJLI;
    public final EnumC0288007y LLILLL;

    public static InterfaceC2044707zh<EnumC0287007x> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.008M] */
    static {
        EnumC0287007x enumC0287007x = new EnumC0287007x("UNKNOWN_CARD_ACTION", 0, 0, "unknown_card_action", EnumC0288007y.UNKNOWN);
        UNKNOWN_CARD_ACTION = enumC0287007x;
        EnumC0288007y enumC0288007y = EnumC0288007y.NOTICE;
        EnumC0287007x enumC0287007x2 = new EnumC0287007x("CARD_OBTAIN_GUIDE", 1, 1, "card_obtain_guide", enumC0288007y);
        CARD_OBTAIN_GUIDE = enumC0287007x2;
        EnumC0288007y enumC0288007y2 = EnumC0288007y.USE_CARD;
        EnumC0287007x enumC0287007x3 = new EnumC0287007x("USE_CRITICAL_STRIKE_CARD", 2, 2, "use_critical_strike_card", enumC0288007y2);
        USE_CRITICAL_STRIKE_CARD = enumC0287007x3;
        EnumC0287007x enumC0287007x4 = new EnumC0287007x("USE_SMOKE_CARD", 3, 3, "use_smoke_card", enumC0288007y2);
        USE_SMOKE_CARD = enumC0287007x4;
        EnumC0287007x enumC0287007x5 = new EnumC0287007x("AWARD_CARD_NOTICE", 4, 4, "award_card_notice", enumC0288007y);
        AWARD_CARD_NOTICE = enumC0287007x5;
        EnumC0287007x enumC0287007x6 = new EnumC0287007x("USE_EXTRA_TIME_CARD", 5, 5, "use_extra_time_card", enumC0288007y2);
        USE_EXTRA_TIME_CARD = enumC0287007x6;
        EnumC0287007x enumC0287007x7 = new EnumC0287007x("USE_SPECIAL_EFFECT_CARD", 6, 6, "use_special_effect_card", enumC0288007y2);
        USE_SPECIAL_EFFECT_CARD = enumC0287007x7;
        EnumC0287007x enumC0287007x8 = new EnumC0287007x("USE_POTION_CARD", 7, 7, "use_potion_card", enumC0288007y2);
        USE_POTION_CARD = enumC0287007x8;
        EnumC0287007x enumC0287007x9 = new EnumC0287007x("USE_WAVE_CARD", 8, 8, "use_wave_card", enumC0288007y2);
        USE_WAVE_CARD = enumC0287007x9;
        EnumC0287007x enumC0287007x10 = new EnumC0287007x("SPECIAL_EFFECT_NOTICE", 9, 9, "special_effect_notice", enumC0288007y);
        SPECIAL_EFFECT_NOTICE = enumC0287007x10;
        EnumC0287007x enumC0287007x11 = new EnumC0287007x("USE_TOP2_CARD", 10, 10, "use_top2_card", enumC0288007y2);
        USE_TOP2_CARD = enumC0287007x11;
        EnumC0287007x enumC0287007x12 = new EnumC0287007x("USE_TOP3_CARD", 11, 11, "use_top3_card", enumC0288007y2);
        USE_TOP3_CARD = enumC0287007x12;
        EnumC0287007x enumC0287007x13 = new EnumC0287007x("USE_VAULT_GLOVE_CARD", 12, 12, "use_vault_glove_card", enumC0288007y2);
        USE_VAULT_GLOVE_CARD = enumC0287007x13;
        EnumC0287007x[] enumC0287007xArr = {enumC0287007x, enumC0287007x2, enumC0287007x3, enumC0287007x4, enumC0287007x5, enumC0287007x6, enumC0287007x7, enumC0287007x8, enumC0287007x9, enumC0287007x10, enumC0287007x11, enumC0287007x12, enumC0287007x13};
        LLILZ = enumC0287007xArr;
        LLILZIL = new C2254308sP(enumC0287007xArr);
        Companion = new Object() { // from class: X.008M
        };
        InterfaceC2044707zh<EnumC0287007x> entries = getEntries();
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC0287007x enumC0287007x14 : entries) {
            linkedHashMap.put(Integer.valueOf(enumC0287007x14.LL), enumC0287007x14);
        }
        byRawType = linkedHashMap;
    }

    public static EnumC0287007x[] values() {
        return (EnumC0287007x[]) LLILZ.clone();
    }

    public final EnumC0288007y getKind() {
        return this.LLILLL;
    }

    public final String getLabel() {
        return this.LLILLJJLI;
    }

    public final int getRawType() {
        return this.LL;
    }

    public static EnumC0287007x valueOf(String str) {
        return (EnumC0287007x) C08FF.LIZ(EnumC0287007x.class, str);
    }

    public EnumC0287007x(String str, int i, int i2, String str2, EnumC0288007y enumC0288007y) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = enumC0288007y;
    }
}
