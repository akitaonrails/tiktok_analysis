package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0n2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419640n2w {
    public static String LIZ(Context context, MusicModel musicModel) {
        String name;
        String title;
        String str = "";
        if (musicModel == null || (name = musicModel.getName()) == null || name.length() == 0) {
            return "";
        }
        int i = C1419650n2x.LIZ[C1418630n1J.LIZIZ(musicModel).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Object[] objArr = new Object[1];
                    String singer = musicModel.getSinger();
                    if (singer != null) {
                        str = singer;
                    }
                    objArr[0] = str;
                    return context.getString(2131839043, objArr);
                }
                throw new C1954807lC();
            }
            MatchedPGCSoundInfo matchedPGCSoundInfo = musicModel.getMatchedPGCSoundInfo();
            if (matchedPGCSoundInfo != null && (title = matchedPGCSoundInfo.getTitle()) != null) {
                return title;
            }
            return musicModel.getName();
        }
        return musicModel.getName();
    }
}
