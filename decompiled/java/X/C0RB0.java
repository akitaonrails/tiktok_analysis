package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RB0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RB0 extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ VideoBaseCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RB0(VideoBaseCell videoBaseCell) {
        super(1);
        this.LL = videoBaseCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJ = this.LL.LLLIILIL();
        c0rta2.LLJI = R.id.widget_container;
        return Unit.LIZ;
    }
}
