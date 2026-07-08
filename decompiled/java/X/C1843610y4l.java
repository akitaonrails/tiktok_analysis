package X;

import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.AdFastScrollServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843610y4l extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AdFastScrollServiceImpl LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1843610y4l(AdFastScrollServiceImpl adFastScrollServiceImpl, int i, Aweme aweme, boolean z) {
        super(0);
        this.LL = adFastScrollServiceImpl;
        this.LLILLJJLI = i;
        this.LLILLL = aweme;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIIJJI(this.LLILLL, this.LLILLJJLI, this.LLILZ);
        return Unit.LIZ;
    }
}
