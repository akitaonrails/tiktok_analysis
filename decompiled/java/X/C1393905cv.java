package X;

import com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.feature.animation.AnimationQueueManagerAssem$runAnimation$2$1", f = "AnimationQueueManagerAssem.kt", l = {399, 401}, m = "invokeSuspend")
public final class C1393905cv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1622406Ww LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ AnimationQueueManagerAssem LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1393905cv(int i, C1622406Ww c1622406Ww, AnimationQueueManagerAssem animationQueueManagerAssem, InterfaceC1364105Vn interfaceC1364105Vn, C013C c013c) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1622406Ww;
        this.LLILLL = i;
        this.LLILZ = c013c;
        this.LLILZIL = animationQueueManagerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1622406Ww c1622406Ww = this.LLILLJJLI;
        return new C1393905cv(this.LLILLL, c1622406Ww, this.LLILZIL, interfaceC1364105Vn, this.LLILZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[PHI: r1
      0x00bb: PHI (r1v6 kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>) = 
      (r1v3 kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>)
      (r1v11 kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit>)
     binds: [B:26:0x00b9, B:21:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393905cv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
