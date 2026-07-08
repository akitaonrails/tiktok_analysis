package X;

import Y.ARunnableS14S1100000_9;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;

/* JADX INFO: renamed from: X.0i9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1231500i9U implements InterfaceC863580XuG {
    public final int LIZ;

    @Override // X.InterfaceC863580XuG
    public void LIZ(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC863580XuG
    public final void LIZLLL(C0Y8T c0y8t, C0YMW c0ymw, C742250T9r c742250T9r) {
    }

    @Override // X.InterfaceC863580XuG
    public void LJFF(C0YMW c0ymw) {
    }

    @Override // X.InterfaceC863580XuG
    public final void LJI(C0YMW c0ymw, C742250T9r c742250T9r) {
    }

    public C1231500i9U() {
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        this.LIZ = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.hashCode() : 0;
    }

    @Override // X.InterfaceC863580XuG, X.InterfaceC863600XuI
    public void LIZIZ(C0YMW c0ymw) {
        IIMErrorUtils.LIZ.getClass();
        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
        if (iIMErrorUtilsLIZ != null) {
            C0I0B.LJFF.LIZJ();
            iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
        }
    }

    @Override // X.InterfaceC863600XuI
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // X.InterfaceC863560XuE
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
        String checkMsg;
        if (c0ymw != null && (checkMsg = c0ymw.getCheckMsg()) != null) {
            try {
                GroupCheckMsg groupCheckMsg = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, checkMsg);
                if (groupCheckMsg != null) {
                    final String statusMsg = groupCheckMsg.getStatusMsg();
                    int iHashCode = 0;
                    if (statusMsg != null && statusMsg.length() != 0) {
                        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                        if (abstractC1387200mCcLIZIZ != null) {
                            iHashCode = abstractC1387200mCcLIZIZ.hashCode();
                        }
                        if (iHashCode == this.LIZ) {
                            C1906580ziK.LIZJ().LJIIJ().LJLIIL(1L).LJJLJLI(new C09JN() { // from class: X.0NjC
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    Activity activityLIZ;
                                    C1C7U.LIZ("DefaultCreateGroupCallback@9456.onSuccessWithInfo$1");
                                    Activity activityLIZIZ = ((AbstractC1387200mCc) obj).LIZIZ();
                                    if (activityLIZIZ != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                                        String str = statusMsg;
                                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                                        c1389890mGx.LJIIJ(str);
                                        c1389890mGx.LJIIJJI();
                                    }
                                    C1C7U.LIZIZ("DefaultCreateGroupCallback@9456.onSuccessWithInfo$1");
                                }
                            });
                        } else {
                            C08D9.LIZLLL().LIZ(new ARunnableS14S1100000_9(abstractC1387200mCcLIZIZ, statusMsg, 24));
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
