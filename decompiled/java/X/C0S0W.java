package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S0W, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S0W extends C09AY implements Function1<C711340RvI, Boolean> {
    public C0S0W() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        boolean z;
        CardInsertInfo cardInsertInfo = c711340RvI.LIZ.getCardInsertInfo();
        if (cardInsertInfo != null && cardInsertInfo.getCardType() == 42) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
