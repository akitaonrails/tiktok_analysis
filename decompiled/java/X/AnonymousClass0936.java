package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0936, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.util.CorotuineKt$sampleAndKeepLast$2$samplerJob$1", f = "Corotuine.kt", l = {31, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class AnonymousClass0936 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C094D<String> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ AtomicReference LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0936(long j, AtomicReference atomicReference, C094D c094d, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = j;
        this.LLILZIL = atomicReference;
        this.LLILLL = c094d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0936(this.LLILZ, this.LLILZIL, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0044 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0048 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0054 -> B:7:0x0018). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0936 for r8v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "TakoAIVoiceInputKt@6e25.StreamingSubtitle$1$1$invokeSuspend$$inlined$sampleAndKeepLast$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L5a
            if (r0 == r3) goto L39
            if (r0 != r4) goto L5e
            java.lang.Object r6 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L18:
            java.util.concurrent.atomic.AtomicReference r2 = r8.LLILZIL
            java.lang.Object r1 = X.AnonymousClass0938.LIZ
        L1c:
            boolean r0 = r2.compareAndSet(r6, r1)
            if (r0 != 0) goto L28
            java.lang.Object r0 = r2.get()
            if (r0 == r6) goto L1c
        L28:
            long r1 = r8.LLILZ
            r0 = 0
            r8.LL = r0
            r8.LLILLJJLI = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r1, r8)
            if (r0 != r5) goto L3c
            X.C1C7U.LIZIZ(r7)
            return r5
        L39:
            X.C155000ia.LIZIZ(r9)
        L3c:
            java.util.concurrent.atomic.AtomicReference r0 = r8.LLILZIL
            java.lang.Object r6 = r0.get()
            java.lang.Object r0 = X.AnonymousClass0938.LIZ
            if (r6 == r0) goto L28
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L28
            X.094D<java.lang.String> r0 = r8.LLILLL
            r8.LL = r6
            r8.LLILLJJLI = r4
            java.lang.Object r0 = r0.LJIJI(r6, r8)
            if (r0 != r5) goto L18
            X.C1C7U.LIZIZ(r7)
            return r5
        L5a:
            X.C155000ia.LIZIZ(r9)
            goto L28
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0936.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
