package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC911240Zow {
    public static final /* synthetic */ EnumC911240Zow[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC911240Zow LOADING;
    public static final EnumC911240Zow PLAYING;
    public static final EnumC911240Zow RETRY;
    public static final EnumC911240Zow UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC911240Zow> getEntries() {
        return LLILLL;
    }

    static {
        EnumC911240Zow enumC911240Zow = new EnumC911240Zow("UNKNOWN", 0, -1);
        UNKNOWN = enumC911240Zow;
        EnumC911240Zow enumC911240Zow2 = new EnumC911240Zow("PLAYING", 1, 0);
        PLAYING = enumC911240Zow2;
        EnumC911240Zow enumC911240Zow3 = new EnumC911240Zow("LOADING", 2, 1);
        LOADING = enumC911240Zow3;
        EnumC911240Zow enumC911240Zow4 = new EnumC911240Zow("RETRY", 3, 2);
        RETRY = enumC911240Zow4;
        EnumC911240Zow[] enumC911240ZowArr = {enumC911240Zow, enumC911240Zow2, enumC911240Zow3, enumC911240Zow4};
        LLILLJJLI = enumC911240ZowArr;
        LLILLL = new C2254308sP(enumC911240ZowArr);
    }

    public static EnumC911240Zow[] values() {
        return (EnumC911240Zow[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC911240Zow valueOf(String str) {
        return (EnumC911240Zow) C08FF.LIZ(EnumC911240Zow.class, str);
    }

    public EnumC911240Zow(String str, int i, int i2) {
        this.LL = i2;
    }
}
