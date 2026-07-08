package X;

import com.bytedance.android.livesdk.livesetting.subscription.LivePcsHighIntentUserIdentificationSetting;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09GI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GI implements InterfaceC1123070fKb {
    public final String LIZ;
    public final boolean LIZIZ;
    public final Map<String, Object> LIZJ;
    public final C09GJ LIZLLL;
    public final String LJ;

    public C09GI() {
        LivePcsHighIntentUserIdentificationSetting livePcsHighIntentUserIdentificationSetting = LivePcsHighIntentUserIdentificationSetting.INSTANCE;
        this.LIZ = livePcsHighIntentUserIdentificationSetting.getAndroidScene();
        this.LIZIZ = livePcsHighIntentUserIdentificationSetting.isEnabled();
        this.LIZJ = C2097608Jq.LJ();
        this.LIZLLL = new C09GJ();
        this.LJ = "pitaya_output";
    }

    @Override // X.InterfaceC1123070fKb
    public final Map<String, Object> LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1123070fKb
    public final String LIZIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1123070fKb
    public final Function1<AbstractC1122140fJ6, Unit> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1123070fKb
    public final String getScene() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1123070fKb
    public final boolean isActive() {
        return this.LIZIZ;
    }
}
