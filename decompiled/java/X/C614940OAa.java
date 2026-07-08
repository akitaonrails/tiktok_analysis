package X;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0OAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C614940OAa implements C0QP5 {
    public final /* synthetic */ JSONObject LIZ;

    @Override // X.C0QP5
    public final Number getAvoidRecordHistory() {
        return 0;
    }

    @Override // X.C0QP5
    public final Map<String, Object> getEcomSearchParams() {
        return null;
    }

    @Override // X.C0QP5
    public final String getEventId() {
        return "";
    }

    @Override // X.C0QP5
    public final String getIconType() {
        return "";
    }

    @Override // X.C0QP5
    public final String getImprId() {
        return "";
    }

    @Override // X.C0QP5
    public final String getPenetrateInfo() {
        return "";
    }

    @Override // X.C0QP5
    public final String getSearchSourcePage() {
        return "";
    }

    @Override // X.C0QP5
    public final String getTabName() {
        return "";
    }

    @Override // X.C0QP5
    public final String getType() {
        return "";
    }

    @Override // X.C0QP5
    public final String getWordsType() {
        return "";
    }

    @Override // X.C0QP5
    public final String isSarRecall() {
        return "";
    }

    @Override // X.C0QP5
    public final String getEnterFrom() {
        String strOptString = this.LIZ.optString("enter_from");
        return strOptString == null ? "" : strOptString;
    }

    @Override // X.C0QP5
    public final String getEnterMethod() {
        String strOptString = this.LIZ.optString("enterMethod");
        return strOptString == null ? "" : strOptString;
    }

    @Override // X.C0QP5
    public final Map<String, Object> getExtra() {
        return C2097908Jt.LIZJ(new Pair("btm", "c5195.d94006"));
    }

    @Override // X.C0QP5
    public final String getKeyword() {
        String strOptString = this.LIZ.optString("keyword");
        return strOptString == null ? "" : strOptString;
    }

    @Override // X.C0QP5
    public final Number getSearchFrom() {
        return Integer.valueOf(this.LIZ.optInt("searchFrom"));
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
    public final JSONObject toJSON() {
        return new JSONObject();
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
    public final Map<String, Object> convert() {
        return C2097608Jq.LJ();
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
    public final List<String> provideParamList() {
        return C13BV.INSTANCE;
    }

    public C614940OAa(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }
}
