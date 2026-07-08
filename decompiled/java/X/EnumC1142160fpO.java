package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142160fpO {
    public static final EnumC1142160fpO EMPTY;
    public static final EnumC1142160fpO ERROR;
    public static final EnumC1142160fpO IDLE;
    public static final /* synthetic */ EnumC1142160fpO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1142160fpO LOADING;
    public static final EnumC1142160fpO READY;

    public static InterfaceC2044707zh<EnumC1142160fpO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142160fpO enumC1142160fpO = new EnumC1142160fpO("IDLE", 0);
        IDLE = enumC1142160fpO;
        EnumC1142160fpO enumC1142160fpO2 = new EnumC1142160fpO("LOADING", 1);
        LOADING = enumC1142160fpO2;
        EnumC1142160fpO enumC1142160fpO3 = new EnumC1142160fpO("READY", 2);
        READY = enumC1142160fpO3;
        EnumC1142160fpO enumC1142160fpO4 = new EnumC1142160fpO("EMPTY", 3);
        EMPTY = enumC1142160fpO4;
        EnumC1142160fpO enumC1142160fpO5 = new EnumC1142160fpO("ERROR", 4);
        ERROR = enumC1142160fpO5;
        EnumC1142160fpO[] enumC1142160fpOArr = {enumC1142160fpO, enumC1142160fpO2, enumC1142160fpO3, enumC1142160fpO4, enumC1142160fpO5};
        LL = enumC1142160fpOArr;
        LLILLJJLI = new C2254308sP(enumC1142160fpOArr);
    }

    public static EnumC1142160fpO[] values() {
        return (EnumC1142160fpO[]) LL.clone();
    }

    public static EnumC1142160fpO valueOf(String str) {
        return (EnumC1142160fpO) C08FF.LIZ(EnumC1142160fpO.class, str);
    }

    public EnumC1142160fpO(String str, int i) {
    }
}
