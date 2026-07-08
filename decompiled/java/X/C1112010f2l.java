package X;

import com.bytedance.android.live.base.model.user.User;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0f2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112010f2l {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public final List<InterfaceC1112020f2m> LJ = new ArrayList();
    public final List<InterfaceC1112100f2u> LJFF = new ArrayList();
    public final List<InterfaceC1112540f3c> LJI = new ArrayList();
    public boolean LJII;

    public final void LJIILIIL() {
        this.LJII = true;
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112540f3c) it2.next()).onPause();
        }
    }

    public final void LJIILL() {
        this.LJII = false;
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112540f3c) it2.next()).onResume();
        }
    }

    public final void LIZ(AbstractC1096380edY abstractC1096380edY) {
        ((ArrayList) this.LJ).add(abstractC1096380edY);
        ((ArrayList) this.LJI).add(abstractC1096380edY);
    }

    public final void LIZLLL(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJFF();
        }
    }

    public final void LJFF(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LIZIZ();
        }
    }

    public final void LJI(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJIILL(this.LIZJ, interfaceC1112060f2q);
        }
        this.LIZLLL++;
    }

    public final void LJII(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJJIJIL(this.LIZ, interfaceC1112060f2q);
        }
        this.LIZ++;
    }

    public final void LJIIIIZZ(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJIILIIL();
        }
    }

    public final void LJIIJJI(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJJI();
        }
    }

    public final void LJIIZILJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJJIJLIJ(interfaceC1112060f2q);
        }
    }

    public final void LIZIZ(InterfaceC1112060f2q interfaceC1112060f2q, int i) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJJJI(i);
        }
    }

    public final void LIZJ(InterfaceC1112060f2q interfaceC1112060f2q, int i) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJIJ(i);
        }
    }

    public final void LJ(InterfaceC1112060f2q interfaceC1112060f2q, int i) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJJJJ(i);
        }
    }

    public final void LJIIJ(InterfaceC1112060f2q interfaceC1112060f2q, boolean z) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJIIIZ(interfaceC1112060f2q, z);
        }
    }

    public final void LJIIL(InterfaceC1111800f2Q<? extends IMessage> interfaceC1111800f2Q, AbstractC1136060ffY abstractC1136060ffY) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJJIIJ(abstractC1136060ffY);
        }
    }

    public final void LJIILJJIL(List<? extends InterfaceC1112060f2q> list, C1112880f4A c1112880f4A) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJJJ(list, c1112880f4A);
        }
    }

    public final void LJIILLIIL(long j, List list) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJII(j, list);
        }
    }

    public final void LJIIIZ(AbstractC1136060ffY abstractC1136060ffY, AbstractC1111980f2i abstractC1111980f2i, boolean z, User user) {
        if (this.LJII) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1112020f2m) it2.next()).LJIILLIIL(abstractC1136060ffY, abstractC1111980f2i, z, user);
        }
    }
}
