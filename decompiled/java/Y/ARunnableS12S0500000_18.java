package Y;

import X.C1179560gni;
import X.C1179580gnk;
import X.C118300cf;
import X.C1196900hFg;
import X.C13LP;
import X.C19MB;
import X.C1C7U;
import X.InterfaceC1177250gjz;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.PoiAnchorCardCarouselLabel;
import com.ss.android.ugc.aweme.poi.PoiAnchorCardSecondLineCarousel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS12S0500000_18 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ConstraintLayout constraintLayout;
        Float f = (Float) this.l0;
        if (f != null) {
            View view = (View) this.l1;
            TextView textView = (TextView) this.l2;
            TextView textView2 = (TextView) this.l3;
            View view2 = (View) this.l4;
            float fFloatValue = f.floatValue();
            if (fFloatValue > ((double) view.getWidth()) * 0.7d) {
                if (textView != null) {
                    textView.setMaxWidth((int) (((double) view.getWidth()) * 0.3d));
                    return;
                }
                return;
            }
            int i = (int) fFloatValue;
            textView2.setMinWidth(i);
            C19MB c19mb = new C19MB();
            if (!(view2 instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) view2) == null) {
                return;
            }
            c19mb.LJII(constraintLayout);
            c19mb.LJIJI(R.id.quw).LIZLLL.LJJJJLI = i;
            c19mb.LIZIZ(constraintLayout);
        }
    }

    public final void LIZ$1() {
        ConstraintLayout constraintLayout;
        Float f = (Float) this.l0;
        if (f != null) {
            View view = (View) this.l1;
            TextView textView = (TextView) this.l2;
            TextView textView2 = (TextView) this.l3;
            View view2 = (View) this.l4;
            float fFloatValue = f.floatValue();
            if (fFloatValue > ((double) view.getWidth()) * 0.7d) {
                if (textView != null) {
                    textView.setMaxWidth((int) (((double) view.getWidth()) * 0.3d));
                    return;
                }
                return;
            }
            int i = (int) fFloatValue;
            textView2.setMinWidth(i);
            C19MB c19mb = new C19MB();
            if (!(view2 instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) view2) == null) {
                return;
            }
            c19mb.LJII(constraintLayout);
            c19mb.LJIJI(R.id.quw).LIZLLL.LJJJJLI = i;
            c19mb.LIZIZ(constraintLayout);
        }
    }

    public final void LIZ$2() {
        String strLJJLIIIJ;
        List list = (List) this.l0;
        C118300cf c118300cf = (C118300cf) this.l1;
        int i = c118300cf.element;
        c118300cf.element = i + 1;
        PoiAnchorCardSecondLineCarousel poiAnchorCardSecondLineCarousel = (PoiAnchorCardSecondLineCarousel) ListProtector.get(list, i);
        ((C1196900hFg) this.l2).LJJIIZ(poiAnchorCardSecondLineCarousel, (SmartImageView) this.l3, (LinearLayout) this.l4);
        List<PoiAnchorCardCarouselLabel> list2 = poiAnchorCardSecondLineCarousel.labels;
        if (list2 == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list2, "", null, null, 0, null, AFwS256S0000000_18.get$arr$(853), 30)) == null) {
            strLJJLIIIJ = "";
        }
        if (strLJJLIIIJ.length() <= 0 || ((ArrayList) ((C1196900hFg) this.l2).LLL).contains(strLJJLIIIJ)) {
            return;
        }
        ((ArrayList) ((C1196900hFg) this.l2).LLL).add(strLJJLIIIJ);
    }

    public static final void run$0(ARunnableS12S0500000_18 aRunnableS12S0500000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PlaylistBottomBarComponent@bd17.onParentViewCreated$2$1$1$1");
        try {
            aRunnableS12S0500000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlaylistBottomBarComponent@bd17.onParentViewCreated$2$1$1$1");
    }

    public static final void run$1(ARunnableS12S0500000_18 aRunnableS12S0500000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PlaylistBottomBarComponent@bd17.onParentViewCreated$4$1$1$1");
        try {
            aRunnableS12S0500000_18.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlaylistBottomBarComponent@bd17.onParentViewCreated$4$1$1$1");
    }

    public static final void run$2(ARunnableS12S0500000_18 aRunnableS12S0500000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiCardView@aafa.startCarouselAnimation$1");
        try {
            aRunnableS12S0500000_18.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiCardView@aafa.startCarouselAnimation$1");
    }

    public static final void run$3(ARunnableS12S0500000_18 aRunnableS12S0500000_18) {
        boolean zLIZ;
        C1C7U.LIZ("LynxMapView@6fbb.tryShowDynamicMap$3$1");
        try {
            ((C1179560gni) aRunnableS12S0500000_18.l0).LIZ((InterfaceC1177250gjz) aRunnableS12S0500000_18.l1, (C1179580gnk) aRunnableS12S0500000_18.l2, (Function0) aRunnableS12S0500000_18.l3, (Function0) aRunnableS12S0500000_18.l4);
            ((InterfaceC1177250gjz) aRunnableS12S0500000_18.l1).LJIIZILJ(new AwS562S0100000_18((C1179560gni) aRunnableS12S0500000_18.l0, 2728));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxMapView@6fbb.tryShowDynamicMap$3$1");
    }

    public ARunnableS12S0500000_18(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
