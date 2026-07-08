package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.cache.data.AddressCacheModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.03pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C962103pT {
    public static final C962103pT LIZ = new C962103pT();

    public static AddressCacheModel LIZ(int i) {
        List list;
        Object next;
        Type type;
        try {
            Keva keva = C1257480ipO.LIZ;
            if (!keva.contains("address_list_cache")) {
                return new AddressCacheModel(0L, "", 1, "", "");
            }
            String string = keva.getString("address_list_cache", null);
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    C13JX c13jx = KTypeProjection.LIZJ;
                    C13JW c13jwLJII = C13LE.LJII(AddressCacheModel.class);
                    c13jx.getClass();
                    type = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII)));
                } else {
                    type = new TypeToken<List<? extends AddressCacheModel>>() { // from class: X.03pU
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, type);
                if (!(objLJIIIIZZ instanceof List)) {
                    objLJIIIIZZ = null;
                }
                list = (List) objLJIIIIZZ;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((AddressCacheModel) next).cacheType == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AddressCacheModel addressCacheModel = (AddressCacheModel) next;
            if (addressCacheModel == null) {
                return new AddressCacheModel(0L, "", 1, "", "");
            }
            return addressCacheModel;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR78;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCache Exception: ");
            sbLIZ.append(e2.getMessage());
            C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
            return new AddressCacheModel(0L, "", 1, "", "");
        }
    }

    public static void LIZIZ(int i, String str) {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        boolean z2;
        String name;
        List list;
        Type type;
        List<AddressCacheModel> list2 = C13BV.INSTANCE;
        String name2 = null;
        try {
            Keva keva = C1257480ipO.LIZ;
            if (keva.contains("address_list_cache")) {
                String string = keva.getString("address_list_cache", null);
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        C13JX c13jx = KTypeProjection.LIZJ;
                        C13JW c13jwLJII = C13LE.LJII(AddressCacheModel.class);
                        c13jx.getClass();
                        type = C2371409Qy.LIZJ(C13LE.LJFF(List.class, C13JX.LIZ(c13jwLJII)));
                    } else {
                        type = new TypeToken<List<? extends AddressCacheModel>>() { // from class: X.03pV
                        }.getType();
                    }
                    Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, type);
                    if (!(objLJIIIIZZ instanceof List)) {
                        objLJIIIIZZ = null;
                    }
                    list = (List) objLJIIIIZZ;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                list2 = list;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR78;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCache Exception: ");
            sbLIZ.append(e2.getMessage());
            C1019103yf.LIZ(enumC1014603xw, new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)), null);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        String currentRegionCode = ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        String userId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
        ArrayList arrayList = new ArrayList();
        for (AddressCacheModel addressCacheModel : list2) {
            if (addressCacheModel.cacheType != i && Intrinsics.LJFF(addressCacheModel.region, currentRegionCode) && Intrinsics.LJFF(addressCacheModel.uid, userId)) {
                arrayList.add(addressCacheModel);
            }
        }
        if (str.length() > 0) {
            arrayList.add(new AddressCacheModel(System.currentTimeMillis(), str, i, currentRegionCode, userId));
        }
        C1257480ipO.LIZ.storeString("address_list_cache", C1741890vQh.LJIIIIZZ(arrayList));
    }
}
