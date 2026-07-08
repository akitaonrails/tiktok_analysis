package X;

/* JADX INFO: renamed from: X.0J0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C485100J0q<T> extends AbstractC485120J0s<T> {
    public final C485140J0u<T> LIZ;

    public C485100J0q(AbstractC485130J0t abstractC485130J0t, int i, AbstractC485160J0w abstractC485160J0w) {
        this.LIZ = new C485140J0u<>(abstractC485130J0t, 0, null, abstractC485160J0w);
        if (i >= 1) {
        } else {
            throw new IllegalArgumentException("Page size must be non-negative");
        }
    }
}
