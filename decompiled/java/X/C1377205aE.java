package X;

import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05aE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vision.PhotoSearchBitmapUtilKt$fetchBitmapAsync$1", f = "PhotoSearchBitmapUtil.kt", l = {78, 83}, m = "invokeSuspend")
public final class C1377205aE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Uri LLILZ;
    public final /* synthetic */ InterfaceC1631630sYr<InterfaceC497601wk, Bitmap, Long, InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Function1<Long, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1377205aE(boolean z, Uri uri, InterfaceC1631630sYr<? super InterfaceC497601wk, ? super Bitmap, ? super Long, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, long j, Function1<? super Long, Unit> function1, InterfaceC1364105Vn<? super C1377205aE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = uri;
        this.LLILZIL = interfaceC1631630sYr;
        this.LLILZLL = j;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1377205aE c1377205aE = new C1377205aE(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1377205aE.LLILLJJLI = obj;
        return c1377205aE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to X.05aE for r9v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "PhotoSearchBitmapUtilKt@ccbe.fetchBitmapAsync$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L3c
            if (r0 != r7) goto L74
            X.C155000ia.LIZIZ(r10)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r5 = r9.LLILLJJLI
            boolean r0 = r9.LLILLL
            if (r0 == 0) goto L35
            android.net.Uri r0 = r9.LLILZ
            r9.LLILLJJLI = r5
            r9.LL = r1
            java.lang.Object r10 = X.C1325290kal.LJ(r0, r9)
            if (r10 != r6) goto L41
            X.C1C7U.LIZIZ(r8)
            return r6
        L35:
            android.net.Uri r0 = r9.LLILZ
            android.graphics.Bitmap r10 = X.C1325290kal.LJFF(r0)
            goto L41
        L3c:
            java.lang.Object r5 = r9.LLILLJJLI
            X.C155000ia.LIZIZ(r10)
        L41:
            if (r10 == 0) goto L61
            X.0sYr<X.01wk, android.graphics.Bitmap, java.lang.Long, X.05Vn<? super kotlin.Unit>, java.lang.Object> r4 = r9.LLILZIL
            if (r4 == 0) goto L16
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r9.LLILZLL
            long r2 = r2 - r0
            java.lang.Long r1 = X.C2286608xc.LJFF(r2)
            r0 = 0
            r9.LLILLJJLI = r0
            r9.LL = r7
            java.lang.Object r0 = r4.invoke(r5, r10, r1, r9)
            if (r0 != r6) goto L16
            X.C1C7U.LIZIZ(r8)
            return r6
        L61:
            kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> r4 = r9.LLIZ
            if (r4 == 0) goto L16
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r9.LLILZLL
            long r2 = r2 - r0
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r4.invoke(r0)
            goto L16
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1377205aE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
