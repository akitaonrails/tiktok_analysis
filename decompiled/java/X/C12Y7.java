package X;

import Y.AObjectS372S0100000_29;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.12Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12Y7 extends C19IN {
    public final int $t;
    public Object l0;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y7(C12G1 c12g1, int i) {
        super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        this.$t = i;
        this.l0 = c12g1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$0(C12Y7 c12y7, View view) {
        C19557811fU c19557811fU = (C19557811fU) c12y7.l0;
        C0EYM c0eym = (C0EYM) c19557811fU.LIZJ.getValue();
        if (c0eym != null && c0eym.LJI == 0) {
            return;
        }
        int id = view.getId();
        if (id == R.id.lr1) {
            c19557811fU.LIZJ();
            return;
        }
        if (id == R.id.zbv) {
            if (c19557811fU.LJJJ.equals(c19557811fU.LJJJI) && (c19557811fU.LJ.getValue() == 0 || ((C1452720nuI.LJI().equals(c19557811fU.LJ.getValue()) && c19557811fU.LJJIJLIJ == null) || ((C1452720nuI) c19557811fU.LJ.getValue()).equals(c19557811fU.LJJIJLIJ)))) {
                c19557811fU.LJJJIL = 1;
                c19557811fU.LJIIJJI();
                c19557811fU.LJIJ();
                return;
            }
            if (C296180BjE.LIZ()) {
                C1397580mTM c1397580mTM = new C1397580mTM(c19557811fU.LJJIJIIJIL);
                c1397580mTM.LIZ(2131830677);
                C1397620mTQ c1397620mTQ = new C1397620mTQ(c19557811fU.LJJIJIIJIL);
                c1397620mTQ.LJ(2131830681, new AObjectS372S0100000_29(c19557811fU, 0));
                c1397620mTQ.LJII(2131830680, null);
                c1397580mTM.LJIIL = c1397620mTQ;
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            C19EG c19eg = c19557811fU.LJJIJIIJIL;
            C1625650sPD c1625650sPD = new C1625650sPD(c19eg);
            c1625650sPD.LIZ = c19eg.getString(2131832366);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.11fu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            };
            c1625650sPD.LIZLLL = c19eg.getString(R.string.f1_);
            c1625650sPD.LJFF = onClickListener;
            C12YK c12yk = new C12YK(c19557811fU, 0);
            c1625650sPD.LIZJ = c19eg.getString(2131832365);
            c1625650sPD.LJ = c12yk;
            new C19562211gC(c1625650sPD).LIZ();
            return;
        }
        if (id == R.id.tv_save) {
            c19557811fU.LJJJIL = 2;
            c19557811fU.LJIIJJI();
            c19557811fU.LJIJ();
            c19557811fU.LJIILL();
            return;
        }
        if (id != R.id.videolayout) {
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntP = c19557811fU.LJJI;
        if (interfaceC1452170ntP != null && interfaceC1452170ntP.getState() == VEEditor.VEState.STARTED) {
            c19557811fU.LJIIIZ();
        } else {
            c19557811fU.LIZJ();
        }
    }

    public static final void LIZ$1(C12Y7 c12y7, View view) {
        ((C194425114t) c12y7.l0).LLLLIL().LIZIZ.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$2(C12Y7 c12y7, View view) {
        AnonymousClass1136 currentPage;
        String strLJIJJLI;
        C19557511fR c19557511fR = (C19557511fR) c12y7.l0;
        C0EYM c0eym = (C0EYM) c19557511fR.LIZJ.getValue();
        if (c0eym != null && c0eym.LJI == 0) {
            return;
        }
        int id = view.getId();
        if (id == R.id.lr1) {
            c19557511fR.LJIIIIZZ();
            return;
        }
        if (id == R.id.zbv) {
            if (c19557511fR.LJJJJIZL.equals(c19557511fR.LJJJJJ) && (c19557511fR.LJ.getValue() == 0 || ((C1452720nuI.LJI().equals(c19557511fR.LJ.getValue()) && c19557511fR.LJJJIL == null) || ((C1452720nuI) c19557511fR.LJ.getValue()).equals(c19557511fR.LJJJIL)))) {
                c19557511fR.LJJJJJL = 1;
                c19557511fR.LJIIL();
                c19557511fR.LJIJI();
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c19557511fR.LJJIJLIJ);
            C1397620mTQ c1397620mTQ = new C1397620mTQ(c19557511fR.LJJIJLIJ);
            if (C296180BjE.LIZ()) {
                c1397580mTM.LIZ(2131830677);
                c1397620mTQ.LJ(2131830681, new AObjectS372S0100000_29(c19557511fR, 4));
                c1397620mTQ.LJII(2131830680, null);
            } else {
                c1397580mTM.LIZ(2131832366);
                c1397620mTQ.LJFF(2131832365, new AObjectS372S0100000_29(c19557511fR, 5));
                c1397620mTQ.LJII(R.string.f1_, null);
            }
            c1397580mTM.LJIIL = c1397620mTQ;
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        if (id == R.id.tv_save) {
            c19557511fR.LJJJJJL = 2;
            c19557511fR.LJIIL();
            c19557511fR.LJIJI();
            c19557511fR.LJIILLIIL();
            return;
        }
        if (id == R.id.t1j) {
            C113Z c113z = c19557511fR.LJJIZ;
            if (c113z == null || (currentPage = c113z.getCurrentPage()) == null || !(currentPage instanceof C113E) || (strLJIJJLI = ((C113E) currentPage).LJIJJLI()) == null) {
                return;
            }
            C1413450msx c1413450msx = C1413450msx.LIZ;
            VideoPublishEditModel videoPublishEditModel = c19557511fR.LIZ;
            String str = c19557511fR.LJJJJI;
            c1413450msx.getClass();
            C0LAB c0labLJI = C1413450msx.LJI(videoPublishEditModel);
            c0labLJI.LJ("effect_id", strLJIJJLI);
            if (str == null) {
                str = "";
            }
            c0labLJI.LJ("tab_name", str);
            c0labLJI.LIZ(0, "is_editor_pro");
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("click_effect_undo", c0labLJI.LIZ);
            return;
        }
        if (id != R.id.videolayout) {
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntP = c19557511fR.LJJIII;
        if (interfaceC1452170ntP != null && interfaceC1452170ntP.getState() == VEEditor.VEState.STARTED) {
            c19557511fR.LJIIIZ();
            C1413450msx c1413450msx2 = C1413450msx.LIZ;
            VideoPublishEditModel videoPublishEditModel2 = c19557511fR.LIZ;
            String str2 = c19557511fR.LJJJJI;
            c1413450msx2.getClass();
            C1413450msx.LJIIIZ(videoPublishEditModel2, str2, false);
            return;
        }
        c19557511fR.LJIIIIZZ();
    }

    public static final void LIZ$3(C12Y7 c12y7, View view) {
        ((C12G1) c12y7.l0).LLLLZLLIL("cover_entrance");
    }

    public static final void LIZ$4(C12Y7 c12y7, View view) {
        ((C12G1) c12y7.l0).LLLLZLLIL("cover_entrance");
    }

    public static final void LIZ$5(C12Y7 c12y7, View view) {
        C12GQ c12gq = ((C12GK) c12y7.l0).LLIZLLLIL;
        if (c12gq != null) {
            c12gq.LIZ();
        }
    }

    public static final void LIZ$6(C12Y7 c12y7, View view) {
        C12DF c12df = (C12DF) c12y7.l0;
        c12df.getClass();
        int id = view.getId();
        if (id == R.id.bmy) {
            c12df.LLLLIL().LIZ.invoke();
            return;
        }
        if (id == R.id.e0s) {
            c12df.LLLLIL().LIZLLL.invoke();
            return;
        }
        if (id == R.id.rj2) {
            c12df.LLLLIL().LIZIZ.invoke();
        } else if (id == R.id.af3) {
            c12df.LLLLIL().LIZJ.invoke();
        } else {
            if (id != R.id.y4q) {
                return;
            }
            c12df.LLLLIL().LJ.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y7(C12GK c12gk, int i) {
        super(600, true);
        this.$t = i;
        this.l0 = c12gk;
    }

    public C12Y7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12Y7(Object obj, int i, int i2) {
        super(0, 3);
        this.$t = i;
        this.l0 = obj;
    }
}
