package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1745000vVi {
    public static final /* synthetic */ EnumC1745000vVi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1745000vVi OK;
    public static final EnumC1745000vVi SKIP_FOR_1HOUR;
    public static final EnumC1745000vVi SNOOZE;
    public static final EnumC1745000vVi START;
    public static final EnumC1745000vVi TEMPORARILY_SKIP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1745000vVi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1745000vVi enumC1745000vVi = new EnumC1745000vVi("OK", 0, 1);
        OK = enumC1745000vVi;
        EnumC1745000vVi enumC1745000vVi2 = new EnumC1745000vVi("SNOOZE", 1, 2);
        SNOOZE = enumC1745000vVi2;
        EnumC1745000vVi enumC1745000vVi3 = new EnumC1745000vVi("START", 2, 3);
        START = enumC1745000vVi3;
        EnumC1745000vVi enumC1745000vVi4 = new EnumC1745000vVi("SKIP_FOR_1HOUR", 3, 30);
        SKIP_FOR_1HOUR = enumC1745000vVi4;
        EnumC1745000vVi enumC1745000vVi5 = new EnumC1745000vVi("TEMPORARILY_SKIP", 4, 31);
        TEMPORARILY_SKIP = enumC1745000vVi5;
        EnumC1745000vVi[] enumC1745000vViArr = {enumC1745000vVi, enumC1745000vVi2, enumC1745000vVi3, enumC1745000vVi4, enumC1745000vVi5};
        LLILLJJLI = enumC1745000vViArr;
        LLILLL = new C2254308sP(enumC1745000vViArr);
    }

    public static EnumC1745000vVi[] values() {
        return (EnumC1745000vVi[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static EnumC1745000vVi valueOf(String str) {
        return (EnumC1745000vVi) C08FF.LIZ(EnumC1745000vVi.class, str);
    }

    public EnumC1745000vVi(String str, int i, int i2) {
        this.LL = i2;
    }
}
