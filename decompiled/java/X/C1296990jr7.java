package X;

/* JADX INFO: renamed from: X.0jr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1296990jr7<T> extends AbstractC1296960jr4<T> {
    public Object LIZ;
    public AbstractC1296960jr4<T> LIZIZ;

    public C1296990jr7(Object obj) {
        this.LIZ = obj;
    }

    @Override // X.AbstractC1296960jr4
    public final T LIZ(AbstractC1296450jqF abstractC1296450jqF) {
        AbstractC1296960jr4<T> abstractC1296960jr4 = this.LIZIZ;
        if (abstractC1296960jr4 != null) {
            return abstractC1296960jr4.LIZ(abstractC1296450jqF);
        }
        throw new IllegalStateException("Type adapter isn't ready");
    }

    @Override // X.AbstractC1296960jr4
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, T t) {
        AbstractC1296960jr4<T> abstractC1296960jr4 = this.LIZIZ;
        if (abstractC1296960jr4 != null) {
            abstractC1296960jr4.LIZIZ(abstractC1297000jr8, t);
            return;
        }
        throw new IllegalStateException("Type adapter isn't ready");
    }
}
