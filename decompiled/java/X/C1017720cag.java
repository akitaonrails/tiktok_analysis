package X;

import android.view.ViewStub;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017720cag extends C1029530ctj {
    @Override // X.C1029530ctj, X.InterfaceC1029520cti
    public final InterfaceC988160bp0 LIZ(InterfaceC1029540ctk interfaceC1029540ctk) {
        ViewStub viewStub;
        if ((interfaceC1029540ctk instanceof C1017730cah) && (viewStub = ((C1017730cah) interfaceC1029540ctk).LIZLLL) != null) {
            viewStub.setLayoutResource(R.layout.eb3);
            return new C1017710caf((LinearLayout) C786410Ut5.LJLLLL(viewStub));
        }
        return null;
    }
}
