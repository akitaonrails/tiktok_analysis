package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelBannerMetaData;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelItemMetaData;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.GiftPanelMetaData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.TPText;
import webcast.data.TPTextPiece;
import webcast.data.TPTextPieceImage;
import webcast.data.TouchPointBackground;

/* JADX INFO: renamed from: X.0fQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.touchpoint.TouchPointCommonUtilsKt$preloadImages$3", f = "TouchPointCommonUtils.kt", l = {}, m = "invokeSuspend")
public final class C1126910fQn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GiftPanelMetaData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1126910fQn(GiftPanelMetaData giftPanelMetaData, InterfaceC1364105Vn<? super C1126910fQn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = giftPanelMetaData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1126910fQn(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TPText tPText;
        List<TPTextPiece> list;
        ImageModel imageModel;
        TPText tPText2;
        List<TPTextPiece> list2;
        ImageModel imageModel2;
        TPText tPText3;
        List<TPTextPiece> list3;
        ImageModel imageModel3;
        ImageModel imageModel4;
        TPText tPText4;
        List<TPTextPiece> list4;
        ImageModel imageModel5;
        ImageModel imageModel6;
        TouchPointBackground touchPointBackground;
        ImageModel imageModel7;
        C1C7U.LIZ("TouchPointCommonUtilsKt@d5f2.preloadImages$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        GiftPanelBannerMetaData giftPanelBannerMetaData = this.LL.banner;
        if (giftPanelBannerMetaData != null && (touchPointBackground = giftPanelBannerMetaData.panelBackground) != null && (imageModel7 = touchPointBackground.image) != null) {
            C1121540fI8.LIZ(imageModel7);
        }
        GiftPanelBannerMetaData giftPanelBannerMetaData2 = this.LL.banner;
        if (giftPanelBannerMetaData2 != null && (imageModel6 = giftPanelBannerMetaData2.icon) != null) {
            C1121540fI8.LIZ(imageModel6);
        }
        GiftPanelBannerMetaData giftPanelBannerMetaData3 = this.LL.banner;
        if (giftPanelBannerMetaData3 != null && (tPText4 = giftPanelBannerMetaData3.content) != null && (list4 = tPText4.pieces) != null) {
            Iterator<TPTextPiece> it2 = list4.iterator();
            while (it2.hasNext()) {
                TPTextPieceImage tPTextPieceImage = it2.next().imageValue;
                if (tPTextPieceImage != null && (imageModel5 = tPTextPieceImage.image) != null) {
                    C1121540fI8.LIZ(imageModel5);
                }
            }
        }
        GiftPanelItemMetaData giftPanelItemMetaData = this.LL.item;
        if (giftPanelItemMetaData != null && (imageModel4 = giftPanelItemMetaData.icon) != null) {
            C1121540fI8.LIZ(imageModel4);
        }
        GiftPanelItemMetaData giftPanelItemMetaData2 = this.LL.item;
        if (giftPanelItemMetaData2 != null && (tPText3 = giftPanelItemMetaData2.title) != null && (list3 = tPText3.pieces) != null) {
            Iterator<TPTextPiece> it3 = list3.iterator();
            while (it3.hasNext()) {
                TPTextPieceImage tPTextPieceImage2 = it3.next().imageValue;
                if (tPTextPieceImage2 != null && (imageModel3 = tPTextPieceImage2.image) != null) {
                    C1121540fI8.LIZ(imageModel3);
                }
            }
        }
        GiftPanelItemMetaData giftPanelItemMetaData3 = this.LL.item;
        if (giftPanelItemMetaData3 != null && (tPText2 = giftPanelItemMetaData3.subTitle) != null && (list2 = tPText2.pieces) != null) {
            Iterator<TPTextPiece> it4 = list2.iterator();
            while (it4.hasNext()) {
                TPTextPieceImage tPTextPieceImage3 = it4.next().imageValue;
                if (tPTextPieceImage3 != null && (imageModel2 = tPTextPieceImage3.image) != null) {
                    C1121540fI8.LIZ(imageModel2);
                }
            }
        }
        GiftPanelItemMetaData giftPanelItemMetaData4 = this.LL.item;
        if (giftPanelItemMetaData4 != null && (tPText = giftPanelItemMetaData4.btContent) != null && (list = tPText.pieces) != null) {
            Iterator<TPTextPiece> it5 = list.iterator();
            while (it5.hasNext()) {
                TPTextPieceImage tPTextPieceImage4 = it5.next().imageValue;
                if (tPTextPieceImage4 != null && (imageModel = tPTextPieceImage4.image) != null) {
                    C1121540fI8.LIZ(imageModel);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TouchPointCommonUtilsKt@d5f2.preloadImages$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
