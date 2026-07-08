package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC039600Cc {
    public static final EnumC039600Cc INSPECTOR;
    public static final /* synthetic */ EnumC039600Cc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC039600Cc NORMAL;
    public static final EnumC039600Cc RESHAPE;
    public static final EnumC039600Cc TRACKING;

    public static InterfaceC2044707zh<EnumC039600Cc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC039600Cc enumC039600Cc = new EnumC039600Cc("NORMAL", 0);
        NORMAL = enumC039600Cc;
        EnumC039600Cc enumC039600Cc2 = new EnumC039600Cc("INSPECTOR", 1);
        INSPECTOR = enumC039600Cc2;
        EnumC039600Cc enumC039600Cc3 = new EnumC039600Cc("RESHAPE", 2);
        RESHAPE = enumC039600Cc3;
        EnumC039600Cc enumC039600Cc4 = new EnumC039600Cc("TRACKING", 3);
        TRACKING = enumC039600Cc4;
        EnumC039600Cc[] enumC039600CcArr = {enumC039600Cc, enumC039600Cc2, enumC039600Cc3, enumC039600Cc4};
        LL = enumC039600CcArr;
        LLILLJJLI = new C2254308sP(enumC039600CcArr);
    }

    public static EnumC039600Cc[] values() {
        return (EnumC039600Cc[]) LL.clone();
    }

    public static EnumC039600Cc valueOf(String str) {
        return (EnumC039600Cc) C08FF.LIZ(EnumC039600Cc.class, str);
    }

    public EnumC039600Cc(String str, int i) {
    }
}
