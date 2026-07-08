package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.CampaignRechargeMetaData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.FirstRechargeModel;
import webcast.data.TouchPointBackground;
import webcast.data.TouchPointTitle;

/* JADX INFO: renamed from: X.0fIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.touchpoint.TouchPointCommonUtilsKt$preloadImages$1", f = "TouchPointCommonUtils.kt", l = {}, m = "invokeSuspend")
public final class C1121630fIH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CampaignRechargeMetaData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121630fIH(CampaignRechargeMetaData campaignRechargeMetaData, InterfaceC1364105Vn<? super C1121630fIH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = campaignRechargeMetaData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1121630fIH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<TextPiece> list;
        ImageModel imageModel;
        List<TextPiece> list2;
        ImageModel imageModel2;
        Text text;
        List<TextPiece> list3;
        ImageModel imageModel3;
        Text text2;
        List<TextPiece> list4;
        ImageModel imageModel4;
        ImageModel imageModel5;
        C1C7U.LIZ("TouchPointCommonUtilsKt@d5f2.preloadImages$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TouchPointBackground touchPointBackground = this.LL.panelBg;
        if (touchPointBackground != null && (imageModel5 = touchPointBackground.image) != null) {
            C1121540fI8.LIZ(imageModel5);
        }
        List<FirstRechargeModel.RechargeActivityBanner> list5 = this.LL.rechargeBanners;
        if (list5 != null) {
            Iterator<FirstRechargeModel.RechargeActivityBanner> it2 = list5.iterator();
            while (it2.hasNext()) {
                ImageModel imageModel6 = it2.next().icon;
                if (imageModel6 != null) {
                    C1121540fI8.LIZ(imageModel6);
                }
            }
        }
        List<FirstRechargeModel.RechargeActivityBanner> list6 = this.LL.exchangeBanners;
        if (list6 != null) {
            Iterator<FirstRechargeModel.RechargeActivityBanner> it3 = list6.iterator();
            while (it3.hasNext()) {
                ImageModel imageModel7 = it3.next().icon;
                if (imageModel7 != null) {
                    C1121540fI8.LIZ(imageModel7);
                }
            }
        }
        TouchPointTitle touchPointTitle = this.LL.title;
        if (touchPointTitle != null && (text2 = touchPointTitle.text) != null && (list4 = text2.pieces) != null) {
            Iterator<TextPiece> it4 = list4.iterator();
            while (it4.hasNext()) {
                TextPieceImage textPieceImage = it4.next().imageValue;
                if (textPieceImage != null && (imageModel4 = textPieceImage.imageModel) != null) {
                    C1121540fI8.LIZ(imageModel4);
                }
            }
        }
        TouchPointTitle touchPointTitle2 = this.LL.subTitle;
        if (touchPointTitle2 != null && (text = touchPointTitle2.text) != null && (list3 = text.pieces) != null) {
            Iterator<TextPiece> it5 = list3.iterator();
            while (it5.hasNext()) {
                TextPieceImage textPieceImage2 = it5.next().imageValue;
                if (textPieceImage2 != null && (imageModel3 = textPieceImage2.imageModel) != null) {
                    C1121540fI8.LIZ(imageModel3);
                }
            }
        }
        Text text3 = this.LL.rechargeButton;
        if (text3 != null && (list2 = text3.pieces) != null) {
            Iterator<TextPiece> it6 = list2.iterator();
            while (it6.hasNext()) {
                TextPieceImage textPieceImage3 = it6.next().imageValue;
                if (textPieceImage3 != null && (imageModel2 = textPieceImage3.imageModel) != null) {
                    C1121540fI8.LIZ(imageModel2);
                }
            }
        }
        Text text4 = this.LL.exchangeButton;
        if (text4 != null && (list = text4.pieces) != null) {
            Iterator<TextPiece> it7 = list.iterator();
            while (it7.hasNext()) {
                TextPieceImage textPieceImage4 = it7.next().imageValue;
                if (textPieceImage4 != null && (imageModel = textPieceImage4.imageModel) != null) {
                    C1121540fI8.LIZ(imageModel);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TouchPointCommonUtilsKt@d5f2.preloadImages$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
