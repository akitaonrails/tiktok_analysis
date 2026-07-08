package X;

import android.view.View;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: renamed from: X.11ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19589811ke<T extends StickerModel> {
    public InteractStickerStruct LIZ;
    public T LIZIZ;
    public InterfaceC19592111l1<?> LIZJ;
    public C19591211ks LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new C19590111kh(this));

    public abstract InterfaceC19592111l1<?> LIZJ();

    public abstract T LJII(InteractStickerStruct interactStickerStruct);

    public void LIZLLL() {
        C388890FMp c388890FMp = (C388890FMp) this.LJ.getValue();
        if (c388890FMp != null) {
            c388890FMp.LIZJ();
        }
    }

    public final C19591211ks LJ() {
        C19591211ks c19591211ks = this.LIZLLL;
        if (c19591211ks != null) {
            return c19591211ks;
        }
        return null;
    }

    public final InteractStickerStruct LJFF() {
        InteractStickerStruct interactStickerStruct = this.LIZ;
        if (interactStickerStruct != null) {
            return interactStickerStruct;
        }
        return null;
    }

    public final T LJI() {
        T t = this.LIZIZ;
        if (t != null) {
            return t;
        }
        return null;
    }

    public final InterfaceC19592111l1<?> LJIIIIZZ() {
        InterfaceC19592111l1<?> interfaceC19592111l1 = this.LIZJ;
        if (interfaceC19592111l1 != null) {
            return interfaceC19592111l1;
        }
        return null;
    }

    public void LIZ(View view) {
        C19591911kz.LIZ(view, LJ(), LJFF(), LJI());
    }

    public void LIZIZ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        T t;
        this.LIZ = interactStickerStruct;
        if (stickerModel == null) {
            t = (T) LJII(interactStickerStruct);
        } else {
            t = (T) stickerModel;
        }
        this.LIZIZ = t;
        new C1664680tQA(LJI());
        InterfaceC19592111l1<?> interfaceC19592111l1LIZJ = LIZJ();
        interfaceC19592111l1LIZJ.getView().setTag("114_514");
        C786410Ut5.LJLLLLLL(4, interfaceC19592111l1LIZJ.getView());
        this.LIZJ = interfaceC19592111l1LIZJ;
        LIZ(LJIIIIZZ().getView());
        if (C19580811jC.LIZ(interactStickerStruct)) {
            C388890FMp c388890FMp = (C388890FMp) this.LJ.getValue();
            if (c388890FMp != null) {
                c388890FMp.LIZ(new AwS395S0200000_29((AbstractC19589811ke) this, interactStickerStruct, (InteractStickerStruct) 107));
                return;
            }
            return;
        }
        if (stickerModel != null) {
            BaseStickerModel baseModel = stickerModel.getBaseModel();
            C388890FMp c388890FMp2 = (C388890FMp) this.LJ.getValue();
            if (c388890FMp2 != null && c388890FMp2.LIZIZ(baseModel, new AwS395S0200000_29((AbstractC19589811ke) this, baseModel, (BaseStickerModel) 108))) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, LJIIIIZZ().getView());
            return;
        }
        C786410Ut5.LJLLLLLL(0, LJIIIIZZ().getView());
    }
}
