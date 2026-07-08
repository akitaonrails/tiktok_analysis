package X;

import X.C0V1Y;

/* JADX INFO: renamed from: X.0qDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1541670qDl<T extends C0V1Y> {
    public T mExtendable;
    public C0V1X mExtendableContext;

    public abstract AbstractC1541650qDj getExtension();

    public T getExtendable() {
        if (this.mExtendable == null) {
            this.mExtendable = (T) getExtension().LIZ();
        }
        return this.mExtendable;
    }

    public C0V1X getExtendableContext() {
        if (this.mExtendableContext == null) {
            this.mExtendableContext = getExtension().LL;
        }
        return this.mExtendableContext;
    }
}
