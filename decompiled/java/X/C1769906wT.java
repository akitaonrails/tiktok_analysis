package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769906wT implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<FollowStatus> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
        }
    }

    public C1769906wT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C1769906wT c1769906wT, C09AJ c09aj) {
        String strOptString;
        String strOptString2;
        FollowStatus followStatusLJIIIIZZ;
        C1C7U.LIZ("SpecActFollowMethod@7eba.handle$1");
        JSONObject jSONObject = (JSONObject) c1769906wT.l0;
        Integer numValueOf = null;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("uid");
        } else {
            strOptString = null;
        }
        JSONObject jSONObject2 = (JSONObject) c1769906wT.l0;
        if (jSONObject2 != null) {
            strOptString2 = jSONObject2.optString("sec_uid");
        } else {
            strOptString2 = null;
        }
        JSONObject jSONObject3 = (JSONObject) c1769906wT.l0;
        if (jSONObject3 != null) {
            numValueOf = Integer.valueOf(jSONObject3.optInt("type"));
        }
        if (strOptString != null && strOptString2 != null && numValueOf != null && (followStatusLJIIIIZZ = ((IUserService) ServiceManager.get().getService(IUserService.class)).LJIIIIZZ(numValueOf.intValue(), -1, -1, -1, strOptString, strOptString2, "", "", null, new HashMap())) != null) {
            c09aj.onNext(followStatusLJIIIIZZ);
        }
        C1C7U.LIZIZ("SpecActFollowMethod@7eba.handle$1");
    }

    public static final void subscribe$1(C1769906wT c1769906wT, C09AJ c09aj) {
        C1C7U.LIZ("EffectPlatformFunctionsKt@9d78.combineFetchList$1$checkChannelSuccess$1$onSuccess$1");
        c09aj.onNext(Boolean.valueOf(((EffectChannelResponse) c1769906wT.l0).getAllCategoryEffects().isEmpty()));
        c09aj.onComplete();
        C1C7U.LIZIZ("EffectPlatformFunctionsKt@9d78.combineFetchList$1$checkChannelSuccess$1$onSuccess$1");
    }

    public static final void subscribe$2(C1769906wT c1769906wT, C09AJ c09aj) {
        C1C7U.LIZ("EffectPlatformFunctionsKt@9d78.fetchBeautyComponentList$1$checkChannelSuccess$1$onSuccess$1");
        c09aj.onNext(Boolean.valueOf(((EffectChannelResponse) c1769906wT.l0).getAllCategoryEffects().isEmpty()));
        c09aj.onComplete();
        C1C7U.LIZIZ("EffectPlatformFunctionsKt@9d78.fetchBeautyComponentList$1$checkChannelSuccess$1$onSuccess$1");
    }

    public static final void subscribe$3(C1769906wT c1769906wT, C09AJ c09aj) {
        C1C7U.LIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$1");
        try {
            C23250099c.LIZLLL((InterfaceC497601wk) c1769906wT.l0, C0PEM.LIZJ, null, new C1478205qW(c09aj, null), 2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c09aj.onComplete();
        }
        C1C7U.LIZIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$1");
    }

    public static final void subscribe$4(C1769906wT c1769906wT, C09AJ c09aj) {
        C1C7U.LIZ("EffectAssetDownloader@f641.downloadMusic$1$1");
        String strLJ = C1416430mxl.LJ((C1416470mxp) c1769906wT.l0);
        if (strLJ != null) {
            c09aj.onNext(strLJ);
        }
        c09aj.onComplete();
        C1C7U.LIZIZ("EffectAssetDownloader@f641.downloadMusic$1$1");
    }
}
