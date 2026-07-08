package X;

import Y.ACListenerS144S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635480OwE extends AbstractC21673619ry<C635460OwC> {
    public GroupUnsubscribeSetting LLILLJJLI;
    public List<UnSubscribeSettingsData> LLILLL;
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(14));
    public final ACListenerS144S0100000_9 LLILZ = new ACListenerS144S0100000_9(this, 4);
    public final ACListenerS144S0100000_9 LLILZIL = new ACListenerS144S0100000_9(this, 5);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<UnSubscribeSettingsData> list = this.LLILLL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ((C11NJ) this.LL.getValue()).LJ();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        UnSubscribeSettingsData unSubscribeSettingsData;
        C635460OwC c635460OwC = (C635460OwC) viewHolder;
        List<UnSubscribeSettingsData> list = this.LLILLL;
        if (list != null && (unSubscribeSettingsData = (UnSubscribeSettingsData) ListProtector.get(list, i)) != null) {
            c635460OwC.LL = unSubscribeSettingsData;
            c635460OwC.LLILLJJLI = i;
            if (C635470OwD.LIZ()) {
                C127K c127k = (C127K) c635460OwC.itemView.findViewById(R.id.txCell);
                if (c127k != null) {
                    c127k.setTitleMaxLines(1);
                    c127k.setTitle(unSubscribeSettingsData.labelTitle);
                }
            } else {
                TextView textView = (TextView) c635460OwC.itemView.findViewById(R.id.z4s);
                if (textView != null) {
                    textView.setText(unSubscribeSettingsData.labelTitle);
                }
            }
            c635460OwC.L5();
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        ACListenerS144S0100000_9 aCListenerS144S0100000_9;
        C11GO c11go;
        if (C635470OwD.LIZ()) {
            i2 = R.layout.ab9;
        } else {
            i2 = R.layout.ab8;
        }
        C635460OwC c635460OwC = new C635460OwC(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i2, viewGroup, false));
        if (C635470OwD.LIZ()) {
            aCListenerS144S0100000_9 = this.LLILZIL;
        } else {
            aCListenerS144S0100000_9 = this.LLILZ;
        }
        if (C635470OwD.LIZ()) {
            C127K c127k = (C127K) c635460OwC.itemView.findViewById(R.id.txCell);
            C127M accessory = null;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            }
            if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                c11go.LJIILLIIL(new C0P4H(c635460OwC, aCListenerS144S0100000_9, 4));
            }
        } else {
            C21411818qq c21411818qq = (C21411818qq) c635460OwC.itemView.findViewById(R.id.yzn);
            if (c21411818qq != null) {
                C786410Ut5.f9(c21411818qq, aCListenerS144S0100000_9);
                c21411818qq.setTag(c635460OwC);
            }
        }
        try {
            View view = c635460OwC.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c635460OwC.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c635460OwC.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C635460OwC.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c635460OwC.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c635460OwC.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C635460OwC.class.getName();
        return c635460OwC;
    }
}
