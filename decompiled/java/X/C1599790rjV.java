package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0rjV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599790rjV {
    public final ITpcConsentService LIZ;
    public final boolean LIZIZ;

    public C1599790rjV(ITpcConsentService iTpcConsentService, Activity activity) {
        this.LIZ = iTpcConsentService;
        this.LIZIZ = iTpcConsentService.LJ();
        new WeakReference(activity);
    }
}
