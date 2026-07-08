package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RB1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RB1 extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ VideoBaseCell LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RB1(VideoBaseCell videoBaseCell, View view) {
        super(1);
        this.LL = videoBaseCell;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.LLJ = this.LL.LLJJIJI;
        c0rta2.LLJILJIL = this.LLILLJJLI;
        return Unit.LIZ;
    }
}
