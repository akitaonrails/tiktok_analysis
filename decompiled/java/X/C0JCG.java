package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.viewmodel.SubSpaceEditorVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import wh6.AbS499S0200000_7;

/* JADX INFO: renamed from: X.0JCG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JCG extends AbstractC21673619ry<C0JCH> {
    public final ArrayList<User> LL;
    public final SubSpaceEditorVM LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0JCG(ArrayList<User> arrayList, SubSpaceEditorVM subSpaceEditorVM) {
        this.LL = arrayList;
        this.LLILLJJLI = subSpaceEditorVM;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0JCH c0jch = (C0JCH) viewHolder;
        User user = (User) ListProtector.get(this.LL, i);
        c0jch.LL.setText(C0K7S.LIZ(user));
        c0jch.LLILLJJLI.setText(user.getUsername());
        C511410K3v.LIZ(c0jch.LLILLL, user, (int) C511520K4g.LIZ(40.0f));
        C786410Ut5.I7(new AbS499S0200000_7(this, user, 4), c0jch.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0JCH c0jch = new C0JCH(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fi_, viewGroup, false));
        try {
            View view = c0jch.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0jch.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0jch.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0JCH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0jch.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0jch.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0JCH.class.getName();
        return c0jch;
    }
}
