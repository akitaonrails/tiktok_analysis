package X;

import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043140dFg extends C09AY implements Function0<List<? extends SSPResponse.Rule>> {
    public final /* synthetic */ C1043130dFf LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1043140dFg(C1043130dFf c1043130dFf, String str) {
        super(0);
        this.LL = c1043130dFf;
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List<? extends com.bytedance.lynx.hybrid.ssp.base.SSPResponse$Rule>] */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends SSPResponse.Rule> invoke() {
        String string = this.LL.LIZ().getString(this.LLILLJJLI, "");
        if (string == null || string.length() == 0) {
            return null;
        }
        ?? FromJson = GsonProtectorUtils.fromJson(C1058250de3.LIZIZ(), string, new TypeToken<List<? extends SSPResponse.Rule>>() { // from class: X.0dFj
        }.getType());
        this.LL.LIZLLL.put(this.LLILLJJLI, (List<SSPResponse.Rule>) FromJson);
        return FromJson;
    }
}
