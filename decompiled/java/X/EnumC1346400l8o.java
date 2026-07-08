package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1346400l8o {
    public static final EnumC1346400l8o HIGHLIGHT;
    public static final /* synthetic */ EnumC1346400l8o[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1346400l8o RED_DOT;

    public static InterfaceC2044707zh<EnumC1346400l8o> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1346400l8o enumC1346400l8o = new EnumC1346400l8o("RED_DOT", 0);
        RED_DOT = enumC1346400l8o;
        EnumC1346400l8o enumC1346400l8o2 = new EnumC1346400l8o("HIGHLIGHT", 1);
        HIGHLIGHT = enumC1346400l8o2;
        EnumC1346400l8o[] enumC1346400l8oArr = {enumC1346400l8o, enumC1346400l8o2};
        LL = enumC1346400l8oArr;
        LLILLJJLI = new C2254308sP(enumC1346400l8oArr);
    }

    public static EnumC1346400l8o[] values() {
        return (EnumC1346400l8o[]) LL.clone();
    }

    public static EnumC1346400l8o valueOf(String str) {
        return (EnumC1346400l8o) C08FF.LIZ(EnumC1346400l8o.class, str);
    }

    public EnumC1346400l8o(String str, int i) {
    }
}
