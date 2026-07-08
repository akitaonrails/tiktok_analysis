package X;

/* JADX INFO: renamed from: X.18vE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21439018vE extends AbstractC21430218to {
    @Override // X.AbstractC21430218to
    public final AbstractC21430218to LIZJ() {
        return this.LIZ;
    }

    @Override // X.AbstractC21430218to
    public final void LIZLLL(AbstractC21430218to abstractC21430218to) {
        if (abstractC21430218to instanceof AbstractC21439018vE) {
            this.LIZ = abstractC21430218to;
            return;
        }
        throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
    }
}
