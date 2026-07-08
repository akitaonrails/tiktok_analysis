package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635630OwT extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<AuthorizedScope> LL = new ArrayList();
    public final List<OAuthScope> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((AuthorizedScope) ListProtector.get(this.LL, i)).scopeRequired != null && Intrinsics.LJFF(((AuthorizedScope) ListProtector.get(this.LL, i)).scopeRequired, Boolean.TRUE)) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean zBooleanValue;
        if (viewHolder instanceof C635650OwV) {
            ((C635650OwV) viewHolder).LLILLJJLI.setText(((AuthorizedScope) ListProtector.get(this.LL, i)).scopeDesc);
            return;
        }
        C635640OwU c635640OwU = (C635640OwU) viewHolder;
        AuthorizedScope authorizedScope = (AuthorizedScope) ListProtector.get(this.LL, i);
        c635640OwU.LLILLJJLI.setTitle(authorizedScope.scopeDesc);
        C127A c127a = c635640OwU.LLILLL;
        Boolean boolIsEnabled = authorizedScope.isEnabled();
        if (boolIsEnabled != null) {
            zBooleanValue = boolIsEnabled.booleanValue();
        } else {
            zBooleanValue = true;
        }
        c127a.LJIILJJIL(zBooleanValue);
        c635640OwU.LLILLL.LJIILLIIL(new C0P4M(authorizedScope, 6));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c635640OwU;
        if (i == 0) {
            c635640OwU = new C635650OwV(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.es8, viewGroup, false));
        } else {
            c635640OwU = new C635640OwU(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.es9, viewGroup, false));
        }
        try {
            View view = c635640OwU.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c635640OwU.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c635640OwU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c635640OwU.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c635640OwU.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c635640OwU.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c635640OwU.getClass().getName();
        return c635640OwU;
    }
}
