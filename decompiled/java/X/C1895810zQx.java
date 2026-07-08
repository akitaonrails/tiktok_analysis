package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895810zQx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1895810zQx(Aweme aweme, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String aid;
        Video video;
        C1896460zS0 value = C1896460zS0.LLJJ.getValue();
        Aweme aweme = this.LL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        Aweme aweme2 = this.LL;
        long duration = (aweme2 == null || (video = aweme2.getVideo()) == null) ? 0L : video.getDuration();
        String str = this.LLILLJJLI;
        value.LJJIFFI(duration, aid, str != null ? str : "");
        C1895820zQy c1895820zQy = C1895820zQy.LL;
        Aweme aweme3 = this.LL;
        String aid2 = aweme3 != null ? aweme3.getAid() : null;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILLJJLI;
        String str5 = this.LLILZIL;
        c1895820zQy.getClass();
        C1895820zQy.LJIIJ(aid2, str2, str3, str4, str5);
        return Unit.LIZ;
    }
}
