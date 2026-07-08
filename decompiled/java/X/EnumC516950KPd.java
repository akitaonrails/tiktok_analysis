package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC516950KPd {
    public static final EnumC516950KPd LL;
    public static final EnumC516950KPd LLILLJJLI;
    public static final EnumC516950KPd LLILLL;
    public static final EnumC516950KPd LLILZ;
    public static final /* synthetic */ EnumC516950KPd[] LLILZIL;

    static {
        EnumC516950KPd enumC516950KPd = new EnumC516950KPd("VIDEO_LIST", 0);
        LL = enumC516950KPd;
        EnumC516950KPd enumC516950KPd2 = new EnumC516950KPd("EMPTY_LIST", 1);
        LLILLJJLI = enumC516950KPd2;
        EnumC516950KPd enumC516950KPd3 = new EnumC516950KPd("NETWORK_ERROR", 2);
        LLILLL = enumC516950KPd3;
        EnumC516950KPd enumC516950KPd4 = new EnumC516950KPd("LOADING", 3);
        LLILZ = enumC516950KPd4;
        EnumC516950KPd[] enumC516950KPdArr = {enumC516950KPd, enumC516950KPd2, enumC516950KPd3, enumC516950KPd4};
        LLILZIL = enumC516950KPdArr;
        new C2254308sP(enumC516950KPdArr);
    }

    public static EnumC516950KPd[] values() {
        return (EnumC516950KPd[]) LLILZIL.clone();
    }

    public static EnumC516950KPd valueOf(String str) {
        return (EnumC516950KPd) C08FF.LIZ(EnumC516950KPd.class, str);
    }

    public EnumC516950KPd(String str, int i) {
    }
}
