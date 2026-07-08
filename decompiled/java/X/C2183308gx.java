package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08gx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.voice.RecordTimerController$resumeInternal$1", f = "RecordTimerController.kt", l = {176}, m = "invokeSuspend")
public final class C2183308gx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2184408h8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2183308gx(C2184408h8 c2184408h8, InterfaceC1364105Vn<? super C2183308gx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2184408h8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2183308gx c2183308gx = new C2183308gx(this.LLILLL, interfaceC1364105Vn);
        c2183308gx.LLILLJJLI = obj;
        return c2183308gx;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "RecordTimerController@dfd.resumeInternal$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r11.LL
            r7 = 1
            if (r0 == 0) goto L91
            if (r0 != r7) goto La0
            java.lang.Object r0 = r11.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            X.C155000ia.LIZIZ(r12)
        L17:
            boolean r1 = X.C2296808zG.LJI(r0)
            if (r1 == 0) goto L9a
            X.08h8 r1 = r11.LLILLL
            boolean r1 = r1.LJI
            if (r1 == 0) goto L9a
            X.08h8 r9 = r11.LLILLL
            kotlin.jvm.functions.Function0<java.lang.Long> r2 = r9.LJIIIZ
            r5 = 0
            if (r2 == 0) goto L7e
            boolean r1 = r9.LJI
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r2.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L7e
        L3d:
            X.08h8 r1 = r11.LLILLL
            X.1DDq r2 = r1.LIZ
            java.lang.Long r1 = X.C2286608xc.LJFF(r3)
            r2.setValue(r1)
            com.ss.android.ugc.aweme.inbox.bulletin.setting.VoiceRecordingConfiguration r1 = X.C2183908h3.LIZ()
            long r1 = r1.maxRecordingDurationMs
            long r1 = r1 - r3
            r4 = 10000(0x2710, double:4.9407E-320)
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 > 0) goto L6e
            r3 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r3
            long r1 = r1 / r3
            int r3 = (int) r1
            X.08h8 r2 = r11.LLILLL
            int r1 = r2.LJIIIIZZ
            if (r3 == r1) goto L6e
            if (r3 < 0) goto L6e
            r2.LJIIIIZZ = r3
            X.1DDr r2 = r2.LIZJ
            X.08gy r1 = new X.08gy
            r1.<init>(r3)
            r2.LIZJ(r1)
        L6e:
            r11.LLILLJJLI = r0
            r11.LL = r7
            r1 = 33
            java.lang.Object r1 = X.AnonymousClass0958.LIZIZ(r1, r11)
            if (r1 != r8) goto L17
            X.C1C7U.LIZIZ(r10)
            return r8
        L7e:
            boolean r1 = r9.LJI
            if (r1 == 0) goto L89
            long r5 = java.lang.System.nanoTime()
            long r1 = r9.LJFF
            long r5 = r5 - r1
        L89:
            long r3 = r9.LJ
            long r3 = r3 + r5
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r1
            goto L3d
        L91:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r0 = r11.LLILLJJLI
            X.01wk r0 = (X.InterfaceC497601wk) r0
            goto L17
        L9a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2183308gx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
