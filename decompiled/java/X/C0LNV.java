package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LNV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.openstory.base.OpenStoryBaseManager$processStory$1", f = "OpenStoryBaseManager.kt", l = {77}, m = "invokeSuspend")
public final class C0LNV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0MNQ LL;
    public CreativeInfo LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0LNW<Object> LLILZLL;
    public final /* synthetic */ Function1<C0MNQ, Unit> LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LNV(C0LNW c0lnw, Function1 function1, Context context, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c0lnw;
        this.LLIZ = function1;
        this.LLIZLLLIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LNV c0lnv = new C0LNV(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c0lnv.LLILZIL = obj;
        return c0lnv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C0MNQ c0mnq;
        CreativeInfo creativeInfo;
        Object objLIZJ;
        C1C7U.LIZ("OpenStoryBaseManager@d6cb.processStory$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        objLIZJ = this.LLILLL;
                        creativeInfo = this.LLILLJJLI;
                        c0mnq = this.LL;
                        interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILZIL;
                    C0LNW<Object> c0lnw = this.LLILZLL;
                    Function1<C0MNQ, Unit> function1 = this.LLIZ;
                    c0lnw.getClass();
                    c0mnq = new C0MNQ();
                    function1.invoke(c0mnq);
                    this.LLILZLL.getClass();
                    Pair pairLIZ = C0LNW.LIZ(c0mnq);
                    creativeInfo = (CreativeInfo) pairLIZ.getSecond();
                    objLIZJ = this.LLILZLL.LIZJ(c0mnq);
                    if (objLIZJ == null) {
                        this.LLILZLL.LIZLLL();
                        Unit unit = Unit.LIZ;
                        this.LLILZLL.LIZIZ();
                        C1C7U.LIZIZ("OpenStoryBaseManager@d6cb.processStory$1");
                        return unit;
                    }
                    C0LNW<Object> c0lnw2 = this.LLILZLL;
                    Context context = this.LLIZLLLIL;
                    this.LLILZIL = interfaceC497601wk;
                    this.LL = c0mnq;
                    this.LLILLJJLI = creativeInfo;
                    this.LLILLL = objLIZJ;
                    this.LLILZ = 1;
                    obj = c0lnw2.LJI(context, objLIZJ, creativeInfo, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("OpenStoryBaseManager@d6cb.processStory$1");
                        return objLJFF;
                    }
                }
                Intent intentLJFF = this.LLILZLL.LJFF(creativeInfo, obj, c0mnq, objLIZJ);
                C2296808zG.LJFF(interfaceC497601wk);
                this.LLILZLL.LJ(this.LLIZLLLIL, intentLJFF);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILZLL.getClass();
                if (e instanceof RuntimeException) {
                    e.getMessage();
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected error: ");
                    sbLIZ.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            this.LLILZLL.LIZIZ();
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("OpenStoryBaseManager@d6cb.processStory$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZLL.LIZIZ();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
