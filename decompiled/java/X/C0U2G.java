package X;

import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0U2G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U2G extends C0U2M {
    public final Function1<Long, Integer> LLJIJIL;
    public final C16F5 LLJILJIL;
    public final LiveIconView LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final int LLJJI;

    public void R5(C0U22 c0u22) {
    }

    public void S5(View view) {
        C0U2W c0u2w;
        C0U2W c0u2w2;
        C0U2W c0u2w3;
        C0U2W c0u2w4;
        C0U2W c0u2w5;
        C0U2W c0u2w6;
        final C0U22 c0u22 = this.LLILLJJLI;
        if (c0u22 != null) {
            C0U2W c0u2w7 = this.LLJ;
            if (c0u2w7 != null && c0u2w7.LIZJ() == 2 && (c0u2w5 = this.LLJ) != null && c0u2w5.getCategoryId() == 2) {
                if (c0u22.LJIILIIL == C0U24.NOT_REQUESTED && (c0u2w6 = this.LLJ) != null) {
                    c0u2w6.LIZ(new C765450U0x(c0u22) { // from class: X.0U14
                        {
                            C0U0I c0u0i = C0U0I.REQUEST_FOR_SELF;
                        }
                    });
                    return;
                }
                return;
            }
            C0U2W c0u2w8 = this.LLJ;
            if ((c0u2w8 != null && c0u2w8.LIZJ() == 1) || ((c0u2w = this.LLJ) != null && c0u2w.LIZJ() == 3 && (c0u2w3 = this.LLJ) != null && c0u2w3.getCategoryId() == 2)) {
                if (c0u22.LJIIJJI != EnumC038300Bp.UN_ADD || (c0u2w4 = this.LLJ) == null) {
                    return;
                }
                c0u2w4.LIZ(new C765450U0x(c0u22) { // from class: X.0U0z
                    {
                        C0U0I c0u0i = C0U0I.ADD_TO_QUEUE;
                    }
                });
                return;
            }
            if (c0u22.LJIIL || (c0u2w2 = this.LLJ) == null) {
                return;
            }
            c0u2w2.LIZ(new C765450U0x(c0u22) { // from class: X.0U15
                {
                    C0U0I c0u0i = C0U0I.REQUEST;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T5(X.C0U22 r9) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U2G.T5(X.0U22):void");
    }

    public final void U5(boolean z) {
        C0U2W c0u2w = this.LLJ;
        if (c0u2w != null && c0u2w.LIZIZ()) {
            C500260Jjc.LLFFF(this.LLJILJILJ);
            if (z) {
                LiveIconView liveIconView = this.LLJILJILJ;
                if (liveIconView != null) {
                    liveIconView.setIconAttr(R.attr.c6g);
                    return;
                }
                return;
            }
            LiveIconView liveIconView2 = this.LLJILJILJ;
            if (liveIconView2 == null) {
                return;
            }
            liveIconView2.setIconAttr(R.attr.c6f);
            return;
        }
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
    }

    public final void j3(int i) {
        EnumC038300Bp enumC038300Bp;
        C0U22 c0u22 = this.LLILLJJLI;
        C0U24 c0u24 = null;
        if (c0u22 != null) {
            enumC038300Bp = c0u22.LJIIJJI;
        } else {
            enumC038300Bp = null;
        }
        if (enumC038300Bp != EnumC038300Bp.ADDING) {
            if (c0u22 != null) {
                c0u24 = c0u22.LJIILIIL;
            }
            if (c0u24 != C0U24.REQUESTING) {
                return;
            }
        }
        C16F5 c16f5 = this.LLJILJIL;
        if (c16f5 != null && !c16f5.isSelected()) {
            this.LLJILJIL.setSelected(true);
        }
        C16F5 c16f52 = this.LLJILJIL;
        if (c16f52 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            c16f52.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0U2G(int i, View view, Function1<? super Long, Integer> function1) {
        super(i, view);
        this.LLJIJIL = function1;
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.m3j);
        this.LLJILJIL = c16f5;
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.m3o);
        this.LLJILJILJ = liveIconView;
        this.LLJILLL = (int) C497740JfY.LIZIZ(72.0f);
        this.LLJJ = view.getContext().getResources().getDimensionPixelSize(R.dimen.b1i);
        this.LLJJI = view.getContext().getResources().getDimensionPixelSize(R.dimen.b1g);
        if (c16f5 != null) {
            C500260Jjc.LJLIIIL(500L, c16f5, new AwS591S0100000_12(this, 1067));
        }
        if (liveIconView != null) {
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 1068));
        }
    }

    @Override // X.C0U2M
    public void N5(C0U22 c0u22, int i, C0U2K c0u2k) {
        super.N5(c0u22, i, c0u2k);
        switch (C0U2J.LIZ[c0u2k.ordinal()]) {
            case 1:
                U5(c0u22.LJIIJ);
                T5(c0u22);
                R5(c0u22);
                break;
            case 2:
                U5(c0u22.LJIIJ);
                break;
            case 3:
                j3(0);
                break;
            case 4:
            case 5:
                T5(c0u22);
                break;
            case 6:
                T5(c0u22);
                break;
            case 7:
                T5(c0u22);
                break;
        }
    }
}
