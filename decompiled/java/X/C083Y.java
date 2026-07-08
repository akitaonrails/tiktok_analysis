package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.ad.recording.AdLandPageEngageInfoProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.083Y, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C083Y extends C09AY implements Function0<Handler> {
    public final /* synthetic */ AdLandPageEngageInfoProvider LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C083Y(AdLandPageEngageInfoProvider adLandPageEngageInfoProvider) {
        super(0);
        this.LL = adLandPageEngageInfoProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Handler invoke() {
        return new BPEAHandler(C786410Ut5.W2((HandlerThread) this.LL.LIZJ.getValue()));
    }
}
