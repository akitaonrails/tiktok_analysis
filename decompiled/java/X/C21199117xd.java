package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199117xd implements InterfaceC21200817xu {
    public boolean LIZ;
    public final /* synthetic */ C21200317xp LIZIZ;
    public final /* synthetic */ C21198917xb LIZJ;

    @Override // X.InterfaceC21200817xu
    public final void LIZ() {
        this.LIZJ.LIZ.LJJJLZIJ(EnumC21193117wf.LYNX_CARD_LOAD_START, null);
    }

    public final void LIZJ() {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        C599810Nfn c599810Nfn = C599810Nfn.LIZ;
        String message = EnumC1782950wUv.LOAD_INTERRUPT.getMessage();
        c599810Nfn.getClass();
        C599810Nfn.LIZ("geckoLoadListener", message);
        this.LIZJ.LIZ.LJJJLZIJ(EnumC21193117wf.FAIL_LYNX_CANCEL, null);
    }

    public C21199117xd(C21200317xp c21200317xp, C21198917xb c21198917xb) {
        this.LIZIZ = c21200317xp;
        this.LIZJ = c21198917xb;
    }

    @Override // X.InterfaceC21200817xu
    public final void LIZIZ(boolean z, String str, C1783920wWU c1783920wWU, InterfaceC21200617xs interfaceC21200617xs) {
        boolean z2;
        if (this.LIZ) {
            this.LIZIZ.LIZJ(interfaceC21200617xs);
            return;
        }
        C1776350wKH c1776350wKH = null;
        this.LIZJ.LJI = null;
        C599810Nfn c599810Nfn = C599810Nfn.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load result, success: ");
        sbLIZ.append(z);
        sbLIZ.append(", message: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c599810Nfn.getClass();
        C599810Nfn.LIZ("geckoLoadListener", strLIZIZ);
        if (!z) {
            this.LIZJ.LIZ.LJJJLZIJ(EnumC21193117wf.FAIL_LYNX_LOAD_FAIL, str);
            return;
        }
        PopupCardVO popupCardVO = this.LIZJ.LIZ.LJJIJIIJI().LL;
        if (popupCardVO != null && interfaceC21200617xs != null) {
            if (Intrinsics.LJFF(str, "sea_live_lynx_reuse_card")) {
                this.LIZJ.LIZ.LJJJLZIJ(EnumC21193117wf.LYNX_CARD_REUSE, null);
            } else {
                this.LIZJ.LIZ.LJJJLZIJ(EnumC21193117wf.LYNX_CARD_LOADED, null);
            }
            C21200317xp c21200317xp = this.LIZIZ;
            if (c1783920wWU != null) {
                c21200317xp.getClass();
                c1776350wKH = new C1776350wKH(c1783920wWU.LIZ);
            }
            c21200317xp.LIZLLL = c1776350wKH;
            if (c1776350wKH != null) {
                c21200317xp.LIZJ.put(c1776350wKH, interfaceC21200617xs);
            }
            this.LIZJ.LJIILJJIL(popupCardVO);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("vo is null: ");
        boolean z3 = true;
        if (popupCardVO == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ2.append(z2);
        sbLIZ2.append(", card is null: ");
        if (interfaceC21200617xs != null) {
            z3 = false;
        }
        sbLIZ2.append(z3);
        this.LIZJ.LIZ.LJJJLZIJ(EnumC21193117wf.FAIL_LYNX_EXCEPTION, C2188811AlT.LIZIZ(sbLIZ2));
    }
}
