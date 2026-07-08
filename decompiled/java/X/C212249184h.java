package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelCountdown;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import defpackage.d6;

/* JADX INFO: renamed from: X.184h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212249184h<T extends ViewGroup> extends AbstractC212320187a<T, C212260184s, InterfaceC212247184f, InterfaceC212256184o> {
    public final boolean LJI;
    public final InterfaceC212259184r<T> LJII;
    public C0NOH LJIIIIZZ;
    public C212334187o LJIIIZ;
    public Integer LJIIJ;
    public boolean LJIIJJI;

    @Override // X.C185J
    public final boolean LJFF() {
        C212334187o c212334187o = this.LJIIIZ;
        return c212334187o != null && c212334187o.getVisibility() == 0;
    }

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJ() {
        return new InterfaceC212256184o() { // from class: X.184j
            @Override // X.InterfaceC212256184o
            public final C212334187o LJIIIIZZ(Context context, PromotionLabel promotionLabel) {
                C212335187p c212335187p = C212335187p.LIZ;
                C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel, context, d6.LIZ(promotionLabel.type));
                c212335187p.getClass();
                return C212335187p.LIZ(context, c212337187rLIZ);
            }
        };
    }

    @Override // X.C185J
    @InterfaceC1294060jmO
    public final boolean LJIIIZ(boolean z) {
        C212334187o c212334187o = this.LJIIIZ;
        if (c212334187o == null) {
            return false;
        }
        C185J.LJIIIIZZ(c212334187o, false);
        LJIILJJIL(false);
        return true;
    }

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJJI(InterfaceC212247184f interfaceC212247184f) {
        final InterfaceC212247184f interfaceC212247184f2 = interfaceC212247184f;
        return new InterfaceC212256184o(interfaceC212247184f2) { // from class: X.184i
            public final InterfaceC212247184f LIZ;

            {
                this.LIZ = interfaceC212247184f2;
            }

            @Override // X.InterfaceC212256184o
            public final C212334187o LJIIIIZZ(Context context, PromotionLabel promotionLabel) {
                C212335187p c212335187p = C212335187p.LIZ;
                C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel, context, d6.LIZ(promotionLabel.type));
                c212335187p.getClass();
                C212334187o c212334187oLIZ = C212335187p.LIZ(context, c212337187rLIZ);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, this.LIZ.getHeight());
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c212334187oLIZ);
                c212334187oLIZ.setLayoutParams(marginLayoutParams);
                return c212334187oLIZ;
            }
        };
    }

    public final void LJIILJJIL(boolean z) {
        InterfaceC212259184r<T> interfaceC212259184r;
        if (this.LJIIJJI != z && (interfaceC212259184r = this.LJII) != null) {
            interfaceC212259184r.LIZ();
        }
        this.LJIIJJI = z;
    }

    public C212249184h(ViewGroup viewGroup, boolean z, C212255184n c212255184n) {
        super(viewGroup);
        this.LJI = z;
        this.LJII = c212255184n;
    }

    public final void LJIILL(int i, PromotionLabel promotionLabel, long j) {
        boolean z;
        Integer num = null;
        if (2 == i) {
            if (j > 86400000) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            if (this.LJIIIZ == null) {
                C212334187o c212334187oLJIIIIZZ = LJIIL().LJIIIIZZ(this.LIZJ, promotionLabel);
                ((ViewGroup) this.LIZ).addView(c212334187oLJIIIIZZ);
                this.LJIIIZ = c212334187oLJIIIIZZ;
                if (c212334187oLJIIIIZZ != null) {
                    LabelCountdown labelCountdown = promotionLabel.countdown;
                    if (labelCountdown != null) {
                        num = labelCountdown.showStyle;
                    }
                    c212334187oLJIIIIZZ.setCountDownShowStyle(num);
                }
            }
            if (z2) {
                C212334187o c212334187o = this.LJIIIZ;
                if (c212334187o != null) {
                    c212334187o.setCountDownText(j);
                }
                PromotionLabelSingleConfig promotionLabelSingleConfig = promotionLabel.promotionLabelSingleConfig;
                if (promotionLabelSingleConfig != null && promotionLabelSingleConfig.hideTextWhenCountDown && C0C00.LIZ(C212258184q.LJ(promotionLabel))) {
                    C212334187o c212334187o2 = this.LJIIIZ;
                    if (c212334187o2 != null) {
                        c212334187o2.setPromotionText("");
                    }
                } else {
                    C212334187o c212334187o3 = this.LJIIIZ;
                    if (c212334187o3 != null) {
                        c212334187o3.setPromotionText(promotionLabel.text);
                    }
                }
            } else {
                C212334187o c212334187o4 = this.LJIIIZ;
                if (c212334187o4 != null) {
                    c212334187o4.setCountDownText(-1L);
                }
            }
            LJIILJJIL(true);
            return;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no need to show count down Type[");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append("], currentState = ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C212334187o c212334187o5 = this.LJIIIZ;
        if (c212334187o5 != null) {
            C786410Ut5.LJJJLZIJ(c212334187o5, (ViewGroup) this.LIZ);
        }
        this.LJIIIZ = null;
        LJIILJJIL(false);
    }
}
