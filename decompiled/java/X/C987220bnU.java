package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchQualityOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bnU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987220bnU implements InterfaceC1143790fs1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1143790fs1
    public final void onFinish(boolean z) {
        switch (this.$t) {
            case 0:
                onFinish$0(this, z);
                break;
            case 1:
                onFinish$1(this, z);
                break;
        }
    }

    public static final void onFinish$0(C987220bnU c987220bnU, boolean z) {
        if (!z) {
            C978500bZQ.LIZIZ("match_in_progress");
            ((C978020bYe) c987220bnU.l0).LJIILIIL();
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        int i = ((C118300cf) c987220bnU.l1).element;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C0K04.LIZLLL(i, "cache_count", jSONObject2);
        C0K04.LIZLLL(0, "user_lottie", jSONObject2);
        C0K04.LIZLLL(LiveMatchQualityOptimizeSetting.INSTANCE.getValue(), "optimize_switch", jSONObject2);
        String str = (String) DataChannelGlobal.LLILZ.gg0(C930600aKA.class);
        if (str == null) {
            str = "unknown";
        }
        C0K04.LJFF(Scene.SCENE_SERVICE, str, jSONObject2);
        C974540bT2.LLIIZ(c974540bT2, "start_animation_avatar_cache_hit", jSONObject, jSONObject2, null, true, null, 40);
    }

    public static final void onFinish$1(C987220bnU c987220bnU, boolean z) {
        ((C945740aia) c987220bnU.l0).LLILZ = z;
        C09AJ c09aj = (C09AJ) c987220bnU.l1;
        if (c09aj != null) {
            c09aj.onNext(Boolean.valueOf(z));
        }
        C09AJ c09aj2 = (C09AJ) c987220bnU.l1;
        if (c09aj2 != null) {
            c09aj2.onComplete();
        }
    }

    public C987220bnU(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
