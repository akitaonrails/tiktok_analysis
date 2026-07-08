package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dRO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050400dRO extends C09AY implements Function0<JSONObject> {
    public final /* synthetic */ C1050360dRK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050400dRO(C1050360dRK c1050360dRK) {
        super(0);
        this.LL = c1050360dRK;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() {
        String extra;
        AnchorCommonStruct anchorCommonStruct = this.LL.LLIZ;
        if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null) {
            return null;
        }
        try {
            return new JSONObject(extra);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
