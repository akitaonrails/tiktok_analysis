package X;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589650NAt extends C09AY implements Function2<Boolean, Throwable, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ C1325710kbR LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function2<Boolean, Throwable, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C589650NAt(Context context, C1325710kbR c1325710kbR, Function0 function0, Function0 function02, Function2 function2) {
        super(2);
        this.LL = function0;
        this.LLILLJJLI = c1325710kbR;
        this.LLILLL = context;
        this.LLILZ = function02;
        this.LLILZIL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Throwable th) {
        if (bool.booleanValue()) {
            this.LL.invoke();
            if ((((Number) C323200Cli.LIZ.getValue()).intValue() & 2) != 0) {
                Executor executor = C589700NAy.LIZ;
                C589700NAy.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, new C5185020h(this.LLILZIL, (Function2<? super Boolean, ? super Throwable, Unit>) 35));
            }
        } else {
            this.LLILZIL.invoke(Boolean.FALSE, th);
        }
        return Unit.LIZ;
    }
}
