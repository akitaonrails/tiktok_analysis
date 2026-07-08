package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS591S0100000_12;
import njp.a;
import tikcast.api.anchor.AnchorLocationSettingsReadResponse;

/* JADX INFO: renamed from: X.0Tfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingSheet$fetchLocationData$1$1", f = "LiveLocationScopeSettingSheet.kt", l = {}, m = "invokeSuspend")
public final class C752780Tfw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AnchorLocationSettingsReadResponse.ResponseData LL;
    public final /* synthetic */ LiveLocationScopeSettingSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752780Tfw(AnchorLocationSettingsReadResponse.ResponseData responseData, LiveLocationScopeSettingSheet liveLocationScopeSettingSheet, InterfaceC1364105Vn<? super C752780Tfw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = responseData;
        this.LLILLJJLI = liveLocationScopeSettingSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752780Tfw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Drawable drawableLIZ;
        C1C7U.LIZ("LiveLocationScopeSettingSheet@e317.fetchLocationData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnchorLocationSettingsReadResponse.ResponseData responseData = this.LL;
        if (responseData == null) {
            LiveLocationScopeSettingSheet liveLocationScopeSettingSheet = this.LLILLJJLI;
            C500260Jjc.LJIILLIIL(liveLocationScopeSettingSheet.LLLII);
            C500260Jjc.LLFFF(liveLocationScopeSettingSheet.LLLIIII);
            C1749280vcc c1749280vcc = liveLocationScopeSettingSheet.LLLIIII;
            if (c1749280vcc != null) {
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                Context context = liveLocationScopeSettingSheet.getContext();
                if (context != null) {
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = R.drawable.my;
                    drawableLIZ = c0hti.LIZ(context);
                } else {
                    drawableLIZ = null;
                }
                c1722300uv6.LIZJ = 2;
                c1722300uv6.LIZ = drawableLIZ;
                c1722300uv6.LJIIIIZZ = C497740JfY.LJIJI(2131854890);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_large_error_robot;
                c419910GdJ.LJ = Integer.valueOf(R.attr.ezy);
                c1722300uv6.LIZJ = 0;
                c1722300uv6.LIZIZ = c419910GdJ;
                c1722300uv6.LJIIIZ = new AwS591S0100000_12(liveLocationScopeSettingSheet, 794);
                c1722300uv6.LJIIL = C878203bw.LIZ;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
                c1722300uv6.LIZLLL = iLIZIZ;
                c1722300uv6.LJ = iLIZIZ2;
                c1749280vcc.setStatus(c1722300uv6);
            }
            C1749280vcc c1749280vcc2 = liveLocationScopeSettingSheet.LLLIIII;
            if (c1749280vcc2 != null) {
                c1749280vcc2.setTopMargin(C418440Gaw.LIZIZ(30));
            }
            C1749280vcc c1749280vcc3 = liveLocationScopeSettingSheet.LLLIIII;
            if (c1749280vcc3 != null) {
                c1749280vcc3.setButtonTopMargin(C418440Gaw.LIZIZ(24));
            }
        } else {
            this.LLILLJJLI.ES(responseData.f90switch, responseData.location);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveLocationScopeSettingSheet@e317.fetchLocationData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
