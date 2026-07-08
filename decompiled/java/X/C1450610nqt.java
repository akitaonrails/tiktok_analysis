package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageFilterInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.filter.FilterBean;

/* JADX INFO: renamed from: X.0nqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450610nqt {
    public final SingleImageData LIZ;
    public final C1451230nrt LIZIZ;
    public boolean LIZJ;
    public FilterBean LIZLLL;
    public boolean LJ;

    public C1450610nqt(SingleImageData singleImageData, C1451230nrt c1451230nrt) {
        this.LIZ = singleImageData;
        this.LIZIZ = c1451230nrt;
    }

    public final void LIZ(float f, FilterBean filterBean) {
        if (filterBean != null) {
            LIZIZ(f, filterBean, true);
        } else {
            ImageFilterInfo filterInfo = this.LIZ.getFilterInfo();
            filterInfo.setFilterId("");
            filterInfo.setFilterLabel("");
            filterInfo.setFilterIntensityRatio(-1.0f);
            filterInfo.setCompareKey("");
            filterInfo.setFilterCategoryKey("");
        }
        this.LIZJ = true;
        this.LIZLLL = filterBean;
    }

    public final void LIZIZ(float f, FilterBean filterBean, boolean z) {
        ImageFilterInfo filterInfo = this.LIZ.getFilterInfo();
        filterInfo.setComposer(z);
        filterInfo.setFilterId(filterBean.getId());
        filterInfo.setFilterLabel(filterBean.getEnName());
        filterInfo.setFilterIntensityRatio(f);
        filterInfo.setCompareKey(filterBean.getCompareKey());
        filterInfo.setFilterCategoryKey(filterBean.getCategoryKey());
    }
}
