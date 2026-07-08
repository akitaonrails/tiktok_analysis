package X;

import android.view.ViewStub;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017740cai extends C1029530ctj {
    @Override // X.C1029530ctj, X.InterfaceC1029520cti
    public final InterfaceC988160bp0 LIZ(InterfaceC1029540ctk interfaceC1029540ctk) {
        ViewStub viewStub;
        if ((interfaceC1029540ctk instanceof C1017770cal) && (viewStub = ((C1017770cal) interfaceC1029540ctk).LIZ) != null) {
            viewStub.setLayoutResource(R.layout.dst);
            return new C1017700cae((LinearLayout) C786410Ut5.LJLLLL(viewStub));
        }
        return null;
    }
}
