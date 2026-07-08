package X;

import Y.ARunnableS7S1200000_1;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS0S0401000_1;
import g1c.AjS1S0301000_1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03BN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BN extends C03BQ {
    public final SmartImageView LL;
    public final C1766800w4s LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final C0HZQ LLILZIL;
    public final View LLILZLL;
    public final TuxTextView LLIZ;
    public final LinearLayout LLIZLLLIL;
    public final ConstraintLayout LLJ;
    public final C336770DId LLJI;
    public final TuxTextView LLJIJIL;
    public final LinearLayout LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final TuxTextView LLJILLL;

    public C03BN(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b0f, this, true);
        this.LL = (SmartImageView) findViewById(R.id.ry0);
        this.LLILLJJLI = (C1766800w4s) findViewById(R.id.rzz);
        this.LLILLL = (TuxTextView) findViewById(R.id.rzm);
        this.LLILZ = (TuxTextView) findViewById(R.id.rze);
        this.LLILZIL = (C0HZQ) findViewById(R.id.ag7);
        this.LLILZLL = findViewById(R.id.ag9);
        this.LLIZ = (TuxTextView) findViewById(R.id.sum);
        this.LLIZLLLIL = (LinearLayout) findViewById(R.id.wdv);
        this.LLJ = (ConstraintLayout) findViewById(R.id.vxr);
        this.LLJI = (C336770DId) findViewById(R.id.srx);
        this.LLJIJIL = (TuxTextView) findViewById(R.id.ss0);
        this.LLJILJIL = (LinearLayout) findViewById(R.id.voo);
        this.LLJILJILJ = (TuxTextView) findViewById(R.id.vom);
        this.LLJILLL = (TuxTextView) findViewById(R.id.von);
    }

    @Override // X.C03BQ
    public final void LIZ(C752702wn c752702wn, C719102rN c719102rN, boolean z, int i, Integer num, boolean z2, HashMap map, C1077804Jk c1077804Jk) {
        int iIntValue;
        String strLIZIZ;
        C03IT imageUrlModel;
        Float f = c719102rN.LLJJL;
        if (f != null) {
            try {
                C2327809Ae.LJIIIIZZ(C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f.floatValue())}, 1)));
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LLJI.setRate(f.floatValue());
            this.LLJIJIL.setText(f.toString());
            C03DZ.LIZJ(this.LLJI);
            C03DZ.LIZJ(this.LLJIJIL);
            if (c719102rN.LLJJLIIIJLLLLLLLZ != null) {
                C03DZ.LIZJ(this.LLJILJIL);
            } else {
                C03DZ.LIZ(this.LLJILJIL);
            }
        } else {
            C03DZ.LIZ(this.LLJI);
            C03DZ.LIZ(this.LLJIJIL);
            C03DZ.LIZ(this.LLJILJIL);
        }
        if (c719102rN.LLJJLIIIJLLLLLLLZ != null) {
            C03DZ.LIZJ(this.LLJILJILJ);
        } else {
            C03DZ.LIZ(this.LLJILJILJ);
        }
        C0HZQ c0hzq = this.LLILZIL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c0hzq.setCheckBoxUncheckedColor(iIntValue);
        this.LLILZIL.setInnerMaskVisibility(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C958103op.LIZLLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        Image image = c719102rN.LLIZLLLIL;
        if (image != null) {
            C1334210kp9.LIZ(image, EnumC1769850w9n.ORDER_SUBMIT_RECOMMEND_PRODUCT_COVER_LARGE, null, null, null, null, 252);
        }
        Image image2 = c719102rN.LLIZLLLIL;
        if (image2 != null && (imageUrlModel = image2.toImageUrlModel()) != null) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
            c1331670kl3LIZLLL.LJJIII = EnumC1334360kpO.HIGH;
            c1331670kl3LIZLLL.LIZLLL("product_image_tag");
            c1331670kl3LIZLLL.LJJ(this.LL);
            C786410Ut5.h3(c1331670kl3LIZLLL);
            this.LL.setColorFilter(134217728);
        }
        this.LLILLJJLI.LJJJJL(c719102rN.LLJ, c719102rN.LLJJ);
        this.LLIZ.setText(c719102rN.LLJIJIL);
        C786410Ut5.LJLLLLLL(0, this.LLIZ);
        this.LLILLL.setText(c719102rN.LLJI);
        C786410Ut5.LLLLZLL(this.LLILLL, 0);
        if (C7809033f.LIZ(num)) {
            TuxTextView tuxTextView = this.LLILZ;
            C786410Ut5.LJLLLLLL(0, tuxTextView);
            if (C426750GoL.LIZLLL(tuxTextView.getContext())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(num);
                sbLIZ.append('x');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('x');
                sbLIZ2.append(num);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            tuxTextView.setText(strLIZIZ);
            if (z) {
                this.LLILLL.setTextColorRes(R.attr.a1n);
                this.LLILZ.setTextColorRes(R.attr.a1n);
            } else {
                this.LLILLL.setTextColorRes(R.attr.a1k);
                this.LLILZ.setTextColorRes(R.attr.a1k);
            }
            C03DZ.LIZ(this.LLJ);
        } else {
            this.LLILLL.setTextColorRes(R.attr.a1k);
            this.LLILZ.setTextColorRes(R.attr.a1k);
            C03DZ.LIZ(this.LLILZ);
            C03DZ.LIZJ(this.LLJ);
        }
        this.LLILZIL.setChecked(z);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(c719102rN.LLJJLIIIJLLLLLLLZ);
        sbLIZ3.append(' ');
        sbLIZ3.append((Object) getContext().getText(2131832822));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        this.LLJILLL.setText(strLIZIZ2);
        HandlerHook.viewPost(this.LLJILLL, new ARunnableS7S1200000_1(this, c719102rN, strLIZIZ2, 0));
        if (Intrinsics.LJFF(c719102rN.LLJJJJJIL, Boolean.FALSE) && C7809033f.LIZ(num)) {
            C786410Ut5.I7(new AjS1S0301000_1(c1077804Jk, c752702wn, i, c719102rN, 0), this.LLIZLLLIL);
        }
        C786410Ut5.I7(new AjS0S0401000_1(c1077804Jk, this, c752702wn, c719102rN, i, 0), this.LLILZLL);
        this.LLILZIL.setOnTouchListener(new View.OnTouchListener() { // from class: X.03BO
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    return true;
                }
                return false;
            }
        });
        if (!z2) {
            this.LLILLJJLI.setTextColorRes(R.attr.a1p);
            this.LLILLL.setTextColorRes(R.attr.a1p);
            this.LLILZ.setTextColorRes(R.attr.a1p);
            this.LLIZ.setTextColorRes(R.attr.a1p);
            this.LLIZLLLIL.setClickable(false);
            this.LLILZLL.setClickable(false);
            this.LLILZIL.setEnabled(false);
            this.LLILZIL.setOnTouchListener(new View.OnTouchListener() { // from class: X.03BP
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
        }
    }
}
