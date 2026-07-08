package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587710N3h {
    public static final EnumC587710N3h BITMAP;
    public static final EnumC587710N3h DISK;
    public static final /* synthetic */ EnumC587710N3h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587710N3h NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587710N3h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587710N3h enumC587710N3h = new EnumC587710N3h("NONE", 0, 0);
        NONE = enumC587710N3h;
        EnumC587710N3h enumC587710N3h2 = new EnumC587710N3h("DISK", 1, 1);
        DISK = enumC587710N3h2;
        EnumC587710N3h enumC587710N3h3 = new EnumC587710N3h("BITMAP", 2, 2);
        BITMAP = enumC587710N3h3;
        EnumC587710N3h[] enumC587710N3hArr = {enumC587710N3h, enumC587710N3h2, enumC587710N3h3};
        LLILLJJLI = enumC587710N3hArr;
        LLILLL = new C2254308sP(enumC587710N3hArr);
    }

    public static EnumC587710N3h[] values() {
        return (EnumC587710N3h[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC587710N3h valueOf(String str) {
        return (EnumC587710N3h) C08FF.LIZ(EnumC587710N3h.class, str);
    }

    public EnumC587710N3h(String str, int i, int i2) {
        this.LL = i2;
    }
}
