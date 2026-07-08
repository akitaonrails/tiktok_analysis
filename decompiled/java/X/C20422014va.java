package X;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20422014va extends C09AY implements InterfaceC1631620sYq<String, String, List<? extends String>, Unit> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ C20361314ln LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C20421814vY LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20422014va(JSONObject jSONObject, C20361314ln c20361314ln, long j, String str, C20421814vY c20421814vY) {
        super(3);
        this.LL = jSONObject;
        this.LLILLJJLI = c20361314ln;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = c20421814vY;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, String str2, List<? extends String> list) throws JSONException {
        this.LL.put("url", C13LP.LJJJLL(list));
        if (!this.LLILLJJLI.LJ.isEmpty()) {
            this.LL.put("descList", new JSONArray((Collection) this.LLILLJJLI.LJ));
        }
        C20421714vX.LJII(this.LLILLL, this.LLILZ, this.LLILZIL, this.LL);
        return Unit.LIZ;
    }
}
