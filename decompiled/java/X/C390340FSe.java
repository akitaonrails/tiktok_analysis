package X;

import Y.ARunnableS38S0300000_5;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C390340FSe implements C0EOH {
    public final /* synthetic */ C390390FSj LIZ;

    @Override // X.C0EOH
    public final C21637819mC LIZ() {
        return this.LIZ.LJIILL().LIZ();
    }

    @Override // X.C0EOH
    public final C0FV1 LIZIZ() {
        return (C0FV1) this.LIZ.LJIILL().LJIILLIIL.getValue();
    }

    public final C390930FUl LIZLLL() {
        return (C390930FUl) this.LIZ.LJIIZILJ.getValue();
    }

    public final C390640FTi LJ() {
        return this.LIZ.LJIILL().LIZJ().LIZIZ().LIZ;
    }

    public final C19656611vQ LJFF() {
        return this.LIZ.LJIILL().LIZLLL();
    }

    public final C0FV1 LJI() {
        return (C0FV1) this.LIZ.LJIILL().LJIILLIIL.getValue();
    }

    public final C391140FVg LJII() {
        return this.LIZ.LJIILL().LJ();
    }

    public final C0FW7 LJIIIIZZ() {
        return (C0FW7) this.LIZ.LJIILL().LJJI.getValue();
    }

    public final boolean LJIIIZ() {
        this.LIZ.LJIILL().LJI().LJJIL(false);
        this.LIZ.LJIILL().LJFF().LJJIJIL();
        return this.LIZ.LJIILL().LIZIZ().LJJIL();
    }

    public final C0FTN LJIIJJI() {
        return (C0FTN) this.LIZ.LJIILL().LJI().LLJILJILJ.getValue();
    }

    public C390340FSe(C390390FSj c390390FSj) {
        this.LIZ = c390390FSj;
    }

    public final void LIZJ(int i, int i2) {
        C0FTJ<StickerModel> next;
        C0FTJ<StickerModel> next2;
        C0FFE c0ffe;
        C1664680tQA<BaseStickerModel> c1664680tQALJJIJ;
        C0FFE c0ffe2;
        C1664680tQA<BaseStickerModel> c1664680tQALJJIJ2;
        C390070FRd c390070FRd = (C390070FRd) this.LIZ.LJIILL().LJJIFFI.getValue();
        c390070FRd.LLILZ = Integer.valueOf(i);
        c390070FRd.LLILZIL = Integer.valueOf(i2);
        Iterator<C0FTJ<StickerModel>> it2 = c390070FRd.LLILLJJLI.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getStickerId() == i2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0FTJ<StickerModel> c0ftj = next;
        Iterator<C0FTJ<StickerModel>> it3 = c390070FRd.LLILLJJLI.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (next2.getStickerId() == i) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        C0FTJ<StickerModel> c0ftj2 = next2;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C390080FRe(c0ftj, c390070FRd, null), 3);
        if ((c0ftj instanceof C0FFE) && (c0ffe2 = (C0FFE) c0ftj) != null && (c1664680tQALJJIJ2 = c0ffe2.LJJIJ()) != null) {
            c1664680tQALJJIJ2.LIZ(new C2217381BqS() { // from class: X.0FPp
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((BaseStickerModel) obj).getHeight());
                }
            }).LJIIIZ(c390070FRd.LLILLL, Lifecycle.State.STARTED, new AwS584S0100000_5(c390070FRd, 842));
        }
        if ((c0ftj2 instanceof C0FFE) && (c0ffe = (C0FFE) c0ftj2) != null && (c1664680tQALJJIJ = c0ffe.LJJIJ()) != null) {
            c1664680tQALJJIJ.LIZ(new C2217381BqS() { // from class: X.0FPq
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((BaseStickerModel) obj).getHeight());
                }
            }).LJIIIZ(c390070FRd.LLILLL, Lifecycle.State.STARTED, new AwS584S0100000_5(c390070FRd, 844));
        }
    }

    public final void LJIIL(int i, C0FSX c0fsx) {
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, this.LIZ.LJIIL);
        if (c0ftjLIZ == null) {
            return;
        }
        C0FSY c0fsyLJFF = this.LIZ.LJIILL().LJFF();
        HandlerHook.viewPost(c0fsyLJFF.LLILLL, new ARunnableS38S0300000_5(c0fsyLJFF, c0ftjLIZ.LJJIIJZLJL(), c0fsx, 5));
    }

    @Override // X.C0EOH
    public final void LLILII(boolean z, String str, int i, C0FSX c0fsx, Integer num, Integer num2, Integer num3, Integer num4, C0FSZ c0fsz) {
        C0FTJ c0ftjLIZ = C0FKU.LIZ(i, this.LIZ.LJIIL);
        if (c0ftjLIZ == null) {
            return;
        }
        if (c0ftjLIZ.LJJIIJZLJL().getWidth() != 0) {
            LJIIJ(z, this.LIZ, str, c0ftjLIZ, c0fsx, num, num2, num3, num4, c0fsz);
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C390350FSf(c0ftjLIZ, z, this.LIZ, str, c0fsx, num, num2, num3, num4, c0fsz, null), 3);
        }
    }

    public static final void LJIIJ(boolean z, C390390FSj c390390FSj, String str, C0FTJ<? extends StickerModel> c0ftj, final C0FSX c0fsx, Integer num, Integer num2, final Integer num3, final Integer num4, final C0FSZ c0fsz) {
        int iIntValue;
        int iIntValue2;
        if (z) {
            final C0FSY c0fsyLJFF = c390390FSj.LJIILL().LJFF();
            BaseStickerModel baseStickerModelLJJIIJZLJL = c0ftj.LJJIIJZLJL();
            c0fsyLJFF.getClass();
            final RectF stickerBoundingRect = baseStickerModelLJJIIJZLJL.getStickerBoundingRect();
            TuxTextView tuxTextView = c0fsyLJFF.LLILLL;
            tuxTextView.setText(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 82;
            }
            tuxTextView.setTuxFont(iIntValue);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = R.attr.ee;
            }
            tuxTextView.setTextColorRes(iIntValue2);
            tuxTextView.setMaxWidth(c0fsyLJFF.LL.getWidth() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * 2));
            tuxTextView.setMaxLines(10);
            if (c0fsyLJFF.LLILLL.getParent() == null) {
                int iWidth = (int) stickerBoundingRect.width();
                if (num4 != null && num4.intValue() > iWidth) {
                    iWidth = num4.intValue();
                }
                C786410Ut5.R6(c0fsyLJFF.LLILLL, new FrameLayout.LayoutParams(iWidth - 16, -2));
                c0fsyLJFF.LL.addView(c0fsyLJFF.LLILLL);
            }
            HandlerHook.viewPost(c0fsyLJFF.LLILLL, new Runnable() { // from class: X.0FSb
                public final void LIZ() {
                    float fWidth;
                    float fLIZIZ;
                    if (c0fsyLJFF.LLILLL.getParent() == null) {
                        return;
                    }
                    int i = C390320FSc.LIZ[c0fsx.ordinal()];
                    if (i == 1) {
                        PointF pointF = new PointF(stickerBoundingRect.centerX(), stickerBoundingRect.bottom);
                        Integer num5 = num4;
                        fWidth = (num5 == null || ((float) num5.intValue()) <= stickerBoundingRect.width()) ? (pointF.x - (stickerBoundingRect.width() / 2)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : pointF.x - (c0fsyLJFF.LLILLL.getMeasuredWidth() / 2);
                        fLIZIZ = pointF.y + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    } else {
                        if (i != 2) {
                            throw new C1954807lC();
                        }
                        PointF pointF2 = new PointF(stickerBoundingRect.centerX(), stickerBoundingRect.top);
                        fWidth = pointF2.x - (c0fsyLJFF.LLILLL.getMeasuredWidth() / 2);
                        fLIZIZ = (pointF2.y - c0fsyLJFF.LLILLL.getMeasuredHeight()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    }
                    c0fsyLJFF.LJJIJL(fWidth, fLIZIZ, num3, c0fsz);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StickerGuide@28fc.showGuide$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StickerGuide@28fc.showGuide$2");
                }
            });
            return;
        }
        c390390FSj.LJIILL().LJFF().LJJIJIL();
    }
}
