package X;

import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K0I extends C510480K0g {
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

    public C0K0I(PGCGetSubPrivilegeDetailResponse.Data data, String str) {
        super("item_privilege_sub_banner", -10, "sub_banner", data, null);
        this.LJFF = "item_privilege_sub_banner";
        this.LJI = -10;
        this.LJII = "sub_banner";
        this.LJIIIIZZ = str;
    }
}
