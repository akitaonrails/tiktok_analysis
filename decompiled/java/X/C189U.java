package X;

import android.content.Context;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.DetailLynxCardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.189U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189U {
    public static final C189U LIZ = new C189U();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3830));

    public static C189S LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        return (C189S) ((Map) LIZIZ.getValue()).get(str);
    }

    public static C189S LIZ(Aweme aweme, Context context, C2189821An6 c2189821An6, C725770SdT c725770SdT) {
        DetailLynxCardStruct lynxCardStruct;
        DynamicPatch dynamicPatch;
        String str;
        String rawData;
        C1537910q7h c1537910q7h;
        if (aweme == null || (lynxCardStruct = aweme.getLynxCardStruct()) == null || lynxCardStruct.dynamicPatch == null || (dynamicPatch = lynxCardStruct.dynamicPatch) == null || (str = dynamicPatch.schema) == null) {
            return null;
        }
        int iLIZJ = C497820Jfg.LIZJ(context);
        int iLJFF = C418440Gaw.LJFF(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)) - C14LC.LJIILLIIL, context);
        int iLJFF2 = C418440Gaw.LJFF((C418440Gaw.LIZIZ(58) + iLIZJ) - C14LC.LJIILL, context);
        C189S c189s = new C189S(context, aweme, str);
        DynamicPatch dynamicPatch2 = lynxCardStruct.dynamicPatch;
        String str2 = "";
        if (dynamicPatch2 == null || (rawData = dynamicPatch2.getRawData()) == null) {
            rawData = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("log_extra", c2189821An6.getExtra());
        linkedHashMap.put("top_bar_height", Integer.valueOf(iLJFF2));
        linkedHashMap.put("bottom_bar_height", Integer.valueOf(iLJFF));
        if (c725770SdT != null) {
            c725770SdT.LIZJ = System.currentTimeMillis();
            c189s.LIZLLL.LJJ(C725770SdT.class, c725770SdT);
        }
        TemplateData templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(rawData);
        templateDataLJIIIIZZ.LJIJJ(linkedHashMap);
        Pair[] pairArr = new Pair[1];
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        pairArr[0] = new Pair("aweme_id", aid);
        c189s.LIZJ.U0(C2097608Jq.LJIIJ(pairArr));
        InterfaceC1531560pxS interfaceC1531560pxS = c189s.LIZLLL.hybridParams;
        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            if (!c1537910q7h.LJJJIL.contains(c189s.LJFF)) {
                c1537910q7h.LJIIIIZZ(c189s.LJFF);
            }
            c1537910q7h.LJIJJ = templateDataLJIIIIZZ;
        }
        c189s.LIZJ.load();
        C189U c189u = LIZ;
        String aid2 = aweme.getAid();
        if (aid2 != null) {
            str2 = aid2;
        }
        c189u.getClass();
        C189S c189s2 = (C189S) ((Map) LIZIZ.getValue()).put(str2, c189s);
        if (c189s2 != null) {
            c189s2.LIZ();
        }
        return c189s;
    }
}
