package X;

import com.bytedance.lynx.media.AbsMediaEngineView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AMS, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AMS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbsMediaEngineView<C1AML> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AMS(AbsMediaEngineView<C1AML> absMediaEngineView, String str) {
        super(0);
        this.LL = absMediaEngineView;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, Object> map = this.LL.LLJZIJLIL;
        if (map != null) {
            map.put("play_url", this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
