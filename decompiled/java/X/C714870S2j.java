package X;

/* JADX INFO: renamed from: X.0S2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714870S2j extends C0S3C implements InterfaceC714920S2o {
    public final C0R7Q LJ;

    @Override // X.InterfaceC714920S2o
    public final void LIZIZ(C690380R6e c690380R6e, InterfaceC715010S2x interfaceC715010S2x) {
    }

    @Override // X.InterfaceC714920S2o
    public final void LIZLLL() {
    }

    @Override // X.C0S3C
    public final void LJI(InterfaceC690390R6f interfaceC690390R6f) {
    }

    @Override // X.C0S3C
    public final void LJII() {
        InterfaceC715010S2x interfaceC715010S2x;
        InterfaceC690370R6d interfaceC690370R6dLIZ;
        C714880S2k c714880S2kLIZIZ;
        InterfaceC1484830ok5 player;
        C0R7T c0r7t = this.LJ.LIZLLL;
        if ((c0r7t != null && c0r7t.LIZ != null) || (interfaceC715010S2x = this.LIZ) == null || (interfaceC690370R6dLIZ = interfaceC715010S2x.LIZ()) == null || (c714880S2kLIZIZ = interfaceC690370R6dLIZ.LIZIZ()) == null || (player = c714880S2kLIZIZ.getPlayer()) == null) {
            return;
        }
        player.stop();
    }

    public C714870S2j(C0R7Q c0r7q) {
        this.LJ = c0r7q;
    }
}
