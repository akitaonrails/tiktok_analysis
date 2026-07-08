package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15jZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20602315jZ {
    public static final EnumC20602315jZ AVATAR_URL;
    public static final EnumC20602315jZ CHECK_BOX;
    public static final EnumC20602315jZ CONTENT;
    public static final EnumC20602315jZ ENABLED;
    public static final /* synthetic */ EnumC20602315jZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20602315jZ TITLE;

    public static InterfaceC2044707zh<EnumC20602315jZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20602315jZ enumC20602315jZ = new EnumC20602315jZ("ENABLED", 0);
        ENABLED = enumC20602315jZ;
        EnumC20602315jZ enumC20602315jZ2 = new EnumC20602315jZ("TITLE", 1);
        TITLE = enumC20602315jZ2;
        EnumC20602315jZ enumC20602315jZ3 = new EnumC20602315jZ("CONTENT", 2);
        CONTENT = enumC20602315jZ3;
        EnumC20602315jZ enumC20602315jZ4 = new EnumC20602315jZ("CHECK_BOX", 3);
        CHECK_BOX = enumC20602315jZ4;
        EnumC20602315jZ enumC20602315jZ5 = new EnumC20602315jZ("AVATAR_URL", 4);
        AVATAR_URL = enumC20602315jZ5;
        EnumC20602315jZ[] enumC20602315jZArr = {enumC20602315jZ, enumC20602315jZ2, enumC20602315jZ3, enumC20602315jZ4, enumC20602315jZ5};
        LL = enumC20602315jZArr;
        LLILLJJLI = new C2254308sP(enumC20602315jZArr);
    }

    public static EnumC20602315jZ[] values() {
        return (EnumC20602315jZ[]) LL.clone();
    }

    public static EnumC20602315jZ valueOf(String str) {
        return (EnumC20602315jZ) C08FF.LIZ(EnumC20602315jZ.class, str);
    }

    public EnumC20602315jZ(String str, int i) {
    }
}
