package X;

/* JADX INFO: renamed from: X.0Mvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584370Mvz implements InterfaceC585080Mx8 {
    public static boolean LIZIZ;
    public final C585050Mx5 LIZ;

    @Override // X.InterfaceC585080Mx8
    public final void execute() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("command execute: success? ");
        sbLIZ.append(this.LIZ.LIZIZ);
        C1481110oe5.LIZIZ("PrerenderDegradeCommand", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ.LIZIZ) {
            LIZIZ = true;
        } else {
            LIZIZ = false;
        }
    }

    public C584370Mvz(C585050Mx5 c585050Mx5) {
        this.LIZ = c585050Mx5;
    }
}
