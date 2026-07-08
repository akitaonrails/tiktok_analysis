package X;

import com.bytedance.android.livesdk.comp.api.subscription.model.PunishmentData;
import com.bytedance.android.livesdk.comp.api.subscription.model.PunishmentDataResponse;
import com.bytedance.android.livesdk.comp.api.subscription.model.SubscriptionAccess;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Jiz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499870Jiz implements InterfaceC1528010prj {
    public final Function1<PunishmentData, Unit> LIZ;

    @Override // X.InterfaceC1528010prj
    public final void LIZIZ(EnumC1527990prh enumC1527990prh, JSONObject jSONObject) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C499870Jiz(Function1<? super PunishmentData, Unit> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC1528010prj
    public final void LIZ(LiveWsMessage liveWsMessage) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            String str = new String(liveWsMessage.LIZ(), Charsets.UTF_8);
            Gson gson = C19748512Ol.LIZJ;
            PunishmentDataResponse punishmentDataResponse = (PunishmentDataResponse) gson.LJII(str, PunishmentDataResponse.class);
            try {
                c098200Yq = (SubscriptionAccess) gson.LJII(punishmentDataResponse.anchorToast, SubscriptionAccess.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            SubscriptionAccess subscriptionAccess = (SubscriptionAccess) c098200Yq;
            try {
                c098200Yq2 = (SubscriptionAccess) gson.LJII(punishmentDataResponse.audienceToast, SubscriptionAccess.class);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            C500260Jjc.LJJLIIIJJIZ(new AwS408S0200000_7(this, new PunishmentData(punishmentDataResponse.anchorId, subscriptionAccess, (SubscriptionAccess) obj, punishmentDataResponse.appId), 80));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            C189200o6.m2constructorimpl(new C098200Yq(th3));
        }
    }
}
