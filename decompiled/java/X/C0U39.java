package X;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0U39, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U39 extends C09AY implements Function2<DownloadInfo, BaseException, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C0U33 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC1364105Vn<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U39(long j, C0U33 c0u33, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = c0u33;
        this.LLILLL = j;
        this.LLILZ = z2;
        this.LLILZIL = interfaceC1364105Vn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        BaseException baseException2 = baseException;
        C20441214yg.LIZIZ("KaraokeDownloader", "onFail");
        int errorCode = -1;
        if (this.LL) {
            C0U17 c0u17 = C0U17.LIZ;
            int i = this.LLILLJJLI.LIZ;
            long j = this.LLILLL;
            if (baseException2 != null) {
                errorCode = baseException2.getErrorCode();
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_karaoke_lyrics_download_fail");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(j), "music_id");
            c474500IjALIZ.LJJII(C0U17.LIZJ(Integer.valueOf(i)), "user_type");
            c474500IjALIZ.LJJII(Integer.valueOf(errorCode), "error_code");
            c474500IjALIZ.LIZ();
        } else {
            C0U17 c0u172 = C0U17.LIZ;
            int i2 = this.LLILLJJLI.LIZ;
            long j2 = this.LLILLL;
            boolean z = this.LLILZ;
            if (baseException2 != null) {
                errorCode = baseException2.getErrorCode();
            }
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_multi_karaoke_accompaniment_download_fail");
            c474500IjALIZ2.LJIL();
            c474500IjALIZ2.LJJII(Long.valueOf(j2), "music_id");
            c474500IjALIZ2.LJJII(C0U17.LIZJ(Integer.valueOf(i2)), "user_type");
            c474500IjALIZ2.LJJII(Integer.valueOf(errorCode), "error_code");
            if (z) {
                str = "original";
            } else {
                str = "accompaniment";
            }
            c474500IjALIZ2.LJJII(str, "song_type");
            c474500IjALIZ2.LIZ();
        }
        InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = this.LLILZIL;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
        return Unit.LIZ;
    }
}
