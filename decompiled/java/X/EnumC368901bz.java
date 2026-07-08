package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC368901bz {
    public static final EnumC368901bz IMAGE;
    public static final EnumC368901bz INIT_IMAGE;
    public static final /* synthetic */ EnumC368901bz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC368901bz LOTTIE;

    public static InterfaceC2044707zh<EnumC368901bz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC368901bz enumC368901bz = new EnumC368901bz("LOTTIE", 0);
        LOTTIE = enumC368901bz;
        EnumC368901bz enumC368901bz2 = new EnumC368901bz("IMAGE", 1);
        IMAGE = enumC368901bz2;
        EnumC368901bz enumC368901bz3 = new EnumC368901bz("INIT_IMAGE", 2);
        INIT_IMAGE = enumC368901bz3;
        EnumC368901bz[] enumC368901bzArr = {enumC368901bz, enumC368901bz2, enumC368901bz3};
        LL = enumC368901bzArr;
        LLILLJJLI = new C2254308sP(enumC368901bzArr);
    }

    public static EnumC368901bz[] values() {
        return (EnumC368901bz[]) LL.clone();
    }

    public static EnumC368901bz valueOf(String str) {
        return (EnumC368901bz) C08FF.LIZ(EnumC368901bz.class, str);
    }

    public EnumC368901bz(String str, int i) {
    }
}
