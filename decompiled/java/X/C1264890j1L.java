package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0j1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264890j1L extends AbstractC1386130mAt<C1264890j1L> {
    public int LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;

    public C1264890j1L() {
        super("follow_list_user_show");
        this.LJIILLIIL = -1;
        this.LJIIZILJ = "";
        this.LJIJ = "";
        this.LJIJI = CardStruct.IStatusCode.DEFAULT;
        this.LJIJJ = CardStruct.IStatusCode.DEFAULT;
        this.LJIJJLI = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        LJFF("enter_from", this.LIZLLL, InterfaceC1210900hcG.LIZ);
        LIZLLL(this.LJIILLIIL, "impr_order");
        LJ("req_id", this.LJIIZILJ);
        LJ("to_user_id", this.LJIJ);
        LJ("is_rec", this.LJIJI);
        LJ("has_label", this.LJIJJ);
        LJ("new_post_tag", this.LJIJJLI);
    }
}
