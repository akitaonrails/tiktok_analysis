package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ruo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711040Ruo extends C09AY implements Function1<C711340RvI, Boolean> {
    public C711040Ruo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        boolean z;
        CardInsertInfo cardInsertInfo = c711340RvI.LIZ.getCardInsertInfo();
        if (cardInsertInfo != null && cardInsertInfo.getCardType() == 84) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
