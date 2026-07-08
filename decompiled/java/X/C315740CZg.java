package X;

import com.ss.android.ugc.aweme.mention.experiment.HorizontalMentionMixSearchConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C315740CZg {
    public static final HorizontalMentionMixSearchConfig LIZ = new HorizontalMentionMixSearchConfig(null, null, 0, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5434));

    public static boolean LIZ(String str, boolean z) {
        String str2;
        List<String> list = ((HorizontalMentionMixSearchConfig) LIZIZ.getValue()).scenes;
        if (Intrinsics.LJFF(str, "text_caption") && z) {
            str2 = "story_note_mention";
        } else if (Intrinsics.LJFF(str, "text_caption")) {
            str2 = "text_mention";
        } else if (Intrinsics.LJFF(str, "sticker")) {
            str2 = "sticker_mention";
        } else if (Intrinsics.LJFF(str, "profile_bio")) {
            str2 = "bio_mention";
        } else if (Intrinsics.LJFF(str, "repost_text")) {
            str2 = "repost_mention";
        } else {
            str2 = null;
        }
        return C13LP.LJJJJ(str2, list);
    }
}
