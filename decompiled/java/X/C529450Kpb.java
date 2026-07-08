package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kpb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529450Kpb extends AbstractC529520Kpi {
    @Override // X.AbstractC529520Kpi
    public final void LLLIILIL(int i, int i2) {
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZ() {
        return -1;
    }

    @Override // X.AbstractC529520Kpi
    public final CutSameVideoImageExtraData LLLJIL() {
        return null;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLIL(ArrayList<CutSameVideoImageExtraData> arrayList) {
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLLIL(TikTokMediaModel tikTokMediaModel) {
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZLLLI() {
        return getItemCount();
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLFZ(TikTokMediaModel tikTokMediaModel) {
        Iterator<TikTokMediaModel> it2 = this.LL.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.LJFF(((MediaModel) it2.next()).id, ((MediaModel) tikTokMediaModel).id)) {
                if (i >= 0) {
                    ListProtector.set(this.LL, i, tikTokMediaModel);
                    notifyItemChanged(i);
                    return;
                }
            } else {
                i++;
            }
        }
        super.LLLFZ(tikTokMediaModel);
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        C529620Kps c529620Kps = new C529620Kps(this, viewGroup) { // from class: X.0Kpm
            @Override // X.C529620Kps
            public final void P5(ViewGroup viewGroup2) {
                int iLIZIZ = (int) C11VU.LIZIZ(64.0f, viewGroup2.getContext());
                R5(iLIZIZ, iLIZIZ, viewGroup2);
            }

            @Override // X.C529620Kps
            public final void L5(TikTokMediaModel tikTokMediaModel, C529620Kps c529620Kps2) {
                super.L5(tikTokMediaModel, c529620Kps2);
            }
        };
        try {
            View view = c529620Kps.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529620Kps.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529620Kps.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C529560Kpm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529620Kps.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529620Kps.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C529560Kpm.class.getName();
        return c529620Kps;
    }
}
