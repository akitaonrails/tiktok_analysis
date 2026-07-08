package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701670Rfh implements Function1<String, C694010RKd> {
    public final Function0<C694010RKd> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C702290Rgh());

    public C701670Rfh(C702360Rgo c702360Rgo) {
        this.LL = c702360Rgo;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C694010RKd invoke(String str) {
        C694010RKd c694010RKd = (C694010RKd) ((Map) this.LLILLJJLI.getValue()).get(str);
        if (c694010RKd == null) {
            C694010RKd c694010RKdInvoke = this.LL.invoke();
            ((Map) this.LLILLJJLI.getValue()).put(str, c694010RKdInvoke);
            return c694010RKdInvoke;
        }
        return c694010RKd;
    }
}
