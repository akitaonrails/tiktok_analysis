package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11NU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11NU implements C09JN<C11LR> {
    public static final C11NU INSTANCE;
    public static final /* synthetic */ C11NU[] LL;

    static {
        C11NU c11nu = new C11NU();
        INSTANCE = c11nu;
        LL = new C11NU[]{c11nu};
    }

    public static C11NU[] values() {
        return (C11NU[]) LL.clone();
    }

    public static C11NU valueOf(String str) {
        return (C11NU) C08FF.LIZ(C11NU.class, str);
    }

    @Override // X.C09JN
    public void accept(C11LR c11lr) {
        c11lr.request(Long.MAX_VALUE);
    }
}
