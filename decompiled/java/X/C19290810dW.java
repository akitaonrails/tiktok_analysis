package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.10dW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19290810dW extends AbstractC1386130mAt {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;

    public C19290810dW() {
        super("launch_log");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJIILLIIL;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("launch_method", str, c2082308Dt);
        LJFF("push_id", null, c2082308Dt);
        LJFF("enter_to", this.LJIIZILJ, c2082308Dt);
        LJFF("red_badge_number", this.LJIJ, c2082308Dt);
        LJFF("is_cold_launch", this.LJIJI, c2082308Dt);
        LJ("is_share_link_launch", CardStruct.IStatusCode.DEFAULT);
        String str2 = this.LJIJJ;
        if (str2 == null) {
            str2 = "";
        }
        LJFF("channel", str2, c2082308Dt);
        LJ("sdk_name", this.LJIJJLI);
        LJ("sdk_version", this.LJIL);
    }
}
