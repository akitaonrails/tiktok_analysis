package X;

import com.bytedance.android.livesdk.replay.proto.SpriteImageItem;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0xrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835390xrV {
    public static boolean LIZ;

    public static void LIZ(Long l) {
        if (l != null) {
            l.longValue();
            C1834350xpp.LIZ.getClass();
            C0JT6<Map<Long, Long>> c0jt6 = C1834350xpp.LJIIIIZZ;
            Map<Long, Long> mapLIZ = c0jt6.LIZ();
            if (mapLIZ == null) {
                return;
            }
            mapLIZ.remove(l);
            c0jt6.LIZJ(mapLIZ);
        }
    }

    public static List LIZIZ(List list) {
        if (list != null) {
            ArrayList<SpriteImageItem> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SpriteImageItem) obj).url != null) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (SpriteImageItem spriteImageItem : arrayList) {
                String str = spriteImageItem.url;
                if (str == null) {
                    str = "";
                }
                arrayList2.add(new IHostSubscription.SpriteImage(str, (int) spriteImageItem.spriteNum, (int) spriteImageItem.imageXNum, (int) spriteImageItem.imageYNum, (int) spriteImageItem.imageHeight, (int) spriteImageItem.imageWidth, (int) spriteImageItem.fps));
            }
            return arrayList2;
        }
        return null;
    }

    public static Integer LIZJ(long j) {
        long jLongValue;
        C1834350xpp.LIZ.getClass();
        Map<Long, Long> mapLIZ = C1834350xpp.LJIIIIZZ.LIZ();
        if (mapLIZ == null) {
            mapLIZ = new LinkedHashMap<>();
        }
        if (mapLIZ.containsKey(Long.valueOf(j))) {
            long jLIZJ = C158B.LIZJ();
            Long l = mapLIZ.get(Long.valueOf(j));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = jLIZJ;
            }
            long j2 = jLIZJ - jLongValue;
            if (j2 > 90) {
                j2 = 90;
            }
            return Integer.valueOf((int) j2);
        }
        return null;
    }
}
