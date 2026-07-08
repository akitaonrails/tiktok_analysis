package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584350Mvx {
    public static final EnumC584350Mvx INSTANCE;
    public static final /* synthetic */ EnumC584350Mvx[] LLILLJJLI;
    public String LL;

    static {
        EnumC584350Mvx enumC584350Mvx = new EnumC584350Mvx();
        INSTANCE = enumC584350Mvx;
        LLILLJJLI = new EnumC584350Mvx[]{enumC584350Mvx};
    }

    public static EnumC584350Mvx[] values() {
        return (EnumC584350Mvx[]) LLILLJJLI.clone();
    }

    public String getVideoId() {
        String str = this.LL;
        return str == null ? "" : str;
    }

    public static EnumC584350Mvx valueOf(String str) {
        return (EnumC584350Mvx) C08FF.LIZ(EnumC584350Mvx.class, str);
    }

    public void setVideoId(String str) {
        this.LL = str;
    }
}
