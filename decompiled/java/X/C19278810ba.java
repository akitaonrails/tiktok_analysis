package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.JoinBetaEntrance;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;

/* JADX INFO: renamed from: X.10ba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19278810ba implements C10FJ {
    public static final C19278810ba LL = new C19278810ba();
    public static JoinBetaEntrance LLILLJJLI;

    @Override // X.C10FJ
    public final void Hl(PushSettings pushSettings) {
        LLILLJJLI = pushSettings.joinBetaEntrance;
    }

    @Override // X.C10FJ
    public final void onFailed(Exception exc) {
        LLILLJJLI = null;
    }
}
