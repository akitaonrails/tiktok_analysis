package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizBottomAreaComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693040RGk extends C09AY implements Function1<C0RTB, Unit> {
    public final /* synthetic */ BizBottomAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693040RGk(BizBottomAreaComponent bizBottomAreaComponent) {
        super(1);
        this.LL = bizBottomAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTB c0rtb) {
        C0RTB c0rtb2 = c0rtb;
        this.LL.getClass();
        c0rtb2.LLJIJIL = C1163440gNi.LIZLLL;
        c0rtb2.LLILLL = C13LE.LIZ(VideoUserCardAssem.class);
        c0rtb2.LLJI = R.id.video_user_card_layout;
        return Unit.LIZ;
    }
}
