package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1595490rcZ {
    public static final EnumC1595490rcZ LIVE;
    public static final /* synthetic */ EnumC1595490rcZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1595490rcZ STORY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1595490rcZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1595490rcZ enumC1595490rcZ = new EnumC1595490rcZ("STORY", 0, "icon_type_story");
        STORY = enumC1595490rcZ;
        EnumC1595490rcZ enumC1595490rcZ2 = new EnumC1595490rcZ("LIVE", 1, "icon_type_live");
        LIVE = enumC1595490rcZ2;
        EnumC1595490rcZ[] enumC1595490rcZArr = {enumC1595490rcZ, enumC1595490rcZ2};
        LLILLJJLI = enumC1595490rcZArr;
        LLILLL = new C2254308sP(enumC1595490rcZArr);
    }

    public static EnumC1595490rcZ[] values() {
        return (EnumC1595490rcZ[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1595490rcZ valueOf(String str) {
        return (EnumC1595490rcZ) C08FF.LIZ(EnumC1595490rcZ.class, str);
    }

    public EnumC1595490rcZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
