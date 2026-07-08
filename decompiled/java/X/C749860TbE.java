package X;

import com.bytedance.android.live.usermanage.model.UserManageExtra;
import com.bytedance.android.livesdk.adminsetting.LiveManageListFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C749860TbE implements InterfaceC750020TbU, InterfaceC755430TkD {
    public final /* synthetic */ LiveManageListFragment LL;

    @Override // X.InterfaceC750020TbU
    public final void LJJJLZIJ(boolean z) {
    }

    @Override // X.InterfaceC750020TbU
    public final void e0(boolean z, Exception exc) {
    }

    public final void LIZ() {
        C749870TbF c749870TbF;
        LiveManageListFragment liveManageListFragment = this.LL;
        if (liveManageListFragment.mStatusViewValid && (c749870TbF = liveManageListFragment.LLJILLL) != null) {
            if (c749870TbF.getBasicItemCount() == 0) {
                liveManageListFragment.SR().LIZ();
                return;
            }
            C749910TbJ c749910TbJ = c749870TbF.LLILLJJLI;
            if (c749910TbJ != null) {
                ((C749790Tb7) c749910TbJ.itemView).LIZ();
            }
        }
    }

    public final void LIZJ() {
        C749870TbF c749870TbF;
        LiveManageListFragment liveManageListFragment = this.LL;
        if (liveManageListFragment.mStatusViewValid && (c749870TbF = liveManageListFragment.LLJILLL) != null) {
            if (c749870TbF.getBasicItemCount() == 0) {
                liveManageListFragment.SR().LIZLLL();
                return;
            }
            C749910TbJ c749910TbJ = c749870TbF.LLILLJJLI;
            if (c749910TbJ != null) {
                ((C749790Tb7) c749910TbJ.itemView).LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC750020TbU
    public final void E5() {
        LIZ();
    }

    @Override // X.InterfaceC755430TkD
    public final void FN() {
        LIZ();
    }

    public C749860TbE(LiveManageListFragment liveManageListFragment) {
        this.LL = liveManageListFragment;
    }

    public final void LIZIZ(C752140Teu c752140Teu, Exception exc) {
        C749870TbF c749870TbF;
        List<T> list;
        LiveManageListFragment liveManageListFragment = this.LL;
        if (!liveManageListFragment.mStatusViewValid || (c749870TbF = liveManageListFragment.LLJILLL) == null) {
            return;
        }
        if (exc == null && c752140Teu != null && (list = c752140Teu.data) != 0) {
            boolean z = c752140Teu.extra.hasMore;
            liveManageListFragment.LLJILJIL = z;
            if (!z) {
                c749870TbF.LL = false;
            }
            if (list.size() > 0) {
                C749870TbF c749870TbF2 = this.LL.LLJILLL;
                if (list.size() > 0) {
                    ((ArrayList) c749870TbF2.LLILZLL).addAll(list);
                }
                this.LL.LLJILLL.LLIZ = ((UserManageExtra) c752140Teu.extra).getOperations();
                this.LL.LLJILLL.notifyDataSetChanged();
                LiveManageListFragment liveManageListFragment2 = this.LL;
                if (2 == liveManageListFragment2.LLJ) {
                    C16F5 c16f5RR = liveManageListFragment2.RR();
                    if (c16f5RR != null) {
                        C500260Jjc.LLFFF(c16f5RR);
                        return;
                    }
                    return;
                }
                C16F5 c16f5RR2 = liveManageListFragment2.RR();
                if (c16f5RR2 == null) {
                    return;
                }
                C500260Jjc.LJIILIIL(c16f5RR2);
                return;
            }
            C749870TbF c749870TbF3 = this.LL.LLJILLL;
            if (c749870TbF3 == null || c749870TbF3.getItemCount() != 0) {
                return;
            }
            this.LL.SR().LIZIZ();
            return;
        }
        if (c749870TbF.getItemCount() == 0) {
            this.LL.SR().LIZJ();
            this.LL.LLJIJIL = 0;
        }
        C501540Jlg.LIZJ(this.LL.getContext(), exc);
    }

    @Override // X.InterfaceC750020TbU
    public final void LLLLLLJ(C752140Teu c752140Teu, Exception exc) {
        LIZIZ(c752140Teu, exc);
    }

    @Override // X.InterfaceC755430TkD
    public final void TC(C752140Teu c752140Teu, Exception exc) {
        LIZIZ(c752140Teu, exc);
    }
}
