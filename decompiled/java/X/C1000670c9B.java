package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c9B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000670c9B extends C09AY implements Function1<C1196804mE, String> {
    public final /* synthetic */ C1049170dPP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1000670c9B(C1049170dPP c1049170dPP) {
        super(1);
        this.LL = c1049170dPP;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(C1196804mE c1196804mE) throws C1023680ckI {
        Object objLIZ = c1196804mE.LIZ(AwemeRawAd.class);
        if (objLIZ != null) {
            Map<String, AnoleComponentModel> map = ((AwemeRawAd) objLIZ).getAnoleModel().components;
            if (map != null) {
                C1049170dPP c1049170dPP = this.LL;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, AnoleComponentModel> entry : map.entrySet()) {
                    if (Intrinsics.LJFF(entry.getValue().slotID, c1049170dPP.LIZ)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(((AnoleComponentModel) ((Map.Entry) it2.next()).getValue()).type);
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                if (strLJJLIIIJ != null) {
                    return strLJJLIIIJ;
                }
                return "";
            }
            return "";
        }
        throw new C1023680ckI(AwemeRawAd.class);
    }
}
