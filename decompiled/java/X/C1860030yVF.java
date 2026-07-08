package X;

import X.C1860130yVP;

/* JADX INFO: renamed from: X.0yVF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860030yVF<T extends C1860130yVP> {
    public final T LIZ;
    public boolean LIZIZ;

    public final void LIZ() {
        if (!this.LIZIZ) {
            this.LIZ.setTextIsSelectable(false);
            return;
        }
        C2248251Cz9 textSelector = this.LIZ.getTextSelector();
        if (textSelector != null) {
            textSelector.LJJIFFI();
        }
        this.LIZ.setTextSelector(null);
        this.LIZ.setTextIsSelectable(true);
    }

    public C1860030yVF(T t) {
        this.LIZ = t;
    }
}
