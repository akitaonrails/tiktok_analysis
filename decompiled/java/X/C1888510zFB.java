package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.BadgeIcon;
import com.bytedance.android.live.base.model.emoji.BadgeIconTab;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0zFB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888510zFB extends AbstractC21673619ry<C1888550zFF> {
    public final Context LL;
    public final InterfaceC1888610zFL LLILLJJLI;
    public BadgeIconTab LLILLL;
    public final List<BadgeIcon> LLILZ = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZ).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((BadgeIcon) ListProtector.get(this.LLILZ, i)).iconType;
    }

    public C1888510zFB(Context context, InterfaceC1888610zFL interfaceC1888610zFL) {
        this.LL = context;
        this.LLILLJJLI = interfaceC1888610zFL;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1888550zFF c1888550zFF = (C1888550zFF) viewHolder;
        final BadgeIcon badgeIcon = (BadgeIcon) ListProtector.get(this.LLILZ, i);
        if (c1888550zFF instanceof C1888530zFD) {
            ((C1888530zFD) c1888550zFF).LL.setText(badgeIcon.iconStr);
        } else if (c1888550zFF instanceof C1888540zFE) {
            C1819620xS4.LIZ().setUrl(badgeIcon.iconUrl).LJJI(((C1888540zFE) c1888550zFF).LL);
        }
        C786410Ut5.W5(c1888550zFF.itemView, new ViewGroup.LayoutParams(-1, (int) C497740JfY.LIZIZ(62.0f)));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0zFC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1888510zFB c1888510zFB = this.LL;
                BadgeIcon badgeIcon2 = badgeIcon;
                BadgeIconTab badgeIconTab = c1888510zFB.LLILLL;
                if (badgeIconTab != null) {
                    c1888510zFB.LLILLJJLI.eG(c1888510zFB.LL, badgeIcon2, badgeIconTab);
                }
            }
        }, c1888550zFF.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1888530zFD;
        if (i == 2) {
            c1888530zFD = new C1888540zFE(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h52, viewGroup, false));
        } else {
            c1888530zFD = new C1888530zFD(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h4z, viewGroup, false));
        }
        try {
            View view = c1888530zFD.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1888530zFD.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1888530zFD.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1888530zFD.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1888530zFD.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1888530zFD.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1888530zFD.getClass().getName();
        return c1888530zFD;
    }
}
