package Y;

import X.C047Y;
import X.C04EM;
import X.C04EP;
import X.C04HS;
import X.C04HT;
import X.C118300cf;
import X.C1C7U;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS4S0301000_1 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$1() {
        int[] iArr = new int[2];
        ((View) this.l0).getLocationOnScreen(iArr);
        int height = (iArr[1] + ((View) this.l0).getHeight()) - this.i3;
        if (height < 0) {
            height = 0;
        }
        C786410Ut5.ed((View) this.l0, -height);
        int i = iArr[1] - height;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS = ((CCDCAddCardHalfFragment) this.l1).iS();
        if (viewOnAttachStateChangeListenerC20604515jvIS != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS2 = ((CCDCAddCardHalfFragment) this.l1).iS();
            int paddingLeft = viewOnAttachStateChangeListenerC20604515jvIS2 != null ? viewOnAttachStateChangeListenerC20604515jvIS2.getPaddingLeft() : 0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS3 = ((CCDCAddCardHalfFragment) this.l1).iS();
            int paddingTop = viewOnAttachStateChangeListenerC20604515jvIS3 != null ? viewOnAttachStateChangeListenerC20604515jvIS3.getPaddingTop() : 0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS4 = ((CCDCAddCardHalfFragment) this.l1).iS();
            viewOnAttachStateChangeListenerC20604515jvIS.setPadding(paddingLeft, paddingTop, viewOnAttachStateChangeListenerC20604515jvIS4 != null ? viewOnAttachStateChangeListenerC20604515jvIS4.getPaddingRight() : 0, ((C118300cf) this.l2).element + ((View) this.l0).getHeight());
        }
        ((CCDCAddCardHalfFragment) this.l1).nS(i);
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = (CCDCAddCardHalfFragment) this.l1;
        View view = (View) this.l0;
        cCDCAddCardHalfFragment.getClass();
        HandlerHook.viewPost(view, new ARunnableS70S0200000_1(cCDCAddCardHalfFragment, view, 22));
    }

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View viewFindViewByPosition = ((LinearLayoutManager) this.l1).findViewByPosition(this.i3);
        if (viewFindViewByPosition != null) {
            ((RecyclerView) this.l2).scrollBy(((viewFindViewByPosition.getLeft() + viewFindViewByPosition.getRight()) / 2) - (((RecyclerView) this.l2).getWidth() / 2), 0);
            return;
        }
        ((LinearLayoutManager) this.l1).scrollToPositionWithOffset(this.i3, 0);
        RecyclerView recyclerView = (RecyclerView) this.l2;
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(recyclerView, new ARunnableS4S0301000_1(recyclerView, this.i3, (LinearLayoutManager) this.l1, recyclerView, 1));
    }

    public static final void run$0(ARunnableS4S0301000_1 aRunnableS4S0301000_1) {
        boolean zLIZ;
        C1C7U.LIZ("LsChipsAdapter@5d8e.centerWithoutAnimation$$inlined$doOnPreDraw$1");
        try {
            aRunnableS4S0301000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LsChipsAdapter@5d8e.centerWithoutAnimation$$inlined$doOnPreDraw$1");
    }

    public static final void run$1(ARunnableS4S0301000_1 aRunnableS4S0301000_1) {
        boolean zLIZ;
        C1C7U.LIZ("LsChipsAdapter@5d8e.centerWithoutAnimation$lambda$4$$inlined$doOnPreDraw$1");
        try {
            View viewFindViewByPosition = ((LinearLayoutManager) aRunnableS4S0301000_1.l1).findViewByPosition(aRunnableS4S0301000_1.i3);
            if (viewFindViewByPosition != null) {
                ((RecyclerView) aRunnableS4S0301000_1.l2).scrollBy(((viewFindViewByPosition.getLeft() + viewFindViewByPosition.getRight()) / 2) - (((RecyclerView) aRunnableS4S0301000_1.l2).getWidth() / 2), 0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LsChipsAdapter@5d8e.centerWithoutAnimation$lambda$4$$inlined$doOnPreDraw$1");
    }

    public static final void run$2(ARunnableS4S0301000_1 aRunnableS4S0301000_1) {
        boolean zLIZ;
        C1C7U.LIZ("CCDCAddCardHalfFragment@118e.initKeyboardFloatingWindow$3$1");
        try {
            aRunnableS4S0301000_1.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CCDCAddCardHalfFragment@118e.initKeyboardFloatingWindow$3$1");
    }

    public static final void run$3(ARunnableS4S0301000_1 aRunnableS4S0301000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SpecListLayout@93eb.initSpecList$3$5");
        try {
            int[] iArr = new int[2];
            ((C04HT) aRunnableS4S0301000_1.l0).getLocationOnScreen(iArr);
            C04EP c04ep = ((C04EM) aRunnableS4S0301000_1.l1).LLJJIII;
            if (c04ep != null) {
                c04ep.LIZIZ(new C047Y(aRunnableS4S0301000_1.i3, iArr[1]));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecListLayout@93eb.initSpecList$3$5");
    }

    public static final void run$4(ARunnableS4S0301000_1 aRunnableS4S0301000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SpecListLayout@93eb.initSpecList$3$7");
        try {
            int[] iArr = new int[2];
            ((C04HS) aRunnableS4S0301000_1.l0).getLocationOnScreen(iArr);
            C04EP c04ep = ((C04EM) aRunnableS4S0301000_1.l1).LLJJIII;
            if (c04ep != null) {
                c04ep.LIZIZ(new C047Y(aRunnableS4S0301000_1.i3, iArr[1]));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecListLayout@93eb.initSpecList$3$7");
    }

    public ARunnableS4S0301000_1(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i3 = i;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
