package X;

import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadInput;
import com.ss.android.ugc.aweme.aigc.graph.nodes.slot.DownloadItemResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowDownloadNode$run$2$1$downloadItemList$1$1", f = "AIGCWorkflowDownloadNode.kt", l = {191, 117}, m = "invokeSuspend")
public final class C1385305bX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DownloadItemResult>, Object> {
    public InterfaceC1337805Lk LL;
    public Object LLILLJJLI;
    public C552040Lkw LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public final /* synthetic */ InterfaceC1337805Lk LLIZLLLIL;
    public final /* synthetic */ DownloadInput LLJ;
    public final /* synthetic */ C552040Lkw LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1385305bX(InterfaceC1337805Lk interfaceC1337805Lk, DownloadInput downloadInput, C552040Lkw c552040Lkw, String str, int i, long j, InterfaceC1364105Vn<? super C1385305bX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = interfaceC1337805Lk;
        this.LLJ = downloadInput;
        this.LLJI = c552040Lkw;
        this.LLJIJIL = str;
        this.LLJILJIL = i;
        this.LLJILJILJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1385305bX(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:15:0x0067, B:17:0x006d, B:38:0x00a6, B:40:0x00ff, B:35:0x009d, B:23:0x0079, B:27:0x0085, B:31:0x0090), top: B:58:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1385305bX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DownloadItemResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
