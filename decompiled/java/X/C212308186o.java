package X;

import Y.AAListenerS36S0100100_32;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionLabel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.Color;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.RegularAuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS646S0100000_32;

/* JADX INFO: renamed from: X.186o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212308186o extends C212302186i {
    public final C212307186n LLLF;
    public Function2<? super Long, ? super Boolean, Unit> LLLFF;

    @Override // X.C212302186i
    public final int P0() {
        return R.layout.bwu;
    }

    @Override // X.C212302186i
    public final void S0() {
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final void l0() {
        if (this.LLLF == null) {
            super.l0();
            return;
        }
        Function2<? super Long, ? super Boolean, Unit> function2 = this.LLLFF;
        if (function2 != null) {
            function2.invoke(0L, Boolean.FALSE);
        }
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final AnonymousClass1875 n0() {
        C1217030hm9 c1217030hm9;
        C212307186n c212307186n = this.LLLF;
        return (c212307186n == null || (c1217030hm9 = c212307186n.LJIIJJI) == null) ? this : c1217030hm9;
    }

    public final Function2<Long, Boolean, Unit> getCountDownUpdateCallback() {
        return this.LLLFF;
    }

    public final void setCountDownUpdateCallback(Function2<? super Long, ? super Boolean, Unit> function2) {
        this.LLLFF = function2;
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final void O0(long j, AAListenerS36S0100100_32 aAListenerS36S0100100_32) {
        if (this.LLLF == null) {
            super.O0(j, aAListenerS36S0100100_32);
            return;
        }
        Function2<? super Long, ? super Boolean, Unit> function2 = this.LLLFF;
        if (function2 != null) {
            function2.invoke(Long.valueOf(j), Boolean.TRUE);
        }
        setRemainingTime((j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) % ((long) 60));
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final void e0(boolean z, boolean z2) {
        super.e0(z, z2);
        Function2<? super Long, ? super Boolean, Unit> function2 = this.LLLFF;
        if (function2 != null) {
            function2.invoke(0L, Boolean.FALSE);
        }
    }

    @Override // X.C212302186i, X.AbstractC212300186g
    public final void u0(UsPopupCardVO usPopupCardVO, boolean z) {
        AuctionLabel auctionLabel;
        String str;
        String str2;
        Color color;
        RegularAuctionData regularAuctionData;
        super.u0(usPopupCardVO, z);
        AuctionData auctionData = usPopupCardVO.auctionData;
        String str3 = null;
        if (auctionData != null && (regularAuctionData = auctionData.regularAuctionData) != null) {
            auctionLabel = regularAuctionData.auctionLabel;
        } else {
            auctionLabel = null;
        }
        C212307186n c212307186n = this.LLLF;
        if (c212307186n != null) {
            if (auctionLabel != null && (color = auctionLabel.color) != null) {
                str = color.value;
            } else {
                str = null;
            }
            c212307186n.LJIIL(str);
            if (auctionLabel != null) {
                str2 = auctionLabel.defaultText;
                ECImage eCImage = auctionLabel.iconLight;
                if (eCImage != null) {
                    str3 = eCImage.url;
                }
            } else {
                str2 = null;
            }
            c212307186n.LJIILIIL(new AnonymousClass1877(str2, str3));
        }
        this.LLLFF = new AwS646S0100000_32(this, 5);
    }

    public C212308186o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.yb5);
        if (viewGroup != null) {
            this.LLLF = new C212307186n(viewGroup);
        }
        View viewFindViewById = findViewById(R.id.kgx);
        if (viewFindViewById != null) {
            C0H1U.LIZIZ(viewFindViewById);
        }
        View viewFindViewById2 = findViewById(R.id.gm8);
        if (viewFindViewById2 != null) {
            C0H1U.LIZIZ(viewFindViewById2);
        }
    }
}
