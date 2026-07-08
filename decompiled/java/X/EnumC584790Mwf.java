package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584790Mwf {
    public static final EnumC584790Mwf FAST;
    public static final /* synthetic */ EnumC584790Mwf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584790Mwf SLOW;

    public static InterfaceC2044707zh<EnumC584790Mwf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584790Mwf enumC584790Mwf = new EnumC584790Mwf("SLOW", 0);
        SLOW = enumC584790Mwf;
        EnumC584790Mwf enumC584790Mwf2 = new EnumC584790Mwf("FAST", 1);
        FAST = enumC584790Mwf2;
        EnumC584790Mwf[] enumC584790MwfArr = {enumC584790Mwf, enumC584790Mwf2};
        LL = enumC584790MwfArr;
        LLILLJJLI = new C2254308sP(enumC584790MwfArr);
    }

    public static EnumC584790Mwf[] values() {
        return (EnumC584790Mwf[]) LL.clone();
    }

    public static EnumC584790Mwf valueOf(String str) {
        return (EnumC584790Mwf) C08FF.LIZ(EnumC584790Mwf.class, str);
    }

    public EnumC584790Mwf(String str, int i) {
    }
}
