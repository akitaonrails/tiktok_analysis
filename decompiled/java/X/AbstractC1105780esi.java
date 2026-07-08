package X;

/* JADX INFO: renamed from: X.0esi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1105780esi implements InterfaceC1105760esg {
    public final int LL = 4;

    @Override // X.InterfaceC1105760esg
    public final int getPriority() {
        return this.LL;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC1105760esg interfaceC1105760esg) {
        return this.LL - interfaceC1105760esg.getPriority();
    }
}
