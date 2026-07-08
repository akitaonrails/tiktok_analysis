package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Sl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730460Sl2 extends C09AY implements Function2<VideoDiggAssem, C2038507yh, Unit> {
    public C730460Sl2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDiggAssem videoDiggAssem, C2038507yh c2038507yh) {
        String aid;
        VideoItemParams item;
        Aweme aweme;
        Aweme aweme2;
        VideoDiggAssem videoDiggAssem2 = videoDiggAssem;
        C2038507yh c2038507yh2 = c2038507yh;
        videoDiggAssem2.getClass();
        if (c2038507yh2 != null) {
            String str = c2038507yh2.LIZ;
            if (str == null) {
                str = "";
            }
            VideoItemParams item2 = videoDiggAssem2.Fp().getItem();
            Aweme aweme3 = null;
            if (item2 != null && (aweme2 = item2.getAweme()) != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (TextUtils.equals(str, aid) && (item = videoDiggAssem2.Fp().getItem()) != null && (aweme = item.getAweme()) != null && aweme.isLike()) {
                VideoDiggVM videoDiggVMFp = videoDiggAssem2.Fp();
                VideoItemParams item3 = videoDiggAssem2.Fp().getItem();
                if (item3 != null) {
                    aweme3 = item3.getAweme();
                }
                if (videoDiggVMFp.getContext() != null && aweme3 != null) {
                    videoDiggVMFp.RQ2(new AwS625S0100000_11(videoDiggVMFp, 131));
                }
            }
        }
        return Unit.LIZ;
    }
}
