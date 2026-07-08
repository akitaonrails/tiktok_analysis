package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0h8S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192420h8S {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Dcd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0Ou3] */
    public static void LIZ(final Fragment fragment, Integer num, PoiDetailApi.PrivacyPopupModel privacyPopupModel, final Map map) {
        Integer authStatus;
        C1192440h8U c1192440h8U = C1192440h8U.LIZ;
        if (privacyPopupModel != null) {
            authStatus = privacyPopupModel.getAuthStatus();
        } else {
            authStatus = null;
        }
        c1192440h8U.getClass();
        C1192440h8U.LIZLLL(authStatus);
        if (privacyPopupModel != null) {
            Integer authStatus2 = privacyPopupModel.getAuthStatus();
            int value = EnumC993230bxB.AUTHORIZED.getValue();
            if ((authStatus2 == null || authStatus2.intValue() != value) && privacyPopupModel.getPopup() != null) {
                C1192440h8U.LIZJ("poi_detail", fragment, privacyPopupModel, map);
                return;
            }
        }
        if (num != null && num.intValue() == 1 && fragment != null) {
            C2197301AzA c2197301AzA = C2197301AzA.LIZ;
            final ?? r1 = new InterfaceC20660615sy() { // from class: X.0Ou3
                @Override // X.InterfaceC20660615sy
                public final boolean t2() {
                    return true;
                }

                @Override // X.InterfaceC20658015sY
                public final boolean Xu() {
                    return fragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
                }

                @Override // X.InterfaceC20658015sY
                public final C688120Qyw i2() {
                    Context context = fragment.getContext();
                    if (context != null) {
                        return new C688120Qyw(context, fragment, null);
                    }
                    return null;
                }

                @Override // X.InterfaceC20658015sY
                public final String getSceneId() {
                    return C634060Otw.LIZ(this);
                }
            };
            final ?? r0 = new InterfaceC1187150gzx() { // from class: X.0Dcd
                @Override // X.InterfaceC1187150gzx
                public final void LIZ(C20656615sK c20656615sK) {
                    LinkedHashMap linkedHashMap;
                    C1202430hOb c1202430hOb = C1202430hOb.LIZ;
                    Fragment fragment2 = fragment;
                    Map<String, Object> map2 = map;
                    if (map2 != null) {
                        linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
                        Iterator<T> it2 = map2.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(c20656615sK, 10);
                    c1202430hOb.getClass();
                    C1202430hOb.LIZIZ("poi_detail", fragment2, linkedHashMap, awS583S0100000_4);
                }
            };
            AbstractC20660815t0 abstractC20660815t0 = new AbstractC20660815t0(r1, r0) { // from class: X.0h8R
                public final InterfaceC1187150gzx LL;

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 30;
                }

                {
                    this.LL = r0;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    this.LL.LIZ(c20656615sK);
                }
            };
            c2197301AzA.getClass();
            C2197301AzA.LIZLLL(fragment, abstractC20660815t0, null);
        }
    }
}
