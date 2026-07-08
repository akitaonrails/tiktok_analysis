package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPatienceConfig;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.wavepublish.utils.mapper.PublishProgressMapperConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS171S1100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nTA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435900nTA extends C2251071D8v {
    public final PublishPatienceConfig LJIJI;
    public final C01GW LJIJJ;

    @Override // X.C2251071D8v
    public final boolean LIZLLL() {
        return ((Boolean) this.LJIJJ.getValue()).booleanValue();
    }

    @Override // X.C2251071D8v
    public final PublishProgressMapperConfig LJFF() {
        VideoPublishEditModel videoPublishEditModel;
        if (!Intrinsics.LJFF(this.LIZIZ, "DefaultWavePublisher")) {
            return null;
        }
        PublishModel publishModel = this.LJFF;
        BaseShortVideoContext baseShortVideoContext = publishModel != null ? publishModel.editModel : null;
        if (!(baseShortVideoContext instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) == null) {
            return null;
        }
        return C1446370nk3.LIZ(videoPublishEditModel);
    }

    @Override // X.C2251071D8v
    public final long LJII() {
        return this.LJIJI.simulateProgressDuration;
    }

    public C1435900nTA(ArrayList<C1437500nVk> arrayList, InterfaceC1434300nQa interfaceC1434300nQa, String str, Function2<? super Integer, ? super C1434900nRY, Unit> function2) {
        super(arrayList, interfaceC1434300nQa, str, function2);
        this.LJIJI = (PublishPatienceConfig) C1434980nRg.LIZIZ.getValue();
        this.LJIJJ = C452501pT.LIZIZ(new AwS171S1100000_22(this, str, 2));
    }
}
