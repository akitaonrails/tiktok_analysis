package X;

/* JADX INFO: renamed from: X.0cZY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1017020cZY implements InterfaceC1017050cZb {
    public final Runnable LL;
    public long LLILLJJLI = -1;
    public long LLILLL = -1;

    @Override // X.InterfaceC1017050cZb
    public final int LJIL() {
        return EnumC1017030cZZ.MAIN_IDLE.getValue() + EnumC1017030cZZ.NET_IDLE.getValue();
    }

    @Override // X.InterfaceC1017050cZb
    public final void run() {
        this.LL.run();
    }

    @Override // X.InterfaceC1017050cZb
    public final double getPriority() {
        return C337030DJd.LIZIZ(LJJJLIIL());
    }

    @Override // X.InterfaceC1017050cZb
    public final long LJJIJLIJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1017050cZb
    public final long LJJLIIIIJ() {
        return this.LLILLL;
    }

    public AbstractC1017020cZY(Runnable runnable) {
        this.LL = runnable;
    }

    @Override // X.InterfaceC1017050cZb
    public final void LJJJJI(long j) {
        this.LLILLJJLI = j;
    }

    @Override // X.InterfaceC1017050cZb
    public final void LJJLIIIJJI(long j) {
        this.LLILLL = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(InterfaceC1017050cZb interfaceC1017050cZb) {
        return C337030DJd.LIZ(this, interfaceC1017050cZb);
    }
}
