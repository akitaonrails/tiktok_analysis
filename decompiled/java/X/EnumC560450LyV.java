package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC560450LyV {
    public static final EnumC560450LyV ALBUM;
    public static final EnumC560450LyV CREATE;
    public static final EnumC560450LyV EDIT;
    public static final /* synthetic */ EnumC560450LyV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC560450LyV NONE;
    public static final EnumC560450LyV OTHERS;
    public static final EnumC560450LyV PUBLISH;
    public static final EnumC560450LyV RECORD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC560450LyV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC560450LyV enumC560450LyV = new EnumC560450LyV("RECORD", 0, "record");
        RECORD = enumC560450LyV;
        EnumC560450LyV enumC560450LyV2 = new EnumC560450LyV("CREATE", 1, "create");
        CREATE = enumC560450LyV2;
        EnumC560450LyV enumC560450LyV3 = new EnumC560450LyV("ALBUM", 2, "album");
        ALBUM = enumC560450LyV3;
        EnumC560450LyV enumC560450LyV4 = new EnumC560450LyV("EDIT", 3, "edit");
        EDIT = enumC560450LyV4;
        EnumC560450LyV enumC560450LyV5 = new EnumC560450LyV("PUBLISH", 4, "publish");
        PUBLISH = enumC560450LyV5;
        EnumC560450LyV enumC560450LyV6 = new EnumC560450LyV("OTHERS", 5, "others");
        OTHERS = enumC560450LyV6;
        EnumC560450LyV enumC560450LyV7 = new EnumC560450LyV("NONE", 6, "none");
        NONE = enumC560450LyV7;
        EnumC560450LyV[] enumC560450LyVArr = {enumC560450LyV, enumC560450LyV2, enumC560450LyV3, enumC560450LyV4, enumC560450LyV5, enumC560450LyV6, enumC560450LyV7};
        LLILLJJLI = enumC560450LyVArr;
        LLILLL = new C2254308sP(enumC560450LyVArr);
    }

    public static EnumC560450LyV[] values() {
        return (EnumC560450LyV[]) LLILLJJLI.clone();
    }

    public final String getPage() {
        return this.LL;
    }

    public static EnumC560450LyV valueOf(String str) {
        return (EnumC560450LyV) C08FF.LIZ(EnumC560450LyV.class, str);
    }

    public EnumC560450LyV(String str, int i, String str2) {
        this.LL = str2;
    }
}
