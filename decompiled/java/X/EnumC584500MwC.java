package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584500MwC {
    public static final EnumC584500MwC EXHAUSTED;
    public static final /* synthetic */ EnumC584500MwC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584500MwC REFRESH;

    public static InterfaceC2044707zh<EnumC584500MwC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584500MwC enumC584500MwC = new EnumC584500MwC("EXHAUSTED", 0);
        EXHAUSTED = enumC584500MwC;
        EnumC584500MwC enumC584500MwC2 = new EnumC584500MwC("REFRESH", 1);
        REFRESH = enumC584500MwC2;
        EnumC584500MwC[] enumC584500MwCArr = {enumC584500MwC, enumC584500MwC2};
        LL = enumC584500MwCArr;
        LLILLJJLI = new C2254308sP(enumC584500MwCArr);
    }

    public static EnumC584500MwC[] values() {
        return (EnumC584500MwC[]) LL.clone();
    }

    public static EnumC584500MwC valueOf(String str) {
        return (EnumC584500MwC) C08FF.LIZ(EnumC584500MwC.class, str);
    }

    public EnumC584500MwC(String str, int i) {
    }
}
