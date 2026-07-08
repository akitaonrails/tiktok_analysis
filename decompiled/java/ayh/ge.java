package ayh;

import X.C0C64;
import X.C0CHQ;
import X.C1440300naG;
import X.C1442390ndd;
import X.C1442400nde;
import X.C1983207pm;
import X.InterfaceC1442520ndq;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: loaded from: classes23.dex */
public final class ge {
    static {
        new ge();
    }

    public static final String LIZ() {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "ve_camera_preview_size", "", true);
        String strVeCameraPreviewSize = InterfaceC1442520ndq.LJIIIZ.veCameraPreviewSize();
        if (C1442390ndd.LIZ() || C1442400nde.LIZ()) {
            StringBuilder sb = new StringBuilder("key : ve_camera_preview_size , byteBenchValue : ");
            sb.append(C1983207pm.LIZ(String.class) ? String.valueOf(strVeCameraPreviewSize) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), strVeCameraPreviewSize));
            C1440300naG.LIZ(sb.toString());
            return strVeCameraPreviewSize;
        }
        StringBuilder sb2 = new StringBuilder("key : ve_camera_preview_size , libraValue : ");
        sb2.append(C1983207pm.LIZ(String.class) ? String.valueOf(strLJJ) : GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), strLJJ));
        C1440300naG.LIZ(sb2.toString());
        return strLJJ;
    }
}
