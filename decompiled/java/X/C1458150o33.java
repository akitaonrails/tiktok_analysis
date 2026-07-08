package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0o33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.recommend.EPMusicRecommendLogicComponent$executeRecommendMusicTask$job$1", f = "EPMusicRecommendLogicComponent.kt", l = {144}, m = "invokeSuspend")
public final class C1458150o33 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1458160o34 LLILLL;
    public final /* synthetic */ C05XL<C204607154j> LLILZ;
    public final /* synthetic */ NLEModel LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458150o33(C1458160o34 c1458160o34, C05XL<C204607154j> c05xl, NLEModel nLEModel, String str, InterfaceC1364105Vn<? super C1458150o33> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1458160o34;
        this.LLILZ = c05xl;
        this.LLILZIL = nLEModel;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1458150o33(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[Catch: Exception -> 0x0123, CancellationException -> 0x012d, all -> 0x0145, TryCatch #1 {CancellationException -> 0x012d, blocks: (B:21:0x0096, B:22:0x0099, B:24:0x009d, B:26:0x00a1, B:27:0x00aa, B:29:0x00b0, B:33:0x00c3, B:39:0x00cf, B:43:0x00e0, B:46:0x00f9, B:48:0x00fd, B:52:0x0106, B:53:0x011d, B:9:0x0023, B:11:0x0033, B:14:0x0047, B:17:0x006c), top: B:64:0x0011, outer: #0 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458150o33.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
