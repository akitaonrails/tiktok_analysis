package X;

import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05K5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05K5 {
    public final C1333305Jr<InterfaceC1565950qqv, C2189821An6> LIZ;

    public C05K5(C1333305Jr c1333305Jr) {
        this.LIZ = c1333305Jr;
    }

    public final void LIZ(Function1<? super C05K3, Unit> function1) {
        C05K0<BasePanelComponent, C2189821An6> c05k0 = new C05K0<BasePanelComponent, C2189821An6>() { // from class: X.05K3
        };
        function1.invoke(c05k0);
        C1333305Jr<InterfaceC1565950qqv, C2189821An6> c1333305Jr = this.LIZ;
        if (c1333305Jr != null) {
            c1333305Jr.LIZJ.put(c05k0.LIZ(), c05k0);
        }
    }
}
