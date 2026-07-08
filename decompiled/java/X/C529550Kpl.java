package X;

import android.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Kpl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529550Kpl extends AbstractC529520Kpi {
    public int LLJIJIL = -1;
    public int LLJILJIL = -1;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(176));

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

    public final TikTokMediaModel LLLLLJIL() {
        TikTokMediaModel tikTokMediaModelLIZ = ((C530020KqW) this.LLJILJILJ.getValue()).LIZ(UUID.randomUUID().toString(), EnumC538220L8y.MEDIA_STORE);
        tikTokMediaModelLIZ.LJIILL("");
        tikTokMediaModelLIZ.thumbnail = "";
        tikTokMediaModelLIZ.duration = 0L;
        tikTokMediaModelLIZ.type = 4;
        return tikTokMediaModelLIZ;
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZ() {
        int itemCount = getItemCount();
        int i = this.LLJIJIL;
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

    @Override // X.AbstractC529520Kpi
    public final void LLLFZ(TikTokMediaModel tikTokMediaModel) {
        int iLLLILZLLLI = LLLILZLLLI();
        if (iLLLILZLLLI >= 0 && iLLLILZLLLI < getItemCount()) {
            ListProtector.remove(this.LL, iLLLILZLLLI);
            ListProtector.add(this.LL, iLLLILZLLLI, tikTokMediaModel);
            notifyItemChanged(iLLLILZLLLI);
            int iLLLILZLLLI2 = LLLILZLLLI();
            this.LLJIJIL = iLLLILZLLLI2;
            if (iLLLILZLLLI2 >= 0 && iLLLILZLLLI2 < getItemCount()) {
                notifyItemChanged(this.LLJIJIL);
            }
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIL(TikTokMediaModel tikTokMediaModel) {
        super.LLLIL(tikTokMediaModel);
        this.LL.add(LLLLLJIL());
        notifyItemChanged(getItemCount() - 1);
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLIL(ArrayList<CutSameVideoImageExtraData> arrayList) {
        this.LLILLJJLI = arrayList;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLILI(List<? extends TikTokMediaModel> list) {
        super.LLLLILI(list);
        int iLLLILZLLLI = LLLILZLLLI();
        this.LLJIJIL = iLLLILZLLLI;
        if (iLLLILZLLLI >= 0 && iLLLILZLLLI < getItemCount()) {
            notifyItemChanged(this.LLJIJIL);
        }
    }

    @Override // X.AbstractC529520Kpi
    public final Integer LLLLJ(TikTokMediaModel tikTokMediaModel) {
        this.LLJILJIL = this.LLILZ;
        this.LLILZ = this.LL.indexOf(tikTokMediaModel);
        int i = this.LLJILJIL;
        if (i > -1 && i < getItemCount()) {
            notifyItemChanged(this.LLJILJIL, "previewBorder");
        }
        int i2 = this.LLILZ;
        if (i2 > -1 && i2 < getItemCount()) {
            notifyItemChanged(this.LLILZ, "previewBorder");
            return Integer.valueOf(this.LLILZ);
        }
        return null;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLJI(int i) {
        int i2 = this.LLILZ;
        this.LLJILJIL = i2;
        if (i2 > -1 && i2 < getItemCount()) {
            notifyItemChanged(this.LLJILJIL, "previewBorder");
        }
        this.LLILZ = i;
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
                String str = ((MediaModel) ListProtector.get(this.LL, i)).id;
                str.toString();
                String str2 = ((MediaModel) tikTokMediaModel).id;
                str2.toString();
                if (TextUtils.equals(str, str2)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        int i2 = this.LLJIJIL;
        if (i2 == i) {
            return;
        }
        if (i2 < 0 || i2 >= size) {
            i2 = -1;
        }
        if (i != -1) {
            this.LLJIJIL = i;
            notifyItemChanged(i);
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIILIL(int i, int i2) {
        if (1 <= i) {
            int i3 = 1;
            while (true) {
                this.LL.add(LLLLLJIL());
                if (i3 == i) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (i2 >= 0 && i2 < i) {
            this.LLJIJIL = i2;
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Integer numValueOf;
        C529580Kpo c529580Kpo = (C529580Kpo) viewHolder;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(this.LL, i);
        c529580Kpo.I5(tikTokMediaModel, c529580Kpo, i);
        C786410Ut5.LJLLLLLL(8, c529580Kpo.LLJJIII);
        C786410Ut5.LLLLZLL(c529580Kpo.LLILZIL, 0);
        c529580Kpo.LLILZIL.setShadowLayer(0.0f, 0.0f, 0.0f, R.color.transparent);
        IntRange intRange = new IntRange(0, 2);
        if (tikTokMediaModel != null) {
            numValueOf = Integer.valueOf(c529580Kpo.LLJJJ.LLLJL(tikTokMediaModel));
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && intRange.LJLJL(numValueOf.intValue()) && !c529580Kpo.LLJJJ.LLLLIIIILLL(tikTokMediaModel)) {
            c529580Kpo.itemView.setClickable(false);
            c529580Kpo.itemView.setEnabled(false);
            C786410Ut5.T4(c529580Kpo.itemView, 0.34f);
            C786410Ut5.LJLLLLLL(8, c529580Kpo.LLIZ);
            return;
        }
        c529580Kpo.itemView.setClickable(true);
        c529580Kpo.itemView.setEnabled(true);
        C786410Ut5.T4(c529580Kpo.itemView, 1.0f);
        if (c529580Kpo.LLJJJ.LLLLIIIILLL(tikTokMediaModel)) {
            C786410Ut5.LJLLLLLL(8, c529580Kpo.LLIZ);
        } else {
            C786410Ut5.LJLLLLLL(0, c529580Kpo.LLIZ);
        }
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C529580Kpo c529580Kpo = new C529580Kpo(this, viewGroup);
        try {
            View view = c529580Kpo.itemView;
            if (view != null) {
                view.setTag(com.zhiliaoapp.musically.R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529580Kpo.itemView.setTag(com.zhiliaoapp.musically.R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529580Kpo.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C529580Kpo.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529580Kpo.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529580Kpo.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C529580Kpo.class.getName();
        return c529580Kpo;
    }
}
