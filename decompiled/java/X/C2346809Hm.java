package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.VideoModeUtils$resizeBitmapForVideoMode$1$1", f = "VideoModeUtils.kt", l = {}, m = "invokeSuspend")
public final class C2346809Hm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Pair<Integer, Integer> LLILZIL;
    public final /* synthetic */ ConcurrentHashMap<String, Integer> LLILZLL;
    public final /* synthetic */ ConcurrentHashMap<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2346809Hm(String str, int i, String str2, int i2, Pair<Integer, Integer> pair, ConcurrentHashMap<String, Integer> concurrentHashMap, ConcurrentHashMap<String, String> concurrentHashMap2, InterfaceC1364105Vn<? super C2346809Hm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = i2;
        this.LLILZIL = pair;
        this.LLILZLL = concurrentHashMap;
        this.LLIZ = concurrentHashMap2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2346809Hm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            java.lang.String r16 = "VideoModeUtils@afd2.resizeBitmapForVideoMode$1$1"
            X.C1C7U.LIZ(r16)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r18)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r7 = r17
            java.lang.String r0 = r7.LL
            r1.append(r0)
            int r0 = r7.LLILLJJLI
            r1.append(r0)
            java.lang.String r0 = ".bmp"
            java.lang.String r0 = X.C1449640npK.LIZ(r0)
            r1.append(r0)
            java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = r7.LLILLL
            int r1 = r7.LLILZ
            kotlin.Pair<java.lang.Integer, java.lang.Integer> r0 = r7.LLILZIL
            java.lang.String r5 = X.C2347109Hp.LIZ(r2, r6, r1, r0)
            java.lang.String r4 = r7.LLILLL
            if (r5 == 0) goto L9f
            int[] r15 = X.C2475309mx.LIZJ(r5)
            r14 = 0
            if (r15 == 0) goto L9d
            r13 = 1
            r0 = r15[r13]
            double r2 = (double) r0
            r0 = r15[r14]
            double r0 = (double) r0
            r11 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r9 = r0 * r11
            int r8 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r8 <= 0) goto L7f
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r4)
            if (r0 == 0) goto L7d
            r8 = r4
        L56:
            r3 = r15[r14]
            double r1 = (double) r3
            double r1 = r1 * r11
            int r0 = (int) r1
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG
            r12 = 1
            r9 = r6
            r10 = r3
            r11 = r0
            boolean r0 = X.C2347109Hp.LIZJ(r8, r9, r10, r11, r12, r13)
        L65:
            if (r0 == 0) goto L9d
        L67:
            if (r4 != 0) goto L6b
            java.lang.String r4 = ""
        L6b:
            X.C573990MfF.LIZLLL(r4, r6)
            if (r6 == 0) goto L9f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r7.LLIZ
            java.lang.String r0 = r7.LLILLL
            r1.put(r0, r6)
        L77:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r16)
            return r0
        L7d:
            r8 = r6
            goto L56
        L7f:
            double r2 = r2 * r11
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L9d
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r4)
            if (r0 == 0) goto L9b
            r8 = r4
        L8b:
            r3 = r15[r13]
            double r1 = (double) r3
            double r1 = r1 * r11
            int r0 = (int) r1
            r12 = 1
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.JPEG
            r9 = r6
            r10 = r0
            r11 = r3
            boolean r0 = X.C2347109Hp.LIZJ(r8, r9, r10, r11, r12, r13)
            goto L65
        L9b:
            r8 = r6
            goto L8b
        L9d:
            r6 = r5
            goto L67
        L9f:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r2 = r7.LLILZLL
            java.lang.String r1 = r7.LLILLL
            int r0 = r7.LLILLJJLI
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r2.put(r1, r0)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2346809Hm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
