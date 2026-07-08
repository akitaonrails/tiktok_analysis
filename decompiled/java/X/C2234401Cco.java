package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicBindLayerWithLock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234401Cco extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC2235471CeX LL;
    public final /* synthetic */ C2234651CdD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234401Cco(InterfaceC2235471CeX interfaceC2235471CeX, C2234651CdD c2234651CdD) {
        super(0);
        this.LL = interfaceC2235471CeX;
        this.LLILLJJLI = c2234651CdD;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (LinkMicBindLayerWithLock.INSTANCE.enable()) {
            InterfaceC2235471CeX interfaceC2235471CeX = this.LL;
            C2234651CdD c2234651CdD = this.LLILLJJLI;
            synchronized (interfaceC2235471CeX) {
                try {
                    c2234651CdD.getClass();
                    LinkMicLayoutLayer linkMicLayoutLayerLLILLJJLI = interfaceC2235471CeX.LLILLJJLI();
                    if (linkMicLayoutLayerLLILLJJLI != null && !interfaceC2235471CeX.isDestroyed()) {
                        C2231651CWd.LIZ(c2234651CdD.LIZ, null, linkMicLayoutLayerLLILLJJLI);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            C2234651CdD c2234651CdD2 = this.LLILLJJLI;
            InterfaceC2235471CeX interfaceC2235471CeX2 = this.LL;
            c2234651CdD2.getClass();
            LinkMicLayoutLayer linkMicLayoutLayerLLILLJJLI2 = interfaceC2235471CeX2.LLILLJJLI();
            if (linkMicLayoutLayerLLILLJJLI2 != null && !interfaceC2235471CeX2.isDestroyed()) {
                C2231651CWd.LIZ(c2234651CdD2.LIZ, null, linkMicLayoutLayerLLILLJJLI2);
            }
        }
        return Unit.LIZ;
    }
}
