package X;

import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C709650RsZ extends C09AY implements Function1<C709570RsR, C709570RsR> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ TakoFeedRightBottomEntranceViewModel LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C709650RsZ(int i, TakoFeedRightBottomEntranceViewModel takoFeedRightBottomEntranceViewModel, float f) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = takoFeedRightBottomEntranceViewModel;
        this.LLILLL = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C709570RsR invoke(C709570RsR c709570RsR) {
        boolean z;
        C709570RsR c709570RsR2 = c709570RsR;
        if (this.LL == 0 && !this.LLILLJJLI.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        return C709570RsR.LIZ(c709570RsR2, false, z, this.LLILLL, 0, 0, 25);
    }
}
