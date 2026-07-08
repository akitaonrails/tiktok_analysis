package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21274318Nh {
    public static final EnumC21274318Nh FULL;
    public static final EnumC21274318Nh HALF_DOUBLE;
    public static final EnumC21274318Nh HALF_MIX;
    public static final EnumC21274318Nh HALF_SINGLE;
    public static final /* synthetic */ EnumC21274318Nh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21274318Nh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21274318Nh enumC21274318Nh = new EnumC21274318Nh("FULL", 0, "full");
        FULL = enumC21274318Nh;
        EnumC21274318Nh enumC21274318Nh2 = new EnumC21274318Nh("HALF_DOUBLE", 1, "half_double");
        HALF_DOUBLE = enumC21274318Nh2;
        EnumC21274318Nh enumC21274318Nh3 = new EnumC21274318Nh("HALF_SINGLE", 2, "half_single");
        HALF_SINGLE = enumC21274318Nh3;
        EnumC21274318Nh enumC21274318Nh4 = new EnumC21274318Nh("HALF_MIX", 3, "half_mix");
        HALF_MIX = enumC21274318Nh4;
        EnumC21274318Nh[] enumC21274318NhArr = {enumC21274318Nh, enumC21274318Nh2, enumC21274318Nh3, enumC21274318Nh4};
        LLILLJJLI = enumC21274318NhArr;
        LLILLL = new C2254308sP(enumC21274318NhArr);
    }

    public static EnumC21274318Nh[] values() {
        return (EnumC21274318Nh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21274318Nh valueOf(String str) {
        return (EnumC21274318Nh) C08FF.LIZ(EnumC21274318Nh.class, str);
    }

    public EnumC21274318Nh(String str, int i, String str2) {
        this.LL = str2;
    }
}
