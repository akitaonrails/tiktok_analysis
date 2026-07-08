package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0T1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C740080T1i extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C740080T1i(String str, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<InterfaceC1898130zUh> list = C1898110zUf.LLILZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1898130zUh) it2.next()).LIZIZ(str, str2);
        }
        return Unit.LIZ;
    }
}
