package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Qvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686250Qvv {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(String str, List list) {
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Music) it2.next()).setRecommendSourceFrom(str);
        }
    }

    public static final void LIZ(int i, String str, List list, boolean z) {
        boolean z2;
        Object next;
        if (str != null && i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && list != null && z2) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (C08A4.LIZIZ(Long.valueOf(((Music) next).getId()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Music music = (Music) next;
            if (music != null) {
                music.setBestMatch(true);
            }
        }
    }

    public static final void LIZJ(String str, String str2, List list, Map map) {
        String str3;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_music_resource_tag", true) != 0 && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Music music = (Music) it2.next();
                MusicTag musicTag = new MusicTag();
                musicTag.setTagTitle(str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('\n');
                if (map != null) {
                    str3 = (String) ((LinkedHashMap) map).get(Long.valueOf(music.getId()));
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                musicTag.setRecallReason(C2188811AlT.LIZIZ(sbLIZ));
                music.setMusicTags(Collections.singletonList(musicTag));
            }
        }
    }
}
