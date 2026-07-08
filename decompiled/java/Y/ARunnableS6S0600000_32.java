package Y;

import X.AbstractC214793194d;
import X.C1447810nmN;
import X.C1447920nmY;
import X.C195S;
import X.C195T;
import X.C19A7;
import X.C1C7U;
import X.C214795194f;
import X.C21497819Bg;
import X.C786410Ut5;
import X.EnumC214943199x;
import X.InterfaceC214796194g;
import X.InterfaceC214797194h;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS6S0600000_32 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C21497819Bg c21497819Bg = ((C19A7) this.l5).LIZLLL.LJII;
        ((ArrayList) c21497819Bg.LIZ).remove((C1447810nmN) this.l0);
        ((C19A7) this.l5).LIZLLL.LIZ.LLLIL(((Record) this.l1).mScene);
        ((C19A7) this.l5).LIZLLL.LJIIZILJ((Scene) this.l2, ((Record) this.l3).mScene, false);
        ((Runnable) this.l4).run();
    }

    public final void LIZ$1() {
        Iterator<C195T> it2 = ((C195S) this.l0).LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        C786410Ut5.LJLLLLLL(0, (View) this.l1);
        ((C195S) this.l0).LJIILIIL((C214795194f) this.l2, (C214795194f) this.l3, (Runnable) this.l4, (C1447920nmY) this.l5);
    }

    public final void LIZ$2() {
        ((NavigationScene) this.l0).LLLLLLZ(false);
        ((NavigationScene) this.l0).LLLF = false;
        ((InterfaceC214796194g) this.l1).LIZ(Boolean.FALSE);
        AbstractC214793194d abstractC214793194d = (AbstractC214793194d) this.l5;
        if (!abstractC214793194d.LIZLLL && ((C214795194f) this.l2).LIZJ.value < EnumC214943199x.VIEW_CREATED.value) {
            abstractC214793194d.LIZ.getOverlay().remove((View) this.l3);
        }
        ((Runnable) this.l4).run();
        Runnable runnable = ((AbstractC214793194d) this.l5).LIZIZ;
        if (runnable != null) {
            runnable.run();
        }
        List<InterfaceC214797194h> list = ((AbstractC214793194d) this.l5).LIZJ;
        if (list != null) {
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                ((InterfaceC214797194h) it2.next()).LIZIZ();
            }
        }
    }

    public static final void run$0(ARunnableS6S0600000_32 aRunnableS6S0600000_32) {
        boolean zLIZ;
        C1C7U.LIZ("NavigationSceneManager$PopCountOperation@fb65.execute$1");
        try {
            aRunnableS6S0600000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NavigationSceneManager$PopCountOperation@fb65.execute$1");
    }

    public static final void run$1(ARunnableS6S0600000_32 aRunnableS6S0600000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SafDelayedAnimationExecutor@bc96.executePushChangeCancelable$1");
        try {
            aRunnableS6S0600000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SafDelayedAnimationExecutor@bc96.executePushChangeCancelable$1");
    }

    public static final void run$2(ARunnableS6S0600000_32 aRunnableS6S0600000_32) {
        boolean zLIZ;
        C1C7U.LIZ("NavigationAnimationExecutor@59c.executePushChange$1");
        try {
            aRunnableS6S0600000_32.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NavigationAnimationExecutor@59c.executePushChange$1");
    }

    public ARunnableS6S0600000_32(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$t = i;
        this.l0 = obj5;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj6;
        this.l5 = obj4;
    }
}
