package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.inner.LabelCountdown;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import defpackage.d6;

/* JADX INFO: renamed from: X.184X, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C184X<T extends ViewGroup> extends C187Z<T, C212246184e, InterfaceC212247184f, C184Z> {
    public final boolean LJII;
    public final InterfaceC212245184d<T> LJIIIIZZ;
    public C0NOH LJIIIZ;
    public C212334187o LJIIJ;
    public Integer LJIIJJI;
    public boolean LJIIL;

    @Override // X.C187Z
    public final InterfaceC212322187c LJIIJJI() {
        return new C184Z() { // from class: X.184a
            @Override // X.C184Z
            public final C212334187o LJIIIIZZ(Context context, PromotionLabel promotionLabel) {
                C212335187p c212335187p = C212335187p.LIZ;
                C212337187r c212337187rLIZ = C18QY.LIZ(promotionLabel, context, d6.LIZ(promotionLabel.type));
                c212335187p.getClass();
                return C212335187p.LIZ(context, c212337187rLIZ);
            }
        };
    }

    public static final InterfaceC212322187c LJIILIIL(Object obj) {
        final InterfaceC212247184f interfaceC212247184f = (InterfaceC212247184f) obj;
        return new C184Z(interfaceC212247184f) { // from class: X.184b
            public final InterfaceC212247184f LIZ;

            {
                this.LIZ = interfaceC212247184f;
            }

            @Override // X.C184Z
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

    public C184X(ViewGroup viewGroup, boolean z, C184Y c184y) {
        super(viewGroup, "promotion_count_down_item");
        this.LJII = z;
        this.LJIIIIZZ = c184y;
    }

    public final void LJIILJJIL(int i, PromotionLabel promotionLabel, long j) {
        InterfaceC212245184d<T> interfaceC212245184d;
        boolean z;
        InterfaceC212245184d<T> interfaceC212245184d2;
        Integer num = null;
        if (2 == i) {
            if (j > 86400000) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            if (this.LJIIJ == null) {
                C212334187o c212334187oLJIIIIZZ = LJIIL().LJIIIIZZ(this.LIZLLL, promotionLabel);
                ((ViewGroup) this.LIZ).addView(c212334187oLJIIIIZZ);
                this.LJIIJ = c212334187oLJIIIIZZ;
                if (c212334187oLJIIIIZZ != null) {
                    LabelCountdown labelCountdown = promotionLabel.countdown;
                    if (labelCountdown != null) {
                        num = labelCountdown.showStyle;
                    }
                    c212334187oLJIIIIZZ.setCountDownShowStyle(num);
                }
            }
            if (z2) {
                C212334187o c212334187o = this.LJIIJ;
                if (c212334187o != null) {
                    c212334187o.setCountDownText(j);
                }
                PromotionLabelSingleConfig promotionLabelSingleConfig = promotionLabel.promotionLabelSingleConfig;
                if (promotionLabelSingleConfig != null && promotionLabelSingleConfig.hideTextWhenCountDown && C0C00.LIZ(C212258184q.LJ(promotionLabel))) {
                    C212334187o c212334187o2 = this.LJIIJ;
                    if (c212334187o2 != null) {
                        c212334187o2.setPromotionText("");
                    }
                } else {
                    C212334187o c212334187o3 = this.LJIIJ;
                    if (c212334187o3 != null) {
                        c212334187o3.setPromotionText(promotionLabel.text);
                    }
                }
            } else {
                C212334187o c212334187o4 = this.LJIIJ;
                if (c212334187o4 != null) {
                    c212334187o4.setCountDownText(-1L);
                }
            }
            if (!this.LJIIL && (interfaceC212245184d2 = this.LJIIIIZZ) != null) {
                interfaceC212245184d2.LIZ();
            }
            this.LJIIL = true;
            return;
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("no need to show count down Type[");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append("], currentState = ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C212334187o c212334187o5 = this.LJIIJ;
        if (c212334187o5 != null) {
            C786410Ut5.LJJJLZIJ(c212334187o5, (ViewGroup) this.LIZ);
        }
        this.LJIIJ = null;
        if (this.LJIIL && (interfaceC212245184d = this.LJIIIIZZ) != null) {
            interfaceC212245184d.LIZ();
        }
        this.LJIIL = false;
    }
}
