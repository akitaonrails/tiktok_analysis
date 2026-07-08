package X;

import Y.ACListenerS127S0200000_25;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631020sXs {
    public final ShortVideoContext LIZ;
    public final LinearLayout LIZIZ;
    public final InterfaceC1631050sXv LIZJ;
    public C1322110kVd LIZLLL;
    public TextView LJ;

    public final boolean LIZ(Effect effect) {
        FaceStickerCommerceBean faceStickerCommerceBean;
        String str;
        FaceStickerBean faceStickerBeanLIZ = C1441210nbj.LIZ(effect);
        if (effect != null && effect.isBusiness() && (faceStickerCommerceBean = faceStickerBeanLIZ.getFaceStickerCommerceBean()) != null && 1 == faceStickerCommerceBean.commerceStickerType) {
            this.LIZJ.LIZ(String.valueOf(faceStickerBeanLIZ.getStickerId()));
            C786410Ut5.LJZL(0, this.LIZIZ);
            C1324750kZt.LJIIIZ(this.LIZLLL, (String) ListProtector.get(faceStickerBeanLIZ.getIconUrl().getUrlList(), 0), -1, -1);
            TextView textView = this.LJ;
            if (textView != null) {
                FaceStickerCommerceBean faceStickerCommerceBean2 = faceStickerBeanLIZ.getFaceStickerCommerceBean();
                if (faceStickerCommerceBean2 != null) {
                    str = faceStickerCommerceBean2.commerceStickerBuyText;
                } else {
                    str = null;
                }
                textView.setText(str);
            }
            C786410Ut5.R7(this.LIZIZ, new ACListenerS127S0200000_25(this, faceStickerBeanLIZ, 7));
            return true;
        }
        C786410Ut5.LJZL(8, this.LIZIZ);
        return false;
    }

    public C1631020sXs(ShortVideoContext shortVideoContext, LinearLayout linearLayout, InterfaceC1631050sXv interfaceC1631050sXv) {
        this.LIZ = shortVideoContext;
        this.LIZIZ = linearLayout;
        this.LIZJ = interfaceC1631050sXv;
        this.LIZLLL = (C1322110kVd) linearLayout.findViewById(R.id.ejg);
        this.LJ = (TextView) linearLayout.findViewById(R.id.eji);
    }
}
