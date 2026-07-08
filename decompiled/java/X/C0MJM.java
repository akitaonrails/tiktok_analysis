package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import java.util.List;

/* JADX INFO: renamed from: X.0MJM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJM {
    public static long LIZ = 0;
    public static long LIZIZ = 0;
    public static int LIZJ = 0;
    public static boolean LIZLLL = true;

    public static final double LIZ(long j) {
        double dCurrentTimeMillis = (System.currentTimeMillis() - j) / ((double) 86400000);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftEditHelper -> sinceFirstSaveTime: saveTime = ");
        sbLIZ.append(j);
        sbLIZ.append("; time = ");
        sbLIZ.append(dCurrentTimeMillis);
        sbLIZ.append('}');
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return dCurrentTimeMillis;
    }

    public static final void LIZJ(AVMusic aVMusic, String str) {
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("shoot_way", "draft_again");
        c0lab.LJ("music_id", aVMusic.getMusicId());
        c0lab.LJFF("is_ui_shoot", true);
        C1448620nng.LIZ(new C0MJN(c0lab));
        if (C123100dR.LIZ(str)) {
            c0lab.LJ("draft_again_type", str);
        }
        c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        C2341909Fp.LIZ("shoot", c0lab.LIZ);
    }

    public static final void LIZIZ(int i, String str, String str2, long j, String str3) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_method", "batch_select");
        c0lab.LIZ(i, "draft_cnt");
        c0lab.LIZIZ(j, "draft_size");
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("page_type", str);
        c0lab.LJ("draft_select_page_type", str3);
        C20684815ws.LJIILLIIL("delete_drafts", c0lab.LIZ);
    }

    public static final void LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        C1448620nng.LIZ(new C0MJN(c0lab));
        if (!C298260Bma.LIZ()) {
            c0lab.LJFF("is_ui_shoot", false);
        }
        if (!C580130Mp9.LIZ(list) && !TextUtils.isEmpty((CharSequence) ListProtector.get(list, 0))) {
            c0lab.LJ("prop_id", (String) ListProtector.get(list, 0));
        }
        if (C123100dR.LIZ(str4)) {
            c0lab.LJ("draft_again_type", str4);
        }
        if (C123100dR.LIZ(str5)) {
            c0lab.LJ("prop_resource_id", str5);
        }
        c0lab.LJ("prop_category", str6);
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        if (str3 == null) {
            str3 = "";
        }
        iRecordMobService.LIZIZ(new C1449410nox(str, "draft_again", "draft_page", null, null, new C1449430noz(str2, str3), null, null, 216), c0lab, null);
    }
}
