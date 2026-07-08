package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$refreshList$2$firstAwemeJobDeferred$1", f = "ECAwemeListModel.kt", l = {113}, m = "invokeSuspend")
public final class C1399105dl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Aweme>, Object> {
    public C259800zU LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1525405y8 LLILZIL;
    public final /* synthetic */ C2189821An6 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399105dl(C1525405y8 c1525405y8, C2189821An6 c2189821An6, InterfaceC1364105Vn<? super C1399105dl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1525405y8;
        this.LLILZLL = c2189821An6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1399105dl c1399105dl = new C1399105dl(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1399105dl.LLILZ = obj;
        return c1399105dl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[Catch: all -> 0x00b8, TryCatch #2 {all -> 0x00b8, blocks: (B:30:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x0089, B:40:0x0097, B:42:0x009b, B:44:0x009f, B:47:0x00a7, B:49:0x00ad, B:9:0x002a, B:11:0x0030), top: B:59:0x002a }] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, com.ss.android.ugc.aweme.feed.model.Aweme] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1399105dl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
