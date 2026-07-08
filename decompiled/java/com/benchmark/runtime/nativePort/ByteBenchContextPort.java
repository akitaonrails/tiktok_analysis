package com.benchmark.runtime.nativePort;

import X.C2079408Cq;
import X.C21309718aN;
import com.benchmark.ByteBenchBundle;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public class ByteBenchContextPort {
    private native void native_init(long j);

    private native void native_initAsync();

    public final void LIZIZ() {
        if (C2079408Cq.LIZIZ) {
            native_initAsync();
        }
    }

    public final void LIZ(C21309718aN c21309718aN) {
        if (!C2079408Cq.LIZIZ) {
            return;
        }
        ByteBenchBundle byteBenchBundleObtain = ByteBenchBundle.obtain();
        byteBenchBundleObtain.setString("device_model", c21309718aN.LIZIZ);
        byteBenchBundleObtain.setInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
        byteBenchBundleObtain.setInt("appid", c21309718aN.LIZJ);
        byteBenchBundleObtain.setString("app_name", c21309718aN.LIZLLL);
        byteBenchBundleObtain.setLong("update_version_code", c21309718aN.LJFF);
        byteBenchBundleObtain.setString("app_version", c21309718aN.LJ);
        byteBenchBundleObtain.setString("did", c21309718aN.LJI);
        byteBenchBundleObtain.setString("uid", c21309718aN.LJII);
        byteBenchBundleObtain.setBool("is_open_runtime_decision", c21309718aN.LJIIL);
        byteBenchBundleObtain.setString("workspace", c21309718aN.LJIILJJIL);
        byteBenchBundleObtain.setString("base_url", c21309718aN.LJIILL);
        byteBenchBundleObtain.setBool("is_low_disk_memory", false);
        ByteBenchBundle byteBenchBundleObtain2 = ByteBenchBundle.obtain();
        Map<String, String> map = c21309718aN.LJIIIIZZ;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                byteBenchBundleObtain2.setString(entry.getKey(), entry.getValue());
            }
            byteBenchBundleObtain.setBundle("libraInfo", byteBenchBundleObtain2);
        }
        native_init(byteBenchBundleObtain.getHandle());
        byteBenchBundleObtain.recycle();
        byteBenchBundleObtain2.recycle();
    }
}
