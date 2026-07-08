package X;

import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Psy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C658940Psy implements InterfaceC655600Pna {
    public final C661470Px3 LL;
    public final InterfaceC641090PCp LLILLJJLI;
    public final View LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1303));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1302));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1301));

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC655620Pnc
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    @Override // X.InterfaceC655600Pna
    public final C661490Px5 I1() {
        return (C661490Px5) this.LLILZLL.getValue();
    }

    public final C658960Pt0 LIZ() {
        return (C658960Pt0) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC655600Pna
    public final C655670Pnh u() {
        return (C655670Pnh) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC655620Pnc
    public final void LLJJJ() {
        LIZ().LLJJJ();
    }

    @Override // X.InterfaceC655620Pnc
    public final void LLLLLILLIL() {
        LIZ().LLLLLILLIL();
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return LIZ().isPlaying();
    }

    @Override // X.InterfaceC655620Pnc
    public final void onDestroy() {
        LIZ().onDestroy();
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C655580PnY.LIZJ(this);
    }

    @Override // X.InterfaceC655620Pnc
    public final void u4(long j) {
        LIZ().u4(j);
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C655580PnY.LIZLLL(this, j);
    }

    public C658940Psy(C661470Px3 c661470Px3, ImageView imageView, InterfaceC641090PCp interfaceC641090PCp, C652990PjN c652990PjN, InterfaceC652950PjJ interfaceC652950PjJ, View view) {
        this.LL = c661470Px3;
        this.LLILLJJLI = interfaceC641090PCp;
        this.LLILLL = view;
        if (c661470Px3 != null) {
            c661470Px3.setFillHeight(false);
            c661470Px3.setMScrollStateObserver(u());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c661470Px3.hashCode());
            sbLIZ.append(" new stateObserver ");
            AbstractC653010PjP mScrollStateObserver = c661470Px3.getMScrollStateObserver();
            sbLIZ.append(mScrollStateObserver != null ? mScrollStateObserver.hashCode() : 0);
            C2188811AlT.LIZIZ(sbLIZ);
            c661470Px3.setMScrollStateManager(c652990PjN);
            C661490Px5 dataProvider = c661470Px3.getDataProvider();
            if (dataProvider != null) {
                dataProvider.LJI = interfaceC652950PjJ;
            }
            C661490Px5 dataProvider2 = c661470Px3.getDataProvider();
            if (dataProvider2 != null) {
                dataProvider2.LJII = interfaceC641090PCp;
            }
            C661490Px5 dataProvider3 = c661470Px3.getDataProvider();
            if (dataProvider3 != null) {
                dataProvider3.LIZ = view;
            }
            C661490Px5 dataProvider4 = c661470Px3.getDataProvider();
            if (dataProvider4 != null) {
                dataProvider4.LJIIJ = LIZ();
            }
            C661490Px5 dataProvider5 = c661470Px3.getDataProvider();
            if (dataProvider5 != null) {
                dataProvider5.LJIIZILJ = "general_search";
            }
            c661470Px3.setMCoverView(imageView);
        }
    }
}
