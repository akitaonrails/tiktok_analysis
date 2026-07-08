package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.exp.MinisParallelPreloadConfig;
import com.ss.android.ugc.aweme.minis.exp.MinisParallelPreloadExpConfig;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.MinisPkg;
import com.ss.android.ugc.aweme.minis.model.MinisPkgConfig;
import com.ss.android.ugc.aweme.minis.model.PreloadSubpackageInfo;
import com.ss.android.ugc.aweme.minis.performance.video.MinisVideoPreloadFetcher;
import com.ss.android.ugc.aweme.minis.settings.MinisPerfConfigSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196801AyM {
    public static final C2196801AyM LIZ = new C2196801AyM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(187));

    public static String LIZ(EnumC2196771AyJ enumC2196771AyJ) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_preload_at-");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (a0.LJJJIL(curUserId)) {
            curUserId = CardStruct.IStatusCode.DEFAULT;
        }
        sbLIZ.append(curUserId);
        sbLIZ.append('-');
        sbLIZ.append(enumC2196771AyJ.getScene());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(EnumC2196771AyJ enumC2196771AyJ, List list, C2196751AyH c2196751AyH) {
        boolean z;
        C2189341AmK.LIZ.getClass();
        if (C2189341AmK.LIZIZ) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPreload, scene:");
        sbLIZ.append(enumC2196771AyJ);
        sbLIZ.append(", schemaCount:");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        KevaImpl.getRepo("minis_preload_throttle", 1).storeLong(LIZ(enumC2196771AyJ), System.currentTimeMillis());
        C2390209Ye c2390209Ye = new C2390209Ye(list, new C09YZ());
        if (c2196751AyH.LJII) {
            C19719612Di.LJJII(c2390209Ye.LIZJ, new C09YW[]{new C09YW() { // from class: X.09YU
                @Override // X.C09YW
                public final Object LIZ(C2390309Yf c2390309Yf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    SchemaParserData next;
                    List<SchemaParserData> list2 = c2390309Yf.LIZ;
                    boolean z2 = MinisPerfConfigSettings.LIZ().videoPreloadEnable;
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preloadVideoResourceByScene, value:");
                    sbLIZ2.append(MinisPerfConfigSettings.LIZ());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (z2 && list2 != null) {
                        Iterator<SchemaParserData> it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                String str = next.videoResourcePreloadUrl;
                                if (str != null && str.length() != 0) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        SchemaParserData schemaParserData = next;
                        if (schemaParserData != null) {
                            MinisVideoPreloadFetcher.Companion.getClass();
                            C1529420pu0.LIZ(schemaParserData);
                            C844470XAv.LIZ.getClass();
                            C09V3.LIZ(C844470XAv.LIZ(), schemaParserData);
                        }
                    }
                    return Unit.LIZ;
                }
            }});
        }
        if (c2196751AyH.LJFF) {
            c2390209Ye.LIZ(new C2196821AyO());
        }
        C2196881AyU.LIZ.getClass();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MinisParallelPreloadConfig minisParallelPreloadConfig = C2196881AyU.LIZIZ;
        MinisParallelPreloadConfig minisParallelPreloadConfig2 = (MinisParallelPreloadConfig) settingsManagerLIZLLL.LJIIIIZZ("minis_parallel_preload_subpackages_settings", MinisParallelPreloadConfig.class, minisParallelPreloadConfig);
        if (minisParallelPreloadConfig2 != null) {
            minisParallelPreloadConfig = minisParallelPreloadConfig2;
        }
        boolean z2 = minisParallelPreloadConfig.enable;
        if (z2 && c2196751AyH.LJIIIIZZ) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("subpackages check, configEnable:");
        sbLIZ2.append(c2196751AyH.LJIIIIZZ);
        sbLIZ2.append(", settingsEnable:");
        sbLIZ2.append(z2);
        sbLIZ2.append(", subpkgEnabled:");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (z) {
            boolean z3 = c2196751AyH.LIZIZ;
            if (z3 || c2196751AyH.LIZJ) {
                if (enumC2196771AyJ == EnumC2196771AyJ.ADS) {
                    if (((Number) C297050Bkd.LIZ.getValue()).intValue() == 1) {
                        c2390209Ye.LIZ(new C2196811AyN(c2196751AyH.LIZIZ, z));
                    }
                } else {
                    c2390209Ye.LIZ(new C2196811AyN(z3, z));
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C09YW() { // from class: X.09YS
                @Override // X.C09YW
                public final Object LIZ(C2390309Yf c2390309Yf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                    MinisMetaResp next;
                    MinisPkg minisPkg;
                    int i2;
                    Integer numLJIIJJI;
                    MinisPkg minisPkg2;
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("execute, schemaCount:");
                    sbLIZ3.append(c2390309Yf.LIZ.size());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    for (SchemaParserData schemaParserData : c2390309Yf.LIZ) {
                        String str = schemaParserData.clientKey;
                        if (str != null) {
                            List<MinisMetaResp> list2 = c2390309Yf.LIZIZ;
                            if (list2 != null) {
                                Iterator<MinisMetaResp> it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (Intrinsics.LJFF(str, next.clientKey)) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                MinisMetaResp minisMetaResp = next;
                                if (minisMetaResp != null) {
                                    String str2 = minisMetaResp.packageConfig;
                                    if (str2 != null && str2.length() != 0) {
                                        try {
                                            C1227904rF c1227904rF = C1227904rF.LIZ;
                                            String str3 = minisMetaResp.packageConfig;
                                            c1227904rF.getClass();
                                            MinisPkgConfig minisPkgConfig = (MinisPkgConfig) C1227904rF.LIZIZ(str3, MinisPkgConfig.class);
                                            if (minisPkgConfig != null) {
                                                String strLJII = schemaParserData.LJII();
                                                Map<String, MinisPkg> map = minisPkgConfig.packages;
                                                if (map != null && (minisPkg = map.get(strLJII)) != null) {
                                                    List<PreloadSubpackageInfo> list3 = minisPkg.parallelPreloadSubpackages;
                                                    if (list3 != null && !list3.isEmpty()) {
                                                        C1895207ba.LIZ.getClass();
                                                        SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
                                                        MinisParallelPreloadExpConfig minisParallelPreloadExpConfig = C1895207ba.LIZIZ;
                                                        MinisParallelPreloadExpConfig minisParallelPreloadExpConfig2 = (MinisParallelPreloadExpConfig) settingsManagerLIZLLL2.LJIIIIZZ("minis_parallel_preload_subpackages_exp", MinisParallelPreloadExpConfig.class, minisParallelPreloadExpConfig);
                                                        if (minisParallelPreloadExpConfig2 != null) {
                                                            minisParallelPreloadExpConfig = minisParallelPreloadExpConfig2;
                                                        }
                                                        int i4 = C2187451AjH.LIZ;
                                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                        sbLIZ4.append("clientKey:");
                                                        sbLIZ4.append(str);
                                                        sbLIZ4.append(", strategy:");
                                                        sbLIZ4.append(minisParallelPreloadExpConfig.strategy);
                                                        sbLIZ4.append(", subpackageCount:");
                                                        sbLIZ4.append(list3.size());
                                                        C2188811AlT.LIZIZ(sbLIZ4);
                                                        int i5 = minisParallelPreloadExpConfig.strategy;
                                                        if (i5 != 0) {
                                                            if (i5 == 1) {
                                                                ArrayList arrayList2 = new ArrayList();
                                                                for (PreloadSubpackageInfo preloadSubpackageInfo : list3) {
                                                                    if (preloadSubpackageInfo.isStartup) {
                                                                        arrayList2.add(preloadSubpackageInfo);
                                                                    }
                                                                }
                                                                list3 = arrayList2;
                                                            }
                                                            int i6 = C2187451AjH.LIZ;
                                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                            sbLIZ5.append("clientKey:");
                                                            sbLIZ5.append(str);
                                                            sbLIZ5.append(", filteredCount:");
                                                            sbLIZ5.append(list3.size());
                                                            C2188811AlT.LIZIZ(sbLIZ5);
                                                            boolean zLJI = C804420Vh2.LJI(contextLIZ);
                                                            if (zLJI) {
                                                                i2 = minisParallelPreloadExpConfig.wifiSize;
                                                            } else {
                                                                i2 = minisParallelPreloadExpConfig.noWifiSize;
                                                            }
                                                            Iterator<PreloadSubpackageInfo> it3 = list3.iterator();
                                                            int iIntValue = 0;
                                                            int i7 = 0;
                                                            int i8 = 0;
                                                            while (true) {
                                                                if (!it3.hasNext()) {
                                                                    break;
                                                                }
                                                                PreloadSubpackageInfo next2 = it3.next();
                                                                String str4 = next2.subPkgName;
                                                                if (str4 != null && str4.length() != 0) {
                                                                    String str5 = next2.size;
                                                                    if (str5 != null) {
                                                                        numLJIIJJI = C2095008Iq.LJIIJJI(str5);
                                                                    } else {
                                                                        numLJIIJJI = null;
                                                                    }
                                                                    if (numLJIIJJI == null) {
                                                                        int i9 = C2187451AjH.LIZ;
                                                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                                                        sbLIZ6.append("invalid size, clientKey:");
                                                                        sbLIZ6.append(str);
                                                                        sbLIZ6.append(", subPkgName:");
                                                                        sbLIZ6.append(str4);
                                                                        sbLIZ6.append(", rawSize:");
                                                                        sbLIZ6.append(next2.size);
                                                                        C2188811AlT.LIZIZ(sbLIZ6);
                                                                    } else {
                                                                        Map<String, MinisPkg> map2 = minisPkgConfig.packages;
                                                                        if (map2 != null && (minisPkg2 = map2.get(str4)) != null) {
                                                                            C2390509Yh.LIZ.getClass();
                                                                            if (C2390509Yh.LJIJJ(str, minisPkgConfig, str4)) {
                                                                                i7++;
                                                                            } else {
                                                                                if (numLJIIJJI.intValue() + iIntValue > i2) {
                                                                                    int i10 = C2187451AjH.LIZ;
                                                                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                                                                    sbLIZ7.append("size limit reached, clientKey:");
                                                                                    sbLIZ7.append(str);
                                                                                    sbLIZ7.append(", accumulated:");
                                                                                    sbLIZ7.append(iIntValue);
                                                                                    sbLIZ7.append("KB, nextSize:");
                                                                                    sbLIZ7.append(numLJIIJJI);
                                                                                    sbLIZ7.append("KB, limit:");
                                                                                    sbLIZ7.append(i2);
                                                                                    sbLIZ7.append("KB");
                                                                                    C2188811AlT.LIZIZ(sbLIZ7);
                                                                                    break;
                                                                                }
                                                                                contextLIZ = contextLIZ;
                                                                                try {
                                                                                    if (C2390509Yh.LJII(contextLIZ, str, minisPkgConfig, str4, minisPkg2, schemaParserData, true)) {
                                                                                        iIntValue += numLJIIJJI.intValue();
                                                                                        i8++;
                                                                                        try {
                                                                                            int i11 = C2187451AjH.LIZ;
                                                                                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                                                                            sbLIZ8.append("download success, clientKey:");
                                                                                            sbLIZ8.append(str);
                                                                                            sbLIZ8.append(", subPkgName:");
                                                                                            sbLIZ8.append(str4);
                                                                                            sbLIZ8.append(", size:");
                                                                                            sbLIZ8.append(numLJIIJJI);
                                                                                            sbLIZ8.append("KB, accumulated:");
                                                                                            sbLIZ8.append(iIntValue);
                                                                                            sbLIZ8.append("KB");
                                                                                            C2188811AlT.LIZIZ(sbLIZ8);
                                                                                        } catch (Exception e) {
                                                                                            e = e;
                                                                                            TryCatchGuardChecker.doCheck(e);
                                                                                            int i12 = C2187451AjH.LIZ;
                                                                                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                                                                            sbLIZ9.append("download exception, clientKey:");
                                                                                            sbLIZ9.append(str);
                                                                                            sbLIZ9.append(", subPkgName:");
                                                                                            sbLIZ9.append(str4);
                                                                                            sbLIZ9.append(", error:");
                                                                                            sbLIZ9.append(e.getMessage());
                                                                                            C2188811AlT.LIZIZ(sbLIZ9);
                                                                                        }
                                                                                    } else {
                                                                                        try {
                                                                                            int i13 = C2187451AjH.LIZ;
                                                                                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                                                                            sbLIZ10.append("download failed, clientKey:");
                                                                                            sbLIZ10.append(str);
                                                                                            sbLIZ10.append(", subPkgName:");
                                                                                            sbLIZ10.append(str4);
                                                                                            C2188811AlT.LIZIZ(sbLIZ10);
                                                                                        } catch (Exception e2) {
                                                                                            e = e2;
                                                                                            TryCatchGuardChecker.doCheck(e);
                                                                                            int i122 = C2187451AjH.LIZ;
                                                                                            StringBuilder sbLIZ92 = C2188811AlT.LIZ();
                                                                                            sbLIZ92.append("download exception, clientKey:");
                                                                                            sbLIZ92.append(str);
                                                                                            sbLIZ92.append(", subPkgName:");
                                                                                            sbLIZ92.append(str4);
                                                                                            sbLIZ92.append(", error:");
                                                                                            sbLIZ92.append(e.getMessage());
                                                                                            C2188811AlT.LIZIZ(sbLIZ92);
                                                                                        }
                                                                                    }
                                                                                } catch (Exception e3) {
                                                                                    e = e3;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i14 = C2187451AjH.LIZ;
                                                                            StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                                                            sbLIZ11.append("subPkg not in packages map, clientKey:");
                                                                            sbLIZ11.append(str);
                                                                            sbLIZ11.append(", subPkgName:");
                                                                            sbLIZ11.append(str4);
                                                                            C2188811AlT.LIZIZ(sbLIZ11);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            int i15 = C2187451AjH.LIZ;
                                                            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                                            sbLIZ12.append("done, clientKey:");
                                                            sbLIZ12.append(str);
                                                            sbLIZ12.append(", downloaded:");
                                                            sbLIZ12.append(i8);
                                                            sbLIZ12.append(", skippedCached:");
                                                            sbLIZ12.append(i7);
                                                            sbLIZ12.append(", totalSize:");
                                                            sbLIZ12.append(iIntValue);
                                                            sbLIZ12.append("KB, isWifi:");
                                                            sbLIZ12.append(zLJI);
                                                            sbLIZ12.append(", limit:");
                                                            sbLIZ12.append(i2);
                                                            sbLIZ12.append("KB");
                                                            C2188811AlT.LIZIZ(sbLIZ12);
                                                        }
                                                    }
                                                } else {
                                                    int i16 = C2187451AjH.LIZ;
                                                    StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                                                    sbLIZ13.append("entry pkg not found, clientKey:");
                                                    sbLIZ13.append(str);
                                                    sbLIZ13.append(", entryPkgName:");
                                                    sbLIZ13.append(strLJII);
                                                    C2188811AlT.LIZIZ(sbLIZ13);
                                                }
                                            }
                                        } catch (Exception e4) {
                                            TryCatchGuardChecker.doCheck(e4);
                                            int i17 = C2187451AjH.LIZ;
                                            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                                            sbLIZ14.append("packageConfig parse failed, clientKey:");
                                            sbLIZ14.append(str);
                                            sbLIZ14.append(", error:");
                                            sbLIZ14.append(e4.getMessage());
                                            C2188811AlT.LIZIZ(sbLIZ14);
                                        }
                                    }
                                }
                            }
                            int i18 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                            sbLIZ15.append("meta not found, clientKey:");
                            sbLIZ15.append(str);
                            C2188811AlT.LIZIZ(sbLIZ15);
                        }
                    }
                    return Unit.LIZ;
                }
            });
            if (c2196751AyH.LJI) {
                arrayList.add(new C09YW() { // from class: X.09Yg
                    @Override // X.C09YW
                    public final Object LIZ(C2390309Yf c2390309Yf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        MinisMetaResp next;
                        String str;
                        List<SchemaParserData> list2 = c2390309Yf.LIZ;
                        List<MinisMetaResp> list3 = c2390309Yf.LIZIZ;
                        boolean z4 = MinisPerfConfigSettings.LIZ().mainFramePreloadEnable;
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("preloadMainFrameByScene, value:");
                        sbLIZ3.append(MinisPerfConfigSettings.LIZ());
                        C2188811AlT.LIZIZ(sbLIZ3);
                        if (z4 && list2 != null) {
                            for (SchemaParserData schemaParserData : list2) {
                                if (list3 != null) {
                                    Iterator<MinisMetaResp> it2 = list3.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (Intrinsics.LJFF(schemaParserData.clientKey, next.clientKey)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    MinisMetaResp minisMetaResp = next;
                                    if (minisMetaResp == null || (str = minisMetaResp.packageConfig) == null || str.length() == 0) {
                                    }
                                }
                                if (schemaParserData.clientKey != null) {
                                    C1549060qPg.LIZIZ(schemaParserData);
                                    C1549060qPg.LIZ(schemaParserData);
                                }
                            }
                        }
                        return Unit.LIZ;
                    }
                });
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C13LE.LIZ(it2.next().getClass()).LJI());
            }
            int i2 = C2187451AjH.LIZ;
            arrayList2.toString();
            C09YW[] c09ywArr = (C09YW[]) arrayList.toArray(new C09YW[0]);
            c2390209Ye.LIZ((C09YW[]) Arrays.copyOf(c09ywArr, c09ywArr.length));
        } else {
            ArrayList arrayList3 = new ArrayList();
            boolean z4 = c2196751AyH.LIZIZ;
            if (z4 || c2196751AyH.LIZJ) {
                if (enumC2196771AyJ == EnumC2196771AyJ.ADS) {
                    if (((Number) C297050Bkd.LIZ.getValue()).intValue() == 1) {
                        arrayList3.add(new C2196811AyN(c2196751AyH.LIZIZ));
                    }
                } else {
                    arrayList3.add(new C2196811AyN(z4));
                }
            }
            if (c2196751AyH.LJI) {
                arrayList3.add(new C09YW() { // from class: X.09Yg
                    @Override // X.C09YW
                    public final Object LIZ(C2390309Yf c2390309Yf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                        MinisMetaResp next;
                        String str;
                        List<SchemaParserData> list2 = c2390309Yf.LIZ;
                        List<MinisMetaResp> list3 = c2390309Yf.LIZIZ;
                        boolean z42 = MinisPerfConfigSettings.LIZ().mainFramePreloadEnable;
                        int i22 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("preloadMainFrameByScene, value:");
                        sbLIZ3.append(MinisPerfConfigSettings.LIZ());
                        C2188811AlT.LIZIZ(sbLIZ3);
                        if (z42 && list2 != null) {
                            for (SchemaParserData schemaParserData : list2) {
                                if (list3 != null) {
                                    Iterator<MinisMetaResp> it22 = list3.iterator();
                                    while (true) {
                                        if (it22.hasNext()) {
                                            next = it22.next();
                                            if (Intrinsics.LJFF(schemaParserData.clientKey, next.clientKey)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    MinisMetaResp minisMetaResp = next;
                                    if (minisMetaResp == null || (str = minisMetaResp.packageConfig) == null || str.length() == 0) {
                                    }
                                }
                                if (schemaParserData.clientKey != null) {
                                    C1549060qPg.LIZIZ(schemaParserData);
                                    C1549060qPg.LIZ(schemaParserData);
                                }
                            }
                        }
                        return Unit.LIZ;
                    }
                });
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(C13LE.LIZ(it3.next().getClass()).LJI());
            }
            int i3 = C2187451AjH.LIZ;
            arrayList4.toString();
            if (!arrayList3.isEmpty()) {
                C09YW[] c09ywArr2 = (C09YW[]) arrayList3.toArray(new C09YW[0]);
                c2390209Ye.LIZ((C09YW[]) Arrays.copyOf(c09ywArr2, c09ywArr2.length));
            }
        }
        C01GW c01gw = C315120CWw.LIZIZ;
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) c01gw.getValue();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, c1dfh, null, new C2390109Yd(c2390209Ye, null), 2);
        C23250099c.LIZLLL((InterfaceC497601wk) c01gw.getValue(), c1dfh, null, new C2389909Yb(c2390209Ye, c2390209Ye.LIZLLL, null), 2);
    }

    public static final void LIZIZ(AtomicBoolean atomicBoolean, int i, int i2, C259800zU<InterfaceC1702110uOX> c259800zU, C259800zU<C1BC3> c259800zU2, EnumC2196771AyJ enumC2196771AyJ, C259800zU<List<SchemaParserData>> c259800zU3, C2196751AyH c2196751AyH) {
        if (atomicBoolean.get() || C1BCA.LIZLLL().LIZ.getScore() < i || C1BCA.LJIILIIL().LIZ.getScore() < i2 || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        InterfaceC1702110uOX interfaceC1702110uOX = c259800zU.element;
        if (interfaceC1702110uOX != null) {
            C1BCA.LJJIJ(interfaceC1702110uOX);
        }
        C1BC3 c1bc3 = c259800zU2.element;
        if (c1bc3 != null) {
            C1BCA.LJJIJL(c1bc3);
        }
        C2196801AyM c2196801AyM = LIZ;
        List<SchemaParserData> list = c259800zU3.element;
        c2196801AyM.getClass();
        LIZJ(enumC2196771AyJ, list, c2196751AyH);
    }
}
