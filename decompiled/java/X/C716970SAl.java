package X;

import Y.ARunnableS22S0101000_11;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C716970SAl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<CardTypeRequest> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C716970SAl(List<CardTypeRequest> list, int i) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C706880Ro6.LIZ()) {
            List<CardTypeRequest> list = this.LL;
            try {
                C823050WQl.LIZJ().execute(new ARunnableS22S0101000_11(this.LLILLJJLI, list, 5));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Unit.LIZ;
    }
}
