package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ivy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1261560ivy {
    public static final EnumC1261560ivy CLICK_CELL;
    public static final EnumC1261560ivy CLICK_HEAD;
    public static final EnumC1261560ivy CLICK_NAME;
    public static final /* synthetic */ EnumC1261560ivy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1261560ivy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1261560ivy enumC1261560ivy = new EnumC1261560ivy("CLICK_NAME", 0, "click_name");
        CLICK_NAME = enumC1261560ivy;
        EnumC1261560ivy enumC1261560ivy2 = new EnumC1261560ivy("CLICK_HEAD", 1, "cilck_head");
        CLICK_HEAD = enumC1261560ivy2;
        EnumC1261560ivy enumC1261560ivy3 = new EnumC1261560ivy("CLICK_CELL", 2, "click_cell");
        CLICK_CELL = enumC1261560ivy3;
        EnumC1261560ivy[] enumC1261560ivyArr = {enumC1261560ivy, enumC1261560ivy2, enumC1261560ivy3};
        LLILLJJLI = enumC1261560ivyArr;
        LLILLL = new C2254308sP(enumC1261560ivyArr);
    }

    public static EnumC1261560ivy[] values() {
        return (EnumC1261560ivy[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1261560ivy valueOf(String str) {
        return (EnumC1261560ivy) C08FF.LIZ(EnumC1261560ivy.class, str);
    }

    public EnumC1261560ivy(String str, int i, String str2) {
        this.LL = str2;
    }
}
