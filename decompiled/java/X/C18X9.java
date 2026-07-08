package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.18X9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18X9 implements C18W3 {
    public final List<C18XA> LL = new ArrayList();

    @Override // X.C18W3
    public final void LIZ(C18XA c18xa) {
        if (!((ArrayList) this.LL).contains(c18xa)) {
            ((ArrayList) this.LL).add(c18xa);
        }
    }
}
