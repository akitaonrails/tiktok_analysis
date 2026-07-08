package X;

import android.view.Surface;
import android.widget.FrameLayout;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: renamed from: X.0yEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849890yEt {
    public final FrameLayout LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(28));
    public final C1482560ogQ LIZJ;
    public final C1849900yEu LIZLLL;

    public final InterfaceC1484830ok5 LIZ() {
        return (InterfaceC1484830ok5) this.LIZIZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0yEu] */
    public C1849890yEt(FrameLayout frameLayout, String str) {
        this.LIZ = frameLayout;
        C1482580ogS c1482580ogS = new C1482580ogS();
        c1482580ogS.LIZ = str;
        C1058540deW c1058540deW = new C1058540deW(c1482580ogS);
        c1058540deW.LIZIZ(str);
        C1482580ogS c1482580ogSLIZ = c1058540deW.LIZ();
        c1482580ogSLIZ.getClass();
        this.LIZJ = new C1484680ojq(c1482580ogSLIZ).LIZ();
        this.LIZLLL = new InterfaceC1483820oiS() { // from class: X.0yEu
            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ boolean bn() {
                return true;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ InterfaceC1473950oSX getCustomSurfaceLifecycleListener() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ Surface getSurface() {
                return null;
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void hj() {
            }

            @Override // X.InterfaceC1483820oiS
            public final /* synthetic */ void pe() {
            }

            @Override // X.InterfaceC1483820oiS
            public final HashMap getParams() {
                return new HashMap();
            }

            @Override // X.InterfaceC1483820oiS
            public final FrameLayout getPlayViewContainer() {
                return this.LL.LIZ;
            }
        };
    }
}
