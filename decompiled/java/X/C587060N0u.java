package X;

/* JADX INFO: renamed from: X.0N0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587060N0u {
    public static final C587060N0u LIZJ = new C587060N0u(null, null, 3);
    public final EnumC587050N0t LIZ;
    public final EnumC587040N0s LIZIZ;

    public C587060N0u(EnumC587050N0t enumC587050N0t, EnumC587040N0s enumC587040N0s, int i) {
        enumC587050N0t = (i & 1) != 0 ? EnumC587050N0t.DEFAULT : enumC587050N0t;
        enumC587040N0s = (i & 2) != 0 ? EnumC587040N0s.FORWARD_LOOP : enumC587040N0s;
        this.LIZ = enumC587050N0t;
        this.LIZIZ = enumC587040N0s;
    }
}
