package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rzk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714100Rzk extends C09AY implements Function1<C711340RvI, Boolean> {
    public C714100Rzk() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        CardInsertInfo cardInsertInfo;
        C711340RvI c711340RvI2 = c711340RvI;
        boolean z = true;
        if (c711340RvI2.LIZ.getAwemeType() != 4004 && ((cardInsertInfo = c711340RvI2.LIZ.getCardInsertInfo()) == null || cardInsertInfo.getCardType() != 49)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
