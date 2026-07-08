package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.0PlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC654180PlI implements InterfaceC654140PlE {
    public final View LIZ;
    public final InterfaceC665370Q7z LIZIZ;

    @Override // X.InterfaceC654140PlE
    public final void hide() {
        C786410Ut5.LJLLLLLL(8, this.LIZ);
    }

    @Override // X.InterfaceC654140PlE
    public final void show() {
        C786410Ut5.LJLLLLLL(0, this.LIZ);
    }

    public AbstractC654180PlI(View view, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = view;
        this.LIZIZ = interfaceC665370Q7z;
    }

    public static void LIZLLL(TuxTextView tuxTextView, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(charSequence);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }
}
