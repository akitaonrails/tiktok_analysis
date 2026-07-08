package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC334560D9q {
    public static final EnumC334560D9q FAILED;
    public static final EnumC334560D9q INITIAL_LOADING;
    public static final /* synthetic */ EnumC334560D9q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC334560D9q READY;
    public static final EnumC334560D9q STALE;

    public static InterfaceC2044707zh<EnumC334560D9q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC334560D9q enumC334560D9q = new EnumC334560D9q("INITIAL_LOADING", 0);
        INITIAL_LOADING = enumC334560D9q;
        EnumC334560D9q enumC334560D9q2 = new EnumC334560D9q("READY", 1);
        READY = enumC334560D9q2;
        EnumC334560D9q enumC334560D9q3 = new EnumC334560D9q("FAILED", 2);
        FAILED = enumC334560D9q3;
        EnumC334560D9q enumC334560D9q4 = new EnumC334560D9q("STALE", 3);
        STALE = enumC334560D9q4;
        EnumC334560D9q[] enumC334560D9qArr = {enumC334560D9q, enumC334560D9q2, enumC334560D9q3, enumC334560D9q4};
        LL = enumC334560D9qArr;
        LLILLJJLI = new C2254308sP(enumC334560D9qArr);
    }

    public static EnumC334560D9q[] values() {
        return (EnumC334560D9q[]) LL.clone();
    }

    public static EnumC334560D9q valueOf(String str) {
        return (EnumC334560D9q) C08FF.LIZ(EnumC334560D9q.class, str);
    }

    public EnumC334560D9q(String str, int i) {
    }
}
