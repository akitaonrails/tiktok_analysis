package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07s8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1997807s8 {
    public static final EnumC1997807s8 FILE_DOWNLOAD;
    public static final /* synthetic */ EnumC1997807s8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1997807s8 TOOLS_API;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1997807s8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1997807s8 enumC1997807s8 = new EnumC1997807s8("FILE_DOWNLOAD", 0, "file_download");
        FILE_DOWNLOAD = enumC1997807s8;
        EnumC1997807s8 enumC1997807s82 = new EnumC1997807s8("TOOLS_API", 1, "tools_api");
        TOOLS_API = enumC1997807s82;
        EnumC1997807s8[] enumC1997807s8Arr = {enumC1997807s8, enumC1997807s82};
        LLILLJJLI = enumC1997807s8Arr;
        LLILLL = new C2254308sP(enumC1997807s8Arr);
    }

    public static EnumC1997807s8[] values() {
        return (EnumC1997807s8[]) LLILLJJLI.clone();
    }

    public final String getFailureReason() {
        return this.LL;
    }

    public static EnumC1997807s8 valueOf(String str) {
        return (EnumC1997807s8) C08FF.LIZ(EnumC1997807s8.class, str);
    }

    public EnumC1997807s8(String str, int i, String str2) {
        this.LL = str2;
    }
}
