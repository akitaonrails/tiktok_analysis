package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.AddressBase;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcDeliveryConfigModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspJumpOptConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.03rH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C973303rH implements InterfaceC1164530gPT, C0XQB {
    public static final C973303rH LL;
    public static String LLILLJJLI;
    public static List<Region> LLILLL;
    public static final ArrayList<String> LLILZ;
    public static String LLILZIL;
    public static ChangeLocationData LLILZLL;
    public static Keva LLIZ;
    public static AddressBase LLIZLLLIL;

    static {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        C973303rH c973303rH = new C973303rH();
        LL = c973303rH;
        LLILLL = new ArrayList();
        LLILZ = new ArrayList<>();
        LLIZ = C935303l9.LIZ(C935303l9.LIZ);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_address_change", c973303rH);
        LJI();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).addLoginOrLogoutListener(c973303rH);
        C973803rM.LIZ.set(true);
    }

    public static void LJI() {
        List<Region> arrayList;
        Type type;
        Keva kevaLIZ = C935303l9.LIZ(C935303l9.LIZ);
        LLIZ = kevaLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - kevaLIZ.getLong("LAST_SELECT_ADDRESS_CACHE_TIME", -1L);
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcDeliveryConfigModel ecDeliveryConfigModel = C03FU.LIZ;
        EcDeliveryConfigModel ecDeliveryConfigModel2 = (EcDeliveryConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_delivery_config", EcDeliveryConfigModel.class, ecDeliveryConfigModel);
        if (ecDeliveryConfigModel2 != null) {
            ecDeliveryConfigModel = ecDeliveryConfigModel2;
        }
        Long l = ecDeliveryConfigModel.cacheDuration;
        ChangeLocationData changeLocationData = null;
        if (jCurrentTimeMillis > (l != null ? l.longValue() : 86400L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
            LLIZ.storeString("ShoppingCartSelectedAddressId", "");
            LLIZ.storeString("SHOPPING_TO_ADDRESS", "");
            LLIZ.storeString("SHOPPING_TO_ADDRESS_ZIPCODE", "");
            LLILLJJLI = null;
            LLILLL.clear();
            LLILZIL = "";
            LLILZLL = null;
            return;
        }
        String string = LLIZ.getString("ShoppingCartSelectedAddressId", "");
        if (string == null || string.length() == 0) {
            string = null;
        } else {
            LLILLL.clear();
        }
        LLILLJJLI = string;
        String string2 = LLIZ.getString("SHOPPING_TO_ADDRESS", "");
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                type = new TypeToken<List<Region>>() { // from class: X.03rJ
                }.getType();
            } else {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(Region.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LIZJ(C13LE.LJIIIIZZ(List.class, C13JX.LIZ(c13jwLJII))));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, string2, type);
            if (!C19719512Dh.LJI(objFromJson)) {
                objFromJson = null;
            }
            arrayList = (List) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.isEmpty()) {
            LLILLJJLI = null;
        }
        LLILLL = arrayList;
        LLILZIL = LLIZ.getString("SHOPPING_TO_ADDRESS_ZIPCODE", "");
        String string3 = LLIZ.getString("CHANGE_LOCATION", "");
        try {
            Gson gsonLJFF2 = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
            Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, string3, (c1121904a9LIZIZ2 == null || !c1121904a9LIZIZ2.LJII) ? new TypeToken<ChangeLocationData>() { // from class: X.03rK
            }.getType() : C2371409Qy.LIZJ(C13LE.LJ(ChangeLocationData.class)));
            if (!(objFromJson2 instanceof ChangeLocationData)) {
                objFromJson2 = null;
            }
            changeLocationData = (ChangeLocationData) objFromJson2;
        } catch (s e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LLILZLL = changeLocationData;
    }

    public static Object LJFF(C973403rI c973403rI) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c973403rI));
        AddressApi.LIZ.getClass();
        ((AddressApi) C980703sT.LIZIZ.create(AddressApi.class)).jt().LJL(C11S5.LIZ()).LIZIZ(new C1077404Jg(c23260099m, 10));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c973403rI);
        }
        return objLIZ;
    }

    public static List LJII(List list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (Region region : (ArrayList) list) {
            arrayList.add(new District(region.name, region.geoNameId, region.code, region.districtKey, null, null, null, null, null, null, null));
        }
        return new ArrayList(arrayList);
    }

    public final void LIZIZ(String str) {
        LIZ(this, str, null, null, 6);
        LLILLJJLI = str;
        LLILLL.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C973403rI
            if (r0 == 0) goto L20
            r4 = r6
            X.03rI r4 = (X.C973403rI) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L3a
        L20:
            X.03rI r4 = new X.03rI
            r4.<init>(r5, r6)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Throwable -> L73
            java.lang.Object r3 = LJFF(r4)     // Catch: java.lang.Throwable -> L73
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L73
        L3d:
            X.0X52 r3 = (X.C0X52) r3     // Catch: java.lang.Throwable -> L73
            T r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L73
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> L73
            boolean r0 = r0.isCodeOK()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L83
            T r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L73
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> L73
            T r0 = r0.data     // Catch: java.lang.Throwable -> L73
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.BuyerHasAddressResponse r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.BuyerHasAddressResponse) r0     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L83
            X.03rH r2 = X.C973303rH.LL     // Catch: java.lang.Throwable -> L73
            java.lang.Boolean r0 = r0.hasAddress     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L71
            boolean r1 = r0.booleanValue()     // Catch: java.lang.Throwable -> L73
        L5d:
            r2.getClass()     // Catch: java.lang.Throwable -> L73
            com.bytedance.keva.Keva r3 = X.C1257480ipO.LIZ     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "buyer_has_address"
            r3.storeBoolean(r0, r1)     // Catch: java.lang.Throwable -> L73
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = "buyer_has_address_timestamp"
            r3.storeLong(r0, r1)     // Catch: java.lang.Throwable -> L73
            goto L83
        L71:
            r1 = 0
            goto L5d
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.09Fh r1 = X.C2341109Fh.LIZ
            java.lang.String r0 = r0.toString()
            r1.getClass()
            X.C2341109Fh.LIZJ(r0)
        L83:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973303rH.LIZLLL(X.05Vn):java.lang.Object");
    }

    public final Object LJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        Keva keva = C1257480ipO.LIZ;
        if (keva.contains("buyer_has_address_timestamp")) {
            if (System.currentTimeMillis() - keva.getLong("buyer_has_address_timestamp", 0L) < ((OspJumpOptConfig) C973903rN.LIZIZ.getValue()).addressCacheTimeoutHour * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
                return Unit.LIZ;
            }
        }
        if (C973703rL.LIZ()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            if (!((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).isLogin()) {
                return Unit.LIZ;
            }
        }
        Object objLIZLLL = LIZLLL(interfaceC1364105Vn);
        if (objLIZLLL == C099R.LJFF()) {
            return objLIZLLL;
        }
        return Unit.LIZ;
    }

    public static void LJIIIIZZ(Integer num, String str) {
        if (num != null) {
            int iIntValue = num.intValue();
            if (C123100dR.LIZ(str) && iIntValue > 0) {
                LL.LIZIZ(str);
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C962703pZ(iIntValue, str, null), 2);
            }
        }
    }

    public final void LIZJ(String str, List list) {
        Object next;
        if (str == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((Region) next).districtKey, "zipcode")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Region region = (Region) next;
            if (region != null) {
                str = region.name;
            } else {
                str = null;
            }
        }
        LIZ(this, null, list, str, 1);
        LLILLL = list;
        LLILLJJLI = null;
        LLILZIL = str;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_address_change")) {
            int i = C862003Yk.LIZ(str2).type;
            if (i != 0 && i != 2) {
                return;
            }
            Keva keva = C1257480ipO.LIZ;
            keva.erase("buyer_has_address");
            keva.erase("buyer_has_address_timestamp");
        }
    }

    @Override // X.C0XQB
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 2 || i == 3) {
            Keva keva = C1257480ipO.LIZ;
            keva.erase("buyer_has_address");
            keva.erase("buyer_has_address_timestamp");
        }
        LJI();
    }

    public static void LIZ(C973303rH c973303rH, String str, List list, String str2, int i) {
        String str3 = "";
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            list = C13BV.INSTANCE;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c973303rH.getClass();
        LLIZ.storeLong("LAST_SELECT_ADDRESS_CACHE_TIME", System.currentTimeMillis());
        Keva keva = LLIZ;
        if (str == null) {
            str = "";
        }
        keva.storeString("ShoppingCartSelectedAddressId", str);
        Keva keva2 = LLIZ;
        if (str2 != null) {
            str3 = str2;
        }
        keva2.storeString("SHOPPING_TO_ADDRESS_ZIPCODE", str3);
        LLIZ.storeString("SHOPPING_TO_ADDRESS", C1741890vQh.LJIIIIZZ(list));
    }
}
