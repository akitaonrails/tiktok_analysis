package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.ugc.gamora.celebration.PreloadConfig;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1420240n3u {
    public final String LIZ;
    public volatile AnonymousClass0956 LIZIZ;
    public volatile EnumC1420320n42 LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(17));

    public abstract List<PreloadConfig> LJ(String str);

    public abstract String LJFF();

    public abstract String LJI();

    public abstract Object LJIIIIZZ(AssetCategoryResponse assetCategoryResponse, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public boolean LJIIIZ(EnumC1420320n42 enumC1420320n42) {
        return true;
    }

    public boolean LJIIJ(EnumC1420320n42 enumC1420320n42) {
        return false;
    }

    public final String LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CelebrationAsset[");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1420240n3u(String str) {
        this.LIZ = str;
    }

    public MixedAssetsRequestBodyInfo LIZ(EnumC1420320n42 enumC1420320n42) {
        return new MixedAssetsRequestBodyInfo(LJI(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, enumC1420320n42.toRequestExtra(), "", "", null, null, null, null, Boolean.FALSE, null, "", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1420240n3u.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0n3u] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0n3u] */
    public final Object LIZJ(EnumC1420320n42 enumC1420320n42, C1407950mk5 c1407950mk5) {
        final ?? r0 = 1;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c1407950mk5));
        c2252611DEt.LJIJJ();
        try {
            r0 = this;
            ((InterfaceC1635410sex) r0.LIZLLL.getValue()).LJIILL(new MixedAssetsQueryAdditionalParameters(new Pair("", ""), "", null, null, null, true, null, null, false), r0.LJI(), r0.LJFF(), 0, Integer.MAX_VALUE, r0.LIZ(enumC1420320n42), new IFetchAssetCategoryInfo() { // from class: X.05cb
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo
                public final void onFailed(ExceptionResult exceptionResult) {
                    C554890LpX c554890LpX = C554890LpX.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJII());
                    sbLIZ.append(", EP onFailed: ");
                    sbLIZ.append(exceptionResult);
                    C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                    AbstractC1420240n3u abstractC1420240n3u = this.LIZ;
                    InterfaceC20236714Gf<AssetCategoryResponse> interfaceC20236714Gf = c2252611DEt;
                    abstractC1420240n3u.getClass();
                    if (interfaceC20236714Gf.isActive()) {
                        C189200o6.m2constructorimpl(null);
                        interfaceC20236714Gf.resumeWith(null);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(AssetCategoryResponse assetCategoryResponse) {
                    C554890LpX c554890LpX = C554890LpX.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LIZ.LJII());
                    sbLIZ.append(", EP onSuccess");
                    C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
                    AbstractC1420240n3u abstractC1420240n3u = this.LIZ;
                    InterfaceC20236714Gf<AssetCategoryResponse> interfaceC20236714Gf = c2252611DEt;
                    abstractC1420240n3u.getClass();
                    if (interfaceC20236714Gf.isActive()) {
                        C189200o6.m2constructorimpl(assetCategoryResponse);
                        interfaceC20236714Gf.resumeWith(assetCategoryResponse);
                    }
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(r0.LJII());
            sbLIZ.append(", fetchByEp exception: ");
            sbLIZ.append(e);
            C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            if (c2252611DEt.isActive()) {
                C189200o6.m2constructorimpl(null);
                c2252611DEt.resumeWith(null);
            }
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c1407950mk5);
        }
        return objLJIJ;
    }

    public final void LIZLLL(EnumC1420320n42 enumC1420320n42, boolean z) {
        if (!LJIIIZ(enumC1420320n42)) {
            C554890LpX c554890LpX = C554890LpX.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJII());
            sbLIZ.append(", skip: not needed for trigger=");
            sbLIZ.append(enumC1420320n42);
            C201955140j.LIZJ(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (z) {
            C554890LpX c554890LpX2 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LJII());
            sbLIZ2.append(", shouldFetch: force=true");
            C201955140j.LIZJ(c554890LpX2, C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            C1420250n3v c1420250n3v = C1420250n3v.LIZ;
            String str = this.LIZ;
            Keva kevaLIZIZ = C1420250n3v.LIZIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("_last_fetch_day_utc0");
            String string = kevaLIZIZ.getString(C2188811AlT.LIZIZ(sbLIZ3), null);
            if (string != null) {
                if (!Intrinsics.LJFF(string, String.valueOf(C1420250n3v.LIZ(c1420250n3v)))) {
                    if (((Number) C283430B8z.LIZ.getValue()).intValue() <= 0) {
                        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                        if (Intrinsics.LJFF(string, C786410Ut5.j4("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3)))) {
                        }
                    }
                    C554890LpX c554890LpX3 = C554890LpX.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(LJII());
                    sbLIZ4.append(", shouldFetch: not fetched in logical day");
                    C201955140j.LIZJ(c554890LpX3, C2188811AlT.LIZIZ(sbLIZ4));
                }
                try {
                    if (((InterfaceC1635410sex) this.LIZLLL.getValue()).LJJIIJ(LJI(), LJFF(), 0, Integer.MAX_VALUE) != null) {
                        C554890LpX c554890LpX4 = C554890LpX.LIZIZ;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(LJII());
                        sbLIZ5.append(", shouldFetch: skip, cache valid");
                        C201955140j.LIZJ(c554890LpX4, C2188811AlT.LIZIZ(sbLIZ5));
                        return;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C554890LpX c554890LpX5 = C554890LpX.LIZIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(LJII());
                sbLIZ6.append(", shouldFetch: EP cache missing, fallback");
                C201955140j.LIZJ(c554890LpX5, C2188811AlT.LIZIZ(sbLIZ6));
            } else {
                C554890LpX c554890LpX32 = C554890LpX.LIZIZ;
                StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                sbLIZ42.append(LJII());
                sbLIZ42.append(", shouldFetch: not fetched in logical day");
                C201955140j.LIZJ(c554890LpX32, C2188811AlT.LIZIZ(sbLIZ42));
            }
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            C554890LpX c554890LpX6 = C554890LpX.LIZIZ;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(LJII());
            sbLIZ7.append(", skip: already in progress");
            C201955140j.LIZJ(c554890LpX6, C2188811AlT.LIZIZ(sbLIZ7));
            return;
        }
        C554890LpX c554890LpX7 = C554890LpX.LIZIZ;
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(LJII());
        sbLIZ8.append(", start fetch, force=");
        sbLIZ8.append(z);
        sbLIZ8.append(", trigger=");
        sbLIZ8.append(enumC1420320n42);
        C201955140j.LIZJ(c554890LpX7, C2188811AlT.LIZIZ(sbLIZ8));
        this.LIZJ = enumC1420320n42;
        this.LIZIZ = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1407940mk4(this, null), 3);
    }
}
