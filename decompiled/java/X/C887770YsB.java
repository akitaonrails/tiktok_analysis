package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.report.api.IReportUtils;
import com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics;
import com.ss.android.ugc.aweme.im.service.service.IMAFListManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C887770YsB extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        final C0Y8T c0y8t = this.LLILZ;
        if (c0y8t == null) {
            return;
        }
        final String str = Intrinsics.LJFF(this.LLILLJJLI.LIZ, C1709506mj.INSTANCE) ? c0y8t.isRisky() ? "filtered_message_request" : "non_filtered_message_request" : "chat_list";
        ((IReportUtils) ServiceManager.get().getService(IReportUtils.class)).LIZ(new InterfaceC1688806jO(c0y8t, str) { // from class: X.06lY
            public final C0Y8T LIZ;
            public final String LIZJ;
            public final String LIZIZ = "button";
            public final int LIZLLL = 5;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1702206lY)) {
                    return false;
                }
                C1702206lY c1702206lY = (C1702206lY) obj;
                return Intrinsics.LJFF(this.LIZ, c1702206lY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1702206lY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1702206lY.LIZJ) && this.LIZLLL == c1702206lY.LIZLLL;
            }

            public final int hashCode() {
                int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
                String str2 = this.LIZJ;
                return ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LIZLLL;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FromConversation(conversation=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", enterMethod=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", enterFrom=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", defaultMsgSelectedNumber=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
            @Override // X.InterfaceC1688806jO
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C912520Zr0 LIZ() {
                /*
                    Method dump skipped, instruction units count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1702206lY.LIZ():X.0Zr0");
            }

            {
                this.LIZ = c0y8t;
                this.LIZJ = str;
            }
        }, this.LL, "8", null, true);
        ((IImDmProminenceAnalytics) ServiceManager.get().getService(IImDmProminenceAnalytics.class)).LIZIZ(this.LLILLJJLI.LIZ, str, this.LLILZIL, "button", C0I0B.LJFF.LIZIZ());
        AbstractC880120Yfq.LJFF(this, "report", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        IMUser iMUser = this.LLILZIL;
        return Intrinsics.LJFF(iMUser != null ? iMUser.getUid() : null, C461720I8s.LIZIZ());
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return this.LLJ;
    }

    public C887770YsB(Activity activity, C879540Yeu<?> c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        int i;
        MAFIMUser mAFIMUserLIZIZ;
        super(activity, c879540Yeu, interfaceC879010Ye3);
        if (AbstractC880120Yfq.LIZJ() == C05RV.PERSONAL_INBOX) {
            i = 0;
        } else {
            i = 1;
        }
        this.LLJ = i;
        this.LLJI = R.string.s65;
        this.LLJIJIL = R.raw.icon_flag;
        IMUser iMUser = this.LLILZIL;
        if (iMUser != null) {
            String recType = iMUser.getRecType();
            if ((recType == null || recType.length() == 0) && 1 != 0 && (mAFIMUserLIZIZ = ((IMAFListManager) ServiceManager.get().getService(IMAFListManager.class)).LIZIZ(iMUser.getUid())) != null && C123100dR.LIZ(mAFIMUserLIZIZ.getRecType())) {
                iMUser.setRecType(mAFIMUserLIZIZ.getRecType());
            }
        }
    }
}
