package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sf5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635490sf5 {
    public static final C1635490sf5 LIZ = new C1635490sf5();
    public static final Pair<String, String> LIZIZ = new Pair<>("", "");

    public static Object LIZ(int i, C1687040u0E c1687040u0E) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1687040u0E));
        c2252611DEt.LJIJJ();
        try {
            C1633850scR.LIZ(C0CHQ.LIZ, null).LJIILLIIL(new MixedAssetsQueryAdditionalParameters(LIZIZ, "", null, null, null, false, null, null, true), i, new MixedAssetsRequestBodyInfo("ai_portrait", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "", "", "", null, null, null, null, Boolean.FALSE, null, "", null), new C1635500sf6(System.currentTimeMillis(), c2252611DEt));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ.getClass();
            LIZJ(null, c2252611DEt);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1687040u0E);
        }
        return objLJIJ;
    }

    public static void LIZJ(Object obj, InterfaceC20236714Gf interfaceC20236714Gf) {
        if (interfaceC20236714Gf.isActive()) {
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
        }
    }

    public static Object LIZIZ(int i, int i2, AbstractC23140094w abstractC23140094w) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C1633850scR.LIZ(C0CHQ.LIZ, null).LJIILIIL(new MixedAssetsQueryAdditionalParameters(LIZIZ, "", null, null, null, false, null, null, true), "ai_theater", "ai_portrait", i, i2, new MixedAssetsRequestBodyInfo("ai_portrait", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "", "", "", null, null, null, null, Boolean.FALSE, null, "", null), false, new IFetchAssetPanelInfo() { // from class: X.0sf7
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo
                public final void onFailed(ExceptionResult exceptionResult) {
                    Integer numValueOf;
                    String msg;
                    C1403705eV c1403705eV = C1403705eV.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (exceptionResult != null) {
                        numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                        msg = exceptionResult.getMsg();
                    } else {
                        numValueOf = null;
                        msg = null;
                    }
                    c1403705eV.getClass();
                    C1403705eV.LIZ(jCurrentTimeMillis2, msg, 1, "two_column", numValueOf);
                    C1635490sf5 c1635490sf5 = C1635490sf5.LIZ;
                    InterfaceC20236714Gf<AssetPanelResponse> interfaceC20236714Gf = c2252611DEt;
                    c1635490sf5.getClass();
                    C1635490sf5.LIZJ(null, interfaceC20236714Gf);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(AssetPanelResponse assetPanelResponse) {
                    C1403705eV c1403705eV = C1403705eV.LIZ;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    c1403705eV.getClass();
                    C1403705eV.LIZ(jCurrentTimeMillis2, null, 0, "two_column", null);
                    C1635490sf5 c1635490sf5 = C1635490sf5.LIZ;
                    InterfaceC20236714Gf<AssetPanelResponse> interfaceC20236714Gf = c2252611DEt;
                    c1635490sf5.getClass();
                    C1635490sf5.LIZJ(assetPanelResponse, interfaceC20236714Gf);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ.getClass();
            LIZJ(null, c2252611DEt);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLJIJ;
    }
}
