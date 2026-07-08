package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ELz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363250ELz {
    public static final Set<AVMusic> LIZ = new LinkedHashSet();

    public static void LIZ(AVMusic aVMusic) {
        AVMusic aVMusicLIZJ = LIZJ(aVMusic.getMusicId());
        if (aVMusicLIZJ == null) {
            AVMusic aVMusicM174clone = aVMusic.m174clone();
            if (aVMusicM174clone != null) {
                aVMusicM174clone.setMusicStartFromCut(0);
                LIZIZ(aVMusic, aVMusicM174clone);
                LIZ.add(aVMusicM174clone);
                return;
            }
            return;
        }
        LIZIZ(aVMusic, aVMusicLIZJ);
    }

    public static AVMusic LIZJ(String str) {
        Set<AVMusic> set = LIZ;
        AVMusic aVMusic = null;
        if (set.isEmpty() || str == null || str.length() == 0) {
            return null;
        }
        Iterator<AVMusic> it2 = set.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AVMusic next = it2.next();
            if (Intrinsics.LJFF(next.getMusicId(), str)) {
                aVMusic = next;
                break;
            }
        }
        return aVMusic;
    }

    public static void LIZIZ(AVMusic aVMusic, AVMusic aVMusic2) {
        List<AVMusic> extendMusicList = aVMusic.getExtendMusicList();
        ArrayList arrayList = null;
        if (extendMusicList != null) {
            arrayList = new ArrayList();
            Iterator<AVMusic> it2 = extendMusicList.iterator();
            while (it2.hasNext()) {
                AVMusic aVMusicM174clone = it2.next().m174clone();
                if (aVMusicM174clone != null) {
                    aVMusicM174clone.setMusicStartFromCut(0);
                    arrayList.add(aVMusicM174clone);
                }
            }
        }
        aVMusic2.setExtendMusicList(arrayList);
    }
}
