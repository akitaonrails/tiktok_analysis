package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.story.forward.RequestCelebrationMaterialResult;
import com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.celebration.entrance.OpenCelebrationCreateAction$loadMaterial$1", f = "OpenCelebrationCreateAction.kt", l = {282}, m = "invokeSuspend")
public final class C063H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ OpenCelebrationCreateAction LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<RequestCelebrationMaterialResult, Unit> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C063H(Context context, OpenCelebrationCreateAction openCelebrationCreateAction, boolean z, Function1<? super RequestCelebrationMaterialResult, Unit> function1, int i, InterfaceC1364105Vn<? super C063H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = openCelebrationCreateAction;
        this.LLILZIL = z;
        this.LLILZLL = function1;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C063H(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C063H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
