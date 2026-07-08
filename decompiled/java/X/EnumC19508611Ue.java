package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11Ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19508611Ue {
    public static final EnumC19508611Ue DOWNLOADED;
    public static final EnumC19508611Ue DOWNLOADING;
    public static final EnumC19508611Ue INSTALLED;
    public static final /* synthetic */ EnumC19508611Ue[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19508611Ue UNKNOWN;

    public static InterfaceC2044707zh<EnumC19508611Ue> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19508611Ue enumC19508611Ue = new EnumC19508611Ue("UNKNOWN", 0);
        UNKNOWN = enumC19508611Ue;
        EnumC19508611Ue enumC19508611Ue2 = new EnumC19508611Ue("DOWNLOADING", 1);
        DOWNLOADING = enumC19508611Ue2;
        EnumC19508611Ue enumC19508611Ue3 = new EnumC19508611Ue("DOWNLOADED", 2);
        DOWNLOADED = enumC19508611Ue3;
        EnumC19508611Ue enumC19508611Ue4 = new EnumC19508611Ue("INSTALLED", 3);
        INSTALLED = enumC19508611Ue4;
        EnumC19508611Ue[] enumC19508611UeArr = {enumC19508611Ue, enumC19508611Ue2, enumC19508611Ue3, enumC19508611Ue4};
        LL = enumC19508611UeArr;
        LLILLJJLI = new C2254308sP(enumC19508611UeArr);
    }

    public static EnumC19508611Ue[] values() {
        return (EnumC19508611Ue[]) LL.clone();
    }

    public static EnumC19508611Ue valueOf(String str) {
        return (EnumC19508611Ue) C08FF.LIZ(EnumC19508611Ue.class, str);
    }

    public EnumC19508611Ue(String str, int i) {
    }
}
