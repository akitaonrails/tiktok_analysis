package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0dFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1042910dFJ implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1530760pwA LLILLJJLI;
    public final /* synthetic */ InterfaceC1042970dFP LLILLL;
    public final /* synthetic */ C1042950dFN LLILZ;

    public RunnableC1042910dFJ(C1530760pwA c1530760pwA, C1042950dFN c1042950dFN, InterfaceC1042970dFP interfaceC1042970dFP, String str) {
        this.LL = str;
        this.LLILLJJLI = c1530760pwA;
        this.LLILLL = interfaceC1042970dFP;
        this.LLILZ = c1042950dFN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SSPBase@88ad.getData$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SSPBase@88ad.getData$1");
    }

    public final void LIZ() {
        Object c098200Yq;
        SSPResponse.Data data;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1042930dFL c1042930dFL = C1042900dFI.LIZJ;
        String str = this.LL;
        c1042930dFL.getClass();
        Uri uri = UriProtector.parse(str);
        String string = c1042930dFL.LIZ.getString(str, "");
        if (TextUtils.isEmpty(string) && uri.getQuery() != null) {
            string = c1042930dFL.LIZ.getString(C1042930dFL.LIZ(uri), "");
        }
        if (TextUtils.isEmpty(string)) {
            data = null;
        } else {
            try {
                c098200Yq = (SSPResponse.Data) C1058250de3.LIZ(string, SSPResponse.Data.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            data = (SSPResponse.Data) c098200Yq;
        }
        C1530760pwA c1530760pwA = this.LLILLJJLI;
        if (c1530760pwA != null) {
            c1530760pwA.LLJJI = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        if (data != null) {
            C1042900dFI.LIZJ.getClass();
            if (data.expire > System.currentTimeMillis()) {
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("hit ssp cache response, url:");
                sbLIZ.append(this.LL);
                sbLIZ.append(", response:");
                sbLIZ.append(data);
                C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "SspLifeCycle_", 2);
                C1530760pwA c1530760pwA2 = this.LLILLJJLI;
                if (c1530760pwA2 != null) {
                    c1530760pwA2.LLILZIL = EnumC994680bzW.HIT;
                }
                this.LLILLL.LIZ(this.LL, data);
                return;
            }
            C1530760pwA c1530760pwA3 = this.LLILLJJLI;
            if (c1530760pwA3 != null) {
                c1530760pwA3.LLILZIL = EnumC994680bzW.INVALID;
            }
        } else {
            C1530760pwA c1530760pwA4 = this.LLILLJJLI;
            if (c1530760pwA4 != null) {
                c1530760pwA4.LLILZIL = EnumC994680bzW.NONE;
            }
        }
        C1042900dFI.LJII.put(this.LL, new Pair<>(this.LLILLL, this.LLILLJJLI));
        C1042900dFI.LJFF.LIZJ(this.LL, this.LLILZ, false);
    }
}
