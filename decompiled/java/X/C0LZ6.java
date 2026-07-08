package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LZ6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LZ6 extends C09AY implements Function1<C1DRG, AIGCGenerationComponent> {
    public final /* synthetic */ C559610Lx9 LL;
    public final /* synthetic */ C0LZ8 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ AIGCOfflineModel LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZ6(C0ET4 c0et4, C559610Lx9 c559610Lx9, C0LZ8 c0lz8, String str, long j, AIGCOfflineModel aIGCOfflineModel, CreativeInfo creativeInfo) {
        super(1);
        this.LL = c559610Lx9;
        this.LLILLJJLI = c0lz8;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = aIGCOfflineModel;
        this.LLILZLL = creativeInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AIGCGenerationComponent invoke(C1DRG c1drg) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AIGCGenerationComponent aIGCGenerationComponent = new AIGCGenerationComponent(this.LLILLJJLI, c1drg);
        aIGCGenerationComponent.In2(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        this.LL.getClass();
        aIGCGenerationComponent.afterInit$als_release(jUptimeMillis);
        return aIGCGenerationComponent;
    }
}
