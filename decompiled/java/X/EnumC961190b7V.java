package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961190b7V {
    public static final /* synthetic */ EnumC961190b7V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC961190b7V NOT_EXISTED;
    public static final EnumC961190b7V PARAMS_MISMATCH;
    public static final EnumC961190b7V TIME_EXPIRED;

    public static InterfaceC2044707zh<EnumC961190b7V> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC961190b7V enumC961190b7V = new EnumC961190b7V("NOT_EXISTED", 0);
        NOT_EXISTED = enumC961190b7V;
        EnumC961190b7V enumC961190b7V2 = new EnumC961190b7V("TIME_EXPIRED", 1);
        TIME_EXPIRED = enumC961190b7V2;
        EnumC961190b7V enumC961190b7V3 = new EnumC961190b7V("PARAMS_MISMATCH", 2);
        PARAMS_MISMATCH = enumC961190b7V3;
        EnumC961190b7V[] enumC961190b7VArr = {enumC961190b7V, enumC961190b7V2, enumC961190b7V3};
        LL = enumC961190b7VArr;
        LLILLJJLI = new C2254308sP(enumC961190b7VArr);
    }

    public static EnumC961190b7V[] values() {
        return (EnumC961190b7V[]) LL.clone();
    }

    public static EnumC961190b7V valueOf(String str) {
        return (EnumC961190b7V) C08FF.LIZ(EnumC961190b7V.class, str);
    }

    public EnumC961190b7V(String str, int i) {
    }
}
