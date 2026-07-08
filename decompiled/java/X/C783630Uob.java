package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Uob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.core.GameStreamQualityCenterImpl$initStrategyConfigWithoutProbe$1", f = "GameStreamQualityCenterImpl.kt", l = {244, 249}, m = "invokeSuspend")
public final class C783630Uob extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C327470Csb LLILZ;
    public final /* synthetic */ C2250031D4v LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C783630Uob(C327470Csb c327470Csb, C2250031D4v c2250031D4v, InterfaceC1364105Vn<? super C783630Uob> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c327470Csb;
        this.LLILZIL = c2250031D4v;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C783630Uob(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0Uog] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C783630Uob.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
