package X;

import com.ss.android.ugc.aweme.innerpush.core.InnerPushManager;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15qE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20643615qE extends C2217421BqW implements Function1<JSONObject, JSONObject> {
    public C20643615qE(Object obj) {
        super(1, obj, InnerPushManager.class, "onClientSideIntelligenceMsgBlocked", "onClientSideIntelligenceMsgBlocked(Lorg/json/JSONObject;)Lorg/json/JSONObject;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final JSONObject invoke(JSONObject jSONObject) {
        return ((InnerPushManager) this.receiver).onClientSideIntelligenceMsgBlocked(jSONObject);
    }
}
