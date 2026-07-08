package X;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1A9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174821A9o implements InterfaceC1694900uCu {
    public final View LIZ;
    public final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS577S0100000_33(this, 4202));

    @Override // X.InterfaceC1694900uCu
    public final void LIZJ() {
        if (Build.VERSION.SDK_INT >= 34) {
            LIZLLL().startStylusHandwriting(this.LIZ);
        }
    }

    public final InputMethodManager LIZLLL() {
        return (InputMethodManager) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1694900uCu
    public final void LIZIZ() {
        LIZLLL().restartInput(this.LIZ);
    }

    @Override // X.InterfaceC1694900uCu
    public final boolean isActive() {
        return LIZLLL().isActive(this.LIZ);
    }

    public C2174821A9o(View view) {
        this.LIZ = view;
        new C1A6Q(view);
    }

    @Override // X.InterfaceC1694900uCu
    public final void updateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) {
        LIZLLL().updateCursorAnchorInfo(this.LIZ, cursorAnchorInfo);
    }

    @Override // X.InterfaceC1694900uCu
    public final void updateExtractedText(int i, ExtractedText extractedText) {
        LIZLLL().updateExtractedText(this.LIZ, i, extractedText);
    }

    @Override // X.InterfaceC1694900uCu
    public final void LIZ(int i, int i2, int i3, int i4) {
        LIZLLL().updateSelection(this.LIZ, i, i2, i3, i4);
    }
}
