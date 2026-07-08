package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06KD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06KD {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, int i, boolean z, int i2, boolean z2, int i3, boolean z3, boolean z4, boolean z5, boolean z6, int i4) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[11];
        pairArr[0] = new Pair("conversation_id", str);
        pairArr[1] = new Pair("conversation_type", String.valueOf(i));
        String str2 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_failed", obj);
        pairArr[3] = new Pair("failed_reason", String.valueOf(i2));
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[4] = new Pair("is_story_related_exp_enable", obj2);
        pairArr[5] = new Pair("streak_level", String.valueOf(i3));
        if (z3) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[6] = new Pair("has_streak_story_posted", obj3);
        if (z4) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[7] = new Pair("is_milestone_res", obj4);
        if (z5) {
            obj5 = "1";
        } else {
            obj5 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[8] = new Pair("is_restore", obj5);
        pairArr[9] = new Pair("streak_cnt", String.valueOf(i4));
        if (!z6) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[10] = new Pair("is_post_to_story_anim_enable", str2);
        C20684815ws.LJIILLIIL("trigger_streak_unlock_animation", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
