package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiPostHelper;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: renamed from: X.0HcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444700HcC extends C09AY implements Function1<C197039127h, Unit> {
    public final /* synthetic */ InterfaceC1181010gq3 LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PoiListApi.PoiDetailResponse LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C444700HcC(InterfaceC1181010gq3 interfaceC1181010gq3, Context context, String str, String str2, PoiListApi.PoiDetailResponse poiDetailResponse, String str3) {
        super(1);
        this.LL = interfaceC1181010gq3;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = poiDetailResponse;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C197039127h c197039127h) {
        View view;
        C197039127h c197039127h2 = c197039127h;
        c197039127h2.setText(2131824977);
        ViewGroup.LayoutParams layoutParams = c197039127h2.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.J6(c197039127h2, layoutParams);
        c197039127h2.setButtonVariant(1);
        c197039127h2.setButtonSize(3);
        C1546210qL5.LIZ.getClass();
        c197039127h2.setMinWidth(C814420VxA.LIZIZ(C1546210qL5.LIZ(122)));
        final InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        final Context context = this.LLILLJJLI;
        final String str = this.LLILLL;
        final String str2 = this.LLILZ;
        final PoiListApi.PoiDetailResponse poiDetailResponse = this.LLILZIL;
        final String str3 = this.LLILZLL;
        C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: X.0gw5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC1181010gq3 interfaceC1181010gq32 = interfaceC1181010gq3;
                PoiPostHelper.PoiInfo poiInfoLIZIZ = null;
                if (interfaceC1181010gq32 != null) {
                    interfaceC1181010gq32.Xr2("ttls_post_submit_click", C2097608Jq.LJIIIIZZ(new Pair("post_count", CardStruct.IStatusCode.DEFAULT), new Pair("enter_method", "post_card")), null);
                }
                PoiPostHelper poiPostHelper = PoiPostHelper.LIZ;
                Context context2 = context;
                String str4 = str;
                String str5 = str2;
                PoiListApi.PoiDetailResponse poiDetailResponse2 = poiDetailResponse;
                if (poiDetailResponse2 != null) {
                    String str6 = str3;
                    poiPostHelper.getClass();
                    poiInfoLIZIZ = PoiPostHelper.LIZIZ(str6, poiDetailResponse2);
                }
                poiPostHelper.getClass();
                PoiPostHelper.LIZ(context2, str4, str5, poiInfoLIZIZ);
            }
        });
        Object parent = c197039127h2.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            C2211631BhB.LJ(view, new AwS372S0200000_6(c197039127h2, this.LL, 93));
        }
        return Unit.LIZ;
    }
}
