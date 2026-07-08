package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2005107tJ {
    public static final EnumC2005107tJ LL;
    public static final EnumC2005107tJ LLILLJJLI;
    public static final /* synthetic */ EnumC2005107tJ[] LLILLL;

    public static EnumC2005107tJ valueOf(String str) {
        return (EnumC2005107tJ) C08FF.LIZ(EnumC2005107tJ.class, str);
    }

    public static EnumC2005107tJ[] values() {
        return (EnumC2005107tJ[]) LLILLL.clone();
    }

    static {
        EnumC2005107tJ enumC2005107tJ = new EnumC2005107tJ("VIEW_APPEAR", 0);
        LL = enumC2005107tJ;
        EnumC2005107tJ enumC2005107tJ2 = new EnumC2005107tJ("VIEW_DISAPPEAR", 1);
        LLILLJJLI = enumC2005107tJ2;
        EnumC2005107tJ[] enumC2005107tJArr = {enumC2005107tJ, enumC2005107tJ2};
        LLILLL = enumC2005107tJArr;
        new C2254308sP(enumC2005107tJArr);
    }

    public EnumC2005107tJ(String str, int i) {
    }
}
