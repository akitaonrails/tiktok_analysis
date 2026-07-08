package X;

import Y.AAListenerS36S0100100_32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionText;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.Color;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.RegularAuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS646S0100000_32;
import webcast.data.oec_msg.CarouselCfg;

/* JADX INFO: renamed from: X.186m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212306186m extends C212305186l {
    public final FrameLayout LLLIL;
    public AnonymousClass1873 LLLILZ;
    public final C212307186n LLLILZJ;
    public AnonymousClass1875 LLLILZLLLI;
    public Function2<? super Long, ? super Boolean, Unit> LLLIZZ;

    @Override // X.C212305186l, X.C212302186i
    public final int P0() {
        return R.layout.bwv;
    }

    @Override // X.C212302186i
    public final void S0() {
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final void l0() {
        if (this.LLLILZJ == null) {
            super.l0();
            return;
        }
        Function2<? super Long, ? super Boolean, Unit> function2 = this.LLLIZZ;
        if (function2 != null) {
            function2.invoke(0L, Boolean.FALSE);
        }
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final AnonymousClass1875 n0() {
        C212307186n c212307186n;
        AnonymousClass1875 anonymousClass1875 = this.LLLILZLLLI;
        return (anonymousClass1875 == null && ((c212307186n = this.LLLILZJ) == null || (anonymousClass1875 = c212307186n.LJIIJJI) == null)) ? this : anonymousClass1875;
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final void L0() {
        super.L0();
        C0H1U.LIZIZ(getCustomBidBtn());
        C0H1U.LIZIZ(getDoubleBidBtn());
        C0H1U.LIZIZ(getSingleBidBtn());
    }

    public final Function2<Long, Boolean, Unit> getCountDownUpdateCallback() {
        return this.LLLIZZ;
    }

    public final AnonymousClass1875 getExtendedAddTimeHelper() {
        return this.LLLILZLLLI;
    }

    public final void setCountDownUpdateCallback(Function2<? super Long, ? super Boolean, Unit> function2) {
        this.LLLIZZ = function2;
    }

    public final void setExtendedAddTimeHelper(AnonymousClass1875 anonymousClass1875) {
        this.LLLILZLLLI = anonymousClass1875;
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final void O0(long j, AAListenerS36S0100100_32 aAListenerS36S0100100_32) {
        if (this.LLLILZJ == null) {
            super.O0(j, aAListenerS36S0100100_32);
            return;
        }
        Function2<? super Long, ? super Boolean, Unit> function2 = this.LLLIZZ;
        if (function2 != null) {
            function2.invoke(Long.valueOf(j), Boolean.TRUE);
        }
        setRemainingTime((j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) % ((long) 60));
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final void e0(boolean z, boolean z2) {
        super.e0(z, z2);
        Function2<? super Long, ? super Boolean, Unit> function2 = this.LLLIZZ;
        if (function2 != null) {
            function2.invoke(0L, Boolean.FALSE);
        }
    }

    @Override // X.C212305186l, X.C212302186i, X.AbstractC212300186g
    public final void u0(UsPopupCardVO usPopupCardVO, boolean z) {
        AuctionLabel auctionLabel;
        String str;
        String str2;
        Color color;
        T t;
        T t2;
        RegularAuctionData regularAuctionData;
        super.u0(usPopupCardVO, z);
        AuctionData auctionData = usPopupCardVO.auctionData;
        String str3 = null;
        if (auctionData != null && (regularAuctionData = auctionData.regularAuctionData) != null) {
            auctionLabel = regularAuctionData.auctionLabel;
        } else {
            auctionLabel = null;
        }
        if (z) {
            C212307186n c212307186n = this.LLLILZJ;
            if (c212307186n != null && (t2 = c212307186n.LIZ) != 0) {
                C0H1U.LIZIZ(t2);
            }
            if (this.LLLILZ == null) {
                this.LLLILZ = new AnonymousClass1873(this.LLLIL, 0, 6);
            }
            C0H1U.LIZIZ(getWinnerInfoWithPriceContainer());
        } else {
            C212307186n c212307186n2 = this.LLLILZJ;
            if (c212307186n2 != null && (t = c212307186n2.LIZ) != 0) {
                C12ES.LJIILL(0, t);
            }
            C212307186n c212307186n3 = this.LLLILZJ;
            if (c212307186n3 != null) {
                if (auctionLabel != null && (color = auctionLabel.color) != null) {
                    str = color.value;
                } else {
                    str = null;
                }
                c212307186n3.LJIIL(str);
                if (auctionLabel != null) {
                    str2 = auctionLabel.defaultText;
                    ECImage eCImage = auctionLabel.iconLight;
                    if (eCImage != null) {
                        str3 = eCImage.url;
                    }
                } else {
                    str2 = null;
                }
                c212307186n3.LJIILIIL(new AnonymousClass1877(str2, str3));
            }
            if (getWinnerInfoWithPriceController() == null) {
                setWinnerInfoWithPriceController(new AnonymousClass1871(getWinnerInfoWithPriceContainer()));
            }
        }
        this.LLLIZZ = new AwS646S0100000_32(this, 4);
    }

    public C212306186m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.yb5);
        if (viewGroup != null) {
            C212307186n c212307186n = new C212307186n(viewGroup);
            this.LLLILZJ = c212307186n;
            if (this.LLLILZLLLI == null) {
                this.LLLILZLLLI = c212307186n.LJIIJJI;
            }
        }
        View viewFindViewById = findViewById(R.id.kgx);
        if (viewFindViewById != null) {
            C0H1U.LIZIZ(viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.b_b);
        if (viewFindViewById2 != null) {
            C0H1U.LIZIZ(viewFindViewById2);
        }
        this.LLLIL = (FrameLayout) findViewById(R.id.b_t);
    }

    @Override // X.C212305186l, X.C212302186i, X.AbstractC212300186g
    public final void M0(C212167181d c212167181d, Map<String, AuctionText> map, boolean z, int i, int i2, C212294186a c212294186a, boolean z2, CarouselCfg carouselCfg) {
        String str;
        String str2;
        Boolean bool;
        if (z) {
            Long l = null;
            if (c212167181d != null) {
                l = c212167181d.LIZ;
                str = c212167181d.LIZIZ;
                str2 = c212167181d.LIZJ;
                bool = c212167181d.LIZLLL;
            } else {
                str = null;
                str2 = null;
                bool = null;
            }
            AnonymousClass1872 anonymousClass1872 = new AnonymousClass1872(l, str, str2, bool, map, z, i, i2, false, c212294186a, z2, carouselCfg, 1280);
            AnonymousClass1873 anonymousClass1873 = this.LLLILZ;
            if (anonymousClass1873 != null) {
                anonymousClass1873.LJIIL(anonymousClass1872);
                return;
            }
            return;
        }
        super.M0(c212167181d, map, z, i, i2, c212294186a, z2, carouselCfg);
    }
}
