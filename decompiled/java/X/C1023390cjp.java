package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0cjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023390cjp implements InterfaceC1007800cKg {
    public final /* synthetic */ InterfaceC1007800cKg LIZ;
    public final /* synthetic */ InterfaceC1007800cKg LIZIZ;

    public C1023390cjp(InterfaceC1007800cKg interfaceC1007800cKg, InterfaceC1007800cKg interfaceC1007800cKg2) {
        this.LIZ = interfaceC1007800cKg;
        this.LIZIZ = interfaceC1007800cKg2;
    }

    @Override // X.InterfaceC1007800cKg
    public final Map<String, Object> LIZ(C1196804mE c1196804mE, Map<String, Object> map, String str) {
        if (this.LIZ.LIZ(c1196804mE, map, str) != null) {
            return this.LIZIZ.LIZ(c1196804mE, map, str);
        }
        return null;
    }
}
