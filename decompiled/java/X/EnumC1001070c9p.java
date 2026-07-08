package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1001070c9p {
    public static final EnumC1001070c9p DOWNLOADING;
    public static final EnumC1001070c9p DOWNLOAD_IDLE;
    public static final EnumC1001070c9p INSTALL;
    public static final EnumC1001070c9p INSTALLED;
    public static final EnumC1001070c9p LINK;
    public static final /* synthetic */ EnumC1001070c9p[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1001070c9p> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1001070c9p enumC1001070c9p = new EnumC1001070c9p("LINK", 0);
        LINK = enumC1001070c9p;
        EnumC1001070c9p enumC1001070c9p2 = new EnumC1001070c9p("DOWNLOAD_IDLE", 1);
        DOWNLOAD_IDLE = enumC1001070c9p2;
        EnumC1001070c9p enumC1001070c9p3 = new EnumC1001070c9p("DOWNLOADING", 2);
        DOWNLOADING = enumC1001070c9p3;
        EnumC1001070c9p enumC1001070c9p4 = new EnumC1001070c9p("INSTALL", 3);
        INSTALL = enumC1001070c9p4;
        EnumC1001070c9p enumC1001070c9p5 = new EnumC1001070c9p("INSTALLED", 4);
        INSTALLED = enumC1001070c9p5;
        EnumC1001070c9p[] enumC1001070c9pArr = {enumC1001070c9p, enumC1001070c9p2, enumC1001070c9p3, enumC1001070c9p4, enumC1001070c9p5};
        LL = enumC1001070c9pArr;
        LLILLJJLI = new C2254308sP(enumC1001070c9pArr);
    }

    public static EnumC1001070c9p[] values() {
        return (EnumC1001070c9p[]) LL.clone();
    }

    public static EnumC1001070c9p valueOf(String str) {
        return (EnumC1001070c9p) C08FF.LIZ(EnumC1001070c9p.class, str);
    }

    public EnumC1001070c9p(String str, int i) {
    }
}
