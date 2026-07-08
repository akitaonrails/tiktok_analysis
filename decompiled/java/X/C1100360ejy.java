package X;

import android.net.Uri;
import com.bytedance.android.live.shorttouch.service.IShortTouchService;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortal4FEModelReceiver;
import com.bytedance.android.livesdk.impl.revenue.portal.model.EnvelopPortalInfoWithDisplay;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ejy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.portal.PortalLeaf$notifyPortal$4$1", f = "PortalLeaf.kt", l = {}, m = "invokeSuspend")
public final class C1100360ejy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ InterfaceC2365009Om LLILLJJLI;
    public final /* synthetic */ C1100380ek0 LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100360ejy(C259800zU<String> c259800zU, InterfaceC2365009Om interfaceC2365009Om, C1100380ek0 c1100380ek0, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C1100360ejy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = interfaceC2365009Om;
        this.LLILLL = c1100380ek0;
        this.LLILZ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1100360ejy(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("PortalLeaf@b89.notifyPortal$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(this.LL.element).buildUpon().appendQueryParameter("initial_data", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, this.LLILLJJLI));
        if (this.LLILLL.LJJJJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        InterfaceC1085330eLj interfaceC1085330eLjVd = ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Vd(this.LLILLL.LL, builderAppendQueryParameter.appendQueryParameter("is_anchor", str).build(), null, this.LLILZ.element, null, true);
        Unit unit = null;
        if (interfaceC1085330eLjVd != null) {
            InterfaceC2365009Om interfaceC2365009Om = this.LLILLJJLI;
            C1100380ek0 c1100380ek0 = this.LLILLL;
            EnvelopPortal4FEModelReceiver envelopPortal4FEModelReceiver = (EnvelopPortal4FEModelReceiver) interfaceC2365009Om;
            if (envelopPortal4FEModelReceiver.portalInfos.size() > 0 && !Intrinsics.LJFF(((EnvelopPortalInfoWithDisplay) ListProtector.get(envelopPortal4FEModelReceiver.portalInfos, 0)).anchorId, String.valueOf(UserService.getInstance().user().getCurrentUserId())) && (str2 = c1100380ek0.LLJJIII) != null) {
                ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Ud(EnumC1101860emO.ID, str2);
            }
            c1100380ek0.LLJJIII = interfaceC1085330eLjVd.dT1();
            ((InterfaceC1087010eOR) C1161920gLG.LIZJ(IShortTouchService.class)).Yd(interfaceC1085330eLjVd, null);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("PortalLeaf@b89.notifyPortal$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
