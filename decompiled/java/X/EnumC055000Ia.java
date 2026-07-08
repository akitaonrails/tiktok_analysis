package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC055000Ia {
    public static final /* synthetic */ EnumC055000Ia[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC055000Ia RATIO_1_1;
    public static final EnumC055000Ia RATIO_9_16;

    public static InterfaceC2044707zh<EnumC055000Ia> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC055000Ia enumC055000Ia = new EnumC055000Ia("RATIO_9_16", 0);
        RATIO_9_16 = enumC055000Ia;
        EnumC055000Ia enumC055000Ia2 = new EnumC055000Ia("RATIO_1_1", 1);
        RATIO_1_1 = enumC055000Ia2;
        EnumC055000Ia[] enumC055000IaArr = {enumC055000Ia, enumC055000Ia2};
        LL = enumC055000IaArr;
        LLILLJJLI = new C2254308sP(enumC055000IaArr);
    }

    public static EnumC055000Ia[] values() {
        return (EnumC055000Ia[]) LL.clone();
    }

    public static EnumC055000Ia valueOf(String str) {
        return (EnumC055000Ia) C08FF.LIZ(EnumC055000Ia.class, str);
    }

    public EnumC055000Ia(String str, int i) {
    }
}
