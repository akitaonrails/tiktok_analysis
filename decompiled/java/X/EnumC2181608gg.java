package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2181608gg {
    public static final /* synthetic */ EnumC2181608gg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2181608gg MP4;
    public static final EnumC2181608gg PNG;
    public static final EnumC2181608gg WEBP;

    public static InterfaceC2044707zh<EnumC2181608gg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2181608gg enumC2181608gg = new EnumC2181608gg("PNG", 0);
        PNG = enumC2181608gg;
        EnumC2181608gg enumC2181608gg2 = new EnumC2181608gg("WEBP", 1);
        WEBP = enumC2181608gg2;
        EnumC2181608gg enumC2181608gg3 = new EnumC2181608gg("MP4", 2);
        MP4 = enumC2181608gg3;
        EnumC2181608gg[] enumC2181608ggArr = {enumC2181608gg, enumC2181608gg2, enumC2181608gg3};
        LL = enumC2181608ggArr;
        LLILLJJLI = new C2254308sP(enumC2181608ggArr);
    }

    public static EnumC2181608gg[] values() {
        return (EnumC2181608gg[]) LL.clone();
    }

    public static EnumC2181608gg valueOf(String str) {
        return (EnumC2181608gg) C08FF.LIZ(EnumC2181608gg.class, str);
    }

    public EnumC2181608gg(String str, int i) {
    }
}
