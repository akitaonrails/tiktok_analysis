package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0H4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435230H4v extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final int LLILLL;
    public final SubscriptionPrivilegeDetailFragment LLILZ;
    public PopupWindow LLIZ;
    public final /* synthetic */ C508960Jxe LLJ;
    public boolean LLILLJJLI = true;
    public final int LLILZIL = 5;
    public final List<EmoteModel> LLILZLL = new ArrayList();
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C508980Jxg(this));

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI ? this.LLILZIL : ((ArrayList) this.LLILZLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((AbstractC434960H3u) viewHolder).I5(i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.hix, viewGroup, false);
        C508990Jxh c508990Jxh = new C508990Jxh(this, viewTd);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        int i2 = this.LLILLL;
        layoutParams.width = i2;
        layoutParams.height = i2;
        C786410Ut5.W5(viewTd, layoutParams);
        try {
            View view = c508990Jxh.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c508990Jxh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c508990Jxh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C508990Jxh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c508990Jxh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c508990Jxh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C508990Jxh.class.getName();
        return c508990Jxh;
    }

    public C435230H4v(C508960Jxe c508960Jxe, Context context, int i, SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        this.LLJ = c508960Jxe;
        this.LL = context;
        this.LLILLL = i;
        this.LLILZ = subscriptionPrivilegeDetailFragment;
    }
}
