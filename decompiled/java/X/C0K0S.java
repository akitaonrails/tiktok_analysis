package X;

import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0S, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0S extends C510480K0g {
    public final String LJFF;
    public final int LJI;
    public final String LJII;
    public final String LJIIIIZZ;

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

    public C0K0S(PGCGetSubPrivilegeDetailResponse.Data data, String str) {
        super("item_privilege_combined_perk", 1, "combined_perk", data, null);
        this.LJFF = "item_privilege_combined_perk";
        this.LJI = 1;
        this.LJII = "combined_perk";
        this.LJIIIIZZ = str;
    }
}
