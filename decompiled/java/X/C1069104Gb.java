package X;

import android.content.Context;
import android.view.KeyEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.04Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1069104Gb extends ConstraintLayout {
    public C20627315nb LL;
    public C20626615nU LLILLJJLI;
    public SmartImageView LLILLL;
    public TuxTextView LLILZ;
    public final C01GW LLILZIL;

    public final TuxTextView getPriceTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rtn);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C20626615nU getPriceTextSkeletonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rtp);
            this.LLILLJJLI = (C20626615nU) callbackFindViewById;
        }
        return (C20626615nU) callbackFindViewById;
    }

    public final SmartImageView getPromotionProductImageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sb2);
            this.LLILLL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C20627315nb getPromotionProductImageSkeletonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.sb3);
            this.LL = (C20627315nb) callbackFindViewById;
        }
        return (C20627315nb) callbackFindViewById;
    }

    public final InterfaceC1069404Ge getStyle() {
        return (InterfaceC1069404Ge) this.LLILZIL.getValue();
    }

    public C1069104Gb(Context context) {
        super(context, null, 0);
        this.LLILZIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(308));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b0a, this, true);
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
    }

    public final void setPriceTextFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setPriceTextSkeletonFromXml(C20626615nU c20626615nU) {
        this.LLILLJJLI = c20626615nU;
    }

    public final void setPromotionProductImageFromXml(SmartImageView smartImageView) {
        this.LLILLL = smartImageView;
    }

    public final void setPromotionProductImageSkeletonFromXml(C20627315nb c20627315nb) {
        this.LL = c20627315nb;
    }

    public final void e0(Context context, Image image, String str) {
        getPromotionProductImageSkeletonFromXml().setLoading(false);
        getPriceTextSkeletonFromXml().setLoading(false);
        SmartImageView promotionProductImageFromXml = getPromotionProductImageFromXml();
        C1744700vVE.LJIIL(promotionProductImageFromXml, getStyle().getImageWidth());
        C1744700vVE.LJIIIIZZ(getStyle().getImageHeight(), promotionProductImageFromXml);
        TuxTextView priceTextFromXml = getPriceTextFromXml();
        C0H1U.LJIIL(priceTextFromXml, str, true);
        getStyle().LIZ();
        priceTextFromXml.setTuxFont(52);
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
        c1331670kl3LIZLLL.LJJ = EnumC1338240kve.CENTER_CROP;
        c1331670kl3LIZLLL.LJJI = getStyle().LIZIZ();
        c1331670kl3LIZLLL.LJJIIZI(C1308910kAL.LJ(R.attr.bv, context));
        c1331670kl3LIZLLL.LJJ(getPromotionProductImageFromXml());
        C786410Ut5.h3(c1331670kl3LIZLLL);
    }
}
