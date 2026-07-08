package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0REU, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REU extends C09AY implements Function1<C0REQ, Unit> {
    public final /* synthetic */ ReusedUIContentAssem<? extends C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0REU(ReusedUIContentAssem<? extends C03H5> reusedUIContentAssem) {
        super(1);
        this.LL = reusedUIContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C0REQ c0req) {
        C0REQ c0req2 = c0req;
        c0req2.LIZLLL = R.id.inv;
        c0req2.LIZIZ = (BaseCellTriggerComponent) this.LL;
        return Unit.LIZ;
    }
}
