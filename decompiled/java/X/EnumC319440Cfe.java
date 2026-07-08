package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC319440Cfe {
    public static final EnumC319440Cfe DOWNLOADED;
    public static final EnumC319440Cfe DOWNLOADING;
    public static final EnumC319440Cfe INSTALLED;
    public static final /* synthetic */ EnumC319440Cfe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC319440Cfe UNKNOWN;

    public static InterfaceC2044707zh<EnumC319440Cfe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC319440Cfe enumC319440Cfe = new EnumC319440Cfe("UNKNOWN", 0);
        UNKNOWN = enumC319440Cfe;
        EnumC319440Cfe enumC319440Cfe2 = new EnumC319440Cfe("DOWNLOADING", 1);
        DOWNLOADING = enumC319440Cfe2;
        EnumC319440Cfe enumC319440Cfe3 = new EnumC319440Cfe("DOWNLOADED", 2);
        DOWNLOADED = enumC319440Cfe3;
        EnumC319440Cfe enumC319440Cfe4 = new EnumC319440Cfe("INSTALLED", 3);
        INSTALLED = enumC319440Cfe4;
        EnumC319440Cfe[] enumC319440CfeArr = {enumC319440Cfe, enumC319440Cfe2, enumC319440Cfe3, enumC319440Cfe4};
        LL = enumC319440CfeArr;
        LLILLJJLI = new C2254308sP(enumC319440CfeArr);
    }

    public static EnumC319440Cfe[] values() {
        return (EnumC319440Cfe[]) LL.clone();
    }

    public static EnumC319440Cfe valueOf(String str) {
        return (EnumC319440Cfe) C08FF.LIZ(EnumC319440Cfe.class, str);
    }

    public EnumC319440Cfe(String str, int i) {
    }
}
