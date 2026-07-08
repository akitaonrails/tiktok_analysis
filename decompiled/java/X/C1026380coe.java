package X;

import com.ss.android.ugc.aweme.ad.log.PageStayDurationHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0coe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026380coe implements InterfaceC1026410coh {
    public final Aweme LIZ;
    public boolean LIZIZ;
    public final PageStayDurationHelper LIZJ = new PageStayDurationHelper(new C1030200cuo());
    public final C1026390cof LIZLLL = new AbstractC1023470cjx() { // from class: X.0cof
        public final C1023630ckD<?>[] LIZ = new C1023630ckD[0];

        {
            Object[] objArr = new Object[0];
        }

        @Override // X.AbstractC1023380cjo, X.C1023640ckE
        public final C1023630ckD<?>[] getInternalLogics() {
            return this.LIZ;
        }
    };

    public final void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        Aweme aweme = this.LIZ;
        if (aweme != null && aweme.isAd()) {
            this.LIZJ.LIZ(true);
            PageStayDurationHelper pageStayDurationHelper = this.LIZJ;
            C1026390cof c1026390cof = this.LIZLLL;
            Aweme aweme2 = this.LIZ;
            PageStayDurationHelper.LIZIZ(pageStayDurationHelper, c1026390cof, "comment_ad", "comment_staytime", aweme2 != null ? aweme2.getAwemeRawAd() : null);
        }
        this.LIZIZ = true;
    }

    public final void LIZIZ() {
        if (this.LIZIZ) {
            Aweme aweme = this.LIZ;
            if (aweme != null && aweme.isAd()) {
                this.LIZJ.LL.LIZ();
            }
            this.LIZJ.LIZ(false);
            this.LIZIZ = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0cof] */
    public C1026380coe(Aweme aweme) {
        this.LIZ = aweme;
    }
}
