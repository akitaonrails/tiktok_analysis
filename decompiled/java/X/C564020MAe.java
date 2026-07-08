package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564020MAe {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(132));

    public static boolean LIZ() {
        return !((Boolean) C0AT2.LIZ.getValue()).booleanValue() || ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZJ(Intent intent) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3 = null;
        try {
            stringExtra = intent.getStringExtra("extra_template_schema_tag");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        try {
            stringExtra2 = intent.getStringExtra("shoot_way");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            stringExtra2 = null;
        }
        try {
            stringExtra3 = intent.getStringExtra("landing_tab");
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (Intrinsics.LJFF(stringExtra2, "draft_again")) {
            return ((Boolean) C0AT2.LIZ.getValue()).booleanValue();
        }
        if (!Intrinsics.LJFF(stringExtra2, "direct_shoot") && !Intrinsics.LJFF(stringExtra2, "single_song") && !Intrinsics.LJFF(stringExtra2, "duet") && !Intrinsics.LJFF(stringExtra2, "stitch") && !Intrinsics.LJFF(stringExtra2, "prop_page") && !Intrinsics.LJFF(stringExtra2, "mv_page") && !Intrinsics.LJFF(stringExtra2, "collection_music") && !Intrinsics.LJFF(stringExtra2, "comment_reply") && !Intrinsics.LJFF(stringExtra2, "ugc_template") && !Intrinsics.LJFF(stringExtra2, "photo_trend_template") && !Intrinsics.LJFF(stringExtra, "template_schema") && !Intrinsics.LJFF(stringExtra2, "answer") && !Intrinsics.LJFF(stringExtra2, "story") && !Intrinsics.LJFF("editor_tab", stringExtra3) && !Intrinsics.LJFF(stringExtra2, "sub_only_video_page")) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Intent intent, boolean z, boolean z2) {
        ExteriorRecordModel exteriorRecordModel;
        C0LGC c0lgc;
        C0LGC c0lgc2;
        if (!((Boolean) C0ASI.LIZ.getValue()).booleanValue() || ((Boolean) LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (LIZJ(intent)) {
            return false;
        }
        if (!z) {
            String[] strArrLIZ = C527810Kmx.LIZ();
            if (intent.hasExtra("exterior_record_model") && (exteriorRecordModel = (ExteriorRecordModel) intent.getParcelableExtra("exterior_record_model", ExteriorRecordModel.class)) != null && (((c0lgc = exteriorRecordModel.recordPageType) != null && c0lgc.getType() == C0LG8.PHOTO_SEARCH.getType()) || ((c0lgc2 = exteriorRecordModel.recordPageType) != null && c0lgc2.getType() == C0LG8.AIGC.getType()))) {
                strArrLIZ = new String[]{"android.permission.CAMERA"};
            }
            if (!C533930Kwp.LIZIZ(strArrLIZ)) {
                return true;
            }
            return false;
        }
        return z2;
    }
}
