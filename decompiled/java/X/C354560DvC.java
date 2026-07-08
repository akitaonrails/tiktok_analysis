package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.0DvC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354560DvC {
    public final ArrayList<AbstractC354420Duy> LIZ = new ArrayList<>();
    public int LIZIZ;

    public final void LIZ(C354540DvA c354540DvA, InterfaceC354020DuK interfaceC354020DuK) {
        this.LIZIZ = 0;
        AbstractC354420Duy abstractC354420Duy = (AbstractC354420Duy) C13LP.LJJJLZIJ(0, this.LIZ);
        if (abstractC354420Duy != null) {
            C354550DvB c354550DvB = new C354550DvB(this, interfaceC354020DuK, c354540DvA);
            if (c354540DvA.LIZ == EnumC356390Dy9.APPLY) {
                abstractC354420Duy.LIZJ(c354540DvA, c354550DvB, null);
                return;
            } else {
                abstractC354420Duy.LIZLLL(c354540DvA, c354550DvB);
                return;
            }
        }
        if (interfaceC354020DuK == null) {
            return;
        }
        interfaceC354020DuK.LIZ(new C354570DvD(false, null, null, 6));
    }
}
