package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1198660hIW {
    public static final EnumC1198660hIW ALLOW;
    public static final /* synthetic */ EnumC1198660hIW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1198660hIW SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1198660hIW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1198660hIW enumC1198660hIW = new EnumC1198660hIW("SHOW", 0, "show");
        SHOW = enumC1198660hIW;
        EnumC1198660hIW enumC1198660hIW2 = new EnumC1198660hIW("ALLOW", 1, "allow");
        ALLOW = enumC1198660hIW2;
        EnumC1198660hIW[] enumC1198660hIWArr = {enumC1198660hIW, enumC1198660hIW2};
        LLILLJJLI = enumC1198660hIWArr;
        LLILLL = new C2254308sP(enumC1198660hIWArr);
    }

    public static EnumC1198660hIW[] values() {
        return (EnumC1198660hIW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1198660hIW valueOf(String str) {
        return (EnumC1198660hIW) C08FF.LIZ(EnumC1198660hIW.class, str);
    }

    public EnumC1198660hIW(String str, int i, String str2) {
        this.LL = str2;
    }
}
