package X;

import Y.ACListenerS52S0101000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0TRm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746880TRm extends AbstractC21673619ry<C746890TRn> {
    public final List<LiveEventStruct> LL;
    public InterfaceC746870TRl LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C746880TRm(List<LiveEventStruct> list) {
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C746890TRn c746890TRn = (C746890TRn) viewHolder;
        LiveEventStruct liveEventStruct = (LiveEventStruct) ListProtector.get(this.LL, i);
        c746890TRn.LLILLJJLI.setText(liveEventStruct.getTitle());
        c746890TRn.LLILLL.setText(C2215101Bmm.LJIIIIZZ(liveEventStruct.getStartTime()));
        if (i == getItemCount() - 1) {
            C786410Ut5.LJLLLLLL(4, c746890TRn.LLILZ);
        }
        C786410Ut5.I7(new ACListenerS52S0101000_12(this, i, 9), c746890TRn.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C746890TRn c746890TRn = new C746890TRn(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eem, viewGroup, false));
        try {
            View view = c746890TRn.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c746890TRn.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c746890TRn.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C746890TRn.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c746890TRn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c746890TRn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C746890TRn.class.getName();
        return c746890TRn;
    }
}
