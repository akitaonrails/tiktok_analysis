package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1983507pp {
    public static final EnumC1983507pp INNER;
    public static final /* synthetic */ EnumC1983507pp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1983507pp OUTER;

    public static InterfaceC2044707zh<EnumC1983507pp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1983507pp enumC1983507pp = new EnumC1983507pp("OUTER", 0);
        OUTER = enumC1983507pp;
        EnumC1983507pp enumC1983507pp2 = new EnumC1983507pp("INNER", 1);
        INNER = enumC1983507pp2;
        EnumC1983507pp[] enumC1983507ppArr = {enumC1983507pp, enumC1983507pp2};
        LL = enumC1983507ppArr;
        LLILLJJLI = new C2254308sP(enumC1983507ppArr);
    }

    public static EnumC1983507pp[] values() {
        return (EnumC1983507pp[]) LL.clone();
    }

    public static EnumC1983507pp valueOf(String str) {
        return (EnumC1983507pp) C08FF.LIZ(EnumC1983507pp.class, str);
    }

    public EnumC1983507pp(String str, int i) {
    }
}
