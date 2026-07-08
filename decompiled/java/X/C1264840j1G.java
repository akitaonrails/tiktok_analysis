package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0j1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264840j1G extends AbstractC1386130mAt<C1264840j1G> {
    public int LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;

    public C1264840j1G() {
        super("follow_list_user_click");
        this.LJIILLIIL = -1;
        this.LJIIZILJ = "";
        this.LJIJ = "";
        this.LJIJI = CardStruct.IStatusCode.DEFAULT;
        this.LJIJJ = CardStruct.IStatusCode.DEFAULT;
        this.LJIJJLI = "";
        this.LJIL = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        LJ("has_label", this.LJIJJ);
        LJ("is_rec", this.LJIJI);
        LIZLLL(this.LJIILLIIL, "impr_order");
        LJ("req_id", this.LJIIZILJ);
        LJ("to_user_id", this.LJIJ);
        LJ("enter_from", EnumC1247200iYo.FOLLOWING.getMobString());
        LJ("enter_method", this.LJIJJLI);
        LJ("new_post_tag", this.LJIL);
    }
}
