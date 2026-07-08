package X;

import com.bytedance.i18n.location.api.LocationData;

/* JADX INFO: renamed from: X.1AUB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AUB implements InterfaceC687820QyS {
    public final /* synthetic */ C1AUC LIZ;

    public C1AUB(C1AUC c1auc) {
        this.LIZ = c1auc;
    }

    @Override // X.InterfaceC687820QyS
    public final void LIZ(LocationData locationData) {
        C1AUC c1auc = this.LIZ;
        if (c1auc != null) {
            C0UST c0ust = new C0UST();
            c0ust.LIZ = locationData.encryptedLatitude;
            c0ust.LIZIZ = locationData.encryptedLongitude;
            c1auc.LIZ(c0ust);
        }
    }

    @Override // X.InterfaceC687820QyS
    public final void onError(int i, String str) {
        C1AUC c1auc = this.LIZ;
        if (c1auc != null) {
            c1auc.onError(i, str);
        }
    }
}
