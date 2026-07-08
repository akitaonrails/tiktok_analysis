package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Nzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612250Nzr<S> {
    public final C603820NmG<String, Pair<S, S>> LIZ = new C603820NmG<>(Integer.MAX_VALUE);
    public final CopyOnWriteArraySet<InterfaceC612260Nzs<S>> LIZIZ = new CopyOnWriteArraySet<>();
    public final C2252331DDr LIZJ = C09IR.LIZIZ(0, 1, EnumC2252401DDy.DROP_OLDEST, 1);

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Object obj, String str) {
        if (this.LIZ.LIZJ(str) == null) {
            this.LIZ.LIZLLL(str, new Pair<>(obj, obj));
            LIZ(str, obj, EnumC612200Nzm.NET);
        } else {
            this.LIZ.LIZLLL(str, new Pair<>(obj, obj));
        }
    }

    public final void LIZ(String str, S s, EnumC612200Nzm enumC612200Nzm) {
        this.LIZJ.LIZJ(new C612190Nzl(str, s, enumC612200Nzm));
        Iterator<InterfaceC612260Nzs<S>> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().xt(str, s, enumC612200Nzm);
        }
    }
}
