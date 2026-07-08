package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664590Q4z {
    public static final C664590Q4z LIZ = new C664590Q4z();

    public static void LIZ(C653740Pka c653740Pka) {
        C0Q5W.LIZ.getClass();
        c653740Pka.LJ("search_caption_status", LIZJ(Boolean.valueOf(C0Q5W.LIZ())));
        c653740Pka.LJ("search_translated_status", LIZJ(Boolean.valueOf(C0Q5W.LIZIZ())));
        c653740Pka.LJ("not_translate_langs", C13LQ.LJJJ(C161N.LIZIZ.LL(), ",", null, null, null, 62));
        C664730Q5n.LIZ.getClass();
        c653740Pka.LJ("target_lang", C664730Q5n.LIZJ());
    }

    public static String LIZJ(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static Map LIZIZ(Aweme aweme, boolean z) {
        String strLIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            linkedHashMap.put("search_is_caption", "1");
            C664730Q5n.LIZ.getClass();
            if (!C664730Q5n.LIZ(aweme)) {
                strLIZJ = CardStruct.IStatusCode.DEFAULT;
            } else {
                strLIZJ = LIZJ(Boolean.valueOf(C664730Q5n.LIZLLL(C20703515zt.LJIIIZ(aweme))));
            }
            linkedHashMap.put("search_is_caption_translated", strLIZJ);
            if (C07H8.LIZJ()) {
                C0Q5W.LIZ.getClass();
                linkedHashMap.put("search_caption_translated_status", LIZJ(Boolean.valueOf(C0Q5W.LIZIZ())));
            }
        }
        C0Q5W.LIZ.getClass();
        linkedHashMap.put("search_caption_status", LIZJ(Boolean.valueOf(C0Q5W.LIZ())));
        if (C07H8.LIZ()) {
            linkedHashMap.put("search_title_translated_status", LIZJ(Boolean.valueOf(C0Q5W.LIZJ())));
        }
        return linkedHashMap;
    }
}
