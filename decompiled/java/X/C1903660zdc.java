package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.inbox.widget.multi.RedPoint;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1903660zdc {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 714));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(518));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 713));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(517));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(516));

    public final RedPoint LIZJ() {
        Iterator<Integer> it2 = ((InterfaceC1890400zIE) this.LIZIZ.getValue()).LIZJ().iterator();
        int i = 0;
        boolean z = false;
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (!((IECommerceService) ServiceManager.get().getService(IECommerceService.class)).inboxService().LJII() || iIntValue != 210) {
                NoticeGroupAttrs noticeGroupAttrsLJI = C1903780zdo.LJI(iIntValue);
                int iLJIIIZ = C1903780zdo.LJIIIZ(iIntValue);
                i += iLJIIIZ;
                if ((noticeGroupAttrsLJI != null ? noticeGroupAttrsLJI.showType : null) == C0ZAJ.ShowNum && iLJIIIZ > 0) {
                    z = true;
                }
            }
        }
        return i > 0 ? z ? new RedPoint(EnumC895310ZAj.COUNT, i) : new RedPoint(EnumC895310ZAj.DOT, i) : (RedPoint) this.LIZLLL.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        if (r1 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r12) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1903660zdc.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice):java.lang.String");
    }

    public static String LIZIZ(MusNotice musNotice) {
        String strLIZ = "";
        try {
            strLIZ = LIZ(musNotice);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        StringBuilder sb = new StringBuilder();
        C844470XAv.LIZ.getClass();
        sb.append(C444960Hcc.LIZ(C844470XAv.LIZ()));
        sb.append(strLIZ);
        return sb.toString();
    }
}
