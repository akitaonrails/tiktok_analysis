package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.flashcomponent.setting.FlashListItemViewComponentConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00qI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C202800qI {
    public final JSONObject LIZ;
    public List<FlashListItemViewComponentConfig> LIZIZ;

    public final List<FlashListItemViewComponentConfig> LIZ() {
        ArrayList<Pair> arrayList;
        JSONObject jSONObjectOptJSONObject;
        List<FlashListItemViewComponentConfig> list = this.LIZIZ;
        if (list != null) {
            return list;
        }
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null) {
            AnonymousClass0207 anonymousClass0207 = AnonymousClass0207.get$arr$(0);
            Iterator<String> itKeys = jSONObject.keys();
            arrayList = new ArrayList();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (((Boolean) anonymousClass0207.invoke(next)).booleanValue() && (jSONObjectOptJSONObject = jSONObject.optJSONObject(next)) != null) {
                    arrayList.add(new Pair(next, jSONObjectOptJSONObject));
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            for (Pair pair : arrayList) {
                String strJ3 = C786410Ut5.J3((JSONObject) pair.getSecond());
                try {
                    if (C500260Jjc.LJJIIZ(strJ3)) {
                        Object objLJII = C19748512Ol.LIZIZ.LJII(strJ3, FlashListItemViewComponentConfig.class);
                        ((FlashListItemViewComponentConfig) objLJII).LIZ = (String) pair.getFirst();
                        arrayList2.add(objLJII);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        this.LIZIZ = arrayList2;
        return arrayList2;
    }

    public C202800qI(JSONObject jSONObject) {
        this.LIZ = jSONObject;
    }
}
