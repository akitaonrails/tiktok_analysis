package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880870z2r extends C09AY implements Function0<String> {
    public final /* synthetic */ MixSparkCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880870z2r(MixSparkCard mixSparkCard) {
        super(0);
        this.LL = mixSparkCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String strOptString;
        JSONObject jSONObjectLIZ = this.LL.LLILLJJLI.LLILLL.LIZ();
        if (jSONObjectLIZ == null || (strOptString = jSONObjectLIZ.optString("card_scheme")) == null) {
            strOptString = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strOptString);
        sbLIZ.append("&enable_prefetch=1");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
