package X;

import com.bytedance.tts.pigeon.paas.components.api.PigeonIMLoginStateComponentApi;
import com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0YX5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.components.base.PigeonIDCChangeComponent$startPoling$1$idCData$1", f = "PigeonIDCChangeComponent.kt", l = {53}, m = "invokeSuspend")
public final class C0YX5 extends C09AX implements Function1<InterfaceC1364105Vn<? super C0YX7>, Object> {
    public int LL;
    public final /* synthetic */ PigeonIDCChangeComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YX5(PigeonIDCChangeComponent pigeonIDCChangeComponent, InterfaceC1364105Vn<? super C0YX5> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = pigeonIDCChangeComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YX5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0YX7> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PigeonIDCChangeComponent@bd58.startPoling$1$idCData$1");
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
            C0YWT c0ywt = (C0YWT) ((PigeonIMLoginStateComponentApi) this.LLILLJJLI.LLILLL.getValue()).LJJJJI().getValue();
            C0YZ7 c0yz7LIZLLL = this.LLILLJJLI.LL.getPigeonDepend().LIZLLL();
            String str = c0ywt.LIZJ;
            String str2 = c0ywt.LJ;
            this.LL = 1;
            obj = c0yz7LIZLLL.LIZ(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PigeonIDCChangeComponent@bd58.startPoling$1$idCData$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PigeonIDCChangeComponent@bd58.startPoling$1$idCData$1");
        return obj;
    }
}
