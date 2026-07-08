package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowUploadNode$run$imageUploadTask$1", f = "AIGCWorkflowUploadNode.kt", l = {148}, m = "invokeSuspend")
public final class C551820Lka extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ C551780LkW LLILLJJLI;
    public final /* synthetic */ InterfaceC551900Lki<C551950Lkn> LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551820Lka(C551780LkW c551780LkW, InterfaceC551900Lki<C551950Lkn> interfaceC551900Lki, List<String> list, InterfaceC1364105Vn<? super C551820Lka> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c551780LkW;
        this.LLILLL = interfaceC551900Lki;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C551820Lka(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowUploadNode@a90a.run$imageUploadTask$1");
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
            C551780LkW c551780LkW = this.LLILLJJLI;
            InterfaceC551900Lki<C551950Lkn> interfaceC551900Lki = this.LLILLL;
            List<String> list = this.LLILZ;
            this.LL = 1;
            obj = c551780LkW.LJI(interfaceC551900Lki, list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCWorkflowUploadNode@a90a.run$imageUploadTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIGCWorkflowUploadNode@a90a.run$imageUploadTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Map<String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
