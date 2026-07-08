package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.07hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1934207hs extends C09AY implements Function2<Boolean, Object, Unit> {
    public final /* synthetic */ C945740aia LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1934207hs(C945740aia c945740aia, String str, Function1<? super Boolean, Unit> function1) {
        super(2);
        this.LL = c945740aia;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Object obj) {
        if (bool.booleanValue()) {
            HashMap<String, Boolean> map = this.LL.LLILZIL;
            String str = this.LLILLJJLI;
            Boolean bool2 = Boolean.TRUE;
            map.put(str, bool2);
            this.LLILLL.invoke(bool2);
        } else {
            this.LLILLL.invoke(Boolean.FALSE);
        }
        return Unit.LIZ;
    }
}
