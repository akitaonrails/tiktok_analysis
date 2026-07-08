package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1D7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C2250771D7r extends C2217421BqW implements Function0<Unit> {
    public C2250771D7r(C1D82 c1d82) {
        super(0, c1d82, C1D82.class, "startInSchedule", "startInSchedule$wave_release()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1D82 c1d82 = (C1D82) this.receiver;
        Set<C1D82> set = c1d82.LIZ.LIZ;
        if ((set instanceof Collection) && set.isEmpty()) {
            c1d82.LIZLLL().LIZLLL();
        } else {
            Iterator<C1D82> it2 = set.iterator();
            while (it2.hasNext()) {
                if (!(it2.next().LIZJ() instanceof C1D8N)) {
                    break;
                }
            }
            c1d82.LIZLLL().LIZLLL();
        }
        return Unit.LIZ;
    }
}
