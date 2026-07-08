package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LLH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.MultiResourceUploadTask$run$imageUploadTask$1", f = "MultiResourceUploadTask.kt", l = {73}, m = "invokeSuspend")
public final class C0LLH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends ImageUploadTaskOutput, ? extends Map<String, ? extends String>>>, Object> {
    public int LL;
    public final /* synthetic */ C541400LLe LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LLH(C541400LLe c541400LLe, List<String> list, InterfaceC1364105Vn<? super C0LLH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c541400LLe;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LLH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiResourceUploadTask@eeac.run$imageUploadTask$1");
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
            C541400LLe c541400LLe = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = c541400LLe.LJJJJLI(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MultiResourceUploadTask@eeac.run$imageUploadTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MultiResourceUploadTask@eeac.run$imageUploadTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends ImageUploadTaskOutput, ? extends Map<String, ? extends String>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
