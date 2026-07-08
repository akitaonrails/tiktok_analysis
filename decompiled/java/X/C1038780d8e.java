package X;

import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.q;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.share.service.IAdWebShareService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.web.service.IAdWebUIUtils;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1038780d8e {
    public static final C1038780d8e LIZ = new C1038780d8e();
    public static final h LIZIZ;
    public static final C01GW LIZJ;

    static {
        h hVar = new h();
        h hVar2 = new h();
        hVar2.LJJIFFI(new q("ad_history"));
        hVar.LJJIFFI(hVar2);
        h hVar3 = new h();
        hVar3.LJJIFFI(new q("ad_web_refresh"));
        hVar3.LJJIFFI(new q("ad_share_link"));
        hVar3.LJJIFFI(new q("ad_copy_link"));
        hVar3.LJJIFFI(new q("ad_open_in_browser"));
        hVar.LJJIFFI(hVar3);
        h hVar4 = new h();
        hVar4.LJJIFFI(new q("browser_setting"));
        hVar4.LJJIFFI(new q("ad_iab_privacy_policy"));
        hVar4.LJJIFFI(new q("ad_report"));
        hVar.LJJIFFI(hVar4);
        LIZIZ = hVar;
        LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(469));
    }

    public static h LIZ(C1035880d3y c1035880d3y, AbstractC1968807nS abstractC1968807nS) {
        boolean z;
        boolean z2;
        IAdWebUIUtils iAdWebUIUtils = (IAdWebUIUtils) PluggableExtentionKt.pluggableSpi$default(IAdWebUIUtils.class, false, false, false, 14, null);
        if (iAdWebUIUtils != null && iAdWebUIUtils.LJIJ(c1035880d3y)) {
            z = true;
        } else {
            z = false;
        }
        boolean zLIZ = C306390Bzh.LIZ();
        IAdWebShareService iAdWebShareService = (IAdWebShareService) PluggableExtentionKt.pluggableSpi$default(IAdWebShareService.class, false, false, false, 14, null);
        if (iAdWebShareService != null && iAdWebShareService.LIZIZ(abstractC1968807nS)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLJFF = Intrinsics.LJFF(C1075220e5Q.LIZ().privacyPolicyEnable, Boolean.TRUE);
        C01GW c01gw = LIZJ;
        if (c01gw.getValue() == null) {
            return (h) c01gw.getValue();
        }
        h hVar = new h();
        Iterator<k> it2 = ((h) c01gw.getValue()).iterator();
        while (it2.hasNext()) {
            h hVarLJIIL = it2.next().LJIIL();
            h hVar2 = new h();
            for (k kVar : hVarLJIIL) {
                if (!kVar.LJIL().equals("ad_history") || z) {
                    if (!kVar.LJIL().equals("browser_setting") || zLIZ) {
                        if (!kVar.LJIL().equals("ad_report") || z2) {
                            if (!kVar.LJIL().equals("ad_iab_privacy_policy") || zLJFF) {
                                hVar2.LJJIFFI(kVar);
                            }
                        }
                    }
                }
            }
            if (hVar2.size() > 0) {
                hVar.LJJIFFI(hVar2);
            }
        }
        return hVar;
    }
}
