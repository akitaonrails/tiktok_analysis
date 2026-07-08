package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966090bFP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966100bFQ<Object> LL;
    public final /* synthetic */ C967640bHu LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966090bFP(C966100bFQ<Object> c966100bFQ, C967640bHu c967640bHu) {
        super(0);
        this.LL = c966100bFQ;
        this.LLILLJJLI = c967640bHu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Throwable thLIZIZ;
        Function1<? super C967640bHu, ? extends Throwable> function1 = this.LL.LLILZ;
        if (function1 == null || (thLIZIZ = function1.invoke(this.LLILLJJLI)) == null) {
            thLIZIZ = C966250bFf.LIZIZ(this.LLILLJJLI, this.LL.LLILLJJLI);
        }
        InterfaceC966890bGh<Object> interfaceC966890bGh = this.LL.LLILLL;
        if (thLIZIZ instanceof C501520Jle) {
            if (interfaceC966890bGh != null) {
                C501520Jle c501520Jle = (C501520Jle) thLIZIZ;
                int errorCode = c501520Jle.getErrorCode();
                String message = c501520Jle.getMessage();
                if (message == null) {
                    message = "ApiException with null message";
                }
                interfaceC966890bGh.LIZIZ(new LinkCoreError(errorCode, 0L, message), thLIZIZ);
            }
        } else if (interfaceC966890bGh != null) {
            LinkCoreError.Companion companion = LinkCoreError.Companion;
            int i = companion.getCOMMON_UNKNOWN().errorCode;
            String message2 = thLIZIZ.getMessage();
            if (message2 == null) {
                message2 = companion.getCOMMON_UNKNOWN().errorMsg;
            }
            interfaceC966890bGh.LIZIZ(new LinkCoreError(i, 0L, message2), thLIZIZ);
        }
        Function0<Unit> function0 = this.LL.LLILZIL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
