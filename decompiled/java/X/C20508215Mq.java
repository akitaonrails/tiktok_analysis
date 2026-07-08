package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS64S0500000_31;

/* JADX INFO: renamed from: X.15Mq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20508215Mq implements InterfaceC20507815Mm {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final InterfaceC20507915Mn LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS273S0000000_29.get$arr$(337));
    public final C997320c3m LLILLL = new C997320c3m(AFwS276S0000000_31.get$arr$(269));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(348));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20508215Mq.class, "mission", "getMission()Lcom/ss/android/ugc/aweme/commerce/tools/mission/Mission;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C20508215Mq.class, "uid", "getUid()Ljava/lang/String;", 0);
        c09r3.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC856520Xis
    public final void IS() {
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC20507915Mn Mh() {
        return this.LL;
    }

    public C20508215Mq(AbstractC856620Xj2 abstractC856620Xj2) {
        this.LL = abstractC856620Xj2;
    }

    @Override // X.InterfaceC856520Xis
    public final boolean np0(InterfaceC20507515Mj interfaceC20507515Mj) {
        Context contextLIZIZ;
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        Mission mission = (Mission) c997320c3m.LIZ(this);
        if (mission == null) {
            interfaceC20507515Mj.LIZ();
            return false;
        }
        if (TextUtils.isEmpty(mission.getMissionId())) {
            interfaceC20507515Mj.LIZ();
            return false;
        }
        if (this.LLILLJJLI.LIZ(this) != null && (!((Keva) this.LLILZ.getValue()).getBoolean((String) this.LLILLL.LIZ(this), false))) {
            C11BY c11by = new C11BY();
            c11by.LJIIIIZZ(mission);
            c11by.LJII("mission_post_reminder_show", "mission_id");
            if (((ICommerceCommonService) ServiceManager.get().getService(ICommerceCommonService.class)).LIZLLL()) {
                contextLIZIZ = C1001130c9v.LIZ(this);
            } else {
                contextLIZIZ = C1001130c9v.LIZIZ(this);
            }
            if (contextLIZIZ == null) {
                interfaceC20507515Mj.getIntercepted();
                return true;
            }
            C1391840mK6 c1391840mK6 = new C1391840mK6(contextLIZIZ);
            C013C c013c = new C013C();
            C1397580mTM c1397580mTM = new C1397580mTM(contextLIZIZ);
            c1397580mTM.LJFF(2131837311);
            c1397580mTM.LIZ(2131837307);
            c1397580mTM.LJIIJJI = c1391840mK6;
            C985403tE.LIZ(c1397580mTM, new AwS64S0500000_31(c1391840mK6, c013c, mission, this, interfaceC20507515Mj, 1));
            c1397580mTM.LIZJ(new AwS610S0100000_31(interfaceC20507515Mj, 356));
            c1397580mTM.LIZLLL(new AwS397S0200000_31(c013c, interfaceC20507515Mj, 80));
            new C1397510mTF(c1397580mTM).LIZLLL();
            interfaceC20507515Mj.getIntercepted();
            return true;
        }
        interfaceC20507515Mj.LIZ();
        return false;
    }
}
