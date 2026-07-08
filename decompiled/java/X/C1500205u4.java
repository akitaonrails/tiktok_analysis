package X;

import com.ss.android.ugc.aweme.im.ai.api.bot.IMAIBotInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.05u4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1500205u4 implements InterfaceC15414061s {
    public static final C1500205u4 LLILLJJLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final C054G LLILZ;
    public static final CopyOnWriteArrayList<String> LLILZIL;
    public static volatile C869590Y9l LLILZLL;
    public static volatile String LLIZ;
    public static final AtomicBoolean LLIZLLLIL;
    public static final C1DEV LLJ;
    public static final C01GW LLJI;
    public volatile C1598406Nq LL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1500205u4.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C1500205u4 c1500205u4 = new C1500205u4();
        LLILLJJLI = c1500205u4;
        C1598406Nq c1598406Nq = c1500205u4.LL;
        if (c1598406Nq == null) {
            synchronized (c1500205u4) {
                c1598406Nq = c1500205u4.LL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    c1500205u4.LL = c1598406Nq;
                }
            }
        }
        LLILZ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        LLILZIL = new CopyOnWriteArrayList<>();
        LLIZLLLIL = new AtomicBoolean(false);
        LLJ = C2191201ApK.LIZ();
        LLJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1045));
    }

    @Override // X.InterfaceC15414061s
    public final void Ap2(List<IMAIBotInfo> list) {
    }

    public static boolean LIZ(String str) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null || !c0y8tLIZ.isSingleChat() || C882340YjQ.LJ(c0y8tLIZ) || c0y8tLIZ.isRisky()) {
            return false;
        }
        String strValueOf = String.valueOf(C0YNP.LJII(str));
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(strValueOf, null, "im_local_db");
        if (iMUserLJIIL == null || iMUserLJIIL.getFollowStatus() == 2 || iMUserLJIIL.getFollowStatus() == 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC15414061s
    public final void ez0(List<IMAIBotInfo> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBotCreateOrUpdate: ");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        C23250099c.LIZLLL(LLILZ, null, null, new C1504705un(null, AFwS229S0000000_2.get$arr$(710), null), 3);
    }

    public static void LIZJ(C1500205u4 c1500205u4, Map map) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c1500205u4.getClass();
        C23250099c.LIZLLL(LLILZ, null, null, new C1494505t9(interfaceC1493505szLIZIZ, map, null), 3);
    }

    public static void LIZIZ(int i, String str, String str2) {
        C23250099c.LIZLLL(LLILZ, null, null, new C1309205Ak(i, str, "dm_chat", str2, null), 3);
    }
}
