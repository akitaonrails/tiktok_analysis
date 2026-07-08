package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinBoardAutoShareDataManager$storeAutoShareIsChecked$1$1", f = "BulletinBoardAutoShareDataManager.kt", l = {}, m = "invokeSuspend")
public final class C596370NaF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseResponse LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596370NaF(BaseResponse baseResponse, boolean z, InterfaceC1364105Vn<? super C596370NaF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseResponse;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596370NaF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.error_code == 0) {
            C604750Nnl c604750Nnl = C604750Nnl.LIZ;
            boolean z = this.LLILLJJLI;
            c604750Nnl.getClass();
            C604750Nnl.LIZLLL(z);
            unit = Unit.LIZ;
        } else {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("storeAutoShareIsChecked sync server business error ");
            sbLIZ.append(this.LL);
            C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ));
            C604750Nnl.LIZ.getClass();
            C11PQ<Boolean> c11pq = C604750Nnl.LIZIZ;
            if (c11pq != null) {
                c11pq.onNext(Boolean.valueOf(!this.LLILLJJLI));
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
        }
        C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
