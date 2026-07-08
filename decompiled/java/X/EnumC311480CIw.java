package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311480CIw {
    public static final /* synthetic */ EnumC311480CIw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC311480CIw POPULAR_WORDS;
    public final String LL = "2";

    public static InterfaceC2044707zh<EnumC311480CIw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC311480CIw enumC311480CIw = new EnumC311480CIw();
        POPULAR_WORDS = enumC311480CIw;
        EnumC311480CIw[] enumC311480CIwArr = {enumC311480CIw};
        LLILLJJLI = enumC311480CIwArr;
        LLILLL = new C2254308sP(enumC311480CIwArr);
    }

    public static EnumC311480CIw[] values() {
        return (EnumC311480CIw[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC311480CIw valueOf(String str) {
        return (EnumC311480CIw) C08FF.LIZ(EnumC311480CIw.class, str);
    }
}
