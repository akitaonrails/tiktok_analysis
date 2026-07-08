package X;

import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$tryFetchAudioASRIFNeed$1", f = "CommentPublishViewModel.kt", l = {984, 985, 987, 996, 1011}, m = "invokeSuspend")
public final class C1343940l4q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public C259800zU LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ CommentPublishViewModel LLIZLLLIL;
    public final /* synthetic */ long LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343940l4q(CommentPublishViewModel commentPublishViewModel, long j, InterfaceC1364105Vn<? super C1343940l4q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = commentPublishViewModel;
        this.LLJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1343940l4q c1343940l4q = new C1343940l4q(this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1343940l4q.LLIZ = obj;
        return c1343940l4q;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:40|41|(1:85)|42|83|43|(3:45|81|82)|46|53|(3:55|(2:57|(0)(2:59|(2:61|(2:63|64)(2:66|68))))|65)|69|(5:(13:74|(7:18|87|19|22|(1:24)|25|(2:27|28))(7:29|89|30|33|(1:35)|36|(2:38|39))|41|85|42|83|43|(0)|46|53|(0)|69|(0)(2:71|72))|75|(2:77|78)|10|11)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
    
        if (0 == 0) goto L61;
     */
    /* JADX WARN: Path cross not found for [B:57:0x0157, B:65:0x018d], limit reached: 92 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d5  */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, com.ss.android.ugc.aweme.comment.audio.model.CommentASRResponse] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0146 -> B:69:0x01a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x018f -> B:68:0x019f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1343940l4q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
