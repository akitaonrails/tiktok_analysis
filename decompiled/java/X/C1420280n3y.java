package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.BusinessExtra;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.gamora.celebration.PreloadConfig;
import com.ss.android.ugc.gamora.celebration.TabStyleConfig;
import com.ss.android.ugc.gamora.celebration.TemplateTabStyleConfig;
import com.ss.android.ugc.gamora.celebration.TooltipConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420280n3y {
    public static final C1420280n3y LIZ = new C1420280n3y();
    public static final List<AbstractC1420240n3u> LIZIZ = C1697810uHb.LJIIJJI(new AbstractC1420240n3u() { // from class: X.0n3x
        public final String LJ = "celebration";
        public final String LJFF = "editing";

        @Override // X.AbstractC1420240n3u
        public final String LJFF() {
            return this.LJFF;
        }

        @Override // X.AbstractC1420240n3u
        public final String LJI() {
            return this.LJ;
        }

        public static List LJIIJJI(PreloadConfig preloadConfig) {
            Pair pair;
            Pair pair2;
            Pair pair3;
            Pair pair4;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Pair[] pairArr = new Pair[5];
            TooltipConfig tooltipConfig = preloadConfig.tooltip;
            Pair pair5 = null;
            if (tooltipConfig != null && (str5 = tooltipConfig.image) != null) {
                pair = new Pair(str5, Boolean.FALSE);
            } else {
                pair = null;
            }
            pairArr[0] = pair;
            TabStyleConfig tabStyleConfig = preloadConfig.tab_style;
            if (tabStyleConfig != null && (str4 = tabStyleConfig.image) != null) {
                pair2 = new Pair(str4, Boolean.FALSE);
            } else {
                pair2 = null;
            }
            pairArr[1] = pair2;
            TabStyleConfig tabStyleConfig2 = preloadConfig.tab_style;
            if (tabStyleConfig2 != null && (str3 = tabStyleConfig2.lottie) != null) {
                pair3 = new Pair(str3, Boolean.TRUE);
            } else {
                pair3 = null;
            }
            pairArr[2] = pair3;
            TemplateTabStyleConfig templateTabStyleConfig = preloadConfig.template_tab_style;
            if (templateTabStyleConfig != null && (str2 = templateTabStyleConfig.image) != null) {
                pair4 = new Pair(str2, Boolean.FALSE);
            } else {
                pair4 = null;
            }
            pairArr[3] = pair4;
            TemplateTabStyleConfig templateTabStyleConfig2 = preloadConfig.template_tab_style;
            if (templateTabStyleConfig2 != null && (str = templateTabStyleConfig2.lottie) != null) {
                pair5 = new Pair(str, Boolean.TRUE);
            }
            pairArr[4] = pair5;
            List listLJIJI = C13LQ.LJIJI(pairArr);
            ArrayList arrayList = new ArrayList();
            for (Object obj : (ArrayList) listLJIJI) {
                if (((CharSequence) ((Pair) obj).getFirst()).length() > 0) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public static String LJIILIIL(String str) {
            if (str.length() == 0) {
                return str;
            }
            C2243408qe.LIZ.getClass();
            return C2243408qe.LIZLLL(str);
        }

        @Override // X.AbstractC1420240n3u
        public final List<PreloadConfig> LJ(String str) {
            Object c098200Yq;
            boolean z = false;
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
                z = true;
            }
            if (!z) {
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LJII());
                sbLIZ.append(", getActiveConfigs: VE plugin not ready, return empty");
                C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                return C13BV.INSTANCE;
            }
            try {
                c098200Yq = LJIIL(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(LJII());
                sbLIZ2.append(", getActiveConfigs error: ");
                sbLIZ2.append(thM5exceptionOrNullimpl);
                C201955140j.LJII(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
            }
            C13BV c13bv = C13BV.INSTANCE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = c13bv;
            }
            return (List) c098200Yq;
        }

        @Override // X.AbstractC1420240n3u
        public final boolean LJIIJ(EnumC1420320n42 enumC1420320n42) {
            if (enumC1420320n42 != EnumC1420320n42.CLICK_PLUS && enumC1420320n42 != EnumC1420320n42.LANGUAGE_CHANGE) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x0039 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00e4 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<com.ss.android.ugc.gamora.celebration.PreloadConfig> LJIIL(java.lang.String r20) {
            /*
                Method dump skipped, instruction units count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1420270n3x.LJIIL(java.lang.String):java.util.List");
        }

        /* JADX WARN: Removed duplicated region for block: B:63:0x0195  */
        @Override // X.AbstractC1420240n3u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object LJIIIIZZ(com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
            /*
                Method dump skipped, instruction units count: 420
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1420270n3x.LJIIIIZZ(com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse, X.05Vn):java.lang.Object");
        }
    }, new AbstractC1420240n3u() { // from class: X.0n3w
        public final String LJ = "feature_celebration";
        public final String LJFF = "editing";

        @Override // X.AbstractC1420240n3u
        public final String LJFF() {
            return this.LJFF;
        }

        @Override // X.AbstractC1420240n3u
        public final String LJI() {
            return this.LJ;
        }

        @Override // X.AbstractC1420240n3u
        public final MixedAssetsRequestBodyInfo LIZ(EnumC1420320n42 enumC1420320n42) {
            String str = this.LJ;
            String string = C1420250n3v.LIZIZ().getString("shot_landing_tab", null);
            if (string == null) {
                string = "";
            }
            return new MixedAssetsRequestBodyInfo(str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, enumC1420320n42.toRequestExtra(), "", "", null, null, null, null, Boolean.FALSE, null, "", string);
        }

        @Override // X.AbstractC1420240n3u
        public final List<PreloadConfig> LJ(String str) {
            Object c098200Yq;
            String string;
            boolean z;
            try {
                string = C1420250n3v.LIZIZ().getString("shot_landing_tab", null);
                if (string != null && string.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (z) {
                return C13BV.INSTANCE;
            }
            c098200Yq = Collections.singletonList(new PreloadConfig(string, null, null, null, null));
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LJII());
                sbLIZ.append(", getActiveConfigs error: ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            }
            C13BV c13bv = C13BV.INSTANCE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = c13bv;
            }
            return (List) c098200Yq;
        }

        @Override // X.AbstractC1420240n3u
        public final boolean LJIIIZ(EnumC1420320n42 enumC1420320n42) {
            if (enumC1420320n42 != EnumC1420320n42.LANGUAGE_CHANGE) {
                return true;
            }
            return false;
        }

        @Override // X.AbstractC1420240n3u
        public final Object LJIIIIZZ(AssetCategoryResponse assetCategoryResponse, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            boolean z;
            String asset_extra;
            String str;
            AssetCategoryModel data = assetCategoryResponse.getData();
            if (data == null) {
                return Unit.LIZ;
            }
            List<Asset> list = data.asset_list;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            String str2 = null;
            if (z) {
                C1420250n3v.LIZ.LIZJ(this.LIZ);
                C1420250n3v.LIZLLL(null);
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(LJII());
                sbLIZ.append(", onFetchSuccess: empty asset list, cleared landing_tab");
                C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                return Unit.LIZ;
            }
            Iterator<Asset> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BusinessExtra business_extra = it2.next().getBusiness_extra();
                if (business_extra != null && (asset_extra = business_extra.getAsset_extra()) != null) {
                    C1156540gCa.LIZ.getClass();
                    PreloadConfig preloadConfigLIZ = C1156540gCa.LIZ(asset_extra);
                    if (preloadConfigLIZ != null && (str = preloadConfigLIZ.landing_tab) != null && str.length() != 0) {
                        str2 = preloadConfigLIZ.landing_tab;
                        break;
                    }
                }
            }
            C1420250n3v.LIZ.LIZJ(this.LIZ);
            C1420250n3v.LIZLLL(str2);
            C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LJII());
            sbLIZ2.append(", onFetchSuccess: landing_tab=");
            sbLIZ2.append(str2);
            sbLIZ2.append(", saved to keva");
            C201955140j.LIZJ(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
            return Unit.LIZ;
        }
    });
    public static final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    static {
        C1906580ziK.LIZJ().LIZJ().LJJLJLI(new C09JN() { // from class: X.0n3z
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CreationPreloadAssetManager@86de.<init>$1");
                if (!((Boolean) obj).booleanValue()) {
                    C201955140j.LIZJ(C554890LpX.LIZIZ, "CelebrationAsset, onForeground");
                    C1420280n3y c1420280n3y = C1420280n3y.LIZ;
                    EnumC1420320n42 enumC1420320n42 = EnumC1420320n42.HOT_START;
                    c1420280n3y.getClass();
                    C1420280n3y.LIZ(enumC1420320n42);
                }
                C1C7U.LIZIZ("CreationPreloadAssetManager@86de.<init>$1");
            }
        });
    }

    public static void LIZ(EnumC1420320n42 enumC1420320n42) {
        if (((Boolean) C266710Acn.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(LIZJ, null, null, new C1407960mk6(enumC1420320n42, null), 3);
        } else {
            LIZIZ(enumC1420320n42);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.EnumC1420320n42 r6) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1420280n3y.LIZIZ(X.0n42):void");
    }

    public static List LIZJ(String str, String str2) {
        InterfaceC1420300n40 interfaceC1420300n40;
        List<PreloadConfig> listLJ;
        AbstractC1420240n3u abstractC1420240n3u = null;
        if (Intrinsics.LJFF(str, "celebration")) {
            interfaceC1420300n40 = C266680Ack.LIZ;
        } else {
            if (Intrinsics.LJFF(str, "shot_landing")) {
                interfaceC1420300n40 = C266690Acl.LIZ;
            }
            return C13BV.INSTANCE;
        }
        if (interfaceC1420300n40 != null) {
            if (interfaceC1420300n40.LIZJ()) {
                return C13BV.INSTANCE;
            }
            Iterator<AbstractC1420240n3u> it2 = LIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC1420240n3u next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    abstractC1420240n3u = next;
                    break;
                }
            }
            AbstractC1420240n3u abstractC1420240n3u2 = abstractC1420240n3u;
            if (abstractC1420240n3u2 != null && (listLJ = abstractC1420240n3u2.LJ(str2)) != null) {
                return listLJ;
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }
}
