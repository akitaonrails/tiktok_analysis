package X;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349910lET {
    public InterfaceC1356280lOk LIZ;
    public final List<InterfaceC1350080lEk> LIZIZ = new ArrayList();

    public C1349910lET(C1349840lEM c1349840lEM) {
        this.LIZ = c1349840lEM;
    }

    public final void LIZIZ(String str) {
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1350080lEk) it2.next()).LLLIL(str);
        }
    }

    public final void LIZ(View view, C19EG c19eg) {
        if (!((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        ((ArrayList) this.LIZIZ).add(new C1356260lOi(this, (ViewStub) view.findViewById(R.id.blh), c19eg, true));
        ((ArrayList) this.LIZIZ).add(new C1356260lOi(this, (ViewStub) view.findViewById(R.id.blj), c19eg, false));
    }
}
