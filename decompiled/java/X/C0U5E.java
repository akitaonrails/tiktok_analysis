package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0U5E, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5E extends C09AY implements Function2<DownloadInfo, BaseException, Unit> {
    public final /* synthetic */ LiveEffect LL;
    public final /* synthetic */ C0U5B LLILLJJLI;
    public final /* synthetic */ C0U5F LLILLL;
    public final /* synthetic */ DataChannel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U5E(LiveEffect liveEffect, C0U5B c0u5b, C0U5F c0u5f, DataChannel dataChannel) {
        super(2);
        this.LL = liveEffect;
        this.LLILLJJLI = c0u5b;
        this.LLILLL = c0u5f;
        this.LLILZ = dataChannel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(DownloadInfo downloadInfo, BaseException baseException) {
        this.LL.LJJLIL(false);
        this.LL.LJLILLLLZI(false);
        C0U5B c0u5b = this.LLILLJJLI;
        if (c0u5b != null) {
            c0u5b.LLLI(this.LL);
        }
        C0U5F c0u5f = this.LLILLL;
        if (c0u5f != null) {
            c0u5f.LIZ(this.LL);
        }
        C0U4R c0u4r = new C0U4R();
        c0u4r.LIZLLL = 2131843397;
        c0u4r.LJFF = true;
        c0u4r.LJII = this.LLILZ;
        c0u4r.LIZJ = "pm_multiWallpaper_wallpaperPanel_error_toast";
        C766270U4b.LJIIJ(c0u4r);
        return Unit.LIZ;
    }
}
