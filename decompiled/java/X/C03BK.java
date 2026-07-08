package X;

import Y.ARunnableS7S1200000_1;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
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

/* JADX INFO: renamed from: X.03BK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BK extends C03BQ {
    public final SmartImageView LL;
    public final C1766800w4s LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final C0HZQ LLILZLL;
    public final View LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final ConstraintLayout LLJI;
    public final C336770DId LLJIJIL;
    public final TuxTextView LLJILJIL;
    public final LinearLayout LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final TuxTextView LLJJ;

    public C03BK(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b0g, this, true);
        this.LL = (SmartImageView) findViewById(R.id.ry0);
        this.LLILLJJLI = (C1766800w4s) findViewById(R.id.rzz);
        this.LLILLL = (LinearLayout) findViewById(R.id.wdv);
        this.LLILZ = (TuxTextView) findViewById(R.id.rzm);
        this.LLILZIL = (TuxTextView) findViewById(R.id.rze);
        this.LLILZLL = (C0HZQ) findViewById(R.id.ag7);
        this.LLIZ = findViewById(R.id.ag9);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.sum);
        this.LLJ = (TuxTextView) findViewById(R.id.ptu);
        this.LLJI = (ConstraintLayout) findViewById(R.id.vxr);
        this.LLJIJIL = (C336770DId) findViewById(R.id.srx);
        this.LLJILJIL = (TuxTextView) findViewById(R.id.ss0);
        this.LLJILJILJ = (LinearLayout) findViewById(R.id.voo);
        this.LLJILLL = (TuxTextView) findViewById(R.id.vom);
        this.LLJJ = (TuxTextView) findViewById(R.id.von);
    }

    @Override // X.C03BQ
    public final void LIZ(C752702wn c752702wn, C719102rN c719102rN, boolean z, int i, Integer num, boolean z2, HashMap map, C1077804Jk c1077804Jk) {
        String strLIZIZ;
        int length;
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
            this.LLJIJIL.setRate(f.floatValue());
            this.LLJILJIL.setText(f.toString());
            C03DZ.LIZJ(this.LLJIJIL);
            C03DZ.LIZJ(this.LLJILJIL);
            if (c719102rN.LLJJLIIIJLLLLLLLZ != null) {
                C03DZ.LIZJ(this.LLJILJILJ);
            } else {
                C03DZ.LIZ(this.LLJILJILJ);
            }
        } else {
            C03DZ.LIZ(this.LLJIJIL);
            C03DZ.LIZ(this.LLJILJIL);
            C03DZ.LIZ(this.LLJILJILJ);
        }
        if (c719102rN.LLJJLIIIJLLLLLLLZ != null) {
            C03DZ.LIZJ(this.LLJILLL);
        } else {
            C03DZ.LIZ(this.LLJILLL);
        }
        Image image = c719102rN.LLIZLLLIL;
        if (image != null) {
            C1334210kp9.LIZ(image, EnumC1769850w9n.ORDER_SUBMIT_RECOMMEND_PRODUCT_COVER, null, null, null, null, 252);
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
        this.LLIZLLLIL.setText(c719102rN.LLJIJIL);
        C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
        this.LLILZ.setText(c719102rN.LLJI);
        C786410Ut5.LLLLZLL(this.LLILZ, 0);
        if (C703302op.LIZ(c719102rN.LLLJ)) {
            String str = c719102rN.LLLJ;
            if (str != null) {
                length = str.length();
            } else {
                length = 0;
            }
            SpannableString spannableString = new SpannableString(c719102rN.LLLJ);
            C786410Ut5.p2(spannableString, new StrikethroughSpan(), 0, length, 17);
            this.LLJ.setText(spannableString);
        }
        if (C7809033f.LIZ(num)) {
            TuxTextView tuxTextView = this.LLILZIL;
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
                this.LLILZ.setTextColorRes(R.attr.a1n);
                this.LLILZIL.setTextColorRes(R.attr.a1n);
            } else {
                this.LLILZ.setTextColorRes(R.attr.a1k);
                this.LLILZIL.setTextColorRes(R.attr.a1k);
            }
            C03DZ.LIZ(this.LLJI);
        } else {
            this.LLILZ.setTextColorRes(R.attr.a1k);
            this.LLILZIL.setTextColorRes(R.attr.a1k);
            C03DZ.LIZ(this.LLILZIL);
            C03DZ.LIZJ(this.LLJI);
        }
        this.LLILZLL.setChecked(z);
        String str2 = c719102rN.LLJJLIIIJLLLLLLLZ + ' ' + ((Object) getContext().getText(2131832822));
        this.LLJJ.setText(str2);
        HandlerHook.viewPost(this.LLJJ, new ARunnableS7S1200000_1(this, c719102rN, str2, 2));
        if (Intrinsics.LJFF(c719102rN.LLJJJJJIL, Boolean.FALSE) && C7809033f.LIZ(num)) {
            C786410Ut5.I7(new AjS1S0301000_1(c1077804Jk, c752702wn, i, c719102rN, 4), this.LLILLL);
        }
        C786410Ut5.I7(new AjS0S0401000_1(c1077804Jk, this, c752702wn, c719102rN, i, 4), this.LLIZ);
        this.LLILZLL.setOnTouchListener(new View.OnTouchListener() { // from class: X.03BL
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
            this.LLILZ.setTextColorRes(R.attr.a1p);
            this.LLILZIL.setTextColorRes(R.attr.a1p);
            this.LLIZLLLIL.setTextColorRes(R.attr.a1p);
            this.LLILLL.setClickable(false);
            this.LLIZ.setClickable(false);
            this.LLILZLL.setEnabled(false);
            this.LLILZLL.setOnTouchListener(new View.OnTouchListener() { // from class: X.03BM
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
        }
    }
}
