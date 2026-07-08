package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Uoc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.core.GameStreamQualityCenterImpl$startSpeedTestInternal$1", f = "GameStreamQualityCenterImpl.kt", l = {816, 819, 824}, m = "invokeSuspend")
public final class C783640Uoc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C327470Csb LLILZ;
    public final /* synthetic */ C2250031D4v LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ EnumC783720Uok LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783640Uoc(C327470Csb c327470Csb, C2250031D4v c2250031D4v, long j, EnumC783720Uok enumC783720Uok, InterfaceC1364105Vn<? super C783640Uoc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c327470Csb;
        this.LLILZIL = c2250031D4v;
        this.LLILZLL = j;
        this.LLIZ = enumC783720Uok;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783640Uoc(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, X.0Uog] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C783640Uoc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
