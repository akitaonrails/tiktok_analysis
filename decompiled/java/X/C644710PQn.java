package X;

import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.spark.core.viewmodel.SparkLoader$checkRawDataValidity$1", f = "SparkLoader.kt", l = {}, m = "invokeSuspend")
public final class C644710PQn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ DynamicPatch LLILLJJLI;
    public final /* synthetic */ TemplateData LLILLL;
    public final /* synthetic */ C1537480q70 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C644710PQn(DynamicPatch dynamicPatch, TemplateData templateData, C1537480q70 c1537480q70, InterfaceC1364105Vn<? super C644710PQn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dynamicPatch;
        this.LLILLL = templateData;
        this.LLILZ = c1537480q70;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C644710PQn c644710PQn = new C644710PQn(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c644710PQn.LL = obj;
        return c644710PQn;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[Catch: all -> 0x00db, PHI: r2
      0x0080: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v8 java.lang.String) binds: [B:41:0x007e, B:39:0x007b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00db, blocks: (B:3:0x0011, B:5:0x0017, B:7:0x001d, B:13:0x002a, B:19:0x003f, B:21:0x0045, B:22:0x004b, B:24:0x004f, B:26:0x0053, B:32:0x0061, B:34:0x006b, B:36:0x0071, B:38:0x0079, B:42:0x0080, B:44:0x008a, B:46:0x0090, B:48:0x0098, B:50:0x009c, B:54:0x00a5, B:57:0x00bd, B:59:0x00c7, B:60:0x00cb, B:61:0x00d5), top: B:69:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:3:0x0011, B:5:0x0017, B:7:0x001d, B:13:0x002a, B:19:0x003f, B:21:0x0045, B:22:0x004b, B:24:0x004f, B:26:0x0053, B:32:0x0061, B:34:0x006b, B:36:0x0071, B:38:0x0079, B:42:0x0080, B:44:0x008a, B:46:0x0090, B:48:0x0098, B:50:0x009c, B:54:0x00a5, B:57:0x00bd, B:59:0x00c7, B:60:0x00cb, B:61:0x00d5), top: B:69:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C644710PQn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
