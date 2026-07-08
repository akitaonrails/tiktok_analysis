package X;

import Y.ACListenerS52S0101000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745510TMf extends AbstractC21673619ry<C745520TMg> {
    public final InterfaceC745530TMh LL;
    public List<BlockWordRecommend> LLILLJJLI = new ArrayList();
    public final C20743516Fd LLILLL = C20736316Cj.LIZLLL(R.attr.eny, C176600m4.LIZ());
    public final C20743516Fd LLILZ = C20736316Cj.LIZLLL(R.attr.e_6, C176600m4.LIZ());

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C745510TMf(C0TY6 c0ty6) {
        this.LL = c0ty6;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C20743516Fd c20743516Fd;
        C745520TMg c745520TMg = (C745520TMg) viewHolder;
        int iLIZJ = C20736316Cj.LIZJ(R.attr.ezq, c745520TMg.itemView);
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezy, C176600m4.LIZ());
        C16F5 c16f5 = c745520TMg.LL;
        if (c16f5 != null) {
            c16f5.setText(((BlockWordRecommend) ListProtector.get(this.LLILLJJLI, i)).content);
            if (((BlockWordRecommend) ListProtector.get(this.LLILLJJLI, i)).selected) {
                c16f5.setTextColor(iLIZJ);
            } else {
                c16f5.setTextColor(iLIZIZ);
            }
        }
        LiveIconView liveIconView = c745520TMg.LLILLJJLI;
        if (liveIconView != null) {
            if (((BlockWordRecommend) ListProtector.get(this.LLILLJJLI, i)).selected) {
                c20743516Fd = this.LLILLL;
            } else {
                c20743516Fd = this.LLILZ;
            }
            liveIconView.setIcon(c20743516Fd);
        }
        C786410Ut5.I7(new ACListenerS52S0101000_12(this, i, 2), c745520TMg.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C745520TMg c745520TMg = new C745520TMg(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g4i, viewGroup, false));
        try {
            View view = c745520TMg.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c745520TMg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c745520TMg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C745520TMg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c745520TMg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c745520TMg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C745520TMg.class.getName();
        return c745520TMg;
    }
}
