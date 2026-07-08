package X;

import Y.ACListenerS19S0301000_1;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS0S0401000_1;
import g1c.AjS1S0301000_1;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03BT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BT extends C03BQ {
    public final SmartImageView LL;
    public final C1766800w4s LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C0HZQ LLILZ;
    public final View LLILZIL;
    public final ConstraintLayout LLILZLL;
    public final TuxTextView LLIZ;
    public final LinearLayout LLIZLLLIL;
    public final TuxTextView LLJ;

    public C03BT(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b0d, this, true);
        this.LL = (SmartImageView) findViewById(R.id.ry0);
        this.LLILLJJLI = (C1766800w4s) findViewById(R.id.rzz);
        this.LLILLL = (TuxTextView) findViewById(R.id.rzm);
        this.LLILZ = (C0HZQ) findViewById(R.id.ag7);
        this.LLILZIL = findViewById(R.id.ag9);
        this.LLILZLL = (ConstraintLayout) findViewById(R.id.cdz);
        this.LLIZ = (TuxTextView) findViewById(R.id.sum);
        this.LLIZLLLIL = (LinearLayout) findViewById(R.id.wdv);
        this.LLJ = (TuxTextView) findViewById(R.id.ptu);
    }

    public static final void LIZIZ(C752702wn c752702wn, String str, HashMap<String, Object> map, C719102rN c719102rN, Integer num) {
        Integer num2;
        if (c752702wn != null) {
            Integer num3 = c752702wn.LLJJ;
            int value = EnumC804503Ch.ADDON.getValue();
            if (num3 != null && num3.intValue() == value && (num2 = c752702wn.LLJ) != null && num2.intValue() == 10) {
                C03O0 c03o0 = C03O0.LIZ;
                EnumC805403Cq enumC805403Cq = EnumC805403Cq.ADD_ITEM_ORDER;
                c03o0.getClass();
                C03O0.LJJJJLI(str, map, c719102rN, num, enumC805403Cq);
            }
        }
    }

    @Override // X.C03BQ
    public final void LIZ(C752702wn c752702wn, C719102rN c719102rN, boolean z, int i, Integer num, boolean z2, HashMap map, C1077804Jk c1077804Jk) {
        int iIntValue;
        boolean z3;
        String str;
        C03IT imageUrlModel;
        HashMap map2 = map;
        C0HZQ c0hzq = this.LLILZ;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1a, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c0hzq.setCheckBoxUncheckedColor(iIntValue);
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
        LIZIZ(c752702wn, "tiktokec_product_show", map2, c719102rN, Integer.valueOf(i));
        this.LLILLJJLI.LJJJJL(c719102rN.LLJ, c719102rN.LLJJ);
        this.LLIZ.setText(c719102rN.LLJIJIL);
        C786410Ut5.LJLLLLLL(0, this.LLIZ);
        String str2 = c719102rN.LLLJ;
        if (str2 != null) {
            TuxTextView tuxTextView = this.LLJ;
            tuxTextView.setText(str2);
            C786410Ut5.LJLLLLLL(0, tuxTextView);
            tuxTextView.getPaint().setFlags(16);
            tuxTextView.getPaint().setAntiAlias(true);
        }
        if (this.LLJ.getVisibility() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLILZLL);
            c19mb.LJIIIIZZ(this.LLIZ.getId(), 4, this.LLILZLL.getId(), 4);
            c19mb.LIZIZ(this.LLILZLL);
        }
        this.LLILLL.setText(c719102rN.LLJI);
        C786410Ut5.LLLLZLL(this.LLILLL, 0);
        this.LLILZ.setChecked(z);
        C2097608Jq.LJIIIIZZ(new Pair("card_name", "rec_goods_card"), new Pair("author_id", String.valueOf(c719102rN.LLLFFI)), new Pair("click_area", "product"));
        LIZIZ(c752702wn, "tiktokec_card_show", map2, c719102rN, Integer.valueOf(i));
        if (this.LLILZ.getVisibility() == 0) {
            if (map2 != null) {
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("button_name", "buy_now");
                if (Intrinsics.LJFF(c719102rN.LLJJJJJIL, Boolean.TRUE)) {
                    str = "able_to_buy";
                } else {
                    str = "unable_to_buy";
                }
                pairArr[1] = new Pair("button_type", str);
                pairArr[2] = new Pair("purchase_path", "skip_pdp");
                pairArr[3] = new Pair("author_id", String.valueOf(c719102rN.LLLFFI));
                C2097608Jq.LJIIIIZZ(pairArr);
            } else {
                map2 = null;
            }
            LIZIZ(c752702wn, "tiktokec_button_show", map2, c719102rN, Integer.valueOf(i));
        }
        if (Intrinsics.LJFF(c719102rN.LLJJJJJIL, Boolean.FALSE) && C7809033f.LIZ(num)) {
            C786410Ut5.I7(new AjS1S0301000_1(c1077804Jk, c752702wn, i, c719102rN, 1), this.LLIZLLLIL);
        }
        C786410Ut5.I7(new AjS0S0401000_1(c1077804Jk, this, c752702wn, c719102rN, i, 1), this.LLILZIL);
        this.LLILZ.setOnTouchListener(new View.OnTouchListener() { // from class: X.03BU
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    return true;
                }
                return false;
            }
        });
        C786410Ut5.I7(new ACListenerS19S0301000_1(c1077804Jk, c752702wn, c719102rN, i, 0), getRootView());
        if (!z2) {
            this.LLILLJJLI.setTextColorRes(R.attr.a1p);
            this.LLILLL.setTextColorRes(R.attr.a1p);
            this.LLIZ.setTextColorRes(R.attr.a1p);
            this.LLJ.setTextColorRes(R.attr.a1p);
            this.LLIZLLLIL.setClickable(false);
            this.LLILZIL.setClickable(false);
            this.LLILZ.setEnabled(false);
            this.LLILZ.setOnTouchListener(new View.OnTouchListener() { // from class: X.03BV
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
        }
    }
}
