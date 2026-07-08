package X;

import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0So1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732310So1 extends C09AY implements Function1<C711340RvI, Boolean> {
    public C732310So1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        CardInsertInfo cardInsertInfo;
        C711340RvI c711340RvI2 = c711340RvI;
        CardInsertInfo cardInsertInfo2 = c711340RvI2.LIZ.getCardInsertInfo();
        boolean z = true;
        if ((cardInsertInfo2 == null || cardInsertInfo2.getCardType() != 4) && ((cardInsertInfo = c711340RvI2.LIZ.getCardInsertInfo()) == null || cardInsertInfo.getCardType() != 16)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
