package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697330RWx implements InterfaceC700020Rd2<VideoItemParams> {
    public final /* synthetic */ Function0<VideoItemParams> LIZ;
    public final /* synthetic */ Function0<String> LIZIZ;

    @Override // X.InterfaceC700020Rd2
    public final VideoItemParams LIZ() {
        return this.LIZ.invoke();
    }

    @Override // X.InterfaceC700020Rd2
    public final String LJLI() {
        Aweme aweme;
        VideoItemParams videoItemParamsInvoke = this.LIZ.invoke();
        if (videoItemParamsInvoke == null || (aweme = videoItemParamsInvoke.getAweme()) == null) {
            return null;
        }
        return aweme.getAid();
    }

    @Override // X.InterfaceC700020Rd2
    public final String getLogId() {
        Aweme aweme;
        String requestId;
        VideoItemParams videoItemParamsInvoke = this.LIZ.invoke();
        return (videoItemParamsInvoke == null || (aweme = videoItemParamsInvoke.getAweme()) == null || (requestId = aweme.getRequestId()) == null) ? "" : requestId;
    }

    @Override // X.InterfaceC700020Rd2
    public final String getScene() {
        String strInvoke;
        Function0<String> function0 = this.LIZIZ;
        return (function0 == null || (strInvoke = function0.invoke()) == null) ? "" : strInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C697330RWx(Function0<? extends VideoItemParams> function0, Function0<String> function02) {
        this.LIZ = function0;
        this.LIZIZ = function02;
    }
}
