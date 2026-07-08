package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0dDK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1041680dDK {
    public final ITpcConsentService LIZ;
    public final boolean LIZIZ;
    public final WeakReference<Activity> LIZJ;

    public C1041680dDK(ITpcConsentService iTpcConsentService, Activity activity) {
        this.LIZ = iTpcConsentService;
        this.LIZIZ = iTpcConsentService.LJ();
        this.LIZJ = new WeakReference<>(activity);
    }
}
