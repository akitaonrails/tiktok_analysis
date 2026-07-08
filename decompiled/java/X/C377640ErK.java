package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ErK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.EditorProAIGCComponent$backfillServerTaskIdAndFireMob$1", f = "EditorProAIGCComponent.kt", l = {778}, m = "invokeSuspend")
public final class C377640ErK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C377590ErF LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AIGCGenerationParam LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C259800zU<C09AE> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377640ErK(C377590ErF c377590ErF, String str, AIGCGenerationParam aIGCGenerationParam, String str2, C259800zU<C09AE> c259800zU, InterfaceC1364105Vn<? super C377640ErK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c377590ErF;
        this.LLILLL = str;
        this.LLILZ = aIGCGenerationParam;
        this.LLILZIL = str2;
        this.LLILZLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377640ErK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProAIGCComponent@c6d2.backfillServerTaskIdAndFireMob$1");
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
            C0FXA c0fxa = new C0FXA(this.LLILLJJLI.v5().LJI(this.LLILLL), 0);
            final C377590ErF c377590ErF = this.LLILLJJLI;
            final AIGCGenerationParam aIGCGenerationParam = this.LLILZ;
            final String str = this.LLILZIL;
            final C259800zU<C09AE> c259800zU = this.LLILZLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0ErP
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    c377590ErF.O3(((C381540Exc) obj2).LJIJJLI, aIGCGenerationParam, str);
                    C09AE c09ae = c259800zU.element;
                    if (c09ae != null) {
                        c09ae.LIZIZ(null);
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c0fxa.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("EditorProAIGCComponent@c6d2.backfillServerTaskIdAndFireMob$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditorProAIGCComponent@c6d2.backfillServerTaskIdAndFireMob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
