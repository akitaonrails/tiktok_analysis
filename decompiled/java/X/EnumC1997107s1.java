package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07s1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1997107s1 {
    public static final EnumC1997107s1 ALLOW_OPEN_CAMERA;
    public static final EnumC1997107s1 DISALLOW_OPEN_CAMERA;
    public static final /* synthetic */ EnumC1997107s1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1997107s1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1997107s1 enumC1997107s1 = new EnumC1997107s1("ALLOW_OPEN_CAMERA", 0);
        ALLOW_OPEN_CAMERA = enumC1997107s1;
        EnumC1997107s1 enumC1997107s12 = new EnumC1997107s1("DISALLOW_OPEN_CAMERA", 1);
        DISALLOW_OPEN_CAMERA = enumC1997107s12;
        EnumC1997107s1[] enumC1997107s1Arr = {enumC1997107s1, enumC1997107s12};
        LL = enumC1997107s1Arr;
        LLILLJJLI = new C2254308sP(enumC1997107s1Arr);
    }

    public static EnumC1997107s1[] values() {
        return (EnumC1997107s1[]) LL.clone();
    }

    public static EnumC1997107s1 valueOf(String str) {
        return (EnumC1997107s1) C08FF.LIZ(EnumC1997107s1.class, str);
    }

    public EnumC1997107s1(String str, int i) {
    }
}
