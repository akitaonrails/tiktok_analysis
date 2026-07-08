package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationMultiResourceUploadTask$run$videoUploadTask$1", f = "AICreationMultiResourceUploadTask.kt", l = {108}, m = "invokeSuspend")
public final class C539500LDw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends ImageUploadTaskOutput, ? extends Map<String, ? extends String>>>, Object> {
    public int LL;
    public final /* synthetic */ C541410LLf LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539500LDw(C541410LLf c541410LLf, List<String> list, InterfaceC1364105Vn<? super C539500LDw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c541410LLf;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539500LDw(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationMultiResourceUploadTask@a170.run$videoUploadTask$1");
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
            C541410LLf c541410LLf = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            this.LL = 1;
            obj = c541410LLf.LJJJZ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AICreationMultiResourceUploadTask@a170.run$videoUploadTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AICreationMultiResourceUploadTask@a170.run$videoUploadTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends ImageUploadTaskOutput, ? extends Map<String, ? extends String>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
