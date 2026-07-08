package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.127d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197035127d extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public InterfaceC197034127c LLILZLL;

    private final LinearLayout getCellContainer() {
        return (LinearLayout) this.LLILZ.getValue();
    }

    private final C0OM1 getNavBar() {
        return (C0OM1) this.LLILZIL.getValue();
    }

    private final TuxNavBar getNavBarView() {
        return (TuxNavBar) this.LLILLL.getValue();
    }

    private final C127K getProcessDraftCell() {
        return (C127K) this.LL.getValue();
    }

    private final C127K getStopGeneratingCell() {
        return (C127K) this.LLILLJJLI.getValue();
    }

    public C197035127d(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 924));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 925));
        this.LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 923));
        this.LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 922));
        this.LLILZIL = C452501pT.LIZIZ(new AwS413S0200000_12(context, this, 48));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.wt, this, true);
        TuxNavBar navBarView = getNavBarView();
        if (navBarView != null) {
            navBarView.setNavActions(getNavBar());
        }
        LinearLayout cellContainer = getCellContainer();
        if (cellContainer != null) {
            cellContainer.setOutlineProvider(new C0ID9(21));
        }
        LinearLayout cellContainer2 = getCellContainer();
        if (cellContainer2 != null) {
            cellContainer2.setClipToOutline(true);
        }
        if (((Boolean) C258890ACp.LIZ.getValue()).booleanValue()) {
            C127K processDraftCell = getProcessDraftCell();
            if (processDraftCell != null) {
                processDraftCell.setIcon(AnonymousClass0207.get$arr$(95));
            }
        } else {
            C127K processDraftCell2 = getProcessDraftCell();
            if (processDraftCell2 != null) {
                C786410Ut5.LLZLL(processDraftCell2, 8);
            }
        }
        C127K stopGeneratingCell = getStopGeneratingCell();
        if (stopGeneratingCell != null) {
            stopGeneratingCell.setIcon(AnonymousClass0207.get$arr$(96));
        }
        C127K processDraftCell3 = getProcessDraftCell();
        if (processDraftCell3 != null) {
            processDraftCell3.setOnClickListener(new AwS608S0100000_29(this, 652));
        }
        C127K stopGeneratingCell2 = getStopGeneratingCell();
        if (stopGeneratingCell2 != null) {
            stopGeneratingCell2.setOnClickListener(new AwS608S0100000_29(this, 653));
        }
    }

    public final void LIZ(long j) {
        Context context;
        if (C1460090o6B.LIZ() || (context = getContext()) == null) {
            return;
        }
        String strLIZ = C0T8Y.LIZ(2131755023, 2131755024, j, context);
        TuxNavBar navBarView = getNavBarView();
        if (navBarView != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = strLIZ;
            navBarView.LJIJJ(c1250250idj);
        }
    }

    public final void setAILivePhotoSheetEventListener(InterfaceC197034127c interfaceC197034127c) {
        this.LLILZLL = interfaceC197034127c;
    }
}
