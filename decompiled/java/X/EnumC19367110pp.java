package X;

/* JADX INFO: renamed from: X.10pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public enum EnumC19367110pp {
    STRATEGY_DEFAULT,
    STRATEGY_ONETHREAD_ONEOUT,
    STRATEGY_ONETHREAD_TWOOUT,
    STRATEGY_TWOTHREAD_ONEOUT,
    STRATEGY_TWOTHREAD_TWOOUT;

    public static EnumC19367110pp valueOf(String str) {
        return (EnumC19367110pp) C08FF.LIZ(EnumC19367110pp.class, str);
    }
}
