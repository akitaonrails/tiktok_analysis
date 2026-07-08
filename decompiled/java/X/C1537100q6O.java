package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.SoftReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q6O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537100q6O extends C09AY implements Function1<InterfaceC1540940qCa, Unit> {
    public final /* synthetic */ C1537070q6L LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1537480q70 LLILZ;
    public final /* synthetic */ C1051630dTN LLILZIL;
    public final /* synthetic */ Boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537100q6O(C1537070q6L c1537070q6L, String str, String str2, C1537480q70 c1537480q70, C1051630dTN c1051630dTN, Boolean bool) {
        super(1);
        this.LL = c1537070q6L;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = c1537480q70;
        this.LLILZIL = c1051630dTN;
        this.LLILZLL = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1540940qCa interfaceC1540940qCa) {
        String str;
        AbstractC1537120q6Q abstractC1537120q6Q;
        final InterfaceC1540940qCa interfaceC1540940qCa2 = interfaceC1540940qCa;
        if (interfaceC1540940qCa2 != null) {
            C1051630dTN c1051630dTN = this.LLILZIL;
            String str2 = this.LLILLJJLI;
            C1537480q70 c1537480q70 = this.LLILZ;
            Boolean bool = this.LLILZLL;
            String str3 = this.LLILLL;
            interfaceC1540940qCa2.setOptimization(2);
            interfaceC1540940qCa2.setKeepAlive(c1051630dTN.LIZLLL);
            CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>> copyOnWriteArrayList = c1051630dTN.LJIIJ.get(str2);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.add(0, new SoftReference<>(interfaceC1540940qCa2));
            }
            interfaceC1540940qCa2.U0(C2097908Jt.LIZJ(new Pair("usePreload", "1")));
            if (!c1051630dTN.LJ) {
                if (c1051630dTN.LJIILIIL) {
                    interfaceC1540940qCa2.LJIIIIZZ();
                } else {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0eJe
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PreloadTool$Companion@21ce.createPreloadView$1$1$4$1$1");
                            try {
                                interfaceC1540940qCa2.LJIIIIZZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PreloadTool$Companion@21ce.createPreloadView$1$1$4$1$1");
                        }
                    });
                }
            }
            if (c1537480q70 != null && (abstractC1537120q6Q = (AbstractC1537120q6Q) c1537480q70.LJFF(AbstractC1537120q6Q.class)) != null) {
                do {
                    abstractC1537120q6Q.LIZJ();
                    abstractC1537120q6Q = abstractC1537120q6Q.LL;
                } while (abstractC1537120q6Q != null);
            }
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                str = "jsb";
            } else {
                str = "native";
            }
            C1520080pew.LJFF(null, "container_prerender", "prerender", str, str2, str3, C1541030qCj.LIZ(str3), null, 129);
        }
        C1537070q6L c1537070q6L = this.LL;
        if (c1537070q6L != null) {
            c1537070q6L.LIZLLL(this.LLILLJJLI, this.LLILLL, (InterfaceC1105930esx) interfaceC1540940qCa2);
        }
        return Unit.LIZ;
    }
}
