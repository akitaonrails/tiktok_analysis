package X;

import com.ss.android.ugc.aweme.minidrama.ab.ShareAwemeFrameworkConfigModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1574700r52 extends C2217421BqW implements Function1<AbstractC1574450r4d, Integer> {
    public C1574700r52(C1574690r51 c1574690r51) {
        super(1, c1574690r51, C1574690r51.class, "sizeOf", "sizeOf(Lcom/ss/android/ugc/aweme/minidrama/common/share/AwemeVariant;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(AbstractC1574450r4d abstractC1574450r4d) {
        int i;
        this.receiver.getClass();
        ShareAwemeFrameworkConfigModel shareAwemeFrameworkConfigModel = (ShareAwemeFrameworkConfigModel) C1574690r51.LIZLLL.getValue();
        C1574380r4W c1574380r4W = C1574380r4W.LIZ;
        if (Intrinsics.LJFF(abstractC1574450r4d, c1574380r4W)) {
            i = shareAwemeFrameworkConfigModel.lruMaxLastWatch;
        } else if (Intrinsics.LJFF(abstractC1574450r4d, C1574440r4c.LIZ)) {
            i = shareAwemeFrameworkConfigModel.lruMaxFromBegin;
        } else if (abstractC1574450r4d instanceof C1574370r4V) {
            i = shareAwemeFrameworkConfigModel.lruMaxEpisode;
        } else {
            throw new C1954807lC();
        }
        if (i <= 0) {
            if (Intrinsics.LJFF(abstractC1574450r4d, c1574380r4W)) {
                i = C1574690r51.LIZIZ.lruMaxLastWatch;
            } else if (Intrinsics.LJFF(abstractC1574450r4d, C1574440r4c.LIZ)) {
                i = C1574690r51.LIZIZ.lruMaxFromBegin;
            } else if (abstractC1574450r4d instanceof C1574370r4V) {
                i = C1574690r51.LIZIZ.lruMaxEpisode;
            } else {
                throw new C1954807lC();
            }
        }
        return Integer.valueOf(i);
    }
}
