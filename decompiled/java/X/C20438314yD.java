package X;

import com.ss.android.ugc.aweme.music.model.UnlimitedMusicListResponse;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14yD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20438314yD {
    public static final List<C20448614zs> LIZ(UnlimitedMusicListResponse unlimitedMusicListResponse) {
        ArrayList arrayList = new ArrayList();
        List<MusicModel> listLIZJ = C15J0.LIZJ(unlimitedMusicListResponse.getOriginalMusicList(), null, unlimitedMusicListResponse.extra, Boolean.FALSE);
        if (listLIZJ != null) {
            int i = 0;
            for (Object obj : (ArrayList) listLIZJ) {
                int i2 = i + 1;
                if (i >= 0) {
                    MusicModel musicModel = (MusicModel) obj;
                    musicModel.setNeedRecordConsumption(true);
                    musicModel.setEventPosition(i);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            arrayList.addAll(C20448514zr.LJ(listLIZJ));
        }
        return arrayList;
    }
}
