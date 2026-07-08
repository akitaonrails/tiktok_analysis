package X;

import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0K, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0K extends C510480K0g {
    public final String LJFF;
    public final int LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;

    @Override // X.C510480K0g
    public final String LIZIZ() {
        return this.LJII;
    }

    @Override // X.C510480K0g
    public final int LIZJ() {
        return this.LJI;
    }

    @Override // X.C510480K0g, X.InterfaceC339570DSx
    public final String LJJJ() {
        return this.LJFF;
    }

    public C0K0K(PGCGetSubPrivilegeDetailResponse.Data data) {
        super("item_privilege_price_info", 1, "multi_tier", data, null);
        this.LJFF = "item_privilege_price_info";
        this.LJI = 1;
        this.LJII = "multi_tier";
        this.LJIIIIZZ = true;
    }
}
