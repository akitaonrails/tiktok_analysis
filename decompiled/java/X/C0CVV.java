package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0CVV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.PreScheduleRequest$request$1", f = "PreScheduleRequest.kt", l = {112, 120}, m = "invokeSuspend")
public final class C0CVV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<PreScheduleStream> LLILZ;
    public final /* synthetic */ C327950CtN LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function1<PreScheduleStream, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CVV(boolean z, C259800zU<PreScheduleStream> c259800zU, C327950CtN c327950CtN, boolean z2, Function1<? super PreScheduleStream, Unit> function1, InterfaceC1364105Vn<? super C0CVV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = c327950CtN;
        this.LLILZLL = z2;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CVV c0cvv = new C0CVV(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0cvv.LLILLJJLI = obj;
        return c0cvv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, webcast.api.creator.PreScheduleStream] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "PreScheduleRequest@d280.request$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L83
            if (r0 != r6) goto L9a
            X.C155000ia.LIZIZ(r9)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r2 = r8.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            boolean r0 = r8.LLILLL
            if (r0 != 0) goto L95
            X.00zU<webcast.api.creator.PreScheduleStream> r1 = r8.LLILZ
            X.0CtN r0 = r8.LLILZIL
            r0.getClass()
            webcast.api.creator.PreScheduleStream r0 = X.C327950CtN.LIZIZ()
            r1.element = r0
        L35:
            X.00zU<webcast.api.creator.PreScheduleStream> r1 = r8.LLILZ
            T r0 = r1.element
            webcast.api.creator.PreScheduleStream r0 = (webcast.api.creator.PreScheduleStream) r0
            if (r0 == 0) goto L6b
            java.lang.String r0 = r0.sdkParams
            if (r0 == 0) goto L6b
            boolean r0 = r8.LLILZLL
            if (r0 == 0) goto L50
            X.0CVU r1 = new X.0CVU
            X.0CtN r0 = r8.LLILZIL
            r1.<init>(r0, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
        L50:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0CVT r2 = new X.0CVT
            kotlin.jvm.functions.Function1<webcast.api.creator.PreScheduleStream, kotlin.Unit> r1 = r8.LLIZ
            X.00zU<webcast.api.creator.PreScheduleStream> r0 = r8.LLILZ
            r2.<init>(r4, r1, r0)
            r8.LLILLJJLI = r4
            r8.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r8, r3, r2)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r7)
            return r5
        L6b:
            X.0CtN r2 = r8.LLILZIL
            r8.LLILLJJLI = r1
            r8.LL = r3
            r2.getClass()
            X.0CsZ r0 = new X.0CsZ
            r0.<init>(r2, r4, r3, r3)
            java.lang.Object r9 = X.C2296808zG.LJ(r0, r8)
            if (r9 != r5) goto L8a
            X.C1C7U.LIZIZ(r7)
            return r5
        L83:
            java.lang.Object r1 = r8.LLILLJJLI
            X.00zU r1 = (X.C259800zU) r1
            X.C155000ia.LIZIZ(r9)
        L8a:
            X.0CtW r9 = (X.C328040CtW) r9
            if (r9 == 0) goto L93
            webcast.api.creator.PreScheduleStream r0 = r9.LIZ
        L90:
            r1.element = r0
            goto L50
        L93:
            r0 = r4
            goto L90
        L95:
            X.00zU<webcast.api.creator.PreScheduleStream> r0 = r8.LLILZ
            r0.element = r4
            goto L35
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CVV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
