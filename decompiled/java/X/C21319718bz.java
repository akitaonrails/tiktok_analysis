package X;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21319718bz implements InterfaceC21319618by {
    public final CopyOnWriteArrayList<C1700160uLO> LIZ = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC21319618by
    public final void LIZ(Function0<C1700160uLO> function0) {
        if (!C1325860kbg.LJII()) {
            return;
        }
        this.LIZ.add(function0.invoke());
    }
}
