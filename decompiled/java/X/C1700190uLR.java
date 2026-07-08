package X;

import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700190uLR extends C09AY implements Function0<Object> {
    public final /* synthetic */ List<JSONObject> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1700190uLR(List<JSONObject> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send btm_page_show cache ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
