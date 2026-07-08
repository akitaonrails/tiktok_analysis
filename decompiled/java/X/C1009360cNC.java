package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009360cNC {
    public static final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1015090cWR.class);
        arrayList.add(C1015130cWV.class);
        arrayList.add(C603620Nlw.class);
        arrayList.add(C1015160cWY.class);
        arrayList.add(C1015150cWX.class);
        arrayList.add(C1015110cWT.class);
        arrayList.add(C1015120cWU.class);
        arrayList.add(C1015140cWW.class);
        arrayList.add(C1641106bh.class);
        return arrayList;
    }

    public static final C1009390cNF LIZIZ(C1014730cVr c1014730cVr) {
        AnoleComponentLayoutModel anoleComponentLayoutModel;
        C1009390cNF c1009390cNF = new C1009390cNF(-1.0d, -1.0d);
        C1009390cNF c1009390cNFW2 = c1014730cVr.LLILLL.W2(c1014730cVr.LL.slotID);
        if (c1009390cNFW2 == null || (anoleComponentLayoutModel = c1014730cVr.LL.layout) == null) {
            return c1009390cNF;
        }
        double d = c1009390cNFW2.LIZ;
        double d2 = c1009390cNFW2.LIZIZ;
        if (!C1014320cVC.LIZJ(d)) {
            if (!C1014320cVC.LIZIZ(anoleComponentLayoutModel.left)) {
                d -= anoleComponentLayoutModel.left;
            }
            if (!C1014320cVC.LIZIZ(anoleComponentLayoutModel.right)) {
                d -= anoleComponentLayoutModel.right;
            }
        }
        if (!C1014320cVC.LIZJ(c1009390cNFW2.LIZIZ)) {
            if (!C1014320cVC.LIZIZ(anoleComponentLayoutModel.top)) {
                d2 -= anoleComponentLayoutModel.top;
            }
            if (!C1014320cVC.LIZIZ(anoleComponentLayoutModel.bottom)) {
                d2 -= anoleComponentLayoutModel.bottom;
            }
        }
        return new C1009390cNF(d, d2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.google.gson.n LIZ(X.C1014730cVr r8, X.C1008080cL8 r9) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1009360cNC.LIZ(X.0cVr, X.0cL8):com.google.gson.n");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1028380crs LIZJ(X.C1014730cVr r15, X.C19EG r16) {
        /*
            X.0crs r3 = new X.0crs
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r15.LL
            java.lang.String r2 = r0.type
            X.01GW r0 = r15.LLLILZJ
            java.lang.Object r1 = r0.getValue()
            X.0WOV r1 = (X.C0WOV) r1
            X.0cu4 r7 = new X.0cu4
            X.0cNA r0 = r15.LLILLJJLI
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZLLL
            java.lang.Long r0 = r0.getCreativeId()
            r4 = 0
            if (r0 == 0) goto L82
            java.lang.String r8 = r0.toString()
        L1f:
            X.0cNA r0 = r15.LLILLJJLI
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZLLL
            java.lang.String r9 = r0.getLogExtra()
            X.0cNA r0 = r15.LLILLJJLI
            java.lang.String r10 = r0.LIZIZ
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZLLL
            int r0 = r0.getChargeType()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            X.0cNA r0 = r15.LLILLJJLI
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.LIZLLL
            int r0 = r0.getSystemOrigin()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r13 = 0
            com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r6 = r15.LL
            X.01GW r0 = X.C135400fQ.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            if (r6 == 0) goto L7e
            java.lang.String r5 = r6.type
        L56:
            X.0cMU r0 = X.EnumC1008920cMU.SEARCH_ECOM_BRAND_ZONE
            java.lang.String r0 = r0.getType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 != 0) goto L72
            if (r6 == 0) goto L66
            java.lang.String r4 = r6.type
        L66:
            X.0cMU r0 = X.EnumC1008920cMU.SEARCH_CAROUSEL_LARGE_CARD
            java.lang.String r0 = r0.getType()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L80
        L72:
            r14 = 1
        L73:
            r15 = 32
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r16
            r3.<init>(r2, r1, r0, r7)
            return r3
        L7e:
            r5 = r4
            goto L56
        L80:
            r14 = 0
            goto L73
        L82:
            r8 = r4
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1009360cNC.LIZJ(X.0cVr, X.19EG):X.0crs");
    }

    public static final C1051290dSp LIZLLL(C1014730cVr c1014730cVr, String str, int i, String str2, C1008080cL8 c1008080cL8, boolean z) {
        String string;
        C1009380cNE c1009380cNE;
        EnumC1000680c9C enumC1000680c9C;
        String str3;
        AwemeRawAd awemeRawAd;
        Map<String, String> lynxSSRInfo;
        if (!c1014730cVr.LL.getSkipSchemaDataConcat()) {
            string = UriProtector.parse(str2).buildUpon().appendQueryParameter("initialData", LIZ(c1014730cVr, c1008080cL8).toString()).toString();
        } else {
            string = str2;
        }
        Bundle bundle = c1008080cL8.LIZ;
        if (bundle == null) {
            bundle = new Bundle();
        }
        C786410Ut5.LJJJI("key_anole_bundle_component_type", c1014730cVr.LL.type, bundle);
        bundle.putInt("key_anole_bundle_component_instance_hashcode", c1014730cVr.LJJI());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bundle = ");
        sbLIZ.append(bundle);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("baseLynxSchema = ");
        sbLIZ2.append(str2);
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("newSchema = ");
        sbLIZ3.append(string);
        C2188811AlT.LIZIZ(sbLIZ3);
        AnoleComponentModel anoleComponentModel = c1014730cVr.LL;
        String str4 = anoleComponentModel.type;
        String str5 = c1008080cL8.LIZIZ;
        final InterfaceC1020440cf4 interfaceC1020440cf4 = c1008080cL8.LIZJ;
        InterfaceC1020440cf4 interfaceC1020440cf42 = new InterfaceC1020440cf4() { // from class: X.0cf3
            @Override // X.InterfaceC1020440cf4
            public final List<Class<? extends InterfaceC1063710dmr>> LIZIZ() {
                List<Class<? extends InterfaceC1063710dmr>> listLIZIZ = interfaceC1020440cf4.LIZIZ();
                if (listLIZIZ == null) {
                    listLIZIZ = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(listLIZIZ);
                arrayList.addAll(C1009360cNC.LJ());
                return arrayList;
            }

            @Override // X.InterfaceC1020440cf4
            public final AbstractC1542100qES LIZLLL() {
                return interfaceC1020440cf4.LIZLLL();
            }

            @Override // X.InterfaceC1020440cf4
            public final List<InterfaceC1051730dTX> LIZ(C1051660dTQ c1051660dTQ) {
                return interfaceC1020440cf4.LIZ(c1051660dTQ);
            }

            @Override // X.InterfaceC1020440cf4
            public final InterfaceC1057870ddR LIZJ(AdSparkHybridContext adSparkHybridContext, Context context, String str6, Bundle bundle2) {
                return interfaceC1020440cf4.LIZJ(adSparkHybridContext, context, str6, bundle2);
            }
        };
        n nVarLIZ = null;
        if (anoleComponentModel.useLynxSSR) {
            C1009340cNA c1009340cNA = c1014730cVr.LLILLJJLI;
            if (c1009340cNA != null && (awemeRawAd = c1009340cNA.LIZLLL) != null && (lynxSSRInfo = awemeRawAd.getLynxSSRInfo()) != null) {
                String str6 = lynxSSRInfo.get(str4);
                if (str6 == null) {
                    str6 = null;
                }
                str3 = str6;
            } else {
                str3 = null;
            }
            c1009380cNE = new C1009380cNE(str3, (InterfaceC1015070cWP) c1014730cVr.LLLL.getValue());
        } else {
            c1009380cNE = null;
        }
        if (c1014730cVr.LL.getSkipSchemaDataConcat()) {
            nVarLIZ = LIZ(c1014730cVr, c1008080cL8);
        }
        C1049260dPY c1049260dPY = new C1049260dPY(str4, string, bundle, str5, interfaceC1020440cf42, false, null, false, null, null, c1009380cNE, nVarLIZ, 4064);
        if (Intrinsics.LJFF(c1014730cVr.LL.prerenderFailedStrategy, "not_show")) {
            enumC1000680c9C = EnumC1000680c9C.ONLY_CACHE;
        } else {
            enumC1000680c9C = EnumC1000680c9C.CACHE_WITH_RETRY;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[getAdHybridRenderOption] current adHybridRenderStrategy = ");
        sbLIZ4.append(enumC1000680c9C);
        C2188811AlT.LIZIZ(sbLIZ4);
        return new C1051290dSp(enumC1000680c9C, C1009370cND.LIZ(i, str, c1014730cVr.LL.type, c1008080cL8.LJ), 4, true, c1049260dPY, null, false, z, 200);
    }
}
