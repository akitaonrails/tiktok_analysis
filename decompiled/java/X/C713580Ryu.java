package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ryu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713580Ryu extends C09AY implements Function1<C711340RvI, Boolean> {
    public C713580Ryu() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        boolean z;
        CardInsertInfo cardInsertInfo = c711340RvI.LIZ.getCardInsertInfo();
        if (cardInsertInfo != null && cardInsertInfo.getCardType() == 57) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
