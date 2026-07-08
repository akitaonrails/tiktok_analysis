package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cRG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011880cRG extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ C622570ObP LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011880cRG(C622570ObP c622570ObP, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = c622570ObP;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        String str;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        c1023640ckE2.withContext(this.LL.LIZIZ);
        C1011900cRI.LIZ.getClass();
        c1023640ckE2.withParam(C1011900cRI.LIZLLL, this.LLILLJJLI);
        c1023640ckE2.withParam(C1011900cRI.LIZJ, this.LLILLL);
        c1023640ckE2.withParam(C1011900cRI.LJFF, this.LLILZ);
        c1023640ckE2.withParam(C1011900cRI.LJ, this.LLILZIL);
        C1002190cBd c1002190cBd = C1011900cRI.LIZIZ;
        if (Intrinsics.LJFF(this.LLILLJJLI, this.LLILZ)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE2.withParam(c1002190cBd, str);
        return Unit.LIZ;
    }
}
