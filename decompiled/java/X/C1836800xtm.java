package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xtm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1836800xtm extends FrameLayout implements InterfaceC1784070wWj {
    public final RecyclerView LL;
    public final C1807480x8U LLILLJJLI;
    public Function2<? super EnumC1784170wWt, ? super IMQuickReply, Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    private final Function2<EnumC1784170wWt, IMQuickReply, Unit> getQuickAction() {
        return (Function2) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC1784070wWj
    public List<C1784040wWg> getData() {
        List<C1784040wWg> list;
        C1807480x8U c1807480x8U = this.LLILLJJLI;
        return (c1807480x8U == null || (list = c1807480x8U.LL) == null) ? C13BV.INSTANCE : list;
    }

    public final C1836810xtn getItemTouchCallback() {
        return (C1836810xtn) this.LLILZLL.getValue();
    }

    public final C21688219uK getItemTouchHelper() {
        return (C21688219uK) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1784070wWj
    public final void LIZ(EnumC1784010wWd enumC1784010wWd) {
        C1807480x8U c1807480x8U = this.LLILLJJLI;
        if (c1807480x8U != null) {
            List<C1784040wWg> list = c1807480x8U.LL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1784040wWg(enumC1784010wWd, ((C1784040wWg) it2.next()).LIZIZ));
            }
            ((ArrayList) c1807480x8U.LL).clear();
            ((ArrayList) c1807480x8U.LL).addAll(arrayList);
            c1807480x8U.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC1784070wWj
    public final void LIZIZ(C1784040wWg c1784040wWg) {
        int itemCount;
        Object next;
        C1807480x8U c1807480x8U = this.LLILLJJLI;
        if (c1807480x8U != null) {
            Iterator it2 = ((ArrayList) c1807480x8U.LL).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C1784040wWg) next).LIZIZ.id, c1784040wWg.LIZIZ.id)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1784040wWg c1784040wWg2 = (C1784040wWg) next;
            if (c1784040wWg2 != null) {
                int iIndexOf = ((ArrayList) c1807480x8U.LL).indexOf(c1784040wWg2);
                c1784040wWg2.LIZIZ = c1784040wWg.LIZIZ;
                c1807480x8U.notifyItemRangeChanged(iIndexOf, 1);
            } else {
                ListProtector.add(c1807480x8U.LL, 0, c1784040wWg);
                c1807480x8U.notifyItemInserted(0);
            }
        }
        C1670506gR c1670506gR = C1670506gR.LIZ;
        Long lValueOf = Long.valueOf(C461720I8s.LIZJ());
        C1807480x8U c1807480x8U2 = this.LLILLJJLI;
        if (c1807480x8U2 != null) {
            itemCount = c1807480x8U2.getItemCount();
        } else {
            itemCount = -1;
        }
        Pair<Long, Integer> pair = new Pair<>(lValueOf, Integer.valueOf(itemCount));
        c1670506gR.getClass();
        C1670506gR.LJ = pair;
    }

    @Override // X.InterfaceC1784070wWj
    public final void LIZJ(List<IMQuickReply> list) {
        C1807480x8U c1807480x8U = this.LLILLJJLI;
        if (c1807480x8U != null) {
            for (IMQuickReply iMQuickReply : list) {
                Iterator it2 = ((ArrayList) c1807480x8U.LL).iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((C1784040wWg) it2.next()).LIZIZ.id, iMQuickReply.id)) {
                        if (i >= 0 && i < ((ArrayList) c1807480x8U.LL).size()) {
                            ListProtector.remove(c1807480x8U.LL, i);
                            c1807480x8U.notifyItemMoved(i, i);
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1784070wWj
    public void setActionListener(Function2<? super EnumC1784170wWt, ? super IMQuickReply, Unit> function2) {
        this.LLILLL = function2;
    }

    @Override // X.InterfaceC1784070wWj
    public void setData(List<C1784040wWg> list) {
        int itemCount;
        C1807480x8U c1807480x8U = this.LLILLJJLI;
        if (c1807480x8U != null) {
            ((ArrayList) c1807480x8U.LL).clear();
            ((ArrayList) c1807480x8U.LL).addAll(list);
            c1807480x8U.notifyDataSetChanged();
        }
        C1670506gR c1670506gR = C1670506gR.LIZ;
        Long lValueOf = Long.valueOf(C461720I8s.LIZJ());
        C1807480x8U c1807480x8U2 = this.LLILLJJLI;
        if (c1807480x8U2 != null) {
            itemCount = c1807480x8U2.getItemCount();
        } else {
            itemCount = -1;
        }
        Pair<Long, Integer> pair = new Pair<>(lValueOf, Integer.valueOf(itemCount));
        c1670506gR.getClass();
        C1670506gR.LJ = pair;
    }

    @Override // X.InterfaceC1784070wWj
    public void setOnViewAttachLister(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public C1836800xtm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1115));
        this.LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1113));
        this.LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1114));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1e, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        RecyclerView recyclerView = new RecyclerView(context);
        this.LL = recyclerView;
        C1807480x8U c1807480x8U = new C1807480x8U();
        c1807480x8U.LLILLJJLI = getQuickAction();
        c1807480x8U.LLILLL = new AwS606S0100000_27(this, 357);
        this.LLILLJJLI = c1807480x8U;
        recyclerView.setAdapter(c1807480x8U);
        getItemTouchHelper().LJ(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        C786410Ut5.p6(this.LL, new ViewGroup.MarginLayoutParams(-1, -2));
        addView(recyclerView);
        C0VWN.LIZ("quick_reply_list", false).LIZIZ(recyclerView);
        recyclerView.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0xto
            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
            }

            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                Function0<Unit> function0 = this.LL.LLILZ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }
}
