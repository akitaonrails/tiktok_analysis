package X;

/* JADX INFO: renamed from: X.0X9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C844210X9v extends AbstractC2205961BVi {
    public AbstractC1541650qDj<C2205951BVh> customExtension;

    public final AbstractC1541650qDj<C2205951BVh> getCustomExtension() {
        AbstractC1541650qDj<C2205951BVh> abstractC1541650qDj = this.customExtension;
        if (abstractC1541650qDj != null) {
            return abstractC1541650qDj;
        }
        return null;
    }

    @Override // X.AbstractC1541670qDl
    public AbstractC1541650qDj<C2205951BVh> getExtension() {
        return getCustomExtension();
    }

    public final void setCustomExtension(AbstractC1541650qDj<C2205951BVh> abstractC1541650qDj) {
        this.customExtension = abstractC1541650qDj;
    }
}
