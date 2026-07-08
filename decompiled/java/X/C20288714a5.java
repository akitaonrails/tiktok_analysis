package X;

import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14a5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20288714a5 extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ VerticalViewPager LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20288714a5(Aweme aweme, VerticalViewPager verticalViewPager, int i, int i2, int i3) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = verticalViewPager;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        C20286614Zk c20286614Zk = C20286614Zk.LIZ;
        Aweme aweme = this.LL;
        EnumC20283814Yi enumC20283814Yi = EnumC20283814Yi.CANCEL;
        VerticalViewPager verticalViewPager = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        int i3 = this.LLILZIL;
        c20286614Zk.getClass();
        C20286614Zk.LIZ(aweme, enumC20283814Yi, verticalViewPager, i, i2, i3);
        return Unit.LIZ;
    }
}
