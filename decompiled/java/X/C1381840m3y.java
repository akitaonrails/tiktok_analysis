package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381840m3y extends AbstractC1381820m3w {
    public final int LLJ;
    public final List<String> LLJI;
    public final Set<String> LLJIJIL;
    public final List<IMContact> LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final C01GW LLJJ;
    public final C1382300m4i<IMContact> LLJJI;
    public C1382250m4d<IMContact> LLJJIII;

    @Override // X.AbstractC1381820m3w
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC1381820m3w
    public final C1381890m43 LIZ() {
        return new C1381890m43(this.LL);
    }

    @Override // X.AbstractC1381820m3w
    public final C1382250m4d LJI() {
        C1382250m4d<IMContact> c1382250m4d = this.LLJJIII;
        if (c1382250m4d != null) {
            return c1382250m4d;
        }
        C1382120m4Q c1382120m4Q = new C1382120m4Q();
        c1382120m4Q.LIZ.LIZIZ = this.LLJJI;
        c1382120m4Q.LIZ.LIZJ = new C1367980lhc(this);
        c1382120m4Q.LIZ.LIZLLL = new C1381830m3x(this);
        C1367790lhJ c1367790lhJ = new C1367790lhJ(this);
        C1382250m4d c1382250m4d2 = c1382120m4Q.LIZ;
        c1382250m4d2.LJ = c1367790lhJ;
        c1382250m4d2.LIZ = this;
        this.LLJJIII = c1382250m4d2;
        return c1382250m4d2;
    }

    public final boolean LJIIIZ() {
        if (this.LLJILJILJ || this.LLJILLL) {
            return Intrinsics.LJFF(this.LL.LIZLLL, "aweme") || Intrinsics.LJFF(this.LL.LIZLLL, "aweme_photo");
        }
        return false;
    }

    public C1381840m3y(C1368260li4 c1368260li4) {
        boolean z;
        super(c1368260li4);
        this.LLJ = 15;
        this.LLJI = new ArrayList();
        this.LLJIJIL = new LinkedHashSet();
        this.LLJILJIL = new ArrayList();
        int i = c1368260li4.LIZ;
        boolean z2 = false;
        if (i == 1 && c1368260li4.LJIJ == EnumC626460Ohg.NORMAL) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJILJ = z;
        if (i == 1 && c1368260li4.LJIJ == EnumC626460Ohg.LONG_PRESS) {
            z2 = true;
        }
        this.LLJILLL = z2;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(693));
        this.LLJJ = c01gwLIZIZ;
        C1382300m4i<IMContact> c1382300m4i = new C1382300m4i<>();
        c1382300m4i.LIZ(this.LLILZIL);
        c1382300m4i.LIZ(this.LLILZLL);
        if (LJIIIZ()) {
            c1382300m4i.LIZ((AbstractC2250601D7a) c01gwLIZIZ.getValue());
        }
        this.LLJJI = c1382300m4i;
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC328360Cu2
    public final void WD2(Throwable th) {
        super.WD2(th);
    }

    @Override // X.AbstractC1381820m3w, X.InterfaceC328360Cu2
    public final void r61(List<IMContact> list, boolean z) {
        this.LL.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadSuccess filtered List size before limit: ");
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
