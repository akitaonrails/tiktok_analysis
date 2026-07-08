package X;

import com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model.ECInsertContent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12B1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.model.ECMixFeedAwemeListModel$requestFeedList$1", f = "ECMixFeedAwemeListModel.kt", l = {143, 385}, m = "invokeSuspend")
public final class C12B1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ C12B3 LLILZ;
    public final /* synthetic */ C2189821An6 LLILZIL;
    public final /* synthetic */ ECInsertContent LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12B1(Integer num, C12B3 c12b3, C2189821An6 c2189821An6, ECInsertContent eCInsertContent, InterfaceC1364105Vn<? super C12B1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = num;
        this.LLILZ = c12b3;
        this.LLILZIL = c2189821An6;
        this.LLILZLL = eCInsertContent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C12B1 c12b1 = new C12B1(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c12b1.LLILLJJLI = obj;
        return c12b1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v74 java.lang.Integer) = (r0v73 java.lang.Integer), (r0v88 java.lang.Integer) binds: [B:10:0x0026, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: all -> 0x00ca, TryCatch #2 {all -> 0x00ca, blocks: (B:34:0x00c1, B:35:0x00c4, B:27:0x006d, B:28:0x0070, B:30:0x00b8, B:19:0x0043, B:21:0x005c, B:22:0x005e), top: B:155:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12B1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
