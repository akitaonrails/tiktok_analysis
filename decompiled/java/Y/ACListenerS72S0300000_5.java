package Y;

import X.C0EEV;
import X.C0EEW;
import X.C0EEY;
import X.C0EF4;
import X.C0EF5;
import X.C0EF6;
import X.C0EF7;
import X.C0EN8;
import X.C0ENN;
import X.C0ENO;
import X.C0ENQ;
import X.C0F6L;
import X.C0F6O;
import X.C0FC7;
import X.C0FC8;
import X.C0FOI;
import X.C0FOK;
import X.C13LP;
import X.C15438062q;
import X.C1826510xdB;
import X.C361180EEa;
import X.C379910Euz;
import X.C379920Ev0;
import X.C379950Ev3;
import X.C380760EwM;
import X.C380770EwN;
import X.C380780EwO;
import X.C380800EwQ;
import X.C384570F5z;
import X.C786410Ut5;
import X.EnumC379800Euo;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public class ACListenerS72S0300000_5 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS72S0300000_5 aCListenerS72S0300000_5, View view) {
        boolean z;
        CaptionUtterance captionUtterance = (CaptionUtterance) aCListenerS72S0300000_5.l0;
        boolean z2 = true;
        boolean z3 = !captionUtterance.isSelected;
        captionUtterance.isSelected = z3;
        ((C0F6O) aCListenerS72S0300000_5.l1).LLIZ.setChecked(z3);
        C384570F5z c384570F5z = (C384570F5z) aCListenerS72S0300000_5.l2;
        C0F6L c0f6l = c384570F5z.LLILZIL;
        if (c0f6l != null) {
            ArrayList<CaptionUtterance> arrayList = c384570F5z.LL;
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                z = true;
                c0f6l.rR(z);
            } else {
                Iterator<CaptionUtterance> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().isSelected) {
                        z = false;
                        break;
                    }
                }
                z = true;
                c0f6l.rR(z);
            }
        }
        C384570F5z c384570F5z2 = (C384570F5z) aCListenerS72S0300000_5.l2;
        C0F6L c0f6l2 = c384570F5z2.LLILZIL;
        if (c0f6l2 != null) {
            ArrayList<CaptionUtterance> arrayList2 = c384570F5z2.LL;
            if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                z2 = false;
            } else {
                Iterator<CaptionUtterance> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (it3.next().isSelected) {
                        break;
                    }
                }
                z2 = false;
            }
            c0f6l2.Qq(z2);
        }
    }

    public static final void onClick$1(ACListenerS72S0300000_5 aCListenerS72S0300000_5, View view) {
        boolean z = !((C0FOK) ((RecyclerView.ViewHolder) aCListenerS72S0300000_5.l0)).LLILLJJLI.isChecked();
        ((C0FOK) ((RecyclerView.ViewHolder) aCListenerS72S0300000_5.l0)).LLILLJJLI.setChecked(z);
        ((C0FC8) ((C0FC7) aCListenerS72S0300000_5.l1)).LIZIZ = z;
        MutableLiveData<Set<String>> event = ((C0FOI) aCListenerS72S0300000_5.l2).LLILLJJLI.getEvent();
        if (event != null) {
            List<? extends C0FC7> list = ((C0FOI) aCListenerS72S0300000_5.l2).LLILLL;
            ArrayList arrayList = new ArrayList();
            for (C0FC7 c0fc7 : list) {
                if (c0fc7 instanceof C0FC8) {
                    arrayList.add(c0fc7);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C0FC8) obj).LIZIZ) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((C0FC8) it2.next()).LIZ);
            }
            event.setValue(C13LP.LLIIJI(arrayList3));
        }
    }

    public static final void onClick$2(ACListenerS72S0300000_5 aCListenerS72S0300000_5, View view) {
        C0EF7 c0ef7 = ((C0EF4) aCListenerS72S0300000_5.l0).LLILLJJLI;
        if (c0ef7 != null) {
            C0EF5 c0ef5LIZ = C0EF5.LIZ((C0EF5) aCListenerS72S0300000_5.l1);
            c0ef7.LIZ.LLLLIL().LIZIZ(((C0EF6) aCListenerS72S0300000_5.l2).getBindingAdapterPosition(), c0ef5LIZ);
        }
    }

    public static final void onClick$3(ACListenerS72S0300000_5 aCListenerS72S0300000_5, View view) {
        C0EEY c0eey = ((C0EEW) aCListenerS72S0300000_5.l0).LLILLJJLI;
        if (c0eey != null) {
            C0EEV c0eevLIZ = C0EEV.LIZ((C0EEV) aCListenerS72S0300000_5.l1);
            int bindingAdapterPosition = ((C361180EEa) aCListenerS72S0300000_5.l2).getBindingAdapterPosition();
            RecyclerView recyclerViewLLLLLL = c0eey.LIZ.LLLLLL();
            if (recyclerViewLLLLLL != null) {
                recyclerViewLLLLLL.smoothScrollToPosition(bindingAdapterPosition);
            }
            c0eey.LIZ.LLLLLJLJLL().LLLI(bindingAdapterPosition);
            c0eey.LIZ.LLLLLLZ(c0eevLIZ);
        }
    }

    public static final void onClick$4(ACListenerS72S0300000_5 aCListenerS72S0300000_5, View view) {
        C380800EwQ c380800EwQ;
        C380760EwM c380760EwM = (C380760EwM) aCListenerS72S0300000_5.l0;
        if (c380760EwM.LLILZ && (c380800EwQ = c380760EwM.LLILLL) != null) {
            c380800EwQ.LIZ.LLLLIL().LIZ.invoke(C380780EwO.LIZ((C380780EwO) aCListenerS72S0300000_5.l1, null, false, null, null, 0, null, 2047), Integer.valueOf(((C380770EwN) aCListenerS72S0300000_5.l2).getBindingAdapterPosition()));
        }
    }

    public static final void onClick$5(ACListenerS72S0300000_5 aCListenerS72S0300000_5, View view) {
        C0ENQ c0enq;
        C0ENN c0enn = (C0ENN) aCListenerS72S0300000_5.l0;
        if (c0enn.LLIZ && (c0enq = c0enn.LLILLL) != null) {
            c0enq.LIZ.LLLLIL().LIZ(C0EN8.LIZ((C0EN8) aCListenerS72S0300000_5.l1, false, null, null, null, 0, 511), ((C0ENO) aCListenerS72S0300000_5.l2).getBindingAdapterPosition());
        }
    }

    public static final void onClick$6(ACListenerS72S0300000_5 aCListenerS72S0300000_5, View view) {
        EnumC379800Euo enumC379800Euo;
        AwS619S0100000_5 awS619S0100000_5;
        C379950Ev3 c379950Ev3 = (C379950Ev3) aCListenerS72S0300000_5.l0;
        C379910Euz c379910Euz = c379950Ev3.LL;
        if (c379910Euz != null && (enumC379800Euo = c379910Euz.LIZ) != null && ((C379910Euz) aCListenerS72S0300000_5.l1).LIZJ && (awS619S0100000_5 = ((C379920Ev0) aCListenerS72S0300000_5.l2).LLILLJJLI) != null) {
            awS619S0100000_5.invoke(c379950Ev3.itemView, enumC379800Euo);
        }
    }

    public static final void onClick$7(ACListenerS72S0300000_5 aCListenerS72S0300000_5, View view) {
        C1826510xdB c1826510xdB = (C1826510xdB) aCListenerS72S0300000_5.l0;
        if (c1826510xdB != null && c1826510xdB.getVisibility() == 8) {
            C1826510xdB c1826510xdB2 = (C1826510xdB) aCListenerS72S0300000_5.l0;
            if (c1826510xdB2 != null) {
                C786410Ut5.x1(c1826510xdB2, 0);
            }
            View view2 = (View) aCListenerS72S0300000_5.l1;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            TuxIconView tuxIconView = (TuxIconView) aCListenerS72S0300000_5.l2;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_chevron_up_thin);
                return;
            }
            return;
        }
        C1826510xdB c1826510xdB3 = (C1826510xdB) aCListenerS72S0300000_5.l0;
        if (c1826510xdB3 != null) {
            C786410Ut5.x1(c1826510xdB3, 8);
        }
        View view3 = (View) aCListenerS72S0300000_5.l1;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(0, view3);
        }
        TuxIconView tuxIconView2 = (TuxIconView) aCListenerS72S0300000_5.l2;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setIconRes(R.raw.icon_chevron_down_thin);
    }

    public ACListenerS72S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
