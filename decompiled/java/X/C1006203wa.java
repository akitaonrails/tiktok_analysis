package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.v3.SeaPdpRichText;
import com.zhiliaoapp.musically.R;
import g1c.AjS4S0201000_1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: renamed from: X.03wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1006203wa extends AbstractC21673619ry<C1006503wd> {
    public final List<SeaPdpRichText> LL;
    public final Function2<Integer, SeaPdpRichText, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1006203wa(List list, AwS615S0100000_1 awS615S0100000_1) {
        this.LL = list;
        this.LLILLJJLI = awS615S0100000_1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1006503wd c1006503wd = (C1006503wd) viewHolder;
        SeaPdpRichText seaPdpRichText = (SeaPdpRichText) ListProtector.get(this.LL, i);
        C03C8.LIZJ(c1006503wd.LL, seaPdpRichText.richText, "sea_pdp_user_right_v3_item", null);
        C786410Ut5.I7(new AjS4S0201000_1(this, seaPdpRichText, i, 2), c1006503wd.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxTextView.setGravity(16);
        tuxTextView.setTuxFont(71);
        C1006503wd c1006503wd = new C1006503wd(tuxTextView, tuxTextView);
        try {
            View view = c1006503wd.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1006503wd.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1006503wd.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1006503wd.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1006503wd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1006503wd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1006503wd.class.getName();
        return c1006503wd;
    }
}
