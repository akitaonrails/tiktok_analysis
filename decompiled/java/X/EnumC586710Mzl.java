package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586710Mzl {
    public static final /* synthetic */ EnumC586710Mzl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586710Mzl SKELETON_VIEW;
    public final String LL = "skeleton_view";

    public static InterfaceC2044707zh<EnumC586710Mzl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586710Mzl enumC586710Mzl = new EnumC586710Mzl();
        SKELETON_VIEW = enumC586710Mzl;
        EnumC586710Mzl[] enumC586710MzlArr = {enumC586710Mzl};
        LLILLJJLI = enumC586710MzlArr;
        LLILLL = new C2254308sP(enumC586710MzlArr);
    }

    public static EnumC586710Mzl[] values() {
        return (EnumC586710Mzl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC586710Mzl valueOf(String str) {
        return (EnumC586710Mzl) C08FF.LIZ(EnumC586710Mzl.class, str);
    }
}
