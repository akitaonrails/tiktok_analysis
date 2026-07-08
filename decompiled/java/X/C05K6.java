package X;

import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05K6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05K6 {
    public static final void LIZ(RootPanelComponent rootPanelComponent, Function1<? super C05K2, Unit> function1) {
        C05K5 c05k5 = rootPanelComponent.LLJJIJIL;
        if (c05k5 != null) {
            AbstractC1334105Jz<BasePanelUIComponent, C2189821An6> abstractC1334105Jz = new AbstractC1334105Jz<BasePanelUIComponent, C2189821An6>() { // from class: X.05K2
            };
            function1.invoke(abstractC1334105Jz);
            C1333305Jr<InterfaceC1565950qqv, C2189821An6> c1333305Jr = c05k5.LIZ;
            if (c1333305Jr != null) {
                c1333305Jr.LIZJ.put(abstractC1334105Jz.LIZ(), abstractC1334105Jz);
            }
        }
    }
}
