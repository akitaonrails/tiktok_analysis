package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: renamed from: X.0ck1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023510ck1<T> extends C09AY implements Function2<T, C1023640ckE, Unit> {
    public final /* synthetic */ AbstractC1023470cjx LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function2<T, C1023640ckE, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1023510ck1(AbstractC1023470cjx abstractC1023470cjx, String str, String str2, String str3, Function2<? super T, ? super C1023640ckE, Unit> function2) {
        super(2);
        this.LL = abstractC1023470cjx;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Object obj, C1023640ckE c1023640ckE) {
        AbstractC1023470cjx abstractC1023470cjx = this.LL;
        C1023480cjy.LIZ.getClass();
        abstractC1023470cjx.withParam(C1023480cjy.LJFF, this.LLILLJJLI);
        this.LL.withParam(C1023480cjy.LJI, this.LLILLL);
        AbstractC1023470cjx abstractC1023470cjx2 = this.LL;
        C1002190cBd c1002190cBd = C1023480cjy.LJIIIZ;
        String str = this.LLILZ;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        abstractC1023470cjx2.withParam(c1002190cBd, str);
        Function2<T, C1023640ckE, Unit> function2 = this.LLILZIL;
        if (function2 != null) {
            function2.invoke(obj, c1023640ckE);
        }
        return Unit.LIZ;
    }
}
