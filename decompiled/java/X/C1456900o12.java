package X;

import Y.AfS157S0200000_22;
import Y.AfS181S0100000_12;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0o12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1456900o12 {
    public static final C1456900o12 LIZ = new C1456900o12();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(VideoPublishEditModel videoPublishEditModel, Function1 function1) {
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLIIIJLJLI();
        if (C1428470nHB.LLIIIJ(videoPublishEditModel) || C1428470nHB.LJJZZI(videoPublishEditModel) || !((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJJ()) {
            return;
        }
        List<AnchorTransData> anchors = videoPublishEditModel.getCreativeFlowData().getAnchors();
        if (anchors != null && !anchors.isEmpty()) {
            return;
        }
        T tLJJLL = 0;
        if (C123100dR.LIZ(videoPublishEditModel.creativeModel.productRecommendModel.recommendId)) {
            ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIJI(null, videoPublishEditModel.creativeModel.productRecommendModel.recommendId, new AwS601S0100000_22((Function1) null, (Function1<? super Map<Integer, String>, Unit>) 745));
            return;
        }
        C259800zU c259800zU = new C259800zU();
        C1403010mc7.LIZ.getMusicService().al();
        C11NZ<String> c11nzLJ = C2275708vr.LJ();
        if (c11nzLJ != null) {
            tLJJLL = c11nzLJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS157S0200000_22(c259800zU, function1, 11), new AfS181S0100000_12(c259800zU, 245));
        }
        c259800zU.element = tLJJLL;
    }
}
