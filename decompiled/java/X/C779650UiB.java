package X;

import com.bytedance.android.livesdk.livesetting.game.GameLiveClientInferDebugSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0UiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779650UiB {
    public InterfaceC779640UiA LIZ;

    public final void LIZ() {
        try {
            InterfaceC779640UiA interfaceC779640UiA = this.LIZ;
            if (interfaceC779640UiA != null) {
                interfaceC779640UiA.LJ();
            }
            Map<String, Object> map = C1338270kvh.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }

    public final void LIZIZ() {
        try {
            InterfaceC779640UiA interfaceC779640UiA = this.LIZ;
            if (interfaceC779640UiA != null) {
                interfaceC779640UiA.LJI();
            }
            this.LIZ = null;
            Map<String, Object> map = C1338270kvh.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C779650UiB(Room room) {
        try {
            String strModule = GameLiveClientInferDebugSetting.INSTANCE.module();
            Map<String, Object> map = C1338270kvh.LIZ;
            switch (strModule.hashCode()) {
                case -905648838:
                    if (strModule.equals("sexual") && !(this.LIZ instanceof AnonymousClass1513)) {
                        LIZIZ();
                        this.LIZ = new AnonymousClass1513(room);
                        LIZ();
                        break;
                    }
                    break;
                case -814503508:
                    if (strModule.equals("keytime") && !(this.LIZ instanceof C151P)) {
                        LIZIZ();
                        this.LIZ = new C151P(room);
                        LIZ();
                        break;
                    }
                    break;
                case -521447910:
                    if (strModule.equals("mlbb_hero") && !(this.LIZ instanceof C204514150u)) {
                        LIZIZ();
                        this.LIZ = new C204514150u(room);
                        LIZ();
                        break;
                    }
                    break;
                case 3496916:
                    if (strModule.equals("rest") && !(this.LIZ instanceof AnonymousClass1512)) {
                        LIZIZ();
                        this.LIZ = new AnonymousClass1512(room);
                        LIZ();
                        break;
                    }
                    break;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }
}
