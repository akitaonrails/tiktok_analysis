package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Eg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$executeLoadFromFile$1", f = "VideoFrameCache.kt", l = {232}, m = "invokeSuspend")
public final class C370700Eg8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C370710Eg9 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C370920EgU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370700Eg8(C370920EgU c370920EgU, InterfaceC1364105Vn<? super C370700Eg8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c370920EgU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C370700Eg8(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:5|(2:44|6)|42|25|(1:27)|12|48|(2:20|21)(8:40|22|(3:24|32|33)|42|25|(0)|12|48)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0 A[Catch: Exception -> 0x00a8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a8, blocks: (B:25:0x009c, B:27:0x00a0), top: B:42:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0024 -> B:12:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0099 -> B:42:0x009c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = "VideoFrameCache@ba6a.executeLoadFromFile$1"
            X.C1C7U.LIZ(r0)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L1f
            if (r0 != r4) goto L17
            X.0Eg9 r2 = r7.LL
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L23
            goto L9c
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r8)
            goto L44
        L23:
            r0 = move-exception
        L24:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r6 = "VideoFrameCache"
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.lang.String r1 = "decode file cache failed: "
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = ".path "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r5)
            X.C355090Dw3.LIZLLL(r6, r0)
        L44:
            X.0EgU r5 = r7.LLILLL
            java.util.LinkedList<X.0Eg9> r1 = r5.LLILZLL
            monitor-enter(r1)
            java.util.LinkedList<X.0Eg9> r0 = r5.LLILZLL     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r2 = r0.poll()     // Catch: java.lang.Throwable -> Lb4
            r0 = r2
            X.0Eg9 r0 = (X.C370710Eg9) r0     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L5a
            int r0 = r5.LLIZ     // Catch: java.lang.Throwable -> Lb4
            int r0 = r0 + (-1)
            r5.LLIZ = r0     // Catch: java.lang.Throwable -> Lb4
        L5a:
            X.0Eg9 r2 = (X.C370710Eg9) r2     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r1)
            if (r2 != 0) goto L67
            kotlin.Unit r1 = kotlin.Unit.LIZ
            java.lang.String r0 = "VideoFrameCache@ba6a.executeLoadFromFile$1"
            X.C1C7U.LIZIZ(r0)
            return r1
        L67:
            android.content.Context r6 = X.C0EHL.LIZ()     // Catch: java.lang.Exception -> Lab
            java.lang.String r5 = r2.LIZIZ     // Catch: java.lang.Exception -> Lab
            X.0Eg6 r1 = new X.0Eg6     // Catch: java.lang.Exception -> Lab
            r1.<init>()     // Catch: java.lang.Exception -> Lab
            X.0EgU r0 = r7.LLILLL     // Catch: java.lang.Exception -> Lab
            android.util.Size r0 = r0.LL     // Catch: java.lang.Exception -> Lab
            int r0 = r0.getWidth()     // Catch: java.lang.Exception -> Lab
            r1.LIZIZ(r0)     // Catch: java.lang.Exception -> Lab
            X.0EgU r0 = r7.LLILLL     // Catch: java.lang.Exception -> Lab
            android.util.Size r0 = r0.LL     // Catch: java.lang.Exception -> Lab
            int r0 = r0.getHeight()     // Catch: java.lang.Exception -> Lab
            r1.LIZ(r0)     // Catch: java.lang.Exception -> Lab
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> Lab
            r1.LIZJ = r0     // Catch: java.lang.Exception -> Lab
            X.0Eg7 r0 = new X.0Eg7     // Catch: java.lang.Exception -> Lab
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lab
            r7.LL = r2     // Catch: java.lang.Exception -> Lab
            r7.LLILLJJLI = r4     // Catch: java.lang.Exception -> Lab
            java.lang.Object r8 = X.C383660F2m.LIZIZ(r6, r5, r0, r7)     // Catch: java.lang.Exception -> Lab
            if (r8 != r3) goto L9c
            goto Lae
        L9c:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Exception -> La8
            if (r8 == 0) goto L44
            X.0EgU r1 = r7.LLILLL     // Catch: java.lang.Exception -> La8
            X.0EgK r0 = r2.LIZ     // Catch: java.lang.Exception -> La8
            r1.LIZ(r0, r8)     // Catch: java.lang.Exception -> La8
            goto L44
        La8:
            r0 = move-exception
            goto L24
        Lab:
            r0 = move-exception
            goto L24
        Lae:
            java.lang.String r0 = "VideoFrameCache@ba6a.executeLoadFromFile$1"
            X.C1C7U.LIZIZ(r0)
            return r3
        Lb4:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370700Eg8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
