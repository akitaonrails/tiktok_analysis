package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.PlayImage;

/* JADX INFO: renamed from: X.00UK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00UK {
    public static final List<C00UL> LIZ(List<C00UL> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C00UL> it2 = list.iterator();
        while (it2.hasNext()) {
            List<PlayImage> list2 = it2.next().LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            for (PlayImage playImage : list2) {
                playImage.getClass();
                PlayImage playImage2 = new PlayImage();
                playImage2.uri = playImage.uri;
                playImage2.url = playImage.url;
                playImage2.type = playImage.type;
                playImage2.status = playImage.status;
                playImage2.imageId = playImage.imageId;
                arrayList2.add(playImage2);
            }
            arrayList.add(new C00UL(new ArrayList(arrayList2)));
        }
        return arrayList;
    }
}
