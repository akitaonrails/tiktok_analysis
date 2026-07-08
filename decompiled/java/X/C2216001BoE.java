package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1BoE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.normal.PostPublishClarityScoreScheduler$submit$1", f = "PostPublishClarityScoreScheduler.kt", l = {118}, m = "invokeSuspend")
public final class C2216001BoE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2216011BoF LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216001BoE(C2216011BoF c2216011BoF, String str, InterfaceC1364105Vn<? super C2216001BoE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2216011BoF;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2216001BoE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PostPublishClarityScoreScheduler@617a.submit$1");
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
            long j = this.LLILLJJLI.LJIIJJI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.submit$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LJIJJLI = true;
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hard ttl reached: ");
        sbLIZ.append(this.LLILLJJLI.LJIIJJI);
        sbLIZ.append("ms publishId=");
        sbLIZ.append(this.LLILLL);
        C201955140j.LJIIIIZZ(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
        C2215981BoC c2215981BoC = C2215981BoC.LIZ;
        C2216011BoF c2216011BoF = this.LLILLJJLI;
        long j2 = c2216011BoF.LJII;
        long j3 = c2216011BoF.LJI;
        int i2 = c2216011BoF.LJIIIIZZ;
        int i3 = c2216011BoF.LJIIIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("vqscore_hard_ttl_");
        sbLIZ2.append(this.LLILLJJLI.LJIIJJI);
        sbLIZ2.append("ms");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c2215981BoC.getClass();
        C2215981BoC.LJII(c2216011BoF, C2215981BoC.LIZLLL(j2, j3, 0L, strLIZIZ, i2, i3));
        this.LLILLJJLI.LJIJJ = true;
        this.LLILLJJLI.LJIJI = true;
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LJIILLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c2215981BoC.LIZJ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostPublishClarityScoreScheduler@617a.submit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
