package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1904890zfb {
    public static final EnumC1904890zfb DOUBLE_CLICK;
    public static final /* synthetic */ EnumC1904890zfb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1904890zfb LONG_PRESS;

    public static InterfaceC2044707zh<EnumC1904890zfb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1904890zfb enumC1904890zfb = new EnumC1904890zfb("LONG_PRESS", 0);
        LONG_PRESS = enumC1904890zfb;
        EnumC1904890zfb enumC1904890zfb2 = new EnumC1904890zfb("DOUBLE_CLICK", 1);
        DOUBLE_CLICK = enumC1904890zfb2;
        EnumC1904890zfb[] enumC1904890zfbArr = {enumC1904890zfb, enumC1904890zfb2};
        LL = enumC1904890zfbArr;
        LLILLJJLI = new C2254308sP(enumC1904890zfbArr);
    }

    public static EnumC1904890zfb[] values() {
        return (EnumC1904890zfb[]) LL.clone();
    }

    public static EnumC1904890zfb valueOf(String str) {
        return (EnumC1904890zfb) C08FF.LIZ(EnumC1904890zfb.class, str);
    }

    public EnumC1904890zfb(String str, int i) {
    }
}
