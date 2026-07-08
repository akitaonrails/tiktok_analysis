package X;

/* JADX INFO: renamed from: X.12HW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12HW {
    public static final void LIZ(C12I9 c12i9, AbstractC19729412Hc abstractC19729412Hc) {
        if (abstractC19729412Hc instanceof C12HZ) {
            c12i9.ue().clear();
            c12i9.ue().addAll(((C12HZ) abstractC19729412Hc).LIZ);
        } else if (abstractC19729412Hc instanceof C19729212Ha) {
            c12i9.ue().addAll(((C19729212Ha) abstractC19729412Hc).LIZ);
        } else if (abstractC19729412Hc instanceof C12HY) {
            C12HY c12hy = (C12HY) abstractC19729412Hc;
            c12i9.ue().removeAll(c12hy.LIZ);
            c12i9.ue().addAll(c12hy.LIZIZ);
        } else {
            throw new C1954807lC();
        }
        c12i9.Ve().LJIIJ(c12i9.ue());
    }
}
