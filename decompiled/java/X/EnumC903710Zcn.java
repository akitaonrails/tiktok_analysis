package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zcn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC903710Zcn {
    public static final EnumC903710Zcn LLILLJJLI;
    public static final EnumC903710Zcn LLILLL;
    public static final /* synthetic */ EnumC903710Zcn[] LLILZ;
    public final String LL;

    static {
        EnumC903710Zcn enumC903710Zcn = new EnumC903710Zcn("NAVIGATING", 0, "navigating");
        LLILLJJLI = enumC903710Zcn;
        EnumC903710Zcn enumC903710Zcn2 = new EnumC903710Zcn("RENDERING", 1, "ui_rendering");
        LLILLL = enumC903710Zcn2;
        EnumC903710Zcn[] enumC903710ZcnArr = {enumC903710Zcn, enumC903710Zcn2};
        LLILZ = enumC903710ZcnArr;
        new C2254308sP(enumC903710ZcnArr);
    }

    public static EnumC903710Zcn[] values() {
        return (EnumC903710Zcn[]) LLILZ.clone();
    }

    public static EnumC903710Zcn valueOf(String str) {
        return (EnumC903710Zcn) C08FF.LIZ(EnumC903710Zcn.class, str);
    }

    public EnumC903710Zcn(String str, int i, String str2) {
        this.LL = str2;
    }
}
