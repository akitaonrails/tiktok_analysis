package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19364410pO {
    public static final /* synthetic */ EnumC19364410pO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19364410pO ONLINE;
    public static final EnumC19364410pO TEST;

    public static InterfaceC2044707zh<EnumC19364410pO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19364410pO enumC19364410pO = new EnumC19364410pO("TEST", 0);
        TEST = enumC19364410pO;
        EnumC19364410pO enumC19364410pO2 = new EnumC19364410pO("ONLINE", 1);
        ONLINE = enumC19364410pO2;
        EnumC19364410pO[] enumC19364410pOArr = {enumC19364410pO, enumC19364410pO2};
        LL = enumC19364410pOArr;
        LLILLJJLI = new C2254308sP(enumC19364410pOArr);
    }

    public static EnumC19364410pO[] values() {
        return (EnumC19364410pO[]) LL.clone();
    }

    public static EnumC19364410pO valueOf(String str) {
        return (EnumC19364410pO) C08FF.LIZ(EnumC19364410pO.class, str);
    }

    public EnumC19364410pO(String str, int i) {
    }
}
