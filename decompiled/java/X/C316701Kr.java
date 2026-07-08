package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS277S0300000_33;

/* JADX INFO: renamed from: X.01Kr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C316701Kr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ HistoryRecordPageVM LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316701Kr(Object obj, C118300cf c118300cf, C118300cf c118300cf2, HistoryRecordPageVM historyRecordPageVM, long j, AwS277S0300000_33 awS277S0300000_33) {
        super(0);
        this.LL = obj;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = c118300cf2;
        this.LLILZ = historyRecordPageVM;
        this.LLILZIL = j;
        this.LLILZLL = awS277S0300000_33;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object obj = this.LL;
        C118300cf c118300cf = this.LLILLJJLI;
        C118300cf c118300cf2 = this.LLILLL;
        HistoryRecordPageVM historyRecordPageVM = this.LLILZ;
        long j = this.LLILZIL;
        Function0<Unit> function0 = this.LLILZLL;
        synchronized (obj) {
            try {
                int i = c118300cf.element + 1;
                c118300cf.element = i;
                if (i == c118300cf2.element) {
                    InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(historyRecordPageVM);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C316401Ko(j, function0, null), 2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }
}
