package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.vm.HistoryRecordPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C316601Kq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ HistoryRecordPageVM LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316601Kq(C013C c013c, Object obj, HistoryRecordPageVM historyRecordPageVM, Function0<Unit> function0) {
        super(0);
        this.LL = c013c;
        this.LLILLJJLI = obj;
        this.LLILLL = historyRecordPageVM;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C013C c013c = this.LL;
        if (!c013c.element) {
            Object obj = this.LLILLJJLI;
            HistoryRecordPageVM historyRecordPageVM = this.LLILLL;
            Function0<Unit> function0 = this.LLILZ;
            synchronized (obj) {
                try {
                    c013c.element = true;
                    InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(historyRecordPageVM);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C316501Kp(function0, null), 2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return Unit.LIZ;
    }
}
