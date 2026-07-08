package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: renamed from: X.15HO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15HO {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;
    public LogPbBean LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public long LJIIJJI;
    public Integer LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL = "";
    public String LJIILL;
    public String LJIILLIIL;

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C15HO clone() {
        C15HO c15ho = new C15HO(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
        c15ho.LIZIZ(this.LJ);
        c15ho.LJI = this.LJI;
        c15ho.LJII = this.LJII;
        c15ho.LJFF = this.LJFF;
        c15ho.LJIIIZ = this.LJIIIZ;
        c15ho.LJIIJJI = this.LJIIJJI;
        c15ho.LJIIL = this.LJIIL;
        c15ho.LJIILIIL = this.LJIILIIL;
        c15ho.LJIILLIIL = this.LJIILLIIL;
        return c15ho;
    }

    public final void LIZIZ(String str) {
        this.LJ = str;
        if (TextUtils.equals(str, "recommend_mc_id")) {
            this.LIZIZ = "recommend";
        }
    }

    public C15HO(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
