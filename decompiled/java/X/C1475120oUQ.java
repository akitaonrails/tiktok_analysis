package X;

import Y.ARunnableS1S0200200_23;
import Y.ARunnableS92S0200000_23;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.model.CDNLog;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.DataLoaderHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475120oUQ implements InterfaceC1476200oWA {
    public final EnginePreloader LIZ;
    public final C1478300oZY LIZIZ = C1478190oZN.LIZ();

    @Override // X.InterfaceC1476200oWA
    public final String LIZJ(Map<String, String> map, String str, EnumC2281151EQn enumC2281151EQn) {
        return null;
    }

    @Override // X.InterfaceC1476200oWA
    public final String LJFF(String str, EnumC2281151EQn enumC2281151EQn) {
        return null;
    }

    @Override // X.InterfaceC1476200oWA
    public final void onStartComplete() {
        this.LIZ.LJ.countDown();
        EnginePreloader enginePreloader = this.LIZ;
        enginePreloader.LJJJJLL(enginePreloader.LJJIII.isOpenDataFreeMode());
        if (C1474810oTv.LJJIII() > 0) {
            this.LIZ.getClass();
            C1469240oKw c1469240oKw = C1469230oKv.LIZ;
            c1469240oKw.LIZJ.lock();
            try {
                if (!((ArrayList) c1469240oKw.LIZIZ).isEmpty()) {
                    if (C790230UzF.LIZ.LJI()) {
                        for (Pair pair : (ArrayList) c1469240oKw.LIZIZ) {
                            if (((String) pair.first).equals("Create")) {
                                DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                                String str = (String) pair.second;
                                dataLoaderHelper.getClass();
                                C790230UzF.LIZ.LIZJ().createScene(str);
                            }
                            if (((String) pair.first).equals("MoveTo")) {
                                DataLoaderHelper dataLoaderHelper2 = C805420Vie.LIZ;
                                String str2 = (String) pair.second;
                                dataLoaderHelper2.getClass();
                                C790230UzF.LIZ.LIZJ().switchToScene(str2);
                            }
                            if (((String) pair.first).equals("Destroy")) {
                                DataLoaderHelper dataLoaderHelper3 = C805420Vie.LIZ;
                                String str3 = (String) pair.second;
                                dataLoaderHelper3.getClass();
                                C790230UzF.LIZ.LIZJ().destroyScene(str3);
                            }
                        }
                    }
                    ((ArrayList) c1469240oKw.LIZIZ).clear();
                }
                c1469240oKw.LIZJ.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1469240oKw.LIZJ.unlock();
                throw th;
            }
        }
    }

    public C1475120oUQ(EnginePreloader enginePreloader) {
        this.LIZ = enginePreloader;
    }

    @Override // X.InterfaceC1476200oWA
    public final void LIZIZ(C1475790oVV c1475790oVV) {
        String str;
        List<C1475770oVT> list = c1475790oVV.LIZIZ;
        if (list != null) {
            ArrayList<C1475760oVS> arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                for (C1475760oVS c1475760oVS : arrayList) {
                    C1475980oVo.LJFF(c1475760oVS.LIZIZ, c1475760oVS.LIZIZ(), c1475760oVS.LIZ);
                }
                C1475770oVT c1475770oVT = (C1475770oVT) ListProtector.get(list, 0);
                if (c1475770oVT != null) {
                    String str2 = c1475770oVT.LIZ;
                    long j = c1475770oVT.LIZIZ;
                    if (!TextUtils.isEmpty(str2)) {
                        String[] strArrSplit = str2.split("_");
                        if (strArrSplit != null && strArrSplit.length > 1) {
                            str = strArrSplit[0];
                        } else {
                            str = str2;
                        }
                        C1284250jWZ.LIZ.LIZ(j, c1475790oVV.LIZIZ(), str, str2);
                    }
                    C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS92S0200000_23(this, c1475770oVT, 2));
                }
            }
        }
    }

    @Override // X.InterfaceC1476200oWA
    public final void LIZLLL(JSONObject jSONObject) {
        String strJ3 = C786410Ut5.J3(jSONObject);
        if (C1475570oV9.LIZ == null) {
            C1475570oV9.LIZ = new Gson();
        }
        CDNLog cDNLog = (CDNLog) GsonProtectorUtils.fromJson(C1475570oV9.LIZ, strJ3, CDNLog.class);
        cDNLog.LIZ = 1;
        C2262431Dgv c2262431Dgv = new C2262431Dgv(cDNLog);
        if (!TextUtils.isEmpty(c2262431Dgv.LIZJ)) {
            if (!TextUtils.isEmpty(this.LIZ.LJIILIIL.get(c2262431Dgv.LIZJ))) {
                new VideoInfo().setUrl(null);
                this.LIZIZ.getPlayerEventReportService().LIZ();
                this.LIZIZ.getPlayerEventReportService().LIZIZ();
            }
            List<C2262431Dgv> arrayList = this.LIZ.LJIIL.get(c2262431Dgv.LIZJ);
            if (arrayList == null) {
                if (!TextUtils.isEmpty(c2262431Dgv.LIZJ)) {
                    arrayList = new ArrayList<>();
                    this.LIZ.LJIIL.put(c2262431Dgv.LIZJ, arrayList);
                    arrayList.add(c2262431Dgv);
                }
            } else {
                arrayList.add(c2262431Dgv);
            }
            this.LIZIZ.getPlayerEventReportService().LIZJ();
        }
    }

    @Override // X.InterfaceC1476200oWA
    public final HashMap<String, String> LJII(String str) {
        Map<String, String> requestHeader;
        if (((Boolean) C1474810oTv.LLLLIILLL.getValue()).booleanValue()) {
            Map<String, String> requestHeader2 = this.LIZIZ.getRequestHeader(str);
            if (requestHeader2.isEmpty()) {
                return null;
            }
            return new HashMap<>(requestHeader2);
        }
        if (((Boolean) C1474810oTv.LLLF.getValue()).booleanValue() || (requestHeader = this.LIZIZ.getNetClient().getRequestHeader(str)) == null || requestHeader.isEmpty()) {
            return null;
        }
        return new HashMap<>(requestHeader);
    }

    @Override // X.InterfaceC1476200oWA
    public final void LJIIIIZZ(C1475430oUv c1475430oUv) {
        Object objLJIILJJIL;
        String str;
        String str2;
        boolean z;
        C1475400oUs c1475400oUs;
        C1475510oV3 c1475510oV3;
        SimVideoUrlModel simVideoUrlModel;
        String str3;
        C1475980oVo.LJFF(c1475430oUv.LIZLLL, c1475430oUv.LJ, c1475430oUv.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wrg_test_task onTaskProgress: type ");
        sbLIZ.append(c1475430oUv.LJIIIIZZ);
        sbLIZ.append(", key ");
        sbLIZ.append(c1475430oUv.LIZ);
        sbLIZ.append(", videoId ");
        sbLIZ.append(c1475430oUv.LIZIZ);
        sbLIZ.append(", resolution ");
        sbLIZ.append(c1475430oUv.LJFF);
        sbLIZ.append(", media size:");
        sbLIZ.append(c1475430oUv.LIZLLL);
        sbLIZ.append(", cacheSize:");
        sbLIZ.append(c1475430oUv.LJ);
        sbLIZ.append(", mLocalFilePath:");
        sbLIZ.append(c1475430oUv.LIZJ);
        sbLIZ.append(", mDecryptionKey:");
        sbLIZ.append(c1475430oUv.LJI);
        sbLIZ.append(", mUsingVideoInfo media info :");
        C1474520oTS c1474520oTS = c1475430oUv.LJII;
        Object objLJIILIIL = "null";
        if (c1474520oTS == null) {
            objLJIILJJIL = "null";
        } else {
            objLJIILJJIL = c1474520oTS.LJIILJJIL();
        }
        sbLIZ.append(objLJIILJJIL);
        sbLIZ.append(", mUsingVideoInfo bash info :");
        C1474520oTS c1474520oTS2 = c1475430oUv.LJII;
        if (c1474520oTS2 != null) {
            objLJIILIIL = c1474520oTS2.LJIILIIL();
        }
        sbLIZ.append(objLJIILIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        String str4 = c1475430oUv.LIZ;
        long j = c1475430oUv.LIZLLL;
        long j2 = c1475430oUv.LJ;
        boolean z2 = true;
        if (!TextUtils.isEmpty(str4)) {
            String[] strArrSplit = str4.split("_");
            if (strArrSplit != null && strArrSplit.length > 1) {
                str3 = strArrSplit[0];
            } else {
                str3 = str4;
            }
            C1284250jWZ.LIZ.LIZ(j, j2, str3, str4);
        }
        String str5 = c1475430oUv.LIZ;
        String sourceId = null;
        if ((str5 == null || ((ConcurrentHashMap) this.LIZ.LJIJI).get(str5) == null) && (str = c1475430oUv.LIZIZ) != null && ((ConcurrentHashMap) this.LIZ.LJIJI).get(str) != null) {
            str5 = c1475430oUv.LIZIZ;
        }
        if (str5 != null && (simVideoUrlModel = (SimVideoUrlModel) ((ConcurrentHashMap) this.LIZ.LJIJJLI).get(str5)) != null) {
            sourceId = simVideoUrlModel.getSourceId();
        }
        if (TextUtils.isEmpty(sourceId)) {
            sourceId = str5;
        }
        if (str5 == null || (str2 = c1475430oUv.LIZ) == null) {
            return;
        }
        EnginePreloader enginePreloader = this.LIZ;
        if (enginePreloader.LJJIIJ && (c1475510oV3 = (C1475510oV3) ((ConcurrentHashMap) enginePreloader.LJIJJ).get(str2)) != null && c1475510oV3.LIZIZ == j2 && c1475510oV3.LIZ == j) {
            return;
        }
        ((ConcurrentHashMap) this.LIZ.LJIJJ).put(str2, new C1475510oV3(j, j2));
        Integer num = (Integer) ((ConcurrentHashMap) this.LIZ.LJIJI).get(str5);
        C1475000oUE.LIZIZ().isDebug();
        if (j == j2 && j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (num != null) {
            if (num.intValue() > j2) {
                z2 = false;
            }
            if (!z && !z2) {
                EnginePreloader enginePreloader2 = this.LIZ;
                ((ConcurrentHashMap) enginePreloader2.LJIJI).remove(str5);
                SimVideoUrlModel simVideoUrlModel2 = (SimVideoUrlModel) ((ConcurrentHashMap) enginePreloader2.LJIJJLI).remove(str5);
                if (simVideoUrlModel2 != null) {
                    Iterator it2 = ((CopyOnWriteArrayList) enginePreloader2.LJIILLIIL).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1475290oUh) it2.next()).LJFF(simVideoUrlModel2);
                    }
                }
            } else {
                EnginePreloader enginePreloader3 = this.LIZ;
                ((ConcurrentHashMap) enginePreloader3.LJIJI).remove(str5);
                Object objRemove = ((ConcurrentHashMap) enginePreloader3.LJIJJLI).remove(str5);
                if (objRemove != null) {
                    for (InterfaceC1475290oUh interfaceC1475290oUh : (CopyOnWriteArrayList) enginePreloader3.LJIILLIIL) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(enginePreloader3.LJIIZILJ);
                        sbLIZ2.append(File.separator);
                        sbLIZ2.append(str5);
                        interfaceC1475290oUh.LIZJ(Pair.create(objRemove, C2188811AlT.LIZIZ(sbLIZ2)));
                    }
                }
            }
        }
        if (C1474810oTv.LL() > 0 && (c1475400oUs = C1475230oUb.LIZ.get(sourceId)) != null) {
            c1475400oUs.LIZ = false;
        }
        C786410Ut5.LJJZZIII(C1475000oUE.LJ, new ARunnableS1S0200200_23(this, c1475430oUv, j, j2, 0));
    }

    @Override // X.InterfaceC1476200oWA
    public final String getCheckSumInfo(String str) {
        C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
        c1477400oY6.getClass();
        if (!TextUtils.isEmpty(str)) {
            return c1477400oY6.LIZJ.get(str);
        }
        return "";
    }

    @Override // X.InterfaceC1476200oWA
    public final boolean loadLibrary(String str) {
        this.LIZIZ.getVideoCachePlugin().LIZIZ();
        return false;
    }

    @Override // X.InterfaceC1476200oWA
    public final void LIZ(String str, JSONObject jSONObject) {
        if (!C1474810oTv.LJJIIJZLJL()) {
            return;
        }
        C1475000oUE.LJIIIIZZ().monitorCommonLog(str, jSONObject);
    }

    @Override // X.InterfaceC1476200oWA
    public final void LJI(int i, String str, JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLogInfo what:");
        sbLIZ.append(i);
        sbLIZ.append(", logType:");
        sbLIZ.append(str);
        sbLIZ.append(", log:");
        sbLIZ.append(jSONObject);
        C2188811AlT.LIZIZ(sbLIZ);
        C1475000oUE.LIZIZ().isDebug();
        try {
            String strLIZIZ = this.LIZIZ.getAppLog().LIZIZ();
            if (jSONObject != null && !TextUtils.isEmpty(strLIZIZ)) {
                jSONObject.put("session_id", strLIZIZ);
            }
            if (C1475000oUE.LIZ().isEnabled() && jSONObject != null) {
                C1475000oUE.LIZ().e(str, C786410Ut5.J3(jSONObject));
            }
            this.LIZIZ.getAppLog().recordMiscLog(C1475000oUE.LIZ, str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (jSONObject != null && i == 0) {
            try {
                long jOptLong = jSONObject.optLong("loader_download_size", 0L);
                String str2 = "";
                int iOptInt = jSONObject.optInt("task_type");
                if (iOptInt == 1) {
                    str2 = "play";
                } else if (iOptInt == 2) {
                    str2 = "preload";
                }
                if (!TextUtils.isEmpty(str2) && jOptLong > 0) {
                    C793770VBv.LJIJ(jOptLong, str2, "video", str2);
                    if (C308260C6m.LIZ()) {
                        C0X4T.LJ(jOptLong, str2);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    @Override // X.InterfaceC1476200oWA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final int r20, final long r21, final long r23, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1475120oUQ.LJ(int, long, long, java.lang.String):void");
    }
}
