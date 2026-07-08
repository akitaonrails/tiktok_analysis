package X;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0S36, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S36 implements C0S3A {
    public final List<C0S3A> LIZ = new ArrayList();

    @Override // X.C0S3A
    public final void LIZ(MotionEvent motionEvent) {
        Iterator<C0S3A> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(motionEvent);
        }
    }
}
