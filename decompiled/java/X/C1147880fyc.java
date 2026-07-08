package X;

import android.net.Uri;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.quickproduct.QuickProductSlot$createProduct$1", f = "QuickProductSlot.kt", l = {}, m = "invokeSuspend")
public final class C1147880fyc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C14GT LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147880fyc(C14GT c14gt, String str, InterfaceC1364105Vn<? super C1147880fyc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c14gt;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1147880fyc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickProductSlot@467f.createProduct$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Uri.Builder builderAppendQueryParameter = UriProtector.parse(this.LL.LLJILJIL).buildUpon().appendQueryParameter("screenshot_path", new C0VSJ(this.LLILLJJLI).toURI().toString());
            Room room = this.LL.LLJIJIL;
            if (room != null) {
                builderAppendQueryParameter.appendQueryParameter("room_id", String.valueOf(room.getId()));
            }
            SmartRouter.buildRoute(this.LL.LL, builderAppendQueryParameter.build().toString()).open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickProductSlot@467f.createProduct$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
