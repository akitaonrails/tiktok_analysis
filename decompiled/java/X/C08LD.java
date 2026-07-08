package X;

/* JADX INFO: renamed from: X.08LD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LD {
    public final C2099108Kf<String, C1508790pMj> LIZ = new C2099108Kf<>(5);

    public final C1508790pMj LIZ(String str) {
        C1508790pMj c1508790pMj = this.LIZ.get(str);
        if (c1508790pMj == null) {
            C1508790pMj c1508790pMj2 = new C1508790pMj(0);
            this.LIZ.put(str, c1508790pMj2);
            return c1508790pMj2;
        }
        return c1508790pMj;
    }
}
