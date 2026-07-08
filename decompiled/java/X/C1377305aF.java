package X;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05aF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vision.PhotoSearchBitmapUtilKt$fetchByteArray$2", f = "PhotoSearchBitmapUtil.kt", l = {104, 106}, m = "invokeSuspend")
public final class C1377305aF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ InterfaceC1631630sYr<InterfaceC497601wk, byte[], Long, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Function1<Long, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1377305aF(Uri uri, Bitmap bitmap, InterfaceC1631630sYr<? super InterfaceC497601wk, ? super byte[], ? super Long, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, long j, Function1<? super Long, Unit> function1, InterfaceC1364105Vn<? super C1377305aF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = uri;
        this.LLILZ = bitmap;
        this.LLILZIL = interfaceC1631630sYr;
        this.LLILZLL = j;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1377305aF c1377305aF = new C1377305aF(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1377305aF.LLILLJJLI = obj;
        return c1377305aF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.05aF for r10v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "PhotoSearchBitmapUtilKt@ccbe.fetchByteArray$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LL
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L33
            if (r0 != r7) goto L6d
            X.C155000ia.LIZIZ(r11)
        L16:
            kotlin.Unit r6 = kotlin.Unit.LIZ
        L18:
            X.C1C7U.LIZIZ(r9)
            return r6
        L1c:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r5 = r10.LLILLJJLI
            android.net.Uri r1 = r10.LLILLL
            android.graphics.Bitmap r0 = r10.LLILZ
            r10.LLILLJJLI = r5
            r10.LL = r2
            java.lang.Object r11 = X.C1325290kal.LJI(r1, r0)
            if (r11 != r8) goto L38
            X.C1C7U.LIZIZ(r9)
            return r8
        L33:
            java.lang.Object r5 = r10.LLILLJJLI
            X.C155000ia.LIZIZ(r11)
        L38:
            r6 = 0
            if (r11 == 0) goto L58
            X.0sYr<X.01wk, byte[], java.lang.Long, X.05Vn<? super kotlin.Unit>, java.lang.Object> r4 = r10.LLILZIL
            if (r4 == 0) goto L18
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r10.LLILZLL
            long r2 = r2 - r0
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r10.LLILLJJLI = r6
            r10.LL = r7
            java.lang.Object r0 = r4.invoke(r5, r11, r0, r10)
            if (r0 != r8) goto L16
            X.C1C7U.LIZIZ(r9)
            return r8
        L58:
            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r4 = r10.LLIZ
            if (r4 == 0) goto L18
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r10.LLILZLL
            long r2 = r2 - r0
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r4.invoke(r0)
            kotlin.Unit r6 = kotlin.Unit.LIZ
            goto L18
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1377305aF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
