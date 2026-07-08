package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.18X1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18X1 {
    public EnumC21299518Wz LIZ = EnumC21299518Wz.COLLAPSED;
    public final List<C18X4> LIZIZ = new ArrayList();

    public final void LIZ(View view, EnumC21299518Wz enumC21299518Wz) {
        EnumC21299518Wz enumC21299518Wz2 = this.LIZ;
        if (enumC21299518Wz2 == enumC21299518Wz) {
            return;
        }
        if (enumC21299518Wz == EnumC21299518Wz.PRE_HIDING) {
            Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
            while (it2.hasNext()) {
                ((C18X4) it2.next()).g0();
            }
        }
        this.LIZ = enumC21299518Wz;
        Iterator it3 = ((ArrayList) this.LIZIZ).iterator();
        while (it3.hasNext()) {
            ((C18X4) it3.next()).f0(enumC21299518Wz);
        }
        if (enumC21299518Wz == EnumC21299518Wz.DRAGGING) {
            Iterator it4 = ((ArrayList) this.LIZIZ).iterator();
            while (it4.hasNext()) {
                ((C18X4) it4.next()).LJJJJ();
            }
        }
        if (enumC21299518Wz2 == EnumC21299518Wz.DRAGGING && enumC21299518Wz != EnumC21299518Wz.SETTLING) {
            Iterator it5 = ((ArrayList) this.LIZIZ).iterator();
            while (it5.hasNext()) {
                ((C18X4) it5.next()).e0();
            }
        }
        if (enumC21299518Wz2 == EnumC21299518Wz.SETTLING) {
            Iterator it6 = ((ArrayList) this.LIZIZ).iterator();
            while (it6.hasNext()) {
                ((C18X4) it6.next()).e0();
            }
        }
        if (enumC21299518Wz == EnumC21299518Wz.HIDDEN) {
            Iterator it7 = ((ArrayList) this.LIZIZ).iterator();
            while (it7.hasNext()) {
                ((C18X4) it7.next()).LJJJIL();
            }
        }
    }
}
