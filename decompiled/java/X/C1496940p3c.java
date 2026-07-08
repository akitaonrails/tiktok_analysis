package X;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0p3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496940p3c implements InterfaceC1489800os6 {
    public InterfaceC1496970p3f LIZ;
    public Map<String, List<String>> LIZIZ;

    public final void LIZ(C1496950p3d c1496950p3d) {
        if (c1496950p3d.LIZIZ != null && TextUtils.equals("200", c1496950p3d.LIZ)) {
            InterfaceC1496970p3f interfaceC1496970p3f = this.LIZ;
            if (interfaceC1496970p3f != null) {
                c1496950p3d.LIZJ = this.LIZIZ;
                interfaceC1496970p3f.LIZIZ(c1496950p3d);
                return;
            }
            return;
        }
        InterfaceC1496970p3f interfaceC1496970p3f2 = this.LIZ;
        if (interfaceC1496970p3f2 == null) {
            return;
        }
        interfaceC1496970p3f2.LIZ(c1496950p3d);
    }
}
