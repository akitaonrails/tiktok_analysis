package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1CoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2241471CoD {
    public static final EnumC2241471CoD EXPIRED;
    public static final EnumC2241471CoD FAIL;
    public static final EnumC2241471CoD FINISH;
    public static final EnumC2241471CoD IN_PROGRESS;
    public static final /* synthetic */ EnumC2241471CoD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2241471CoD RECALL;
    public static final EnumC2241471CoD UNSUPPORTED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2241471CoD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2241471CoD enumC2241471CoD = new EnumC2241471CoD("IN_PROGRESS", 0, 1);
        IN_PROGRESS = enumC2241471CoD;
        EnumC2241471CoD enumC2241471CoD2 = new EnumC2241471CoD("FINISH", 1, 2);
        FINISH = enumC2241471CoD2;
        EnumC2241471CoD enumC2241471CoD3 = new EnumC2241471CoD("FAIL", 2, 3);
        FAIL = enumC2241471CoD3;
        EnumC2241471CoD enumC2241471CoD4 = new EnumC2241471CoD("RECALL", 3, 4);
        RECALL = enumC2241471CoD4;
        EnumC2241471CoD enumC2241471CoD5 = new EnumC2241471CoD("EXPIRED", 4, 5);
        EXPIRED = enumC2241471CoD5;
        EnumC2241471CoD enumC2241471CoD6 = new EnumC2241471CoD("UNSUPPORTED", 5, 6);
        UNSUPPORTED = enumC2241471CoD6;
        EnumC2241471CoD[] enumC2241471CoDArr = {enumC2241471CoD, enumC2241471CoD2, enumC2241471CoD3, enumC2241471CoD4, enumC2241471CoD5, enumC2241471CoD6};
        LLILLJJLI = enumC2241471CoDArr;
        LLILLL = new C2254308sP(enumC2241471CoDArr);
    }

    public static EnumC2241471CoD[] values() {
        return (EnumC2241471CoD[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC2241471CoD valueOf(String str) {
        return (EnumC2241471CoD) C08FF.LIZ(EnumC2241471CoD.class, str);
    }

    public EnumC2241471CoD(String str, int i, int i2) {
        this.LL = i2;
    }
}
