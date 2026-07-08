package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356170Dxn {
    public static final EnumC356170Dxn INFO_STICKER;
    public static final /* synthetic */ EnumC356170Dxn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356170Dxn TEXT_ANIM;
    public static final EnumC356170Dxn TEXT_STICKER;
    public static final EnumC356170Dxn TEXT_TEMPLATE;

    public static InterfaceC2044707zh<EnumC356170Dxn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356170Dxn enumC356170Dxn = new EnumC356170Dxn("TEXT_STICKER", 0);
        TEXT_STICKER = enumC356170Dxn;
        EnumC356170Dxn enumC356170Dxn2 = new EnumC356170Dxn("TEXT_ANIM", 1);
        TEXT_ANIM = enumC356170Dxn2;
        EnumC356170Dxn enumC356170Dxn3 = new EnumC356170Dxn("INFO_STICKER", 2);
        INFO_STICKER = enumC356170Dxn3;
        EnumC356170Dxn enumC356170Dxn4 = new EnumC356170Dxn("TEXT_TEMPLATE", 3);
        TEXT_TEMPLATE = enumC356170Dxn4;
        EnumC356170Dxn[] enumC356170DxnArr = {enumC356170Dxn, enumC356170Dxn2, enumC356170Dxn3, enumC356170Dxn4};
        LL = enumC356170DxnArr;
        LLILLJJLI = new C2254308sP(enumC356170DxnArr);
    }

    public static EnumC356170Dxn[] values() {
        return (EnumC356170Dxn[]) LL.clone();
    }

    public static EnumC356170Dxn valueOf(String str) {
        return (EnumC356170Dxn) C08FF.LIZ(EnumC356170Dxn.class, str);
    }

    public EnumC356170Dxn(String str, int i) {
    }
}
