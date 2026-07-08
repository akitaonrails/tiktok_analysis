package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM$sendRequest$3", f = "PhotoSearchBaseVM.kt", l = {312, 322}, m = "invokeSuspend")
public final class C676130Qfb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C676120Qfa LLILLL;
    public final /* synthetic */ PhotoSearchBaseVM LLILZ;
    public final /* synthetic */ C676050QfT LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Function1<C676050QfT, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C676130Qfb(C676120Qfa c676120Qfa, PhotoSearchBaseVM photoSearchBaseVM, C676050QfT c676050QfT, long j, Function1<? super C676050QfT, Unit> function1, InterfaceC1364105Vn<? super C676130Qfb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c676120Qfa;
        this.LLILZ = photoSearchBaseVM;
        this.LLILZIL = c676050QfT;
        this.LLILZLL = j;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C676130Qfb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            r19 = this;
            r10 = r20
            java.lang.String r11 = "PhotoSearchBaseVM@68d3.sendRequest$3"
            X.C1C7U.LIZ(r11)
            java.lang.Object r4 = X.C099R.LJFF()
            r5 = r19
            int r0 = r5.LLILLJJLI
            r3 = 2
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L21
            if (r0 == r9) goto L74
            if (r0 != r3) goto Lbf
            X.C155000ia.LIZIZ(r10)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L21:
            X.C155000ia.LIZIZ(r10)
            X.09JS r1 = X.C09JS.LIZ
            X.0Qfa r0 = r5.LLILLL
            if (r0 == 0) goto L65
            X.0Qg3 r0 = r0.LIZIZ
            if (r0 == 0) goto L65
            java.lang.String r0 = ""
        L30:
            r1.getClass()
            java.lang.String r0 = X.C09JS.LIZ(r0)
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            X.0Qfa r0 = r5.LLILLL
            if (r0 == 0) goto L63
            X.0Qg3 r1 = r0.LIZIZ
            if (r1 == 0) goto L63
            android.graphics.Bitmap r0 = r1.LIZJ
            if (r0 == 0) goto L63
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L63
            android.graphics.Bitmap r0 = r1.LIZJ
        L4f:
            long r6 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L67
            r5.LL = r6
            r5.LLILLJJLI = r9
            java.lang.Object r10 = X.C1325290kal.LJI(r2, r0)
            if (r10 != r4) goto L79
            X.C1C7U.LIZIZ(r11)
            return r4
        L63:
            r0 = r8
            goto L4f
        L65:
            r0 = r8
            goto L30
        L67:
            android.graphics.Bitmap r0 = X.C1325290kal.LJFF(r2)
            if (r0 == 0) goto L72
            byte[] r10 = X.C1325290kal.LIZLLL(r0)
            goto L7b
        L72:
            r10 = r8
            goto L7b
        L74:
            long r6 = r5.LL
            X.C155000ia.LIZIZ(r10)
        L79:
            byte[] r10 = (byte[]) r10
        L7b:
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r0 = r5.LLILZ
            com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime r0 = r0.LLJI
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceLogParams r2 = r0.logParams
            if (r2 == 0) goto L91
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r6
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r2.setImageCompressCost(r0)
        L91:
            X.0QfT r0 = r5.LLILZIL
            if (r10 == 0) goto L99
            com.bytedance.retrofit2.mime.TypedByteArray r8 = X.C2365409Oq.LIZIZ(r10)
        L99:
            r0.setImage(r8)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Qfd r12 = new X.0Qfd
            com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM r13 = r5.LLILZ
            long r14 = r5.LLILZLL
            kotlin.jvm.functions.Function1<X.0QfT, kotlin.Unit> r1 = r5.LLIZ
            X.0QfT r0 = r5.LLILZIL
            r18 = 0
            r16 = r1
            r17 = r0
            r12.<init>(r13, r14, r16, r17, r18)
            r5.LLILLJJLI = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r2, r12)
            if (r0 != r4) goto L1b
            X.C1C7U.LIZIZ(r11)
            return r4
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C676130Qfb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
