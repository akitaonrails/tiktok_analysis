package X;

import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0K0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510470K0f extends C510480K0g {
    public static final /* synthetic */ int LJIIIZ = 0;
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

    public C510470K0f(PGCGetSubPrivilegeDetailResponse.Data data, String str) {
        super("item_privilege_customized_perks", 30, "perks", data, null);
        this.LJFF = "item_privilege_customized_perks";
        this.LJI = 30;
        this.LJII = "perks";
        this.LJIIIIZZ = str;
    }
}
