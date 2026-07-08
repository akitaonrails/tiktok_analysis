package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0csR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028730csR extends AbstractC1028930csl {
    public static final C01GW<ICRouterAdapterDelegate> LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(367));
    public final C1028720csQ LJII;
    public final C1028880csg<?>[] LJIIIIZZ;

    @Override // X.C1028850csd
    public final C1028880csg<?>[] LIZJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1029030csv
    public final InterfaceC1028810csZ LJ() {
        return this.LJII;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0csQ] */
    public C1028730csR(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LJII = new InterfaceC1028810csZ() { // from class: X.0csQ
            @Override // X.InterfaceC1028810csZ
            public final void LIZ(C1028760csU c1028760csU, InterfaceC1028660csK interfaceC1028660csK, Map map) {
                String str;
                String str2;
                String str3;
                String eventName = interfaceC1028660csK.getEventName();
                Object obj = map.get("tag");
                CommonAdData commonAdData = null;
                if ((obj instanceof String) && (str = (String) obj) != null) {
                    Object obj2 = map.get("refer");
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    } else {
                        str2 = null;
                    }
                    String str4 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    ICRouterAdapterDelegate value = C1028730csR.LJIIIZ.getValue();
                    c1028760csU.LIZ(C1025880cnq.class);
                    C1029040csw c1029040cswLJIIIIZZ = this.LIZ.LJIIIIZZ(c1028760csU);
                    if (c1029040cswLJIIIIZZ != null) {
                        commonAdData = c1029040cswLJIIIIZZ.LIZ;
                    }
                    C1028730csR c1028730csR = this.LIZ;
                    Object obj3 = map.get("ad_extra_data");
                    if ((obj3 instanceof String) && (str3 = (String) obj3) != null) {
                        str4 = str3;
                    }
                    JSONObject jSONObject = new JSONObject(str4);
                    c1028730csR.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        linkedHashMap.put(next, jSONObject.get(next));
                    }
                    value.LJIILLIIL(str, eventName, str2, commonAdData, linkedHashMap);
                }
            }
        };
        C1028800csY.LIZ.getClass();
        this.LJIIIIZZ = new C1028880csg[]{new C1028880csg<>(C1028800csY.LIZIZ, AFwS252S0000000_16.get$arr$(435))};
    }

    @Override // X.AbstractC1028930csl
    public final C1029040csw LJIIIIZZ(C1028760csU c1028760csU) {
        C1029040csw c1029040cswLJIIIIZZ = super.LJIIIIZZ(c1028760csU);
        if (c1029040cswLJIIIIZZ == null) {
            CommonAdData commonAdData = (CommonAdData) c1028760csU.LIZ(GMTBaseModel.class);
            if (commonAdData != null) {
                return new C1029040csw(commonAdData, null, null, null, 14);
            }
            return null;
        }
        return c1029040cswLJIIIIZZ;
    }
}
