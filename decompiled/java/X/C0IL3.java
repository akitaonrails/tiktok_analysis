package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0IL3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IL3 implements C0IL4 {
    public static final C0IL3 LIZ = new C0IL3();
    public static final List<C0IL4> LIZIZ = C1697810uHb.LJIILJJIL(C1134550fd7.LIZ, C1134520fd4.LIZ, C237500vt.LIZ);

    @Override // X.C0IL4
    public final void LIZ(Room room) {
        Iterator<C0IL4> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(room);
        }
    }

    @Override // X.C0IL4
    public final void LIZIZ(Room room) {
        Iterator<C0IL4> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(room);
        }
    }

    @Override // X.C0IL4
    public final void LIZJ(Room room) {
        Iterator<C0IL4> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(room);
        }
    }

    @Override // X.C0IL4
    public final void LIZLLL(Room room) {
        Iterator<C0IL4> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(room);
        }
    }
}
