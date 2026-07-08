package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1534650q2R {
    public static final /* synthetic */ EnumC1534650q2R[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1534650q2R LYNX;
    public static final EnumC1534650q2R WEB;

    public static InterfaceC2044707zh<EnumC1534650q2R> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1534650q2R enumC1534650q2R = new EnumC1534650q2R("LYNX", 0);
        LYNX = enumC1534650q2R;
        EnumC1534650q2R enumC1534650q2R2 = new EnumC1534650q2R("WEB", 1);
        WEB = enumC1534650q2R2;
        EnumC1534650q2R[] enumC1534650q2RArr = {enumC1534650q2R, enumC1534650q2R2};
        LL = enumC1534650q2RArr;
        LLILLJJLI = new C2254308sP(enumC1534650q2RArr);
    }

    public static EnumC1534650q2R[] values() {
        return (EnumC1534650q2R[]) LL.clone();
    }

    public static EnumC1534650q2R valueOf(String str) {
        return (EnumC1534650q2R) C08FF.LIZ(EnumC1534650q2R.class, str);
    }

    public EnumC1534650q2R(String str, int i) {
    }
}
