package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LiveData;

/* JADX INFO: renamed from: X.0LxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559790LxR extends AbstractC20016313Tl<InterfaceC559830LxV> implements InterfaceC559830LxV {
    public C559790LxR(Context context) {
        super(context, null);
    }

    @Override // X.InterfaceC559830LxV
    public final boolean LIZ(Context context, Uri uri, C417420GYi c417420GYi, int i, int i2) {
        Object value;
        LiveData liveData;
        ServiceConnectionC20016413Tm<INTERFACE> serviceConnectionC20016413Tm = this.LLILZIL;
        if (serviceConnectionC20016413Tm != 0 && (liveData = serviceConnectionC20016413Tm.LL) != null) {
            value = liveData.getValue();
        } else {
            value = null;
        }
        InterfaceC559830LxV interfaceC559830LxV = (InterfaceC559830LxV) value;
        if (interfaceC559830LxV != null) {
            interfaceC559830LxV.LIZ(context, uri, c417420GYi, i, i2);
            return true;
        }
        return false;
    }
}
