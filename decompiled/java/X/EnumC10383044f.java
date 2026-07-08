package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.044f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10383044f {
    public static final EnumC10383044f FAIL;
    public static final EnumC10383044f INIT;
    public static final /* synthetic */ EnumC10383044f[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC10383044f SUCCESS;

    public static InterfaceC2044707zh<EnumC10383044f> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC10383044f enumC10383044f = new EnumC10383044f("INIT", 0);
        INIT = enumC10383044f;
        EnumC10383044f enumC10383044f2 = new EnumC10383044f("SUCCESS", 1);
        SUCCESS = enumC10383044f2;
        EnumC10383044f enumC10383044f3 = new EnumC10383044f("FAIL", 2);
        FAIL = enumC10383044f3;
        EnumC10383044f[] enumC10383044fArr = {enumC10383044f, enumC10383044f2, enumC10383044f3};
        LL = enumC10383044fArr;
        LLILLJJLI = new C2254308sP(enumC10383044fArr);
    }

    public static EnumC10383044f[] values() {
        return (EnumC10383044f[]) LL.clone();
    }

    public static EnumC10383044f valueOf(String str) {
        return (EnumC10383044f) C08FF.LIZ(EnumC10383044f.class, str);
    }

    public EnumC10383044f(String str, int i) {
    }
}
