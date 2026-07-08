package X;

import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510640K0w extends C510480K0g {
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

    public C510640K0w(PGCGetSubPrivilegeDetailResponse.Data data, String str) {
        super("item_privilege_header", 0, "about_me", data, null);
        this.LJFF = "item_privilege_header";
        this.LJI = 0;
        this.LJII = "about_me";
        this.LJIIIIZZ = str;
    }
}
