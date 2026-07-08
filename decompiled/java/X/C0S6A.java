package X;

import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0S6A, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S6A extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ VideoDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S6A(VideoDescAssem videoDescAssem) {
        super(1);
        this.LL = videoDescAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            if (this.LL.LJJIJL() instanceof C708910RrN) {
                ((C708910RrN) this.LL.LJJIJL()).setGroupClickable(bool2.booleanValue());
            }
        }
        return Unit.LIZ;
    }
}
