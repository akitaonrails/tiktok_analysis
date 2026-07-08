package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.inbox.banner.model.DynamicInboxBanner;
import com.ss.android.ugc.aweme.inbox.banner.model.InboxBannerInfo;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Oya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C636940Oya {
    public static final C636940Oya LIZ = new C636940Oya();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(461));

    public static void LIZ(C20554115bn c20554115bn, String str, n nVar, Map map, Function2 function2) {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleOutreachResult: result: ");
        sbLIZ.append(c20554115bn);
        sbLIZ.append(" timing: ");
        sbLIZ.append(str);
        sbLIZ.append(", contentParam: ");
        sbLIZ.append(nVar);
        sbLIZ.append(", conditionParam: ");
        sbLIZ.append(map);
        C624370OeJ.LIZ("BannerOutreachManager", C2188811AlT.LIZIZ(sbLIZ));
        if (c20554115bn.LIZ != 0) {
            function2.invoke(null, null);
            return;
        }
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = ((DynamicInboxBanner) C1227904rF.LIZ(nVar, DynamicInboxBanner.class)).inboxBannerInfo;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        InboxBannerInfo inboxBannerInfo = (InboxBannerInfo) c098200Yq;
        if (inboxBannerInfo == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("parseData: newUIData is null, contentParam: ");
            sbLIZ2.append(nVar);
            C624370OeJ.LIZ("BannerOutreachManager", C2188811AlT.LIZIZ(sbLIZ2));
            C1901570zaF.LIZ.getClass();
            C1901570zaF.LIZIZ(nVar, str);
            function2.invoke(null, null);
            return;
        }
        C1901570zaF c1901570zaF = C1901570zaF.LIZ;
        Map<String, String> map2 = inboxBannerInfo.eventParams;
        c1901570zaF.getClass();
        C1901570zaF.LIZJ("client_receive", map2);
        function2.invoke(inboxBannerInfo, c20554115bn.LIZJ);
    }
}
