package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.0SQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721270SQz extends C1386170mAx {
    public static final C696350RTd LLII = new Object() { // from class: X.0RTd
    };

    public C721270SQz(Aweme aweme, String str, String str2, String str3, boolean z) {
        RecReasonEntry recReasonTag;
        RecReasonsStruct recReasonsStruct;
        String str4;
        Music music;
        this.LIZLLL = str;
        this.LJJLIIIJL = str2;
        LJIJI(aweme);
        this.LJLIIL = str3;
        String idStr = null;
        if (aweme != null) {
            recReasonTag = aweme.getRecReasonTag();
        } else {
            recReasonTag = null;
        }
        this.LLFZ = Objects.equals(str, "homepage_hot") ? recReasonTag : null;
        if (aweme != null) {
            recReasonsStruct = aweme.getRecReasonsStruct();
        } else {
            recReasonsStruct = null;
        }
        this.LLI = Objects.equals(str, "homepage_hot") ? recReasonsStruct : null;
        if (aweme != null && (music = aweme.getMusic()) != null) {
            idStr = music.getIdStr();
        }
        this.LJLJLLL = idStr;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        if (c1er1.LJJJLL(str)) {
            for (Map.Entry<String, String> entry : c1er1.I(aweme, str).entrySet()) {
                LJ(entry.getKey(), entry.getValue());
            }
        }
        if (z) {
            LJ("from_page", "graphic_detail");
            this.LJIL = 1;
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        LJ("in_fullpage", str4);
    }
}
