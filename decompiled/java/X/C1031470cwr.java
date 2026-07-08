package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.rich.reward.IGmtRewardAdPreRequestFactory;
import java.util.Map;
import kotlin.jvm.internal.AwS56S1300000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1031470cwr implements InterfaceC1031510cwv, InterfaceC1033070czR {
    public final InterfaceC1033100czU LIZ;

    @Override // X.InterfaceC1033070czR
    public final boolean LIZIZ() {
        return ((Boolean) C0BKQ.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1033070czR
    public final Gson getGson() {
        C1227904rF.LIZ.getClass();
        return C1227904rF.LIZLLL();
    }

    public C1031470cwr() {
        C844470XAv.LIZ.getClass();
        Intrinsics.LJFF(C844470XAv.LJIILL, "local_test");
        IGmtRewardAdPreRequestFactory iGmtRewardAdPreRequestFactory = (IGmtRewardAdPreRequestFactory) PluggableExtentionKt.pluggableSpi$default(IGmtRewardAdPreRequestFactory.class, false, false, false, 14, null);
        this.LIZ = iGmtRewardAdPreRequestFactory != null ? iGmtRewardAdPreRequestFactory.LIZ(this) : null;
    }

    @Override // X.InterfaceC1031510cwv
    public final InterfaceC1033100czU getPreRequestManager() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1033070czR
    public final void trackUserEvent(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }

    @Override // X.InterfaceC1033070czR
    public final void LIZ(EnumC1033600d0I enumC1033600d0I, Map map, AwS56S1300000_16 awS56S1300000_16) {
        C1033580d0G.LIZ.getClass();
        C1033580d0G.LIZ(enumC1033600d0I, "/tiktok/v1/ad/incentive/", null, map, awS56S1300000_16);
    }
}
