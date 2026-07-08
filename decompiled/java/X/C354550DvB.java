package X;

/* JADX INFO: renamed from: X.0DvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354550DvB implements InterfaceC354020DuK {
    public final /* synthetic */ C354560DvC LIZ;
    public final /* synthetic */ InterfaceC354020DuK LIZIZ;
    public final /* synthetic */ C354540DvA LIZJ;

    @Override // X.InterfaceC354020DuK
    public final void LIZ(C354570DvD c354570DvD) {
        C354560DvC c354560DvC = this.LIZ;
        int i = c354560DvC.LIZIZ + 1;
        if (!c354570DvD.LIZ) {
            c354560DvC.LIZIZ = 0;
            InterfaceC354020DuK interfaceC354020DuK = this.LIZIZ;
            if (interfaceC354020DuK != null) {
                interfaceC354020DuK.LIZ(c354570DvD);
                return;
            }
            return;
        }
        if (i >= 0 && i < c354560DvC.LIZ.size()) {
            C354560DvC c354560DvC2 = this.LIZ;
            int i2 = c354560DvC2.LIZIZ + 1;
            c354560DvC2.LIZIZ = i2;
            AbstractC354420Duy abstractC354420Duy = (AbstractC354420Duy) C13LP.LJJJLZIJ(i2, c354560DvC2.LIZ);
            if (abstractC354420Duy == null) {
                return;
            }
            C354540DvA c354540DvA = this.LIZJ;
            C354550DvB c354550DvB = new C354550DvB(this.LIZ, this.LIZIZ, c354540DvA);
            if (c354540DvA.LIZ == EnumC356390Dy9.APPLY) {
                abstractC354420Duy.LIZJ(c354540DvA, c354550DvB, c354570DvD);
                return;
            } else {
                abstractC354420Duy.LIZLLL(c354540DvA, c354550DvB);
                return;
            }
        }
        if (i != this.LIZ.LIZ.size()) {
            return;
        }
        this.LIZ.LIZIZ = 0;
        InterfaceC354020DuK interfaceC354020DuK2 = this.LIZIZ;
        if (interfaceC354020DuK2 == null) {
            return;
        }
        interfaceC354020DuK2.LIZ(c354570DvD);
    }

    @Override // X.InterfaceC354020DuK
    public final void onProgress(int i) {
        InterfaceC354020DuK interfaceC354020DuK = this.LIZIZ;
        if (interfaceC354020DuK != null) {
            interfaceC354020DuK.onProgress(i);
        }
    }

    public C354550DvB(C354560DvC c354560DvC, InterfaceC354020DuK interfaceC354020DuK, C354540DvA c354540DvA) {
        this.LIZ = c354560DvC;
        this.LIZIZ = interfaceC354020DuK;
        this.LIZJ = c354540DvA;
    }
}
