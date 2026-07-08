package X;

import android.util.Pair;
import com.bytedance.applog.IBDAccountCallback;

/* JADX INFO: renamed from: X.1Be9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209751Be9 implements InterfaceC2189271AmD {
    public final /* synthetic */ C2209741Be8 LIZ;

    @Override // X.InterfaceC2189271AmD
    public final String LIZ() {
        IBDAccountCallback iBDAccountCallback = this.LIZ.LIZIZ.LLILLL.LJJJLIIL;
        if (iBDAccountCallback == null) {
            if (this.LIZ.LIZIZ.LLJIJIL.LIZ > 0) {
                return String.valueOf(this.LIZ.LIZIZ.LLJIJIL.LIZ);
            }
            return null;
        }
        Pair<Integer, Long> odinUserInfo = iBDAccountCallback.getOdinUserInfo();
        if (((Long) odinUserInfo.second).longValue() > 0) {
            return String.valueOf(odinUserInfo.second);
        }
        if (this.LIZ.LIZIZ.LLJIJIL.LIZLLL == 0) {
            return String.valueOf(this.LIZ.LIZIZ.LLJIJIL.LIZIZ);
        }
        return null;
    }

    @Override // X.InterfaceC2189271AmD
    public final String LIZIZ() {
        IBDAccountCallback iBDAccountCallback = this.LIZ.LIZIZ.LLILLL.LJJJLIIL;
        if (iBDAccountCallback == null) {
            return null;
        }
        Pair<Integer, Long> odinUserInfo = iBDAccountCallback.getOdinUserInfo();
        if (((Long) odinUserInfo.second).longValue() > 0) {
            return String.valueOf(odinUserInfo.first);
        }
        if (this.LIZ.LIZIZ.LLJIJIL.LIZLLL == 0) {
            return String.valueOf(this.LIZ.LIZIZ.LLJIJIL.LIZJ);
        }
        return null;
    }

    @Override // X.InterfaceC2189271AmD
    public final String LIZJ() {
        return this.LIZ.LIZIZ.LLILLL.getDid();
    }

    @Override // X.InterfaceC2189271AmD
    public final String LIZLLL() {
        return this.LIZ.LIZIZ.LLILLL.LJIIIZ;
    }

    public C2209751Be9(C2209741Be8 c2209741Be8) {
        this.LIZ = c2209741Be8;
    }
}
