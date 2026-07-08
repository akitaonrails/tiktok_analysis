package X;

import android.view.Surface;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DOZ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOZ {
    public final /* synthetic */ C1DOY LIZ;

    public C1DOZ(C1DOY c1doy) {
        this.LIZ = c1doy;
    }

    public final void LIZ(Surface surface) {
        Iterator<Function1<Surface, Unit>> it2 = this.LIZ.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(surface);
        }
    }
}
