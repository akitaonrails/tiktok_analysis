package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.poi.anchor.sensor.PoiEncouragingPostingNowConfigProvider;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Ctt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244991Ctt extends C09AY implements Function1<Lifecycle, C2245021Ctw> {
    public final /* synthetic */ PoiEncouragingPostingNowConfigProvider LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2244991Ctt(PoiEncouragingPostingNowConfigProvider poiEncouragingPostingNowConfigProvider) {
        super(1);
        this.LL = poiEncouragingPostingNowConfigProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2245021Ctw invoke(Lifecycle lifecycle) {
        return new C2245021Ctw(lifecycle, this.LL.LLILLJJLI);
    }
}
