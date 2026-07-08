package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19365110pV {
    public static final EnumC19365110pV DISPLAY;
    public static final /* synthetic */ EnumC19365110pV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19365110pV LOAD_DATA;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19365110pV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19365110pV enumC19365110pV = new EnumC19365110pV("LOAD_DATA", 0, "load_data");
        LOAD_DATA = enumC19365110pV;
        EnumC19365110pV enumC19365110pV2 = new EnumC19365110pV("DISPLAY", 1, "display");
        DISPLAY = enumC19365110pV2;
        EnumC19365110pV[] enumC19365110pVArr = {enumC19365110pV, enumC19365110pV2};
        LLILLJJLI = enumC19365110pVArr;
        LLILLL = new C2254308sP(enumC19365110pVArr);
    }

    public static EnumC19365110pV[] values() {
        return (EnumC19365110pV[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC19365110pV valueOf(String str) {
        return (EnumC19365110pV) C08FF.LIZ(EnumC19365110pV.class, str);
    }

    public EnumC19365110pV(String str, int i, String str2) {
        this.LL = str2;
    }
}
