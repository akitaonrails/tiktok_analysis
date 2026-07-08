package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234691CdH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2234651CdD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234691CdH(C2234651CdD c2234651CdD) {
        super(0);
        this.LL = c2234651CdD;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x001b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // kotlin.jvm.functions.Function0
    public final kotlin.Unit invoke() {
        /*
            r4 = this;
            X.1CdD r1 = r4.LL
            r0 = 1
            r1.LIZJ = r0
            X.1CdD r0 = r4.LL
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicMultiLinker r3 = r0.LIZ
            r2 = 0
            r3.LJJJJJL()     // Catch: java.lang.Throwable -> L13
            X.C1306420k6K.LIZ(r3, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L13:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L1b
            throw r1     // Catch: java.lang.Throwable -> L18
        L18:
            r0 = move-exception
            r2 = r1
            goto L1c
        L1b:
            r0 = move-exception
        L1c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L1b
            X.C1306420k6K.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234691CdH.invoke():java.lang.Object");
    }
}
