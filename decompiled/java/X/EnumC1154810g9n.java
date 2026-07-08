package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154810g9n {
    public static final EnumC1154810g9n CAMERA;
    public static final EnumC1154810g9n GALLERY_ITEM;
    public static final /* synthetic */ EnumC1154810g9n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154810g9n PREVIEW;

    public static InterfaceC2044707zh<EnumC1154810g9n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154810g9n enumC1154810g9n = new EnumC1154810g9n("GALLERY_ITEM", 0);
        GALLERY_ITEM = enumC1154810g9n;
        EnumC1154810g9n enumC1154810g9n2 = new EnumC1154810g9n("CAMERA", 1);
        CAMERA = enumC1154810g9n2;
        EnumC1154810g9n enumC1154810g9n3 = new EnumC1154810g9n("PREVIEW", 2);
        PREVIEW = enumC1154810g9n3;
        EnumC1154810g9n[] enumC1154810g9nArr = {enumC1154810g9n, enumC1154810g9n2, enumC1154810g9n3};
        LL = enumC1154810g9nArr;
        LLILLJJLI = new C2254308sP(enumC1154810g9nArr);
    }

    public static EnumC1154810g9n[] values() {
        return (EnumC1154810g9n[]) LL.clone();
    }

    public static EnumC1154810g9n valueOf(String str) {
        return (EnumC1154810g9n) C08FF.LIZ(EnumC1154810g9n.class, str);
    }

    public EnumC1154810g9n(String str, int i) {
    }
}
