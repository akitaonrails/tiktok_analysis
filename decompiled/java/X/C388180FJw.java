package X;

import android.graphics.Point;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS56S1000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388180FJw implements C0FWO {
    public final /* synthetic */ C388170FJv LL;

    @Override // X.C0FWO
    public final Point LLFZ() {
        Pair<Integer, Integer> centerPoint = this.LL.getCenterPoint();
        int iIntValue = centerPoint != null ? centerPoint.getFirst().intValue() : C0JAI.LIZJ(this.LL.LLILZ);
        Pair<Integer, Integer> centerPoint2 = this.LL.getCenterPoint();
        return new Point(iIntValue, centerPoint2 != null ? centerPoint2.getSecond().intValue() : C0JAI.LIZIZ(this.LL.LLILZ));
    }

    @Override // X.C0FWO
    public final InterfaceC388390FKr R4() {
        return this.LL.getTextStickerEditViewTextTemplateApi();
    }

    @Override // X.C0FWO
    public final C1664680tQA<TextStickerModel> Z() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LL.LLLFZ;
        if (c1664680tQA == null) {
            return null;
        }
        return c1664680tQA;
    }

    @Override // X.C0FWO
    public final void h4() {
        this.LL.getAbilityContainer().LJIL = false;
        this.LL.getAbilityContainer().LJIJJLI = false;
        C388170FJv c388170FJv = this.LL;
        c388170FJv.LJIIJ(new AwS549S0100000_5(c388170FJv, 1638), true, false);
        C388170FJv c388170FJv2 = this.LL;
        c388170FJv2.LJII(c388170FJv2.getTextStickerView());
        AbstractC388140FJs abstractC388140FJs = (AbstractC388140FJs) this.LL.getAbilityContainer().LIZJ(C13LE.LIZ(AbstractC388140FJs.class));
        if (abstractC388140FJs != null) {
            abstractC388140FJs.LJIILJJIL(true);
        }
        this.LL.getAbilityContainer().LJIIIIZZ.LIZIZ(true);
        this.LL.getTextStickerView().setEnabled(true);
        C385340F8y textStickerView = this.LL.getTextStickerView();
        C1664680tQA<TextStickerModel> c1664680tQA = this.LL.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        textStickerView.setText(c1664680tQA.LIZ.getTextStr());
        C385340F8y textStickerView2 = this.LL.getTextStickerView();
        C1664680tQA<TextStickerModel> c1664680tQA2 = this.LL.LLLFZ;
        textStickerView2.setSelection((c1664680tQA2 != null ? c1664680tQA2 : null).LIZ.getTextStr().length());
    }

    @Override // X.C0FWO
    public final void l2() {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LL.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(AFwS234S0000000_5.get$arr$(580), true);
    }

    @Override // X.C0FWO
    public final void l3() {
        this.LL.getAbilityContainer().LJIILLIIL = false;
    }

    @Override // X.C0FEF
    public final boolean onBackPressed() {
        if (this.LL.getVisibility() != 0) {
            return false;
        }
        this.LL.LJJIIJZLJL();
        return true;
    }

    public C388180FJw(C388170FJv c388170FJv) {
        this.LL = c388170FJv;
    }

    @Override // X.C0FWO
    public final void W4(String str) {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LL.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS56S1000000_5(str, 19), true);
        C388170FJv c388170FJv = this.LL;
        c388170FJv.getAbilityContainer().LJIJ = false;
        c388170FJv.LJIIJ(AFwS191S0000000_5.get$arr$(412), true, false);
        C388170FJv c388170FJv2 = this.LL;
        c388170FJv2.LJII(c388170FJv2.getTextStickerView());
    }

    @Override // X.C0FWO
    public final void b4(EnumC1409650mmp enumC1409650mmp) {
        this.LL.getAbilityContainer().LJIIL.LIZJ.invoke(enumC1409650mmp);
    }

    @Override // X.C0FWO
    public final void f5(Pair<String, String> pair) {
        this.LL.getTextStickerEditNotPanelState().LIZLLL(new AwS584S0100000_5(pair, (Pair<Integer, Integer>) 1175), true);
    }

    @Override // X.C0FWO
    public final void s0(boolean z) {
        AbstractC388140FJs abstractC388140FJs = (AbstractC388140FJs) this.LL.getAbilityContainer().LIZJ(C13LE.LIZ(AbstractC388140FJs.class));
        if (abstractC388140FJs != null) {
            abstractC388140FJs.LJIIJJI(z);
        }
    }

    @Override // X.C0FWO
    public final boolean y1(int i) {
        if (this.LL.getVisibility() == 0) {
            C1664680tQA<TextStickerModel> c1664680tQA = this.LL.LLLFZ;
            if (c1664680tQA == null) {
                c1664680tQA = null;
            }
            if (c1664680tQA.LIZ.getId() == i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0FWO
    public final void e3(TTSModel tTSModel, Pair<Float, Float> pair) {
        C1664680tQA<TextStickerModel> c1664680tQA = this.LL.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new AwS371S0200000_5(tTSModel, pair, 301), true);
        C388170FJv c388170FJv = this.LL;
        c388170FJv.getAbilityContainer().LJIIZILJ = false;
        c388170FJv.LJIIJ(AFwS191S0000000_5.get$arr$(412), true, true);
        C388170FJv c388170FJv2 = this.LL;
        c388170FJv2.LJII(c388170FJv2.getTextStickerView());
    }

    @Override // X.C0FWO
    public final void y4(String str, EnumC1409650mmp enumC1409650mmp) {
        C0FL4 c0fl4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterInspirationEditState: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(enumC1409650mmp);
        C0F8J.LIZ("inspiration", C2188811AlT.LIZIZ(sbLIZ));
        this.LL.getAbilityContainer().LJIJJ = enumC1409650mmp;
        this.LL.getAbilityContainer().LJIL = true;
        this.LL.getAbilityContainer().LJIJJLI = false;
        C1664680tQA<TextStickerModel> c1664680tQA = this.LL.LLLFZ;
        C1664680tQA<TextStickerModel> c1664680tQA2 = null;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        if (c1664680tQA.LIZ.getTextTemplateModel().templateuuid.length() == 0) {
            C388170FJv c388170FJv = this.LL;
            C1664680tQA<TextStickerModel> c1664680tQA3 = c388170FJv.LLLFZ;
            if (c1664680tQA3 == null) {
                c1664680tQA3 = null;
            }
            c388170FJv.LJJIZ(TextStickerModel.copy$default(c1664680tQA3.LIZ, null, null, null, "", null, 1, -1, 0, 0.0f, new TextFontModel(null, null, null, null, null, null, 0, 0, null, null, false, false, false, 0, 15359, null), false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -617, 65535, null));
        }
        C388170FJv c388170FJv2 = this.LL;
        c388170FJv2.LJIIJ(new AwS549S0100000_5(c388170FJv2, 1637), true, false);
        this.LL.LJJII(false);
        C388170FJv c388170FJv3 = this.LL;
        c388170FJv3.LJII(c388170FJv3.getTextStickerView());
        C1664680tQA<TextStickerModel> c1664680tQA4 = this.LL.LLLFZ;
        if (c1664680tQA4 == null) {
            c1664680tQA4 = null;
        }
        if (c1664680tQA4.LIZ.getTextTemplateModel().isGroupTextTemplates) {
            ViewGroup viewGroup = this.LL.LLLILZLLLI;
            if (viewGroup != null) {
                c0fl4 = (C0FL4) viewGroup.findViewById(R.id.grz);
            } else {
                c0fl4 = null;
            }
            C388170FJv c388170FJv4 = this.LL;
            InterfaceC385890FBb interfaceC385890FBb = c388170FJv4.LLJJLIIIJLLLLLLLZ;
            if (interfaceC385890FBb != null) {
                interfaceC385890FBb.E11(new C0FXK(c388170FJv4, c0fl4, 0));
            }
        } else {
            InterfaceC385890FBb interfaceC385890FBb2 = this.LL.LLJJLIIIJLLLLLLLZ;
            if (interfaceC385890FBb2 != null) {
                interfaceC385890FBb2.E11(null);
            }
        }
        C1664680tQA<TextStickerModel> c1664680tQA5 = this.LL.LLLFZ;
        if (c1664680tQA5 == null) {
            c1664680tQA5 = null;
        }
        if (c1664680tQA5.LIZ.getTextTemplateModel().isGroupTextTemplates) {
            C1664680tQA<TextStickerModel> c1664680tQA6 = this.LL.LLLFZ;
            if (c1664680tQA6 != null) {
                c1664680tQA2 = c1664680tQA6;
            }
            if (c1664680tQA2.LIZ.getTextTemplateModel().isHint) {
                InterfaceC385890FBb interfaceC385890FBb3 = this.LL.LLJJLIIIJLLLLLLLZ;
                if (interfaceC385890FBb3 != null) {
                    interfaceC385890FBb3.LLLLIIIILLL("");
                    interfaceC385890FBb3.j01(str);
                    return;
                }
                return;
            }
        }
        InterfaceC385890FBb interfaceC385890FBb4 = this.LL.LLJJLIIIJLLLLLLLZ;
        if (interfaceC385890FBb4 == null) {
            return;
        }
        interfaceC385890FBb4.LLLLIIIILLL(str);
    }

    @Override // X.C0FWO
    public final void W0(TTSModel tTSModel, float f, float f2) {
        C388170FJv c388170FJv = this.LL;
        C1664680tQA<TextStickerModel> c1664680tQA = c388170FJv.LLLFZ;
        if (c1664680tQA == null) {
            c1664680tQA = null;
        }
        c1664680tQA.LIZLLL(new C0F7F(c388170FJv, f, f2, tTSModel), true);
    }
}
