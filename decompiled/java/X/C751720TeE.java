package X;

import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.game.model.PartnershipDownloadResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.CommerceAttributionHandler$handleDownloadGame$1", f = "CommerceAttributionHandler.kt", l = {}, m = "invokeSuspend")
public final class C751720TeE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C843920X8s LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C843930X8t LLILLL;
    public final /* synthetic */ C0T7K LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751720TeE(C843920X8s c843920X8s, Context context, C843930X8t c843930X8t, C0T7K c0t7k, int i, InterfaceC1364105Vn<? super C751720TeE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c843920X8s;
        this.LLILLJJLI = context;
        this.LLILLL = c843930X8t;
        this.LLILZ = c0t7k;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751720TeE(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CommerceAttributionHandler@65e.handleDownloadGame$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C11NZ<C470590Icr<PartnershipDownloadResponse>> c11nzLJI = this.LL.LJI(this.LLILLJJLI, this.LLILLL);
        final C843920X8s c843920X8s = this.LL;
        final C843930X8t c843930X8t = this.LLILLL;
        final Context context = this.LLILLJJLI;
        final C0T7K c0t7k = this.LLILZ;
        final int i = this.LLILZIL;
        c843920X8s.getClass();
        c11nzLJI.LJL(C11S5.LIZ()).LJJLIIIJJIZ(2L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0T7J
            @Override // X.C09JN
            public final void accept(Object obj2) {
                String str;
                C1C7U.LIZ("CommerceAttributionHandler@65e.subscribeRequest$1");
                BaseResponse baseResponse = (BaseResponse) obj2;
                PartnershipDownloadResponse partnershipDownloadResponse = (PartnershipDownloadResponse) baseResponse.data;
                if (partnershipDownloadResponse == null || (str = partnershipDownloadResponse.referrer) == null) {
                    str = "";
                }
                c843920X8s.LJIILIIL(c843930X8t, context, str);
                C0T7K c0t7k2 = c0t7k;
                if (c0t7k2 != null) {
                    c0t7k2.LIZ(baseResponse.statusCode, "", true);
                }
                C1C7U.LIZIZ("CommerceAttributionHandler@65e.subscribeRequest$1");
            }
        }, new C09JN() { // from class: X.0TeF
            @Override // X.C09JN
            public final void accept(Object obj2) {
                C0T7K c0t7k2;
                String errorMsg;
                C501470JlZ c501470JlZ;
                C1C7U.LIZ("CommerceAttributionHandler@65e.subscribeRequest$2");
                Throwable th = (Throwable) obj2;
                if ((th instanceof C501520Jle) && (c0t7k2 = c0t7k) != null) {
                    int errorCode = ((C501520Jle) th).getErrorCode();
                    if (!(th instanceof C477520Io2) || (c501470JlZ = (C501470JlZ) th) == null || (errorMsg = c501470JlZ.getErrorMsg()) == null) {
                        errorMsg = "";
                    }
                    c0t7k2.LIZ(errorCode, errorMsg, false);
                }
                c843920X8s.LJIILIIL(c843930X8t, context, "");
                C766270U4b.LIZLLL(i);
                C843920X8s c843920X8s2 = c843920X8s;
                EnumC751770TeJ enumC751770TeJ = EnumC751770TeJ.LLILLL;
                C843930X8t c843930X8t2 = c843930X8t;
                c843920X8s2.getClass();
                C843920X8s.LJIIJJI(enumC751770TeJ, c843930X8t2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed in sendClickDownloadEvent, e: ");
                sbLIZ.append(th);
                C20441214yg.LJ("DownloadPartneringGameMethod", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("CommerceAttributionHandler@65e.subscribeRequest$2");
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceAttributionHandler@65e.handleDownloadGame$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
