package X;

import android.content.Context;
import com.ss.videoarch.liveplayer.VideoLiveManager;

/* JADX INFO: renamed from: X.0uJE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698820uJE {
    public final Context LIZ;
    public InterfaceC1698710uJ3 LIZIZ;
    public InterfaceC1286560jaI LIZJ;
    public InterfaceC1699150uJl LIZLLL;
    public boolean LJ;
    public int LJFF = C538540LAe.LLJJJIL;
    public long LJI = 10000;
    public InterfaceC1491020ou4 LJII;

    public final VideoLiveManager LIZ() {
        if (this.LIZ == null) {
            throw new IllegalArgumentException("mContext should not be null");
        }
        if (this.LIZIZ == null) {
            throw new IllegalArgumentException("mListener should not be null");
        }
        if (this.LIZJ != null) {
            return new VideoLiveManager(this);
        }
        throw new IllegalArgumentException("mNetworkClient should not be null");
    }

    public C1698820uJE(Context context) {
        this.LIZ = context;
    }
}
