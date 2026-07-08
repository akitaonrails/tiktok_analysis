package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: renamed from: X.0ZlP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909050ZlP {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        ByteString bizExt;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ == null || (bizExt = c0y8tLIZ.getBizExt()) == null) {
            return false;
        }
        try {
            if (C2272701DxU.ADAPTER.decode(bizExt).ai_groupshot_status != C0IBF.FEATURE_STATUS_SHOW) {
                return false;
            }
            return true;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZIZ(String str) {
        C0Y8T c0y8tLIZ;
        ByteString bizExt;
        if (!C909170Zlb.LIZIZ() || str == null || (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)) == null || (bizExt = c0y8tLIZ.getBizExt()) == null) {
            return false;
        }
        try {
            C2272701DxU c2272701DxUDecode = C2272701DxU.ADAPTER.decode(bizExt);
            C0IBF c0ibf = c2272701DxUDecode.camera_status;
            C0IBF c0ibf2 = C0IBF.FEATURE_STATUS_SHOW;
            if (c0ibf != c0ibf2 || c2272701DxUDecode.photoswap_status != c0ibf2) {
                return false;
            }
            return true;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
