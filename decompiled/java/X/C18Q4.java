package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.common.bean.EcUgProduct;
import com.zhiliaoapp.musically.R;
import g1c.AjS7S0201000_32;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.18Q4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Q4 extends RelativeLayout implements C18QA {
    public SmartImageView LL;
    public TuxTextView LLILLJJLI;
    public C18Q3 LLILLL;
    public TuxIconView LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;

    public final TuxIconView getIvArrowFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.l8u);
            this.LLILZ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final SmartImageView getIvProductCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lrz);
            this.LL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C18Q3 getSwitcherProductContentFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.wvl);
            this.LLILLL = (C18Q3) callbackFindViewById;
        }
        return (C18Q3) callbackFindViewById;
    }

    public final TuxTextView getTvProductTitleFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_product_title);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.C18QA
    public final void hide() {
        C18Q3 switcherProductContentFromXml = getSwitcherProductContentFromXml();
        if (switcherProductContentFromXml.LLILZIL && switcherProductContentFromXml.LLILZLL) {
            switcherProductContentFromXml.LLILZLL = false;
            switcherProductContentFromXml.LL.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.C18QA
    public final void show() {
        C18Q3 switcherProductContentFromXml = getSwitcherProductContentFromXml();
        if (!switcherProductContentFromXml.LLILZIL || switcherProductContentFromXml.LLILZLL) {
            return;
        }
        switcherProductContentFromXml.LLILZLL = true;
        switcherProductContentFromXml.LL.removeCallbacksAndMessages(null);
        switcherProductContentFromXml.LL.sendEmptyMessageDelayed(0, 2000L);
    }

    public C18Q4(Context context) {
        super(context, null, 0);
        this.LLILZIL = C294640Bgk.LIZ() == 3;
        C1618390sDV.LIZ.getClass();
        this.LLILZLL = C1618390sDV.LIZIZ(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(context, R.style.z4)), R.layout.btg, this, true);
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLJLLIL.getValue());
    }

    public final void setIvArrowFromXml(TuxIconView tuxIconView) {
        this.LLILZ = tuxIconView;
    }

    public final void setIvProductCoverFromXml(SmartImageView smartImageView) {
        this.LL = smartImageView;
    }

    public final void setSwitcherProductContentFromXml(C18Q3 c18q3) {
        this.LLILLL = c18q3;
    }

    public final void setTvProductTitleFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    @Override // X.C18QA
    public final void LIZ(int i, EcUgProduct ecUgProduct, boolean z, C18QB c18qb) {
        EcUgProduct ecUgProduct2;
        C03IT imageUrlModel;
        Image image = ecUgProduct.firstImage;
        int i2 = 0;
        if (image != null && (imageUrlModel = image.toImageUrlModel()) != null) {
            try {
                float fLIZIZ = C418440Gaw.LIZIZ(4);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = fLIZIZ;
                C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
                PaintDrawable paintDrawable = new PaintDrawable();
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                paintDrawable.getPaint().setColor(-1);
                paintDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ);
                paintDrawable.setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
                paintDrawable.setCornerRadius(fLIZIZ);
                C419910GdJ c419910GdJ = new C419910GdJ();
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                c419910GdJ.LIZIZ = iLIZIZ3;
                c419910GdJ.LIZJ = iLIZIZ3;
                c419910GdJ.LIZ = R.raw.icon_tab_shop;
                c419910GdJ.LIZLLL = C200600pw.LIZ(null, null, "#D9D9D9", null);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{paintDrawable, c419910GdJ.LIZ(getContext())});
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(imageUrlModel);
                c1331670kl3LJIIJ.LJJI = c1331730kl9;
                c1331670kl3LJIIJ.LJJIIZI(layerDrawable);
                c1331670kl3LJIIJ.LJJ = EnumC1338240kve.CENTER_CROP;
                c1331670kl3LJIIJ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIJ.LIZLLL("ec_ug_vsa");
                c1331670kl3LJIIJ.LJJ(getIvProductCoverFromXml());
                C786410Ut5.h3(c1331670kl3LJIIJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        getTvProductTitleFromXml().setText(C123500dV.LIZIZ(ecUgProduct.title));
        C18Q3 switcherProductContentFromXml = getSwitcherProductContentFromXml();
        if (switcherProductContentFromXml.LLILZIL && switcherProductContentFromXml.LLILZLL) {
            switcherProductContentFromXml.LLILZLL = false;
            ecUgProduct2 = null;
            switcherProductContentFromXml.LL.removeCallbacksAndMessages(null);
        } else {
            ecUgProduct2 = null;
        }
        switcherProductContentFromXml.LLILZ = 0;
        switcherProductContentFromXml.LLILZIL = false;
        switcherProductContentFromXml.LLILZLL = false;
        switcherProductContentFromXml.LLILLJJLI = ecUgProduct2;
        ((ArrayList) switcherProductContentFromXml.LLILLL).clear();
        switcherProductContentFromXml.LLILLJJLI = ecUgProduct;
        int iIntValue = ((Number) C0AAB.LIZ.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    switcherProductContentFromXml.LLILZIL = false;
                    ((ArrayList) switcherProductContentFromXml.LLILLL).add(0);
                } else {
                    switcherProductContentFromXml.LLILZIL = z;
                    ((ArrayList) switcherProductContentFromXml.LLILLL).add(0);
                    if (switcherProductContentFromXml.LLILZIL) {
                        if (C18Q8.LIZ(switcherProductContentFromXml.LLILLJJLI)) {
                            C21278918Pb.LIZ.getClass();
                            C21278918Pb.LIZJ = "title_price_volume_rate";
                            ((ArrayList) switcherProductContentFromXml.LLILLL).add(1);
                        } else {
                            switcherProductContentFromXml.LLILZIL = false;
                        }
                    }
                }
            } else {
                switcherProductContentFromXml.LLILZIL = false;
                ((ArrayList) switcherProductContentFromXml.LLILLL).add(2);
            }
        } else {
            switcherProductContentFromXml.LLILZIL = false;
            ((ArrayList) switcherProductContentFromXml.LLILLL).add(1);
        }
        switcherProductContentFromXml.LIZ(switcherProductContentFromXml.getCurrentView());
        TuxIconView ivArrowFromXml = getIvArrowFromXml();
        if (!this.LLILZIL && !this.LLILZLL) {
            i2 = 8;
        }
        C786410Ut5.LLLLLLZZ(ivArrowFromXml, i2);
        C786410Ut5.I7(new AjS7S0201000_32(c18qb, i, ecUgProduct, 2), this);
        if (c18qb != null) {
            c18qb.LIZ(i, ecUgProduct, C18PU.SMALL_VSA_CARD_PRODUCT);
        }
    }
}
