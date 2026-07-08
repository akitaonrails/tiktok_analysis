package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.lynxcard.DetailLynxCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0SdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.lynxcard.DetailLynxCard$jsEventSubscriber$1$onReceiveJsEvent$1", f = "DetailLynxCard.kt", l = {}, m = "invokeSuspend")
public final class C725720SdO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C262100zr LL;
    public final /* synthetic */ DetailLynxCard LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725720SdO(C262100zr c262100zr, DetailLynxCard detailLynxCard, InterfaceC1364105Vn<? super C725720SdO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c262100zr;
        this.LLILLJJLI = detailLynxCard;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C725720SdO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJFF;
        C1C7U.LIZ("DetailLynxCard@96f1.jsEventSubscriber$1$onReceiveJsEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C262100zr c262100zr = this.LL;
        DetailLynxCard detailLynxCard = this.LLILLJJLI;
        try {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String str = "";
            if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "containerID", "")) != null) {
                str = strLJFF;
            }
            if (detailLynxCard.LLJJIII) {
                detailLynxCard.LLJJIJIIJIL.Kc(detailLynxCard.LLJJI, str);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DetailLynxCard@96f1.jsEventSubscriber$1$onReceiveJsEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
