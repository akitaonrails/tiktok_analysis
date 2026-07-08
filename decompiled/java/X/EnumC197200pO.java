package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC197200pO {
    public static final EnumC197200pO KMP;
    public static final /* synthetic */ EnumC197200pO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC197200pO ONLINE;

    public static InterfaceC2044707zh<EnumC197200pO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC197200pO enumC197200pO = new EnumC197200pO("ONLINE", 0);
        ONLINE = enumC197200pO;
        EnumC197200pO enumC197200pO2 = new EnumC197200pO("KMP", 1);
        KMP = enumC197200pO2;
        EnumC197200pO[] enumC197200pOArr = {enumC197200pO, enumC197200pO2};
        LL = enumC197200pOArr;
        LLILLJJLI = new C2254308sP(enumC197200pOArr);
    }

    public static EnumC197200pO[] values() {
        return (EnumC197200pO[]) LL.clone();
    }

    public static EnumC197200pO valueOf(String str) {
        return (EnumC197200pO) C08FF.LIZ(EnumC197200pO.class, str);
    }

    public EnumC197200pO(String str, int i) {
    }
}
