package X;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0pwa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531020pwa implements InterfaceC1529530puB {
    public final Application LIZ;
    public final List<C1313970kIV> LIZIZ = new ArrayList();

    public C1531020pwa(Application application) {
        this.LIZ = application;
    }

    public final void LIZ(List<? extends C1313970kIV> list) {
        ((ArrayList) this.LIZIZ).addAll(list);
    }
}
