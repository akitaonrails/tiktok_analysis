package X;

import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349170DmV extends C09AY implements Function0<List<? extends String>> {
    public C349170DmV() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        List listLIZ = C349180DmW.LIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLIZ) {
            if (((SharePlatform) obj).personalizeSortStrategy == 1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((SharePlatform) it2.next()).platformId);
        }
        return arrayList2;
    }
}
