package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935170aRX extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function1<GuestInvitePanelResp.ListUser, Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final List<GuestInvitePanelResp.ListUser> LLILLL = new ArrayList();
    public final Set<Long> LLILZ = new LinkedHashSet();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        User user;
        Long lValueOf;
        GuestInvitePanelResp.ListUser listUser = (GuestInvitePanelResp.ListUser) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (listUser != null && (user = listUser.user) != null && (lValueOf = Long.valueOf(user.getId())) != null) {
            return lValueOf.longValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("quick_invite_more_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ).hashCode();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((ArrayList) this.LLILLL).size() < 7 || i < 6) {
            return 0;
        }
        return 1;
    }

    public C935170aRX(C919080a1a c919080a1a, C932570aNL c932570aNL) {
        this.LL = c919080a1a;
        this.LLILLJJLI = c932570aNL;
        setHasStableIds(true);
    }

    public final void LLLI(long j, boolean z) {
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        int i = 0;
        while (it2.hasNext()) {
            User user = ((GuestInvitePanelResp.ListUser) it2.next()).user;
            if (user != null && user.getId() == j) {
                if (i >= 0) {
                    GuestInvitePanelResp.ListUser listUser = (GuestInvitePanelResp.ListUser) ListProtector.get(this.LLILLL, i);
                    if (listUser.invited == z) {
                        return;
                    }
                    listUser.invited = z;
                    if (z) {
                        this.LLILZ.remove(Long.valueOf(j));
                    }
                    notifyItemChanged(i, "payload_item_state_changed");
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LLLII(long j, boolean z) {
        boolean zRemove;
        if (z) {
            zRemove = this.LLILZ.add(Long.valueOf(j));
        } else {
            zRemove = this.LLILZ.remove(Long.valueOf(j));
        }
        if (!zRemove) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLILLL).iterator();
        int i = 0;
        while (it2.hasNext()) {
            User user = ((GuestInvitePanelResp.ListUser) it2.next()).user;
            if (user != null && user.getId() == j) {
                if (i >= 0) {
                    notifyItemChanged(i, "payload_item_state_changed");
                    return;
                }
                return;
            }
            i++;
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LLLFZ(viewHolder, i, true);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c935180aRY;
        if (i != 0) {
            if (i == 1) {
                c935180aRY = new C935190aRZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hd_, viewGroup, false), this.LLILLJJLI);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown viewType: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            c935180aRY = new C935180aRY(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hd9, viewGroup, false), this.LL);
        }
        try {
            View view = c935180aRY.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c935180aRY.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c935180aRY.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c935180aRY.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c935180aRY.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c935180aRY.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c935180aRY.getClass().getName();
        return c935180aRY;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLFZ(androidx.recyclerview.widget.RecyclerView.ViewHolder r18, int r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C935170aRX.LLLFZ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, boolean):void");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        if (list.contains("payload_item_state_changed")) {
            LLLFZ(viewHolder, i, false);
        } else {
            super.onBindViewHolder(viewHolder, i, list);
        }
    }
}
