package X;

import Y.ARunnableS132S0100000_32;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterTopNoticeWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.ui.CropActivity;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.12YD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YD implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLayoutChange$9(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onLayoutChange$10(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onLayoutChange$11(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onLayoutChange$12(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onLayoutChange$13(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 14:
                onLayoutChange$14(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 15:
                onLayoutChange$15(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 16:
                onLayoutChange$16(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C12YD(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C196967124n c196967124n = (C196967124n) c12yd.l0;
        float fLIZLLL = c196967124n.LIZLLL() / c196967124n.LIZJ();
        if (fLIZLLL != c196967124n.LIZLLL) {
            c196967124n.LIZJ.invoke(Float.valueOf(fLIZLLL));
            c196967124n.LIZLLL = fLIZLLL;
        }
    }

    public static final void onLayoutChange$1(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) c12yd.l0).invalidateOutline();
    }

    public static final void onLayoutChange$10(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12yd);
        ((C19639311sd) c12yd.l0).LIZJ();
    }

    public static final void onLayoutChange$11(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((LiveCenterTopNoticeWidget) c12yd.l0).E1((i3 - i) / 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onLayoutChange$12(X.C12YD r9, android.view.View r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12YD.onLayoutChange$12(X.12YD, android.view.View, int, int, int, int, int, int, int, int):void");
    }

    public static final void onLayoutChange$13(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12yd);
        C19657311vX c19657311vX = ((C19656611vQ) c12yd.l0).LLJIJIL;
        C19657311vX c19657311vX2 = null;
        if (c19657311vX == null) {
            c19657311vX = null;
        }
        c19657311vX.getVideoEditView().LJJJ((int) ((C19656611vQ) c12yd.l0).LJIILIIL().LIZ.LJ, (int) ((C19656611vQ) c12yd.l0).LJIILIIL().LIZ.LJFF, false);
        C19657311vX c19657311vX3 = ((C19656611vQ) c12yd.l0).LLJIJIL;
        if (c19657311vX3 != null) {
            c19657311vX2 = c19657311vX3;
        }
        c19657311vX2.getMultiVideoVideoModel().LLILLL.setValue(Long.valueOf((long) ((C19656611vQ) c12yd.l0).LJIILIIL().LIZ.LJ));
    }

    public static final void onLayoutChange$14(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12yd);
        ((C19657311vX) c12yd.l0).LIZ();
    }

    public static final void onLayoutChange$15(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12yd);
        View view2 = ((C120B) c12yd.l0).LLILZ;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = view.getWidth();
                C786410Ut5.W5(view2, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onLayoutChange$16(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
            C20441214yg.LIZIZ("LiveShareSticker", "layout change");
            ((C19625211qM) c12yd.l0).LIZIZ();
        }
    }

    public static final void onLayoutChange$2(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) c12yd.l0).invalidateOutline();
    }

    public static final void onLayoutChange$3(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12yd);
        ((C0FL4) c12yd.l0).setCursorVisible(true);
        ((C0FL4) c12yd.l0).setFocusable(true);
        ((C0FL4) c12yd.l0).setFocusableInTouchMode(true);
        ((C0FL4) c12yd.l0).requestFocus();
        C0FL4 c0fl4 = (C0FL4) c12yd.l0;
        KeyboardUtils.LIZJ(c0fl4.getContext(), c0fl4);
    }

    public static final void onLayoutChange$4(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((AnonymousClass1188) c12yd.l0).LJJLIIIJLLLLLLLZ();
    }

    public static final void onLayoutChange$5(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (((C19625811qS) c12yd.l0).al().getFirst().intValue() != ((C19625811qS) c12yd.l0).LLLIIIL.getFirst().intValue() || ((C19625811qS) c12yd.l0).al().getSecond().intValue() != ((C19625811qS) c12yd.l0).LLLIIIL.getSecond().intValue()) {
            ((C19625811qS) c12yd.l0).x5();
        }
        C19625811qS c19625811qS = (C19625811qS) c12yd.l0;
        c19625811qS.LLLIIIL = c19625811qS.al();
    }

    public static final void onLayoutChange$6(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        RelativeLayout.LayoutParams layoutParams;
        view.removeOnLayoutChangeListener(c12yd);
        View view2 = ((C11VM) c12yd.l0).LL;
        if (view2 == null) {
            view2 = null;
        }
        if (Math.abs(view2.getHeight() - view.getHeight()) <= 1) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
                layoutParams.topMargin = C0JAI.LIZLLL(((C11VM) c12yd.l0).getContext());
                C786410Ut5.W5(view, layoutParams);
            }
        }
    }

    public static final void onLayoutChange$7(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12yd);
        C11VN c11vn = ((C19520211Yq) c12yd.l0).LLJJJJ;
        if (c11vn != null) {
            C11VM.LJIIIIZZ(c11vn);
        }
    }

    public static final void onLayoutChange$8(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CropActivity cropActivity = (CropActivity) c12yd.l0;
        if (cropActivity.LLLIIII == null) {
            C19739112Kv c19739112Kv = cropActivity.LLJJIII;
            C19HG c19hg = null;
            if (c19739112Kv == null) {
                c19739112Kv = null;
            }
            cropActivity.LLLIIII = c19739112Kv.getVisibleRect();
            C1910890zpH c1910890zpH = (C1910890zpH) ((CropActivity) c12yd.l0).LLLLJI.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setDisplayWindowRect ");
            C19739112Kv c19739112Kv2 = ((CropActivity) c12yd.l0).LLJJIII;
            if (c19739112Kv2 == null) {
                c19739112Kv2 = null;
            }
            sbLIZ.append(c19739112Kv2.getVisibleRect());
            c1910890zpH.LIZ("CropActivity", C2188811AlT.LIZIZ(sbLIZ));
            CropActivity cropActivity2 = (CropActivity) c12yd.l0;
            C19HG c19hg2 = cropActivity2.LLJJI;
            if (c19hg2 == null) {
                c19hg2 = null;
            }
            c19hg2.setDisplayWindowRect(cropActivity2.LLLIIII);
            CropActivity cropActivity3 = (CropActivity) c12yd.l0;
            C19HG c19hg3 = cropActivity3.LLJJI;
            if (c19hg3 != null) {
                c19hg = c19hg3;
            }
            HandlerHook.viewPost(c19hg, new ARunnableS132S0100000_32(cropActivity3, 56));
        }
    }

    public static final void onLayoutChange$9(C12YD c12yd, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c12yd);
        ((C19639311sd) c12yd.l0).LIZJ();
    }
}
