package X;

import com.bytedance.android.livesdk.replay.proto.Caption;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323850Cml extends C09AY implements Function1<C1834780xqW, C1834780xqW> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ List<Caption> LLILLJJLI;
    public final /* synthetic */ Void LLILLL;
    public final /* synthetic */ LiveHighlightViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323850Cml(long j, List<Caption> list, Void r5, LiveHighlightViewModel liveHighlightViewModel) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = list;
        this.LLILLL = r5;
        this.LLILZ = liveHighlightViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1834780xqW invoke(C1834780xqW c1834780xqW) {
        C1834780xqW c1834780xqW2 = c1834780xqW;
        long j = this.LL;
        List<Caption> list = this.LLILLJJLI;
        Object obj = this.LLILLL;
        if (obj == null) {
            obj = ((LinkedHashMap) this.LLILZ.LLJI).get(Long.valueOf(j));
        }
        return C1834780xqW.LIZ(c1834780xqW2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C291001Au(new C044700Eb(j, list, (Integer) obj)), 262143);
    }
}
