package X;

import com.ss.android.ugc.aweme.experiment.SearchDynamicImageDiskCacheExperiment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798230VSz extends C09AY implements Function0<Long> {
    public C798230VSz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        Integer num = ((SearchDynamicImageDiskCacheExperiment.Config) SearchDynamicImageDiskCacheExperiment.LIZIZ.getValue()).type;
        int iIntValue = num != null ? num.intValue() : 0;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_result_picture_opt_cache_size", true);
        if (iIntValue == 1 || iIntValue == 2) {
            iLJIJ = C798220VSy.LIZ(iLJIJ, iIntValue);
        }
        return Long.valueOf(((long) iLJIJ) * 1048576);
    }
}
