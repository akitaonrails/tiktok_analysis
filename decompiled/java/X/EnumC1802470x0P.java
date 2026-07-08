package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x0P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1802470x0P {
    public static final /* synthetic */ EnumC1802470x0P[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1802470x0P NORMAL_REJECT;
    public static final EnumC1802470x0P NORMAL_RESUBMIT_MUST;
    public static final EnumC1802470x0P NORMAL_REVIEWING;
    public static final EnumC1802470x0P NORMAL_UNSUBMIT_MUST;
    public static final EnumC1802470x0P WHITELIST_REJECT;
    public static final EnumC1802470x0P WHITELIST_RESUBMIT_MUST;
    public static final EnumC1802470x0P WHITELIST_RESUBMIT_NOTICE;
    public static final EnumC1802470x0P WHITELIST_REVIEWING;
    public static final EnumC1802470x0P WHITELIST_UNSUBMIT_MUST;
    public static final EnumC1802470x0P WHITELIST_UNSUBMIT_NOTICE;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1802470x0P> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1802470x0P enumC1802470x0P = new EnumC1802470x0P("NORMAL_UNSUBMIT_MUST", 0, 2131843920, 2131842368, 2131842385);
        NORMAL_UNSUBMIT_MUST = enumC1802470x0P;
        EnumC1802470x0P enumC1802470x0P2 = new EnumC1802470x0P("NORMAL_RESUBMIT_MUST", 1, 2131843920, 2131842368, 2131842374);
        NORMAL_RESUBMIT_MUST = enumC1802470x0P2;
        EnumC1802470x0P enumC1802470x0P3 = new EnumC1802470x0P("NORMAL_REVIEWING", 2, 2131842376, 2131841338, 2131842050);
        NORMAL_REVIEWING = enumC1802470x0P3;
        EnumC1802470x0P enumC1802470x0P4 = new EnumC1802470x0P("NORMAL_REJECT", 3, 2131842369, 2131841338, 2131842050);
        NORMAL_REJECT = enumC1802470x0P4;
        EnumC1802470x0P enumC1802470x0P5 = new EnumC1802470x0P("WHITELIST_UNSUBMIT_NOTICE", 4, 2131842386, 2131842370, 2131842385);
        WHITELIST_UNSUBMIT_NOTICE = enumC1802470x0P5;
        EnumC1802470x0P enumC1802470x0P6 = new EnumC1802470x0P("WHITELIST_RESUBMIT_NOTICE", 5, 2131842375, 2131842370, 2131842374);
        WHITELIST_RESUBMIT_NOTICE = enumC1802470x0P6;
        EnumC1802470x0P enumC1802470x0P7 = new EnumC1802470x0P("WHITELIST_UNSUBMIT_MUST", 6, 2131842386, 2131842368, 2131842385);
        WHITELIST_UNSUBMIT_MUST = enumC1802470x0P7;
        EnumC1802470x0P enumC1802470x0P8 = new EnumC1802470x0P("WHITELIST_RESUBMIT_MUST", 7, 2131842375, 2131842368, 2131842374);
        WHITELIST_RESUBMIT_MUST = enumC1802470x0P8;
        EnumC1802470x0P enumC1802470x0P9 = new EnumC1802470x0P("WHITELIST_REVIEWING", 8, 2131842376, 2131841338, 2131842050);
        WHITELIST_REVIEWING = enumC1802470x0P9;
        EnumC1802470x0P enumC1802470x0P10 = new EnumC1802470x0P("WHITELIST_REJECT", 9, 2131842369, 2131841338, 2131842050);
        WHITELIST_REJECT = enumC1802470x0P10;
        EnumC1802470x0P[] enumC1802470x0PArr = {enumC1802470x0P, enumC1802470x0P2, enumC1802470x0P3, enumC1802470x0P4, enumC1802470x0P5, enumC1802470x0P6, enumC1802470x0P7, enumC1802470x0P8, enumC1802470x0P9, enumC1802470x0P10};
        LLILZ = enumC1802470x0PArr;
        LLILZIL = new C2254308sP(enumC1802470x0PArr);
    }

    public static EnumC1802470x0P[] values() {
        return (EnumC1802470x0P[]) LLILZ.clone();
    }

    public final int getNegativeResId() {
        return this.LLILLJJLI;
    }

    public final int getPositiveResId() {
        return this.LLILLL;
    }

    public final int getTitleResId() {
        return this.LL;
    }

    public static EnumC1802470x0P valueOf(String str) {
        return (EnumC1802470x0P) C08FF.LIZ(EnumC1802470x0P.class, str);
    }

    public EnumC1802470x0P(String str, int i, int i2, int i3, int i4) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
    }
}
