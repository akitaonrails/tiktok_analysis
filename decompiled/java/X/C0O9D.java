package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0O9D, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O9D extends C09AY implements InterfaceC1631620sYq<String, Integer, Boolean, Unit> {
    public final /* synthetic */ AtomicBoolean LL;
    public final /* synthetic */ CompletionBlock<C0O9F> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O9D(CompletionBlock completionBlock, String str, AtomicBoolean atomicBoolean) {
        super(3);
        this.LL = atomicBoolean;
        this.LLILLJJLI = completionBlock;
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Integer num, Boolean bool) {
        num.intValue();
        bool.booleanValue();
        if (this.LL.compareAndSet(false, true)) {
            CompletionBlock<C0O9F> completionBlock = this.LLILLJJLI;
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0O9F.class, this.LLILLL);
            ((C0O9F) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
        return Unit.LIZ;
    }
}
