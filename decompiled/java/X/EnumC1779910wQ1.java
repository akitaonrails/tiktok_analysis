package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779910wQ1 {
    public static final EnumC1779910wQ1 CLAIM;
    public static final EnumC1779910wQ1 IAB_SERVICE;
    public static final /* synthetic */ EnumC1779910wQ1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1779910wQ1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779910wQ1 enumC1779910wQ1 = new EnumC1779910wQ1("IAB_SERVICE", 0);
        IAB_SERVICE = enumC1779910wQ1;
        EnumC1779910wQ1 enumC1779910wQ12 = new EnumC1779910wQ1("CLAIM", 1);
        CLAIM = enumC1779910wQ12;
        EnumC1779910wQ1[] enumC1779910wQ1Arr = {enumC1779910wQ1, enumC1779910wQ12};
        LL = enumC1779910wQ1Arr;
        LLILLJJLI = new C2254308sP(enumC1779910wQ1Arr);
    }

    public static EnumC1779910wQ1[] values() {
        return (EnumC1779910wQ1[]) LL.clone();
    }

    public static EnumC1779910wQ1 valueOf(String str) {
        return (EnumC1779910wQ1) C08FF.LIZ(EnumC1779910wQ1.class, str);
    }

    public EnumC1779910wQ1(String str, int i) {
    }
}
