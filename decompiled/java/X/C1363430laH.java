package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0laH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363430laH extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final SharePanelViewModel LL;
    public final InterfaceC897330ZId LLILLL;
    public final InterfaceC1362600lYw LLILLJJLI = null;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(552));
    public final List<Integer> LLILZIL = new ArrayList();
    public final List<Integer> LLILZLL = new ArrayList();
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));

    public final List<IMContact> getData() {
        return (List) this.LLIZ.getValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return getData().size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(getData(), i);
        if (obj instanceof C1363150lZp) {
            return 2;
        }
        if (obj instanceof C1363720lak) {
            return 3;
        }
        return 1;
    }

    public final void setData(List<? extends IMContact> list) {
        getData().clear();
        Integer numValueOf = null;
        if (list != null && (!list.isEmpty())) {
            getData().addAll(list);
            getData().add(new C1363150lZp(EnumC994650bzT.NORMAL));
        }
        notifyDataSetChanged();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setData: ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        sbLIZ.append(getData().size());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1363430laH(SharePanelViewModel sharePanelViewModel, C897520ZIw c897520ZIw) {
        this.LL = sharePanelViewModel;
        this.LLILLL = c897520ZIw;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C1363580laW) {
            ((C1363580laW) viewHolder).I5(i, (IMContact) ListProtector.get(getData(), i), this.LL);
            return;
        }
        if (!(viewHolder instanceof C1363960lb8)) {
            return;
        }
        ((C1363960lb8) viewHolder).I5((IMContact) ListProtector.get(getData(), i), i, ((ArrayList) this.LLILZIL).contains(Integer.valueOf(i)), ((ArrayList) this.LLILZLL).contains(Integer.valueOf(i)), this.LL, null, null, -1);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLIZ;
        if (i != 2) {
            if (i != 3) {
                int i2 = C1363960lb8.LLJJJJ;
                viewHolderLIZ = C1363460laK.LIZ(viewGroup, this.LL, this.LLILLJJLI, false, null, this.LLILLL, 224);
            } else {
                int i3 = C995260c0S.LL;
                viewHolderLIZ = C995250c0R.LIZ(viewGroup, true, null);
            }
        } else {
            int i4 = C1363580laW.LLIZLLLIL;
            viewHolderLIZ = C1363590laX.LIZ(viewGroup, this.LL, false, null, null, false, 60);
        }
        try {
            View view = viewHolderLIZ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLIZ.getClass().getName();
        return viewHolderLIZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        C1363960lb8 c1363960lb8;
        if (list.isEmpty()) {
            super.onBindViewHolder(viewHolder, i, list);
        } else {
            if (!(viewHolder instanceof C1363960lb8) || (c1363960lb8 = (C1363960lb8) viewHolder) == null) {
                return;
            }
            c1363960lb8.R5(((Boolean) ListProtector.get(list, 0)).booleanValue());
        }
    }
}
