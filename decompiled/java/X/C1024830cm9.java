package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024830cm9 extends C09AY implements Function1<C1023640ckE, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C1024820cm8 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024830cm9(String str, int i, C1024820cm8 c1024820cm8, boolean z, boolean z2, boolean z3) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = c1024820cm8;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1023640ckE c1023640ckE) {
        Object obj;
        Object obj2;
        C1023640ckE c1023640ckE2 = c1023640ckE;
        C1024840cmA.LIZ.getClass();
        c1023640ckE2.withParam(C1024840cmA.LJFF, this.LL);
        c1023640ckE2.withParam(C1024840cmA.LIZIZ, Integer.valueOf(this.LLILLJJLI));
        C1002190cBd c1002190cBd = C1024840cmA.LIZJ;
        C1024820cm8 c1024820cm8 = this.LLILLL;
        boolean z = this.LLILZ;
        c1024820cm8.getClass();
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE2.withParam(c1002190cBd, obj);
        C1002190cBd c1002190cBd2 = C1024840cmA.LJ;
        C1024820cm8 c1024820cm82 = this.LLILLL;
        boolean z2 = this.LLILZIL;
        c1024820cm82.getClass();
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE2.withParam(c1002190cBd2, obj2);
        C1002190cBd c1002190cBd3 = C1024840cmA.LIZLLL;
        C1024820cm8 c1024820cm83 = this.LLILLL;
        boolean z3 = this.LLILZLL;
        c1024820cm83.getClass();
        if (!z3) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1023640ckE2.withParam(c1002190cBd3, str);
        return Unit.LIZ;
    }
}
