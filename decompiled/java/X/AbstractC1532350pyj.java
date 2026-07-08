package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1532350pyj<Type> {
    public Type LIZ;
    public final Class<Type> LIZIZ;

    public abstract AbstractC1532350pyj<Type> LIZ(C1532710pzJ c1532710pzJ);

    public Integer LIZJ() {
        return null;
    }

    public abstract void LIZLLL();

    public final AbstractC1532350pyj<Type> LIZIZ(C1532710pzJ c1532710pzJ) {
        Object c098200Yq;
        try {
            c098200Yq = LIZ(c1532710pzJ);
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
            sbLIZ.append(this.LIZIZ);
            c1532920pze.LIZIZ("ResourceRef", "cloneOrNull", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (AbstractC1532350pyj) c098200Yq;
    }

    public AbstractC1532350pyj(Type type, Class<Type> cls) {
        this.LIZ = type;
        this.LIZIZ = cls;
    }
}
