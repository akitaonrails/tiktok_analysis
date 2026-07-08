package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05CP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl$syncDatabaseFromIMSdk$1", f = "AwemeManageServiceImpl.kt", l = {83}, m = "invokeSuspend")
public final class C05CP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AwemeManageServiceImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05CP(AwemeManageServiceImpl awemeManageServiceImpl, String str, InterfaceC1364105Vn<? super C05CP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = awemeManageServiceImpl;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CP(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AwemeManageServiceImpl@876f.syncDatabaseFromIMSdk$1");
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
                this.LLILLJJLI.LIZ.storeBoolean(this.LLILLL, true);
                AwemeManageServiceImpl awemeManageServiceImpl = this.LLILLJJLI;
                this.LL = 1;
                awemeManageServiceImpl.getClass();
                Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0NP3(awemeManageServiceImpl, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("AwemeManageServiceImpl@876f.syncDatabaseFromIMSdk$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.LIZ.storeBoolean(this.LLILLL, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AwemeManageServiceImpl@876f.syncDatabaseFromIMSdk$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
