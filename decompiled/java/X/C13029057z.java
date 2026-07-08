package X;

import com.ss.android.ugc.aweme.audiomode.vopclone.service.VopInstantCloneServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.057z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.audiomode.vopclone.service.VopInstantCloneServiceImpl$startRecordTimer$1", f = "VopInstantCloneServiceImpl.kt", l = {394}, m = "invokeSuspend")
public final class C13029057z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VopInstantCloneServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029057z(VopInstantCloneServiceImpl vopInstantCloneServiceImpl, InterfaceC1364105Vn<? super C13029057z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vopInstantCloneServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13029057z(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VopInstantCloneServiceImpl@3cd9.startRecordTimer$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            C13028057y c13028057y = new C13028057y(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfh, c13028057y) == objLJFF) {
                C1C7U.LIZIZ("VopInstantCloneServiceImpl@3cd9.startRecordTimer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VopInstantCloneServiceImpl@3cd9.startRecordTimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
