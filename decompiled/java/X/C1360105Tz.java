package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.view.StoryShootButtonKt$StoryShootButton$2$1$1", f = "StoryShootButton.kt", l = {195, 203}, m = "invokeSuspend")
public final class C1360105Tz extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;
    public final /* synthetic */ C05P1<Function0<Unit>> LLIZ;
    public final /* synthetic */ C05P1<Function1<C1378605aS, Unit>> LLIZLLLIL;
    public final /* synthetic */ C05P1<Function0<Unit>> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1360105Tz(C05P0<Boolean> c05p0, C05P1<? extends Function0<Unit>> c05p1, C05P1<? extends Function1<? super C1378605aS, Unit>> c05p12, C05P1<? extends Function0<Unit>> c05p13, InterfaceC1364105Vn<? super C1360105Tz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c05p0;
        this.LLIZ = c05p1;
        this.LLIZLLLIL = c05p12;
        this.LLJ = c05p13;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1360105Tz c1360105Tz = new C1360105Tz(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1360105Tz.LLILZIL = obj;
        return c1360105Tz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r14.LLILZLL.getValue().booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[LOOP:1: B:17:0x005d->B:18:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de A[EDGE_INSN: B:47:0x00de->B:37:0x00de BREAK  A[LOOP:2: B:20:0x0072->B:26:0x008e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d8 -> B:7:0x001e). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1360105Tz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
