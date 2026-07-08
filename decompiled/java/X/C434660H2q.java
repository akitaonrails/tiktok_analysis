package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0H2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434660H2q extends AbstractC21673619ry<C425510GmL> {
    public final Lifecycle LL;
    public List<? extends InterfaceC434700H2u> LLILLJJLI;
    public final InterfaceC432280GxG LLILLL;
    public final InterfaceC425460GmG LLILZ;

    public C434660H2q() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            return ((InterfaceC434700H2u) ListProtector.get(this.LLILLJJLI, i)).LIZ();
        }
        return super.getItemViewType(i);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LL), null, null, new C432480Gxa((C425510GmL) viewHolder, this, null), 3);
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(this.LL), null, null, new C432470GxZ((C425510GmL) viewHolder, this, null), 3);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C425510GmL c425510GmL = (C425510GmL) viewHolder;
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            c425510GmL.I5((InterfaceC434700H2u) ListProtector.get(this.LLILLJJLI, i), i);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C425510GmL c425510GmLLIZ = this.LLILZ.LIZ(viewGroup, i, this.LL, this.LLILLL);
        if (c425510GmLLIZ != null) {
            try {
                View view = c425510GmLLIZ.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c425510GmLLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c425510GmLLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c425510GmLLIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c425510GmLLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c425510GmLLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c425510GmLLIZ.getClass().getName();
        return c425510GmLLIZ;
    }

    public C434660H2q(Lifecycle lifecycle, List list, InterfaceC432280GxG interfaceC432280GxG) {
        C425450GmF c425450GmF = InterfaceC425460GmG.LIZ;
        this.LL = lifecycle;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC432280GxG;
        this.LLILZ = c425450GmF;
    }
}
