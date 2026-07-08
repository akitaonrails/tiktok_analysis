package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00qD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C202300qD extends C09AY implements Function1<Object, Boolean> {
    public final /* synthetic */ Function1<Object, Boolean> LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C202300qD(Function1<Object, Boolean> function1, C118300cf c118300cf, int i) {
        super(1);
        this.LL = function1;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        if (!this.LL.invoke(obj).booleanValue()) {
            return Boolean.FALSE;
        }
        C118300cf c118300cf = this.LLILLJJLI;
        boolean z = true;
        int i = c118300cf.element + 1;
        c118300cf.element = i;
        if (i <= this.LLILLL) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
