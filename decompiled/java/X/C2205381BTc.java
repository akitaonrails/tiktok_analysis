package X;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: renamed from: X.1BTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205381BTc implements InterfaceC2203171BKp {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ Bundle LIZIZ;
    public final /* synthetic */ Bundle LIZJ;
    public final /* synthetic */ AbstractC2203141BKm LIZLLL;

    public C2205381BTc(AbstractC2203141BKm abstractC2203141BKm, Activity activity, Bundle bundle, Bundle bundle2) {
        this.LIZLLL = abstractC2203141BKm;
        this.LIZ = activity;
        this.LIZIZ = bundle;
        this.LIZJ = bundle2;
    }

    @Override // X.InterfaceC2203171BKp
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.InterfaceC2203171BKp
    public final void LIZ() {
        this.LIZLLL.LIZ.LIZ(this.LIZ, this.LIZIZ, this.LIZJ);
    }
}
