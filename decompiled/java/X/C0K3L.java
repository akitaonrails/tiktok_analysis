package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0K3L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3L extends C0K3V {
    public final View LL;
    public final SubSpaceDetailVM LLILLJJLI;
    public final ViewGroup LLILLL;
    public final TextView LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;

    public final void U5(final C0K3K c0k3k) {
        boolean z;
        C0K37 c0k37;
        ArrayList<AbstractC511160K2w> arrayList;
        C0K3G c0k3g = this.LLILLJJLI.LLILLL;
        if (c0k3g != null && (c0k37 = c0k3g.LLILLL) != null && (arrayList = c0k37.LL) != null) {
            Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC511160K2w next = it2.next();
                if (next instanceof C0K3J) {
                    C0K3J c0k3j = (C0K3J) next;
                    if (c0k3j.LIZJ() != C0K2L.COMMENT && c0k3j.LIZLLL() == c0k3k.LIZLLL()) {
                        if (i >= 0) {
                            z = true;
                        }
                    }
                }
                i++;
            }
            z = false;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLIL(this.LLILZIL, 0);
            C786410Ut5.T7(this.LLILZIL, new View.OnClickListener() { // from class: X.0K3M
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0K37 c0k372;
                    ArrayList<AbstractC511160K2w> arrayList2;
                    SubSpaceDetailVM subSpaceDetailVM = this.LL.LLILLJJLI;
                    C0K3K c0k3k2 = c0k3k;
                    C0K3G c0k3g2 = subSpaceDetailVM.LLILLL;
                    if (c0k3g2 != null && (c0k372 = c0k3g2.LLILLL) != null && (arrayList2 = c0k372.LL) != null) {
                        Iterator<AbstractC511160K2w> it3 = arrayList2.iterator();
                        int i2 = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                AbstractC511160K2w next2 = it3.next();
                                if (next2 instanceof C0K3J) {
                                    C0K3J c0k3j2 = (C0K3J) next2;
                                    if (c0k3j2.LIZJ() == C0K2L.COMMENT && c0k3j2.LIZLLL() == c0k3k2.LIZLLL()) {
                                        break;
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i2);
                        if (numValueOf.intValue() >= 0 && 1 != 0) {
                            int iIntValue = numValueOf.intValue();
                            Integer numValueOf2 = Integer.valueOf(arrayList2.indexOf(c0k3k2));
                            if (numValueOf2.intValue() > iIntValue) {
                                int i3 = iIntValue + 1;
                                List listLLIIII = C13LP.LLIIII(arrayList2.subList(i3, numValueOf2.intValue()));
                                arrayList2.removeAll(C13LP.LLIIJI(listLLIIII));
                                C0K37 c0k373 = c0k3g2.LLILLL;
                                if (c0k373 != null) {
                                    c0k373.notifyItemRangeRemoved(i3, listLLIIII.size());
                                }
                                c0k3k2.LIZJ = 0L;
                                c0k3k2.LIZIZ = c0k3k2.LIZLLL;
                                C0K37 c0k374 = c0k3g2.LLILLL;
                                if (c0k374 != null) {
                                    c0k374.notifyItemChanged(i3);
                                }
                            }
                        }
                    }
                }
            });
        } else {
            C786410Ut5.LLIL(this.LLILZIL, 8);
        }
        if (c0k3k.LIZIZ > 0) {
            TextView textView = this.LLILZ;
            String strLJII = C511520K4g.LJII(2131839582);
            if (strLJII == null) {
                strLJII = "";
            }
            textView.setText(C786410Ut5.j4(strLJII, Arrays.copyOf(new Object[]{C511410K3v.LIZIZ(c0k3k.LIZIZ)}, 1)));
            C786410Ut5.LLIL(this.LLILZ, 0);
            C786410Ut5.LJLLLLLL(0, this.LLILZLL);
        } else {
            C786410Ut5.LLIL(this.LLILZ, 4);
            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
        }
        C786410Ut5.LJJJJI(this.LLILLL);
    }

    public C0K3L(View view, SubSpaceDetailVM subSpaceDetailVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceDetailVM;
        this.LLILLL = (ViewGroup) view.findViewById(R.id.nlo);
        this.LLILZ = (TextView) view.findViewById(R.id.a50);
        this.LLILZIL = (TextView) view.findViewById(R.id.a3b);
        this.LLILZLL = view.findViewById(R.id.view_more_comment_divider);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K3K c0k3k;
        if ((abstractC511160K2w instanceof C0K3K) && (c0k3k = (C0K3K) abstractC511160K2w) != null) {
            U5(c0k3k);
            C786410Ut5.T7(this.LLILZ, new ACListenerS111S0200000_7(this, c0k3k, 28));
        }
    }
}
