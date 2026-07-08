package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HiL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC448510HiL {
    public static final EnumC448510HiL ADD_PHOTO;
    public static final EnumC448510HiL DELETE_FOR_EVERYONE;
    public static final /* synthetic */ EnumC448510HiL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC448510HiL REMOVE_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC448510HiL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC448510HiL enumC448510HiL = new EnumC448510HiL("DELETE_FOR_EVERYONE", 0, "delete_for_everyone");
        DELETE_FOR_EVERYONE = enumC448510HiL;
        EnumC448510HiL enumC448510HiL2 = new EnumC448510HiL("REMOVE_PHOTO", 1, "remove_photo");
        REMOVE_PHOTO = enumC448510HiL2;
        EnumC448510HiL enumC448510HiL3 = new EnumC448510HiL("ADD_PHOTO", 2, "add_photo");
        ADD_PHOTO = enumC448510HiL3;
        EnumC448510HiL[] enumC448510HiLArr = {enumC448510HiL, enumC448510HiL2, enumC448510HiL3};
        LLILLJJLI = enumC448510HiLArr;
        LLILLL = new C2254308sP(enumC448510HiLArr);
    }

    public static EnumC448510HiL[] values() {
        return (EnumC448510HiL[]) LLILLJJLI.clone();
    }

    public final String getTarget() {
        return this.LL;
    }

    public static EnumC448510HiL valueOf(String str) {
        return (EnumC448510HiL) C08FF.LIZ(EnumC448510HiL.class, str);
    }

    public EnumC448510HiL(String str, int i, String str2) {
        this.LL = str2;
    }
}
