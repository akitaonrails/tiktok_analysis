package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLayoutLayer;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicBindLayerWithLock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Ccn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234391Ccn extends C09AY implements Function1<LinkMicCrossLinker, Unit> {
    public final /* synthetic */ InterfaceC2235471CeX LL;
    public final /* synthetic */ C2234371Ccl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234391Ccn(InterfaceC2235471CeX interfaceC2235471CeX, C2234371Ccl c2234371Ccl) {
        super(1);
        this.LL = interfaceC2235471CeX;
        this.LLILLJJLI = c2234371Ccl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LinkMicCrossLinker linkMicCrossLinker) {
        if (LinkMicBindLayerWithLock.INSTANCE.enable()) {
            InterfaceC2235471CeX interfaceC2235471CeX = this.LL;
            C2234371Ccl c2234371Ccl = this.LLILLJJLI;
            synchronized (interfaceC2235471CeX) {
                try {
                    c2234371Ccl.getClass();
                    LinkMicLayoutLayer linkMicLayoutLayerLLILLJJLI = interfaceC2235471CeX.LLILLJJLI();
                    if (linkMicLayoutLayerLLILLJJLI != null && !interfaceC2235471CeX.isDestroyed()) {
                        C2231651CWd.LIZ(null, c2234371Ccl.LIZ, linkMicLayoutLayerLLILLJJLI);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            C2234371Ccl c2234371Ccl2 = this.LLILLJJLI;
            InterfaceC2235471CeX interfaceC2235471CeX2 = this.LL;
            c2234371Ccl2.getClass();
            LinkMicLayoutLayer linkMicLayoutLayerLLILLJJLI2 = interfaceC2235471CeX2.LLILLJJLI();
            if (linkMicLayoutLayerLLILLJJLI2 != null && !interfaceC2235471CeX2.isDestroyed()) {
                C2231651CWd.LIZ(null, c2234371Ccl2.LIZ, linkMicLayoutLayerLLILLJJLI2);
            }
        }
        return Unit.LIZ;
    }
}
