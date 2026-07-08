package X;

import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.151M, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.debug.module.SimpleGameKeyTimeInferModule$startInference$1", f = "SimpleGameKeyTimeInferModule.kt", l = {200}, m = "invokeSuspend")
public final class C151M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C151P LLILLJJLI;
    public final /* synthetic */ ByteBuffer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ InterfaceC204502150i LLILZLL;
    public final /* synthetic */ ByteBuffer LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ AbstractC1273900jFs LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C151M(C151P c151p, ByteBuffer byteBuffer, String str, boolean z, InterfaceC204502150i interfaceC204502150i, ByteBuffer byteBuffer2, long j, AbstractC1273900jFs abstractC1273900jFs, InterfaceC1364105Vn<? super C151M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c151p;
        this.LLILLL = byteBuffer;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC204502150i;
        this.LLIZ = byteBuffer2;
        this.LLIZLLLIL = j;
        this.LLJ = abstractC1273900jFs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C151M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104 A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:60:0x00e2, B:63:0x00f7, B:65:0x0104, B:67:0x0108, B:72:0x0113), top: B:176:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151M.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
