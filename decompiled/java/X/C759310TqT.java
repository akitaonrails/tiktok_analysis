package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C759310TqT extends AbstractC21673619ry<AbstractC759330TqV> {
    public final LifecycleOwner LL;
    public final InterfaceC759240TqM LLILLJJLI;
    public long LLILLL;
    public final C1109770ez9 LLILZ;
    public final boolean LLILZIL;
    public final List<C759230TqL> LLILZLL;
    public final NextLiveData<Integer> LLIZ;

    public final int LLLI() {
        List<C759230TqL> list = this.LLILZLL;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C759230TqL> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZIZ && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.size();
    }

    public final void LLLFZ(List<? extends AbstractC1110520f0M<? extends AbstractC1136060ffY>> list) {
        int i;
        C19719612Di.LJJIIJ(this.LLILZLL, new AwS591S0100000_12(list, (List<? extends AbstractC1110520f0M<? extends AbstractC1136060ffY>>) 156), true);
        Iterator<C759230TqL> it2 = this.LLILZLL.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            } else {
                it2.next().LIZIZ = false;
            }
        }
        NextLiveData<Integer> nextLiveData = this.LLIZ;
        List<C759230TqL> list2 = this.LLILZLL;
        ArrayList arrayList = new ArrayList();
        for (C759230TqL c759230TqL : list2) {
            if (c759230TqL.LIZ != null) {
                arrayList.add(c759230TqL);
            }
        }
        nextLiveData.setValue(Integer.valueOf(arrayList.size()));
        InterfaceC759240TqM interfaceC759240TqM = this.LLILLJJLI;
        if (interfaceC759240TqM != null) {
            List<C759230TqL> list3 = this.LLILZLL;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<C759230TqL> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (it3.next().LIZIZ && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            interfaceC759240TqM.LIZ(i);
        }
        notifyDataSetChanged();
    }

    public final void LLLII(boolean z) {
        Iterator<C759230TqL> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL = z;
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C759230TqL c759230TqL = (C759230TqL) C13LP.LJJJLZIJ(i, this.LLILZLL);
        if (c759230TqL == null || !c759230TqL.LIZJ) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC759330TqV abstractC759330TqV = (AbstractC759330TqV) viewHolder;
        super.onViewDetachedFromWindow(abstractC759330TqV);
        abstractC759330TqV.I5();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        AbstractC759330TqV abstractC759330TqV = (AbstractC759330TqV) viewHolder;
        super.onViewRecycled(abstractC759330TqV);
        abstractC759330TqV.I5();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C759310TqT.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c759320TqU;
        if (i == 2) {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g57, viewGroup, false);
            c759320TqU = new AbstractC759330TqV(viewTd) { // from class: X.0TqW
            };
        } else {
            c759320TqU = new C759320TqU(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.g56, viewGroup, false), this.LL, this.LLILZIL);
        }
        try {
            View view = c759320TqU.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c759320TqU.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c759320TqU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c759320TqU.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c759320TqU.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c759320TqU.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c759320TqU.getClass().getName();
        return c759320TqU;
    }

    public C759310TqT(CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment, DataChannel dataChannel, List list, C759250TqN c759250TqN, long j, C1109770ez9 c1109770ez9) {
        boolean zBooleanValue;
        this.LL = communityFlaggedManageSheetFragment;
        this.LLILLJJLI = c759250TqN;
        this.LLILLL = j;
        this.LLILZ = c1109770ez9;
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZIL = zBooleanValue;
        List<C759230TqL> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C759230TqL(null, true, 11));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C759230TqL((AbstractC1110520f0M) it2.next(), false, 14));
        }
        listLJIILJJIL.addAll(arrayList);
        this.LLILZLL = listLJIILJJIL;
        this.LLIZ = new NextLiveData<>(Integer.valueOf(arrayList2.size()));
    }
}
