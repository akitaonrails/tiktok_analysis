package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10x8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19412410x8 extends AbstractC21673619ry {
    public boolean LL = true;

    public abstract int getBasicItemCount();

    public abstract void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i);

    public abstract RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i);

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        return this.LL ? getBasicItemCount() + 1 : getBasicItemCount();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (this.LL && i == getBasicItemCount()) {
            return Integer.MIN_VALUE;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C194324110w c194324110w;
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            C19412610xA c19412610xA = (C19412610xA) viewHolder;
            C19412810xC c19412810xC = (C19412810xC) c19412610xA.itemView;
            c19412810xC.setStatus(c19412610xA.LLILLL.LLILLJJLI);
            if (c19412810xC.LLILLJJLI == -1 && (c194324110w = c19412610xA.LLILLL.LLIZ) != null) {
                c194324110w.LJJIFFI();
                return;
            }
            return;
        }
        onBindBasicViewHolder(viewHolder, i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderOnCreateBasicViewHolder;
        if (Integer.MIN_VALUE == i) {
            AbstractC19412510x9 abstractC19412510x9 = (AbstractC19412510x9) this;
            C19412810xC c19412810xC = new C19412810xC(viewGroup.getContext(), null);
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, C418440Gaw.LIZ(46));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19412810xC);
            c19412810xC.setLayoutParams(layoutParams);
            TextView textView = (TextView) C786410Ut5.Sd(R.layout.i9w, C786410Ut5.ne(viewGroup.getContext()), null);
            abstractC19412510x9.LLILLL = textView;
            textView.setGravity(17);
            TextView textView2 = (TextView) C786410Ut5.Sd(R.layout.fus, C786410Ut5.ne(viewGroup.getContext()), null);
            textView2.setText(2131836754);
            textView2.setGravity(17);
            C19412710xB c19412710xBLIZ = C19412710xB.LIZ(viewGroup.getContext());
            c19412710xBLIZ.LIZJ = abstractC19412510x9.LLILLL;
            C786410Ut5.W5(c19412710xBLIZ.LIZJ, new FrameLayout.LayoutParams(-1, -1));
            c19412710xBLIZ.LIZLLL = textView2;
            C786410Ut5.W5(c19412710xBLIZ.LIZLLL, new FrameLayout.LayoutParams(-1, -1));
            c19412810xC.setBuilder(c19412710xBLIZ);
            C19412610xA c19412610xA = new C19412610xA(abstractC19412510x9, c19412810xC, textView2);
            abstractC19412510x9.LLILZLL = c19412610xA;
            viewHolderOnCreateBasicViewHolder = c19412610xA;
        } else {
            viewHolderOnCreateBasicViewHolder = onCreateBasicViewHolder(viewGroup, i);
        }
        if (viewHolderOnCreateBasicViewHolder != null) {
            try {
                View view = viewHolderOnCreateBasicViewHolder.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderOnCreateBasicViewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderOnCreateBasicViewHolder.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderOnCreateBasicViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderOnCreateBasicViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderOnCreateBasicViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderOnCreateBasicViewHolder.getClass().getName();
        return viewHolderOnCreateBasicViewHolder;
    }
}
