package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0laa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1363620laa extends C1363390laD {
    public final Context LLJJIJIL;
    public final InterfaceC1368050lhj LLJJJ;
    public final SharePanelViewModel LLJJJIL;
    public final InterfaceC897330ZId LLJJJJ;
    public final C01GW LLJJJJJIL;
    public LifecycleOwner LLJJJJLIIL;

    @Override // X.C1363390laD, X.AbstractC21673619ry
    public final int getItemCount() {
        return getData().size() + ((AbstractC21673619ry) this.LLJJJJJIL.getValue()).getItemCount();
    }

    @Override // X.C1363390laD, X.InterfaceC1356400lOw
    public final void LLJJIJIIJIL(List<? extends InterfaceC1369790lkX> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1369790lkX interfaceC1369790lkX : list) {
            if (!Intrinsics.LJFF("chat_merge", interfaceC1369790lkX.key())) {
                arrayList.add(interfaceC1369790lkX);
            }
        }
        ((AbstractC1366540lfI) this.LLJJJJJIL.getValue()).setData(arrayList);
        notifyDataSetChanged();
    }

    @Override // X.C1363390laD, X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < getData().size()) {
            if (ListProtector.get(getData(), i) instanceof C1363190lZt) {
                return 11;
            }
            return 1001;
        }
        return ((AbstractC21673619ry) this.LLJJJJJIL.getValue()).getItemViewType(i - getData().size());
    }

    @Override // X.C1363390laD, X.AbstractC1362700lZ6, X.InterfaceC1356400lOw
    public final void LLJILJILJ(LifecycleOwner lifecycleOwner, List list) {
        ArrayList arrayList;
        boolean z;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        Pair<Integer, C1362500lYm> pairLJIIJ = this.LLJJJIL.LJIIJ();
        if (pairLJIIJ.getFirst().intValue() != -1 && pairLJIIJ.getSecond() != null) {
            C1362500lYm second = pairLJIIJ.getSecond();
            if (pairLJIIJ.getFirst().intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            ListProtector.add(arrayList, 0, new C1363190lZt(second, z));
        }
        List<IMContact> data = getData();
        if (!arrayList.isEmpty() && data != null) {
            data.clear();
            data.addAll(arrayList);
            this.LLJJJJLIIL = lifecycleOwner;
            notifyDataSetChanged();
        }
    }

    @Override // X.C1363390laD, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iLIZIZ;
        int dimensionPixelOffset;
        IMContact iMContact;
        if (i == 0) {
            iLIZIZ = (int) C12ES.LIZJ(9.0f, this.LLJJIJIL);
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        }
        if (i == getItemCount() - 1) {
            dimensionPixelOffset = this.LLJJIJIL.getResources().getDimensionPixelOffset(R.dimen.ag1);
        } else {
            dimensionPixelOffset = 0;
        }
        if (viewHolder instanceof C1363950lb7) {
            super.onBindViewHolder(viewHolder, i);
        } else if (viewHolder instanceof C1369800lkY) {
            ((AbstractC21673619ry) this.LLJJJJJIL.getValue()).onBindViewHolder(viewHolder, i - getData().size());
        } else if ((viewHolder instanceof C1364170lbT) && (iMContact = (IMContact) C13LP.LJJJLZIJ(i, getData())) != null) {
            ((C1364170lbT) viewHolder).I5(i, iMContact, this.LLJJJIL);
        }
        C426750GoL.LJIIIZ(viewHolder.itemView, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(dimensionPixelOffset), 0, false, 16);
    }

    @Override // X.C1363390laD, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLLLII;
        if (i != 11) {
            if (i != 1001) {
                viewHolderLLLII = ((C1369780lkW) this.LLJJJJJIL.getValue()).LLLII(i, viewGroup);
            } else {
                int i2 = C1363950lb7.LLLFFI;
                SharePanelViewModel sharePanelViewModel = this.LLJJJIL;
                InterfaceC1356400lOw.LJLLJ.getClass();
                viewHolderLLLII = C1363610laZ.LIZ(viewGroup, sharePanelViewModel, false, (int) C1356410lOx.LIZIZ, false, true, 2, false, R.attr.a1j, this.LLJJJJ, null, EnumC1364050lbH.MASK_WITH_CHECK_MARK, null);
            }
        } else {
            viewHolderLLLII = LLLII(viewGroup);
        }
        try {
            View view = viewHolderLLLII.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLLLII.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLLLII.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLLLII.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLLLII.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLLLII.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLLLII.getClass().getName();
        return viewHolderLLLII;
    }

    public C1363620laa(C19EG c19eg, InterfaceC1368050lhj interfaceC1368050lhj, SharePanelViewModel sharePanelViewModel) {
        super(sharePanelViewModel, (InterfaceC897330ZId) null, (SharePanelImHeadViewModel) null);
        this.LLJJIJIL = c19eg;
        this.LLJJJ = interfaceC1368050lhj;
        this.LLJJJIL = sharePanelViewModel;
        this.LLJJJJ = null;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1452));
    }
}
