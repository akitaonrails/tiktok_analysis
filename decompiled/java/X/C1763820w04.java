package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: renamed from: X.0w04, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763820w04 implements InterfaceC1761370vw7 {
    public View LL;
    public C424730Gl5 LLILLJJLI;
    public List<C1763070vyr> LLILLL;
    public C1744710vVF LLILZ;

    @Override // X.InterfaceC1761370vw7
    public final void LJFF() {
        ViewGroup viewGroup;
        View view = this.LL;
        ViewParent parent = view != null ? view.getParent() : null;
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LL, viewGroup);
    }

    @Override // X.InterfaceC1761370vw7
    public final void onPageSelected(int i) {
        C424730Gl5 c424730Gl5 = this.LLILLJJLI;
        if (c424730Gl5 != null) {
            c424730Gl5.setTabPosition(i);
        }
        C1744710vVF c1744710vVF = this.LLILZ;
        if (c1744710vVF != null) {
            C786410Ut5.LJLLLLLL(0, c1744710vVF);
        }
        C1744710vVF c1744710vVF2 = this.LLILZ;
        if (c1744710vVF2 != null) {
            c1744710vVF2.LJJJJJ(i);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void onShow(int i) {
        ArrayList arrayList;
        View view = this.LL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C424730Gl5 c424730Gl5 = this.LLILLJJLI;
        ArrayList arrayList2 = null;
        if (c424730Gl5 != null) {
            List<C1763070vyr> list = this.LLILLL;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1763070vyr> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZIZ);
                }
            } else {
                arrayList = null;
            }
            c424730Gl5.setTitles(arrayList);
        }
        C424730Gl5 c424730Gl52 = this.LLILLJJLI;
        if (c424730Gl52 != null) {
            List<C1763070vyr> list2 = this.LLILLL;
            if (list2 != null) {
                arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<C1763070vyr> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(it3.next().LIZJ));
                }
            }
            c424730Gl52.setTabPositionList(arrayList2);
        }
        C1744710vVF c1744710vVF = this.LLILZ;
        if (c1744710vVF != null) {
            c1744710vVF.setRealSize(i);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void setAlpha(float f) {
        View view = this.LL;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // X.InterfaceC1761370vw7
    public final void LJII(FrameLayout frameLayout, InterfaceC1763860w08 interfaceC1763860w08) {
        C424730Gl5 c424730Gl5;
        C1744710vVF c1744710vVF;
        C19ME c19me;
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams = null;
        View viewSd = C786410Ut5.Sd(R.layout.aru, C786410Ut5.ne(frameLayout.getContext()), null);
        this.LL = viewSd;
        if (viewSd != null && (viewFindViewById = viewSd.findViewById(R.id.jzi)) != null) {
            C786410Ut5.I7(new AjS70S0100000_26(interfaceC1763860w08, 112), viewFindViewById);
        }
        View view = this.LL;
        if (view != null) {
            c424730Gl5 = (C424730Gl5) view.findViewById(R.id.wvd);
        } else {
            c424730Gl5 = null;
        }
        this.LLILLJJLI = c424730Gl5;
        List<C1763070vyr> list = this.LLILLL;
        if (list == null || list.size() < 2) {
            C424730Gl5 c424730Gl52 = this.LLILLJJLI;
            if (c424730Gl52 != null) {
                C786410Ut5.LJLLLLLL(8, c424730Gl52);
            }
            this.LLILLJJLI = null;
        }
        View view2 = this.LL;
        if (view2 != null) {
            c1744710vVF = (C1744710vVF) view2.findViewById(R.id.ph7);
        } else {
            c1744710vVF = null;
        }
        this.LLILZ = c1744710vVF;
        if (C293640Bf8.LIZ() == 1) {
            C1744710vVF c1744710vVF2 = this.LLILZ;
            if (c1744710vVF2 != null) {
                layoutParams = c1744710vVF2.getLayoutParams();
            }
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                if (this.LL != null) {
                    c19me.setMarginEnd(0);
                    c19me.startToStart = 0;
                }
                C1744710vVF c1744710vVF3 = this.LLILZ;
                if (c1744710vVF3 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1744710vVF3);
                    c1744710vVF3.setLayoutParams(c19me);
                }
            }
        }
        C424730Gl5 c424730Gl53 = this.LLILLJJLI;
        if (c424730Gl53 != null) {
            c424730Gl53.setBackgroundResource(R.drawable.b29);
        }
        C424730Gl5 c424730Gl54 = this.LLILLJJLI;
        if (c424730Gl54 != null) {
            c424730Gl54.setClickStrategy(new AwS392S0200000_26(this, interfaceC1763860w08, 266));
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 48;
        frameLayout.addView(this.LL, layoutParams2);
        View view3 = this.LL;
        if (view3 != null) {
            view3.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)), 0, 0);
        }
    }
}
