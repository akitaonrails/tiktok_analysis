package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NextRequestScene;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.043O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043O {
    public static final String LIZ(List<NextRequestScene> list, C0NL6 c0nl6) {
        NextRequestScene next;
        Integer numValueOf;
        Iterator<NextRequestScene> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Integer num = next.sceneKey;
                if (c0nl6 != null) {
                    numValueOf = Integer.valueOf(c0nl6.getValue());
                } else {
                    numValueOf = null;
                }
                if (Intrinsics.LJFF(num, numValueOf)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NextRequestScene nextRequestScene = next;
        if (nextRequestScene == null) {
            return null;
        }
        return nextRequestScene.sceneValue;
    }
}
