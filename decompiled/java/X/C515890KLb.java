package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KLb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.productfetch.ResubscribeStrategy$resubscribe$2$preCheckJob$1", f = "ResubscribeStrategy.kt", l = {143}, m = "invokeSuspend")
public final class C515890KLb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C517630KRt>, Object> {
    public int LL;
    public final /* synthetic */ C0KMZ LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515890KLb(C0KMZ c0kmz, C19EG c19eg, String str, long j, InterfaceC1364105Vn<? super C515890KLb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kmz;
        this.LLILLL = c19eg;
        this.LLILZ = str;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C515890KLb(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        String currentUserID;
        Long lLJIILIIL;
        Object objLIZ = obj;
        C1C7U.LIZ("ResubscribeStrategy@155b.resubscribe$2$preCheckJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            final C0KMZ c0kmz = this.LLILLJJLI;
            final WeakReference weakReference = new WeakReference(this.LLILLL);
            final String str = this.LLILZ;
            final long j = this.LLILZIL;
            this.LL = 1;
            c0kmz.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            final long jCurrentTimeMillis = System.currentTimeMillis();
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(currentUserID)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            c0kmz.LIZJ.LIZJ(new InterfaceC518100KTo() { // from class: X.0KLj
                /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
                @Override // X.InterfaceC518100KTo
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(java.util.Map<java.lang.String, X.C517630KRt> r25) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 322
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C515970KLj.LIZ(java.util.Map):void");
                }
            }, new C1789940wgC(jLongValue, "80UJVV6Y1101", Collections.singletonList(str), "", j, 32));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("ResubscribeStrategy@155b.resubscribe$2$preCheckJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ResubscribeStrategy@155b.resubscribe$2$preCheckJob$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C517630KRt> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
