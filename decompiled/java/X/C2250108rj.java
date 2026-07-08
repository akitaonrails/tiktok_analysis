package X;

import com.bytedance.ilasdk.api.MaterialScanService;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.understanding.tasks.LocalEmbScanTask$run$1", f = "LocalEmbScanTask.kt", l = {110, 128}, m = "invokeSuspend")
public final class C2250108rj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MaterialScanService LL;
    public Object LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ InterfaceC1431080nLO LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ C2250008ri LLJ;
    public final /* synthetic */ ContentPipelineContext LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250108rj(InterfaceC1431080nLO interfaceC1431080nLO, List<String> list, C2250008ri c2250008ri, ContentPipelineContext contentPipelineContext, InterfaceC1364105Vn<? super C2250108rj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1431080nLO;
        this.LLIZLLLIL = list;
        this.LLJ = c2250008ri;
        this.LLJI = contentPipelineContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2250108rj c2250108rj = new C2250108rj(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c2250108rj.LLILZLL = obj;
        return c2250108rj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161 A[Catch: all -> 0x029f, TryCatch #5 {all -> 0x029f, blocks: (B:44:0x015d, B:46:0x0161, B:59:0x01a0, B:61:0x01e8, B:74:0x0227, B:78:0x0234, B:81:0x0239, B:32:0x00dd, B:33:0x00f0, B:35:0x00f6, B:36:0x0107, B:37:0x0114, B:39:0x011a, B:40:0x0126), top: B:118:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0 A[Catch: all -> 0x029f, TRY_ENTER, TryCatch #5 {all -> 0x029f, blocks: (B:44:0x015d, B:46:0x0161, B:59:0x01a0, B:61:0x01e8, B:74:0x0227, B:78:0x0234, B:81:0x0239, B:32:0x00dd, B:33:0x00f0, B:35:0x00f6, B:36:0x0107, B:37:0x0114, B:39:0x011a, B:40:0x0126), top: B:118:0x00dd }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.bytedance.ilasdk.api.MaterialScanService] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250108rj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
