package X;

import com.bytedance.android.live.network.gson.BaseListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.BaseResponseTypeAdapter;
import com.bytedance.android.live.network.gson.LinkMicResponseAdapter;
import com.bytedance.android.live.network.gson.ListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ResponseTypeAdapter;
import com.bytedance.android.live.network.gson.StartLiveResponseAdapter;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.StartLiveResponse;
import com.google.gson.Gson;
import com.google.gson.e;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0psN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528410psN extends C09AY implements Function0<Gson> {
    public C1528410psN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        Gson gson = C19748512Ol.LIZIZ;
        e eVar = C19748512Ol.LIZ;
        eVar.LIZJ(new BaseResponseTypeAdapter(gson), BaseResponse.class);
        eVar.LIZJ(new ResponseTypeAdapter(gson), C470590Icr.class);
        eVar.LIZJ(new BaseListResponseTypeAdapter(gson), BaseListResponse.class);
        eVar.LIZJ(new ListResponseTypeAdapter(gson), C472830IgT.class);
        eVar.LIZJ(new LinkMicResponseAdapter(gson), C926820aE4.class);
        eVar.LIZJ(new StartLiveResponseAdapter(gson), StartLiveResponse.class);
        return eVar.LIZ();
    }
}
