package X;

import Y.ACListenerS53S0201000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10vT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19402110vT extends AbstractC21673619ry<C19402210vU> {
    public final int LL;
    public final ArrayList<C19425110zB> LLILLJJLI;
    public final ArrayList<InterfaceC19426310zN> LLILLL;
    public final int LLILZ;
    public final InterfaceC19402410vW LLILZIL;
    public final Function1<InterfaceC19402510vX, Boolean> LLILZLL;
    public final Function1<InterfaceC19402510vX, Integer> LLIZ;
    public RecyclerView LLIZLLLIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size() + this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLIZLLLIL = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final InterfaceC19402510vX interfaceC19402510vX;
        final int i2;
        String string;
        C19402210vU c19402210vU = (C19402210vU) viewHolder;
        if (i >= this.LLILLJJLI.size()) {
            interfaceC19402510vX = (InterfaceC19402510vX) ListProtector.get(this.LLILLL, i - this.LLILLJJLI.size());
        } else {
            interfaceC19402510vX = (InterfaceC19402510vX) ListProtector.get(this.LLILLJJLI, i);
        }
        String strLIZIZ = interfaceC19402510vX.LIZIZ();
        final boolean zBooleanValue = this.LLILZLL.invoke(interfaceC19402510vX).booleanValue();
        int i3 = 0;
        if (interfaceC19402510vX.getCategory().LIZIZ() != null) {
            i2 = 2;
        } else if (!r1.LIZ().isEmpty()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.LLILZ == 1) {
            View view = c19402210vU.LLILZ;
            if (!zBooleanValue) {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, view);
            float f = 22.0f * c19402210vU.itemView.getContext().getResources().getDisplayMetrics().density;
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331750klB.LJ = f;
            C1331730kl9 c1331730kl9 = new C1331730kl9(c1331750klB);
            c19402210vU.LLILLL.setCircleOptions(c1331730kl9);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLIZIZ);
            c1331670kl3LJIIIZ.LJJIJL(c19402210vU.LLILLL.getContext());
            c1331670kl3LJIIIZ.LJJ(c19402210vU.LLILLL);
            c1331670kl3LJIIIZ.LJJI = c1331730kl9;
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            C786410Ut5.I7(new ACListenerS53S0201000_29(this, i, interfaceC19402510vX, 5), c19402210vU.itemView);
            return;
        }
        if (zBooleanValue) {
            c19402210vU.LL.setBackgroundResource(R.drawable.czv);
            View view2 = c19402210vU.LLILZIL;
            if (i2 == 0) {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, view2);
            TuxTextView tuxTextView = c19402210vU.LLILZLL;
            if (i2 != 1) {
                if (i2 != 2) {
                    string = null;
                } else {
                    string = c19402210vU.itemView.getResources().getString(2131827164);
                }
            } else {
                string = c19402210vU.itemView.getResources().getString(2131821601);
            }
            tuxTextView.setText(string);
        } else {
            c19402210vU.LL.setBackgroundResource(0);
            C786410Ut5.LJLLLLLL(8, c19402210vU.LLILZIL);
        }
        C1331670kl3 c1331670kl3LJIIIZ2 = C1331660kl2.LJIIIZ(strLIZIZ);
        c1331670kl3LJIIIZ2.LJJIJL(c19402210vU.LLILLJJLI.getContext());
        c1331670kl3LJIIIZ2.LJJ(c19402210vU.LLILLJJLI);
        C786410Ut5.h3(c1331670kl3LJIIIZ2);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.10vV
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                if (zBooleanValue) {
                    this.LLILZIL.O2(interfaceC19402510vX, i2);
                    return;
                }
                C19402110vT c19402110vT = this;
                c19402110vT.notifyItemChanged(c19402110vT.LLIZ.invoke(interfaceC19402510vX).intValue());
                this.LLILZIL.u(interfaceC19402510vX);
                this.notifyItemChanged(i);
            }
        }, c19402210vU.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19402210vU c19402210vU;
        if (this.LLILZ == 1) {
            int iLJIIIIZZ = C14KQ.LJIIIIZZ(viewGroup.getContext());
            c19402210vU = new C19402210vU(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.egz, viewGroup, false));
            if (iLJIIIIZZ < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)) * 6) {
                c19402210vU.itemView.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47));
                c19402210vU.itemView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(47));
                C426750GoL.LJIIL(c19402210vU.itemView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))), 16);
            }
        } else {
            RecyclerView recyclerView = this.LLIZLLLIL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            int measuredWidth = recyclerView.getMeasuredWidth();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            int i2 = this.LL;
            int i3 = (measuredWidth - (iLIZIZ * (i2 + 1))) / i2;
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eh0, viewGroup, false);
            viewTd.getLayoutParams().width = i3;
            viewTd.getLayoutParams().height = i3;
            c19402210vU = new C19402210vU(viewTd);
        }
        try {
            View view = c19402210vU.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19402210vU.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19402210vU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19402210vU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19402210vU.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19402210vU.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19402210vU.class.getName();
        return c19402210vU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19402110vT(int i, ArrayList<C19425110zB> arrayList, ArrayList<InterfaceC19426310zN> arrayList2, int i2, InterfaceC19402410vW interfaceC19402410vW, Function1<? super InterfaceC19402510vX, Boolean> function1, Function1<? super InterfaceC19402510vX, Integer> function12) {
        this.LL = i;
        this.LLILLJJLI = arrayList;
        this.LLILLL = arrayList2;
        this.LLILZ = i2;
        this.LLILZIL = interfaceC19402410vW;
        this.LLILZLL = function1;
        this.LLIZ = function12;
    }
}
