package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ivZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1261310ivZ {
    public static final EnumC1261310ivZ BLOCK;
    public static final EnumC1261310ivZ CANCEL;
    public static final /* synthetic */ EnumC1261310ivZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1261310ivZ REPORT;
    public static final EnumC1261310ivZ SHARE_PROFILE;
    public static final EnumC1261310ivZ SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1261310ivZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1261310ivZ enumC1261310ivZ = new EnumC1261310ivZ("SHOW", 0, "show");
        SHOW = enumC1261310ivZ;
        EnumC1261310ivZ enumC1261310ivZ2 = new EnumC1261310ivZ("SHARE_PROFILE", 1, "share_profile");
        SHARE_PROFILE = enumC1261310ivZ2;
        EnumC1261310ivZ enumC1261310ivZ3 = new EnumC1261310ivZ("BLOCK", 2, "block");
        BLOCK = enumC1261310ivZ3;
        EnumC1261310ivZ enumC1261310ivZ4 = new EnumC1261310ivZ("REPORT", 3, "report");
        REPORT = enumC1261310ivZ4;
        EnumC1261310ivZ enumC1261310ivZ5 = new EnumC1261310ivZ("CANCEL", 4, "cancel");
        CANCEL = enumC1261310ivZ5;
        EnumC1261310ivZ[] enumC1261310ivZArr = {enumC1261310ivZ, enumC1261310ivZ2, enumC1261310ivZ3, enumC1261310ivZ4, enumC1261310ivZ5};
        LLILLJJLI = enumC1261310ivZArr;
        LLILLL = new C2254308sP(enumC1261310ivZArr);
    }

    public static EnumC1261310ivZ[] values() {
        return (EnumC1261310ivZ[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1261310ivZ valueOf(String str) {
        return (EnumC1261310ivZ) C08FF.LIZ(EnumC1261310ivZ.class, str);
    }

    public EnumC1261310ivZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
