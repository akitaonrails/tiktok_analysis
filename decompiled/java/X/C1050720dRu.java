package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dRu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050720dRu extends C09AY implements Function0<JSONObject> {
    public final /* synthetic */ C1050690dRr LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050720dRu(C1050690dRr c1050690dRr) {
        super(0);
        this.LL = c1050690dRr;
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
