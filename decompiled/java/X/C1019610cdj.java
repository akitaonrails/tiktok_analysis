package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cdj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019610cdj extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1019610cdj(boolean z, String str) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1019650cdn.LIZ.getClass();
        C1002190cBd c1002190cBd = C1019650cdn.LJII;
        if (this.LL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE2.withParam(c1002190cBd, str);
        c1023640ckE2.withParam(C1019650cdn.LJIIIZ, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
