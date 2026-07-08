package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780990wRl {
    public static final EnumC1780990wRl DUBBING;
    public static final /* synthetic */ EnumC1780990wRl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780990wRl STICKER;
    public static final EnumC1780990wRl TITLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1780990wRl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780990wRl enumC1780990wRl = new EnumC1780990wRl("DUBBING", 0, "dubbing");
        DUBBING = enumC1780990wRl;
        EnumC1780990wRl enumC1780990wRl2 = new EnumC1780990wRl("STICKER", 1, "sticker");
        STICKER = enumC1780990wRl2;
        EnumC1780990wRl enumC1780990wRl3 = new EnumC1780990wRl("TITLE", 2, "title");
        TITLE = enumC1780990wRl3;
        EnumC1780990wRl[] enumC1780990wRlArr = {enumC1780990wRl, enumC1780990wRl2, enumC1780990wRl3};
        LLILLJJLI = enumC1780990wRlArr;
        LLILLL = new C2254308sP(enumC1780990wRlArr);
    }

    public static EnumC1780990wRl[] values() {
        return (EnumC1780990wRl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1780990wRl valueOf(String str) {
        return (EnumC1780990wRl) C08FF.LIZ(EnumC1780990wRl.class, str);
    }

    public EnumC1780990wRl(String str, int i, String str2) {
        this.LL = str2;
    }
}
