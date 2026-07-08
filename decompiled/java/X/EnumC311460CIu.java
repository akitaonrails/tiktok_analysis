package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311460CIu {
    public static final /* synthetic */ EnumC311460CIu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC311460CIu PROFILE_AD_REQUEST_SOURCE_ENTER_DRAW;
    public static final EnumC311460CIu PROFILE_AD_REQUEST_SOURCE_LOAD_MORE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC311460CIu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC311460CIu enumC311460CIu = new EnumC311460CIu("PROFILE_AD_REQUEST_SOURCE_ENTER_DRAW", 0, 1);
        PROFILE_AD_REQUEST_SOURCE_ENTER_DRAW = enumC311460CIu;
        EnumC311460CIu enumC311460CIu2 = new EnumC311460CIu("PROFILE_AD_REQUEST_SOURCE_LOAD_MORE", 1, 2);
        PROFILE_AD_REQUEST_SOURCE_LOAD_MORE = enumC311460CIu2;
        EnumC311460CIu[] enumC311460CIuArr = {enumC311460CIu, enumC311460CIu2};
        LLILLJJLI = enumC311460CIuArr;
        LLILLL = new C2254308sP(enumC311460CIuArr);
    }

    public static EnumC311460CIu[] values() {
        return (EnumC311460CIu[]) LLILLJJLI.clone();
    }

    public final int getSOURCE() {
        return this.LL;
    }

    public static EnumC311460CIu valueOf(String str) {
        return (EnumC311460CIu) C08FF.LIZ(EnumC311460CIu.class, str);
    }

    public EnumC311460CIu(String str, int i, int i2) {
        this.LL = i2;
    }
}
