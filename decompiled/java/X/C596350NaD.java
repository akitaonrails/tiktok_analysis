package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinBoardAutoShareDataManager$storeAutoShareIsChecked$1", f = "BulletinBoardAutoShareDataManager.kt", l = {120, 121, 139}, m = "invokeSuspend")
public final class C596350NaD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C596350NaD(boolean z, InterfaceC1364105Vn<? super C596350NaD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596350NaD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("storeAutoShareIsChecked sync server net error ");
            sbLIZ.append(e);
            C1720106oR.LJI("BulletinBoardAutoShareDataManager", C2188811AlT.LIZIZ(sbLIZ));
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C596360NaE c596360NaE = new C596360NaE(this.LLILLJJLI, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq, c596360NaE) == objLJFF) {
                C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C604750Nnl c604750Nnl = C604750Nnl.LIZ;
            boolean z = this.LLILLJJLI;
            this.LL = 1;
            c604750Nnl.getClass();
            obj = C604750Nnl.LJ(z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C596370NaF c596370NaF = new C596370NaF((BaseResponse) obj, this.LLILLJJLI, null);
        this.LL = 2;
        obj = C23250099c.LJI(this, abstractC2238408pq2, c596370NaF);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinBoardAutoShareDataManager@f5bc.storeAutoShareIsChecked$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
