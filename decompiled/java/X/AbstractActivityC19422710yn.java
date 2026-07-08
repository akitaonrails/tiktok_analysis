package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.ss.android.vesdk.VEMetadataCheckCallBack;
import com.ss.android.vesdk.VEUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.10yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractActivityC19422710yn extends BaseActivity implements InterfaceC876920Yag {
    @Override // X.InterfaceC876920Yag
    public final List<Integer> zs() {
        return Collections.singletonList(9);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C19422610ym.LIZIZ) {
            C19422610ym.LIZIZ = true;
            C19422610ym.LIZ.getClass();
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_metadata_check", true, false) || C0C64.LJIILLIIL().LJIIIZ(31744, "enable_metadata_clean", true, false)) {
                String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "metadata_allow_list", "", true);
                if (strLJJ == null) {
                    strLJJ = "";
                }
                if (strLJJ.length() > 0) {
                    C19422410yk c19422410yk = new VEMetadataCheckCallBack() { // from class: X.10yk
                        @Override // com.ss.android.vesdk.VEMetadataCheckCallBack
                        public final void onInfoCallback(int i, String str) {
                            if (i != 1) {
                                if (i == 2) {
                                    C19422610ym.LIZ.getClass();
                                    C0LAB c0lab = new C0LAB();
                                    c0lab.LJ("duration", str);
                                    C20684815ws.LJIILLIIL("tools_manage_metadata_time_cost", c0lab.LIZ);
                                    return;
                                }
                                return;
                            }
                            C19422610ym c19422610ym = C19422610ym.LIZ;
                            EnumC19358610oS enumC19358610oS = EnumC19358610oS.WRITE;
                            c19422610ym.getClass();
                            C19422610ym.LIZIZ(enumC19358610oS, str);
                        }
                    };
                    boolean zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_metadata_check", true, false);
                    boolean zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_metadata_clean", true, false);
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI("com.android.capture.fps,com.android.information:com.bytedance.info|interaction_stickers", "com.android.information:com.bytedance.info|interactive_branded_effect_infos", "com.android.information:com.bytedance.info|is_km_video", "aigc_info"), ",", null, null, 0, null, null, 62);
                    String strLJJ2 = C0C64.LJIILLIIL().LJJ(31744, "metadata_allow_list", "", true);
                    if (strLJJ2 == null) {
                        strLJJ2 = "";
                    }
                    VEUtils.setVEMetadataWriteAllowlistConfig(zLJIIIZ, zLJIIIZ2, strLJJLIIIJ, strLJJ2, c19422410yk);
                }
            }
            if ((C0C64.LJIILLIIL().LJIIIZ(31744, "enable_read_metadata_check", true, false) || C0C64.LJIILLIIL().LJIIIZ(31744, "enable_read_metadata_clean", true, false)) && C19422610ym.LIZ().length() > 0) {
                VEUtils.setVEMetadataReadAllowlistConfig(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_read_metadata_check", true, false), C0C64.LJIILLIIL().LJIIIZ(31744, "enable_read_metadata_clean", true, false), "", C19422610ym.LIZ(), new VEMetadataCheckCallBack() { // from class: X.10yl
                    @Override // com.ss.android.vesdk.VEMetadataCheckCallBack
                    public final void onInfoCallback(int i, String str) {
                        if (i == 0) {
                            C19422610ym c19422610ym = C19422610ym.LIZ;
                            EnumC19358610oS enumC19358610oS = EnumC19358610oS.READ;
                            c19422610ym.getClass();
                            C19422610ym.LIZIZ(enumC19358610oS, str);
                        }
                    }
                });
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
