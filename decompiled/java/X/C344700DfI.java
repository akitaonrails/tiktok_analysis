package X;

import Y.ACListenerS139S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notification.SystemNotificationUnsubscribeSettingFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0DfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344700DfI extends AbstractC21673619ry<C344710DfJ> {
    public final Fragment LL;
    public List<GroupUnsubscribeSetting> LLILLJJLI;
    public final ACListenerS139S0100000_4 LLILLL = new ACListenerS139S0100000_4(this, 0);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<GroupUnsubscribeSetting> list = this.LLILLJJLI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C344700DfI(SystemNotificationUnsubscribeSettingFragment systemNotificationUnsubscribeSettingFragment) {
        this.LL = systemNotificationUnsubscribeSettingFragment;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        GroupUnsubscribeSetting groupUnsubscribeSetting;
        C344710DfJ c344710DfJ = (C344710DfJ) viewHolder;
        List<GroupUnsubscribeSetting> list = this.LLILLJJLI;
        if (list != null && (groupUnsubscribeSetting = (GroupUnsubscribeSetting) ListProtector.get(list, i)) != null) {
            c344710DfJ.getClass();
            if (C960203pA.LIZIZ(ActivityStack.getTopActivity())) {
                C1324840ka2.LJFF((RemoteImageView) c344710DfJ.LL.getValue(), groupUnsubscribeSetting.imageUrlDark);
            } else {
                C1324840ka2.LJFF((RemoteImageView) c344710DfJ.LL.getValue(), groupUnsubscribeSetting.imageUrl);
            }
            ((TextView) c344710DfJ.LLILLJJLI.getValue()).setText(groupUnsubscribeSetting.name);
            c344710DfJ.itemView.setTag(Integer.valueOf(i));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C344710DfJ c344710DfJ = new C344710DfJ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.abf, viewGroup, false));
        C786410Ut5.I7(this.LLILLL, c344710DfJ.itemView);
        try {
            View view = c344710DfJ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c344710DfJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c344710DfJ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C344710DfJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c344710DfJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c344710DfJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C344710DfJ.class.getName();
        return c344710DfJ;
    }
}
