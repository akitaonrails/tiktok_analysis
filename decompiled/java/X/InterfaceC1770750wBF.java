package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchBatchDiversionRequestParams;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchBatchDiversionResponse;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequencyParams;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideRequestParams;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wBF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public interface InterfaceC1770750wBF {
    @InterfaceC1501240pAY("/aweme/v1/search/ttec/diversion/")
    Object LIZ(@C040I EcSearchFeedVideoGuideRequestParams ecSearchFeedVideoGuideRequestParams, InterfaceC1364105Vn<? super C0X52<Response<String>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/search/ttec/frequency/update/")
    Object LIZIZ(@C040I EcSearchFeedVideoGuideFrequencyParams ecSearchFeedVideoGuideFrequencyParams, InterfaceC1364105Vn<? super C0X52<Response<Unit>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/search/ecom_rec/batch_diversion/")
    Object LIZJ(@C040I EcSearchBatchDiversionRequestParams ecSearchBatchDiversionRequestParams, InterfaceC1364105Vn<? super C0X52<EcSearchBatchDiversionResponse>> interfaceC1364105Vn);
}
