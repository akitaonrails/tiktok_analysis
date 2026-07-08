package X;

import android.graphics.Rect;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0dde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1058000dde extends AbstractC1034380d1Y {
    public final List<InterfaceC1058020ddg> LIZ = C1697810uHb.LJIIJJI(new C1057980ddc(), new C1057990ddd());

    public abstract Rect LJ(Rect rect, Rect rect2);

    public final Rect LJFF(View view) {
        Iterator<InterfaceC1058020ddg> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            C1058010ddf c1058010ddfLIZ = it2.next().LIZ(view);
            if (c1058010ddfLIZ != null) {
                return LJ(c1058010ddfLIZ.LIZ, c1058010ddfLIZ.LIZIZ);
            }
        }
        return null;
    }
}
