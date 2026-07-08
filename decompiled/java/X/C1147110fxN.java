package X;

import android.os.Bundle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.gift.model.MusicGiftMoodColor;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147110fxN {
    public static void LIZ(Bundle bundle, C1147020fxE c1147020fxE) {
        List listLIZ;
        List listLIZ2;
        String str;
        bundle.putLong("gift_id", c1147020fxE.LIZ);
        bundle.putLong("song_id", c1147020fxE.LIZIZ);
        bundle.putLong("mood_id", c1147020fxE.LIZJ);
        bundle.putLong("snippet_id", c1147020fxE.LIZLLL);
        C786410Ut5.LJJJI("entry_source", c1147020fxE.LJ.name(), bundle);
        C786410Ut5.LJJJI("enter_from", c1147020fxE.LJFF, bundle);
        C786410Ut5.LJJJI("playback_session_id", c1147020fxE.LJI, bundle);
        bundle.putLong("position_ms", c1147020fxE.LJII);
        bundle.putInt("lyric_line_index", c1147020fxE.LJIIIIZZ);
        bundle.remove("initial_mood_id");
        bundle.remove("initial_mood_name");
        bundle.remove("initial_mood_title");
        bundle.remove("initial_mood_icon_urls");
        bundle.remove("initial_mood_disc_urls");
        bundle.remove("initial_mood_gift_list_hex");
        bundle.remove("initial_mood_secondary_page_hex");
        MusicGiftMood musicGiftMood = c1147020fxE.LJIIIZ;
        if (musicGiftMood != null) {
            bundle.putLong("initial_mood_id", musicGiftMood.moodId);
            C786410Ut5.LJJJI("initial_mood_name", musicGiftMood.name, bundle);
            C786410Ut5.LJJJI("initial_mood_title", musicGiftMood.title, bundle);
            ImageModel imageModel = musicGiftMood.icon;
            String str2 = null;
            if (imageModel == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null) {
                listLIZ = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLIZ) {
                if (!a0.LJJJIL((String) obj)) {
                    arrayList.add(obj);
                }
            }
            C786410Ut5.LJJJIL(bundle, "initial_mood_icon_urls", new ArrayList(arrayList));
            ImageModel imageModel2 = musicGiftMood.disc;
            if (imageModel2 == null || (listLIZ2 = C842240X2g.LIZ(imageModel2)) == null) {
                listLIZ2 = C13BV.INSTANCE;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listLIZ2) {
                if (!a0.LJJJIL((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            C786410Ut5.LJJJIL(bundle, "initial_mood_disc_urls", new ArrayList(arrayList2));
            MusicGiftMoodColor musicGiftMoodColor = musicGiftMood.color;
            if (musicGiftMoodColor != null) {
                str2 = musicGiftMoodColor.giftListHex;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            C786410Ut5.LJJJI("initial_mood_gift_list_hex", str2, bundle);
            MusicGiftMoodColor musicGiftMoodColor2 = musicGiftMood.color;
            if (musicGiftMoodColor2 != null && (str = musicGiftMoodColor2.secondaryPageHex) != null) {
                str3 = str;
            }
            C786410Ut5.LJJJI("initial_mood_secondary_page_hex", str3, bundle);
        }
    }
}
