package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.lazy.BlockLazyUpdateSettings;
import com.bytedance.geckox.policy.meta.MetaDataItemNew;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS263S0000000_23;

/* JADX INFO: renamed from: X.0qUH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551910qUH {
    public static Map<String, UpdatePackage> LIZIZ;
    public static Map<String, UpdatePackage> LIZJ;
    public static final Map<String, List<String>> LIZLLL = new ConcurrentHashMap();
    public C1551530qTf LIZ;

    public static void LIZ(UpdatePackage updatePackage, String str) {
        if (LIZIZ == null) {
            LIZIZ = new ConcurrentHashMap();
        }
        ((ConcurrentHashMap) LIZIZ).put(str, updatePackage);
    }

    public static EnumC1048180dNo LIZIZ(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            GlobalConfigSettings globalConfigSettingsLJI = C797990VSb.LIZ.LJI();
            if (globalConfigSettingsLJI != null && globalConfigSettingsLJI.getReqMeta() != null) {
                Map<String, GlobalConfigSettings.LazyItem> lazy = globalConfigSettingsLJI.getReqMeta().getLazy();
                if (lazy == null) {
                    return EnumC1048180dNo.STATUS_NOT_LAZY;
                }
                GlobalConfigSettings.LazyItem lazyItem = lazy.get(str);
                if (lazyItem == null) {
                    return EnumC1048180dNo.STATUS_NOT_LAZY;
                }
                if (lazyItem.getGroups() != null && !lazyItem.getGroups().isEmpty() && lazyItem.getGroups().contains(str2)) {
                    Map<String, List<String>> map = LIZLLL;
                    if (((ConcurrentHashMap) map).containsKey(str) && ((List) ((ConcurrentHashMap) map).get(str)).contains(str2)) {
                        return EnumC1048180dNo.STATUS_REQUESTED;
                    }
                    return EnumC1048180dNo.STATUS_PENDING_REQUEST;
                }
                return EnumC1048180dNo.STATUS_NOT_LAZY;
            }
            return EnumC1048180dNo.STATUS_PENDING_CONFIRM;
        }
        return EnumC1048180dNo.STATUS_NOT_LAZY;
    }

    public static C443120HZe<Boolean, Long, Long> LIZJ(String str, String str2) {
        long jLongValue;
        Map<String, UpdatePackage> map = LIZIZ;
        if (map != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-");
            sbLIZ.append(str2);
            if (((ConcurrentHashMap) map).containsKey(C2188811AlT.LIZIZ(sbLIZ))) {
                Long lLIZLLL = C1550610qSB.LIZLLL(str, str2);
                if (lLIZLLL == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = lLIZLLL.longValue();
                }
                Map<String, UpdatePackage> map2 = LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("-");
                sbLIZ2.append(str2);
                UpdatePackage updatePackage = (UpdatePackage) ((ConcurrentHashMap) map2).get(C2188811AlT.LIZIZ(sbLIZ2));
                if (updatePackage != null && jLongValue != updatePackage.getVersion()) {
                    return new C443120HZe<>(Boolean.TRUE, Long.valueOf(updatePackage.getFullPackage().getLength()), Long.valueOf(updatePackage.getVersion()));
                }
                return new C443120HZe<>(Boolean.FALSE, null, null);
            }
        }
        return new C443120HZe<>(Boolean.FALSE, null, null);
    }

    public static boolean LIZLLL(String str, String str2) {
        Map<String, UpdatePackage> map = LIZIZ;
        if (map != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("-");
            sbLIZ.append(str2);
            if (((ConcurrentHashMap) map).containsKey(C2188811AlT.LIZIZ(sbLIZ))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJ(final String str, final Map<String, List<CheckRequestBodyModel.TargetChannel>> map, final OptionCheckUpdateParams optionCheckUpdateParams) {
        GlobalConfigSettings globalConfigSettingsLJI = C797990VSb.LIZ.LJI();
        if (globalConfigSettingsLJI != null && globalConfigSettingsLJI.getReqMeta() != null && globalConfigSettingsLJI.getReqMeta().getLazy() != null) {
            C822650WOx c822650WOxLIZ = this.LIZ.LIZ();
            final int iHashCode = hashCode();
            c822650WOxLIZ.execute(new AbstractRunnableC21164217s0(iHashCode) { // from class: X.0qUG
                public final void LIZ() {
                    final String str2;
                    Set<String> setKeySet;
                    long jLongValue;
                    final ArrayList<UpdatePackage> arrayList = new ArrayList();
                    ArrayList<UpdatePackage> arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AbstractC1552040qUU listener = optionCheckUpdateParams.getListener();
                    Map map2 = map;
                    if (map2 != null) {
                        str2 = null;
                        for (Map.Entry entry : map2.entrySet()) {
                            str2 = (String) entry.getKey();
                            for (CheckRequestBodyModel.TargetChannel targetChannel : (List) entry.getValue()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(str2);
                                sbLIZ.append("-");
                                sbLIZ.append(targetChannel.channelName);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                Map<String, UpdatePackage> map3 = C1551910qUH.LIZIZ;
                                if (map3 == null || !((ConcurrentHashMap) map3).containsKey(strLIZIZ)) {
                                    Long lLIZLLL = C1550610qSB.LIZLLL(str2, targetChannel.channelName);
                                    jLongValue = lLIZLLL != null ? lLIZLLL.longValue() : 0L;
                                    UpdatePackage updatePackage = new UpdatePackage();
                                    updatePackage.setAccessKey(str2);
                                    updatePackage.setChannel(targetChannel.channelName);
                                    updatePackage.setLocalVersion(jLongValue);
                                    updatePackage.setVersion(jLongValue);
                                    if (lLIZLLL == null) {
                                        arrayList3.add(updatePackage);
                                    } else {
                                        arrayList2.add(updatePackage);
                                    }
                                } else {
                                    Long lLIZLLL2 = C1550610qSB.LIZLLL(str2, targetChannel.channelName);
                                    jLongValue = lLIZLLL2 != null ? lLIZLLL2.longValue() : 0L;
                                    UpdatePackage updatePackage2 = (UpdatePackage) ((ConcurrentHashMap) C1551910qUH.LIZIZ).get(strLIZIZ);
                                    if (updatePackage2 == null || jLongValue != updatePackage2.getVersion()) {
                                        arrayList.add(((ConcurrentHashMap) C1551910qUH.LIZIZ).get(strLIZIZ));
                                    } else {
                                        arrayList2.add(updatePackage2);
                                    }
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(str)) {
                        str2 = null;
                    } else {
                        Map<String, UpdatePackage> map4 = C1551910qUH.LIZJ;
                        if (map4 == null) {
                            return;
                        }
                        str2 = null;
                        for (Map.Entry entry2 : ((ConcurrentHashMap) map4).entrySet()) {
                            Object key = entry2.getKey();
                            str2 = (String) ListProtector.get(this.LLJI.LIZ.LJ, 0);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str2);
                            sbLIZ2.append("-");
                            sbLIZ2.append(str);
                            if (C2188811AlT.LIZIZ(sbLIZ2).equals(key)) {
                                arrayList.add(entry2.getValue());
                            }
                        }
                    }
                    if (listener != null) {
                        if (!arrayList.isEmpty()) {
                            listener.LJIIIIZZ(null, new HashMap<String, List<UpdatePackage>>(str2, arrayList) { // from class: X.0qVm
                                public final /* synthetic */ List LL;

                                {
                                    this.LL = arrayList;
                                    put(str2, arrayList);
                                }
                            });
                        } else if (!arrayList2.isEmpty()) {
                            listener.LJIIIIZZ(null, null);
                            if (C1957007lY.LIZ.LJIIIZ) {
                                for (UpdatePackage updatePackage3 : arrayList2) {
                                    LocalPackageModel localPackageModel = new LocalPackageModel(updatePackage3.getAccessKey(), updatePackage3.getChannel());
                                    localPackageModel.setLatestVersion(updatePackage3.getVersion());
                                    listener.LJIILLIIL(localPackageModel);
                                }
                            }
                        }
                    }
                    if (!arrayList3.isEmpty() && listener != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("request channels ");
                        sbLIZ3.append(C13LP.LJJLIIIJ(arrayList3, null, null, null, 0, null, AFwS263S0000000_23.get$arr$(57), 31));
                        sbLIZ3.append(" is not lazy update");
                        listener.LJII(new C1553030qW5(arrayList3, C2188811AlT.LIZIZ(sbLIZ3)), null);
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean z = true;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("lazy update, channels size:");
                    sbLIZ4.append(arrayList.size());
                    C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ4));
                    BlockLazyUpdateSettings blockLazyUpdateSettings = C1957007lY.LIZ.LJIILL;
                    List arrayList4 = new ArrayList();
                    if (blockLazyUpdateSettings == null || !blockLazyUpdateSettings.enabled) {
                        C1551330qTL.LIZ.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        for (UpdatePackage updatePackage4 : arrayList) {
                            String accessKey = updatePackage4.getAccessKey();
                            String channel = updatePackage4.getChannel();
                            Map<String, List<String>> map5 = C1957007lY.LIZ.LJ;
                            if (map5 != null && (setKeySet = map5.keySet()) != null && setKeySet.contains(accessKey) == z) {
                                C1551330qTL.LIZ.getClass();
                                SharedPreferences sharedPreferencesLJI = C1551330qTL.LJI(accessKey);
                                if (sharedPreferencesLJI != null) {
                                    if (sharedPreferencesLJI.contains(channel)) {
                                        MetaDataItemNew metaDataItemNewLJFF = C1551330qTL.LJFF(accessKey, channel);
                                        if (metaDataItemNewLJFF != null && !metaDataItemNewLJFF.getAllowUpdate()) {
                                            metaDataItemNewLJFF.setAllowUpdate(true);
                                            C1551330qTL.LJIIJ(accessKey, channel, metaDataItemNewLJFF);
                                        }
                                    } else {
                                        C1551330qTL.LJIIJ(accessKey, channel, new MetaDataItemNew(jCurrentTimeMillis, true));
                                    }
                                }
                            }
                            z = true;
                        }
                    } else {
                        C1551330qTL.LIZ.getClass();
                        List listLIZIZ = C1551330qTL.LIZIZ(arrayList, true, false);
                        if (listLIZIZ != null && (!((ArrayList) listLIZIZ).isEmpty())) {
                            List<String> list = blockLazyUpdateSettings.allowlist;
                            if (!list.isEmpty()) {
                                for (UpdatePackage updatePackage5 : (ArrayList) listLIZIZ) {
                                    if (list.contains(updatePackage5.getChannel())) {
                                        arrayList.add(updatePackage5);
                                    } else {
                                        C19719512Dh.LIZIZ(arrayList4).add(updatePackage5);
                                    }
                                }
                            } else {
                                arrayList4 = listLIZIZ;
                            }
                        }
                    }
                    if (listener != null && !arrayList4.isEmpty()) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            listener.LJIIZILJ((UpdatePackage) it2.next(), EnumC0335009t.EXPIRED_CLEAN);
                        }
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("lazy update start, blocked channels size:");
                    sbLIZ5.append(arrayList4.size());
                    C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ5));
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    String from = optionCheckUpdateParams.getFrom();
                    if (!TextUtils.isEmpty(from)) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            ((UpdatePackage) it3.next()).setCallFrom(from);
                        }
                    }
                    try {
                        try {
                            C1552230qUn c1552230qUnLJIIIIZZ = C1551960qUM.LJIIIIZZ(this.LLJI.LIZ, optionCheckUpdateParams);
                            c1552230qUnLJIIIIZZ.setPipelineData("req_type", 5);
                            c1552230qUnLJIIIIZZ.proceed(arrayList);
                            if (listener != null) {
                                listener.LJIJJ();
                            }
                            C1553130qWF.LIZ("gecko-debug-tag", "lazy update finished");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1553130qWF.LJ("gecko-debug-tag", "lazy update failed:", e);
                            if (listener != null) {
                                listener.LJIJJ();
                            }
                            C1553130qWF.LIZ("gecko-debug-tag", "lazy update finished");
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (listener != null) {
                            listener.LJIJJ();
                        }
                        C1553130qWF.LIZ("gecko-debug-tag", "lazy update finished");
                        throw th;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LazyUpdateManager@f457.lazyUpdate$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LazyUpdateManager@f457.lazyUpdate$1");
                }
            });
        }
    }
}
