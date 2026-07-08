package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutPipelineStartRunnable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308540k9k extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LinkMicLayoutPipelineStartRunnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308540k9k(LinkMicLayoutPipelineStartRunnable linkMicLayoutPipelineStartRunnable) {
        super(0);
        this.LL = linkMicLayoutPipelineStartRunnable;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x0014
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // kotlin.jvm.functions.Function0
    public final kotlin.Unit invoke() {
        /*
            r4 = this;
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutPipelineStartRunnable r3 = r4.LL
            r2 = 0
            r3.LIZIZ()     // Catch: java.lang.Throwable -> Lc
            X.C1306420k6K.LIZ(r3, r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lc:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L14
            throw r1     // Catch: java.lang.Throwable -> L11
        L11:
            r0 = move-exception
            r2 = r1
            goto L15
        L14:
            r0 = move-exception
        L15:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L14
            X.C1306420k6K.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1308540k9k.invoke():java.lang.Object");
    }
}
