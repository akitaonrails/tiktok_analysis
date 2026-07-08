package X;

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
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kpy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529680Kpy extends AbstractC529520Kpi {
    public int LLJIJIL = -1;
    public Function2<? super Integer, ? super Boolean, Unit> LLJILJIL;
    public Function1<? super Integer, Unit> LLJILJILJ;
    public final /* synthetic */ C530520KrK LLJILLL;

    @Override // X.AbstractC529520Kpi
    public final void LLLLIILL() {
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLILZLLLI() {
        int size = this.LL.size();
        int i = this.LLJILLL.LLILZ;
        if (i >= 0 && i < size) {
            return i;
        }
        int size2 = this.LL.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (LLLLIIIILLL((TikTokMediaModel) ListProtector.get(this.LL, i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // X.AbstractC529520Kpi
    public final CutSameVideoImageExtraData LLLJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LLLLLJLJLL() {
        int i = this.LLJIJIL;
        if (i < 0 || i >= this.LL.size()) {
            return;
        }
        C530520KrK c530520KrK = this.LLJILLL;
        int i2 = this.LLJIJIL;
        c530520KrK.LLILZ = i2;
        notifyItemChanged(i2);
        Function2<? super Integer, ? super Boolean, Unit> function2 = this.LLJILJIL;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(this.LLJILLL.LLILZ), Boolean.FALSE);
        }
        C530520KrK c530520KrK2 = this.LLJILLL;
        c530520KrK2.LIZIZ(c530520KrK2.LLILZ);
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public static final TikTokMediaModel LLLLLJIL() {
        TikTokMediaModel tikTokMediaModelLIZ = C527250Km3.LIZ().LIZ(UUID.randomUUID().toString(), EnumC538220L8y.MEDIA_STORE);
        tikTokMediaModelLIZ.LJIILL("");
        tikTokMediaModelLIZ.thumbnail = "";
        tikTokMediaModelLIZ.duration = 0L;
        tikTokMediaModelLIZ.type = 1;
        return tikTokMediaModelLIZ;
    }

    @Override // X.AbstractC529520Kpi
    public final int LLLLIILLL() {
        return C23214097s.LIZ() ? R.drawable.aie : R.drawable.aif;
    }

    public C529680Kpy(C530520KrK c530520KrK) {
        this.LLJILLL = c530520KrK;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLFZ(TikTokMediaModel tikTokMediaModel) {
        int i = this.LLJILLL.LLILZ;
        this.LLJIJIL = i;
        if (i >= 0 && i < getItemCount()) {
            int i2 = this.LLJIJIL;
            ListProtector.remove(this.LL, i2);
            ListProtector.add(this.LL, i2, tikTokMediaModel);
            int i3 = this.LLJIJIL + 1;
            int itemCount = getItemCount();
            while (true) {
                if (i3 < itemCount) {
                    if (LLLLIIIILLL((TikTokMediaModel) ListProtector.get(this.LL, i3))) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    int i4 = this.LLJIJIL;
                    i3 = 0;
                    while (true) {
                        if (i3 < i4) {
                            if (LLLLIIIILLL((TikTokMediaModel) ListProtector.get(this.LL, i3))) {
                                break;
                            } else {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                }
            }
            this.LLJIJIL = i3;
            notifyItemChanged(i2);
            LLLLLJLJLL();
            this.LLJILLL.LIZLLL();
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLI(List<? extends TikTokMediaModel> list) {
        int iLLLILZLLLI = LLLILZLLLI();
        if (iLLLILZLLLI >= 0 && iLLLILZLLLI < getItemCount()) {
            ArrayList arrayList = (ArrayList) list;
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    int i3 = i + iLLLILZLLLI;
                    if (i3 < this.LL.size()) {
                        ListProtector.remove(this.LL, i3);
                        ListProtector.add(this.LL, i3, obj);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LLJIJIL = LLLILZLLLI();
            notifyItemRangeChanged(iLLLILZLLLI, arrayList.size() + 1);
            LLLLLJLJLL();
            this.LLJILLL.LIZLLL();
        }
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLIL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return;
        }
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.LJFF(((MediaModel) ListProtector.get(this.LL, i)).LJFF(), tikTokMediaModel.LJFF()) && Intrinsics.LJFF(((TikTokMediaModel) ListProtector.get(this.LL, i)).LJIILLIIL(), tikTokMediaModel.LJIILLIIL())) {
                if (i >= 0) {
                    int i2 = this.LLJIJIL;
                    this.LLJIJIL = i;
                    ListProtector.remove(this.LL, i);
                    ListProtector.add(this.LL, i, LLLLLJIL());
                    notifyItemChanged(i);
                    if (i2 >= 0 && i2 < getItemCount()) {
                        notifyItemChanged(i2);
                    }
                    this.LLJILLL.LLILZ = this.LLJIJIL;
                    LLLLLJLJLL();
                    this.LLJILLL.LIZLLL();
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC529520Kpi
    public final boolean LLLLIIIILLL(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return true;
        }
        if (!C530690Krb.LIZIZ(tikTokMediaModel) && TextUtils.isEmpty(tikTokMediaModel.LJFF()) && TextUtils.isEmpty(tikTokMediaModel.thumbnail)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLIL(ArrayList<CutSameVideoImageExtraData> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.LLILLJJLI = arrayList;
    }

    @Override // X.AbstractC529520Kpi
    public final void LLLLILI(List<? extends TikTokMediaModel> list) {
        this.LL.clear();
        this.LL.addAll(list);
        this.LLJIJIL = LLLILZLLLI();
        LLLLLJLJLL();
        notifyDataSetChanged();
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
                if (Intrinsics.LJFF(str, str2)) {
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
        int size = this.LL.size();
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
        notifyItemRangeInserted(size, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ba  */
    /* JADX WARN: Type inference failed for: r4v4, types: [REQUEST, X.0kbR] */
    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C529680Kpy.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC529520Kpi, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C529690Kpz c529690Kpz = new C529690Kpz(this, viewGroup);
        try {
            View view = c529690Kpz.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c529690Kpz.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c529690Kpz.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C529690Kpz.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c529690Kpz.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c529690Kpz.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C529690Kpz.class.getName();
        return c529690Kpz;
    }
}
