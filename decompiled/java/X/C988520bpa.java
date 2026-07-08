package X;

import android.view.ViewStub;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988520bpa extends C1029530ctj {
    @Override // X.C1029530ctj, X.InterfaceC1029520cti
    public final InterfaceC988160bp0 LIZ(InterfaceC1029540ctk interfaceC1029540ctk) {
        ViewStub viewStub;
        if ((interfaceC1029540ctk instanceof C987450bnr) && (viewStub = ((C987450bnr) interfaceC1029540ctk).LJ) != null) {
            viewStub.setLayoutResource(R.layout.cw9);
            return new C988430bpR((LinearLayout) C786410Ut5.LJLLLL(viewStub));
        }
        return null;
    }
}
