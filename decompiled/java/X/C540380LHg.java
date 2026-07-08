package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.service.CreativeDraftUpdateServiceImpl$save$job$1", f = "DraftUpdateServiceImpl.kt", l = {64}, m = "invokeSuspend")
public final class C540380LHg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C545600LaY LLILLJJLI;
    public final /* synthetic */ C538590LAj LLILLL;
    public final /* synthetic */ Function1<AwemeDraft, Unit> LLILZ;
    public final /* synthetic */ InterfaceC540360LHe LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C540380LHg(C545600LaY c545600LaY, C538590LAj c538590LAj, Function1<? super AwemeDraft, Unit> function1, InterfaceC540360LHe interfaceC540360LHe, InterfaceC1364105Vn<? super C540380LHg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c545600LaY;
        this.LLILLL = c538590LAj;
        this.LLILZ = function1;
        this.LLILZIL = interfaceC540360LHe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C540380LHg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreativeDraftUpdateServiceImpl@1350.save$job$1");
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
            C545600LaY c545600LaY = this.LLILLJJLI;
            C538590LAj c538590LAj = this.LLILLL;
            Function1<AwemeDraft, Unit> function1 = this.LLILZ;
            this.LL = 1;
            obj = c545600LaY.LJI(c538590LAj, function1, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreativeDraftUpdateServiceImpl@1350.save$job$1");
                return objLJFF;
            }
        }
        C540340LHc c540340LHc = (C540340LHc) obj;
        if (c540340LHc.LIZ.isSuc()) {
            this.LLILZIL.LIZJ(c540340LHc);
        } else {
            this.LLILZIL.LIZIZ(c540340LHc);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreativeDraftUpdateServiceImpl@1350.save$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
