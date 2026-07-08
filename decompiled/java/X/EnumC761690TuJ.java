package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TuJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC761690TuJ {
    public static final EnumC761690TuJ DONE;
    public static final EnumC761690TuJ EDIT;
    public static final /* synthetic */ EnumC761690TuJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC761690TuJ TOP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC761690TuJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC761690TuJ enumC761690TuJ = new EnumC761690TuJ("EDIT", 0, "Edit");
        EDIT = enumC761690TuJ;
        EnumC761690TuJ enumC761690TuJ2 = new EnumC761690TuJ("DONE", 1, "Done");
        DONE = enumC761690TuJ2;
        EnumC761690TuJ enumC761690TuJ3 = new EnumC761690TuJ("TOP", 2, "Top");
        TOP = enumC761690TuJ3;
        EnumC761690TuJ[] enumC761690TuJArr = {enumC761690TuJ, enumC761690TuJ2, enumC761690TuJ3};
        LLILLJJLI = enumC761690TuJArr;
        LLILLL = new C2254308sP(enumC761690TuJArr);
    }

    public static EnumC761690TuJ[] values() {
        return (EnumC761690TuJ[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC761690TuJ valueOf(String str) {
        return (EnumC761690TuJ) C08FF.LIZ(EnumC761690TuJ.class, str);
    }

    public EnumC761690TuJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
