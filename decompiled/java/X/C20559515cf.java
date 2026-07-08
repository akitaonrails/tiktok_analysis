package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20559515cf extends C09AY implements Function0<String> {
    public final /* synthetic */ VideoAdaptionResult LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20559515cf(VideoAdaptionResult videoAdaptionResult) {
        super(0);
        this.LL = videoAdaptionResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.LL.toString();
    }
}
