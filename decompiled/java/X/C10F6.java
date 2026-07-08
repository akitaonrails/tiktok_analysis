package X;

import Y.ACallableS153S0000000_28;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;

/* JADX INFO: renamed from: X.10F6, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10F6 extends C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> {
    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        PushSettings pushSettings;
        T t = this.LL;
        if (t == 0 || (pushSettings = (PushSettings) t.getData()) == null || this.LLILLJJLI == 0) {
            return;
        }
        C813020Vuu c813020VuuLJIIL = C813020Vuu.LJIIL();
        C844470XAv.LIZ.getClass();
        c813020VuuLJIIL.LJIIJJI(C844470XAv.LIZ(), "last_user_setting_version", pushSettings.settingsVersion);
        ((C10F8) this.LLILLJJLI).Hl(pushSettings);
    }

    public C10F6() {
        LJIIJ(new AbstractC666100QAu<PushSettings>() { // from class: X.10F7
            @Override // X.AbstractC666100QAu
            public final boolean checkParams(Object... objArr) {
                return true;
            }

            @Override // X.AbstractC666100QAu
            public final boolean sendRequest(Object... objArr) {
                boolean zLJI = MethodIDManager.LJI(137740);
                boolean zLJI2 = MethodIDManager.LJI(137259);
                if (!super.sendRequest(objArr)) {
                    if (zLJI2) {
                        MethodIDManager.LJ();
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return false;
                }
                C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS153S0000000_28(1), 0);
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return true;
                }
                return true;
            }
        });
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((C10F8) k).onFailed(exc);
        }
    }
}
