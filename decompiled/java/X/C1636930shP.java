package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol.ICreateTabFillScreenAdapter;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AwS639S0100000_25;

/* JADX INFO: renamed from: X.0shP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636930shP extends AbstractC21673619ry<C1636940shQ> implements ICreateTabFillScreenAdapter {
    public final C1664960tQc LL;
    public final ICreateTabFillScreenAdapter.FakeEffect LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return 10086;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol.ICreateTabFillScreenAdapter
    public final ICreateTabFillScreenAdapter.FakeEffect getItem() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol.ICreateTabFillScreenAdapter
    public final ICreateTabFillScreenAdapter LLJJJIL(Map<String, String> map) {
        Iterator<C1636960shS> it2 = this.LLILLJJLI.getShowParamsList().iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ.putAll(map);
        }
        return this;
    }

    public C1636930shP(C1664960tQc c1664960tQc, C1636960shS c1636960shS) {
        this.LL = c1664960tQc;
        this.LLILLJJLI = new ICreateTabFillScreenAdapter.FakeEffect(Collections.singletonList(c1636960shS));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1669670tYD.LJ(((C1636940shQ) viewHolder).LL, EnumC1427810nG7.Dark, new C19719212De(-868104175, new AwS639S0100000_25(this, 140), true));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1636940shQ c1636940shQ = new C1636940shQ(new ComposeView(viewGroup.getContext(), null, 6));
        try {
            View view = c1636940shQ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1636940shQ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1636940shQ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1636940shQ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1636940shQ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1636940shQ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1636940shQ.class.getName();
        return c1636940shQ;
    }
}
