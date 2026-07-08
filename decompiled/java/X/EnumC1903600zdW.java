package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1903600zdW {
    public static final EnumC1903600zdW BOTTOM;
    public static final EnumC1903600zdW GONE;
    public static final /* synthetic */ EnumC1903600zdW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1903600zdW TOP;

    public static InterfaceC2044707zh<EnumC1903600zdW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1903600zdW enumC1903600zdW = new EnumC1903600zdW("TOP", 0);
        TOP = enumC1903600zdW;
        EnumC1903600zdW enumC1903600zdW2 = new EnumC1903600zdW("BOTTOM", 1);
        BOTTOM = enumC1903600zdW2;
        EnumC1903600zdW enumC1903600zdW3 = new EnumC1903600zdW("GONE", 2);
        GONE = enumC1903600zdW3;
        EnumC1903600zdW[] enumC1903600zdWArr = {enumC1903600zdW, enumC1903600zdW2, enumC1903600zdW3};
        LL = enumC1903600zdWArr;
        LLILLJJLI = new C2254308sP(enumC1903600zdWArr);
    }

    public static EnumC1903600zdW[] values() {
        return (EnumC1903600zdW[]) LL.clone();
    }

    public static EnumC1903600zdW valueOf(String str) {
        return (EnumC1903600zdW) C08FF.LIZ(EnumC1903600zdW.class, str);
    }

    public EnumC1903600zdW(String str, int i) {
    }
}
