package X;

/* JADX INFO: renamed from: X.0qEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1542400qEw extends C1BVX {
    public AbstractC1541650qDj<C1BVW> customExtension;

    public final AbstractC1541650qDj<C1BVW> getCustomExtension() {
        AbstractC1541650qDj<C1BVW> abstractC1541650qDj = this.customExtension;
        if (abstractC1541650qDj != null) {
            return abstractC1541650qDj;
        }
        return null;
    }

    @Override // X.AbstractC1541670qDl
    public AbstractC1541650qDj<C1BVW> getExtension() {
        return getCustomExtension();
    }

    public final void setCustomExtension(AbstractC1541650qDj<C1BVW> abstractC1541650qDj) {
        this.customExtension = abstractC1541650qDj;
    }
}
