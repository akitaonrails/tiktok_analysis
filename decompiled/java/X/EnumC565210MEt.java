package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC565210MEt {
    public static final EnumC565210MEt HIDE_AFTER_ANIMATION;
    public static final EnumC565210MEt HIDE_IN_MEAN_WHILE;
    public static final /* synthetic */ EnumC565210MEt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC565210MEt NONE;
    public static final EnumC565210MEt SHOW_AFTER_ANIMATION;
    public static final EnumC565210MEt SHOW_IN_MEAN_WHILE;

    public static InterfaceC2044707zh<EnumC565210MEt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC565210MEt enumC565210MEt = new EnumC565210MEt("SHOW_AFTER_ANIMATION", 0);
        SHOW_AFTER_ANIMATION = enumC565210MEt;
        EnumC565210MEt enumC565210MEt2 = new EnumC565210MEt("SHOW_IN_MEAN_WHILE", 1);
        SHOW_IN_MEAN_WHILE = enumC565210MEt2;
        EnumC565210MEt enumC565210MEt3 = new EnumC565210MEt("HIDE_AFTER_ANIMATION", 2);
        HIDE_AFTER_ANIMATION = enumC565210MEt3;
        EnumC565210MEt enumC565210MEt4 = new EnumC565210MEt("HIDE_IN_MEAN_WHILE", 3);
        HIDE_IN_MEAN_WHILE = enumC565210MEt4;
        EnumC565210MEt enumC565210MEt5 = new EnumC565210MEt("NONE", 4);
        NONE = enumC565210MEt5;
        EnumC565210MEt[] enumC565210MEtArr = {enumC565210MEt, enumC565210MEt2, enumC565210MEt3, enumC565210MEt4, enumC565210MEt5};
        LL = enumC565210MEtArr;
        LLILLJJLI = new C2254308sP(enumC565210MEtArr);
    }

    public static EnumC565210MEt[] values() {
        return (EnumC565210MEt[]) LL.clone();
    }

    public static EnumC565210MEt valueOf(String str) {
        return (EnumC565210MEt) C08FF.LIZ(EnumC565210MEt.class, str);
    }

    public EnumC565210MEt(String str, int i) {
    }
}
