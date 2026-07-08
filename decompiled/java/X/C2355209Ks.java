package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.util.CommentListLazyParser$startLazyParseTask$1", f = "CommentListLazyParser.kt", l = {}, m = "invokeSuspend")
public final class C2355209Ks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommentItemList>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2355209Ks(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2355209Ks c2355209Ks = new C2355209Ks(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
        c2355209Ks.LL = obj;
        return c2355209Ks;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: all -> 0x00de, TryCatch #0 {all -> 0x00de, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x003e, B:8:0x0046, B:13:0x0058, B:15:0x0060, B:17:0x006a, B:18:0x0072, B:23:0x007c, B:25:0x008a, B:27:0x008e, B:28:0x0096, B:31:0x00a1, B:33:0x00b6, B:35:0x00ba, B:36:0x00c2, B:37:0x00d6), top: B:47:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2355209Ks.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommentItemList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
