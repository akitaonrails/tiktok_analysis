package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0x7V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1806870x7V {
    public static final EnumC1806870x7V FROZEN;
    public static final /* synthetic */ EnumC1806870x7V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1806870x7V NORMAL;
    public static final EnumC1806870x7V NOT_APPLICABLE_NEED_LESS;
    public static final EnumC1806870x7V NOT_APPLICABLE_NEED_MORE;

    public static InterfaceC2044707zh<EnumC1806870x7V> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1806870x7V enumC1806870x7V = new EnumC1806870x7V("NOT_APPLICABLE_NEED_LESS", 0);
        NOT_APPLICABLE_NEED_LESS = enumC1806870x7V;
        EnumC1806870x7V enumC1806870x7V2 = new EnumC1806870x7V("NOT_APPLICABLE_NEED_MORE", 1);
        NOT_APPLICABLE_NEED_MORE = enumC1806870x7V2;
        EnumC1806870x7V enumC1806870x7V3 = new EnumC1806870x7V("FROZEN", 2);
        FROZEN = enumC1806870x7V3;
        EnumC1806870x7V enumC1806870x7V4 = new EnumC1806870x7V("NORMAL", 3);
        NORMAL = enumC1806870x7V4;
        EnumC1806870x7V[] enumC1806870x7VArr = {enumC1806870x7V, enumC1806870x7V2, enumC1806870x7V3, enumC1806870x7V4};
        LL = enumC1806870x7VArr;
        LLILLJJLI = new C2254308sP(enumC1806870x7VArr);
    }

    public static EnumC1806870x7V[] values() {
        return (EnumC1806870x7V[]) LL.clone();
    }

    public static EnumC1806870x7V valueOf(String str) {
        return (EnumC1806870x7V) C08FF.LIZ(EnumC1806870x7V.class, str);
    }

    public EnumC1806870x7V(String str, int i) {
    }
}
