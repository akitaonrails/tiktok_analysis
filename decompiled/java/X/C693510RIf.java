package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693510RIf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedUIAssem<? extends C03H5> LL;
    public final /* synthetic */ InteractAreaCommonAbility LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693510RIf(ReusedUIAssem<? extends C03H5> reusedUIAssem, InteractAreaCommonAbility interactAreaCommonAbility) {
        super(0);
        this.LL = reusedUIAssem;
        this.LLILLJJLI = interactAreaCommonAbility;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C698920RbG c698920RbGRy0;
        if (this.LL.Bo()) {
            InteractAreaCommonAbility interactAreaCommonAbility = this.LLILLJJLI;
            if (interactAreaCommonAbility != null && (c698920RbGRy0 = interactAreaCommonAbility.Ry0()) != null) {
                c698920RbGRy0.LIZ(this.LL.LJJIJL());
            }
            C695740RQu.LJ(R.id.el6, this.LL.LJJIJL(), Boolean.TRUE);
        }
        return Unit.LIZ;
    }
}
