package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC339980DUm {
    public static final EnumC339980DUm CANCELLED;
    public static final C339970DUl Companion;
    public static final EnumC339980DUm FAIL;
    public static final EnumC339980DUm FINISHED;
    public static final EnumC339980DUm IN_PROGRESS;
    public static final /* synthetic */ EnumC339980DUm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC339980DUm NONE;
    public static final EnumC339980DUm TNS_FAIL;
    public static final EnumC339980DUm UPLOADING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC339980DUm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC339980DUm enumC339980DUm = new EnumC339980DUm("NONE", 0, 0);
        NONE = enumC339980DUm;
        EnumC339980DUm enumC339980DUm2 = new EnumC339980DUm("FAIL", 1, -1);
        FAIL = enumC339980DUm2;
        EnumC339980DUm enumC339980DUm3 = new EnumC339980DUm("IN_PROGRESS", 2, 1);
        IN_PROGRESS = enumC339980DUm3;
        EnumC339980DUm enumC339980DUm4 = new EnumC339980DUm("FINISHED", 3, 2);
        FINISHED = enumC339980DUm4;
        EnumC339980DUm enumC339980DUm5 = new EnumC339980DUm("CANCELLED", 4, 3);
        CANCELLED = enumC339980DUm5;
        EnumC339980DUm enumC339980DUm6 = new EnumC339980DUm("TNS_FAIL", 5, 4);
        TNS_FAIL = enumC339980DUm6;
        EnumC339980DUm enumC339980DUm7 = new EnumC339980DUm("UPLOADING", 6, -2);
        UPLOADING = enumC339980DUm7;
        EnumC339980DUm[] enumC339980DUmArr = {enumC339980DUm, enumC339980DUm2, enumC339980DUm3, enumC339980DUm4, enumC339980DUm5, enumC339980DUm6, enumC339980DUm7};
        LLILLJJLI = enumC339980DUmArr;
        LLILLL = new C2254308sP(enumC339980DUmArr);
        Companion = new C339970DUl();
    }

    public static EnumC339980DUm[] values() {
        return (EnumC339980DUm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC339980DUm valueOf(String str) {
        return (EnumC339980DUm) C08FF.LIZ(EnumC339980DUm.class, str);
    }

    public EnumC339980DUm(String str, int i, int i2) {
        this.LL = i2;
    }
}
