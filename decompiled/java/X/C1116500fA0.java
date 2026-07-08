package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.ChangeSelectItemEvent;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fA0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116500fA0 extends AbstractC21673619ry<AbstractC1116530fA3> implements InterfaceC1116540fA4 {
    public List<C1116450f9v> LL;
    public final DataChannel LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.InterfaceC1116540fA4
    public final void LJJJ(int i) {
        int i2 = -1;
        int i3 = 0;
        for (C1116450f9v c1116450f9v : this.LL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C1116450f9v c1116450f9v2 = c1116450f9v;
                if (c1116450f9v2.LIZLLL) {
                    c1116450f9v2.LIZLLL = false;
                    i2 = i3;
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((C1116450f9v) ListProtector.get(this.LL, i)).LIZLLL = true;
        ((C1116450f9v) ListProtector.get(this.LL, i)).LJII = false;
        if (i2 == i) {
            return;
        }
        notifyItemChanged(i2, "ChangeSelect");
        notifyItemChanged(i, "ChangeSelect");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.LC0(ChangeSelectItemEvent.class, ListProtector.get(this.LL, i));
        }
    }

    public final void LLLFZ(List<C1116450f9v> list) {
        this.LL = list;
        int i = 0;
        for (Object obj : (ArrayList) list) {
            int i2 = i + 1;
            if (i >= 0) {
                if (((C1116450f9v) obj).LIZLLL) {
                    notifyItemChanged(i, "RefreshTime");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public C1116500fA0(DataChannel dataChannel, List list) {
        Boolean bool;
        this.LL = list;
        this.LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C0TZM.class);
        } else {
            bool = null;
        }
        this.LLILLL = C500260Jjc.LJJIJIL(bool);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC1116530fA3) viewHolder).I5((C1116450f9v) ListProtector.get(this.LL, i), new ArrayList());
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1116520fA2;
        if (this.LLILLL) {
            c1116520fA2 = new C1116510fA1(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gvg, viewGroup, false), this);
        } else {
            c1116520fA2 = new C1116520fA2(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gvh, viewGroup, false), this);
        }
        try {
            View view = c1116520fA2.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1116520fA2.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1116520fA2.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1116520fA2.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1116520fA2.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1116520fA2.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1116520fA2.getClass().getName();
        return c1116520fA2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        ((AbstractC1116530fA3) viewHolder).I5((C1116450f9v) ListProtector.get(this.LL, i), list);
    }
}
