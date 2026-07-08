package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;

/* JADX INFO: renamed from: X.0m45, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381910m45 extends AbstractC1368180lhw {
    public final C1382380m4q LLJJI;
    public final C1382300m4i<IMContact> LLJJIII;
    public C1382250m4d<IMContact> LLJJIJI;

    @Override // X.AbstractC1381820m3w
    public final C1382250m4d LJI() {
        C1382250m4d<IMContact> c1382250m4d = this.LLJJIJI;
        if (c1382250m4d != null) {
            return c1382250m4d;
        }
        C1382120m4Q c1382120m4Q = new C1382120m4Q();
        c1382120m4Q.LIZ.LIZIZ = this.LLJJIII;
        C1381920m46 c1381920m46 = new C1381920m46(this);
        C1382250m4d c1382250m4d2 = c1382120m4Q.LIZ;
        c1382250m4d2.LIZLLL = c1381920m46;
        c1382250m4d2.LIZ = this;
        this.LLJJIJI = c1382250m4d2;
        return c1382250m4d2;
    }

    public C1381910m45(C1368260li4 c1368260li4) {
        String str;
        super(c1368260li4);
        if (c1368260li4.LIZIZ) {
            str = C1382030m4H.LIZ;
        } else {
            str = C1382030m4H.LIZLLL;
        }
        C1382050m4J c1382050m4J = new C1382050m4J();
        C1382380m4q c1382380m4q = c1382050m4J.LIZ;
        c1382380m4q.LJII = str;
        c1382380m4q.LJIIIIZZ = false;
        c1382050m4J.LIZJ(100);
        c1382050m4J.LIZIZ().LIZJ = new C1231660i9k(null);
        C1382380m4q c1382380m4q2 = c1382050m4J.LIZ;
        this.LLJJI = c1382380m4q2;
        C1382300m4i<IMContact> c1382300m4i = new C1382300m4i<>();
        c1382300m4i.LIZ(this.LLILZIL);
        c1382300m4i.LIZ(c1382380m4q2);
        this.LLJJIII = c1382300m4i;
    }
}
