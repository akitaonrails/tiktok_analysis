package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181291AYl extends C09AY implements Function1<List<C1276580jKC>, String> {
    public final /* synthetic */ LiveStreamMixer LL;
    public final /* synthetic */ C1AXM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181291AYl(LiveStreamMixer liveStreamMixer, C1AXM c1axm) {
        super(1);
        this.LL = liveStreamMixer;
        this.LLILLJJLI = c1axm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(List<C1276580jKC> list) {
        return this.LL.mixStream(this.LLILLJJLI.LJLLLL().LIZLLL().getFirst().intValue(), this.LLILLJJLI.LJLLLL().LIZLLL().getSecond().intValue(), list);
    }
}
