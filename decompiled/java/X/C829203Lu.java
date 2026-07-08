package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.MiniCheckoutPopup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MiniOspPayResultMsg;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.utils.PollOrderManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.MiniPollOrderConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS88S0201000_1;

/* JADX INFO: renamed from: X.03Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C829203Lu implements C03N4, InterfaceC829603Ly {
    public final MiniOspViewModel LIZ;
    public C03WX LIZLLL;
    public PollOrderStatusRequest LJ;
    public int LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public String LJIILJJIL;
    public ExceptionUX LJIILL;
    public C1397510mTF LJIILLIIL;
    public C1397510mTF LJIIZILJ;
    public InterfaceC828903Lr LJIJ;
    public PollOrderManager LIZIZ = new PollOrderManager();
    public int LIZJ = -1;
    public C7873035r LJFF = new C7873035r(null, null, false, null, null, null, null, 32767);
    public final List<Long> LJIIJ = new ArrayList();
    public final List<Long> LJIIJJI = new ArrayList();
    public long LJIIL = Mp4ScreenVideoLoadTimeout.CONTROL;
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(491));
    public long LJIJI = -1;

    public static String LJIIIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "asynchronous_payment_failed" : "synchronous_payment_failed" : "waiting_for_payment_result" : "complete_your_payment";
    }

    @Override // X.InterfaceC829603Ly
    public final void LIZIZ() {
        this.LIZIZ.LIZ();
        this.LIZ.setState(AFwS228S0000000_1.get$arr$(770));
        int i = this.LIZJ;
        if (i == 0) {
            LJIIJJI(this, 1, null, false, 6);
        } else if (i == 2 || i == 3) {
            LJIIJJI(this, 3, null, true, 2);
        }
    }

    @Override // X.InterfaceC829603Ly
    public final void LIZJ() {
        this.LJI++;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @Override // X.InterfaceC829603Ly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r6 = this;
            int r1 = r6.LIZJ
            r0 = 4
            if (r1 != r0) goto L2a
            java.util.List<java.lang.Long> r1 = r6.LJIIJJI
            int r0 = r6.LJI
            java.lang.Object r0 = X.C7727030b.LIZ(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L3b
            long r2 = r0.longValue()
        L15:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest r5 = r6.LJ
            r4 = 0
            if (r5 == 0) goto L22
            int r1 = r6.LJI
            r0 = 507(0x1fb, float:7.1E-43)
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest r4 = com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest.LIZ(r5, r1, r4, r4, r0)
        L22:
            r6.LJ = r4
            com.ss.android.ugc.aweme.ecommerce.base.osp.utils.PollOrderManager r0 = r6.LIZIZ
            r0.LIZJ(r2, r4)
            return
        L2a:
            java.util.List<java.lang.Long> r1 = r6.LJIIJ
            int r0 = r6.LJI
            java.lang.Object r0 = X.C7727030b.LIZ(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L3b
            long r2 = r0.longValue()
            goto L15
        L3b:
            r2 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C829203Lu.LJFF():void");
    }

    public final void LJII() {
        C1397510mTF c1397510mTF = this.LJIILLIIL;
        if (c1397510mTF != null && c1397510mTF.LJIIIZ()) {
            c1397510mTF.LIZIZ(null);
        }
        C1397510mTF c1397510mTF2 = this.LJIIZILJ;
        if (c1397510mTF2 == null || !c1397510mTF2.LJIIIZ()) {
            return;
        }
        c1397510mTF2.LIZIZ(null);
    }

    public final MiniPollOrderConfig LJIIIIZZ() {
        return (MiniPollOrderConfig) this.LJIILIIL.getValue();
    }

    public final void LJIIJ() {
        this.LIZIZ.LIZ();
        this.LJI = 0;
        PollOrderStatusRequest pollOrderStatusRequest = this.LJ;
        this.LJ = pollOrderStatusRequest != null ? PollOrderStatusRequest.LIZ(pollOrderStatusRequest, 0, null, null, 507) : null;
    }

    @Override // X.C03N4
    public final void release() {
        PollOrderManager pollOrderManager = this.LIZIZ;
        pollOrderManager.LIZ();
        pollOrderManager.LIZ = null;
        pollOrderManager.LIZLLL = null;
        this.LIZLLL = null;
        this.LJFF = new C7873035r(null, null, false, null, null, null, null, 32767);
        this.LJIJ = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = null;
    }

    public C829203Lu(MiniOspViewModel miniOspViewModel) {
        this.LIZ = miniOspViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC829603Ly
    public final void LIZLLL(C03NA c03na) {
        String str;
        PollOrderStatusRequest pollOrderStatusRequestLIZ;
        this.LIZ.LLLLILI = C03M1.POLL_ORDER.getValue();
        if (c03na == null) {
            return;
        }
        PollOrderStatusResponseData pollOrderStatusResponseData = (PollOrderStatusResponseData) c03na.data;
        String strValueOf = String.valueOf(c03na.code);
        if (pollOrderStatusResponseData == null || (str = pollOrderStatusResponseData.logId) == null) {
            PollOrderStatusRequest pollOrderStatusRequest = this.LJ;
            if (pollOrderStatusRequest != null) {
                str = pollOrderStatusRequest.lastLogId;
            } else {
                str = null;
            }
        }
        PollOrderStatusRequest pollOrderStatusRequest2 = this.LJ;
        if (pollOrderStatusRequest2 != null) {
            pollOrderStatusRequestLIZ = PollOrderStatusRequest.LIZ(pollOrderStatusRequest2, this.LJI, str, null, 499);
        } else {
            pollOrderStatusRequestLIZ = null;
        }
        this.LJ = pollOrderStatusRequestLIZ;
        if (pollOrderStatusResponseData != null) {
            this.LJIILJJIL = strValueOf;
            this.LJIILL = pollOrderStatusResponseData.exceptionUX;
            Integer num = pollOrderStatusResponseData.status;
            if (num != null) {
                if (num.intValue() == 1) {
                    LIZ(true, this.LJIILJJIL, null, null);
                    return;
                }
                if (num.intValue() == 0 || num.intValue() == 2 || num == null) {
                    return;
                }
                if (num.intValue() != 7 && num.intValue() != 3 && num.intValue() != 8) {
                    return;
                }
                LIZ(false, strValueOf, this.LJIILL, null);
            }
        }
    }

    public final void LJI(long j, long j2) {
        this.LJIIIIZZ = j;
        ((ArrayList) this.LJIIJ).clear();
        long jLongValue = 0;
        if (j > j2) {
            long j3 = j / j2;
            this.LJII = j3;
            if (j % j2 > 0) {
                this.LJII = j3 + 1;
            }
            long j4 = this.LJII;
            for (long j5 = 0; j5 < j4; j5++) {
                ((ArrayList) this.LJIIJ).add(Long.valueOf(j2));
            }
        } else {
            this.LJII = 1L;
            ((ArrayList) this.LJIIJ).add(Long.valueOf(j2));
        }
        Long l = (Long) C7727030b.LIZ(0, this.LJIIJ);
        if (l != null) {
            jLongValue = l.longValue();
        }
        this.LJIIIZ = jLongValue;
    }

    @Override // X.C03N4
    public final void LIZ(boolean z, String str, ExceptionUX exceptionUX, C03N8 c03n8) {
        LJII();
        this.LIZ.setState(AFwS228S0000000_1.get$arr$(769));
        PollOrderManager pollOrderManager = this.LIZIZ;
        pollOrderManager.LIZ();
        pollOrderManager.LIZ = null;
        pollOrderManager.LIZLLL = null;
        InterfaceC828903Lr interfaceC828903Lr = this.LJIJ;
        if (interfaceC828903Lr != null) {
            interfaceC828903Lr.mH2(z, str, exceptionUX);
        }
        if (z) {
            C03O1 c03o1 = this.LIZ.LLILZLL;
            int i = this.LIZJ;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LJIJI;
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
        MiniOspViewModel miniOspViewModel2 = this.LIZ;
        this.LIZLLL = miniOspViewModel2.LLJJL;
        this.LJFF = miniOspViewModel2.LLLJ;
        this.LJIJ = miniOspViewModel;
        this.LIZJ = i;
        Long l = miniOspViewModel2.LLLLJI;
        if (l != null) {
            this.LJIIL = l.longValue();
        }
        PollOrderManager pollOrderManager = new PollOrderManager();
        this.LIZIZ = pollOrderManager;
        pollOrderManager.LIZIZ(this.LIZLLL, this);
        this.LJ = C03N7.LIZ(this.LJFF, str);
        LJIIJ();
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LJIJI = SystemClock.elapsedRealtime();
                    this.LIZ.setState(AFwS228S0000000_1.get$arr$(773));
                    LJI(LJIIIIZZ().cancelPollTotalTime, LJIIIIZZ().cancelPollIntervalTime);
                    this.LIZIZ.LIZJ(this.LJIIIZ, this.LJ);
                    PollOrderManager pollOrderManager2 = this.LIZIZ;
                    long j = this.LJIIIIZZ;
                    PollOrderManager.WorkHandler workHandler = pollOrderManager2.LIZ;
                    if (workHandler != null) {
                        workHandler.sendEmptyMessageDelayed(301, j);
                        return;
                    }
                    return;
                }
                return;
            }
            this.LIZ.setState(AFwS228S0000000_1.get$arr$(772));
            MiniOspViewModel miniOspViewModel3 = this.LIZ;
            C1DFH c1dfh = C0PEM.LIZ;
            C948503nH.LJI(miniOspViewModel3, C2107308Nj.LIZ, new C829103Lt(this, miniOspPayResultMsg, null));
            return;
        }
        this.LJIJI = SystemClock.elapsedRealtime();
        this.LIZ.setState(AFwS228S0000000_1.get$arr$(771));
        LJI(this.LJIIL, LJIIIIZZ().payPollIntervalTime);
        this.LIZIZ.LIZJ(this.LJIIIZ, this.LJ);
        PollOrderManager pollOrderManager3 = this.LIZIZ;
        long j2 = this.LJIIIIZZ;
        PollOrderManager.WorkHandler workHandler2 = pollOrderManager3.LIZ;
        if (workHandler2 == null) {
            return;
        }
        workHandler2.sendEmptyMessageDelayed(301, j2);
    }

    public static void LJIIJJI(C829203Lu c829203Lu, int i, String str, boolean z, int i2) {
        List<MiniCheckoutPopup> list;
        DialogContent dialogContent;
        IECommerceHostService iECommerceHostService;
        C928103jz c928103jzLIZJ;
        Context context;
        Activity activityLIZ;
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        boolean z2;
        String name = null;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        BillInfoData billInfoData = c829203Lu.LIZ.LLIZ;
        if (billInfoData != null && (list = billInfoData.miniCheckoutPopupList) != null) {
            ArrayList arrayList = new ArrayList();
            for (MiniCheckoutPopup miniCheckoutPopup : list) {
                Integer num = miniCheckoutPopup.popupType;
                if (num != null && num.intValue() == i) {
                    arrayList.add(miniCheckoutPopup);
                }
            }
            MiniCheckoutPopup miniCheckoutPopup2 = (MiniCheckoutPopup) C7727030b.LIZ(0, arrayList);
            if (miniCheckoutPopup2 != null && (dialogContent = miniCheckoutPopup2.dialogContent) != null) {
                c829203Lu.LJII();
                if (z) {
                    i = 4;
                }
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                if (rootPageMonitor != null && (c928103jzLIZJ = rootPageMonitor.LIZJ()) != null && (context = c928103jzLIZJ.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (activityLIZ instanceof MiniOspActivity) && !activityLIZ.isFinishing()) {
                    C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                    c1397580mTM.LJII = false;
                    String str2 = dialogContent.title;
                    if (str2 != null) {
                        c1397580mTM.LJI(str2);
                    }
                    if (str == null) {
                        str = dialogContent.message;
                    }
                    c1397580mTM.LIZIZ(str);
                    List<DialogButton> list2 = dialogContent.dialogButtons;
                    if (list2 != null) {
                        C1238130iKB.LIZ(c1397580mTM, new AwS88S0201000_1((List) list2, (List<DialogButton>) i, (int) c829203Lu, (C829203Lu) 14));
                    }
                    C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
                    c829203Lu.LJIILLIIL = c1397510mTF;
                    c1397510mTF.LIZLLL();
                    C03O1 c03o1 = c829203Lu.LIZ.LLILZLL;
                    String strLJIIIZ = LJIIIZ(i);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("popup_type", "membership_payment_popup");
                    PaymentInfo paymentInfo = c829203Lu.LIZ.LLJIJIL;
                    if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                        strLJJIIZ = paymentMethod.LJJIIZ();
                    } else {
                        strLJJIIZ = "";
                    }
                    linkedHashMap.put("payment_method", strLJJIIZ);
                    C03O1.LJIIZILJ(c03o1, strLJIIIZ, null, null, linkedHashMap, "mini_order_submit", false, 38);
                }
            }
        }
    }
}
