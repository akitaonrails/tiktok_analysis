package X;

import com.ss.android.ugc.aweme.feed.assem.caption.VideoCLACaptionTrigger;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693250RHf extends C09AY implements Function1<C0REQ, Unit> {
    public final /* synthetic */ VideoCLACaptionTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693250RHf(VideoCLACaptionTrigger videoCLACaptionTrigger) {
        super(1);
        this.LL = videoCLACaptionTrigger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0REQ c0req) {
        C0REQ c0req2 = c0req;
        c0req2.LIZLLL = R.id.vlf;
        c0req2.LIZIZ = this.LL;
        return Unit.LIZ;
    }
}
