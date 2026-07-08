package X;

import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645220PSm<TTaskResult, TContinuationResult> implements InterfaceC2385309Wh {
    public final /* synthetic */ C645280PSs LIZ;
    public final /* synthetic */ long LIZIZ;

    public C645220PSm(C645280PSs c645280PSs, long j) {
        this.LIZ = c645280PSs;
        this.LIZIZ = j;
    }

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) throws JSONException {
        C1C7U.LIZ("SearchUserCardMonitor@d64a.endBigCard$1$1");
        if (C644160POk.LIZIZ != null) {
            C645280PSs c645280PSs = this.LIZ;
            if (c645280PSs.LIZIZ != 0 && c645280PSs.LJIIIIZZ.isEmpty()) {
                C645280PSs c645280PSs2 = this.LIZ;
                c645280PSs2.LJI = this.LIZIZ - c645280PSs2.LIZ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_lynx", this.LIZ.LJII);
                jSONObject.put("bind_cost", this.LIZ.LIZJ);
                jSONObject.put("cost", this.LIZ.LJI);
                C20684815ws.LJIJJ("search_user_card_monitor", jSONObject);
                C644160POk.LIZ.getClass();
                C644160POk.LIZIZ = null;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchUserCardMonitor@d64a.endBigCard$1$1");
        return unit;
    }
}
