package X;

import com.ss.android.ugc.aweme.music.model.FusedMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0OpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631290OpT {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(MusicFusion musicFusion) {
        if ((!musicFusion.isSmartExtended() && !musicFusion.isEpMultiMusic()) || !C07N7.LIZ()) {
            return false;
        }
        List<FusedMusic> list = musicFusion.fusedMusicInfos;
        ArrayList arrayList = new ArrayList();
        Iterator<FusedMusic> it2 = list.iterator();
        while (it2.hasNext()) {
            Music music = it2.next().music;
            if (music != null) {
                arrayList.add(music);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return false;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (!C631280OpS.LJ((Music) next)) {
                if (next == null) {
                    break;
                }
                return false;
            }
        }
        return true;
    }
}
