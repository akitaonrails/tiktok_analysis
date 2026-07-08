package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Kzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aialive.AiAliveContentResourceResolver$resolve$1$1", f = "AiAliveContentResourceResolver.kt", l = {48}, m = "invokeSuspend")
public final class C535730Kzj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ICreationAsyncTaskManager LLILLJJLI;
    public final /* synthetic */ C535020Kya LLILLL;
    public final /* synthetic */ InterfaceC2329309At<C535020Kya> LLILZ;
    public final /* synthetic */ C535750Kzl LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535730Kzj(ICreationAsyncTaskManager iCreationAsyncTaskManager, C535020Kya c535020Kya, InterfaceC2329309At<C535020Kya> interfaceC2329309At, C535750Kzl c535750Kzl, InterfaceC1364105Vn<? super C535730Kzj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iCreationAsyncTaskManager;
        this.LLILLL = c535020Kya;
        this.LLILZ = interfaceC2329309At;
        this.LLILZIL = c535750Kzl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535730Kzj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiAliveContentResourceResolver@6132.resolve$1$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManager = this.LLILLJJLI;
            String str = this.LLILLL.LIZ;
            this.LL = 1;
            obj = iCreationAsyncTaskManager.LJFF(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AiAliveContentResourceResolver@6132.resolve$1$1");
                return objLJFF;
            }
        }
        C0LSZ c0lsz = (C0LSZ) obj;
        if (c0lsz == null) {
            InterfaceC2329309At<C535020Kya> interfaceC2329309At = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("failed to find task from ");
            sbLIZ.append(this.LLILLL);
            interfaceC2329309At.onError(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AiAliveContentResourceResolver@6132.resolve$1$1");
            return unit;
        }
        if (Intrinsics.LJFF(c0lsz.LJ, "FINISHED")) {
            C534910KyP c534910KyP = this.LLILZIL.LIZ;
            C535020Kya c535020Kya = this.LLILLL;
            InterfaceC2329309At<C535020Kya> interfaceC2329309At2 = this.LLILZ;
            if (C538760LBa.LIZ(c535020Kya.LJII)) {
                interfaceC2329309At2.onSuccess(c535020Kya);
            } else {
                Object objLJJJLL = C13LP.LJJJLL(c534910KyP.LJ(c535020Kya.LIZ));
                if (objLJJJLL != null) {
                    C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resolve ");
                    sbLIZ2.append(c535020Kya);
                    sbLIZ2.append(" done: ");
                    sbLIZ2.append(objLJJJLL);
                    C201955140j.LIZLLL(c552700Lm0, "AiAliveCRR", C2188811AlT.LIZIZ(sbLIZ2));
                    interfaceC2329309At2.onSuccess((C535020Kya) objLJJJLL);
                } else if (C538760LBa.LIZ(c0lsz.LJIILIIL)) {
                    interfaceC2329309At2.onSuccess(C535020Kya.LIZ(c535020Kya, 0, 0, 0, c0lsz.LJIILIIL, false, 0, 65407));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("failed to handleDownloaded ");
                    sbLIZ3.append(c535020Kya);
                    interfaceC2329309At2.onError(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3)));
                }
            }
        } else {
            InterfaceC2329309At<C535020Kya> interfaceC2329309At3 = this.LLILZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("task unfinished: ");
            sbLIZ4.append(this.LLILLL);
            interfaceC2329309At3.onError(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4)));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AiAliveContentResourceResolver@6132.resolve$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
