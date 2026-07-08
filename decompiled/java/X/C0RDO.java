package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RDO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RDO extends C09AY implements Function2<VideoDescAssem, C291001Au<? extends Pair<? extends Aweme, ? extends PostModeEntranceMechanism>>, Unit> {
    public C0RDO() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoDescAssem videoDescAssem, C291001Au<? extends Pair<? extends Aweme, ? extends PostModeEntranceMechanism>> c291001Au) {
        String aid;
        VideoDescAssem videoDescAssem2 = videoDescAssem;
        C291001Au<? extends Pair<? extends Aweme, ? extends PostModeEntranceMechanism>> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Pair pair = (Pair) c291001Au2.LIZ;
            Aweme aweme = (Aweme) pair.getFirst();
            String aid2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(videoDescAssem2)).getAweme();
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            }
            if (Intrinsics.LJFF(aid, aid2)) {
                AssemViewModel assemViewModel = (AssemViewModel) videoDescAssem2.LLLFFI.getValue();
                assemViewModel.getClass();
                assemViewModel.setState(new AwS590S0100000_11(pair, (Pair<? extends Aweme, ? extends PostModeEntranceMechanism>) 491));
            }
        }
        return Unit.LIZ;
    }
}
