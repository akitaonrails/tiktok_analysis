package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142170fpP {
    public static final EnumC1142170fpP ERROR;
    public static final EnumC1142170fpP IDLE;
    public static final /* synthetic */ EnumC1142170fpP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1142170fpP LOADING;
    public static final EnumC1142170fpP READY;

    public static InterfaceC2044707zh<EnumC1142170fpP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142170fpP enumC1142170fpP = new EnumC1142170fpP("IDLE", 0);
        IDLE = enumC1142170fpP;
        EnumC1142170fpP enumC1142170fpP2 = new EnumC1142170fpP("LOADING", 1);
        LOADING = enumC1142170fpP2;
        EnumC1142170fpP enumC1142170fpP3 = new EnumC1142170fpP("READY", 2);
        READY = enumC1142170fpP3;
        EnumC1142170fpP enumC1142170fpP4 = new EnumC1142170fpP("ERROR", 3);
        ERROR = enumC1142170fpP4;
        EnumC1142170fpP[] enumC1142170fpPArr = {enumC1142170fpP, enumC1142170fpP2, enumC1142170fpP3, enumC1142170fpP4};
        LL = enumC1142170fpPArr;
        LLILLJJLI = new C2254308sP(enumC1142170fpPArr);
    }

    public static EnumC1142170fpP[] values() {
        return (EnumC1142170fpP[]) LL.clone();
    }

    public static EnumC1142170fpP valueOf(String str) {
        return (EnumC1142170fpP) C08FF.LIZ(EnumC1142170fpP.class, str);
    }

    public EnumC1142170fpP(String str, int i) {
    }
}
