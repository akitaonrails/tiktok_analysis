package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O9B, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O9B extends C09AY implements Function2<String, Exception, Unit> {
    public final /* synthetic */ Integer LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AtomicBoolean LLILLL;
    public final /* synthetic */ CompletionBlock<C0O9F> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O9B(CompletionBlock completionBlock, Integer num, String str, String str2, AtomicBoolean atomicBoolean) {
        super(2);
        this.LL = num;
        this.LLILLJJLI = str;
        this.LLILLL = atomicBoolean;
        this.LLILZ = completionBlock;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Exception exc) {
        int i;
        Integer num = this.LL;
        if (num != null && num.intValue() == 1) {
            i = 0;
        } else {
            i = 1;
        }
        C651640PhC.LIZIZ.LJIIIZ(Integer.valueOf(i), this.LLILLJJLI);
        if (this.LLILLL.compareAndSet(false, true)) {
            CompletionBlock<C0O9F> completionBlock = this.LLILZ;
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0O9F.class, this.LLILZIL);
            ((C0O9F) xBaseModelLIZJ).setSuccess(Boolean.FALSE);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
        return Unit.LIZ;
    }
}
