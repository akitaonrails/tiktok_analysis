package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10s0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19380610s0 {
    public static final EnumC19380610s0 FLAT;
    public static final EnumC19380610s0 FOLD;
    public static final EnumC19380610s0 HALF_OPENED;
    public static final /* synthetic */ EnumC19380610s0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19380610s0 UNKNOWN;

    public static InterfaceC2044707zh<EnumC19380610s0> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19380610s0 enumC19380610s0 = new EnumC19380610s0("FOLD", 0);
        FOLD = enumC19380610s0;
        EnumC19380610s0 enumC19380610s02 = new EnumC19380610s0("HALF_OPENED", 1);
        HALF_OPENED = enumC19380610s02;
        EnumC19380610s0 enumC19380610s03 = new EnumC19380610s0("FLAT", 2);
        FLAT = enumC19380610s03;
        EnumC19380610s0 enumC19380610s04 = new EnumC19380610s0("UNKNOWN", 3);
        UNKNOWN = enumC19380610s04;
        EnumC19380610s0[] enumC19380610s0Arr = {enumC19380610s0, enumC19380610s02, enumC19380610s03, enumC19380610s04};
        LL = enumC19380610s0Arr;
        LLILLJJLI = new C2254308sP(enumC19380610s0Arr);
    }

    public static EnumC19380610s0[] values() {
        return (EnumC19380610s0[]) LL.clone();
    }

    public static EnumC19380610s0 valueOf(String str) {
        return (EnumC19380610s0) C08FF.LIZ(EnumC19380610s0.class, str);
    }

    public EnumC19380610s0(String str, int i) {
    }
}
