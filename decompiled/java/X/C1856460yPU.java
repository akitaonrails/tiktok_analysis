package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0yPU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856460yPU {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        boolean zLIZIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BaseImage baseImage = (BaseImage) obj;
            if (AnonymousClass1418.LJII(baseImage)) {
                zLIZIZ = LIZIZ(baseImage);
            } else if (baseImage.imageSceneType == 10003) {
                String str = baseImage.uri;
                if (str != null && str.length() != 0 && LIZIZ(baseImage)) {
                    arrayList.add(obj);
                }
            } else {
                zLIZIZ = LIZIZ(baseImage);
            }
            if (zLIZIZ) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean LIZIZ(BaseImage baseImage) {
        if (!C1854460yMG.LIZJ(baseImage)) {
            Integer num = baseImage.uploadStatus;
            if (num != null && num.intValue() == 3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean LIZJ(List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int i = ((BaseImage) it2.next()).imageSceneType;
                if (i == 10002 || i == 10001 || i == 10003) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List LIZLLL(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BaseImage baseImage = (BaseImage) obj;
            if (baseImage.imageSceneType == 10003) {
                String str = baseImage.uri;
                if (str != null && str.length() != 0 && !C1854460yMG.LIZJ(baseImage)) {
                    arrayList.add(obj);
                }
            } else if (!C1854460yMG.LIZJ(baseImage)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
