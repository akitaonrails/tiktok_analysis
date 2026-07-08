package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1540960qCc {
    public static final EnumC1540960qCc CACHED;
    public static final EnumC1540960qCc CREATE;
    public static final EnumC1540960qCc LAYOUT;
    public static final /* synthetic */ EnumC1540960qCc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1540960qCc LOAD;
    public static final EnumC1540960qCc RENDERED;

    public static InterfaceC2044707zh<EnumC1540960qCc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1540960qCc enumC1540960qCc = new EnumC1540960qCc("CREATE", 0);
        CREATE = enumC1540960qCc;
        EnumC1540960qCc enumC1540960qCc2 = new EnumC1540960qCc("LOAD", 1);
        LOAD = enumC1540960qCc2;
        EnumC1540960qCc enumC1540960qCc3 = new EnumC1540960qCc("LAYOUT", 2);
        LAYOUT = enumC1540960qCc3;
        EnumC1540960qCc enumC1540960qCc4 = new EnumC1540960qCc("RENDERED", 3);
        RENDERED = enumC1540960qCc4;
        EnumC1540960qCc enumC1540960qCc5 = new EnumC1540960qCc("CACHED", 4);
        CACHED = enumC1540960qCc5;
        EnumC1540960qCc[] enumC1540960qCcArr = {enumC1540960qCc, enumC1540960qCc2, enumC1540960qCc3, enumC1540960qCc4, enumC1540960qCc5};
        LL = enumC1540960qCcArr;
        LLILLJJLI = new C2254308sP(enumC1540960qCcArr);
    }

    public static EnumC1540960qCc[] values() {
        return (EnumC1540960qCc[]) LL.clone();
    }

    public static EnumC1540960qCc valueOf(String str) {
        return (EnumC1540960qCc) C08FF.LIZ(EnumC1540960qCc.class, str);
    }

    public EnumC1540960qCc(String str, int i) {
    }
}
