package Y;

import X.AbstractC21321718cJ;
import X.AbstractC21333318eB;
import X.AbstractC214793194d;
import X.AnonymousClass1951;
import X.AnonymousClass1954;
import X.C01GW;
import X.C1337880kv4;
import X.C1447810nmN;
import X.C18007073l;
import X.C18072075y;
import X.C195C;
import X.C195I;
import X.C195Z;
import X.C19A8;
import X.C1C7U;
import X.C21322218cO;
import X.C21322518cR;
import X.C21328418dO;
import X.C21329018dU;
import X.C21329418dY;
import X.C21497819Bg;
import X.C786410Ut5;
import X.InterfaceC214796194g;
import X.InterfaceC214797194h;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.tiktok.myna.render.render.MynaElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS40S0400000_32 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C01GW c01gw = C18072075y.LIZ;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            C195Z.LJ((View) this.l0);
            C195Z.LJ((View) this.l1);
        }
        if (!((C195I) this.l3).LIZLLL) {
            if (!((Boolean) c01gw.getValue()).booleanValue()) {
                C195Z.LJ((View) this.l0);
                C195Z.LJ((View) this.l1);
            }
            ((C195I) this.l3).LIZ.getOverlay().remove((View) this.l0);
        }
        C18007073l.LIZ((View) this.l0);
        ((Runnable) this.l2).run();
    }

    public final void LIZ$1() {
        AbstractC21333318eB abstractC21333318eB = (AbstractC21333318eB) this.l1;
        C1337880kv4 c1337880kv4 = (C1337880kv4) this.l2;
        abstractC21333318eB.getClass();
        int i = c1337880kv4.LIZIZ;
        float width = i != 1 ? i != 2 ? (abstractC21333318eB.getView().getWidth() * 1.0f) / 2 : (c1337880kv4.LIZ / 100) * abstractC21333318eB.LLILZLL.getLayoutWidth() : c1337880kv4.LIZ;
        AbstractC21333318eB abstractC21333318eB2 = (AbstractC21333318eB) this.l1;
        C1337880kv4 c1337880kv42 = (C1337880kv4) this.l3;
        abstractC21333318eB2.getClass();
        int i2 = c1337880kv42.LIZIZ;
        abstractC21333318eB.LJLIIL(width, i2 != 1 ? i2 != 2 ? (abstractC21333318eB2.getView().getHeight() * 1.0f) / 2 : abstractC21333318eB2.LLILZLL.getLayoutHeight() * (c1337880kv42.LIZ / 100) : c1337880kv42.LIZ);
    }

    public final void LIZ$2() {
        C195Z.LJ((View) this.l0);
        C195Z.LJ((View) this.l1);
        C195C c195c = (C195C) this.l2;
        if (c195c.LIZLLL) {
            C786410Ut5.LJLLLLLL(4, (View) this.l0);
            ((View) this.l0).clearAnimation();
        } else {
            c195c.LIZ.getOverlay().remove((View) this.l0);
        }
        ((Runnable) this.l3).run();
    }

    public final void LIZ$3() {
        C21322218cO.LIZ.getClass();
        C21329418dY.LIZJ((C21328418dO) C21322218cO.LJ.getValue(), (MynaElement) this.l0, (C21329018dU) this.l1, new AwS646S0100000_32((AbstractC21321718cJ) this.l2, 31), new AwS611S0100000_32((C21322518cR) this.l3, 372));
    }

    public final void LIZ$4() {
        ((NavigationScene) this.l0).LLLLLLZ(false);
        ((NavigationScene) this.l0).LLLF = false;
        ((InterfaceC214796194g) this.l1).LIZ(Boolean.FALSE);
        ((Runnable) this.l2).run();
        Runnable runnable = ((AbstractC214793194d) this.l3).LIZIZ;
        if (runnable != null) {
            runnable.run();
        }
        List<InterfaceC214797194h> list = ((AbstractC214793194d) this.l3).LIZJ;
        if (list != null) {
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC214797194h) it2.next()).LIZ();
            }
        }
    }

    public static final void run$0(ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        boolean zLIZ;
        C1C7U.LIZ("NavigationSceneManager$PushOptionOperation@de9f.execute$2");
        try {
            C21497819Bg c21497819Bg = ((C19A8) aRunnableS40S0400000_32.l3).LJ.LJII;
            ((ArrayList) c21497819Bg.LIZ).remove((C1447810nmN) aRunnableS40S0400000_32.l0);
            C19A8 c19a8 = (C19A8) aRunnableS40S0400000_32.l3;
            c19a8.LJ.LJIIZILJ((Scene) aRunnableS40S0400000_32.l1, c19a8.LIZ, true);
            ((Runnable) aRunnableS40S0400000_32.l2).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NavigationSceneManager$PushOptionOperation@de9f.execute$2");
    }

    public static final void run$1(ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SafAnimationResourceExecutor@fd05.executePopChangeDelayable$1");
        try {
            aRunnableS40S0400000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SafAnimationResourceExecutor@fd05.executePopChangeDelayable$1");
    }

    public static final void run$2(ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        boolean zLIZ;
        C1C7U.LIZ("BaseMynaViewManager@671.setTransformOrigin$$inlined$mynaDoOnPreDraw$1");
        try {
            aRunnableS40S0400000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseMynaViewManager@671.setTransformOrigin$$inlined$mynaDoOnPreDraw$1");
    }

    public static final void run$3(ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SAANavigationAnimExecutor@1d16.executePopChangeCancelable$animationEndAction$1");
        try {
            aRunnableS40S0400000_32.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAANavigationAnimExecutor@1d16.executePopChangeCancelable$animationEndAction$1");
    }

    public static final void run$4(ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        boolean zLIZ;
        C1C7U.LIZ("MynaPreloadUtil@d8bb.preExecuteTemplate$runnable$1");
        try {
            aRunnableS40S0400000_32.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MynaPreloadUtil@d8bb.preExecuteTemplate$runnable$1");
    }

    public static final void run$5(ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        boolean zLIZ;
        C1C7U.LIZ("NavigationAnimationExecutor@59c.executePopChange$1");
        try {
            aRunnableS40S0400000_32.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NavigationAnimationExecutor@59c.executePopChange$1");
    }

    public static final void run$6(ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        boolean zLIZ;
        C1C7U.LIZ("AnimationOrAnimatorResourceExecutor@ca39.executePopChangeCancelable$1");
        try {
            C195Z.LJ((View) aRunnableS40S0400000_32.l0);
            C195Z.LJ((View) aRunnableS40S0400000_32.l1);
            AnonymousClass1951 anonymousClass1951 = (AnonymousClass1951) aRunnableS40S0400000_32.l3;
            if (!anonymousClass1951.LIZLLL) {
                anonymousClass1951.LIZ.getOverlay().remove((View) aRunnableS40S0400000_32.l0);
            }
            ((Runnable) aRunnableS40S0400000_32.l2).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnimationOrAnimatorResourceExecutor@ca39.executePopChangeCancelable$1");
    }

    public static final void run$7(ARunnableS40S0400000_32 aRunnableS40S0400000_32) {
        View view = (View) aRunnableS40S0400000_32.l0;
        View view2 = (View) aRunnableS40S0400000_32.l1;
        AnonymousClass1954 anonymousClass1954 = (AnonymousClass1954) aRunnableS40S0400000_32.l2;
        Runnable runnable = (Runnable) aRunnableS40S0400000_32.l3;
        C1C7U.LIZ("AnimationOrAnimatorResourceExecutor2@82db.executePopChangeCancelable$1L");
        C195Z.LJ(view);
        C195Z.LJ(view2);
        if (!anonymousClass1954.LIZLLL) {
            anonymousClass1954.LIZ.getOverlay().remove(view);
        } else {
            C786410Ut5.LJLLLLLL(4, view);
            view.clearAnimation();
        }
        runnable.run();
        C1C7U.LIZIZ("AnimationOrAnimatorResourceExecutor2@82db.executePopChangeCancelable$1L");
    }

    public ARunnableS40S0400000_32(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
