package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil;
import com.ss.android.ugc.aweme.commercialize.promote.service.PromoteUtilImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0zqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911600zqQ implements IPromoteUtil {
    public static final C1911600zqQ LIZIZ = new C1911600zqQ();
    public final /* synthetic */ IPromoteUtil LIZ;

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LIZ(Aweme aweme) {
        return this.LIZ.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final View.OnClickListener LJFF(Aweme aweme) {
        return this.LIZ.LJFF(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final boolean LJI(Aweme aweme, C21279718Pj c21279718Pj) {
        return this.LIZ.LJI(aweme, c21279718Pj);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final void LJII(String str, String str2, String str3) {
        this.LIZ.LJII(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.live.promote.IPromoteUtil
    public final String LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    public C1911600zqQ() {
        IPromoteUtil iPromoteUtil;
        Object objLIZ = C04TD.LIZ(IPromoteUtil.class, false);
        if (objLIZ != null) {
            iPromoteUtil = (IPromoteUtil) objLIZ;
        } else {
            if (C04TD.LLLILZLLLI == null) {
                synchronized (IPromoteUtil.class) {
                    if (C04TD.LLLILZLLLI == null) {
                        C04TD.LLLILZLLLI = new PromoteUtilImpl();
                    }
                }
            }
            iPromoteUtil = C04TD.LLLILZLLLI;
        }
        this.LIZ = iPromoteUtil;
    }
}
