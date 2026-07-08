package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MiniOspPayResultMsg;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MemberShipDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.utils.QueryOrderAfterAuthManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.03Lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C828803Lq implements C03N4 {
    public final MiniOspViewModel LIZ;
    public String LIZLLL;
    public C03WX LJ;
    public PollOrderStatusRequest LJFF;
    public String LJII;
    public ExceptionUX LJIIIIZZ;
    public C1397510mTF LJIIIZ;
    public InterfaceC828903Lr LJIIJ;
    public QueryOrderAfterAuthManager LIZIZ = new QueryOrderAfterAuthManager();
    public int LIZJ = -1;
    public C7873035r LJI = new C7873035r(null, null, false, null, null, null, null, 32767);
    public long LJIIJJI = -1;

    public final void LIZIZ() {
        C1397510mTF c1397510mTF = this.LJIIIZ;
        if (c1397510mTF == null || !c1397510mTF.LJIIIZ()) {
            return;
        }
        c1397510mTF.LIZIZ(null);
    }

    @Override // X.C03N4
    public final void release() {
        LIZIZ();
        QueryOrderAfterAuthManager queryOrderAfterAuthManager = this.LIZIZ;
        queryOrderAfterAuthManager.LIZ();
        queryOrderAfterAuthManager.LIZ = null;
        queryOrderAfterAuthManager.LJIIIIZZ = null;
        this.LJ = null;
        this.LJI = new C7873035r(null, null, false, null, null, null, null, 32767);
        this.LJIIJ = null;
        this.LJIIIZ = null;
    }

    public C828803Lq(MiniOspViewModel miniOspViewModel) {
        this.LIZ = miniOspViewModel;
    }

    public final void LIZJ(final String str) {
        this.LIZ.LLLLILI = C03M1.POLL_ORDER.getValue();
        if (this.LJFF == null) {
            LIZ(false, null, this.LJIIIIZZ, null);
            return;
        }
        QueryOrderAfterAuthManager queryOrderAfterAuthManager = new QueryOrderAfterAuthManager();
        queryOrderAfterAuthManager.LIZJ(this.LJ);
        queryOrderAfterAuthManager.LJIIL = 2;
        this.LIZIZ = queryOrderAfterAuthManager;
        queryOrderAfterAuthManager.LIZLLL(this.LJFF, this.LJI.LJIIIIZZ, new C03N9() { // from class: X.03Li
            @Override // X.C03N9
            public final void LIZ(EnumC828303Ll enumC828303Ll, String str2, ExceptionUX exceptionUX, C03N8 c03n8, PollOrderDisplayInfo pollOrderDisplayInfo) {
                String str3;
                MemberShipDisplayInfo memberShipDisplayInfo;
                IECommerceHostService iECommerceHostService;
                C928103jz c928103jzLIZJ;
                Context context;
                Activity activityLIZ;
                String strLIZ;
                String strLIZ2;
                boolean z;
                String str4 = str2;
                C828803Lq c828803Lq = this.LIZ;
                if (str4 == null) {
                    str3 = str;
                } else {
                    str3 = str4;
                }
                c828803Lq.LJII = str3;
                c828803Lq.LJIIIIZZ = exceptionUX;
                int i = C828203Lk.LIZ[enumC828303Ll.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        C828803Lq c828803Lq2 = this.LIZ;
                        if (str4 == null) {
                            str4 = str;
                        }
                        c828803Lq2.LIZ(false, str4, exceptionUX, c03n8);
                        return;
                    }
                    C828803Lq c828803Lq3 = this.LIZ;
                    c828803Lq3.LIZ.setState(AFwS228S0000000_1.get$arr$(778));
                    c828803Lq3.LIZIZ();
                    String name = null;
                    if (pollOrderDisplayInfo != null) {
                        memberShipDisplayInfo = pollOrderDisplayInfo.memberShipDisplayInfo;
                    } else {
                        memberShipDisplayInfo = null;
                    }
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                        if (iECommerceHostService != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IApplicationDependencyService.class.getName();
                        if (iECommerceHostService != null) {
                            name = iECommerceHostService.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                    }
                    InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                    if (rootPageMonitor == null || (c928103jzLIZJ = rootPageMonitor.LIZJ()) == null || (context = c928103jzLIZJ.LIZ) == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !(activityLIZ instanceof MiniOspActivity) || activityLIZ.isFinishing()) {
                        return;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                    c1397580mTM.LJII = false;
                    if (memberShipDisplayInfo == null || (strLIZ = memberShipDisplayInfo.title) == null) {
                        strLIZ = AnonymousClass1897.LIZ(2131828610);
                    }
                    c1397580mTM.LJI(strLIZ);
                    if (memberShipDisplayInfo == null || (strLIZ2 = memberShipDisplayInfo.desc) == null) {
                        strLIZ2 = AnonymousClass1897.LIZ(2131828608);
                    }
                    c1397580mTM.LIZIZ(strLIZ2);
                    C985403tE.LIZ(c1397580mTM, new AwS367S0200000_1(memberShipDisplayInfo, c828803Lq3, 327));
                    C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                    c828803Lq3.LJIIIZ = c1397510mTF;
                    c1397510mTF.LIZLLL();
                    C03O1.LJIIZILJ(c828803Lq3.LIZ.LLILZLL, "client", null, null, C2097608Jq.LJI(new Pair("popup_order_placement", "payment_timeout")), null, false, 54);
                    return;
                }
                this.LIZ.LIZ(true, str4, exceptionUX, c03n8);
            }
        }, Boolean.FALSE);
    }

    @Override // X.C03N4
    public final void LIZ(boolean z, String str, ExceptionUX exceptionUX, C03N8 c03n8) {
        LIZIZ();
        this.LIZ.setState(AFwS228S0000000_1.get$arr$(775));
        QueryOrderAfterAuthManager queryOrderAfterAuthManager = this.LIZIZ;
        queryOrderAfterAuthManager.LIZ();
        queryOrderAfterAuthManager.LIZ = null;
        queryOrderAfterAuthManager.LJIIIIZZ = null;
        InterfaceC828903Lr interfaceC828903Lr = this.LJIIJ;
        if (interfaceC828903Lr != null) {
            interfaceC828903Lr.mH2(z, str, exceptionUX);
        }
        if (z) {
            C03O1 c03o1 = this.LIZ.LLILZLL;
            int i = this.LIZJ;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJIIJJI;
            String str2 = this.LIZ.LLLLL;
            if (str2 == null) {
                str2 = "";
            }
            C03O1.LJJII(c03o1, i, jElapsedRealtime, str2);
        }
        this.LIZ.LLLLJ = !z;
    }

    @Override // X.C03N4
    public final void LJ(MiniOspViewModel miniOspViewModel, int i, MiniOspPayResultMsg miniOspPayResultMsg, String str) {
        String str2;
        MiniOspViewModel miniOspViewModel2 = this.LIZ;
        this.LJ = miniOspViewModel2.LLJJL;
        C7873035r c7873035r = miniOspViewModel2.LLLJ;
        this.LJI = c7873035r;
        this.LJIIJ = miniOspViewModel;
        this.LIZJ = i;
        if (miniOspPayResultMsg != null) {
            str2 = miniOspPayResultMsg.errorMessage;
        } else {
            str2 = null;
        }
        this.LIZLLL = str2;
        this.LJFF = C03N7.LIZ(c7873035r, str);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                this.LIZ.setState(AFwS228S0000000_1.get$arr$(777));
                MiniOspViewModel miniOspViewModel3 = this.LIZ;
                C1DFH c1dfh = C0PEM.LIZ;
                C948503nH.LJI(miniOspViewModel3, C2107308Nj.LIZ, new C828703Lp(this, miniOspPayResultMsg, null));
                return;
            }
        }
        this.LJIIJJI = SystemClock.elapsedRealtime();
        this.LIZ.setState(AFwS228S0000000_1.get$arr$(776));
        LIZJ(this.LIZLLL);
    }
}
