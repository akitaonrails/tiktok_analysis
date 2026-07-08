package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.RechargeBannerMetaData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.data.TouchPointBackground;

/* JADX INFO: renamed from: X.0fI9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.touchpoint.TouchPointCommonUtilsKt$preloadImages$2", f = "TouchPointCommonUtils.kt", l = {}, m = "invokeSuspend")
public final class C1121550fI9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RechargeBannerMetaData LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121550fI9(RechargeBannerMetaData rechargeBannerMetaData, InterfaceC1364105Vn<? super C1121550fI9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = rechargeBannerMetaData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1121550fI9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<TextPiece> list;
        ImageModel imageModel;
        List<TextPiece> list2;
        ImageModel imageModel2;
        ImageModel imageModel3;
        C1C7U.LIZ("TouchPointCommonUtilsKt@d5f2.preloadImages$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TouchPointBackground touchPointBackground = this.LL.panelBackground;
        if (touchPointBackground != null && (imageModel3 = touchPointBackground.image) != null) {
            C1121540fI8.LIZ(imageModel3);
        }
        Text text = this.LL.title;
        if (text != null && (list2 = text.pieces) != null) {
            Iterator<TextPiece> it2 = list2.iterator();
            while (it2.hasNext()) {
                TextPieceImage textPieceImage = it2.next().imageValue;
                if (textPieceImage != null && (imageModel2 = textPieceImage.imageModel) != null) {
                    C1121540fI8.LIZ(imageModel2);
                }
            }
        }
        Text text2 = this.LL.subTitle;
        if (text2 != null && (list = text2.pieces) != null) {
            Iterator<TextPiece> it3 = list.iterator();
            while (it3.hasNext()) {
                TextPieceImage textPieceImage2 = it3.next().imageValue;
                if (textPieceImage2 != null && (imageModel = textPieceImage2.imageModel) != null) {
                    C1121540fI8.LIZ(imageModel);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TouchPointCommonUtilsKt@d5f2.preloadImages$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
