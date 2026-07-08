package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FFC, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FFC extends C0FFE<TextStickerModel> {
    public final Context LJIILIIL;
    public final FrameLayout LJIILJJIL;
    public final C0FFO LJIILL;
    public final LifecycleOwner LJIILLIIL;
    public final C390420FSm LJIIZILJ;
    public final C0FUH LJIJ;
    public C0FFD LJIJI;
    public final C0FUK LJIJJ;
    public final ArrayList<C0FUG> LJIJJLI;
    public final ArrayList<C0FUD> LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public final C01GW LJJIFFI;

    @Override // X.C0FFE
    public final void LJJJ() {
    }

    @Override // X.C0FFE, X.C0FTJ
    public final boolean LIZLLL() {
        C19656611vQ c19656611vQ;
        C1664680tQA<C19656711vR> c1664680tQALJIILIIL;
        C19656711vR c19656711vR;
        return (this.LJIJ.LJIILLIIL && LJIILL().LJIJJ) ? super.LIZLLL() && !C0F8Y.LJII(LJLI()) && ((c19656611vQ = (C19656611vQ) this.LJJI.getValue()) == null || (c1664680tQALJIILIIL = c19656611vQ.LJIILIIL()) == null || (c19656711vR = c1664680tQALJIILIIL.LIZ) == null || !c19656711vR.LIZIZ) : super.LIZLLL();
    }

    @Override // X.C0FFE, X.C0FTJ
    public final boolean LJII() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJII();
    }

    @Override // X.C0FFE, X.C0FTJ
    public final boolean LJIJJLI() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJIJJLI();
    }

    @Override // X.C0FFE, X.C0FTJ
    public final Integer LJJI() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJJI();
    }

    @Override // X.C0FFE
    public final C1664680tQA<BaseStickerModel> LJJIJ() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJJIJ();
    }

    @Override // X.C0FFE
    public final C388890FMp LJJIJIIJI() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJJIJIIJI();
    }

    @Override // X.C0FFE
    public final C0FUE LJJIJIIJIL() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJJIJIIJIL();
    }

    @Override // X.C0FFE
    public final C1664680tQA<C0FFO> LJJIJL() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJJIJL();
    }

    @Override // X.C0FFE
    public final void LJJIZ() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        c0ffd.LJJIZ();
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJJIJIIJIL();
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJJJJJ();
    }

    @Override // X.C0FTJ
    /* JADX INFO: renamed from: LJJJLZIJ, reason: merged with bridge method [inline-methods] */
    public final TextStickerModel LJLI() {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        return c0ffd.LJJJZ().LIZ;
    }

    public final boolean LJJJLL() {
        C19656611vQ c19656611vQ;
        C1664680tQA<C19656711vR> c1664680tQALJIILIIL;
        C19656711vR c19656711vR;
        return LJJIJL().LIZ.LJIJJ && !C0F8Y.LJII(LJLI()) && ((c19656611vQ = (C19656611vQ) this.LJJI.getValue()) == null || (c1664680tQALJIILIIL = c19656611vQ.LJIILIIL()) == null || (c19656711vR = c1664680tQALJIILIIL.LIZ) == null || !c19656711vR.LIZIZ);
    }

    @Override // X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJIILLIIL;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJIILL;
    }

    @Override // X.C0FFE
    public final void LIZ(C0FUG c0fug) {
        super.LIZ(c0fug);
        if (this.LJIJJLI.contains(c0fug)) {
            return;
        }
        this.LJIJJLI.add(c0fug);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        LJIL(stickerModel, true);
    }

    @Override // X.C0FFE
    public final void LJJIIZ(C0FUD c0fud) {
        super.LJJIIZ(c0fud);
        if (this.LJIL.contains(c0fud)) {
            return;
        }
        this.LJIL.add(c0fud);
    }

    @Override // X.C0FFE
    public final void LJJJJIZL(BaseStickerModel baseStickerModel) {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        c0ffd.LJJJJIZL(baseStickerModel);
    }

    @Override // X.C0FFE
    public final void LJJJJL(C0FUG c0fug) {
        super.LJJJJL(c0fug);
        if (!this.LJIJJLI.contains(c0fug)) {
            return;
        }
        this.LJIJJLI.remove(c0fug);
    }

    @Override // X.C0FFE
    public final void LJJJJLI(C0FUD c0fud) {
        super.LJJJJLI(c0fud);
        if (!this.LJIL.contains(c0fud)) {
            return;
        }
        this.LJIL.remove(c0fud);
    }

    public final void LJJJZ(TextStickerModel textStickerModel) {
        C0FFD c0ffl;
        if (textStickerModel.isVERenderSticker()) {
            if (textStickerModel.getTextTemplateModel().enableTextTemplate) {
                c0ffl = new C0FEX(this.LJIILIIL, textStickerModel, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ);
            } else {
                c0ffl = new C0FEY(this.LJIILIIL, textStickerModel, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ);
            }
        } else {
            c0ffl = new C0FFL(this.LJIILIIL, textStickerModel, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL, this.LJIIZILJ);
        }
        c0ffl.LJJL();
        c0ffl.LJJJLZIJ();
        this.LJIJI = c0ffl;
        this.LJIIIZ = c0ffl.LJJIL();
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LLD(boolean z) {
        super.LLD(z);
        this.LJIL.clear();
        this.LJIJJLI.clear();
    }

    @Override // X.C0FTJ
    public final void setAlpha(float f) {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        c0ffd.setAlpha(f);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void setVisible(boolean z) {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        c0ffd.setVisible(z);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIZILJ(EnumC390580FTc enumC390580FTc, float f) {
        C0FFD c0ffd = this.LJIJI;
        if (c0ffd == null) {
            c0ffd = null;
        }
        c0ffd.LJIIZILJ(enumC390580FTc, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0052  */
    @Override // X.C0FFE, X.C0FTJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FFC.LJIL(com.ss.android.ugc.aweme.tools.sticker.core.StickerModel, boolean):void");
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJ(float f, float f2, C00E4 c00e4) {
        C0FGR c0fgr;
        C0FFD c0ffd = null;
        if (c00e4 == C00E4.ON_GOING && (c0fgr = (C0FGR) this.LJJ.getValue()) != null) {
            C0FFD c0ffd2 = this.LJIJI;
            if (c0ffd2 == null) {
                c0ffd2 = null;
            }
            c0fgr.LJIIJ(c0ffd2.LJJJZ().LIZ);
        }
        C0FFD c0ffd3 = this.LJIJI;
        if (c0ffd3 != null) {
            c0ffd = c0ffd3;
        }
        c0ffd.LJIIJ(f, f2, c00e4);
    }

    public C0FFC(Context context, TextStickerModel textStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm, C0FUH c0fuh) {
        super(context, textStickerModel.getBaseStickerModel(), c0ffo, lifecycleOwner, c390420FSm);
        this.LJIILIIL = context;
        this.LJIILJJIL = frameLayout;
        this.LJIILL = c0ffo;
        this.LJIILLIIL = lifecycleOwner;
        this.LJIIZILJ = c390420FSm;
        this.LJIJ = c0fuh;
        LJJJZ(textStickerModel);
        this.LJIJJ = (C0FUK) c390420FSm.LIZIZ(C13LE.LIZ(C0FUK.class));
        this.LJIJJLI = new ArrayList<>();
        this.LJIL = new ArrayList<>();
        this.LJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
        this.LJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1499));
        this.LJJIFFI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1501));
    }
}
