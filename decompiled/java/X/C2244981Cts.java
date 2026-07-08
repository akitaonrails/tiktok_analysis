package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.poi.anchor.sensor.PoiEncouragingPostingBeenConfigProvider;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Cts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244981Cts extends C09AY implements Function1<Lifecycle, C2245011Ctv> {
    public final /* synthetic */ PoiEncouragingPostingBeenConfigProvider LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2244981Cts(PoiEncouragingPostingBeenConfigProvider poiEncouragingPostingBeenConfigProvider) {
        super(1);
        this.LL = poiEncouragingPostingBeenConfigProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2245011Ctv invoke(Lifecycle lifecycle) {
        return new C2245011Ctv(lifecycle, this.LL.LLILLJJLI);
    }
}
