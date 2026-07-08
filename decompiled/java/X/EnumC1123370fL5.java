package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fL5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1123370fL5 {
    public static final EnumC1123370fL5 FAST;
    public static final /* synthetic */ EnumC1123370fL5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1123370fL5 NORMAL;
    public static final EnumC1123370fL5 SPECIAL;

    public static InterfaceC2044707zh<EnumC1123370fL5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1123370fL5 enumC1123370fL5 = new EnumC1123370fL5("NORMAL", 0);
        NORMAL = enumC1123370fL5;
        EnumC1123370fL5 enumC1123370fL52 = new EnumC1123370fL5("SPECIAL", 1);
        SPECIAL = enumC1123370fL52;
        EnumC1123370fL5 enumC1123370fL53 = new EnumC1123370fL5("FAST", 2);
        FAST = enumC1123370fL53;
        EnumC1123370fL5[] enumC1123370fL5Arr = {enumC1123370fL5, enumC1123370fL52, enumC1123370fL53};
        LL = enumC1123370fL5Arr;
        LLILLJJLI = new C2254308sP(enumC1123370fL5Arr);
    }

    public static EnumC1123370fL5[] values() {
        return (EnumC1123370fL5[]) LL.clone();
    }

    public static EnumC1123370fL5 valueOf(String str) {
        return (EnumC1123370fL5) C08FF.LIZ(EnumC1123370fL5.class, str);
    }

    public EnumC1123370fL5(String str, int i) {
    }
}
