package X;

import com.ss.bduploader.BDUploadUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0oA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462550oA9 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static void LIZ() {
        if (LIZ.compareAndSet(false, true)) {
            String strLJIIJJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIIJJI();
            C0VSJ c0vsjLIZ = C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(strLJIIJJI);
            if (!c0vsjLIZ.exists() && !c0vsjLIZ.mkdirs()) {
                C201955140j.LJI("upload-config-dir", new Throwable("create upload config dir failed!"));
            }
            BDUploadUtil.setSDKConfigDir(strLJIIJJI);
        }
    }

    public static int LIZIZ(int i) {
        C0CHQ.LIZ().getPublishService().LJJIIZI().getClass();
        C1436930nUp.LIZ();
        return i;
    }
}
