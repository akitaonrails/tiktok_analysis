package X;

import Y.ACListenerS161S0100000_27;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0y6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844500y6C extends C0J8P<C979040baI, C1844510y6D> {
    public final InterfaceC1844530y6F LIZIZ;

    public C1844500y6C(InterfaceC1844530y6F interfaceC1844530y6F) {
        this.LIZIZ = interfaceC1844530y6F;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C979040baI c979040baI) {
        int i;
        boolean z;
        C1844510y6D c1844510y6D = (C1844510y6D) viewHolder;
        C979040baI c979040baI2 = c979040baI;
        C16F5 c16f5 = c1844510y6D.LL;
        if (c979040baI2.LIZLLL) {
            i = 2131853744;
        } else {
            i = 2131853689;
        }
        c16f5.setText(C497740JfY.LJIJI(i));
        int i2 = c979040baI2.LIZ;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    C500260Jjc.LJIILIIL(c1844510y6D.LLILZ);
                    C500260Jjc.LJIILIIL(c1844510y6D.LLILLL);
                    C500260Jjc.LJIILIIL(c1844510y6D.LLILLJJLI);
                }
            } else {
                c1844510y6D.LLILZ.setIcon(R.raw.icon_chevron_down);
                C500260Jjc.LLFFF(c1844510y6D.LLILLL);
                C500260Jjc.LLFFF(c1844510y6D.LLILLJJLI);
                c1844510y6D.LLILLL.setLayerType(1, null);
                c1844510y6D.LLILLJJLI.setLayerType(1, null);
                c1844510y6D.LLILLL.setStrokeColor(ColorStateList.valueOf(C497740JfY.LIZLLL(R.attr.ezk, c1844510y6D.itemView.getContext())));
                c1844510y6D.LLILLL.setStrokeWidth((int) C497740JfY.LIZIZ(2.0f));
                C19RC c19rc = c1844510y6D.LLILLL;
                C19RX shapeAppearanceModel = c19rc.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C19RY c19ry = new C19RY(shapeAppearanceModel);
                c19ry.LIZJ(4.0f);
                c19rc.setShapeAppearanceModel(new C19RX(c19ry));
                C19RC c19rc2 = c1844510y6D.LLILLJJLI;
                C19RX shapeAppearanceModel2 = c1844510y6D.LLILLL.getShapeAppearanceModel();
                shapeAppearanceModel2.getClass();
                C19RY c19ry2 = new C19RY(shapeAppearanceModel2);
                c19ry2.LIZJ(4.0f);
                c19rc2.setShapeAppearanceModel(new C19RX(c19ry2));
                if (c979040baI2.LIZIZ.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(ImageModel.genBy(c979040baI2.LIZIZ));
                    c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
                    c1324610kZfLJIIIZ.LJIIL = new InterfaceC1142670fqD() { // from class: X.09OZ
                        @Override // X.InterfaceC1142670fqD
                        public final void LIZ() {
                        }

                        @Override // X.InterfaceC1142670fqD
                        public final void LIZIZ(Animatable animatable) {
                        }

                        @Override // X.InterfaceC1142670fqD
                        public final void LIZLLL(String str, Exception exc) {
                            String message;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Front cover load failed, ");
                            if (exc != null) {
                                message = exc.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ.append(message);
                            C20441214yg.LIZIZ("MatchPlaybookExpandableViewBinder", C2188811AlT.LIZIZ(sbLIZ));
                        }

                        @Override // X.InterfaceC1142670fqD
                        public final void LIZJ(int i3, int i4, String str) {
                            C20441214yg.LIZIZ("MatchPlaybookExpandableViewBinder", "Front cover load success");
                        }
                    };
                    c1324610kZfLJIIIZ.LJIIIZ = R.drawable.f3f;
                    c1324610kZfLJIIIZ.LJJI(c1844510y6D.LLILLL);
                }
                if (c979040baI2.LIZJ.length() > 0) {
                    C1324610kZf c1324610kZfLJIIIZ2 = C1819620xS4.LIZ().LJIIIZ(ImageModel.genBy(c979040baI2.LIZJ));
                    c1324610kZfLJIIIZ2.LJJ = Boolean.TRUE;
                    c1324610kZfLJIIIZ2.LJIIIZ = R.drawable.f3f;
                    c1324610kZfLJIIIZ2.LJJI(c1844510y6D.LLILLJJLI);
                }
            }
        } else {
            c1844510y6D.LLILZ.setIcon(R.raw.icon_chevron_up);
            C500260Jjc.LJIILIIL(c1844510y6D.LLILLL);
            C500260Jjc.LJIILIIL(c1844510y6D.LLILLJJLI);
        }
        int i3 = c979040baI2.LIZ;
        if (i3 != 0 && i3 != 1) {
            C786410Ut5.I7(null, c1844510y6D.itemView);
        } else {
            C786410Ut5.I7(new ACListenerS161S0100000_27(c1844510y6D.LLILZIL, 175), c1844510y6D.itemView);
        }
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C1844510y6D(this, C786410Ut5.Td(layoutInflater, R.layout.g8h, viewGroup, false));
    }
}
