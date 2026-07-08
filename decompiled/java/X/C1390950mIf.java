package X;

import Y.ACListenerS155S0100000_21;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.adaptive.TuxModal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0mIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390950mIf extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final C19EG LL;
    public final int LLILLJJLI = 4;
    public final List<C1687890u1b> LLILLL = new ArrayList();
    public TuxModal LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        int size = ((ArrayList) this.LLILLL).size();
        int i = this.LLILLJJLI;
        return size > i + 1 ? i + 1 : ((ArrayList) this.LLILLL).size();
    }

    public C1390950mIf(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = this.LLILLJJLI;
        if (i == i2) {
            C1687890u1b c1687890u1b = new C1687890u1b(R.raw.icon_ellipsis_horizontal, R.raw.icon_ellipsis_horizontal, R.string.loy, false, "login_3p_more_options", false, 0, false, new ACListenerS155S0100000_21(this, 258), 232);
            ListProtector.add(this.LLILLL, i, c1687890u1b);
            ((C1390960mIg) viewHolder).I5(c1687890u1b);
        } else {
            if (i > i2) {
                return;
            }
            ((C1390960mIg) viewHolder).I5((C1687890u1b) ListProtector.get(this.LLILLL, i));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            C1390960mIg c1390960mIg = new C1390960mIg(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.zj, viewGroup, false));
            try {
                View view = c1390960mIg.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            c1390960mIg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
            try {
                if (c1390960mIg.itemView.getParent() != null) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(C1390960mIg.class.getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C1AF0.LIZJ(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c1390960mIg.itemView.getParent();
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(c1390960mIg.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2081408Dk.LIZ(e2);
                C2344809Gs.LIZ(e2);
            }
            C20612085q.LIZ = C1390960mIg.class.getName();
            return c1390960mIg;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unknown view type ");
        sbLIZ.append(i);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
