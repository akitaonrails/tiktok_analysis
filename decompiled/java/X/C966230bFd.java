package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966230bFd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC966890bGh<Object> LLILLJJLI;
    public final /* synthetic */ C966100bFQ<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966230bFd(Object obj, InterfaceC966890bGh<Object> interfaceC966890bGh, C966100bFQ<Object> c966100bFQ) {
        super(0);
        this.LL = obj;
        this.LLILLJJLI = interfaceC966890bGh;
        this.LLILLL = c966100bFQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj = this.LL;
        InterfaceC966890bGh<Object> interfaceC966890bGh = this.LLILLJJLI;
        if (obj == null) {
            if (interfaceC966890bGh != null) {
                interfaceC966890bGh.LIZIZ(LinkCoreError.Companion.getCOMMON_RESPONSE_INVALID(), new Throwable("The response is null or invalid."));
            }
        } else if (interfaceC966890bGh != null) {
            interfaceC966890bGh.LIZ(obj);
        }
        Function0<Unit> function0 = this.LLILLL.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
