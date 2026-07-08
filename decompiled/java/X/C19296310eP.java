package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.10eP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19296310eP extends AbstractC1386130mAt {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;

    public C19296310eP() {
        super("qr_code_save");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJIILLIIL;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("previous_page", str, c2082308Dt);
        LJFF("platform", this.LJIIZILJ, c2082308Dt);
        LJFF("qr_code_type", this.LJIJ, c2082308Dt);
        LJFF("enter_method", null, c2082308Dt);
        LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, null, c2082308Dt);
    }
}
