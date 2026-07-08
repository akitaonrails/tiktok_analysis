package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;

/* JADX INFO: renamed from: X.06Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1567406Bs implements C06F6 {
    public static final C1567406Bs LLILLJJLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final C054G LLILZ;
    public static final C01GW LLILZIL;
    public volatile C1598406Nq LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1567406Bs.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1567406Bs c1567406Bs = new C1567406Bs();
        LLILLJJLI = c1567406Bs;
        C1598406Nq c1598406Nq = c1567406Bs.LL;
        if (c1598406Nq == null) {
            synchronized (c1567406Bs) {
                c1598406Nq = c1567406Bs.LL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1567406Bs.LL = c1598406Nq;
                }
            }
        }
        LLILZ = C2296808zG.LIZ(c1598406Nq.LIZ);
        LLILZIL = C452501pT.LIZIZ(new C1567506Bt());
    }

    public static final long LIZIZ() {
        return ((Keva) LLILZIL.getValue()).getLong(LIZ(), 0L);
    }

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        sbLIZ.append("_max_endtime");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C06F6
    public final void r80(StreakData streakData, String str) {
        if (streakData.convType == C06G4.USER.getValue() && C0YNP.LJII(str) != -1 && C1567806Bw.LIZ(streakData) > LIZIZ()) {
            ((Keva) LLILZIL.getValue()).storeLong(LIZ(), C1567806Bw.LIZ(streakData));
        }
    }
}
