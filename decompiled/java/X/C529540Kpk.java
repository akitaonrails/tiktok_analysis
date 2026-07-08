package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kpk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529540Kpk extends AbstractC529520Kpi {
    public final C0L9H LLJIJIL;
    public int LLJILJIL = -1;

    @Override // X.AbstractC529520Kpi
    public final int LLLILZLLLI() {
        int i = 0;
        for (TikTokMediaModel tikTokMediaModel : this.LL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (LLLLIIIILLL(tikTokMediaModel)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLLIILLL() {
        return this.LLJIJIL == C0L9H.LIGHT ? R.drawable.a_i : R.drawable.a_h;
    }

    public static final TikTokMediaModel LLLLLJIL() {
        TikTokMediaModel tikTokMediaModelLIZ = C527250Km3.LIZ().LIZ(UUID.randomUUID().toString(), EnumC538220L8y.MEDIA_STORE);
        tikTokMediaModelLIZ.LJIILL("");
        tikTokMediaModelLIZ.thumbnail = "";
        tikTokMediaModelLIZ.duration = 0L;
        tikTokMediaModelLIZ.type = 4;
        return tikTokMediaModelLIZ;
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZ() {
        int itemCount = getItemCount();
        int i = this.LLJILJIL;
        return (i < 0 || i >= itemCount) ? LLLILZLLLI() : i;
    }

    @Override // X.AbstractC529520Kpi
    public final CutSameVideoImageExtraData LLLJIL() {
        int iLLLILZLLLI = LLLILZLLLI();
        if (iLLLILZLLLI < 0 || iLLLILZLLLI >= this.LLILLJJLI.size()) {
            return null;
        }
        return (CutSameVideoImageExtraData) ListProtector.get(this.LLILLJJLI, iLLLILZLLLI);
    }

    public C529540Kpk(C0L9H c0l9h) {
        this.LLJIJIL = c0l9h;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLFZ(TikTokMediaModel tikTokMediaModel) {
        int i = this.LLJILJIL;
        if (i >= 0 && i < getItemCount()) {
            int i2 = this.LLJILJIL;
            ListProtector.remove(this.LL, i2);
            ListProtector.add(this.LL, i2, tikTokMediaModel);
            this.LLJILJIL = LLLILZLLLI();
            notifyItemChanged(i2);
            int i3 = this.LLJILJIL;
            if (i3 >= 0 && i3 < getItemCount()) {
                notifyItemChanged(this.LLJILJIL);
            }
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return;
        }
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.LJFF(((MediaModel) ListProtector.get(this.LL, i)).LJFF(), tikTokMediaModel.LJFF()) && TextUtils.equals(((TikTokMediaModel) ListProtector.get(this.LL, i)).LJIILLIIL(), tikTokMediaModel.LJIILLIIL())) {
                if (i >= 0) {
                    int i2 = this.LLJILJIL;
                    this.LLJILJIL = i;
                    this.LL.remove(tikTokMediaModel);
                    ListProtector.add(this.LL, i, LLLLLJIL());
                    notifyItemChanged(i);
                    if (i2 >= 0 && i2 < getItemCount()) {
                        notifyItemChanged(i2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLIL(ArrayList<CutSameVideoImageExtraData> arrayList) {
        this.LLILLJJLI = arrayList;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLILI(List<? extends TikTokMediaModel> list) {
        super.LLLLILI(list);
        int iLLLILZLLLI = LLLILZLLLI();
        this.LLJILJIL = iLLLILZLLLI;
        if (iLLLILZLLLI >= 0 && iLLLILZLLLI < getItemCount()) {
            notifyItemChanged(this.LLJILJIL);
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLLIL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return;
        }
        int size = this.LL.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (TextUtils.equals(((MediaModel) ListProtector.get(this.LL, i)).id, ((MediaModel) tikTokMediaModel).id)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = this.LLJILJIL;
        if (i2 == i) {
            return;
        }
        if (i2 < 0 || i2 >= size) {
            i2 = -1;
        }
        if (i != -1) {
            this.LLJILJIL = i;
            notifyItemChanged(i);
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LJLZ(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.LL.size() && adapterPosition2 < this.LL.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            ListProtector.add(this.LL, adapterPosition2, ListProtector.remove(this.LL, adapterPosition));
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIILIL(int i, int i2) {
        int i3 = 1;
        if (1 <= i) {
            while (true) {
                this.LL.add(LLLLLJIL());
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.LLJILJIL = 0;
        notifyDataSetChanged();
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        long j;
        int i2;
        C529610Kpr c529610Kpr = (C529610Kpr) viewHolder;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(this.LL, i);
        c529610Kpr.I5(tikTokMediaModel, c529610Kpr, i);
        int i3 = 8;
        C786410Ut5.LJLLLLLL(8, c529610Kpr.LLJJIII);
        C786410Ut5.LLLLZLL(c529610Kpr.LLILZIL, 0);
        c529610Kpr.LLILZIL.setShadowLayer(0.0f, 0.0f, 0.0f, R.color.a1d);
        if (c529610Kpr.LLJJJ.LLLLIIIILLL(tikTokMediaModel)) {
            C786410Ut5.LJLLLLLL(8, c529610Kpr.LLIZ);
            TuxTextView tuxTextView = c529610Kpr.LLILZIL;
            if (c529610Kpr.LLJJJ.LLJIJIL == C0L9H.LIGHT) {
                i2 = R.attr.a1p;
            } else {
                i2 = R.attr.eh;
            }
            tuxTextView.setTextColorRes(i2);
            View view = c529610Kpr.LLJ;
            if (i == c529610Kpr.LLJJJ.LLJILJIL) {
                i3 = 0;
            }
            C786410Ut5.LJLLLLLL(i3, view);
        } else {
            C786410Ut5.LJLLLLLL(0, c529610Kpr.LLIZ);
            C786410Ut5.LJLLLLLL(8, c529610Kpr.LLJ);
            c529610Kpr.LLILZIL.setTextColorRes(R.attr.ef);
            C786410Ut5.LJLLLLLL(0, c529610Kpr.LLJJIII);
        }
        C529540Kpk c529540Kpk = c529610Kpr.LLJJJ;
        if (!C580130Mp9.LIZ(c529540Kpk.LLILLJJLI) && i >= 0 && i < c529540Kpk.LLILLJJLI.size()) {
            j = ((CutSameVideoImageExtraData) ListProtector.get(c529540Kpk.LLILLJJLI, i)).extraDuration;
        } else {
            j = 0;
        }
        TuxTextView tuxTextView2 = c529610Kpr.LLILZIL;
        tuxTextView2.setText(tuxTextView2.getContext().getResources().getString(2131837857, Float.valueOf((j * 1.0f) / 1000.0f)));
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C529610Kpr c529610Kpr = new C529610Kpr(this, viewGroup);
        try {
            View view = c529610Kpr.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529610Kpr.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529610Kpr.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C529610Kpr.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529610Kpr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529610Kpr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C529610Kpr.class.getName();
        return c529610Kpr;
    }
}
