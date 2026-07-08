package X;

import Y.ACListenerS9S1201000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: renamed from: X.0Iuz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481830Iuz extends AbstractC21673619ry<C481840Iv0> {
    public List<ToplivePageItem> LL = new ArrayList();
    public String LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        viewHolder.getClass();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        viewHolder.getClass();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C481840Iv0 c481840Iv0 = (C481840Iv0) viewHolder;
        ToplivePageItem toplivePageItem = (ToplivePageItem) ListProtector.get(this.LL, i);
        String str = this.LLILLJJLI;
        c481840Iv0.LLILLL = toplivePageItem;
        c481840Iv0.LLILLJJLI.setText(toplivePageItem.cardTitle);
        c481840Iv0.LL.setText(C20642515q3.LJFF().getQuantityString(2131756010, toplivePageItem.relatedLiveNumber, C1850730yGF.LIZIZ(toplivePageItem.relatedLiveNumber)));
        String str2 = toplivePageItem.defaultBgUrl;
        if (str2 != null) {
            C1819620xS4.LIZ().setUrl(str2).LJJI(c481840Iv0.itemView);
        }
        C786410Ut5.I7(new ACListenerS9S1201000_7(toplivePageItem, c481840Iv0, i, str, 1), c481840Iv0.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C481840Iv0 c481840Iv0 = new C481840Iv0(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dia, viewGroup, false));
        try {
            View view = c481840Iv0.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c481840Iv0.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c481840Iv0.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C481840Iv0.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c481840Iv0.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c481840Iv0.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C481840Iv0.class.getName();
        return c481840Iv0;
    }
}
