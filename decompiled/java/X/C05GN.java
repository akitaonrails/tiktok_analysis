package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.05GN, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05GN implements InterfaceC1335505Kn {
    public static final C05GN LIZ = new C05GN();
    public static final CopyOnWriteArraySet<C05GM> LIZIZ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC1335505Kn
    public final void LIZ(C05GP c05gp) {
        Iterator<C05GM> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onEvent(c05gp);
        }
    }
}
