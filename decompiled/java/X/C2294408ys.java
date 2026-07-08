package X;

import java.util.List;

/* JADX INFO: renamed from: X.08ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2294408ys {
    public static final void LIZ(C2294508yt c2294508yt) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - c2294508yt.LIZ, "time_cost");
        c0lab.LJFF("success", c2294508yt.LJII);
        c0lab.LJ("algo_name", c2294508yt.LIZLLL);
        c0lab.LIZ(c2294508yt.LJ, "width");
        c0lab.LIZ(c2294508yt.LJFF, "height");
        c0lab.LIZ(c2294508yt.LJI, "frame_count");
        c0lab.LJ("shoot_way", c2294508yt.LIZIZ);
        c0lab.LJ("content_source", c2294508yt.LIZJ);
        c0lab.LIZ(c2294508yt.LJIIIIZZ ? 1 : 0, "from_disk_cache");
        C2341909Fp.LIZ("tools_feature_extraction_item_performance", c0lab.LIZ);
    }
}
