package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.EventStruct;

/* JADX INFO: renamed from: X.0MLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveevent.storysticker.LiveEventStoryUtil", f = "LiveEventStoryUtil.kt", l = {51, 54}, m = "buildLiveEventStoryIntent")
public final class C567030MLt extends AbstractC23140094w {
    public EventStruct LL;
    public Object LLILLJJLI;
    public CreativeModel LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C567020MLs LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567030MLt(C567020MLs c567020MLs, InterfaceC1364105Vn<? super C567030MLt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c567020MLs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventStoryUtil@a8c0.buildLiveEventStoryIntent$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(null, this);
        C1C7U.LIZIZ("LiveEventStoryUtil@a8c0.buildLiveEventStoryIntent$1");
        return objLIZ;
    }
}
