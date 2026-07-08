package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07q5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1985107q5 {
    public static final EnumC1985107q5 AVAILABLE;
    public static final /* synthetic */ EnumC1985107q5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1985107q5 UNAVAILABLE;

    public static InterfaceC2044707zh<EnumC1985107q5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1985107q5 enumC1985107q5 = new EnumC1985107q5("AVAILABLE", 0);
        AVAILABLE = enumC1985107q5;
        EnumC1985107q5 enumC1985107q52 = new EnumC1985107q5("UNAVAILABLE", 1);
        UNAVAILABLE = enumC1985107q52;
        EnumC1985107q5[] enumC1985107q5Arr = {enumC1985107q5, enumC1985107q52};
        LL = enumC1985107q5Arr;
        LLILLJJLI = new C2254308sP(enumC1985107q5Arr);
    }

    public static EnumC1985107q5[] values() {
        return (EnumC1985107q5[]) LL.clone();
    }

    public static EnumC1985107q5 valueOf(String str) {
        return (EnumC1985107q5) C08FF.LIZ(EnumC1985107q5.class, str);
    }

    public EnumC1985107q5(String str, int i) {
    }
}
