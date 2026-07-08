package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {60, BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1373805Zg extends C09AW implements Function2<C05ZT, InterfaceC1364105Vn<? super Unit>, Object> {
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ InterfaceC1631630sYr<C1378605aS, C1378605aS, Float, Float, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1373805Zg(boolean z, InterfaceC1631630sYr<? super C1378605aS, ? super C1378605aS, ? super Float, ? super Float, Unit> interfaceC1631630sYr, InterfaceC1364105Vn<? super C1373805Zg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = z;
        this.LLJIJIL = interfaceC1631630sYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1373805Zg c1373805Zg = new C1373805Zg(this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1373805Zg.LLJ = obj;
        return c1373805Zg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r18 = X.C1374005Zi.LJFF(r12);
        r17 = X.C1374005Zi.LJ(r12);
        r4 = X.C1374005Zi.LIZLLL(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r8 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        r1 = r1 * r18;
        r0 = r0 + r17;
        r2 = X.C1378605aS.LJI(r2, r4);
        r8 = X.C1374005Zi.LIZJ(r12, false);
        r14 = java.lang.Math.abs(1 - r1) * r8;
        r8 = java.lang.Math.abs(((3.1415927f * r0) * r8) / 180.0f);
        r7 = X.C1378605aS.LIZLLL(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0080, code lost:
    
        if (r14 > r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        if (r8 > r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (r7 > r9) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        r7 = r12.LIZ;
        r6 = r7.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        if (r5 >= r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (((X.C20066813fO) com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)).LIZLLL != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        if (r19.LLJI == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r8 >= r9) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ab, code lost:
    
        r14 = X.C1374005Zi.LIZIZ(r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        if (r10 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        r17 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        if (r18 != 1.0f) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (X.C1378605aS.LIZJ(r4, 0) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        r19.LLJIJIL.invoke(new X.C1378605aS(r14), new X.C1378605aS(r4), X.C2286608xc.LIZLLL(r18), X.C2286608xc.LIZLLL(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        r4 = r12.LIZ;
        r17 = r4.size();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        if (r14 >= r17) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r15 = (X.C20066813fO) com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fb, code lost:
    
        if ((!X.C1378605aS.LIZJ(X.C05ZS.LJ(r15, false), 0)) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
    
        r15.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (r17 != 0.0f) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0109, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004b A[EDGE_INSN: B:63:0x004b->B:12:0x004b BREAK  A[LOOP:0: B:8:0x003a->B:11:0x0048], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0179 -> B:7:0x0031). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1373805Zg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C05ZT c05zt, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c05zt, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
