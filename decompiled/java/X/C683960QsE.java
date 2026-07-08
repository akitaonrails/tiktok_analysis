package X;

import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QsE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683960QsE extends AbstractC1771870wD3 {
    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        LIZIZ().getEventCenter().LJFF("ecMixMallSaveCache", new InterfaceC1775150wIL() { // from class: X.0QsG
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                Object obj = map.get("key");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = map.get("data");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                if (str == null) {
                    c21175917tt.LIZ(0, "key is null", null);
                } else if (MMKStorageUtil.LIZ.LJI(str, obj2)) {
                    c21175917tt.LIZ(1, "success", null);
                } else {
                    c21175917tt.LIZ(0, "ecMixMallSaveCache failed", null);
                }
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMixMallGetCache", new InterfaceC1775150wIL() { // from class: X.0QsH
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                Object obj = map.get("key");
                if ((obj instanceof String) && (str = (String) obj) != null) {
                    c21175917tt.LIZ(1, "success", C2097908Jt.LIZJ(new Pair("data", MMKStorageUtil.LIZ.LIZIZ(str, ""))));
                } else {
                    c21175917tt.LIZ(0, "key is null", null);
                }
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMallSetSearchData", new InterfaceC1775150wIL() { // from class: X.0Qs9
            /* JADX WARN: Removed duplicated region for block: B:125:0x0282  */
            @Override // X.InterfaceC1775150wIL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.util.Map r30, java.util.Map r31, X.C21175917tt r32) {
                /*
                    Method dump skipped, instruction units count: 658
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C683910Qs9.LIZ(java.util.Map, java.util.Map, X.17tt):void");
            }
        });
        LIZIZ().getEventCenter().LJFF("ecMallGetSearchWordRequestParams", new InterfaceC1775150wIL() { // from class: X.0QsB
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                boolean z;
                String strQ0;
                this.LIZ.getClass();
                String strLJIJ = ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIJ();
                if (strLJIJ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str = "";
                if (z) {
                    strLJIJ = "";
                }
                ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
                if (iSearchService != null && (strQ0 = iSearchService.q0()) != null) {
                    str = strQ0;
                }
                c21175917tt.LIZ(1, "success", C2097608Jq.LJIIIIZZ(new Pair("fromGroupId", strLJIJ), new Pair("historyList", str)));
            }
        });
        LIZIZ().getEventCenter().LJFF("ecSearchManageUserAct", new InterfaceC1775150wIL() { // from class: X.0QsA
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                String str;
                String strLIZ;
                Object obj = map.get("key");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = map.get("action");
                if (!(obj2 instanceof String)) {
                    obj2 = null;
                }
                boolean z = map.get("userActData") instanceof String;
                if (obj2 == null) {
                    c21175917tt.LIZ(0, "action is null", null);
                    return;
                }
                if (Intrinsics.LJFF(obj2, "get")) {
                    if (str != null && str.length() != 0) {
                        strLIZ = C341050DYp.LIZLLL(str);
                    } else {
                        C2232408os c2232408os = C341050DYp.LIZ;
                        strLIZ = C341050DYp.LIZ(Integer.valueOf(C0QCT.LIZ()));
                    }
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    c21175917tt.LIZ(1, "success", C2097908Jt.LIZJ(new Pair("userActData", strLIZ)));
                    return;
                }
                c21175917tt.LIZ(1, "run nothing", null);
            }
        });
        LIZIZ().getEventCenter().LJFF("ecSearchSkinData", new InterfaceC1775150wIL() { // from class: X.0QsD
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                if (iEcomSearchService != null) {
                    iEcomSearchService.LJJLL(map);
                }
                c21175917tt.LIZ(1, "success", null);
            }
        });
    }
}
