package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS94S0201000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.checkpoint.CheckPointServiceImpl$saveCheckPointInternal$1", f = "CheckPointServiceImpl.kt", l = {332}, m = "invokeSuspend")
public final class C539270LCz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<C540340LHc, Unit> LLILZ;
    public final /* synthetic */ C0MV0 LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C539270LCz(VideoPublishEditModel videoPublishEditModel, String str, Function1<? super C540340LHc, Unit> function1, C0MV0 c0mv0, int i, InterfaceC1364105Vn<? super C539270LCz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = c0mv0;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539270LCz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJI = obj;
        C1C7U.LIZ("CheckPointServiceImpl@1176.saveCheckPointInternal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C201955140j.LJIIL("CheckPointServiceImpl begin save CheckPoint");
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
            C538590LAj c538590LAj = new C538590LAj(videoPublishEditModel, new C0M2T(false, "CheckPointServiceImpl", null, 4, false, 28), false);
            AwS94S0201000_8 awS94S0201000_8 = new AwS94S0201000_8(videoPublishEditModel, this.LLILZIL, this.LLILZLL, 7);
            this.LL = 1;
            objLJI = interfaceC545580LaWLIZIZ.LJI(c538590LAj, awS94S0201000_8, this);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("CheckPointServiceImpl@1176.saveCheckPointInternal$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveCheckPoint creationId: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" done");
        C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Function1<C540340LHc, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke((C540340LHc) objLJI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CheckPointServiceImpl@1176.saveCheckPointInternal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
