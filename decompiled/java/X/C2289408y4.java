package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08y4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$start$2", f = "BaseAIMusicUploadFrameTask.kt", l = {381, 394, 400}, m = "invokeSuspend")
public final class C2289408y4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C259800zU LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AbstractC2289508y5 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2289408y4(AbstractC2289508y5 abstractC2289508y5, InterfaceC1364105Vn<? super C2289408y4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = abstractC2289508y5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2289408y4 c2289408y4 = new C2289408y4(this.LLILZLL, interfaceC1364105Vn);
        c2289408y4.LLILZIL = obj;
        return c2289408y4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d7  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2289408y4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
