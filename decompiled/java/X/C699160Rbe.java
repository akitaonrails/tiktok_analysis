package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaFunnelAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0Rbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699160Rbe<DATA> implements InterfaceC699200Rbi<DATA> {
    public final InteractAreaFunnelAbility LIZ;
    public final InterfaceC700020Rd2<DATA> LIZIZ;

    @Override // X.InterfaceC699200Rbi
    public final InterfaceC700020Rd2<DATA> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC699200Rbi
    public final void LIZLLL(EnumC699120Rba enumC699120Rba) {
        C699170Rbf c699170RbfOW0;
        InteractAreaFunnelAbility interactAreaFunnelAbility = this.LIZ;
        if (interactAreaFunnelAbility != null && (c699170RbfOW0 = interactAreaFunnelAbility.oW0(enumC699120Rba)) != null) {
            c699170RbfOW0.LIZJ();
        }
    }

    public C699160Rbe(InteractAreaFunnelAbility interactAreaFunnelAbility, C0RYN c0ryn) {
        this.LIZ = interactAreaFunnelAbility;
        this.LIZIZ = c0ryn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC699200Rbi
    public final List<String> LIZJ(EnumC699120Rba enumC699120Rba, List<? extends EnumC699150Rbd> list) {
        ?? arrayList;
        C699170Rbf c699170RbfOW0;
        Set<C699770Rcd> setLIZ;
        if (!C2770015k.LIZ()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        for (EnumC699150Rbd enumC699150Rbd : list) {
            InteractAreaFunnelAbility interactAreaFunnelAbility = this.LIZ;
            if (interactAreaFunnelAbility != null && (c699170RbfOW0 = interactAreaFunnelAbility.oW0(enumC699120Rba)) != null && (setLIZ = c699170RbfOW0.LIZ(enumC699150Rbd)) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(setLIZ, 10));
                Iterator it2 = setLIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C699770Rcd) it2.next()).LIZ);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(arrayList, arrayList2);
        }
        return arrayList2;
    }

    @Override // X.InterfaceC699200Rbi
    public final void LIZIZ(EnumC699120Rba enumC699120Rba, EnumC699150Rbd enumC699150Rbd, List<String> list) {
        InteractAreaFunnelAbility interactAreaFunnelAbility;
        C699170Rbf c699170RbfOW0;
        if (C2770015k.LIZ() && (interactAreaFunnelAbility = this.LIZ) != null && (c699170RbfOW0 = interactAreaFunnelAbility.oW0(enumC699120Rba)) != null) {
            VideoItemParams videoItemParamsLIZ = this.LIZIZ.LIZ();
            Aweme aweme = null;
            if ((videoItemParamsLIZ instanceof VideoItemParams) && videoItemParamsLIZ != null) {
                aweme = videoItemParamsLIZ.getAweme();
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C699770Rcd(it2.next()));
            }
            c699170RbfOW0.LIZIZ(aweme, enumC699150Rbd, arrayList);
        }
    }
}
