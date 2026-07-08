package X;

import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.story.experiment.viewlist.ViewerListDiskCacheExpData;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.SimpleStoryViewerPayload;
import com.ss.android.ugc.aweme.story.model.StoryBulletListResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330530CxX {
    public static volatile C330530CxX LIZJ;
    public static final C01GW<Set<Integer>> LIZLLL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1984));
    public static C1DFK LJ = C23118094a.LIZ();
    public static C054G LJFF = C2296808zG.LIZ(C0PEM.LIZ.plus(LJ));
    public static String LJI = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
    public static final C01GW<Keva> LJII = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1985));
    public static final C01GW<Keva> LJIIIIZZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1983));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1987));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1986));

    public final Map<String, InterfaceC330550CxZ> LIZIZ() {
        return (Map) this.LIZ.getValue();
    }

    public final InterfaceC330550CxZ LIZ(String str) {
        C01GW<Keva> c01gw;
        String string;
        k kVarLJJIIZ;
        String strLJIL;
        k kVarLJJIIZ2;
        InterfaceC330550CxZ c330560Cxa;
        InterfaceC330550CxZ interfaceC330550CxZ = LIZIZ().get(str);
        if (interfaceC330550CxZ != null) {
            return interfaceC330550CxZ;
        }
        ViewerListDiskCacheExpData viewerListDiskCacheExpData = C328170Ctj.LIZ;
        if (!viewerListDiskCacheExpData.enabled) {
            return null;
        }
        try {
            c01gw = LJII;
            string = c01gw.getValue().getString(str, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            HashMap map = new HashMap();
            map.put("author_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            map.put("item_id", str);
            Npth.reportBizException("ViewerListCache", e, message, map);
        }
        if (string == null || string.length() == 0) {
            return null;
        }
        C1227904rF.LIZ.getClass();
        Gson gsonLIZLLL = C1227904rF.LIZLLL();
        n nVar = (n) gsonLIZLLL.LJII(string, n.class);
        if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("ts")) != null) {
            if (System.currentTimeMillis() - kVarLJJIIZ.LJIIZILJ() > viewerListDiskCacheExpData.diskCacheTtlInMs) {
                c01gw.getValue().erase(str);
                return null;
            }
            k kVarLJJIIZ3 = nVar.LJJIIZ("clazz");
            if (kVarLJJIIZ3 == null || (strLJIL = kVarLJJIIZ3.LJIL()) == null || (kVarLJJIIZ2 = nVar.LJJIIZ("data")) == null) {
                return null;
            }
            if (viewerListDiskCacheExpData.simpleUserCacheEnabled && Intrinsics.LJFF(strLJIL, SimpleStoryViewerPayload.class.getName())) {
                SimpleStoryViewerPayload simpleStoryViewerPayload = (SimpleStoryViewerPayload) gsonLIZLLL.LIZJ(kVarLJJIIZ2, SimpleStoryViewerPayload.class);
                if (simpleStoryViewerPayload == null) {
                    return null;
                }
                c330560Cxa = new C330560Cxa(simpleStoryViewerPayload.total, simpleStoryViewerPayload.hasMore, simpleStoryViewerPayload.nextCursor, C1389550mGP.LIZIZ(simpleStoryViewerPayload.interactionUserList), simpleStoryViewerPayload.storyAnalytics, simpleStoryViewerPayload.isFullViewer, simpleStoryViewerPayload.expiryPeriod, simpleStoryViewerPayload.viewersCount, simpleStoryViewerPayload.offset, simpleStoryViewerPayload.isShowLikeListLimit);
            } else {
                c330560Cxa = (InterfaceC330550CxZ) gsonLIZLLL.LIZJ(kVarLJJIIZ2, Class.forName(strLJIL));
                if (c330560Cxa == null) {
                    return c330560Cxa;
                }
            }
            LIZIZ().put(str, c330560Cxa);
            return c330560Cxa;
        }
        return null;
    }

    public final void LIZJ(InterfaceC330550CxZ interfaceC330550CxZ, String str) {
        LIZIZ().put(str, interfaceC330550CxZ);
        ViewerListDiskCacheExpData viewerListDiskCacheExpData = C328170Ctj.LIZ;
        if (!viewerListDiskCacheExpData.enabled) {
            return;
        }
        System.currentTimeMillis();
        LJ.LIZIZ(null);
        LJ = C23118094a.LIZ();
        C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(LJ));
        LJFF = c054gLIZ;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C328200Ctm(str, null), 3);
        if (viewerListDiskCacheExpData.enabled) {
            C23250099c.LIZLLL(LJFF, null, null, new C328190Ctl(str, null), 3);
        }
        C23250099c.LIZLLL(LJFF, C0PEM.LIZJ, null, new C330540CxY(interfaceC330550CxZ, str, null), 2);
    }

    public final void LIZLLL(String str, StoryBulletListResponse storyBulletListResponse) {
        ((Map) this.LIZIZ.getValue()).put(str, storyBulletListResponse);
        if (!C328170Ctj.LIZ.enabled) {
            return;
        }
        C23250099c.LIZLLL(LJFF, C0PEM.LIZJ, null, new C330510CxV(storyBulletListResponse, str, null), 2);
    }
}
