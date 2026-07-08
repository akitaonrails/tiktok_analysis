package X;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C696840RVa implements InterfaceC696870RVd<Object> {
    public C696930RVj<Object> LIZ;
    public final C696850RVb LIZIZ;
    public final C696860RVc LIZJ;

    @Override // X.InterfaceC696870RVd
    public final C696860RVc LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC696870RVd
    public final C696930RVj<Object> getCurrentContext() {
        return this.LIZ;
    }

    public C696840RVa(List<Function1<C696930RVj<Object>, C696930RVj<Object>>> list) {
        this.LIZIZ = new C696850RVb(list);
        this.LIZJ = new C696860RVc(list, this);
    }
}
