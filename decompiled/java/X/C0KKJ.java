package X;

import com.bytedance.android.live.network.response.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.sub.TemplateListData;

/* JADX INFO: renamed from: X.0KKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$1$templateInfoJob$1", f = "ResubscribeStrategy.kt", l = {120}, m = "invokeSuspend")
public final class C0KKJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super TemplateListData>, Object> {
    public int LL;
    public final /* synthetic */ C0KJX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KKJ(C0KJX c0kjx, InterfaceC1364105Vn<? super C0KKJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kjx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KKJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ResubscribeStrategy@84ad.resubscribe$1$templateInfoJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C0KKE c0kke = new C0KKE(this.LLILLJJLI);
            this.LL = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final long jCurrentTimeMillis = System.currentTimeMillis();
            c0kke.LJ.LIZJ().LJJLL(new C09JN() { // from class: X.0KKI
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("SubscribeTemplateFetchRepo@8722.fetchTemplateBasic$2$1");
                    BaseResponse baseResponse = (BaseResponse) obj2;
                    InterfaceC1364105Vn<TemplateListData> interfaceC1364105Vn = c23260099m;
                    T t = baseResponse.data;
                    C189200o6.m2constructorimpl(t);
                    interfaceC1364105Vn.resumeWith(t);
                    C516120KLy c516120KLyLIZIZ = C0KKE.LIZIZ(c0kke, System.currentTimeMillis() - jCurrentTimeMillis, ((TemplateListData) baseResponse.data).templateList, null, 4);
                    c0kke.LJ.getClass();
                    AbstractC516030KLp.LIZIZ(c516120KLyLIZIZ);
                    C1C7U.LIZIZ("SubscribeTemplateFetchRepo@8722.fetchTemplateBasic$2$1");
                }
            }, new C09JN() { // from class: X.0KKL
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("SubscribeTemplateFetchRepo@8722.fetchTemplateBasic$2$2");
                    Throwable th = (Throwable) obj2;
                    InterfaceC1364105Vn<TemplateListData> interfaceC1364105Vn = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                    C501540Jlg.LIZJ(c0kke.LIZ.LJIIIZ, th);
                    C516120KLy c516120KLyLIZIZ = C0KKE.LIZIZ(c0kke, System.currentTimeMillis() - jCurrentTimeMillis, null, th, 2);
                    c0kke.LJ.getClass();
                    AbstractC516030KLp.LIZ(c516120KLyLIZIZ);
                    C1C7U.LIZIZ("SubscribeTemplateFetchRepo@8722.fetchTemplateBasic$2$2");
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ResubscribeStrategy@84ad.resubscribe$1$templateInfoJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ResubscribeStrategy@84ad.resubscribe$1$templateInfoJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super TemplateListData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
