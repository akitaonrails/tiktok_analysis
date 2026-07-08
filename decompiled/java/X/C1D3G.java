package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.survey.SignalRule;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D3G, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D3G {
    public static final Map<String, Function1<SignalRule, Function1<String, Boolean>>> LIZ = C2097608Jq.LJIIIIZZ(new Pair(C1D3F.SERVER_SIGNAL_NAME_CLICK_SHARE.getValue(), AFwS283S0000000_35.get$arr$(136)), new Pair(C1D3F.SERVER_SIGNAL_NAME_CLICK_LIKE.getValue(), AFwS283S0000000_35.get$arr$(137)), new Pair(C1D3F.SERVER_SIGNAL_NAME_CLICK_FAVORITE.getValue(), AFwS283S0000000_35.get$arr$(138)), new Pair(C1D3F.SERVER_SIGNAL_NAME_CLICK_FOLLOW.getValue(), AFwS283S0000000_35.get$arr$(139)), new Pair(C1D3F.SERVER_SIGNAL_NAME_CLICK_PROFILE.getValue(), AFwS283S0000000_35.get$arr$(140)), new Pair(C1D3F.SERVER_SIGNAL_NAME_CLICK_COMMENT.getValue(), AFwS283S0000000_35.get$arr$(141)), new Pair(C1D3F.SERVER_SIGNAL_NAME_VIDEO_PLAY_FINISH.getValue(), AFwS283S0000000_35.get$arr$(142)));

    /* JADX WARN: Multi-variable type inference failed */
    public static final Function1<String, Boolean> LIZ(SignalRule signalRule, Function1<? super String, Boolean> function1) {
        String str;
        if (signalRule.name != null && (str = signalRule.value) != null && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return function1;
        }
        return null;
    }
}
