package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0inx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1256590inx {
    public static final EnumC1256590inx IMMERSIVE_FEED;
    public static final EnumC1256590inx INBOX_SKYLINE;
    public static final /* synthetic */ EnumC1256590inx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1256590inx PANEL;
    public static final EnumC1256590inx PROFILE;

    public static InterfaceC2044707zh<EnumC1256590inx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1256590inx enumC1256590inx = new EnumC1256590inx("INBOX_SKYLINE", 0);
        INBOX_SKYLINE = enumC1256590inx;
        EnumC1256590inx enumC1256590inx2 = new EnumC1256590inx("PROFILE", 1);
        PROFILE = enumC1256590inx2;
        EnumC1256590inx enumC1256590inx3 = new EnumC1256590inx("IMMERSIVE_FEED", 2);
        IMMERSIVE_FEED = enumC1256590inx3;
        EnumC1256590inx enumC1256590inx4 = new EnumC1256590inx("PANEL", 3);
        PANEL = enumC1256590inx4;
        EnumC1256590inx[] enumC1256590inxArr = {enumC1256590inx, enumC1256590inx2, enumC1256590inx3, enumC1256590inx4};
        LL = enumC1256590inxArr;
        LLILLJJLI = new C2254308sP(enumC1256590inxArr);
    }

    public static EnumC1256590inx[] values() {
        return (EnumC1256590inx[]) LL.clone();
    }

    public static EnumC1256590inx valueOf(String str) {
        return (EnumC1256590inx) C08FF.LIZ(EnumC1256590inx.class, str);
    }

    public EnumC1256590inx(String str, int i) {
    }
}
