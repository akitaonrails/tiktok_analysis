package X;

import com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08of, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene$initView$3", f = "EPAICreateSelectMaterialScene.kt", l = {457, 460, 472}, m = "invokeSuspend")
public final class C2231108of extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EPAICreateSelectMaterialScene LLILLL;
    public final /* synthetic */ InterfaceC1292040jj8<Throwable> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2231108of(String str, EPAICreateSelectMaterialScene ePAICreateSelectMaterialScene, InterfaceC1292040jj8<Throwable> interfaceC1292040jj8, InterfaceC1364105Vn<? super C2231108of> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = ePAICreateSelectMaterialScene;
        this.LLILZ = interfaceC1292040jj8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2231108of(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0076
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "EPAICreateSelectMaterialScene@65c4.initView$3"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LL
            r6 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L31
            if (r0 == r5) goto L95
            if (r0 == r6) goto L95
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r15)
            X.08qU r1 = X.C2242408qU.LIZ
            java.lang.String r0 = r14.LLILLJJLI
            r14.LL = r2
            java.lang.Object r1 = r1.LJ(r0, r14)
            if (r1 != r3) goto L3a
            X.C1C7U.LIZIZ(r7)
            return r3
        L31:
            X.C155000ia.LIZIZ(r15)
            X.00o6 r15 = (X.C189200o6) r15
            java.lang.Object r1 = r15.m10unboximpl()
        L3a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            r4 = 0
            if (r0 == 0) goto L42
            r1 = r4
        L42:
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L7e
            X.0VSP r2 = new X.0VSP
            r2.<init>(r1)
            byte[] r11 = X.C2106208My.LIZIZ(r2)     // Catch: java.lang.Throwable -> L6e
            X.C2107108Nh.LIZ(r2, r4)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.08og r8 = new X.08og
            com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene r9 = r14.LLILLL
            X.0jj8<java.lang.Throwable> r10 = r14.LLILZ
            java.lang.String r12 = r14.LLILLJJLI
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r14.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r14, r0, r8)
            if (r0 != r3) goto L98
            X.C1C7U.LIZIZ(r7)
            return r3
        L6e:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L76
            throw r1     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
            r4 = r1
            goto L77
        L76:
            r0 = move-exception
        L77:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L76
            X.C2107108Nh.LIZ(r2, r4)
            throw r0
        L7e:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.08oe r1 = new X.08oe
            com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene r0 = r14.LLILLL
            r1.<init>(r0, r4)
            r14.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r14, r2, r1)
            if (r0 != r3) goto L98
            X.C1C7U.LIZIZ(r7)
            return r3
        L95:
            X.C155000ia.LIZIZ(r15)
        L98:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2231108of.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
