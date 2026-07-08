package X;

import android.content.Context;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AWy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180901AWy extends C2180891AWx {
    public final C1AXO LLJLIL;
    public final C1AYR LLJLILLLLZIIL;
    public final InterfaceC969450bKp LLJLL;

    public final void LJJ() {
        SurfaceView surfaceView;
        final Layout layoutLIZ = this.LLJLIL.LIZ(true);
        if (layoutLIZ == null) {
            return;
        }
        int iLIZIZ = this.LLJLIL.LIZIZ(layoutLIZ);
        if (iLIZIZ > 0) {
            HandlerHook.viewPost(this, new Runnable() { // from class: X.1AEz
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LayoutViewV2@2f4f.updateWindow$1");
                    try {
                        this.LL.LJFF(layoutLIZ);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LayoutViewV2@2f4f.updateWindow$1");
                }
            });
        } else {
            getPath().reset();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getWindowList());
        getWindowList().clear();
        int iMax = Math.max(arrayList.size(), iLIZIZ);
        if (iMax > iLIZIZ) {
            for (int i = iLIZIZ; i < iMax; i++) {
                LJIIZILJ((C2180911AWz) ListProtector.get(arrayList, i));
                SurfaceView surfaceView2 = ((C2180911AWz) ListProtector.get(arrayList, i)).LIZJ.LIZ.LIZLLL;
                if (surfaceView2 != null) {
                    C500260Jjc.LJJJLL(surfaceView2);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1AXI c1axi = ((C2180911AWz) it2.next()).LIZJ.LIZ;
            if (c1axi.LJIIIIZZ && (surfaceView = c1axi.LIZLLL) != null) {
                C500260Jjc.LJJJLL(surfaceView);
            }
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i2 = iLIZIZ - 1; -1 < i2; i2--) {
            if (LJIJJLI(i2, this.LLJLILLLLZIIL.LJIILIIL(i2), layoutLIZ, arrayList)) {
                Iterator<C2180911AWz> it3 = getWindowList().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C2180911AWz next = it3.next();
                        if (next.LIZ == i2) {
                            if (next != null) {
                                arrayList2.add(next);
                            }
                        }
                    }
                }
            }
        }
        Collection<? extends C2180911AWz> collectionLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0qhD
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Integer.valueOf(((C2180911AWz) t).LIZ), Integer.valueOf(((C2180911AWz) t2).LIZ));
            }
        }, getWindowList());
        getWindowList().clear();
        getWindowList().addAll(collectionLJLLLL);
        HandlerHook.viewPost(this, new Runnable() { // from class: X.1AX6
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LayoutViewV2@2f4f.updateWindow$5");
                try {
                    this.LL.LLJLL.LJJLIIIJLLLLLLLZ(arrayList2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LayoutViewV2@2f4f.updateWindow$5");
            }
        });
    }

    @Override // X.C2180891AWx
    public final void LJIIJJI(C1AYQ c1ayq, Function1<? super String, C1AYF> function1) {
        if (c1ayq instanceof C1AYJ) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1AXC(this));
            LJJ();
            if (getParent() != null) {
                HandlerHook.viewPost(this, new Runnable() { // from class: X.1AX7
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LayoutViewV2@2f4f.invoke$2$1");
                        try {
                            this.LL.LLJLL.LJJJI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LayoutViewV2@2f4f.invoke$2$1");
                    }
                });
                return;
            }
            return;
        }
        if (c1ayq instanceof C1AYI) {
            C500260Jjc.LJJLIIIJILLIZJL(new C1AX0(this, function1));
            return;
        }
        throw new C1954807lC();
    }

    public final void LJIL(SurfaceView surfaceView, int i) {
        if (surfaceView == null) {
            return;
        }
        C500260Jjc.LJJJLL(surfaceView);
        if (this.LLIZ.LJII() && i == 0) {
            LJIJ(0, surfaceView, getRenderLayer());
        } else {
            surfaceView.setZOrderMediaOverlay(true);
            LJIJ(-1, surfaceView, getRenderLayer());
        }
    }

    @Override // X.C2180891AWx, kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Unit invoke(C1AYQ c1ayq, Function1<? super String, ? extends C1AYF> function1) {
        LJIIJJI(c1ayq, function1);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJLI(int r31, int r32, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout r33, java.util.List<X.C2180911AWz> r34) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2180901AWy.LJIJJLI(int, int, com.bytedance.android.livesdk.comp.api.linkcore.model.Layout, java.util.List):boolean");
    }

    public C2180901AWy(C1AXO c1axo, C1AYR c1ayr, Context context, C1AXQ c1axq, String str, C969020bK8 c969020bK8, LayoutSlardarMonitor layoutSlardarMonitor) {
        super(c1axo, c1ayr, context, c1axq, str, c969020bK8, layoutSlardarMonitor);
        this.LLJLIL = c1axo;
        this.LLJLILLLLZIIL = c1ayr;
        this.LLJLL = c969020bK8;
    }
}
