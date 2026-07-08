package X;

import Y.ACListenerS163S0100000_29;
import Y.ACListenerS93S0300000_29;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS167S0101000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10vC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19400410vC extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final View LL;
    public final Function0<Unit> LLILLJJLI;
    public final List<C19400610vE> LLILLL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public C19400410vC(RecyclerView recyclerView, C746560TQg c746560TQg) {
        this.LL = recyclerView;
        this.LLILLJJLI = c746560TQg;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        List<String> urlList;
        if (viewHolder instanceof C19400510vD) {
            C19400510vD c19400510vD = (C19400510vD) viewHolder;
            View view = this.LL;
            C19400610vE c19400610vE = (C19400610vE) ListProtector.get(this.LLILLL, i);
            AwS167S0101000_29 awS167S0101000_29 = new AwS167S0101000_29(this, i, 5);
            c19400510vD.getClass();
            if (Intrinsics.LJFF(c19400610vE.LIZLLL, Boolean.TRUE)) {
                C786410Ut5.T4(c19400510vD.itemView, 0.34f);
            } else {
                C786410Ut5.T4(c19400510vD.itemView, 1.0f);
            }
            c19400510vD.LL.setText(c19400610vE.LIZIZ);
            SmartImageView smartImageView = c19400510vD.LLILLJJLI;
            UrlModel urlModel = c19400610vE.LIZJ;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJJZI(urlList)) == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            if (c19400610vE.LJFF != null) {
                C786410Ut5.LLLLLLZZ(c19400510vD.LLILLL, 0);
                C786410Ut5.a9(c19400510vD.LLILLL, new ACListenerS93S0300000_29(c19400510vD, awS167S0101000_29, c19400610vE, 2));
                C786410Ut5.I7(new ACListenerS163S0100000_29(c19400610vE, 183), c19400510vD.itemView);
            } else {
                C786410Ut5.LLLLLLZZ(c19400510vD.LLILLL, 8);
                C786410Ut5.I7(new ACListenerS93S0300000_29(c19400510vD, view, c19400610vE, 3), c19400510vD.itemView);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19400510vD c19400510vD = new C19400510vD(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwm, viewGroup, false));
        try {
            View view = c19400510vD.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19400510vD.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19400510vD.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19400510vD.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19400510vD.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19400510vD.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19400510vD.class.getName();
        return c19400510vD;
    }
}
