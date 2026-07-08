package X;

import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;

/* JADX INFO: renamed from: X.0MMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.serviceimpl.MediaSourceResolver", f = "MediaSourceResolver.kt", l = {53, 59}, m = "resolveAndDownload")
public final class C567210MMl extends AbstractC23140094w {
    public Object LL;
    public ForwardMediaDownloader.DownloadConfig LLILLJJLI;
    public ForwardVideo LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C567200MMk LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567210MMl(C567200MMk c567200MMk, InterfaceC1364105Vn<? super C567210MMl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c567200MMk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaSourceResolver@1424.resolveAndDownload$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("MediaSourceResolver@1424.resolveAndDownload$1");
        return objLIZJ;
    }
}
