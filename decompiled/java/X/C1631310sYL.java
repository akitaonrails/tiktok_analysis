package X;

import Y.ACallableS29S1000000_25;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lth.o;

/* JADX INFO: renamed from: X.0sYL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631310sYL {
    public final LinearLayout LIZ;
    public final InterfaceC1631050sXv LIZIZ;
    public final List<InterfaceC1624270sMz> LIZJ;
    public final Context LIZLLL;
    public final C1322110kVd LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final Map<String, CommerceSticker> LJII = new HashMap();
    public Effect LJIIIIZZ;

    public final boolean LIZIZ(int i, final Effect effect) {
        if (o.LJIIZILJ.LIZ()) {
            C786410Ut5.LJZL(8, this.LIZ);
            return false;
        }
        if (C1624200sMs.LJIIIIZZ(effect)) {
            return false;
        }
        if (effect != null && i != 0 && effect.isBusiness()) {
            if (((HashMap) this.LJII).containsKey(effect.getEffectId())) {
                return LIZ((CommerceSticker) ((HashMap) this.LJII).get(effect.getEffectId()), C1624200sMs.LJI(effect), false);
            }
            this.LJIIIIZZ = effect;
            final String effectId = effect.getEffectId();
            C15O7.LIZJ(new ACallableS29S1000000_25(effectId, 0)).LJ(new InterfaceC2385309Wh() { // from class: X.0sYM
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    CommerceSticker commerceSticker;
                    NewFaceStickerBean newFaceStickerBean;
                    C1C7U.LIZ("CommerceStickerBrandInfo@efb3.updateCommerceLayout$2");
                    Effect effect2 = this.LIZ.LJIIIIZZ;
                    if (effect2 == null || TextUtils.equals(effect2.getEffectId(), effectId)) {
                        if (!c15o7.LJIILIIL() && !c15o7.LJIILL()) {
                            try {
                                List<? extends NewFaceStickerBean> list = ((NewFaceStickerListBean) c15o7.LJIIL()).mStickers;
                                if (list != null && (newFaceStickerBean = list.get(0)) != null) {
                                    commerceSticker = newFaceStickerBean.commerceSticker;
                                } else {
                                    commerceSticker = null;
                                }
                                ((HashMap) this.LIZ.LJII).put(effectId, commerceSticker);
                                this.LIZ.LIZ(commerceSticker, C1624200sMs.LJI(effect), true);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1AF0.LJ(e);
                            }
                        } else {
                            C1631310sYL c1631310sYL = this.LIZ;
                            c1631310sYL.LIZ((CommerceSticker) ((HashMap) c1631310sYL.LJII).get(effectId), C1624200sMs.LJI(effect), true);
                        }
                    }
                    C1C7U.LIZIZ("CommerceStickerBrandInfo@efb3.updateCommerceLayout$2");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
            return false;
        }
        C786410Ut5.LJZL(8, this.LIZ);
        return false;
    }

    public final boolean LIZ(CommerceSticker commerceSticker, boolean z, boolean z2) {
        if (commerceSticker == null) {
            C786410Ut5.LJZL(8, this.LIZ);
            return false;
        }
        if (z2) {
            Iterator<InterfaceC1624270sMz> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
        this.LIZIZ.LIZJ(commerceSticker.getId());
        C786410Ut5.LJZL(0, this.LIZ);
        UrlModel screenIcon = commerceSticker.getScreenIcon();
        if (screenIcon != null) {
            C786410Ut5.LLZZLLIL(this.LJ, 0);
            final C1322110kVd c1322110kVd = this.LJ;
            C1324750kZt.LJII(c1322110kVd, screenIcon, Bitmap.Config.RGB_565, false, new C1320670kTJ(null, new C1320700kTM<InterfaceC1330440kj4>(c1322110kVd) { // from class: X.0Hg0
                public final View LIZIZ;

                {
                    this.LIZIZ = c1322110kVd;
                }

                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str, Object obj, Animatable animatable) {
                    InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
                    if (interfaceC1330440kj4 != null) {
                        int width = interfaceC1330440kj4.getWidth();
                        int height = interfaceC1330440kj4.getHeight();
                        if (height > 0) {
                            ViewGroup.LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                            layoutParams.width = (layoutParams.height * width) / height;
                            C786410Ut5.W5(this.LIZIZ, layoutParams);
                        }
                    }
                }
            }));
        } else {
            C786410Ut5.LLZZLLIL(this.LJ, 8);
        }
        this.LJFF.setText(commerceSticker.getScreenDesc());
        long expireTime = commerceSticker.getExpireTime();
        String str = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date(((long) LSPassThroughRecordSizeConfig.DEFAULT) * expireTime));
        if (expireTime != 0 && !TextUtils.isEmpty(str) && z) {
            C786410Ut5.LLIL(this.LJI, 0);
            this.LJI.setText(this.LIZLLL.getString(2131839054, str));
            return true;
        }
        C786410Ut5.LLIL(this.LJI, 8);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1631310sYL(LinearLayout linearLayout, InterfaceC1631050sXv interfaceC1631050sXv, List<? extends InterfaceC1624270sMz> list, Context context) {
        this.LIZ = linearLayout;
        this.LIZIZ = interfaceC1631050sXv;
        this.LIZJ = list;
        this.LIZLLL = context;
        this.LJ = (C1322110kVd) linearLayout.findViewById(R.id.ejc);
        this.LJFF = (TextView) linearLayout.findViewById(R.id.ejb);
        this.LJI = (TextView) linearLayout.findViewById(R.id.eje);
    }
}
