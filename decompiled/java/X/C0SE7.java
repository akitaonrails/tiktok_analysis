package X;

import com.ss.android.ugc.aweme.ui.assem.feed.CollabFeedTagAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SE7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SE7 extends C09AY implements Function1<C0RTB, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SE7(int i, int i2, int i3) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTB c0rtb) {
        C0RTB c0rtb2 = c0rtb;
        c0rtb2.LLJI = this.LL;
        c0rtb2.LLILLL = C13LE.LIZ(CollabFeedTagAssem.class);
        c0rtb2.LJFF(Integer.valueOf(this.LLILLJJLI), "TAG_CONTENT_COLOR_RES");
        c0rtb2.LJFF(Integer.valueOf(this.LLILLL), "TAG_BACKGROUND_COLOR_RES");
        return Unit.LIZ;
    }
}
