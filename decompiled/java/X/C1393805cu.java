package X;

import com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem$runAnimation$2", f = "AnimationQueueManagerAssem.kt", l = {415}, m = "invokeSuspend")
public final class C1393805cu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnimationQueueManagerAssem LLILLL;
    public final /* synthetic */ C1622406Ww LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C013C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393805cu(int i, C1622406Ww c1622406Ww, AnimationQueueManagerAssem animationQueueManagerAssem, InterfaceC1364105Vn interfaceC1364105Vn, C013C c013c) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = animationQueueManagerAssem;
        this.LLILZ = c1622406Ww;
        this.LLILZIL = i;
        this.LLILZLL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnimationQueueManagerAssem animationQueueManagerAssem = this.LLILLL;
        C1393805cu c1393805cu = new C1393805cu(this.LLILZIL, this.LLILZ, animationQueueManagerAssem, interfaceC1364105Vn, this.LLILZLL);
        c1393805cu.LLILLJJLI = obj;
        return c1393805cu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("AnimationQueueManagerAssem@5e87.runAnimation$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AnimationQueueManagerAssem animationQueueManagerAssem = this.LLILLL;
            unit = null;
            animationQueueManagerAssem.animationTaskJob = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1393905cv(this.LLILZIL, this.LLILZ, animationQueueManagerAssem, null, this.LLILZLL), 3);
            C09AE c09ae = this.LLILLL.animationTaskJob;
            if (c09ae != null) {
                this.LL = 1;
                if (c09ae.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("AnimationQueueManagerAssem@5e87.runAnimation$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("AnimationQueueManagerAssem@5e87.runAnimation$2");
            return unit;
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("AnimationQueueManagerAssem@5e87.runAnimation$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
