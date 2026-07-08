package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m40, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381860m40 extends AbstractC1381820m3w {
    public final C1231704rr LLJ;
    public final C1382070m4L LLJI;
    public final String LLJIJIL;
    public final C1382380m4q LLJILJIL;

    @Override // X.AbstractC1381820m3w
    public final C1381890m43 LIZ() {
        return new C1381890m43(this.LL);
    }

    @Override // X.AbstractC1381820m3w
    public final C1382250m4d LJI() {
        C1382300m4i<R> c1382300m4i = new C1382300m4i<>();
        c1382300m4i.LIZ(this.LLILZIL);
        c1382300m4i.LIZ(this.LLJILJIL);
        c1382300m4i.LIZ(this.LLJI);
        C1382120m4Q c1382120m4Q = new C1382120m4Q();
        c1382120m4Q.LIZ.LIZIZ = c1382300m4i;
        c1382120m4Q.LIZ.LIZLLL = new C1381850m3z(this);
        C1367090lgB c1367090lgB = new C1367090lgB(this);
        C1382250m4d<R> c1382250m4d = c1382120m4Q.LIZ;
        c1382250m4d.LJ = c1367090lgB;
        c1382250m4d.LIZ = this;
        return c1382250m4d;
    }

    public C1381860m40(C1368260li4 c1368260li4) {
        C1231704rr c1231704rr = new C1231704rr("publish_share_model", null, 6);
        C1382070m4L c1382070m4L = new C1382060m4K().LIZ;
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        curUserId = curUserId == null ? "" : curUserId;
        super(c1368260li4);
        this.LLJ = c1231704rr;
        this.LLJI = c1382070m4L;
        this.LLJIJIL = curUserId;
        C1382050m4J c1382050m4J = new C1382050m4J();
        String str = C1382030m4H.LIZIZ;
        C1382380m4q c1382380m4q = c1382050m4J.LIZ;
        c1382380m4q.LJII = str;
        c1382380m4q.LJIIIIZZ = false;
        c1382050m4J.LIZ.LJI = new AwS565S0100000_21(this, 1675);
        c1382050m4J.LIZJ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LLJILJIL = c1382050m4J.LIZ;
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        super.WD2(th);
        this.LLJ.LIZIZ();
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC328360Cu2
    public final void r61(List<IMContact> list, boolean z) {
        super.r61(list, z);
        C1231704rr c1231704rr = this.LLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess final result list size ");
        sbLIZ.append(list.size());
        sbLIZ.append(", hasMore: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
    }
}
