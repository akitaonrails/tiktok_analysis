package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10q2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19368410q2 {
    public static final EnumC19368410q2 COMPOSITE;
    public static final /* synthetic */ EnumC19368410q2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19368410q2 SIMPLE;
    public static final EnumC19368410q2 SKIN_TONE;
    public static final EnumC19368410q2 UNKNOWN;
    public static final EnumC19368410q2 ZWJ_SEQUENCE;

    public static InterfaceC2044707zh<EnumC19368410q2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19368410q2 enumC19368410q2 = new EnumC19368410q2("SIMPLE", 0);
        SIMPLE = enumC19368410q2;
        EnumC19368410q2 enumC19368410q22 = new EnumC19368410q2("COMPOSITE", 1);
        COMPOSITE = enumC19368410q22;
        EnumC19368410q2 enumC19368410q23 = new EnumC19368410q2("SKIN_TONE", 2);
        SKIN_TONE = enumC19368410q23;
        EnumC19368410q2 enumC19368410q24 = new EnumC19368410q2("ZWJ_SEQUENCE", 3);
        ZWJ_SEQUENCE = enumC19368410q24;
        EnumC19368410q2 enumC19368410q25 = new EnumC19368410q2("UNKNOWN", 4);
        UNKNOWN = enumC19368410q25;
        EnumC19368410q2[] enumC19368410q2Arr = {enumC19368410q2, enumC19368410q22, enumC19368410q23, enumC19368410q24, enumC19368410q25};
        LL = enumC19368410q2Arr;
        LLILLJJLI = new C2254308sP(enumC19368410q2Arr);
    }

    public static EnumC19368410q2[] values() {
        return (EnumC19368410q2[]) LL.clone();
    }

    public static EnumC19368410q2 valueOf(String str) {
        return (EnumC19368410q2) C08FF.LIZ(EnumC19368410q2.class, str);
    }

    public EnumC19368410q2(String str, int i) {
    }
}
