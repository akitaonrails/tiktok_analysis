package X;

/* JADX INFO: renamed from: X.0jva, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299760jva implements InterfaceC1299830jvh {
    public final /* synthetic */ InterfaceC1299840jvi LIZ;

    public C1299760jva(C1299770jvb c1299770jvb) {
        this.LIZ = c1299770jvb;
    }

    public final void LIZ(byte[] bArr, Throwable th) {
        boolean z;
        String message;
        C1299730jvX c1299730jvX = ((C1299770jvb) this.LIZ).LIZ;
        if (th == null) {
            z = true;
        } else {
            z = false;
        }
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        c1299730jvX.LIZIZ(z, bArr, null, null, message);
    }
}
