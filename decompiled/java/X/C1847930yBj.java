package X;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0yBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847930yBj implements InterfaceC1847507Ll {
    public final EnumC1847910yBh LIZ;
    public final String LIZIZ;
    public final Map<String, Object> LIZJ;
    public final WeakReference<View> LIZLLL;

    @Override // X.InterfaceC1847507Ll
    public final String getEvent() {
        String strLIZIZ;
        C1847740yBQ c1847740yBQLIZIZ;
        if (this.LIZ != null) {
            View view = this.LIZLLL.get();
            if (view != null && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view)) != null) {
                strLIZIZ = c1847740yBQLIZIZ.LIZIZ(this.LIZ);
            }
        }
        strLIZIZ = this.LIZIZ;
        return strLIZIZ == null ? "" : strLIZIZ;
    }

    @Override // X.InterfaceC1847507Ll
    public final Map<String, Object> getParams() {
        return this.LIZJ;
    }

    public C1847930yBj(View view, EnumC1847910yBh enumC1847910yBh, String str, Map<String, ? extends Object> map) {
        this.LIZ = enumC1847910yBh;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = new WeakReference<>(view);
    }
}
