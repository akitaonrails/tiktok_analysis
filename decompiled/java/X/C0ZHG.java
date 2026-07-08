package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZHG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.IMMediaDownloadAction$reportIMMediaDownloadRequest$1", f = "IMMediaDownloadAction.kt", l = {157}, m = "invokeSuspend")
public final class C0ZHG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1375680lu2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZHG(C1375680lu2 c1375680lu2, InterfaceC1364105Vn<? super C0ZHG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1375680lu2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZHG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMediaDownloadAction@f403.reportIMMediaDownloadRequest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                String imMsgId = AwemeBizExtKt.getImMsgId(this.LLILLJJLI.LLILLJJLI);
                if (imMsgId != null) {
                    long j = CastLongProtector.parseLong(imMsgId);
                    C0ZHH c0zhhLJIILL = C912070ZqH.LIZIZ.LJIILL();
                    this.LL = 1;
                    if (c0zhhLJIILL.LIZ(j, this) == objLJFF) {
                        C1C7U.LIZIZ("IMMediaDownloadAction@f403.reportIMMediaDownloadRequest$1");
                        return objLJFF;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0YS1.LIZIZ("IMMediaDownloadAction", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMediaDownloadAction@f403.reportIMMediaDownloadRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
