package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC444370Hbf {
    public static final EnumC444370Hbf LL;
    public static final EnumC444370Hbf LLILLJJLI;
    public static final EnumC444370Hbf LLILLL;
    public static final /* synthetic */ EnumC444370Hbf[] LLILZ;

    static {
        EnumC444370Hbf enumC444370Hbf = new EnumC444370Hbf("LIST", 0);
        LL = enumC444370Hbf;
        EnumC444370Hbf enumC444370Hbf2 = new EnumC444370Hbf("SEARCH_INPUT", 1);
        LLILLJJLI = enumC444370Hbf2;
        EnumC444370Hbf enumC444370Hbf3 = new EnumC444370Hbf("SEARCH_RESULT", 2);
        LLILLL = enumC444370Hbf3;
        EnumC444370Hbf[] enumC444370HbfArr = {enumC444370Hbf, enumC444370Hbf2, enumC444370Hbf3};
        LLILZ = enumC444370HbfArr;
        new C2254308sP(enumC444370HbfArr);
    }

    public static EnumC444370Hbf[] values() {
        return (EnumC444370Hbf[]) LLILZ.clone();
    }

    public static EnumC444370Hbf valueOf(String str) {
        return (EnumC444370Hbf) C08FF.LIZ(EnumC444370Hbf.class, str);
    }

    public EnumC444370Hbf(String str, int i) {
    }
}
