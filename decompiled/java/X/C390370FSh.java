package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0FSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390370FSh implements C0FSC {
    public final /* synthetic */ C390390FSj LIZ;

    @Override // X.C0FSC
    public final void LIZJ() {
    }

    @Override // X.C0FSC
    public final void LIZLLL(boolean z) {
    }

    @Override // X.C0FSC
    public final void LJ() {
    }

    @Override // X.C0FSC
    public final void LJFF() {
    }

    public C390370FSh(C390390FSj c390390FSj) {
        this.LIZ = c390390FSj;
    }

    @Override // X.C0FSC
    public final void LIZIZ(StickerModel stickerModel) {
        List<C0FTB> list = this.LIZ.LJIILIIL;
        ArrayList arrayList = new ArrayList();
        for (C0FTB c0ftb : list) {
            if (C13LQ.LJIILLIIL(stickerModel.getStickerType(), c0ftb.LJJIJIL())) {
                arrayList.add(c0ftb);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0FTB) it2.next()).LIZIZ(stickerModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel] */
    @Override // X.C0FSC
    public final void LIZ(StickerModel stickerModel, boolean z) {
        C0FFE<? extends StickerModel> c0ffe;
        this.LIZ.LJ.LJIILJJIL(2);
        C0FTJ c0ftjLIZ = C0FKU.LIZ(stickerModel.getId(), this.LIZ.LJIIL);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = stickerModel;
        if (c0ftjLIZ != null) {
            if (stickerModel.isNotEmptyModel()) {
                c0ftjLIZ.LJIIJJI((StickerModel) c259800zU.element);
                if ((c0ftjLIZ instanceof C0FFE) && (c0ffe = (C0FFE) c0ftjLIZ) != null) {
                    ((C21637819mC) this.LIZ.LJIIZILJ().LIZIZ(C13LE.LIZ(C21637819mC.class))).LIZIZ(c0ffe);
                }
            } else {
                this.LIZ.LJIIJ(((StickerModel) c259800zU.element).getId(), "DONE_WITH_TEXT_NULL", true, EnumC356070Dxd.COMMIT);
            }
        } else if (stickerModel.isNotEmptyModel()) {
            c259800zU.element = this.LIZ.f3((StickerModel) c259800zU.element, EnumC356070Dxd.COMMIT);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C390360FSg(this.LIZ, c259800zU, stickerModel, z, null), 3);
    }
}
