package X;

import com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS129S0201000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.05cw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem$runAnimation$2$1$suspendBlock$1", f = "AnimationQueueManagerAssem.kt", l = {453}, m = "invokeSuspend")
public final class C1394005cw extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AnimationQueueManagerAssem LLILLJJLI;
    public final /* synthetic */ C1622406Ww LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C013C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1394005cw(int i, C1622406Ww c1622406Ww, AnimationQueueManagerAssem animationQueueManagerAssem, InterfaceC1364105Vn interfaceC1364105Vn, C013C c013c) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = animationQueueManagerAssem;
        this.LLILLL = c1622406Ww;
        this.LLILZ = i;
        this.LLILZIL = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnimationQueueManagerAssem animationQueueManagerAssem = this.LLILLJJLI;
        return new C1394005cw(this.LLILZ, this.LLILLL, animationQueueManagerAssem, interfaceC1364105Vn, this.LLILZIL);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnimationQueueManagerAssem@5e87.runAnimation$2$1$suspendBlock$1");
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
            AnimationQueueManagerAssem animationQueueManagerAssem = this.LLILLJJLI;
            C1622406Ww c1622406Ww = this.LLILLL;
            int i2 = this.LLILZ;
            C013C c013c = this.LLILZIL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            animationQueueManagerAssem.currentAnimEndListener = new AwS129S0201000_2(c2252611DEt, new AtomicBoolean(false), i2, 7);
            c1622406Ww.LIZ.LIZ.invoke(new AwS368S0200000_2(c013c, animationQueueManagerAssem, 41));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("AnimationQueueManagerAssem@5e87.runAnimation$2$1$suspendBlock$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnimationQueueManagerAssem@5e87.runAnimation$2$1$suspendBlock$1");
        return unit;
    }
}
