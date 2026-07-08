package X;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: X.0p5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498170p5b {
    public final Context LIZ;
    public List<String> LIZIZ = null;
    public final InterfaceC1471730oOx LIZJ;
    public final AbstractC1498210p5f LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Config{mHeartBeatPolicy=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", wsUrls=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mOkHttpClient=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", mRetryPolicy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1498170p5b(Context context, InterfaceC1471730oOx interfaceC1471730oOx, AbstractC1498210p5f abstractC1498210p5f) {
        this.LIZ = context;
        this.LIZJ = interfaceC1471730oOx;
        this.LIZLLL = abstractC1498210p5f;
    }
}
