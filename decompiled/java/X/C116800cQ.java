package X;

import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.00cQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C116800cQ extends C09AY implements Function0<Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ JSONArray LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116800cQ(List<String> list, JSONArray jSONArray) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = jSONArray;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("biz=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", logBtmList=");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
