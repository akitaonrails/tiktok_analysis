package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.06ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1759906ur extends C09AY implements InterfaceC1631620sYq<String, String, Boolean, Unit> {
    public C1759906ur() {
        super(3);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, String str2, Boolean bool) {
        String str3;
        boolean zBooleanValue = bool.booleanValue();
        C1759806uq c1759806uq = C1759806uq.LIZ;
        if (zBooleanValue) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C1759806uq.LJFF("im_translation_start", C2097908Jt.LIZJ(new Pair("is_manual", str3)));
        return Unit.LIZ;
    }
}
