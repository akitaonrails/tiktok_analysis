package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0zc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902670zc1 {
    public static final InterfaceC2661011f LIZ = C09S2.LIZ(C0CQT.LIZJ);

    public static QRCodeInfo LIZ(int i, String str, String str2) {
        try {
            return ((InterfaceC1902660zc0) LIZ.create(InterfaceC1902660zc0.class)).LIZ(i, str, str2).get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
