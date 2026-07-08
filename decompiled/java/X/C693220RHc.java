package X;

import com.ss.android.ugc.aweme.feed.assem.caption.VideoCLACaptionDebugTrigger;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693220RHc extends C09AY implements Function1<C0REQ, Unit> {
    public final /* synthetic */ VideoCLACaptionDebugTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693220RHc(VideoCLACaptionDebugTrigger videoCLACaptionDebugTrigger) {
        super(1);
        this.LL = videoCLACaptionDebugTrigger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0REQ c0req) {
        C0REQ c0req2 = c0req;
        c0req2.LIZLLL = R.id.vle;
        c0req2.LIZIZ = this.LL;
        return Unit.LIZ;
    }
}
