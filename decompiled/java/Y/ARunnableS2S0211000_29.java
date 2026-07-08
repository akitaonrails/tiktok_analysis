package Y;

import X.C12GK;
import X.C12GW;
import X.C19398610uu;
import X.C19398810uw;
import X.C19399210v0;
import X.C1C7U;
import X.C497820Jfg;
import X.InterfaceC19399010uy;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS2S0211000_29 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

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
        if (this.z2) {
            ((RecyclerView) this.l0).smoothScrollToPosition(this.i3);
            return;
        }
        int iLIZIZ = C497820Jfg.LIZIZ(((C12GW) this.l1).requireSceneContext());
        int i = C12GK.LLJILJIL;
        int i2 = (iLIZIZ - C12GK.LLJILLL) / 2;
        ((RecyclerView) this.l0).scrollToPosition(this.i3);
        ((LinearLayoutManager) ((RecyclerView) this.l0).getLayoutManager()).scrollToPositionWithOffset(this.i3, i2);
    }

    public final void LIZ$1() {
        if (((C19399210v0) this.l0).LL.getParent() != null) {
            if (this.z2) {
                ((C19399210v0) this.l0).LLILZIL = -1;
            }
            C19399210v0 c19399210v0 = (C19399210v0) this.l0;
            List<C19398810uw> list = (List) this.l1;
            c19399210v0.LLIZ = list;
            C19398610uu c19398610uu = c19399210v0.LLILLL;
            c19398610uu.LLILLJJLI = list;
            c19398610uu.notifyDataSetChanged();
            final C19399210v0 c19399210v02 = (C19399210v0) this.l0;
            final InterfaceC19399010uy interfaceC19399010uy = c19399210v02.LLILZ;
            c19399210v02.LLILZ = null;
            RecyclerView recyclerView = c19399210v02.LL;
            final int i = this.i3;
            final List list2 = (List) this.l1;
            HandlerHook.viewPost(recyclerView, new Runnable() { // from class: X.10ux
                public final void LIZ() {
                    c19399210v02.LL.smoothScrollToPosition(i);
                    c19399210v02.LLILZ = interfaceC19399010uy;
                    Object obj = ListProtector.get(list2, i);
                    int i2 = i;
                    C19399210v0 c19399210v03 = c19399210v02;
                    InterfaceC19399010uy interfaceC19399010uy2 = c19399210v03.LLILZ;
                    if (interfaceC19399010uy2 != null) {
                        interfaceC19399010uy2.LIZ(i2, true);
                    }
                    c19399210v03.LLILZIL = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CenterSelectionView@80dd.setData$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CenterSelectionView@80dd.setData$1$1");
                }
            });
        }
    }

    public static final void run$0(ARunnableS2S0211000_29 aRunnableS2S0211000_29) {
        boolean zLIZ;
        C1C7U.LIZ("BottomSheetBehavior@ded.settleToStatePendingLayout$1");
        try {
            ((BottomSheetBehavior) aRunnableS2S0211000_29.l1).LIZJ(aRunnableS2S0211000_29.i3, (View) aRunnableS2S0211000_29.l0, aRunnableS2S0211000_29.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomSheetBehavior@ded.settleToStatePendingLayout$1");
    }

    public static final void run$1(ARunnableS2S0211000_29 aRunnableS2S0211000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CropThumbnailScene@477d.scrollToPosition$1");
        try {
            aRunnableS2S0211000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CropThumbnailScene@477d.scrollToPosition$1");
    }

    public static final void run$2(ARunnableS2S0211000_29 aRunnableS2S0211000_29) {
        boolean zLIZ;
        C1C7U.LIZ("CenterSelectionView@80dd.setData$1");
        try {
            aRunnableS2S0211000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CenterSelectionView@80dd.setData$1");
    }

    public ARunnableS2S0211000_29(C19399210v0 c19399210v0, int i, List list, int i2) {
        this.$t = i2;
        this.l0 = c19399210v0;
        this.z2 = true;
        this.i3 = i;
        this.l1 = list;
    }

    public ARunnableS2S0211000_29(Object obj, Object obj2, int i, boolean z, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l0 = obj2;
        this.i3 = i;
        this.z2 = z;
    }
}
