package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TuH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC761670TuH {
    public static final /* synthetic */ EnumC761670TuH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC761670TuH NORMAL;
    public static final EnumC761670TuH SHORTCUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC761670TuH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC761670TuH enumC761670TuH = new EnumC761670TuH("NORMAL", 0, "normal");
        NORMAL = enumC761670TuH;
        EnumC761670TuH enumC761670TuH2 = new EnumC761670TuH("SHORTCUT", 1, "shortcut");
        SHORTCUT = enumC761670TuH2;
        EnumC761670TuH[] enumC761670TuHArr = {enumC761670TuH, enumC761670TuH2};
        LLILLJJLI = enumC761670TuHArr;
        LLILLL = new C2254308sP(enumC761670TuHArr);
    }

    public static EnumC761670TuH[] values() {
        return (EnumC761670TuH[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC761670TuH valueOf(String str) {
        return (EnumC761670TuH) C08FF.LIZ(EnumC761670TuH.class, str);
    }

    public EnumC761670TuH(String str, int i, String str2) {
        this.LL = str2;
    }
}
