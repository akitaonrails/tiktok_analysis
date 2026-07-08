package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713840RzK extends C09AY implements Function1<C711340RvI, Boolean> {
    public C713840RzK() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        boolean z;
        Set<Integer> set = C20681215wI.LIZ;
        CardInsertInfo cardInsertInfo = c711340RvI.LIZ.getCardInsertInfo();
        if (cardInsertInfo != null && cardInsertInfo.getCardType() == 2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
