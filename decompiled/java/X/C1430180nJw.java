package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicNameService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430180nJw {
    public static final String LIZ(Context context, MusicModel musicModel) {
        String name;
        IMusicNameService iMusicNameService;
        String strLIZ;
        List<MusicModel> mergedMusicList = musicModel.getMergedMusicList();
        if (C1458070o2v.LJFF() && context != null) {
            MusicModel musicModel2 = (MusicModel) C13LP.LJJJLL(mergedMusicList);
            if (!mergedMusicList.isEmpty()) {
                for (MusicModel musicModel3 : mergedMusicList) {
                    if (musicModel2 == null || musicModel3.getId() != musicModel2.getId()) {
                        break;
                    }
                }
                iMusicNameService = (IMusicNameService) PluggableExtentionKt.pluggableSpi$default(IMusicNameService.class, false, false, false, 14, null);
                if (iMusicNameService != null && (strLIZ = iMusicNameService.LIZ(context, musicModel2)) != null) {
                    return strLIZ;
                }
            } else {
                iMusicNameService = (IMusicNameService) PluggableExtentionKt.pluggableSpi$default(IMusicNameService.class, false, false, false, 14, null);
                if (iMusicNameService != null) {
                    return strLIZ;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (MusicModel musicModel4 : mergedMusicList) {
            if (context != null) {
                IMusicNameService iMusicNameService2 = (IMusicNameService) PluggableExtentionKt.pluggableSpi$default(IMusicNameService.class, false, false, false, 14, null);
                if (iMusicNameService2 != null) {
                    name = iMusicNameService2.LIZ(context, musicModel4);
                }
            } else {
                name = musicModel4.getName();
            }
            if (name != null) {
                arrayList.add(name);
            }
        }
        List listLJLJJLL = arrayList;
        if (C444960Hcc.LIZIZ()) {
            listLJLJJLL = C13LP.LJLJJLL(arrayList);
        }
        return C13LP.LJJLIIIJ(listLJLJJLL, " / ", null, null, 0, null, null, 62);
    }
}
