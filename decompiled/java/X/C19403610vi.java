package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS163S0100000_29;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19403610vi extends AbstractC21673619ry<C19403710vj> {
    public final InterfaceC19403810vk LL;
    public List<C19404010vm> LLILLJJLI;
    public final boolean LLILLL;
    public Integer LLILZ;

    public C19403610vi() {
        throw null;
    }

    public final int LLLFZ() {
        C19423210ys.LIZ.getClass();
        int i = (Intrinsics.LJFF(C19423210ys.LIZIZ, "live_take_page") && C0C64.LJIILLIIL().LJIJ(31744, 0, "live_navi_avatar_auto_creation", true) == 1) ? 3 : 2;
        return !this.LLILLL ? i - 2 : i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<C19404010vm> list = this.LLILLJJLI;
        return (list == null ? 20 : list.size()) + LLLFZ();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < 2 && this.LLILLL) {
            return 0;
        }
        if (i != 2 ? i == 0 : this.LLILLL) {
            C19423210ys.LIZ.getClass();
            if (Intrinsics.LJFF(C19423210ys.LIZIZ, "live_take_page") && C0C64.LJIILLIIL().LJIJ(31744, 0, "live_navi_avatar_auto_creation", true) == 1) {
                return 3;
            }
        }
        return 1;
    }

    public C19403610vi(InterfaceC19403810vk interfaceC19403810vk, boolean z) {
        this.LL = interfaceC19403810vk;
        this.LLILLJJLI = null;
        this.LLILLL = z;
        this.LLILZ = null;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C19404010vm c19404010vm;
        Drawable drawableLIZIZ;
        C19403710vj c19403710vj = (C19403710vj) viewHolder;
        boolean z = true;
        if (getItemViewType(i) == 1) {
            List<C19404010vm> list = this.LLILLJJLI;
            if (list != null && (c19404010vm = (C19404010vm) ListProtector.get(list, i - LLLFZ())) != null) {
                InterfaceC19403810vk interfaceC19403810vk = this.LL;
                int iLIZ = c19404010vm.LIZ();
                Integer num = this.LLILZ;
                if (num == null || iLIZ != num.intValue()) {
                    z = false;
                }
                View view = c19403710vj.itemView;
                if (z) {
                    drawableLIZIZ = C800330VaR.LIZIZ(view.getContext(), R.drawable.d05);
                } else {
                    drawableLIZIZ = C800330VaR.LIZIZ(view.getContext(), R.drawable.d04);
                }
                view.setBackground(drawableLIZIZ);
                C786410Ut5.I7(new ACListenerS131S0200000_29(interfaceC19403810vk, c19404010vm, 66), c19403710vj.itemView);
                C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(c19404010vm.LIZIZ));
                c1331670kl3LJI.LJJIJL(c19403710vj.LL.getContext());
                c1331670kl3LJI.LJJ(c19403710vj.LL);
                C786410Ut5.h3(c1331670kl3LJI);
                return;
            }
            return;
        }
        if (getItemViewType(i) != 3) {
            return;
        }
        C786410Ut5.I7(new ACListenerS163S0100000_29(this, 318), c19403710vj.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd;
        if (i != 0) {
            if (i != 3) {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ehe, viewGroup, false);
            } else {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eh_, viewGroup, false);
            }
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ehd, viewGroup, false);
        }
        C19403710vj c19403710vj = new C19403710vj(viewTd);
        try {
            View view = c19403710vj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19403710vj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19403710vj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19403710vj.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19403710vj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19403710vj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19403710vj.class.getName();
        return c19403710vj;
    }
}
