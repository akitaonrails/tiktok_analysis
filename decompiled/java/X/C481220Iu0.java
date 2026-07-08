package X;

import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.tux.sheet.sheet.TuxSheet;

/* JADX INFO: renamed from: X.0Iu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481220Iu0 implements InterfaceC481210Itz {
    public final IHostShare LIZ;

    public C481220Iu0(IHostShare iHostShare) {
        this.LIZ = iHostShare;
    }

    public final TuxSheet LIZ(Activity activity, C1106210etP c1106210etP, InterfaceC1372610lp5 interfaceC1372610lp5) {
        return this.LIZ.getShareTuxSheet(activity, c1106210etP, interfaceC1372610lp5);
    }
}
