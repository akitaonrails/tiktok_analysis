package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992320bvi {
    public static final /* synthetic */ EnumC992320bvi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992320bvi NEW_UID_FOUND;
    public static final EnumC992320bvi NOT_FOUND;
    public static final EnumC992320bvi SAME_UID_NEW_POS;
    public static final EnumC992320bvi SAME_UID_SAME_POS;

    public static InterfaceC2044707zh<EnumC992320bvi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992320bvi enumC992320bvi = new EnumC992320bvi("SAME_UID_SAME_POS", 0);
        SAME_UID_SAME_POS = enumC992320bvi;
        EnumC992320bvi enumC992320bvi2 = new EnumC992320bvi("SAME_UID_NEW_POS", 1);
        SAME_UID_NEW_POS = enumC992320bvi2;
        EnumC992320bvi enumC992320bvi3 = new EnumC992320bvi("NEW_UID_FOUND", 2);
        NEW_UID_FOUND = enumC992320bvi3;
        EnumC992320bvi enumC992320bvi4 = new EnumC992320bvi("NOT_FOUND", 3);
        NOT_FOUND = enumC992320bvi4;
        EnumC992320bvi[] enumC992320bviArr = {enumC992320bvi, enumC992320bvi2, enumC992320bvi3, enumC992320bvi4};
        LL = enumC992320bviArr;
        LLILLJJLI = new C2254308sP(enumC992320bviArr);
    }

    public static EnumC992320bvi[] values() {
        return (EnumC992320bvi[]) LL.clone();
    }

    public static EnumC992320bvi valueOf(String str) {
        return (EnumC992320bvi) C08FF.LIZ(EnumC992320bvi.class, str);
    }

    public EnumC992320bvi(String str, int i) {
    }
}
