package X;

import android.os.Bundle;
import com.bytedance.hox.Hox;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0XJC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJC implements InterfaceC1055110dYz {
    public final WeakReference<Hox> LL;

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
    }

    public C0XJC(WeakReference<Hox> weakReference) {
        this.LL = weakReference;
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0XJB(this, null), 3);
    }
}
