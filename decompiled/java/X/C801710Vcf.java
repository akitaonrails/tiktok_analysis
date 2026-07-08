package X;

import android.os.Build;
import android.os.Process;
import java.io.File;

/* JADX INFO: renamed from: X.0Vcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C801710Vcf {
    public static void LIZ(int i, File file) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append("/anr_config.txt");
        C801720Vcg c801720Vcg = new C801720Vcg(C2188811AlT.LIZIZ(sbLIZ));
        c801720Vcg.LJIIIZ();
        c801720Vcg.LJII("oom_adj");
        c801720Vcg.LIZIZ(i);
        c801720Vcg.LJIIIIZZ();
        c801720Vcg.LJII("enable_upload_bg_anr");
        c801720Vcg.LJFF(false);
        c801720Vcg.LJIIIIZZ();
        c801720Vcg.LJII("enable_new_anr");
        c801720Vcg.LJFF(C803490VfX.LIZIZ);
        if (Build.VERSION.SDK_INT >= 24) {
            long startElapsedRealtime = C0VX9.LIZIZ().LJ - Process.getStartElapsedRealtime();
            c801720Vcg.LJIIIIZZ();
            c801720Vcg.LJII("init_sub_launch_time");
            c801720Vcg.LIZJ(startElapsedRealtime);
        }
        c801720Vcg.LJIIJ();
        c801720Vcg.LJI();
    }
}
