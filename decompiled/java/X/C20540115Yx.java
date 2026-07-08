package X;

import com.ss.android.ugc.aweme.pns.model.PNSProtectionApiResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.15Yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.serviceimp.sync.DataSyncEngineer$syncInBackground$1$2$1", f = "DataSyncEngineer.kt", l = {80}, m = "invokeSuspend")
public final class C20540115Yx extends C09AX implements Function1<InterfaceC1364105Vn<? super PNSProtectionApiResponse>, Object> {
    public int LL;
    public final /* synthetic */ C20539915Yv LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Integer LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20540115Yx(C20539915Yv c20539915Yv, int i, Integer num, InterfaceC1364105Vn<? super C20540115Yx> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c20539915Yv;
        this.LLILLL = i;
        this.LLILZ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20540115Yx(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super PNSProtectionApiResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DataSyncEngineer@9350.syncInBackground$1$2$1");
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
            C15Z1 c15z1 = this.LLILLJJLI.LIZIZ;
            int i2 = this.LLILLL;
            Integer num = this.LLILZ;
            this.LL = 1;
            obj = c15z1.LIZ(i2, num, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DataSyncEngineer@9350.syncInBackground$1$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DataSyncEngineer@9350.syncInBackground$1$2$1");
        return obj;
    }
}
