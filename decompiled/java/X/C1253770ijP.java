package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0ijP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253770ijP extends AbstractC1386140mAu<C1253770ijP> {
    public String LJJLIIIJ;
    public Aweme LJJLIIIJILLIZJL;

    public C1253770ijP() {
        super("tab_stay_time");
    }

    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJJLIIIJ;
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        LJFF("duration", str, c2082308Dt);
        LJFF("enter_from", this.LIZLLL, c2082308Dt);
        LJFF("group_id", C735370Ssx.LIZJ(this.LJJLIIIJILLIZJL), c2082308Dt);
        LJFF("author_id", C735370Ssx.LIZLLL(this.LJJLIIIJILLIZJL), c2082308Dt);
        LJFF("city_info", "", c2082308Dt);
        LJFF("enter_method", null, c2082308Dt);
        if (TextUtils.isEmpty(null)) {
            return;
        }
        LJFF("page_type", null, c2082308Dt);
    }

    @Override // X.AbstractC1386140mAu
    public final void LJIJI(Aweme aweme) {
        super.LJIJI(aweme);
        this.LJJLIIIJILLIZJL = aweme;
    }
}
