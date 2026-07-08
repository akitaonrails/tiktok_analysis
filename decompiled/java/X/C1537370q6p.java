package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoFrontUpdateModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1537370q6p extends C09AY implements Function0<Map<String, ? extends EcomGeckoFrontUpdateModel>> {
    public C1537370q6p() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EcomGeckoFrontUpdateModel> invoke() {
        EcomGeckoUpdateInterceptor ecomGeckoUpdateInterceptor = EcomGeckoUpdateInterceptor.LL;
        InterfaceC1553940qXY[] interfaceC1553940qXYArr = {new InterfaceC1553940qXY() { // from class: X.0qXX
            public static final EcomGeckoFrontUpdateModel[] LIZIZ = new EcomGeckoFrontUpdateModel[0];

            @Override // X.InterfaceC1553940qXY
            public final Map<String, EcomGeckoFrontUpdateModel> LIZ() {
                return C1553880qXS.LIZ(this);
            }

            @Override // X.InterfaceC1553940qXY
            public final EcomGeckoFrontUpdateModel[] config() {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr = LIZIZ;
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr2 = (EcomGeckoFrontUpdateModel[]) c0c64LJIILLIIL.LJJII(EcomGeckoFrontUpdateModel[].class, ecomGeckoFrontUpdateModelArr, "ecom_common_gecko_front_update", true);
                return ecomGeckoFrontUpdateModelArr2 != null ? ecomGeckoFrontUpdateModelArr2 : ecomGeckoFrontUpdateModelArr;
            }
        }, new InterfaceC1553940qXY() { // from class: X.0qXT
            public static final EcomGeckoFrontUpdateModel[] LIZIZ = new EcomGeckoFrontUpdateModel[0];

            @Override // X.InterfaceC1553940qXY
            public final Map<String, EcomGeckoFrontUpdateModel> LIZ() {
                return C1553880qXS.LIZ(this);
            }

            @Override // X.InterfaceC1553940qXY
            public final EcomGeckoFrontUpdateModel[] config() {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr = LIZIZ;
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr2 = (EcomGeckoFrontUpdateModel[]) c0c64LJIILLIIL.LJJII(EcomGeckoFrontUpdateModel[].class, ecomGeckoFrontUpdateModelArr, "ecom_common_gecko_front_update_ext1", true);
                return ecomGeckoFrontUpdateModelArr2 != null ? ecomGeckoFrontUpdateModelArr2 : ecomGeckoFrontUpdateModelArr;
            }
        }, new InterfaceC1553940qXY() { // from class: X.0qXU
            public static final EcomGeckoFrontUpdateModel[] LIZIZ = new EcomGeckoFrontUpdateModel[0];

            @Override // X.InterfaceC1553940qXY
            public final Map<String, EcomGeckoFrontUpdateModel> LIZ() {
                return C1553880qXS.LIZ(this);
            }

            @Override // X.InterfaceC1553940qXY
            public final EcomGeckoFrontUpdateModel[] config() {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr = LIZIZ;
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr2 = (EcomGeckoFrontUpdateModel[]) c0c64LJIILLIIL.LJJII(EcomGeckoFrontUpdateModel[].class, ecomGeckoFrontUpdateModelArr, "ecom_common_gecko_front_update_ext2", true);
                return ecomGeckoFrontUpdateModelArr2 != null ? ecomGeckoFrontUpdateModelArr2 : ecomGeckoFrontUpdateModelArr;
            }
        }, new InterfaceC1553940qXY() { // from class: X.0qXV
            public static final EcomGeckoFrontUpdateModel[] LIZIZ = new EcomGeckoFrontUpdateModel[0];

            @Override // X.InterfaceC1553940qXY
            public final Map<String, EcomGeckoFrontUpdateModel> LIZ() {
                return C1553880qXS.LIZ(this);
            }

            @Override // X.InterfaceC1553940qXY
            public final EcomGeckoFrontUpdateModel[] config() {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr = LIZIZ;
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr2 = (EcomGeckoFrontUpdateModel[]) c0c64LJIILLIIL.LJJII(EcomGeckoFrontUpdateModel[].class, ecomGeckoFrontUpdateModelArr, "ecom_common_gecko_front_update_ext3", true);
                return ecomGeckoFrontUpdateModelArr2 != null ? ecomGeckoFrontUpdateModelArr2 : ecomGeckoFrontUpdateModelArr;
            }
        }, new InterfaceC1553940qXY() { // from class: X.0qXW
            public static final EcomGeckoFrontUpdateModel[] LIZIZ = new EcomGeckoFrontUpdateModel[0];

            @Override // X.InterfaceC1553940qXY
            public final Map<String, EcomGeckoFrontUpdateModel> LIZ() {
                return C1553880qXS.LIZ(this);
            }

            @Override // X.InterfaceC1553940qXY
            public final EcomGeckoFrontUpdateModel[] config() {
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr = LIZIZ;
                EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr2 = (EcomGeckoFrontUpdateModel[]) c0c64LJIILLIIL.LJJII(EcomGeckoFrontUpdateModel[].class, ecomGeckoFrontUpdateModelArr, "ecom_common_gecko_front_update_ext4", true);
                return ecomGeckoFrontUpdateModelArr2 != null ? ecomGeckoFrontUpdateModelArr2 : ecomGeckoFrontUpdateModelArr;
            }
        }};
        ecomGeckoUpdateInterceptor.getClass();
        LinkedHashMap linkedHashMap = null;
        try {
            ArrayList arrayList = new ArrayList(5);
            for (int i = 0; i < 5; i++) {
                arrayList.add(interfaceC1553940qXYArr[i].LIZ());
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((Map) it2.next()).keySet(), arrayList2);
            }
            Set<String> setLLIIJI = C13LP.LLIIJI(arrayList2);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(setLLIIJI, 10));
            for (String str : setLLIIJI) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel = (EcomGeckoFrontUpdateModel) ((Map) it3.next()).get(str);
                    String str2 = ecomGeckoFrontUpdateModel != null ? ecomGeckoFrontUpdateModel.update : null;
                    if (str2 != null) {
                        arrayList4.add(str2);
                    }
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel2 = (EcomGeckoFrontUpdateModel) ((Map) it4.next()).get(str);
                    Long lValueOf = ecomGeckoFrontUpdateModel2 != null ? Long.valueOf(ecomGeckoFrontUpdateModel2.delay) : null;
                    if (lValueOf != null) {
                        arrayList5.add(lValueOf);
                    }
                }
                arrayList3.add(new EcomGeckoFrontUpdateModel(str, strLJJLIIIJ, ((Number) C13LP.LJJLIIIJJI(arrayList5)).longValue()));
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList3, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
            for (Object obj : arrayList3) {
                linkedHashMap2.put(((EcomGeckoFrontUpdateModel) obj).scene, obj);
            }
            linkedHashMap = linkedHashMap2;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return linkedHashMap == null ? C2097608Jq.LJ() : linkedHashMap;
    }
}
