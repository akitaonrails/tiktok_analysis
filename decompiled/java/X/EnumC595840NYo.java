package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC595840NYo {
    public static final EnumC595840NYo ALL;
    public static final EnumC595840NYo FETCH;
    public static final /* synthetic */ EnumC595840NYo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC595840NYo REPORT;

    public static InterfaceC2044707zh<EnumC595840NYo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC595840NYo enumC595840NYo = new EnumC595840NYo("FETCH", 0);
        FETCH = enumC595840NYo;
        EnumC595840NYo enumC595840NYo2 = new EnumC595840NYo("REPORT", 1);
        REPORT = enumC595840NYo2;
        EnumC595840NYo enumC595840NYo3 = new EnumC595840NYo("ALL", 2);
        ALL = enumC595840NYo3;
        EnumC595840NYo[] enumC595840NYoArr = {enumC595840NYo, enumC595840NYo2, enumC595840NYo3};
        LL = enumC595840NYoArr;
        LLILLJJLI = new C2254308sP(enumC595840NYoArr);
    }

    public static EnumC595840NYo[] values() {
        return (EnumC595840NYo[]) LL.clone();
    }

    public static EnumC595840NYo valueOf(String str) {
        return (EnumC595840NYo) C08FF.LIZ(EnumC595840NYo.class, str);
    }

    public EnumC595840NYo(String str, int i) {
    }
}
