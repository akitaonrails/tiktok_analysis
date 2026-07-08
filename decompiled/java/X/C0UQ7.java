package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.startlive.BroadcastStartLiveHelper$checkInterceptor$5", f = "BroadcastStartLiveHelper.kt", l = {192}, m = "invokeSuspend")
public final class C0UQ7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C0UQ6 LLILLJJLI;
    public C0UQ8 LLILLL;
    public Function0 LLILZ;
    public InterfaceC759380Tqa LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ C0UQ8 LLJI;
    public final /* synthetic */ LiveMode LLJIJIL;
    public final /* synthetic */ C0UQ6 LLJILJIL;
    public final /* synthetic */ Function0<Unit> LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ Function0<Unit> LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UQ7(C0UQ8 c0uq8, LiveMode liveMode, C0UQ6 c0uq6, Function0<Unit> function0, boolean z, Function0<Unit> function02, InterfaceC1364105Vn<? super C0UQ7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = c0uq8;
        this.LLJIJIL = liveMode;
        this.LLJILJIL = c0uq6;
        this.LLJILJILJ = function0;
        this.LLJILLL = z;
        this.LLJJ = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UQ7(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:28:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0093 -> B:6:0x0025). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UQ7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
