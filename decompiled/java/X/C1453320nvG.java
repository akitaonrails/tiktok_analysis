package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453320nvG extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<C1452010nt9> LL = new ArrayList(0);
    public String LLILLJJLI = "";
    public C1453340nvI LLILLL;
    public InterfaceC1453780nw0 LLILZ;
    public boolean LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final void LLLFZ(String str, boolean z) {
        Iterator it2 = ((ArrayList) this.LL).iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(str, ((C1452010nt9) it2.next()).LIZ)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        C1452010nt9 c1452010nt9 = (C1452010nt9) C13LP.LJJJLZIJ(i, this.LL);
        if (c1452010nt9 != null && c1452010nt9.LIZLLL != z) {
            c1452010nt9.LIZLLL = z;
            notifyItemChanged(i, new Bundle());
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final C1453340nvI c1453340nvI = (C1453340nvI) viewHolder;
        final C1452010nt9 c1452010nt9 = (C1452010nt9) ListProtector.get(this.LL, i);
        c1453340nvI.getClass();
        Integer num = c1452010nt9.LIZIZ;
        if (num != null) {
            c1453340nvI.LLILLJJLI.setIconRes(num.intValue());
        }
        Integer num2 = c1452010nt9.LIZJ;
        if (num2 != null) {
            c1453340nvI.LLILLL.setText(num2.intValue());
        }
        boolean z = c1452010nt9.LIZLLL;
        View view = c1453340nvI.LLILZ;
        if (z) {
            C786410Ut5.LJLLLLLL(0, view);
        } else {
            C786410Ut5.LJLLLLLL(4, view);
        }
        TuxIconView tuxIconView = c1453340nvI.LLILLJJLI;
        tuxIconView.getLayoutParams().width = c1453340nvI.LLILZLL;
        tuxIconView.getLayoutParams().height = c1453340nvI.LLILZLL;
        if (c1453340nvI.LL) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            }
        }
        tuxIconView.setIconHeight(c1453340nvI.LLIZ);
        tuxIconView.setIconWidth(c1453340nvI.LLIZ);
        c1453340nvI.I5(false);
        TuxTextView tuxTextView = c1453340nvI.LLILLL;
        tuxTextView.getLayoutParams().width = c1453340nvI.LLJ;
        tuxTextView.setTuxFont(c1453340nvI.LLIZLLLIL);
        if (Intrinsics.LJFF(this.LLILLJJLI, c1452010nt9.LIZ)) {
            c1453340nvI.I5(true);
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0nvV
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view2) {
                C1453320nvG c1453320nvG = this.LLILZ;
                String str = c1452010nt9.LIZ;
                if (str == null) {
                    str = "";
                }
                c1453320nvG.LLILLJJLI = str;
                C1453340nvI c1453340nvI2 = c1453320nvG.LLILLL;
                if (c1453340nvI2 != null) {
                    c1453340nvI2.I5(false);
                }
                C1453320nvG c1453320nvG2 = this.LLILZ;
                C1453340nvI c1453340nvI3 = c1453340nvI;
                c1453320nvG2.LLILLL = c1453340nvI3;
                c1453340nvI3.I5(true);
                InterfaceC1453780nw0 interfaceC1453780nw0 = this.LLILZ.LLILZ;
                if (interfaceC1453780nw0 != null) {
                    interfaceC1453780nw0.LIZ(i);
                }
            }
        }, c1453340nvI.LLILLJJLI);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1453340nvI c1453340nvI = new C1453340nvI(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvx, viewGroup, false), this.LLILZIL);
        try {
            View view = c1453340nvI.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1453340nvI.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1453340nvI.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1453340nvI.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1453340nvI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1453340nvI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1453340nvI.class.getName();
        return c1453340nvI;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(viewHolder, i);
            return;
        }
        Iterator<Object> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next() instanceof Bundle) {
                boolean z = ((C1452010nt9) ListProtector.get(this.LL, i)).LIZLLL;
                View view = ((C1453340nvI) viewHolder).LLILZ;
                if (z) {
                    C786410Ut5.LJLLLLLL(0, view);
                } else {
                    C786410Ut5.LJLLLLLL(4, view);
                }
            }
        }
    }
}
