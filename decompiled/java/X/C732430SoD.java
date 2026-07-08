package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.share.ShareService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SoD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732430SoD extends C09AY implements Function2<VideoShareAssem, C291001Au<? extends String>, Unit> {
    public C732430SoD() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoShareAssem videoShareAssem, C291001Au<? extends String> c291001Au) {
        ShareService shareService;
        ShareService shareService2;
        VideoShareAssem videoShareAssem2 = videoShareAssem;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        if (c291001Au2 != null && c291001Au2.LIZ != 0 && (((shareService = (ShareService) videoShareAssem2.LLLILZ.getValue()) == null || !shareService.LIZJ()) && (shareService2 = (ShareService) videoShareAssem2.LLLILZ.getValue()) != null)) {
            shareService2.LJJIIZ();
        }
        return Unit.LIZ;
    }
}
