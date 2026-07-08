package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993720bxy {
    public static final EnumC993720bxy ALL_FINISH;
    public static final EnumC993720bxy FIRST_START;
    public static final /* synthetic */ EnumC993720bxy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993720bxy PARTIAL_FINISH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993720bxy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993720bxy enumC993720bxy = new EnumC993720bxy("FIRST_START", 0, "first_start");
        FIRST_START = enumC993720bxy;
        EnumC993720bxy enumC993720bxy2 = new EnumC993720bxy("PARTIAL_FINISH", 1, "partial_finish");
        PARTIAL_FINISH = enumC993720bxy2;
        EnumC993720bxy enumC993720bxy3 = new EnumC993720bxy("ALL_FINISH", 2, "all_finish");
        ALL_FINISH = enumC993720bxy3;
        EnumC993720bxy[] enumC993720bxyArr = {enumC993720bxy, enumC993720bxy2, enumC993720bxy3};
        LLILLJJLI = enumC993720bxyArr;
        LLILLL = new C2254308sP(enumC993720bxyArr);
    }

    public static EnumC993720bxy[] values() {
        return (EnumC993720bxy[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC993720bxy valueOf(String str) {
        return (EnumC993720bxy) C08FF.LIZ(EnumC993720bxy.class, str);
    }

    public EnumC993720bxy(String str, int i, String str2) {
        this.LL = str2;
    }
}
