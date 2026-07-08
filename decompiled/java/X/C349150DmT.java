package X;

import com.ss.android.ugc.aweme.share.SharePlatform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349150DmT extends C09AY implements Function0<String> {
    public final /* synthetic */ List<SharePlatform> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C349150DmT(List<SharePlatform> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sb = new StringBuilder("Start update cache: \n-------------before-------------\n");
        List<SharePlatform> list = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SharePlatform> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().platformId);
        }
        sb.append(arrayList);
        return sb.toString();
    }
}
