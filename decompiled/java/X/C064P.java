package X;

import com.ss.android.ugc.aweme.texttoimage.Text2ImageApiResp;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.064P, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageAddAsPostPrefetchCache$prefetch$deferred$1", f = "Text2ImageAddAsPostPrefetchCache.kt", l = {131}, m = "invokeSuspend")
public final class C064P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Text2ImageApiResp>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ AtomicLong LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C064P(String str, String str2, String str3, boolean z, String str4, AtomicLong atomicLong, InterfaceC1364105Vn<? super C064P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = z;
        this.LLILZLL = str4;
        this.LLIZ = atomicLong;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C064P(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[Catch: Exception -> 0x00db, TryCatch #0 {Exception -> 0x00db, blocks: (B:39:0x00c9, B:40:0x00cc, B:9:0x0023, B:11:0x0075, B:18:0x0084, B:20:0x008a, B:28:0x009b, B:30:0x00ac, B:34:0x00b3, B:35:0x00b5), top: B:46:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C064P.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Text2ImageApiResp> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
