package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;
import mf.a;

/* JADX INFO: renamed from: X.0fNG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124720fNG extends ConstraintLayout implements C0T8B {
    public boolean LL;
    public final ImageView LLILLJJLI;
    public final C16FV LLILLL;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public final void i0(String str) {
        Long lValueOf;
        ICoinIncentiveService iCoinIncentiveServiceLIZ;
        GiftsInfo giftsInfo;
        GiftsInfo.UGPointsGiftInfo uGPointsGiftInfo;
        GiftListResult giftListResult = GiftService.LLILLJJLI.getGiftListResult();
        Long lValueOf2 = null;
        if (giftListResult != null && (giftsInfo = giftListResult.giftsInfo) != null && (uGPointsGiftInfo = giftsInfo.pointsGiftInfo) != null) {
            lValueOf = Long.valueOf(uGPointsGiftInfo.validStartAt);
            lValueOf2 = Long.valueOf(uGPointsGiftInfo.validEndAt);
        } else {
            lValueOf = null;
        }
        if (str.length() == 0) {
            if (lValueOf != null && lValueOf2 != null) {
                str = u.LJJIFFI(u.LJJIFFI(getContext().getString(2131821747), "{date1}", e0(lValueOf.longValue(), getContext()), false), "{date2}", e0(lValueOf2.longValue(), getContext()), false);
            } else {
                str = "";
            }
        }
        if (str.length() != 0 && (iCoinIncentiveServiceLIZ = C1124730fNH.LIZ()) != null) {
            iCoinIncentiveServiceLIZ.qY1();
        }
    }

    public final void setBannerClickListener(Function0<Unit> function0) {
        View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(function0, 52);
        if (C1848410yCV.LIZ) {
            aCListenerS152S0100000_17 = new f(aCListenerS152S0100000_17);
        }
        a aVar = new a(aCListenerS152S0100000_17);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        C786410Ut5.LLJJJJJIL(this.LLILLL, 0);
    }

    public C1124720fNG(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static String e0(long j, Context context) {
        boolean z;
        if (String.valueOf(j).length() == 13) {
            z = true;
        } else {
            z = false;
        }
        BDDateFormat bDDateFormat = new BDDateFormat("ll-Y");
        if (!z) {
            j *= 1000;
        }
        return bDDateFormat.LIZIZ(j, C19263510Xx.LIZ(context));
    }

    public final void h0(GiftPanelBanner giftPanelBanner, long j) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String string;
        String str;
        Drawable drawableLIZ;
        List<String> list;
        int i2;
        int i3;
        if (!this.LL) {
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().xM0(EnumC1805800x5m.LIVE_DETAIL, EnumC1805430x5B.UG_POINTS_GIFT, EnumC1805420x5A.UG_POINTS_GIFT, false);
            this.LL = true;
        }
        C1094360eaI c1094360eaIHP = ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).HP();
        if (c1094360eaIHP != null) {
            i = c1094360eaIHP.LIZ;
        } else {
            i = 0;
        }
        C1123800fLm.LIZLLL(j, Boolean.FALSE, Integer.valueOf(i), "points_gift");
        ImageView imageView = this.LLILLJJLI;
        C1117830fC9.LIZLLL(imageView, giftPanelBanner.leftIcon, imageView.getLayoutParams().width, imageView.getLayoutParams().height);
        ImageView imageView2 = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        String str2 = null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            ImageModel imageModel = giftPanelBanner.leftIcon;
            if (imageModel != null) {
                i2 = imageModel.height;
            } else {
                i2 = 48;
            }
            marginLayoutParams.height = C439101nJ.LIZ(i2);
            ImageModel imageModel2 = giftPanelBanner.leftIcon;
            if (imageModel2 != null) {
                i3 = imageModel2.width;
            } else {
                i3 = 48;
            }
            marginLayoutParams.width = C439101nJ.LIZ(i3);
            int iLIZ = marginLayoutParams.height;
            if (iLIZ == 0) {
                iLIZ = C439101nJ.LIZ(48);
            }
            marginLayoutParams.height = iLIZ;
            int iLIZ2 = marginLayoutParams.width;
            if (iLIZ2 == 0) {
                iLIZ2 = C439101nJ.LIZ(48);
            }
            marginLayoutParams.width = iLIZ2;
            marginLayoutParams.setMarginStart(0);
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.c6(imageView2, marginLayoutParams);
        if (!CollectionUtil.isListEmpty(giftPanelBanner.bgColors)) {
            List<String> list2 = giftPanelBanner.bgColors;
            if (list2 != null) {
                str = (String) ListProtector.get(list2, 0);
            } else {
                str = null;
            }
            List<String> list3 = giftPanelBanner.bgColors;
            if (list3 != null && list3.size() > 1 && (list = giftPanelBanner.bgColors) != null) {
                str2 = (String) ListProtector.get(list, 1);
            }
            if (str != null && C434800H3e.LIZIZ(str) && (drawableLIZ = C434800H3e.LIZ(str, str2)) != null) {
                setBackground(drawableLIZ);
            }
        } else {
            setBackgroundResource(R.drawable.dtf);
        }
        if (giftPanelBanner.displayText != null) {
            Text text = giftPanelBanner.displayText;
            string = C1133830fbx.LJIILIIL(text, text.defaultPattern).toString();
        } else {
            string = "";
        }
        i0(string);
    }

    public C1124720fNG(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.i2u, this);
        this.LLILLJJLI = (ImageView) findViewById(R.id.mk3);
        findViewById(R.id.iwr);
        findViewById(R.id.ug_points);
        findViewById(R.id.q1v);
        this.LLILLL = (C16FV) findViewById(R.id.wit);
    }
}
