package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961320b7i {
    public static final EnumC961320b7i COMPRESS_TITLE_ICON;
    public static final EnumC961320b7i COMPRESS_TITLE_ICON_IN_COHOST;
    public static final /* synthetic */ EnumC961320b7i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC961320b7i QUICK_COHOST_TIMEOUT;
    public String LL;

    public static InterfaceC2044707zh<EnumC961320b7i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC961320b7i enumC961320b7i = new EnumC961320b7i("QUICK_COHOST_TIMEOUT", 0, "quick_cohost_timeout");
        QUICK_COHOST_TIMEOUT = enumC961320b7i;
        EnumC961320b7i enumC961320b7i2 = new EnumC961320b7i("COMPRESS_TITLE_ICON", 1, "compress_title_icon");
        COMPRESS_TITLE_ICON = enumC961320b7i2;
        EnumC961320b7i enumC961320b7i3 = new EnumC961320b7i("COMPRESS_TITLE_ICON_IN_COHOST", 2, "compress_title_icon_in_cohost");
        COMPRESS_TITLE_ICON_IN_COHOST = enumC961320b7i3;
        EnumC961320b7i[] enumC961320b7iArr = {enumC961320b7i, enumC961320b7i2, enumC961320b7i3};
        LLILLJJLI = enumC961320b7iArr;
        LLILLL = new C2254308sP(enumC961320b7iArr);
    }

    public static EnumC961320b7i[] values() {
        return (EnumC961320b7i[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC961320b7i valueOf(String str) {
        return (EnumC961320b7i) C08FF.LIZ(EnumC961320b7i.class, str);
    }

    public final void setScene(String str) {
        this.LL = str;
    }

    public EnumC961320b7i(String str, int i, String str2) {
        this.LL = str2;
    }
}
