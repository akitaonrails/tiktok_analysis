package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.052l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12885052l<STORAGE_TYPE> implements C053I<STORAGE_TYPE> {
    public final AnonymousClass0531 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C12886052m(this));

    public final ConcurrentHashMap<String, Object> LIZ() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    @Override // X.C053I
    public final List<String> LJ() {
        return C13LP.LLIIII(LIZ().keySet());
    }

    public AbstractC12885052l(AnonymousClass0531 anonymousClass0531) {
        this.LIZ = anonymousClass0531;
    }

    @Override // X.C053I
    public final void LJI(String str) {
        LIZ().remove(str);
    }
}
