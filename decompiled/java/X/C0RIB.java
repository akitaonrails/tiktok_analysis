package X;

import com.ss.android.ugc.feed.platform.dowgrade.BaseDowngradeCellTriggerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RIB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RIB extends C09AY implements Function1<C0RTB, Unit> {
    public final /* synthetic */ BaseDowngradeCellTriggerComponent<C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RIB(BaseDowngradeCellTriggerComponent<C03H5> baseDowngradeCellTriggerComponent) {
        super(1);
        this.LL = baseDowngradeCellTriggerComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTB c0rtb) {
        C0RTB c0rtb2 = c0rtb;
        c0rtb2.LLJIJIL = C1163440gNi.LIZLLL;
        c0rtb2.LLJILJIL = this.LL.LJJIJL();
        c0rtb2.LLJI = this.LL.LJJIJL().getId();
        c0rtb2.LLILZIL = C694070RKj.LIZIZ;
        BaseDowngradeCellTriggerComponent<C03H5> baseDowngradeCellTriggerComponent = this.LL;
        c0rtb2.LLJ = baseDowngradeCellTriggerComponent.LLJJLIIIJLLLLLLLZ;
        c0rtb2.LLILLL = baseDowngradeCellTriggerComponent.getType();
        return Unit.LIZ;
    }
}
