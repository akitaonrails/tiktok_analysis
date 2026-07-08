package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.List;

/* JADX INFO: renamed from: X.0m42, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381880m42 extends AbstractC1381820m3w {
    public final int LLJ;
    public final C1382300m4i<IMContact> LLJI;
    public C1382250m4d<IMContact> LLJIJIL;

    @Override // X.AbstractC1381820m3w
    public final C1382250m4d LJI() {
        C1382250m4d<IMContact> c1382250m4d = this.LLJIJIL;
        if (c1382250m4d != null) {
            return c1382250m4d;
        }
        C1382120m4Q c1382120m4Q = new C1382120m4Q();
        c1382120m4Q.LIZ.LIZIZ = this.LLJI;
        C1381870m41 c1381870m41 = new C1381870m41(this);
        C1382250m4d c1382250m4d2 = c1382120m4Q.LIZ;
        c1382250m4d2.LIZLLL = c1381870m41;
        c1382250m4d2.LIZ = this;
        this.LLJIJIL = c1382250m4d2;
        return c1382250m4d2;
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        super.WD2(th);
    }

    public C1381880m42(C1368260li4 c1368260li4, int i) {
        super(c1368260li4);
        this.LLJ = i;
        C1382300m4i<IMContact> c1382300m4i = new C1382300m4i<>();
        c1382300m4i.LIZ(this.LLILZIL);
        c1382300m4i.LIZ(this.LLILZLL);
        this.LLJI = c1382300m4i;
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC328360Cu2
    public final void r61(List<IMContact> list, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess list size before limit: ");
        sbLIZ.append(list.size());
        sbLIZ.append(" hasMore: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        int size = list.size();
        int i = this.LLJ;
        if (size > i) {
            list = list.subList(0, i);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onLoadSuccess limit list size: ");
        sbLIZ2.append(list.size());
        sbLIZ2.append(" hasMore: ");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        super.r61(list, false);
    }
}
