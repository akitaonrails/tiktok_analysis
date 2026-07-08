package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0FTC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FTC {
    public final /* synthetic */ C390390FSj LIZ;

    public C0FTC(C390390FSj c390390FSj) {
        this.LIZ = c390390FSj;
    }

    public final void LIZ(int i) {
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, this.LIZ.LJIIL);
        if (c0ftjLIZ == null) {
            return;
        }
        List<C0FTB> list = this.LIZ.LJIILIIL;
        ArrayList arrayList = new ArrayList();
        for (C0FTB c0ftb : list) {
            if (C13LQ.LJIILLIIL(c0ftjLIZ.getStickerType(), c0ftb.LJJIJIL())) {
                arrayList.add(c0ftb);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0FTB) it2.next()).LJIJJLI(c0ftjLIZ.LJLI());
        }
    }

    public final void LIZIZ(int i, int i2) {
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i2, this.LIZ.LJIIL);
        if (c0ftjLIZ == null) {
            return;
        }
        List<C0FTB> list = this.LIZ.LJIILIIL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (C13LQ.LJIILLIIL(c0ftjLIZ.getStickerType(), ((C0FTB) obj).LJJIJIL())) {
                arrayList.add(obj);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 6) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((C0FTB) it2.next()).LJJIIZ();
                        }
                    }
                } else {
                    C0FTJ<? extends StickerModel> c0ftjLIZ2 = C0FKU.LIZ(i2, this.LIZ.LJIIL);
                    if (c0ftjLIZ2 != null) {
                        this.LIZ.LJIILL().LIZLLL().LJJII(c0ftjLIZ2);
                        C390390FSj.LJIJ("duration");
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((C0FTB) it3.next()).LJIILLIIL(i2);
                        }
                    }
                }
            } else {
                C390390FSj c390390FSj = this.LIZ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(new C0FTE((C0FTB) it4.next()));
                }
                c390390FSj.LJIIJJI(i2);
                this.LIZ.getClass();
                C390390FSj.LJIJ("edit");
            }
        } else {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                ((C0FTB) it5.next()).LJIILJJIL(i2);
            }
            this.LIZ.LJIIJ(i2, "CLICK_CROSS", true, EnumC356070Dxd.COMMIT);
            this.LIZ.getClass();
            C390390FSj.LJIJ("delete");
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ((C0FTB) it6.next()).LJIILJJIL(i2);
            }
        }
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            ((C0FTB) it7.next()).LJIIL(c0ftjLIZ.LJLI(), i);
        }
    }
}
