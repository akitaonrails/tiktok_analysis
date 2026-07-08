package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648360Pbu extends AbstractC649370PdX {
    public C648360Pbu() {
        super(null);
    }

    @Override // X.AbstractC649370PdX
    public final void LIZ() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC649370PdX
    public final void LIZIZ() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectMusicEvent(C0OGJ c0ogj) {
        try {
            C648850Pch c648850Pch = this.LLILLJJLI;
            if (c648850Pch != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("music_id", c0ogj.LIZ);
                jSONObject.put("collect_status", c0ogj.LIZIZ);
                c648850Pch.LIZ("changeMusicCollectState", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
