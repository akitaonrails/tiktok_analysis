package X;

import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LLL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.FaceDetectTask$run$2", f = "FaceDetectTask.kt", l = {116}, m = "invokeSuspend")
public final class C0LLL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super FaceDetectTaskOutput>, Object> {
    public int LL;
    public final /* synthetic */ C0LLP LLILLJJLI;
    public final /* synthetic */ FaceDetectTaskInput LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLL(C0LLP c0llp, FaceDetectTaskInput faceDetectTaskInput, long j, InterfaceC1364105Vn<? super C0LLL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0llp;
        this.LLILLL = faceDetectTaskInput;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LLL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FaceDetectTask@fd4c.run$2");
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
            C0LLP c0llp = this.LLILLJJLI;
            FaceDetectTaskInput faceDetectTaskInput = this.LLILLL;
            long j = this.LLILZ;
            this.LL = 1;
            obj = c0llp.LJJJJZ(faceDetectTaskInput, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FaceDetectTask@fd4c.run$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FaceDetectTask@fd4c.run$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super FaceDetectTaskOutput> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
