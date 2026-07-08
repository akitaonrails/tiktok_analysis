package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368610lid extends AbstractC1368630lif<IMContact> {
    public SharePackage LLILZLL;
    public final ShareMoreViewModel LLIZ;
    public final C1368320liA LLIZLLLIL;
    public final boolean LLJ;
    public final InterfaceC1363370laB LLJI;
    public final LifecycleOwner LLJIJIL;
    public final InterfaceC897330ZId LLJILJIL;
    public final Map<String, String> LLJILJILJ;
    public final Map<String, String> LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    @Override // X.AbstractC1368630lif
    public final InterfaceC1363370laB LLLIL() {
        return this.LLJI;
    }

    @Override // X.AbstractC1368630lif
    public final SharePackage LLLILZ() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC1368630lif
    public final AbstractC1368540liW LLLJ(ViewGroup viewGroup) {
        return new C1368370liF(viewGroup, this.LLIZ, this.LLILZLL, this.LLJ, this.LLJILJIL, this.LLIZLLLIL.LJIIIIZZ, this.LLJILJILJ, this.LLJILLL, new AwS565S0100000_21(this, 1415));
    }

    @Override // X.AbstractC1368630lif
    public final boolean LLLJL(IMContact iMContact) {
        IMContact iMContact2 = iMContact;
        if (this.LLJJ) {
            if (iMContact2 instanceof IMUser) {
                C2201941BFw c2201941BFw = IMUser.Companion;
                int followStatus = ((IMUser) iMContact2).getFollowStatus();
                c2201941BFw.getClass();
                if (C2201941BFw.LIZLLL(followStatus)) {
                    return false;
                }
            }
            if (iMContact2 instanceof C1363150lZp) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1368630lif, X.AbstractC438050HFr
    public final int getBasicItemViewType(int i) {
        List<IMContact> listLLLFZ = LLLFZ();
        if (listLLLFZ != null && !listLLLFZ.isEmpty() && i >= LLLI()) {
            Integer numValueOf = Integer.valueOf(i - LLLI());
            int iIntValue = numValueOf.intValue();
            if (iIntValue >= 0 && iIntValue < listLLLFZ.size()) {
                if (!(ListProtector.get(listLLLFZ, numValueOf.intValue()) instanceof C1363150lZp)) {
                    return 0;
                }
                return 2;
            }
            return super.getBasicItemViewType(i);
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.getLayoutManager();
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C1368370liF) && viewHolder != null) {
            C1368370liF c1368370liF = (C1368370liF) viewHolder;
            c1368370liF.getClass();
            InterfaceC897330ZId interfaceC897330ZId = c1368370liF.LLJJI;
            if (interfaceC897330ZId != null) {
                interfaceC897330ZId.LIZIZ(true, c1368370liF.LLJJJJJIL);
            }
        }
    }

    @Override // X.AbstractC683510QrV, X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        boolean z = viewHolder instanceof C1368370liF;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Boolean bool;
        IMContact iMContactLLLII;
        if (viewHolder instanceof C1368370liF) {
            if (list.isEmpty()) {
                onBindViewHolder(viewHolder, i);
                return;
            }
            if (Intrinsics.LJFF(C13LP.LJJJLL(list), "update_gray")) {
                IMContact iMContactLLLII2 = LLLII(i);
                if (iMContactLLLII2 == null) {
                    return;
                } else {
                    ((C1368370liF) viewHolder).R5(iMContactLLLII2);
                }
            }
            Object objLJJJLL = C13LP.LJJJLL(list);
            if ((objLJJJLL instanceof Boolean) && (bool = (Boolean) objLJJJLL) != null) {
                bool.booleanValue();
                if (this.LLIZ.vQ2() && (iMContactLLLII = LLLII(i)) != null) {
                    ((C1368370liF) viewHolder).R5(iMContactLLLII);
                    return;
                }
                return;
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    public C1368610lid(SharePackage sharePackage, ShareMoreViewModel shareMoreViewModel, C1368320liA c1368320liA, boolean z, C1368790liv c1368790liv, Fragment fragment, C897520ZIw c897520ZIw, Map map, Map map2) {
        this.LLILZLL = sharePackage;
        this.LLIZ = shareMoreViewModel;
        this.LLIZLLLIL = c1368320liA;
        this.LLJ = z;
        this.LLJI = c1368790liv;
        this.LLJIJIL = fragment;
        this.LLJILJIL = c897520ZIw;
        this.LLJILJILJ = map;
        this.LLJILLL = map2;
    }
}
