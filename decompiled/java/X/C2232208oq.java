package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2232208oq<T> {
    public final Object LIZ;
    public final Function1<InterfaceC1364105Vn<? super T>, Object> LIZIZ;
    public final C099F LIZJ;

    public final Object LIZ(InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        C099F c099f;
        C099F c099f2 = this.LIZJ;
        if ((c099f2 != null && c099f2.isCancelled()) || (c099f = this.LIZJ) == null) {
            return null;
        }
        return c099f.LJLIIIL(interfaceC1364105Vn);
    }

    public C2232208oq(C2234108p9 c2234108p9, Object obj) {
        this.LIZ = obj;
        this.LIZIZ = c2234108p9;
        if (this.LIZJ == null) {
            this.LIZJ = C090F.LIZIZ();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2218308mb(this, null), 3);
        }
    }
}
