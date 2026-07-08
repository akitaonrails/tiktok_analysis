package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC682580Qq0 {
    public static final EnumC682580Qq0 JSB;
    public static final /* synthetic */ EnumC682580Qq0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC682580Qq0 NATIVE_BANNER;
    public static final EnumC682580Qq0 POI;
    public final String LL;

    public static InterfaceC2044707zh<EnumC682580Qq0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC682580Qq0 enumC682580Qq0 = new EnumC682580Qq0("NATIVE_BANNER", 0, "native_banner");
        NATIVE_BANNER = enumC682580Qq0;
        EnumC682580Qq0 enumC682580Qq02 = new EnumC682580Qq0("JSB", 1, "jsb");
        JSB = enumC682580Qq02;
        EnumC682580Qq0 enumC682580Qq03 = new EnumC682580Qq0("POI", 2, "poi");
        POI = enumC682580Qq03;
        EnumC682580Qq0[] enumC682580Qq0Arr = {enumC682580Qq0, enumC682580Qq02, enumC682580Qq03};
        LLILLJJLI = enumC682580Qq0Arr;
        LLILLL = new C2254308sP(enumC682580Qq0Arr);
    }

    public static EnumC682580Qq0[] values() {
        return (EnumC682580Qq0[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC682580Qq0 valueOf(String str) {
        return (EnumC682580Qq0) C08FF.LIZ(EnumC682580Qq0.class, str);
    }

    public EnumC682580Qq0(String str, int i, String str2) {
        this.LL = str2;
    }
}
