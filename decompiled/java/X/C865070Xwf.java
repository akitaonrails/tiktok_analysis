package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.client.conversation.DefaultConversationManager$pullConvLatestMessages$$inlined$scopedIO$1", f = "DefaultConversationManager.kt", l = {73}, m = "invokeSuspend")
public final class C865070Xwf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Unit>>, Object> {
    public int LL;
    public final /* synthetic */ C866340Xyi LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865070Xwf(InterfaceC1364105Vn interfaceC1364105Vn, C866340Xyi c866340Xyi, String str) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c866340Xyi;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865070Xwf(interfaceC1364105Vn, this.LLILLJJLI, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultConversationManager@5d7d.pullConvLatestMessages$$inlined$scopedIO$1");
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
            C869080Y7m c869080Y7mLJIIIZ = this.LLILLJJLI.LJ.LJIIIZ();
            String str = this.LLILLL;
            this.LL = 1;
            obj = c869080Y7mLJIIIZ.LIZIZ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DefaultConversationManager@5d7d.pullConvLatestMessages$$inlined$scopedIO$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DefaultConversationManager@5d7d.pullConvLatestMessages$$inlined$scopedIO$1");
        return obj;
    }
}
