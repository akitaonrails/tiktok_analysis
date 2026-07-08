package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10FH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10FH extends C09AY implements Function0<C1260870iur<AbstractC666100QAu<PushSettings>, C10F8>> {
    public C10FH() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> invoke() {
        C1260870iur<AbstractC666100QAu<PushSettings>, C10F8> c1260870iurProvidePushSettingFetchPresenter = C19296410eQ.LIZIZ.providePushSettingFetchPresenter();
        c1260870iurProvidePushSettingFetchPresenter.LJIIJJI(new C10F8() { // from class: X.10FI
            @Override // X.C10F8
            public final void Hl(PushSettings pushSettings) {
                C10FG.LIZ.getClass();
                C10FG.LIZIZ(pushSettings);
            }

            @Override // X.C10F8
            public final void onFailed(Exception exc) {
                C10FG.LIZ.getClass();
                C10FG.LIZ(exc);
            }
        });
        return c1260870iurProvidePushSettingFetchPresenter;
    }
}
