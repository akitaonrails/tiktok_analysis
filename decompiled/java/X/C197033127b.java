package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.127b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197033127b extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public InterfaceC197034127c LLILZLL;
    public boolean LLIZ;

    private final C127K getApplyAILiveCell() {
        return (C127K) this.LL.getValue();
    }

    private final LinearLayout getCellContainer() {
        return (LinearLayout) this.LLILZ.getValue();
    }

    private final C127K getEditPromptCell() {
        return (C127K) this.LLILLJJLI.getValue();
    }

    private final C0OM1 getNavBar() {
        return (C0OM1) this.LLILZIL.getValue();
    }

    private final TuxNavBar getNavBarView() {
        return (TuxNavBar) this.LLILLL.getValue();
    }

    private final C127A getAILiveCellAccessory() {
        C127K applyAILiveCell = getApplyAILiveCell();
        C127M accessory = applyAILiveCell != null ? applyAILiveCell.getAccessory() : null;
        if (accessory instanceof C127A) {
            return (C127A) accessory;
        }
        return null;
    }

    private final C11G4 getEditPromptCellAccessory() {
        C127K editPromptCell = getEditPromptCell();
        C127M accessory = editPromptCell != null ? editPromptCell.getAccessory() : null;
        if (accessory instanceof C11G4) {
            return (C11G4) accessory;
        }
        return null;
    }

    public C197033127b(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 917));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS573S0100000_29(this, 919));
        this.LLILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 921));
        this.LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 918));
        this.LLILZIL = C452501pT.LIZIZ(new AwS413S0200000_12(context, this, 47));
        this.LLIZ = true;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ws, this, true);
        TuxNavBar navBarView = getNavBarView();
        if (navBarView != null) {
            navBarView.setNavActions(getNavBar());
        }
        LinearLayout cellContainer = getCellContainer();
        if (cellContainer != null) {
            cellContainer.setOutlineProvider(new C0ID9(19));
        }
        LinearLayout cellContainer2 = getCellContainer();
        if (cellContainer2 != null) {
            cellContainer2.setClipToOutline(true);
        }
        setOutlineProvider(new C0ID9(20));
        setClipToOutline(true);
        C127K editPromptCell = getEditPromptCell();
        if (editPromptCell != null) {
            editPromptCell.setSubTitleMaxLines(2);
        }
        C127A aILiveCellAccessory = getAILiveCellAccessory();
        if (aILiveCellAccessory != null) {
            aILiveCellAccessory.LJIILJJIL(this.LLIZ);
            C786410Ut5.I7(new ViewOnClickListenerC561930M2d(C0C64.LJIILLIIL().LJIJJLI(31744, 500L, "studio_ai_alive_switch_interval", true), new AwS573S0100000_29(this, 920)), aILiveCellAccessory.LIZIZ.LIZIZ);
            C426750GoL.LJIIIZ(aILiveCellAccessory.LIZIZ.LIZIZ, null, 0, null, null, false, 29);
        }
        C11G4 editPromptCellAccessory = getEditPromptCellAccessory();
        if (editPromptCellAccessory != null) {
            C426750GoL.LJIIIZ(editPromptCellAccessory.LIZIZ, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)))), null, null, false, 29);
            editPromptCellAccessory.LJIILL(new ACListenerS163S0100000_29(this, 222));
        }
    }

    public final void LIZ(boolean z) {
        this.LLIZ = z;
        C127A aILiveCellAccessory = getAILiveCellAccessory();
        if (aILiveCellAccessory != null) {
            aILiveCellAccessory.LJIILJJIL(z);
        }
    }

    public final void LIZIZ(String str) {
        C127K editPromptCell = getEditPromptCell();
        if (editPromptCell != null) {
            editPromptCell.setSubtitle(str);
        }
    }

    public final void setAILivePhotoSheetEventListener(InterfaceC197034127c interfaceC197034127c) {
        this.LLILZLL = interfaceC197034127c;
    }
}
