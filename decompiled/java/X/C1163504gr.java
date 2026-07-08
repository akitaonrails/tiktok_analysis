package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ttf.track.IPaasEventTrack;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1163504gr implements IPaasEventTrack {
    public static final C1163504gr LIZIZ = new C1163504gr();
    public final /* synthetic */ IPaasEventTrack LIZ;

    @Override // com.tiktok.ttf.track.IPaasEventTrack
    public final void onEventV3(String str, Map<String, String> map) {
        this.LIZ.onEventV3(str, map);
    }

    @Override // com.tiktok.ttf.track.IPaasEventTrack
    public final void onEventV3(String str, JSONObject jSONObject) {
        this.LIZ.onEventV3(str, jSONObject);
    }

    public C1163504gr() {
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IPaasEventTrack.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            this.LIZ = (IPaasEventTrack) objPluggableSpi$default;
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
