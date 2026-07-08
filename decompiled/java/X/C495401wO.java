package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailModel$checkDraftPathExisted$1", f = "EffectDraftDetailModel.kt", l = {86}, m = "invokeSuspend")
public final class C495401wO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C495401wO(String str, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C495401wO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C495401wO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zExists;
        C1C7U.LIZ("EffectDraftDetailModel@a1ea.checkDraftPathExisted$1");
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
            File fileLJFF = C2114508Qd.LJFF(new C0VSJ(""), this.LLILLJJLI);
            if (fileLJFF != null) {
                zExists = fileLJFF.exists();
            } else {
                zExists = false;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C495301wN c495301wN = new C495301wN(null, this.LLILLL, zExists);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c495301wN) == objLJFF) {
                C1C7U.LIZIZ("EffectDraftDetailModel@a1ea.checkDraftPathExisted$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDraftDetailModel@a1ea.checkDraftPathExisted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
