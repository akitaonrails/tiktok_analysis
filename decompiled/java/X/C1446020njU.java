package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.im.AIGroupShotMediaModel;
import com.ss.android.ugc.aweme.wavepublish.dm.service.DMGroupShotEditPageServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0njU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.dm.service.DMGroupShotEditPageServiceImpl$goToEditPage$1", f = "DMGroupShotEditPageServiceImpl.kt", l = {77, 78}, m = "invokeSuspend")
public final class C1446020njU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DMGroupShotEditPageServiceImpl LLILLJJLI;
    public final /* synthetic */ AIGroupShotMediaModel LLILLL;
    public final /* synthetic */ C1390130mHL LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1446020njU(DMGroupShotEditPageServiceImpl dMGroupShotEditPageServiceImpl, AIGroupShotMediaModel aIGroupShotMediaModel, C1390130mHL c1390130mHL, Context context, InterfaceC1364105Vn<? super C1446020njU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dMGroupShotEditPageServiceImpl;
        this.LLILLL = aIGroupShotMediaModel;
        this.LLILZ = c1390130mHL;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1446020njU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("DMGroupShotEditPageServiceImpl@96c6.goToEditPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DMGroupShotEditPageServiceImpl@96c6.goToEditPage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            DMGroupShotEditPageServiceImpl dMGroupShotEditPageServiceImpl = this.LLILLJJLI;
            AIGroupShotMediaModel aIGroupShotMediaModel = this.LLILLL;
            this.LL = 1;
            objLIZ = dMGroupShotEditPageServiceImpl.LIZ(aIGroupShotMediaModel, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DMGroupShotEditPageServiceImpl@96c6.goToEditPage$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1446030njV c1446030njV = new C1446030njV(this.LLILZ, this.LLILLL, this.LLILZIL, (Intent) objLIZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1446030njV) == objLJFF) {
            C1C7U.LIZIZ("DMGroupShotEditPageServiceImpl@96c6.goToEditPage$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DMGroupShotEditPageServiceImpl@96c6.goToEditPage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
