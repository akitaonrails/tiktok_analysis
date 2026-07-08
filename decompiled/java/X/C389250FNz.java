package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389250FNz extends AbstractC1664490tPr<C389180FNs, C389160FNq> {
    public TuxIconView LLJJJIL;
    public RecyclerView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public C0FO0 LLJJL;
    public C0FO1 LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1037));

    public final C0FO6 LLLLLJIL() {
        return (C0FO6) this.LLJL.getValue();
    }

    public final RecyclerView LLLLLJLJLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.tua);
            this.LLJJJJ = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final C0FO0 LLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.v_panel_status);
            this.LLJJL = (C0FO0) callbackFindViewById;
        }
        return (C0FO0) callbackFindViewById;
    }

    public final TuxIconView LLLLLLIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.lyk);
            this.LLJJJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final void LLLLLLJ(C0FO2 c0fo2) {
        int i = C0FO4.LIZ[c0fo2.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    C0FO0 c0fo0LLLLLL = LLLLLL();
                    if (c0fo0LLLLLL != null) {
                        int visibility = c0fo0LLLLLL.getVisibility();
                        c0fo0LLLLLL.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility, 0, c0fo0LLLLLL);
                        c0fo0LLLLLL.bringToFront();
                        C786410Ut5.LJZL(4, c0fo0LLLLLL.getPanelLoadingGroupFromXml());
                        C786410Ut5.LJZL(0, c0fo0LLLLLL.getPanelNetErrorGroupFromXml());
                        C786410Ut5.LJZL(4, c0fo0LLLLLL.getPanelEmptyGroupFromXml());
                        C1295960jpS panelLoadingIconFromXml = c0fo0LLLLLL.getPanelLoadingIconFromXml();
                        if (panelLoadingIconFromXml != null) {
                            panelLoadingIconFromXml.cancelAnimation();
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            C0FO0 c0fo0LLLLLL2 = LLLLLL();
            if (c0fo0LLLLLL2 == null) {
                return;
            }
            c0fo0LLLLLL2.LIZ();
            return;
        }
        C0FO0 c0fo0LLLLLL3 = LLLLLL();
        if (c0fo0LLLLLL3 == null) {
            return;
        }
        int visibility2 = c0fo0LLLLLL3.getVisibility();
        c0fo0LLLLLL3.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, c0fo0LLLLLL3);
        C1295960jpS panelLoadingIconFromXml2 = c0fo0LLLLLL3.getPanelLoadingIconFromXml();
        if (panelLoadingIconFromXml2 == null) {
            return;
        }
        panelLoadingIconFromXml2.cancelAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[PHI: r5
      0x00ed: PHI (r5v5 android.view.View) = (r5v4 android.view.View), (r5v8 android.view.View) binds: [B:29:0x00e0, B:31:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C389250FNz.onActivityCreated(android.os.Bundle):void");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Sd(R.layout.t2, layoutInflater, null);
    }
}
