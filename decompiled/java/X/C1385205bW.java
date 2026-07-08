package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowDownloadNode$run$2", f = "AIGCWorkflowDownloadNode.kt", l = {99}, m = "invokeSuspend")
public final class C1385205bW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1177704j9>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1257504w1 LLILLL;
    public final /* synthetic */ C552040Lkw LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1385205bW(int i, C1257504w1 c1257504w1, C552040Lkw c552040Lkw, String str, int i2, long j, InterfaceC1364105Vn<? super C1385205bW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c1257504w1;
        this.LLILZ = c552040Lkw;
        this.LLILZIL = str;
        this.LLILZLL = i2;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1385205bW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowDownloadNode@bb4b.run$2");
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
            C1385105bV c1385105bV = new C1385105bV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
            this.LL = 1;
            obj = C2296808zG.LJ(c1385105bV, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGCWorkflowDownloadNode@bb4b.run$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIGCWorkflowDownloadNode@bb4b.run$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1177704j9> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
