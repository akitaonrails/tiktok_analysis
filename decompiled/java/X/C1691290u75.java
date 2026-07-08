package X;

/* JADX INFO: renamed from: X.0u75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1691290u75 extends AbstractC1691420u7I {
    public final AbstractC1691330u79<?> LIZ;
    public final C05P0 LIZIZ = C20028913Yh.LJI(null);

    public C1691290u75(AbstractC1691330u79<?> abstractC1691330u79) {
        this.LIZ = abstractC1691330u79;
    }

    @Override // X.AbstractC1691420u7I
    public final boolean LIZ(AbstractC1691330u79<?> abstractC1691330u79) {
        if (abstractC1691330u79 == this.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1691420u7I
    public final Object LIZIZ(C1691310u77 c1691310u77) {
        if (c1691310u77 != this.LIZ) {
            C1696250uF5.LIZIZ("Check failed.");
        }
        Object value = ((C13FE) this.LIZIZ).getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
