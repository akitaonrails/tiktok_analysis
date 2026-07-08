package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cL9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1008090cL9 {
    public abstract String LIZ();

    public boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
        return Intrinsics.LJFF(anoleComponentAppearModel.type, LIZ());
    }

    public static boolean LIZIZ(String str, List list) {
        if (list != null && (!list.isEmpty())) {
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next(), str)) {
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
