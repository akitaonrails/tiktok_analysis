package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC047300Fb {
    public static final EnumC047300Fb LL;
    public static final EnumC047300Fb LLILLJJLI;
    public static final /* synthetic */ EnumC047300Fb[] LLILLL;

    static {
        EnumC047300Fb enumC047300Fb = new EnumC047300Fb("ACTION_ITEMS", 0);
        LL = enumC047300Fb;
        EnumC047300Fb enumC047300Fb2 = new EnumC047300Fb("CANCEL_PLACE", 1);
        LLILLJJLI = enumC047300Fb2;
        EnumC047300Fb[] enumC047300FbArr = {enumC047300Fb, enumC047300Fb2};
        LLILLL = enumC047300FbArr;
        new C2254308sP(enumC047300FbArr);
    }

    public static EnumC047300Fb[] values() {
        return (EnumC047300Fb[]) LLILLL.clone();
    }

    public static EnumC047300Fb valueOf(String str) {
        return (EnumC047300Fb) C08FF.LIZ(EnumC047300Fb.class, str);
    }

    public EnumC047300Fb(String str, int i) {
    }
}
