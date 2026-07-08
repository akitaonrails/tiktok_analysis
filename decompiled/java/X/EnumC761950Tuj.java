package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC761950Tuj {
    public static final EnumC761950Tuj BLOCK;
    public static final /* synthetic */ EnumC761950Tuj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC761950Tuj NORMAL;
    public final long LL;

    public static InterfaceC2044707zh<EnumC761950Tuj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC761950Tuj enumC761950Tuj = new EnumC761950Tuj("NORMAL", 0, 1L);
        NORMAL = enumC761950Tuj;
        EnumC761950Tuj enumC761950Tuj2 = new EnumC761950Tuj("BLOCK", 1, 2L);
        BLOCK = enumC761950Tuj2;
        EnumC761950Tuj[] enumC761950TujArr = {enumC761950Tuj, enumC761950Tuj2};
        LLILLJJLI = enumC761950TujArr;
        LLILLL = new C2254308sP(enumC761950TujArr);
    }

    public static EnumC761950Tuj[] values() {
        return (EnumC761950Tuj[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC761950Tuj valueOf(String str) {
        return (EnumC761950Tuj) C08FF.LIZ(EnumC761950Tuj.class, str);
    }

    public EnumC761950Tuj(String str, int i, long j) {
        this.LL = j;
    }
}
