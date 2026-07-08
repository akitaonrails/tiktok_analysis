package X;

import com.ss.android.ugc.effectmanager.IFetchResourceListener;

/* JADX INFO: renamed from: X.0fp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141920fp0 implements IFetchResourceListener {
    public final /* synthetic */ IFetchResourceListener LIZ;

    public C1141920fp0(IFetchResourceListener iFetchResourceListener) {
        this.LIZ = iFetchResourceListener;
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onFailure(Exception exc) {
        IFetchResourceListener iFetchResourceListener = this.LIZ;
        if (iFetchResourceListener != null) {
            iFetchResourceListener.onFailure(exc);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onSuccess(long j) {
        IFetchResourceListener iFetchResourceListener = this.LIZ;
        if (iFetchResourceListener != null) {
            iFetchResourceListener.onSuccess(j);
        }
    }
}
