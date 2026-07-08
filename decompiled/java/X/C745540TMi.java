package X;

import Y.ACListenerS52S0101000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0TMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745540TMi extends AbstractC21673619ry<C745550TMj> {
    public final InterfaceC745530TMh LL;
    public List<BlockWordRecommend> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<BlockWordRecommend> list = this.LLILLJJLI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C745540TMi(C0TY5 c0ty5) {
        this.LL = c0ty5;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        BlockWordRecommend blockWordRecommend;
        float f;
        int i2;
        C745550TMj c745550TMj = (C745550TMj) viewHolder;
        List<BlockWordRecommend> list = this.LLILLJJLI;
        if (list != null && (blockWordRecommend = (BlockWordRecommend) ListProtector.get(list, i)) != null) {
            C16F5 c16f5 = c745550TMj.LLILZ;
            if (c16f5 != null) {
                c16f5.setText(blockWordRecommend.content);
            }
            View view = c745550TMj.LL;
            if (view != null) {
                C786410Ut5.I7(new ACListenerS52S0101000_12(this, i, blockWordRecommend, 3), view);
            }
            boolean z = blockWordRecommend.selected;
            View view2 = c745550TMj.LLILLL;
            int i3 = 8;
            if (view2 != null) {
                if (z) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                C786410Ut5.LJLLLLLL(i2, view2);
            }
            View view3 = c745550TMj.LLILLJJLI;
            if (view3 != null) {
                if (z) {
                    i3 = 0;
                }
                C786410Ut5.LJLLLLLL(i3, view3);
            }
            C16F5 c16f52 = c745550TMj.LLILZ;
            if (c16f52 != null) {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.34f;
                }
                C786410Ut5.k5(c16f52, f);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C745550TMj c745550TMj = new C745550TMj(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqn, viewGroup, false));
        try {
            View view = c745550TMj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c745550TMj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c745550TMj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C745550TMj.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c745550TMj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c745550TMj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C745550TMj.class.getName();
        return c745550TMj;
    }
}
