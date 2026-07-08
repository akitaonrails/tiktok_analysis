package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15J2, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15J2 {
    public static void LIZ(C19EG c19eg, C15J3 c15j3, Function1 function1, Function0 function0, UrlModel urlModel, int i, String str) {
        Bundle bundle = new Bundle();
        if (((ArrayList) C1443030nef.LJII().LIZ).size() > 0) {
            C786410Ut5.LJJJI("challenge", ((AVChallenge) ListProtector.get(C1443030nef.LJII().LIZ, 0)).cid, bundle);
        } else {
            String str2 = c15j3.LIZJ;
            if (str2 != null) {
                C786410Ut5.LJJJI("challenge", str2, bundle);
            }
        }
        if (!TextUtils.isEmpty(c15j3.LIZ)) {
            C786410Ut5.LJJJI("first_sticker_music_ids", c15j3.LIZ, bundle);
        }
        if (!TextUtils.isEmpty(c15j3.LIZIZ)) {
            C786410Ut5.LJJJI("first_sticker_id", c15j3.LIZIZ, bundle);
        }
        bundle.putBoolean("is_busi_sticker", c15j3.LJIIIZ);
        if (c15j3.LJIIJ) {
            bundle.putBoolean("hide_cancel_music_ui", true);
        }
        long j = c15j3.LJIIL;
        if (j != 0) {
            bundle.putLong("max_video_duration", j);
        }
        if (c15j3.LJIIL != 0) {
            bundle.putLong("shoot_video_length", c15j3.LJIILIIL);
        }
        if (!TextUtils.isEmpty(c15j3.LJIILL)) {
            C786410Ut5.LJJJI("mission_music_id", c15j3.LJIILL, bundle);
        }
        if (!TextUtils.isEmpty(c15j3.LJI)) {
            C786410Ut5.LJJJI("enter_from", c15j3.LJI, bundle);
        }
        if (!TextUtils.isEmpty(c15j3.LJIILJJIL)) {
            C786410Ut5.LJJJI("mission_id", c15j3.LJIILJJIL, bundle);
        }
        UrlModel urlModel2 = c15j3.LJIL;
        if (urlModel2 != null) {
            C786410Ut5.LJJIZ(bundle, "effect_icon_url", urlModel2);
        }
        String str3 = c15j3.LJIJJ;
        if (str3 != null) {
            C786410Ut5.LJJJI("music_selected_from", str3, bundle);
        }
        String str4 = c15j3.LJIJJLI;
        if (str4 != null) {
            C786410Ut5.LJJJI("music_selected_method", str4, bundle);
        }
        boolean z = c15j3.LJJIII;
        if (z) {
            bundle.putBoolean("is_use_editor_pro_template", z);
        }
        IMusicRequestParam iMusicRequestParam = c15j3.LJJIFFI;
        if (iMusicRequestParam != null) {
            C786410Ut5.LJJIZ(bundle, "music_request_param", iMusicRequestParam);
        }
        List<String> list = c15j3.LJJII;
        if (list != null && !list.isEmpty()) {
            C786410Ut5.LJJJIL(bundle, "music_suggested_queries", (ArrayList) c15j3.LJJII);
        }
        boolean z2 = c15j3.LJJIIJ;
        if (z2) {
            bundle.putBoolean("enable_extend_music", z2);
        }
        boolean z3 = c15j3.LJJIIJZLJL;
        if (z3) {
            bundle.putBoolean("extra_show_lyric_tag", z3);
        }
        C1403010mc7.LIZ.getMusicService().bl(c19eg, new C20498315Iv(c19eg.getString(2131828505), 0, c15j3.LIZLLL, c15j3.LJ, bundle, c15j3.LJI, c15j3.LJII, false, c15j3.LJIIJJI, c15j3.LJFF, c15j3.LJIIIIZZ, c15j3.LJIILLIIL, str, urlModel, i, c15j3.LJIIZILJ, c15j3.LJIJ, c15j3.LJIJI, false, c15j3.LJJ, c15j3.LJJI), function1, function0);
    }
}
