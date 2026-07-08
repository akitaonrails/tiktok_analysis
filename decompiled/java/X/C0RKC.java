package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RKC, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKC extends C09AY implements Function1<C0RTB, Unit> {
    public final /* synthetic */ VideoTagContainer LL;
    public final /* synthetic */ PriorityProtocol LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RKC(VideoTagContainer videoTagContainer, PriorityProtocol priorityProtocol) {
        super(1);
        this.LL = videoTagContainer;
        this.LLILLJJLI = priorityProtocol;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTB c0rtb) {
        C0RJN c0rjnLIZIZ;
        C0RTB c0rtb2 = c0rtb;
        VideoTagContainer videoTagContainer = this.LL;
        videoTagContainer.getClass();
        C694010RKd c694010RKd = new C694010RKd(new C0RKD(videoTagContainer));
        AbsComponentTrigger absComponentTrigger = (AbsComponentTrigger) this.LLILLJJLI;
        absComponentTrigger.LLIZ = c694010RKd;
        absComponentTrigger.LLJ = this.LL.jm();
        PriorityProtocol priorityProtocol = this.LLILLJJLI;
        this.LL.getClass();
        priorityProtocol.getClass();
        AbsComponentTrigger absComponentTrigger2 = (AbsComponentTrigger) this.LLILLJJLI;
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI != null) {
            c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI);
        } else {
            c0rjnLIZIZ = null;
        }
        absComponentTrigger2.LLJI = c0rjnLIZIZ;
        c0rtb2.LLJILJILJ = c694010RKd;
        c0rtb2.LLILLL = ((AbsComponentTrigger) this.LLILLJJLI).LJIIJJI();
        c0rtb2.LLJIJIL = C1163440gNi.LIZLLL;
        c0rtb2.LLILZIL = new C694050RKh((AbstractC634910OvJ) this.LLILLJJLI);
        return Unit.LIZ;
    }
}
