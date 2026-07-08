package X;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.112T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C112T<VH extends RecyclerView.ViewHolder> extends AbstractC21673619ry<VH> {
    public final EffectDownloadController LL;
    public final List<EffectModel> LLILLJJLI = new ArrayList();
    public final List<Integer> LLILLL = new ArrayList();

    public C112T(EffectDownloadController effectDownloadController) {
        this.LL = effectDownloadController;
    }

    public final void LLLI(List<? extends EffectModel> list) {
        EffectDownloadController effectDownloadController;
        int i;
        if (list == null) {
            return;
        }
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        ((ArrayList) this.LLILLL).clear();
        for (EffectModel effectModel : (ArrayList) this.LLILLJJLI) {
            if (C2286708xd.LIZJ(effectModel.resDir)) {
                i = 16;
            } else {
                EffectDownloadController effectDownloadController2 = this.LL;
                if ((effectDownloadController2 != null && effectDownloadController2.LIZJ(effectModel)) || ((effectDownloadController = this.LL) != null && effectDownloadController.LIZLLL(effectModel))) {
                    i = 8;
                } else {
                    i = 2;
                }
            }
            ((ArrayList) this.LLILLL).add(Integer.valueOf(i));
        }
        notifyDataSetChanged();
    }

    public final void LLLFZ(int i, int i2) {
        if (((ArrayList) this.LLILLL).size() <= i || ((Number) ListProtector.get(this.LLILLL, i)).intValue() == i2) {
            return;
        }
        ListProtector.set(this.LLILLL, i, Integer.valueOf(i2));
        notifyItemChanged(i);
    }
}
