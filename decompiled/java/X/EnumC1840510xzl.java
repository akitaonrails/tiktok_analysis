package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1840510xzl {
    public static final EnumC1840510xzl FINGER_END;
    public static final EnumC1840510xzl FINGER_ERROR;
    public static final /* synthetic */ EnumC1840510xzl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1840510xzl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1840510xzl enumC1840510xzl = new EnumC1840510xzl("FINGER_ERROR", 0);
        FINGER_ERROR = enumC1840510xzl;
        EnumC1840510xzl enumC1840510xzl2 = new EnumC1840510xzl("FINGER_END", 1);
        FINGER_END = enumC1840510xzl2;
        EnumC1840510xzl[] enumC1840510xzlArr = {enumC1840510xzl, enumC1840510xzl2};
        LL = enumC1840510xzlArr;
        LLILLJJLI = new C2254308sP(enumC1840510xzlArr);
    }

    public static EnumC1840510xzl[] values() {
        return (EnumC1840510xzl[]) LL.clone();
    }

    public static EnumC1840510xzl valueOf(String str) {
        return (EnumC1840510xzl) C08FF.LIZ(EnumC1840510xzl.class, str);
    }

    public EnumC1840510xzl(String str, int i) {
    }
}
