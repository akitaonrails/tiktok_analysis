package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uW0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1706740uW0 {
    public static final /* synthetic */ EnumC1706740uW0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1706740uW0 PRIMARY;
    public static final EnumC1706740uW0 SECONDARY;
    public static final EnumC1706740uW0 TERTIARY;

    public static InterfaceC2044707zh<EnumC1706740uW0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1706740uW0 enumC1706740uW0 = new EnumC1706740uW0("PRIMARY", 0);
        PRIMARY = enumC1706740uW0;
        EnumC1706740uW0 enumC1706740uW02 = new EnumC1706740uW0("SECONDARY", 1);
        SECONDARY = enumC1706740uW02;
        EnumC1706740uW0 enumC1706740uW03 = new EnumC1706740uW0("TERTIARY", 2);
        TERTIARY = enumC1706740uW03;
        EnumC1706740uW0[] enumC1706740uW0Arr = {enumC1706740uW0, enumC1706740uW02, enumC1706740uW03};
        LL = enumC1706740uW0Arr;
        LLILLJJLI = new C2254308sP(enumC1706740uW0Arr);
    }

    public static EnumC1706740uW0[] values() {
        return (EnumC1706740uW0[]) LL.clone();
    }

    public static EnumC1706740uW0 valueOf(String str) {
        return (EnumC1706740uW0) C08FF.LIZ(EnumC1706740uW0.class, str);
    }

    public EnumC1706740uW0(String str, int i) {
    }
}
