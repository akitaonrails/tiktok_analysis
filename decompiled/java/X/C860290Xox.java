package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsFluencyEventReport$start$1", f = "ToolsFluencyEventReport.kt", l = {69, 70}, m = "invokeSuspend")
public final class C860290Xox extends C09AX implements Function2<InterfaceC346701Wf<? super Unit>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C860290Xox(InterfaceC1364105Vn<? super C860290Xox> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C860290Xox c860290Xox = new C860290Xox(interfaceC1364105Vn);
        c860290Xox.LLILLJJLI = obj;
        return c860290Xox;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0047 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "ToolsFluencyEventReport@cfeb.start$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L4d
            if (r0 == r3) goto L32
            if (r0 != r4) goto L5b
            java.lang.Object r2 = r7.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r8)
        L1a:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C860340Xp2.LIZIZ
            boolean r0 = r0.get()
            if (r0 == 0) goto L55
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r7.LLILLJJLI = r2
            r7.LL = r3
            java.lang.Object r0 = r2.emit(r0, r7)
            if (r0 != r5) goto L39
            X.C1C7U.LIZIZ(r6)
            return r5
        L32:
            java.lang.Object r2 = r7.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r8)
        L39:
            com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig r0 = X.C861880XrW.LIZIZ()
            long r0 = r0.collectDuration
            r7.LLILLJJLI = r2
            r7.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r6)
            return r5
        L4d:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            goto L1a
        L55:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C860290Xox.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Unit> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
