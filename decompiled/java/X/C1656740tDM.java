package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;

/* JADX INFO: renamed from: X.0tDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656740tDM {
    public static final /* synthetic */ int LIZ = 0;

    public static Effect LIZ() {
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        effect.setName("left-right");
        effect.setUnzipPath(LIZIZ());
        effect.setExtra("{\"duet_layout_mode\": \"{\\\"name\\\":\\\"horizontal\\\",\\\"change_direction_mode\\\":0,\\\"safety_status\\\":[\\\"new_left\\\"]}\"}");
        effect.setSdkExtra("");
        return effect;
    }

    public static boolean LIZJ() {
        File[] fileArrListFiles = new C0VSJ(LIZIZ()).listFiles();
        return (fileArrListFiles == null || fileArrListFiles.length == 0 || !Keva.getRepo("duet_layout").getBoolean("duet_layout_file_copied", false)) ? false : true;
    }

    public static String LIZIZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJZ("");
    }
}
