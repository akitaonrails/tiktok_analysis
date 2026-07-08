package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1A2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172881A2c implements C1A2Z {
    public static final C01GW<C2172881A2c> LIZJ = C452501pT.LIZIZ(new C2172901A2e());
    public final C01GW LIZ = C1509305vX.LIZ(new C2172891A2d());
    public final ConcurrentHashMap<EnumC1154930g9z, C1A2Y> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.C1A2Z
    public final C2172931A2h LIZ() {
        return (C2172931A2h) this.LIZ.getValue();
    }

    @Override // X.C1A2Z
    public final C1A2Y LIZIZ(EnumC1154930g9z enumC1154930g9z) {
        C1A2Y c1a2y = this.LIZIZ.get(enumC1154930g9z);
        if (c1a2y == null) {
            C1702910uPp c1702910uPp = new C1702910uPp(enumC1154930g9z);
            this.LIZIZ.put(enumC1154930g9z, c1702910uPp);
            return c1702910uPp;
        }
        return c1a2y;
    }
}
