package X;

import Y.ARunnableS23S0101000_12;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UBC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UBC {
    public final C19YU LIZ;
    public final ViewPager LIZIZ;
    public int LIZJ;
    public final List<C0UBH> LIZLLL = new ArrayList();

    public static void LIZJ(C1888650zFP c1888650zFP) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        if (c1888650zFP != null) {
            View view = c1888650zFP.LJ;
            if (view != null && (viewFindViewById3 = view.findViewById(R.id.wyg)) != null) {
                C786410Ut5.T4(viewFindViewById3, 0.9f);
            }
            View view2 = c1888650zFP.LJ;
            if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.wxw)) != null) {
                viewFindViewById2.setSelected(true);
            }
            View view3 = c1888650zFP.LJ;
            if (view3 != null && (viewFindViewById = view3.findViewById(R.id.wys)) != null) {
                C500260Jjc.LJIILIIL(viewFindViewById);
            }
        }
    }

    public static void LIZLLL(C1888650zFP c1888650zFP) {
        View viewFindViewById;
        View viewFindViewById2;
        View view = c1888650zFP.LJ;
        if (view != null && (viewFindViewById2 = view.findViewById(R.id.wyg)) != null) {
            C786410Ut5.T4(viewFindViewById2, 0.5f);
        }
        View view2 = c1888650zFP.LJ;
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.wxw)) != null) {
            viewFindViewById.setSelected(false);
        }
    }

    public final void LIZ(String str) {
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((C0UBH) it2.next()).LIZIZ.toLowerCase(Locale.ENGLISH), str)) {
                if (i >= 0 && i < ((ArrayList) this.LIZLLL).size()) {
                    C473410IhP.LIZJ(new ARunnableS23S0101000_12(i, this, 13), 200L);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LIZIZ(List<C0UBH> list) {
        C1888650zFP c1888650zFPLJIIIZ;
        C1888650zFP c1888650zFPLJIIJ;
        LifecycleOwner lifecycleOwner;
        TextView textView;
        View viewFindViewById;
        LifecycleOwner lifecycleOwner2;
        TextView textView2;
        if (!Intrinsics.LJFF(this.LIZLLL, list)) {
            ((ArrayList) this.LIZLLL).clear();
            ((ArrayList) this.LIZLLL).addAll(list);
            this.LIZ.LJIIL();
            int i = 0;
            for (Object obj : (ArrayList) this.LIZLLL) {
                int i2 = i + 1;
                View viewFindViewById2 = null;
                if (i >= 0) {
                    C0UBH c0ubh = (C0UBH) obj;
                    if (Intrinsics.LJFF(c0ubh.LIZ, "search")) {
                        c1888650zFPLJIIJ = this.LIZ.LJIIJ();
                        c1888650zFPLJIIJ.LJFF = false;
                        c1888650zFPLJIIJ.LIZIZ(R.layout.gfa);
                        c1888650zFPLJIIJ.LIZ = c0ubh;
                    } else if (Intrinsics.LJFF(c0ubh.LIZ, "favorite")) {
                        c1888650zFPLJIIJ = this.LIZ.LJIIJ();
                        c1888650zFPLJIIJ.LJFF = false;
                        c1888650zFPLJIIJ.LIZIZ(R.layout.gej);
                        View view = c1888650zFPLJIIJ.LJ;
                        if (view != null && (textView2 = (TextView) view.findViewById(R.id.wyg)) != null) {
                            textView2.setText(c0ubh.LIZ);
                        }
                        c1888650zFPLJIIJ.LIZ = c0ubh;
                    } else if (Intrinsics.LJFF(c0ubh.LIZIZ, "Recents")) {
                        c1888650zFPLJIIJ = this.LIZ.LJIIJ();
                        c1888650zFPLJIIJ.LJFF = false;
                        c1888650zFPLJIIJ.LIZIZ(R.layout.gf7);
                        View view2 = c1888650zFPLJIIJ.LJ;
                        if (view2 != null) {
                            viewFindViewById = view2.findViewById(R.id.wxw);
                        } else {
                            viewFindViewById = null;
                        }
                        C500260Jjc.LLFFF(viewFindViewById);
                        c1888650zFPLJIIJ.LIZ = c0ubh;
                        View view3 = c1888650zFPLJIIJ.LJ;
                        if (view3 != null) {
                            viewFindViewById2 = view3.findViewById(R.id.wys);
                        }
                        DataChannel dataChannelLJIIIZ = C782710Un7.LJIIIZ(C782710Un7.LIZ);
                        if (dataChannelLJIIIZ != null && (lifecycleOwner2 = dataChannelLJIIIZ.LLILZ) != null) {
                            RedDotExtensionKt.LJI(viewFindViewById2, lifecycleOwner2, null, C0UX6.LIVE_EFFECT_RECENT_TAB, new AwS591S0100000_12(viewFindViewById2, 724));
                        }
                    } else {
                        c1888650zFPLJIIJ = this.LIZ.LJIIJ();
                        c1888650zFPLJIIJ.LJFF = false;
                        c1888650zFPLJIIJ.LIZIZ(R.layout.gfh);
                        View view4 = c1888650zFPLJIIJ.LJ;
                        if (view4 != null && (textView = (TextView) view4.findViewById(R.id.wyg)) != null) {
                            textView.setText(c0ubh.LIZ);
                        }
                        c1888650zFPLJIIJ.LIZ = c0ubh;
                        View view5 = c1888650zFPLJIIJ.LJ;
                        if (view5 != null) {
                            viewFindViewById2 = view5.findViewById(R.id.wys);
                        }
                        if (!u.LJIJI("new", c0ubh.LIZIZ, true) && !u.LJIJI("hot", c0ubh.LIZIZ, true)) {
                            C500260Jjc.LJIILIIL(viewFindViewById2);
                        } else {
                            DataChannel dataChannelLJIIIZ2 = C782710Un7.LJIIIZ(C782710Un7.LIZ);
                            if (dataChannelLJIIIZ2 != null && (lifecycleOwner = dataChannelLJIIIZ2.LLILZ) != null) {
                                RedDotExtensionKt.LJI(viewFindViewById2, lifecycleOwner, null, C0UX6.LIVE_EFFECT_NEW_TAB, new AwS591S0100000_12(viewFindViewById2, 725));
                            }
                        }
                    }
                    if (i == this.LIZJ) {
                        C19YU c19yu = this.LIZ;
                        LIZJ(c1888650zFPLJIIJ);
                        c19yu.LIZJ(c1888650zFPLJIIJ, i, true);
                    } else {
                        C19YU c19yu2 = this.LIZ;
                        LIZLLL(c1888650zFPLJIIJ);
                        c19yu2.LIZJ(c1888650zFPLJIIJ, i, false);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            int size = ((ArrayList) this.LIZLLL).size();
            int i3 = this.LIZJ;
            if (i3 >= 0 && i3 < size && (c1888650zFPLJIIIZ = this.LIZ.LJIIIZ(i3)) != null) {
                c1888650zFPLJIIIZ.LIZ(false);
            }
        }
    }

    public C0UBC(C19YU c19yu, ViewPager viewPager, int i) {
        this.LIZ = c19yu;
        this.LIZIZ = viewPager;
        this.LIZJ = i;
        c19yu.setTabMargin(9);
        c19yu.LIZIZ(new InterfaceC1883670z7N() { // from class: X.0UBF
            @Override // X.InterfaceC1883670z7N
            public final void LIZJ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZ(C1888650zFP c1888650zFP) {
                this.LIZ.getClass();
                C0UBC.LIZLLL(c1888650zFP);
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZIZ(C1888650zFP c1888650zFP, boolean z, boolean z2) {
                int i2;
                C0UBH c0ubh;
                this.LIZ.getClass();
                C0UBC.LIZJ(c1888650zFP);
                C0UBC c0ubc = this.LIZ;
                if (c1888650zFP != null) {
                    i2 = c1888650zFP.LIZLLL;
                } else {
                    i2 = -1;
                }
                c0ubc.LIZJ = i2;
                Object obj = null;
                if (c1888650zFP != null) {
                    obj = c1888650zFP.LIZ;
                }
                if ((obj instanceof C0UBH) && (c0ubh = (C0UBH) obj) != null) {
                    if (Intrinsics.LJFF(c0ubh.LIZIZ, "Recents")) {
                        RedDotExtensionKt.LIZ(C0UX6.LIVE_EFFECT_RECENT_TAB);
                    } else {
                        if (!u.LJIJI("new", c0ubh.LIZIZ, true) && !u.LJIJI("hot", c0ubh.LIZIZ, true)) {
                            return;
                        }
                        RedDotExtensionKt.LIZ(C0UX6.LIVE_EFFECT_NEW_TAB);
                    }
                }
            }
        });
    }
}
