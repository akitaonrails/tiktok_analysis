package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SubPinRequest;
import webcast.api.sub.SubPinResponse;

/* JADX INFO: renamed from: X.0K8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512720K8w extends C09AY implements Function1<C512740K8y, Unit> {
    public final /* synthetic */ C512660K8q LL;
    public final /* synthetic */ SubPinRequest LLILLJJLI;
    public final /* synthetic */ C512750K8z<SubPinResponse> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C512720K8w(C512660K8q c512660K8q, SubPinRequest subPinRequest, C512750K8z<SubPinResponse> c512750K8z) {
        super(1);
        this.LL = c512660K8q;
        this.LLILLJJLI = subPinRequest;
        this.LLILLL = c512750K8z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512740K8y c512740K8y) {
        if (c512740K8y.LIZ) {
            this.LL.LJI(this.LLILLJJLI, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
