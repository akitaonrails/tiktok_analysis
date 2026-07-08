package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154220g8q {
    public static final EnumC1154220g8q CACHE_ONLY;
    public static final /* synthetic */ EnumC1154220g8q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154220g8q NETWORK_ONLY;
    public static final EnumC1154220g8q NET_WHEN_CACHE_MISS;

    public static InterfaceC2044707zh<EnumC1154220g8q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154220g8q enumC1154220g8q = new EnumC1154220g8q("NET_WHEN_CACHE_MISS", 0);
        NET_WHEN_CACHE_MISS = enumC1154220g8q;
        EnumC1154220g8q enumC1154220g8q2 = new EnumC1154220g8q("CACHE_ONLY", 1);
        CACHE_ONLY = enumC1154220g8q2;
        EnumC1154220g8q enumC1154220g8q3 = new EnumC1154220g8q("NETWORK_ONLY", 2);
        NETWORK_ONLY = enumC1154220g8q3;
        EnumC1154220g8q[] enumC1154220g8qArr = {enumC1154220g8q, enumC1154220g8q2, enumC1154220g8q3};
        LL = enumC1154220g8qArr;
        LLILLJJLI = new C2254308sP(enumC1154220g8qArr);
    }

    public static EnumC1154220g8q[] values() {
        return (EnumC1154220g8q[]) LL.clone();
    }

    public static EnumC1154220g8q valueOf(String str) {
        return (EnumC1154220g8q) C08FF.LIZ(EnumC1154220g8q.class, str);
    }

    public EnumC1154220g8q(String str, int i) {
    }
}
