package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ohg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC626460Ohg {
    public static final EnumC626460Ohg DOWNLOAD;
    public static final /* synthetic */ EnumC626460Ohg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC626460Ohg LONG_PRESS;
    public static final EnumC626460Ohg NORMAL;

    public static InterfaceC2044707zh<EnumC626460Ohg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC626460Ohg enumC626460Ohg = new EnumC626460Ohg("LONG_PRESS", 0);
        LONG_PRESS = enumC626460Ohg;
        EnumC626460Ohg enumC626460Ohg2 = new EnumC626460Ohg("NORMAL", 1);
        NORMAL = enumC626460Ohg2;
        EnumC626460Ohg enumC626460Ohg3 = new EnumC626460Ohg("DOWNLOAD", 2);
        DOWNLOAD = enumC626460Ohg3;
        EnumC626460Ohg[] enumC626460OhgArr = {enumC626460Ohg, enumC626460Ohg2, enumC626460Ohg3};
        LL = enumC626460OhgArr;
        LLILLJJLI = new C2254308sP(enumC626460OhgArr);
    }

    public static EnumC626460Ohg[] values() {
        return (EnumC626460Ohg[]) LL.clone();
    }

    public static EnumC626460Ohg valueOf(String str) {
        return (EnumC626460Ohg) C08FF.LIZ(EnumC626460Ohg.class, str);
    }

    public EnumC626460Ohg(String str, int i) {
    }
}
