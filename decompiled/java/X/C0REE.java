package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractContainerComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0REE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0REE extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ InteractContainerComponent LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0REE(InteractContainerComponent interactContainerComponent, long j, View view) {
        super(1);
        this.LL = interactContainerComponent;
        this.LLILLJJLI = j;
        this.LLILLL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJI = R.id.widget_container;
        C697790RYr c697790RYr = C697790RYr.LIZ;
        String strLIZIZ = C0RQN.LIZIZ(c0rta2.LLIZ, this.LL.jm());
        String start = EnumC697290RWt.P_INTERACT_AREA_CREATE.getStart();
        c697790RYr.getClass();
        C697790RYr.LIZJ(strLIZIZ, start, null, null, null, null);
        InteractAreaComponent interactAreaComponent = new InteractAreaComponent();
        View view = this.LLILLL;
        InteractContainerComponent interactContainerComponent = this.LL;
        interactAreaComponent.LLJJI = view.findViewById(R.id.widget_container);
        interactAreaComponent.LLJJJJLIIL = interactContainerComponent.nJ2();
        c0rta2.LLJ = interactAreaComponent;
        C0RQN.LJ(C0RQN.LIZIZ(c0rta2.LLIZ, this.LL.jm()), C0RQ5.C_INTERACT_AREA, EnumC697300RWu.M_CREATE, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
