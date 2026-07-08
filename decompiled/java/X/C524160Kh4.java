package X;

import com.ss.android.ugc.aweme.creative.model.effect.ApplyRecordEffectInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Kh4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524160Kh4 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Collection collection, ApplyRecordEffectInfo applyRecordEffectInfo) {
        Effect effect;
        if (applyRecordEffectInfo != null && !collection.isEmpty() && ((effect = applyRecordEffectInfo.curEffect) == null || !C1449600npG.LJIIIIZZ(effect) || collection.size() != 1 || ((MediaModel) C13LP.LJJJJZ(collection)).type == 4)) {
            int i = applyRecordEffectInfo.photoSelectMinCount;
            int i2 = applyRecordEffectInfo.photoSelectMaxCount;
            int size = collection.size();
            if (i <= size && size <= i2) {
                if (!collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        MediaModel mediaModel = (MediaModel) it2.next();
                        if (!mediaModel.LJIIJ() || mediaModel.height < 480 || mediaModel.width < 360) {
                        }
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(Collection collection, ApplyRecordEffectInfo applyRecordEffectInfo) {
        boolean z = false;
        if (applyRecordEffectInfo == null) {
            return false;
        }
        int i = applyRecordEffectInfo.photoSelectMinCount;
        int i2 = applyRecordEffectInfo.photoSelectMaxCount;
        int size = collection.size();
        if (i <= size && size <= i2) {
            z = true;
        }
        return !z;
    }
}
