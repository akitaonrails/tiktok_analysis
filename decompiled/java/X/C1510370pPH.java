package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pPH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510370pPH extends AbstractC1509490pNr {
    public boolean LJIIL;
    public WeakReference<Aweme> LJIILIIL;

    @Override // X.AbstractC1509490pNr
    public final Aweme LIZ() {
        WeakReference<Aweme> weakReference = this.LJIILIIL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final JSONObject toJSON() throws JSONException {
        JSONObject json = super.toJSON();
        json.put("aidKey", this.LIZ);
        json.put("requestId", this.LIZJ);
        json.put("enterFrom", this.LIZLLL);
        json.put("displayBeginTimeMs", this.LJ);
        json.put("fromActionType", this.LJFF);
        json.put("isStartLoadmore", this.LJI);
        return json;
    }

    public C1510370pPH(String str) {
        super(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0222  */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.0pPK] */
    @Override // X.AbstractC1509490pNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1510370pPH.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
    public final void fromJSON(JSONObject jSONObject) {
        super.fromJSON(jSONObject);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null) {
                switch (next.hashCode()) {
                    case -858429790:
                        if (next.equals("enterFrom")) {
                            this.LIZLLL = jSONObject.optString(next);
                        }
                        break;
                    case -716087846:
                        if (next.equals("fromActionType")) {
                            this.LJFF = jSONObject.optString(next);
                        }
                        break;
                    case -153085261:
                        if (next.equals("isStartLoadmore")) {
                            this.LJI = jSONObject.optInt(next);
                        }
                        break;
                    case 644759866:
                        if (next.equals("displayBeginTimeMs")) {
                            this.LJ = jSONObject.optLong(next);
                        }
                        break;
                    case 693933066:
                        if (next.equals("requestId")) {
                            this.LIZJ = jSONObject.optString(next);
                        }
                        break;
                }
            }
        }
    }

    @Override // X.AbstractC1509490pNr
    public final void LIZJ(String str, boolean z) throws JSONException {
        final JSONObject jSONObject = new JSONObject(C2097608Jq.LJIIZILJ(getFeatureMap()));
        jSONObject.put("group_id", getFeatureMap().get("aid"));
        Runnable runnable = new Runnable() { // from class: X.0pPI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedItemFeatureInfoImpl@e939.postFeatureMap$runnable$1");
                try {
                    C1513180pTo.LIZ("feed_basic_item_info", jSONObject);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedItemFeatureInfoImpl@e939.postFeatureMap$runnable$1");
            }
        };
        if (z) {
            C1511690pRP.LIZJ(6000L, runnable);
        } else {
            runnable.run();
        }
    }
}
