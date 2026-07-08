package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Coc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2241721Coc {
    public static final /* synthetic */ EnumC2241721Coc[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2241721Coc TASK_STATUS_EXPIRED;
    public static final EnumC2241721Coc TASK_STATUS_IN_PROGRESS;
    public static final EnumC2241721Coc TASK_STATUS_RECALL;
    public static final EnumC2241721Coc TASK_STATUS_UNKNOWN;
    public static final EnumC2241721Coc TASK_STATUS_UNSUPPORTED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2241721Coc> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2241721Coc enumC2241721Coc = new EnumC2241721Coc("TASK_STATUS_UNKNOWN", 0, 0);
        TASK_STATUS_UNKNOWN = enumC2241721Coc;
        EnumC2241721Coc enumC2241721Coc2 = new EnumC2241721Coc("TASK_STATUS_IN_PROGRESS", 1, 1);
        TASK_STATUS_IN_PROGRESS = enumC2241721Coc2;
        EnumC2241721Coc enumC2241721Coc3 = new EnumC2241721Coc("TASK_STATUS_RECALL", 2, 4);
        TASK_STATUS_RECALL = enumC2241721Coc3;
        EnumC2241721Coc enumC2241721Coc4 = new EnumC2241721Coc("TASK_STATUS_EXPIRED", 3, 5);
        TASK_STATUS_EXPIRED = enumC2241721Coc4;
        EnumC2241721Coc enumC2241721Coc5 = new EnumC2241721Coc("TASK_STATUS_UNSUPPORTED", 4, 6);
        TASK_STATUS_UNSUPPORTED = enumC2241721Coc5;
        EnumC2241721Coc[] enumC2241721CocArr = {enumC2241721Coc, enumC2241721Coc2, enumC2241721Coc3, enumC2241721Coc4, enumC2241721Coc5};
        LLILLJJLI = enumC2241721CocArr;
        LLILLL = new C2254308sP(enumC2241721CocArr);
    }

    public static EnumC2241721Coc[] values() {
        return (EnumC2241721Coc[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC2241721Coc valueOf(String str) {
        return (EnumC2241721Coc) C08FF.LIZ(EnumC2241721Coc.class, str);
    }

    public EnumC2241721Coc(String str, int i, int i2) {
        this.LL = i2;
    }
}
