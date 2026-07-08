package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tikcast.api.anchor.HostInfo;

/* JADX INFO: renamed from: X.0DM6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DM6 extends AbstractC21673619ry<AbstractC749630Tar> {
    public final InterfaceC750010TbT LL;
    public final List<HostInfo> LLILLJJLI = new ArrayList();
    public final Set<Long> LLILLL = new HashSet();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C0DM6(DataChannel dataChannel, InterfaceC750010TbT interfaceC750010TbT) {
        this.LL = interfaceC750010TbT;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC749630Tar) viewHolder).V2(ListProtector.get(this.LLILLJJLI, i));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C750000TbS c750000TbS = new C750000TbS(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h8s, viewGroup, false), this.LL, this.LLILLL);
        try {
            View view = c750000TbS.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c750000TbS.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c750000TbS.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C750000TbS.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c750000TbS.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c750000TbS.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C750000TbS.class.getName();
        return c750000TbS;
    }
}
