package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bNV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC971110bNV {
    public static final EnumC971110bNV COPY;
    public static final EnumC971110bNV DELETE;
    public static final /* synthetic */ EnumC971110bNV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC971110bNV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC971110bNV enumC971110bNV = new EnumC971110bNV("COPY", 0);
        COPY = enumC971110bNV;
        EnumC971110bNV enumC971110bNV2 = new EnumC971110bNV("DELETE", 1);
        DELETE = enumC971110bNV2;
        EnumC971110bNV[] enumC971110bNVArr = {enumC971110bNV, enumC971110bNV2};
        LL = enumC971110bNVArr;
        LLILLJJLI = new C2254308sP(enumC971110bNVArr);
    }

    public static EnumC971110bNV[] values() {
        return (EnumC971110bNV[]) LL.clone();
    }

    public static EnumC971110bNV valueOf(String str) {
        return (EnumC971110bNV) C08FF.LIZ(EnumC971110bNV.class, str);
    }

    public EnumC971110bNV(String str, int i) {
    }
}
