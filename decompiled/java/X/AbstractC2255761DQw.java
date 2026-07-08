package X;

/* JADX INFO: renamed from: X.1DQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2255761DQw<T> implements InterfaceC1287950jcX<T> {
    public boolean LL;

    public abstract void LIZIZ(Object obj, boolean z);

    @Override // X.InterfaceC1287950jcX
    public final void LIZ(Class cls, Object obj, String str, boolean z) {
        if (!this.LL) {
            this.LL = true;
            LIZIZ(obj, z);
        }
    }
}
