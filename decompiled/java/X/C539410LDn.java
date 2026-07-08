package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoPickFrameUploadTask$updateProgress$1", f = "AutoPickFrameUploadTask.kt", l = {282}, m = "invokeSuspend")
public final class C539410LDn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LKL LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539410LDn(C0LKL c0lkl, int i, InterfaceC1364105Vn<? super C539410LDn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lkl;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539410LDn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPickFrameUploadTask@d4a9.updateProgress$1");
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
            if (this.LLILLJJLI.LIZLLL.LJII <= this.LLILLL) {
                C0LKL c0lkl = this.LLILLJJLI;
                C0LSZ c0lszLIZ = C0LSZ.LIZ(c0lkl.LIZLLL, null, null, null, null, null, null, null, this.LLILLL, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435327);
                this.LL = 1;
                if (C0LTN.LJJJI(c0lkl, c0lszLIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.updateProgress$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoPickFrameUploadTask@d4a9.updateProgress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
