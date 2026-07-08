package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: renamed from: X.0KPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517140KPw extends C09AY implements Function1<C770770ULj, Unit> {
    public final /* synthetic */ SubPriceChangeConfirmRequest LL;
    public final /* synthetic */ C0K8N LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C517140KPw(SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, C0K8N c0k8n) {
        super(1);
        this.LL = subPriceChangeConfirmRequest;
        this.LLILLJJLI = c0k8n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C770770ULj c770770ULj) {
        this.LL.agreeToPriceChange = false;
        c770770ULj.LIZIZ = false;
        this.LLILLJJLI.LJIIIIZZ.invoke();
        return Unit.LIZ;
    }
}
