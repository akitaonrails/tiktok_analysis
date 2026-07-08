package X;

import com.bytedance.im.core.proto.UrlStruct;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesCell;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesCell$onBindItemView$3$1", f = "PoiDetailGuidesCell.kt", l = {}, m = "invokeSuspend")
public final class C912410Zqp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UrlStruct LL;
    public final /* synthetic */ PoiDetailGuidesCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912410Zqp(UrlStruct urlStruct, PoiDetailGuidesCell poiDetailGuidesCell, InterfaceC1364105Vn<? super C912410Zqp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = urlStruct;
        this.LLILLJJLI = poiDetailGuidesCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912410Zqp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLIZ;
        int iLIZ2;
        long jIntValue;
        C1C7U.LIZ("PoiDetailGuidesCell@cb0c.onBindItemView$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        UrlStruct urlStruct = this.LL;
        UrlModel urlModel = new UrlModel();
        String str = urlStruct.uri;
        if (str == null) {
            str = "";
        }
        urlModel.setUri(str);
        List<String> list = urlStruct.url_list;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        urlModel.setUrlList(list);
        Integer num = urlStruct.width;
        if (num != null) {
            iLIZ = num.intValue();
        } else {
            iLIZ = (int) C339190DRl.LIZ(60);
        }
        urlModel.setWidth(iLIZ);
        Integer num2 = urlStruct.height;
        if (num2 != null) {
            iLIZ2 = num2.intValue();
        } else {
            iLIZ2 = (int) C339190DRl.LIZ(70);
        }
        urlModel.setHeight(iLIZ2);
        Integer num3 = urlStruct.data_size;
        if (num3 != null) {
            jIntValue = num3.intValue();
        } else {
            jIntValue = 0;
        }
        urlModel.setSize(jIntValue);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LIZLLL("poi_detail_guide_cell");
        C1189400h3a.LIZIZ(c1331670kl3LJIIIIZZ, "poi_detail", "poi_detail_guide", C2097608Jq.LJIIJ(new Pair("poi_id", this.LLILLJJLI.L5().LL)));
        c1331670kl3LJIIIIZZ.LJJII(new C2499509qr(this.LLILLJJLI, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailGuidesCell@cb0c.onBindItemView$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
