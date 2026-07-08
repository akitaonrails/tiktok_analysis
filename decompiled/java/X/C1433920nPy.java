package X;

import Y.ARunnableS83S0200000_14;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433920nPy {
    public final InterfaceC1434300nQa LIZ;

    public static final String LIZJ() {
        C197078128u.LIZ.getClass();
        return C197078128u.LIZ();
    }

    public C1433920nPy(C1434310nQb c1434310nQb) {
        this.LIZ = c1434310nQb;
    }

    public static final void LIZ(String str) {
        if (str == null || str.length() == 0) {
            str = "unknown";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("invoke_type", "cancelSynthesis");
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        c0lab.LJ("publish_parallel", "1");
        C20684815ws.LJIILLIIL("publish_service_cancel", c0lab.LIZ);
        C1433700nPc c1433700nPc = new C1433700nPc();
        c1433700nPc.LIZ = str;
        C1433230nOr c1433230nOrLIZ = c1433700nPc.LIZ();
        C1433500nPI c1433500nPI = C1433730nPf.LJIIIZ;
        if (c1433500nPI != null) {
            C1433730nPf.LJI.execute(new ARunnableS83S0200000_14(c1433500nPI, c1433230nOrLIZ, 20));
        }
    }

    public final InterfaceC1452170ntP LIZIZ(VideoPublishEditModel videoPublishEditModel, AwS601S0100000_22 awS601S0100000_22) {
        this.LIZ.LIZLLL();
        return C1441820nci.LIZ(videoPublishEditModel, awS601S0100000_22);
    }
}
