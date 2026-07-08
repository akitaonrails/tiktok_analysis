package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532340pyi implements InterfaceC1541240qD4 {
    public final AbstractC1532350pyj<?> LIZ;
    public InterfaceC1532190pyT LIZIZ;

    @Override // X.InterfaceC1541240qD4, X.InterfaceC1541260qD6
    public final boolean LIZ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    @Override // X.InterfaceC1541260qD6
    public final boolean LIZJ(C1540930qCZ c1540930qCZ) {
        return true;
    }

    public final Class<? extends Object> LIZLLL() {
        AbstractC1532350pyj<?> abstractC1532350pyj = this.LIZ;
        if (abstractC1532350pyj != null) {
            return abstractC1532350pyj.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1541240qD4
    public final boolean isSuccess() {
        return this.LIZ != null;
    }

    public final String toString() {
        String string;
        AbstractC1532350pyj<?> abstractC1532350pyj = this.LIZ;
        return (abstractC1532350pyj == null || (string = abstractC1532350pyj.toString()) == null) ? "resource is null" : string;
    }

    public final C1532340pyi LIZIZ(C1532710pzJ c1532710pzJ) {
        Object c098200Yq;
        Object obj = null;
        try {
            AbstractC1532350pyj<?> abstractC1532350pyj = this.LIZ;
            if (abstractC1532350pyj != null) {
                c098200Yq = abstractC1532350pyj.LIZ(c1532710pzJ);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C1532920pze c1532920pze = C1532920pze.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clone resource failed, type: ");
            sbLIZ.append(LIZLLL());
            c1532920pze.LIZIZ("ResourceResult", "cloneOrNull", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return new C1532340pyi((AbstractC1532350pyj) obj, this.LIZIZ);
    }

    public C1532340pyi(AbstractC1532350pyj<?> abstractC1532350pyj, InterfaceC1532190pyT interfaceC1532190pyT) {
        this.LIZ = abstractC1532350pyj;
        this.LIZIZ = interfaceC1532190pyT;
    }
}
