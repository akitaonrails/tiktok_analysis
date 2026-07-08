package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizOptExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.video.TranslatedVideo;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0N1B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1B {
    public static C0N17 LIZ;
    public static C11JF LIZIZ;
    public static FeedItemList LIZJ;
    public static boolean LIZLLL = true;
    public static final AtomicBoolean LJ = new AtomicBoolean(false);
    public static final HashSet<String> LJFF = new HashSet<>();
    public static boolean LJI;

    public static boolean LIZ(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        TranslatedVideo translatedVideo;
        Audio audio;
        List<TtsInfos> ttsInfos;
        Video video;
        if (!aweme.isAd() && !AwemeSaaSExtKt.isLive(aweme) && !C729510SjV.LJJIJIL(aweme)) {
            z = true;
        } else {
            z = false;
        }
        Video video2 = aweme.getVideo();
        String str = null;
        if (video2 != null) {
            str = video2.format;
        }
        boolean z8 = !TextUtils.equals(str, "dash");
        if (!((Boolean) C590380NDo.LJFF.getValue()).booleanValue() && (video = aweme.getVideo()) != null && video.hasByteVC2()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (((Boolean) C590380NDo.LJI.getValue()).booleanValue() && aweme.getAwemeType() == 150) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (C1481040ody.LIZ() && (audio = aweme.getAudio()) != null && (ttsInfos = audio.getTtsInfos()) != null && (!ttsInfos.isEmpty())) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (C287430BOj.LIZ() && (translatedVideo = aweme.getTranslatedVideo()) != null && translatedVideo.getVideo() != null) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z9 = !a0.LJJIIZI(C590440NDu.LIZLLL(), aweme.getAid(), false);
        if (AwemeBizOptExtKt.getAwemeCacheType(aweme) == 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (C590380NDo.LIZJ() && !C0NDH.LIZIZ.containsKey(aweme.getAid())) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (!z || !z8 || !z2 || !z3 || !z4 || !z5 || !z9 || !z7 || !z6) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Function0 function0) {
        if (C590380NDo.LIZIZ() && function0 != null) {
            function0.invoke();
        }
    }
}
