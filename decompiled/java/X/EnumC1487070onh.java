package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0onh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1487070onh {
    public static final EnumC1487070onh EXIT;
    public static final /* synthetic */ EnumC1487070onh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1487070onh PLAY;
    public static final EnumC1487070onh PLAY_FAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1487070onh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1487070onh enumC1487070onh = new EnumC1487070onh("PLAY", 0, "play");
        PLAY = enumC1487070onh;
        EnumC1487070onh enumC1487070onh2 = new EnumC1487070onh("PLAY_FAIL", 1, "play_fail");
        PLAY_FAIL = enumC1487070onh2;
        EnumC1487070onh enumC1487070onh3 = new EnumC1487070onh("EXIT", 2, "exit");
        EXIT = enumC1487070onh3;
        EnumC1487070onh[] enumC1487070onhArr = {enumC1487070onh, enumC1487070onh2, enumC1487070onh3};
        LLILLJJLI = enumC1487070onhArr;
        LLILLL = new C2254308sP(enumC1487070onhArr);
    }

    public static EnumC1487070onh[] values() {
        return (EnumC1487070onh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1487070onh valueOf(String str) {
        return (EnumC1487070onh) C08FF.LIZ(EnumC1487070onh.class, str);
    }

    public EnumC1487070onh(String str, int i, String str2) {
        this.LL = str2;
    }
}
