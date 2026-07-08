package X;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Ci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21245818Ci extends C09AY implements Function0<Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ BufferBtm LLILZIL;
    public final /* synthetic */ C21247918Dd LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21245818Ci(int i, int i2, Integer num, int i3, BufferBtm bufferBtm, C21247918Dd c21247918Dd) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = num;
        this.LLILZ = i3;
        this.LLILZIL = bufferBtm;
        this.LLILZLL = c21247918Dd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        Integer num = this.LLILLL;
        int i3 = this.LLILZ;
        BufferBtm bufferBtm = this.LLILZIL;
        C21247918Dd c21247918Dd = this.LLILZLL;
        jSONObject.put("chain_map_size", i);
        jSONObject.put("union_chain_map_size", i2);
        jSONObject.put("bcm_chain_map_size", num);
        jSONObject.put("singleton_chain_map_size", i3);
        jSONObject.put("launch_id", BtmServiceImpl.INSTANCE.getLaunchIdExp());
        jSONObject.put("pageBufferBtm", bufferBtm);
        jSONObject.put("cachedInfoStack", C21246118Cl.LIZ);
        jSONObject.put("pausedInfo", c21247918Dd);
        return jSONObject;
    }
}
