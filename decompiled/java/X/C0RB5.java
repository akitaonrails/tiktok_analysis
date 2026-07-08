package X;

import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.plugindownload.PluginDownloadProgressAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RB5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RB5 extends C09AY implements Function1<C0RTA, Unit> {
    public final /* synthetic */ FeedVideoAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RB5(FeedVideoAssem feedVideoAssem) {
        super(1);
        this.LL = feedVideoAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RTA c0rta) {
        C0RTA c0rta2 = c0rta;
        c0rta2.getClass();
        c0rta2.LLILLL = C13LE.LIZ(PluginDownloadProgressAssem.class);
        c0rta2.LLJI = R.id.kv2;
        FeedVideoAssem feedVideoAssem = this.LL;
        C694070RKj c694070RKj = C694070RKj.LIZIZ;
        feedVideoAssem.getClass();
        c0rta2.LLILZIL = FeedVideoAssem.ep(c694070RKj);
        return Unit.LIZ;
    }
}
