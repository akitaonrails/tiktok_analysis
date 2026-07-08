package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HYd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC442850HYd {
    public static final EnumC442850HYd LL;
    public static final EnumC442850HYd LLILLJJLI;
    public static final EnumC442850HYd LLILLL;
    public static final /* synthetic */ EnumC442850HYd[] LLILZ;

    static {
        EnumC442850HYd enumC442850HYd = new EnumC442850HYd("TOP", 0);
        LL = enumC442850HYd;
        EnumC442850HYd enumC442850HYd2 = new EnumC442850HYd("BOTTOM", 1);
        LLILLJJLI = enumC442850HYd2;
        EnumC442850HYd enumC442850HYd3 = new EnumC442850HYd("ALONE", 2);
        LLILLL = enumC442850HYd3;
        EnumC442850HYd[] enumC442850HYdArr = {enumC442850HYd, enumC442850HYd2, enumC442850HYd3};
        LLILZ = enumC442850HYdArr;
        new C2254308sP(enumC442850HYdArr);
    }

    public static EnumC442850HYd[] values() {
        return (EnumC442850HYd[]) LLILZ.clone();
    }

    public static EnumC442850HYd valueOf(String str) {
        return (EnumC442850HYd) C08FF.LIZ(EnumC442850HYd.class, str);
    }

    public EnumC442850HYd(String str, int i) {
    }
}
