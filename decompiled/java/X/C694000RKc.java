package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.cell.trigger.AbsComponentTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694000RKc extends C09AY implements Function2<AbstractC634910OvJ<?>, Boolean, Unit> {
    public final /* synthetic */ VideoTagContainer LL;
    public final /* synthetic */ Function1<AbsComponentTrigger, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C694000RKc(VideoTagContainer videoTagContainer, Function1<? super AbsComponentTrigger, Unit> function1) {
        super(2);
        this.LL = videoTagContainer;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC634910OvJ<?> abstractC634910OvJ, Boolean bool) {
        AbstractC634910OvJ<?> abstractC634910OvJ2 = abstractC634910OvJ;
        bool.booleanValue();
        if ((abstractC634910OvJ2 instanceof AbsComponentTrigger) && abstractC634910OvJ2 != null) {
            VideoTagContainer videoTagContainer = this.LL;
            Function1<AbsComponentTrigger, Unit> function1 = this.LLILLJJLI;
            videoTagContainer.LLJLILLLLZIIL.add((AbsComponentTrigger) abstractC634910OvJ2);
            if (function1 != null) {
                function1.invoke((AbsComponentTrigger) abstractC634910OvJ2);
            }
        }
        return Unit.LIZ;
    }
}
