package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19530711b7 extends AbstractC19531111bB<C0EXI> implements C0EXI {
    public static final int LLL = 8;
    public final C0EXI LLJZIJLIL;

    private final void q9() {
        C390090FRf c390090FRfD5;
        InterfaceC19530911b9 interfaceC19530911b9Sd2;
        TextStickerModel textStickerModelX5 = x5();
        if (textStickerModelX5 == null || !C0F8Y.LJII(textStickerModelX5) || (c390090FRfD5 = D5()) == null) {
            return;
        }
        c390090FRfD5.LJIJ(c390090FRfD5.LJJIIJZLJL(), false);
        c390090FRfD5.setVisible(false);
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj == null || (interfaceC19530911b9Sd2 = interfaceC391240FVqQj.sd2()) == null) {
            return;
        }
        interfaceC19530911b9Sd2.LJJIIZI();
    }

    @Override // X.C0EXI
    public void Bk() {
        List<TextStickerModel> listSb;
        K6().creativeModel.stickerModel.isAiCaptionAdded = false;
        C0FVT c0fvtD6 = d6();
        TextStickerModel textStickerModel = null;
        if (c0fvtD6 == null || (listSb = c0fvtD6.Sb()) == null) {
            return;
        }
        Iterator<TextStickerModel> it2 = listSb.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TextStickerModel next = it2.next();
            if (C0F8Y.LJII(next)) {
                textStickerModel = next;
                break;
            }
        }
        TextStickerModel textStickerModel2 = textStickerModel;
        if (textStickerModel2 != null) {
            C0FVT c0fvtD62 = d6();
            if (c0fvtD62 != null) {
                c0fvtD62.Fj(textStickerModel2.getBaseStickerModel().getId());
            }
            q9();
        }
    }

    @Override // X.C0EXI
    public void FI2() {
        boolean z = !C0CHQ.LIZ().LJJIIZI().LJJJLIIL(false);
        InterfaceC1460000o62 interfaceC1460000o62M6 = m6();
        if (interfaceC1460000o62M6 != null) {
            interfaceC1460000o62M6.oz(z);
        }
        N6(z);
        C0LAB c0lab = new C0LAB();
        C0MJO.LIZIZ(K6().creativeModel, c0lab);
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("creation_id", K6().getCreationId());
        pairArr[1] = new Pair("shoot_way", K6().mShootWay);
        pairArr[2] = new Pair("enter_from", "video_edit_page");
        pairArr[3] = new Pair("content_type", C1428470nHB.LJIILL(K6()));
        pairArr[4] = new Pair("content_source", C1428470nHB.LJIILIIL(K6()));
        pairArr[5] = new Pair("from_mode", !z ? "on" : "off");
        pairArr[6] = new Pair("to_mode", z ? "on" : "off");
        c0lab.LJI(C2097608Jq.LJIIJ(pairArr));
        C20684815ws.LJIILLIIL("click_auto_meme_mode_entrance", c0lab.LIZ);
    }

    @Override // X.C0EXI
    public void F80() {
        y8();
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJZIJLIL;
    }

    public C0EXI n9() {
        return this.LLJZIJLIL;
    }

    @Override // X.C0EXI
    public void j7(TextStickerModel textStickerModel) {
        if (!C0F8Y.LJII(textStickerModel)) {
            return;
        }
        InterfaceC391240FVq interfaceC391240FVqQj = qj();
        if (interfaceC391240FVqQj != null) {
            interfaceC391240FVqQj.k3(textStickerModel, EnumC356070Dxd.COMMIT);
        }
        AbstractC19531111bB.O4(this, false, 1, null);
        P4();
        C390090FRf c390090FRfD5 = D5();
        if (c390090FRfD5 != null) {
            c390090FRfD5.LJIJ(c390090FRfD5.LJJIIJZLJL(), true);
            c390090FRfD5.setVisible(true);
        }
        C391280FVu c391280FVu = AbstractC19531111bB.LLJLLL;
        C0FVT c0fvtD6 = d6();
        InterfaceC391240FVq interfaceC391240FVqQj2 = qj();
        c391280FVu.getClass();
        C391280FVu.LIZ(c0fvtD6, interfaceC391240FVqQj2);
    }

    public C19530711b7(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJZIJLIL = this;
    }
}
