package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262100iwq implements InterfaceC1262160iww {
    public final Function0<Unit> LIZ;
    public final C1262090iwp LIZIZ;
    public final List<AbstractC1262120iws> LIZJ;
    public final Map<C1261860iwS, List<C1261860iwS>> LIZLLL;
    public C1261860iwS LJ;

    public C1262100iwq() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    @Override // X.InterfaceC1262160iww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1262230ix3> LIZ(X.C1262150iwv r18) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1262100iwq.LIZ(X.0iwv):java.util.List");
    }

    public C1262100iwq(AwS563S0100000_19 awS563S0100000_19, C1262090iwp c1262090iwp) {
        Collection collection = c1262090iwp.LJJIIZ;
        collection = collection == null ? C13BV.INSTANCE : collection;
        Iterable iterable = c1262090iwp.LJJIIZI;
        List<AbstractC1262120iws> listLJLIL = C13LP.LJLIL(iterable == null ? C13BV.INSTANCE : iterable, collection);
        this.LIZ = awS563S0100000_19;
        this.LIZIZ = c1262090iwp;
        this.LIZJ = listLJLIL;
        this.LIZLLL = new LinkedHashMap();
    }
}
