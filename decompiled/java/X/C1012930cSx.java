package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012930cSx implements InterfaceC1010530cP5 {
    public final InterfaceC1013030cT7 LL;
    public final int LLILLJJLI;
    public final List<AbstractC1013010cT5> LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public List<AbstractC1013010cT5> LLIZ;
    public List<AbstractC1013020cT6> LLIZLLLIL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C1012930cSx(C1012880cSs c1012880cSs) {
        this.LL = c1012880cSs;
        Iterator<C1012890cSt> it2 = c1012880cSs.LIZIZ.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            i += it2.next().LIZIZ;
        }
        this.LLILLJJLI = i;
        this.LLILLL = C1697810uHb.LJIIJJI(C1013120cTG.LIZIZ, C1013130cTH.LIZIZ, new AbstractC1013010cT5(i) { // from class: X.0cT8
            {
                super((int) (i * 0.25f));
            }
        }, new AbstractC1013010cT5(i) { // from class: X.0cT9
            {
                super((int) (i * 0.5f));
            }
        }, new AbstractC1013010cT5(i) { // from class: X.0cTA
            {
                super((int) (i * 0.75f));
            }
        });
        this.LLIZ = new ArrayList();
        this.LLIZLLLIL = new ArrayList();
    }

    public final void LIZ(int i, int i2) {
        List<C1012890cSt> stats = this.LL.getStats();
        ArrayList arrayList = new ArrayList();
        for (C1012890cSt c1012890cSt : stats) {
            if (c1012890cSt.LIZ < i) {
                arrayList.add(c1012890cSt);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            i3 += ((C1012890cSt) it2.next()).LIZIZ;
        }
        this.LLILZLL = i3 + i2;
        this.LLILZ = i;
        C1022620cia.LIZ("progress", "updatePlaybackPosition: currentIndex is " + i + ", currentTime: " + this.LLILZLL);
        List<AbstractC1013010cT5> list = this.LLIZ;
        ArrayList<AbstractC1013010cT5> arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (this.LLILZLL >= ((AbstractC1013010cT5) obj).LIZ) {
                arrayList2.add(obj);
            }
        }
        for (AbstractC1013010cT5 abstractC1013010cT5 : arrayList2) {
            C1012900cSu c1012900cSuYc = this.LL.yc();
            int i4 = this.LLILZIL;
            int i5 = this.LLILZ;
            if (Intrinsics.LJFF(abstractC1013010cT5, C1013120cTG.LIZIZ)) {
                c1012900cSuYc.LJ(i4, i5);
            } else if (Intrinsics.LJFF(abstractC1013010cT5, C1013130cTH.LIZIZ)) {
                c1012900cSuYc.LJFF(i4, i5);
            } else if (abstractC1013010cT5 instanceof C1013040cT8) {
                c1012900cSuYc.LIZ(i4, i5, abstractC1013010cT5.LIZ);
            } else if (abstractC1013010cT5 instanceof C1013050cT9) {
                c1012900cSuYc.LIZIZ(i4, i5, abstractC1013010cT5.LIZ);
            } else if (abstractC1013010cT5 instanceof C1013060cTA) {
                c1012900cSuYc.LJIILIIL(i4, i5, abstractC1013010cT5.LIZ);
            } else {
                throw new C1954807lC();
            }
        }
        ((ArrayList) this.LLIZ).removeAll(arrayList2);
        List<AbstractC1013020cT6> list2 = this.LLIZLLLIL;
        ArrayList<AbstractC1013020cT6> arrayList3 = new ArrayList();
        for (AbstractC1013020cT6 abstractC1013020cT6 : list2) {
            if (i2 >= abstractC1013020cT6.LIZ) {
                arrayList3.add(abstractC1013020cT6);
            }
        }
        for (AbstractC1013020cT6 abstractC1013020cT62 : arrayList3) {
            C1012900cSu c1012900cSuLIZ = this.LL.LIZ();
            int i6 = this.LLILZIL;
            int i7 = this.LLILZ;
            if (Intrinsics.LJFF(abstractC1013020cT62, C1013140cTI.LIZIZ)) {
                c1012900cSuLIZ.LJIIJ(i6, i7);
            } else if (Intrinsics.LJFF(abstractC1013020cT62, C1013150cTJ.LIZIZ)) {
                c1012900cSuLIZ.LJIIJJI(i6, i7);
            } else if (abstractC1013020cT62 instanceof C1013070cTB) {
                c1012900cSuLIZ.LJI(i6, i7, abstractC1013020cT62.LIZ);
            } else if (abstractC1013020cT62 instanceof C1013080cTC) {
                c1012900cSuLIZ.LJII(i6, i7, abstractC1013020cT62.LIZ);
            } else if (abstractC1013020cT62 instanceof C1013090cTD) {
                c1012900cSuLIZ.LJIIL(i6, i7, abstractC1013020cT62.LIZ);
            } else {
                throw new C1954807lC();
            }
        }
        this.LLIZLLLIL.removeAll(arrayList3);
    }
}
