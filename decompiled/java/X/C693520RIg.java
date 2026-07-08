package X;

import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693520RIg extends C09AY implements Function1<C0REQ, Unit> {
    public final /* synthetic */ C0RPZ LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;
    public final /* synthetic */ ReusedUIAssem<? extends C03H5> LLILZ;
    public final /* synthetic */ RootCellCommonAbility LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693520RIg(C0RPZ c0rpz, int i, ViewGroup viewGroup, ReusedUIAssem<? extends C03H5> reusedUIAssem, RootCellCommonAbility rootCellCommonAbility) {
        super(1);
        this.LL = c0rpz;
        this.LLILLJJLI = i;
        this.LLILLL = viewGroup;
        this.LLILZ = reusedUIAssem;
        this.LLILZIL = rootCellCommonAbility;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0REQ c0req) {
        C0REQ c0req2 = c0req;
        c0req2.LJ = this.LL.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
        c0req2.LIZIZ = (BaseCellTriggerComponent) this.LLILZ;
        return Unit.LIZ;
    }
}
