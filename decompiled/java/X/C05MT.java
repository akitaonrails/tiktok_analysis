package X;

import com.ss.android.ugc.aweme.aigc.label.AIGCLabelServiceImpl;
import com.ss.android.ugc.aweme.aigc.label.AIGCLabelStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05MT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.label.AIGCLabelServiceImpl$updateAigcLabelStatus$2", f = "AIGCLabelServiceImpl.kt", l = {67, 77, 85, 98, 108}, m = "invokeSuspend")
public final class C05MT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIGCLabelServiceImpl LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Function1<AIGCLabelStatusResponse, Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<String, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05MT(AIGCLabelServiceImpl aIGCLabelServiceImpl, String str, String str2, String str3, String str4, Function1<? super AIGCLabelStatusResponse, Unit> function1, Function1<? super String, Unit> function12, InterfaceC1364105Vn<? super C05MT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIGCLabelServiceImpl;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = function1;
        this.LLJ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05MT c05mt = new C05MT(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c05mt.LLILLJJLI = obj;
        return c05mt;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[Catch: Exception -> 0x00ce, IOException -> 0x00ff, CancellationException -> 0x0137, TryCatch #2 {CancellationException -> 0x0137, blocks: (B:13:0x0032, B:23:0x006f, B:24:0x0072, B:25:0x0074, B:27:0x007a, B:30:0x0082, B:32:0x0086, B:37:0x00a7, B:40:0x00ad, B:16:0x0043, B:18:0x004f), top: B:72:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05MT.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
