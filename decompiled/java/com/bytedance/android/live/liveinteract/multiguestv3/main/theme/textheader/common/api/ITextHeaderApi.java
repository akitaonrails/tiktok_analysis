package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.api;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderEndParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderPlayGetContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderPlayGetContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordCreateParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordCreateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordDeleteParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordDeleteResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordFetchListParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordFetchListResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordGetParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordGetResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordUpdateResponse;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderUpdateParams;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderUpdateResponse;

/* JADX INFO: loaded from: classes.dex */
public interface ITextHeaderApi {
    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/record_create/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderRecordCreateResponse.ResponseData>> createRecord(@InterfaceC1485405rg TextHeaderRecordCreateParams textHeaderRecordCreateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/record_delete/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderRecordDeleteResponse.ResponseData>> deleteRecord(@InterfaceC1485405rg TextHeaderRecordDeleteParams textHeaderRecordDeleteParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/end_play/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderEndResponse.ResponseData>> endPlay(@InterfaceC1485405rg TextHeaderEndParams textHeaderEndParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/record_fetch_list/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderRecordFetchListResponse.ResponseData>> fetchRecordList(@InterfaceC1485405rg TextHeaderRecordFetchListParams textHeaderRecordFetchListParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/record_get/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderRecordGetResponse.ResponseData>> getRecord(@InterfaceC1485405rg TextHeaderRecordGetParams textHeaderRecordGetParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/play_get_content/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderPlayGetContentResponse.ResponseData>> playGetContent(@InterfaceC1485405rg TextHeaderPlayGetContentParams textHeaderPlayGetContentParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/start_play/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderCreateResponse.ResponseData>> startPlay(@InterfaceC1485405rg TextHeaderCreateParams textHeaderCreateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/update_play/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderUpdateResponse.ResponseData>> updatePlay(@InterfaceC1485405rg TextHeaderUpdateParams textHeaderUpdateParams);

    @C09SO(EnumC1846380y9E.LINK_MIC)
    @InterfaceC1501170pAR("/webcast/multi_guest_play/text_header/record_update/")
    @InterfaceC1501310pAf({"content-type: application/json"})
    AbstractC19484711Kz<C470590Icr<TextHeaderRecordUpdateResponse.ResponseData>> updateRecord(@InterfaceC1485405rg TextHeaderRecordUpdateParams textHeaderRecordUpdateParams);
}
