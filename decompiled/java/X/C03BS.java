package X;

import Y.ACListenerS19S0301000_1;
import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import g1c.AjS0S0401000_1;
import g1c.AjS1S0301000_1;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03BS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03BS extends C03BQ {
    public final SmartImageView LL;
    public final C1766800w4s LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public final View LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public boolean LLIZLLLIL;

    public C03BS(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b0e, this, true);
        this.LL = (SmartImageView) findViewById(R.id.ry0);
        this.LLILLJJLI = (C1766800w4s) findViewById(R.id.rzz);
        this.LLILLL = (TuxTextView) findViewById(R.id.rzm);
        this.LLILZ = (TuxIconView) findViewById(R.id.ag_);
        this.LLILZIL = findViewById(R.id.ag8);
        this.LLILZLL = (TuxTextView) findViewById(R.id.sum);
        this.LLIZ = (TuxTextView) findViewById(R.id.ptu);
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
        String str;
        HashMap map2 = map;
        this.LLIZLLLIL = z;
        if (z) {
            this.LLILZ.setIconRes(R.raw.icon_tick);
        } else {
            this.LLILZ.setIconRes(R.raw.icon_plus);
        }
        Image image = c719102rN.LLIZLLLIL;
        if (image != null) {
            C1334210kp9.LIZ(image, EnumC1769850w9n.ORDER_SUBMIT_RECOMMEND_PRODUCT_COVER, null, null, null, null, 252);
            C03IT imageUrlModel = image.toImageUrlModel();
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
        this.LLILZLL.setText(c719102rN.LLJIJIL);
        String str2 = c719102rN.LLLJ;
        if (str2 != null) {
            TuxTextView tuxTextView = this.LLIZ;
            tuxTextView.setText(str2);
            C786410Ut5.LJLLLLLL(0, tuxTextView);
            tuxTextView.getPaint().setFlags(16);
            tuxTextView.getPaint().setAntiAlias(true);
        }
        this.LLILLL.setText(c719102rN.LLJI);
        this.LLIZLLLIL = z;
        C2097608Jq.LJIIIIZZ(new Pair("card_name", "rec_goods_card"), new Pair("author_id", String.valueOf(c719102rN.LLLFFI)), new Pair("click_area", "product"));
        LIZIZ(c752702wn, "tiktokec_card_show", map2, c719102rN, Integer.valueOf(i));
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
        if (Intrinsics.LJFF(c719102rN.LLJJJJJIL, Boolean.FALSE) && C7809033f.LIZ(num)) {
            C786410Ut5.I7(new AjS1S0301000_1(c1077804Jk, c752702wn, i, c719102rN, 2), this.LLILLL);
        }
        C786410Ut5.I7(new AjS0S0401000_1(c1077804Jk, this, c752702wn, c719102rN, i, 3), this.LLILZIL);
        C786410Ut5.I7(new ACListenerS19S0301000_1(c1077804Jk, c752702wn, c719102rN, i, 1), getRootView());
        if (!z2) {
            this.LLILLJJLI.setTextColorRes(R.attr.a1p);
            this.LLILLL.setTextColorRes(R.attr.a1p);
            this.LLILZLL.setTextColorRes(R.attr.a1p);
            this.LLIZ.setTextColorRes(R.attr.a1p);
            this.LLILLL.setClickable(false);
            this.LLILZIL.setClickable(false);
            this.LLILZIL.setEnabled(false);
        }
    }
}
