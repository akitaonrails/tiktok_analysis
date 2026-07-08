package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.network.response.StartLiveResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.k;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes24.dex */
public class StartLiveResponseAdapter extends AbsJsonDeserializer<StartLiveResponse> {
    public StartLiveResponseAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.j
    public final Object deserialize(k kVar, Type type, i iVar) {
        try {
            StartLiveResponse startLiveResponse = (StartLiveResponse) this.LIZ.LIZLLL(kVar, type);
            if (startLiveResponse.statusCode != 0) {
                startLiveResponse.LIZ = (RequestError) this.LIZ.LIZJ(kVar.LJIILIIL().LJJIIZ("data"), RequestError.class);
                return startLiveResponse;
            }
            return startLiveResponse;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new StartLiveResponse();
        }
    }
}
