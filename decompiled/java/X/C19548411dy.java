package X;

import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import com.ss.android.ugc.aweme.services.audio.IAudioService;
import com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory;

/* JADX INFO: renamed from: X.11dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19548411dy implements IAudioServiceFactory<IAudioParams> {
    public static C19547411do LIZ;

    public static InterfaceC19549111e5 LIZ() {
        if (LIZ == null) {
            LIZ = new C19547411do();
        }
        C19547411do c19547411do = LIZ;
        if (c19547411do == null) {
            return null;
        }
        return c19547411do;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IAudioServiceFactory
    public final IAudioService getAudioService(IAudioParams iAudioParams) {
        if (LIZ == null) {
            LIZ = new C19547411do();
        }
        C19547411do c19547411do = LIZ;
        if (c19547411do == null) {
            return null;
        }
        return c19547411do;
    }
}
