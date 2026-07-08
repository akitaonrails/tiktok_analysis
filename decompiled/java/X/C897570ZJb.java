package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0ZJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897570ZJb {
    public final PrivacySettingsFeature LIZ;
    public final C1231704rr LIZIZ;
    public final ActivityStatusService LIZJ;
    public final InterfaceC497601wk LIZLLL;
    public boolean LJ;
    public volatile boolean LJFF;
    public final AtomicBoolean LJI;
    public final C891920Yys LJII;

    public final void LIZ() {
        boolean z = !C0ZK4.LIZIZ.getValue().LIZIZ();
        boolean zLIZIZ = C0ZH6.LIZIZ(this.LIZ);
        C1231704rr c1231704rr = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculateIsActiveStatusActivated isActiveStatusActivated=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" isAppForeground=");
        sbLIZ.append(z);
        sbLIZ.append(" isActivityStatusOn=");
        sbLIZ.append(zLIZIZ);
        sbLIZ.append(" hasForceClose=");
        sbLIZ.append(this.LJFF);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        this.LJ = z && zLIZIZ && !this.LJFF;
    }

    public final boolean LIZIZ() {
        boolean z = this.LJ;
        LIZ();
        return this.LJ && !z;
    }

    public final boolean LIZJ() {
        boolean z = this.LJ;
        LIZ();
        return !this.LJ && z;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Yys] */
    public C897570ZJb(PrivacySettingsFeature privacySettingsFeature, C1231704rr c1231704rr, ActivityStatusService activityStatusService) {
        C054G c054gLIZ = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()).plus(C2296908zH.LIZ()));
        this.LIZ = privacySettingsFeature;
        this.LIZIZ = c1231704rr;
        this.LIZJ = activityStatusService;
        this.LIZLLL = c054gLIZ;
        this.LJI = new AtomicBoolean(false);
        this.LJII = new InterfaceC989510brB<PrivacyUserSettingsV2>() { // from class: X.0Yys
            @Override // X.InterfaceC989510brB
            public final void LLZZLLIL(PrivacyUserSettingsV2 privacyUserSettingsV2) {
                boolean zBooleanValue;
                Boolean boolLJIIL;
                C891910Yyr.LIZ(C0ZJN.LIZ());
                PrivacySettingsFeature privacySettingsFeature2 = this.LL.LIZ;
                if (privacySettingsFeature2 != null && (boolLJIIL = privacySettingsFeature2.LJIIL()) != null) {
                    zBooleanValue = boolLJIIL.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0ZJW(this.LL, zBooleanValue, null), 3);
            }
        };
    }
}
