package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308780C8m {
    public static final EnumC308780C8m AnchorClose;
    public static final EnumC308780C8m HasGiftPermission;
    public static final /* synthetic */ EnumC308780C8m[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC308780C8m NoGiftPermission;
    public static final EnumC308780C8m UnknownType;
    public final int LL;

    public static InterfaceC2044707zh<EnumC308780C8m> getEntries() {
        return LLILLL;
    }

    static {
        EnumC308780C8m enumC308780C8m = new EnumC308780C8m("UnknownType", 0, 0);
        UnknownType = enumC308780C8m;
        EnumC308780C8m enumC308780C8m2 = new EnumC308780C8m("NoGiftPermission", 1, 1);
        NoGiftPermission = enumC308780C8m2;
        EnumC308780C8m enumC308780C8m3 = new EnumC308780C8m("AnchorClose", 2, 2);
        AnchorClose = enumC308780C8m3;
        EnumC308780C8m enumC308780C8m4 = new EnumC308780C8m("HasGiftPermission", 3, 3);
        HasGiftPermission = enumC308780C8m4;
        EnumC308780C8m[] enumC308780C8mArr = {enumC308780C8m, enumC308780C8m2, enumC308780C8m3, enumC308780C8m4};
        LLILLJJLI = enumC308780C8mArr;
        LLILLL = new C2254308sP(enumC308780C8mArr);
    }

    public static EnumC308780C8m[] values() {
        return (EnumC308780C8m[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC308780C8m valueOf(String str) {
        return (EnumC308780C8m) C08FF.LIZ(EnumC308780C8m.class, str);
    }

    public EnumC308780C8m(String str, int i, int i2) {
        this.LL = i2;
    }
}
