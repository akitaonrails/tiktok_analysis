package X;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191681Aq6 extends C09AY implements Function0<String> {
    public final /* synthetic */ RunnableC2191761AqE LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ HashMap<C2191641Aq2, JSONObject> LLILLL;
    public final /* synthetic */ InterfaceC2191651Aq3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191681Aq6(RunnableC2191761AqE runnableC2191761AqE, int i, HashMap<C2191641Aq2, JSONObject> map, InterfaceC2191651Aq3 interfaceC2191651Aq3) {
        super(0);
        this.LL = runnableC2191761AqE;
        this.LLILLJJLI = i;
        this.LLILLL = map;
        this.LLILZ = interfaceC2191651Aq3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" missed group: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" upload ");
        sbLIZ.append(this.LLILLL.size());
        sbLIZ.append(" events success and deleted locally, remaining ");
        sbLIZ.append(this.LLILZ.LIZ(this.LLILLJJLI));
        sbLIZ.append(" events.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
