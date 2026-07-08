package X;

/* JADX INFO: renamed from: X.157i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204684157i implements InterfaceC204685157j<Boolean> {
    public final /* synthetic */ Runnable LIZ;

    public C204684157i(Runnable runnable) {
        this.LIZ = runnable;
    }

    @Override // X.InterfaceC204685157j
    public final void onSuccess(Boolean bool) {
        Runnable runnable = this.LIZ;
        if (runnable != null) {
            runnable.run();
        }
    }
}
