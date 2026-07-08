package X;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1A9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC1294060jmO
public final class C2174811A9n implements InterfaceC1694880uCs {
    public final View LIZ;
    public final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS577S0100000_33(this, 3832));
    public final C1A6Q LIZJ;

    @Override // X.InterfaceC1694880uCs
    public final void LIZIZ() {
        ((InputMethodManager) this.LIZIZ.getValue()).restartInput(this.LIZ);
    }

    @Override // X.InterfaceC1694880uCs
    public final void N2() {
        this.LIZJ.LIZ.LIZ();
    }

    @Override // X.InterfaceC1694880uCs
    public final void N4() {
        this.LIZJ.LIZ();
    }

    @Override // X.InterfaceC1694880uCs
    public final boolean isActive() {
        return ((InputMethodManager) this.LIZIZ.getValue()).isActive(this.LIZ);
    }

    public C2174811A9n(View view) {
        this.LIZ = view;
        this.LIZJ = new C1A6Q(view);
    }

    @Override // X.InterfaceC1694880uCs
    public final void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        ((InputMethodManager) this.LIZIZ.getValue()).updateCursorAnchorInfo(this.LIZ, cursorAnchorInfo);
    }

    @Override // X.InterfaceC1694880uCs
    public final void updateExtractedText(int i, ExtractedText extractedText) {
        ((InputMethodManager) this.LIZIZ.getValue()).updateExtractedText(this.LIZ, i, extractedText);
    }

    @Override // X.InterfaceC1694880uCs
    public final void LIZ(int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.LIZIZ.getValue()).updateSelection(this.LIZ, i, i2, i3, i4);
    }
}
