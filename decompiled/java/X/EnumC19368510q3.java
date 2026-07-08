package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19368510q3 {
    public static final EnumC19368510q3 COMPOSITE;
    public static final /* synthetic */ EnumC19368510q3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19368510q3 SIMPLE;
    public static final EnumC19368510q3 SKIN_TONE;
    public static final EnumC19368510q3 UNKNOWN;
    public static final EnumC19368510q3 ZWJ_SEQUENCE;

    public static InterfaceC2044707zh<EnumC19368510q3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19368510q3 enumC19368510q3 = new EnumC19368510q3("SIMPLE", 0);
        SIMPLE = enumC19368510q3;
        EnumC19368510q3 enumC19368510q32 = new EnumC19368510q3("COMPOSITE", 1);
        COMPOSITE = enumC19368510q32;
        EnumC19368510q3 enumC19368510q33 = new EnumC19368510q3("SKIN_TONE", 2);
        SKIN_TONE = enumC19368510q33;
        EnumC19368510q3 enumC19368510q34 = new EnumC19368510q3("ZWJ_SEQUENCE", 3);
        ZWJ_SEQUENCE = enumC19368510q34;
        EnumC19368510q3 enumC19368510q35 = new EnumC19368510q3("UNKNOWN", 4);
        UNKNOWN = enumC19368510q35;
        EnumC19368510q3[] enumC19368510q3Arr = {enumC19368510q3, enumC19368510q32, enumC19368510q33, enumC19368510q34, enumC19368510q35};
        LL = enumC19368510q3Arr;
        LLILLJJLI = new C2254308sP(enumC19368510q3Arr);
    }

    public static EnumC19368510q3[] values() {
        return (EnumC19368510q3[]) LL.clone();
    }

    public static EnumC19368510q3 valueOf(String str) {
        return (EnumC19368510q3) C08FF.LIZ(EnumC19368510q3.class, str);
    }

    public EnumC19368510q3(String str, int i) {
    }
}
