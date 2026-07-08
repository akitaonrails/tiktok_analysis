package com.bytedance.android.live.publicscreen.impl.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.android.live.publicscreen.impl.api.model.AutoTranslateParams;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface PublicScreenAutoTranslateApi {
    @InterfaceC1501170pAR("/webcast/room/mget_translation/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    C11NZ<C470590Icr<MGetTranslationResponse.Data>> translate(@InterfaceC1485405rg AutoTranslateParams autoTranslateParams);
}
