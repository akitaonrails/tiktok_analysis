package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.140A, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.C2PAAIGCManager$generateC2PAWithTimeOut$result$1", f = "C2PAAIGCManager.kt", l = {169}, m = "invokeSuspend")
public final class C140A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AIGCInfo>, Object> {
    public int LL;
    public final /* synthetic */ MediaModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ CreativeInfo LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C140A(MediaModel mediaModel, boolean z, CreativeInfo creativeInfo, String str, InterfaceC1364105Vn<? super C140A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaModel;
        this.LLILLL = z;
        this.LLILZ = creativeInfo;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C140A(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00df A[EDGE_INSN: B:88:0x00df->B:41:0x00df BREAK  A[LOOP:0: B:30:0x00b8->B:92:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[LOOP:0: B:30:0x00b8->B:92:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.099V, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r40v0, types: [X.05Vn] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140A.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AIGCInfo> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
