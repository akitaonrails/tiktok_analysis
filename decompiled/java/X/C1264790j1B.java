package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0j1B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264790j1B extends AbstractC1386130mAt<C1264790j1B> {
    public String LJIILLIIL;
    public int LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;

    public C1264790j1B() {
        super("fan_list_user_show");
        this.LJIILLIIL = CardStruct.IStatusCode.DEFAULT;
        this.LJIIZILJ = -1;
        this.LJIJ = "";
        this.LJIJI = "";
        this.LJIJJ = CardStruct.IStatusCode.DEFAULT;
        this.LJIJJLI = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        LJFF("enter_from", this.LIZLLL, InterfaceC1210900hcG.LIZ);
        LJ("is_highlight", this.LJIILLIIL);
        LIZLLL(this.LJIIZILJ, "impr_order");
        LJ("req_id", this.LJIJ);
        LJ("to_user_id", this.LJIJI);
        LJ("is_rec", this.LJIJJ);
        LJ("has_label", this.LJIJJLI);
    }
}
