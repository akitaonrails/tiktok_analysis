package X;

import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.notification.model.AddYoursParticipantsModel;
import java.util.List;

/* JADX INFO: renamed from: X.0zmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909190zmX extends C1260870iur<AddYoursParticipantsModel, InterfaceC1212360hec<DiggInfo>> implements InterfaceC1909070zmL {
    @Override // X.InterfaceC1909070zmL
    public final int LIZLLL() {
        return 0;
    }

    @Override // X.C1260870iur
    public final void LJIILIIL() {
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        if (((AddYoursParticipantsModel) t).isLoadMore) {
            ((InterfaceC1212360hec) this.LLILLJJLI).showLoadMoreLoading();
        } else {
            ((InterfaceC1212360hec) this.LLILLJJLI).LJ();
        }
    }

    @Override // X.InterfaceC1909070zmL
    public final void LJJIFFI() {
        AddYoursParticipantsModel addYoursParticipantsModel = (AddYoursParticipantsModel) this.LL;
        if (addYoursParticipantsModel != null) {
            addYoursParticipantsModel.loadMore();
        }
        LJIILIIL();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        List<DiggInfo> list;
        T t = this.LL;
        if (t == 0 || this.LLILLJJLI == 0) {
            return;
        }
        AddYoursParticipantsModel addYoursParticipantsModel = (AddYoursParticipantsModel) t;
        if (addYoursParticipantsModel.isLoadMore) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Pj(addYoursParticipantsModel.newList, (!((AddYoursParticipantsModel) t).hasMore || (list = ((AddYoursParticipantsModel) t).diggInfos) == null || list.isEmpty()) ? false : true);
            return;
        }
        List<DiggInfo> list2 = addYoursParticipantsModel.diggInfos;
        if (list2 == null || list2.isEmpty()) {
            ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
            return;
        }
        InterfaceC1212360hec interfaceC1212360hec = (InterfaceC1212360hec) this.LLILLJJLI;
        T t2 = this.LL;
        interfaceC1212360hec.LLJJJIL(((AddYoursParticipantsModel) t2).diggInfos, ((AddYoursParticipantsModel) t2).hasMore);
    }

    @Override // X.InterfaceC1909070zmL
    public final void refresh() {
        AddYoursParticipantsModel addYoursParticipantsModel = (AddYoursParticipantsModel) this.LL;
        if (addYoursParticipantsModel != null) {
            addYoursParticipantsModel.refresh();
        }
        LJIILIIL();
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        T t = this.LL;
        if (t != 0 && this.LLILLJJLI != 0) {
            if (((AddYoursParticipantsModel) t).isLoadMore) {
                ((InterfaceC1212360hec) this.LLILLJJLI).Wi(exc);
            } else {
                ((InterfaceC1212360hec) this.LLILLJJLI).Uq2(exc);
            }
        }
    }
}
