package X;

import Y.ACListenerS128S0200000_26;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0uvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1722370uvD extends AbstractC21673619ry<C1722390uvF> implements Filterable {
    public final int LL = R.layout.acd;
    public ArrayList<C1722410uvH> LLILLJJLI = new ArrayList<>();
    public final ArrayList<C1722410uvH> LLILLL;
    public Context LLILZ;
    public C1722430uvJ LLILZIL;

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new C1722380uvE(this);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1722370uvD(ArrayList arrayList) {
        ArrayList<C1722410uvH> arrayList2 = new ArrayList<>();
        this.LLILLL = arrayList2;
        if (arrayList != null) {
            this.LLILLJJLI.addAll(arrayList);
            arrayList2.addAll(arrayList);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1722390uvF c1722390uvF = (C1722390uvF) viewHolder;
        C1722410uvH c1722410uvH = (C1722410uvH) ListProtector.get(this.LLILLJJLI, i);
        if (i != 0 && TextUtils.equals(((C1722410uvH) ListProtector.get(this.LLILLJJLI, i - 1)).LIZIZ, c1722410uvH.LIZIZ)) {
            C786410Ut5.LLIL(c1722390uvF.LL, 8);
        } else {
            C786410Ut5.LLIL(c1722390uvF.LL, 0);
            c1722390uvF.LL.setText(c1722410uvH.LIZIZ);
        }
        if (!TextUtils.isEmpty(c1722410uvH.LJ)) {
            c1722390uvF.LLILLJJLI.setText(c1722410uvH.LJ);
        } else {
            Context context = this.LLILZ;
            if (context != null && !TextUtils.isEmpty(context.getResources().getString(c1722410uvH.LIZ))) {
                c1722390uvF.LLILLJJLI.setText(context.getResources().getString(c1722410uvH.LIZ));
            }
        }
        c1722390uvF.LLILLL.setText(c1722410uvH.LIZLLL);
        C786410Ut5.I7(new ACListenerS128S0200000_26(this, c1722410uvH, 29), c1722390uvF.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewSd = C786410Ut5.Sd(this.LL, C786410Ut5.ne(viewGroup.getContext()), null);
        this.LLILZ = viewGroup.getContext();
        C1722390uvF c1722390uvF = new C1722390uvF(viewSd);
        try {
            View view = c1722390uvF.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1722390uvF.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1722390uvF.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1722390uvF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1722390uvF.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1722390uvF.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1722390uvF.class.getName();
        return c1722390uvF;
    }
}
