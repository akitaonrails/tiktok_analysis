package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445600Hde extends C09AY implements Function0<String> {
    public final /* synthetic */ ReusedUIAssem<? extends C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445600Hde(ReusedUIAssem<? extends C03H5> reusedUIAssem) {
        super(0);
        this.LL = reusedUIAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        VideoItemParams videoItemParams;
        Aweme aweme;
        Object objBo = this.LL.bo();
        if (!(objBo instanceof VideoItemParams) || (videoItemParams = (VideoItemParams) objBo) == null || (aweme = videoItemParams.getAweme()) == null) {
            return null;
        }
        return aweme.getAid();
    }
}
