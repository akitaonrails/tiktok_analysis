package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154840g9q {
    public static final EnumC1154840g9q CACHE;
    public static final EnumC1154840g9q CACHE_FALLBACK_REMOTE;
    public static final EnumC1154840g9q INIT_DATA;
    public static final /* synthetic */ EnumC1154840g9q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154840g9q REMOTE;
    public static final EnumC1154840g9q UNKNOWN;

    public static InterfaceC2044707zh<EnumC1154840g9q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154840g9q enumC1154840g9q = new EnumC1154840g9q("CACHE", 0);
        CACHE = enumC1154840g9q;
        EnumC1154840g9q enumC1154840g9q2 = new EnumC1154840g9q("CACHE_FALLBACK_REMOTE", 1);
        CACHE_FALLBACK_REMOTE = enumC1154840g9q2;
        EnumC1154840g9q enumC1154840g9q3 = new EnumC1154840g9q("REMOTE", 2);
        REMOTE = enumC1154840g9q3;
        EnumC1154840g9q enumC1154840g9q4 = new EnumC1154840g9q("INIT_DATA", 3);
        INIT_DATA = enumC1154840g9q4;
        EnumC1154840g9q enumC1154840g9q5 = new EnumC1154840g9q("UNKNOWN", 4);
        UNKNOWN = enumC1154840g9q5;
        EnumC1154840g9q[] enumC1154840g9qArr = {enumC1154840g9q, enumC1154840g9q2, enumC1154840g9q3, enumC1154840g9q4, enumC1154840g9q5};
        LL = enumC1154840g9qArr;
        LLILLJJLI = new C2254308sP(enumC1154840g9qArr);
    }

    public static EnumC1154840g9q[] values() {
        return (EnumC1154840g9q[]) LL.clone();
    }

    public static EnumC1154840g9q valueOf(String str) {
        return (EnumC1154840g9q) C08FF.LIZ(EnumC1154840g9q.class, str);
    }

    public EnumC1154840g9q(String str, int i) {
    }
}
