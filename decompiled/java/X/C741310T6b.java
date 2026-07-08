package X;

import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.PNSDeviceConsentServiceImpl;

/* JADX INFO: renamed from: X.0T6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741310T6b extends C0W9W {
    public final /* synthetic */ PNSDeviceConsentServiceImpl LL;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("PNSDeviceConsentServiceImpl@c354.setRecheckTimer$1");
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl = this.LL;
            pNSDeviceConsentServiceImpl.LJFF.removeCallbacks(pNSDeviceConsentServiceImpl.LJIJ);
            C786410Ut5.LJJZZIII(pNSDeviceConsentServiceImpl.LJFF, pNSDeviceConsentServiceImpl.LJIJ);
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("PNSDeviceConsentServiceImpl@c354.setRecheckTimer$1");
    }

    public C741310T6b(PNSDeviceConsentServiceImpl pNSDeviceConsentServiceImpl) {
        this.LL = pNSDeviceConsentServiceImpl;
    }
}
