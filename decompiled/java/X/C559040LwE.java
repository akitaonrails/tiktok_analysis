package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.TemplateAutoCutAIComponent$startMagicI2ITask$2$1", f = "TemplateAutoCutAIComponent.kt", l = {630}, m = "invokeSuspend")
public final class C559040LwE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C559020LwC LLILLJJLI;
    public final /* synthetic */ NLEModel LLILLL;
    public final /* synthetic */ C0FQS LLILZ;
    public final /* synthetic */ C559060LwG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C559040LwE(C559020LwC c559020LwC, NLEModel nLEModel, C0FQS c0fqs, C559060LwG c559060LwG, InterfaceC1364105Vn<? super C559040LwE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c559020LwC;
        this.LLILLL = nLEModel;
        this.LLILZ = c0fqs;
        this.LLILZIL = c559060LwG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C559040LwE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateAutoCutAIComponent@a1d6.startMagicI2ITask$2$1");
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
            InterfaceC559090LwJ interfaceC559090LwJK5 = this.LLILLJJLI.k5();
            if (interfaceC559090LwJK5 != null) {
                NLEModel nLEModel = this.LLILLL;
                C0FQS c0fqs = this.LLILZ;
                this.LL = 1;
                if (interfaceC559090LwJK5.Vk0(nLEModel, c0fqs, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.startMagicI2ITask$2$1");
                    return objLJFF;
                }
            }
        }
        this.LLILZIL.LJI = true;
        this.LLILLJJLI.T4(this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.startMagicI2ITask$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
