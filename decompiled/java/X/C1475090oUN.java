package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475090oUN {
    public final EnginePreloader LIZ;
    public final C1478300oZY LIZIZ = C1478190oZN.LIZ();

    public C1475090oUN(EnginePreloader enginePreloader) {
        this.LIZ = enginePreloader;
    }

    public final void LJ(String str, List list) {
        int size;
        String str2;
        String str3;
        String str4;
        Collection collection;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshPreloadMediasImp:");
        if (list == null) {
            size = -1;
        } else {
            size = list.size();
        }
        sbLIZ.append(size);
        sbLIZ.append(", scene:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (list != null && list.size() != 0) {
            this.LIZ.getClass();
            if (C1474810oTv.LJLLLLLL() && ((str4 = C1469230oKv.LIZ.LIZ) == null || !str4.equals(str))) {
                if (((Boolean) C1474810oTv.Y4.getValue()).booleanValue() && (collection = (Collection) ((HashMap) this.LIZ.LJJI).get(str)) != null) {
                    list.addAll(collection);
                }
                ((HashMap) this.LIZ.LJJI).put(str, list);
                return;
            }
            DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
            dataLoaderHelper.getClass();
            if (C1474810oTv.LJJIFFI()) {
                dataLoaderHelper.LJLIIIL.getClass();
                if (!list.isEmpty()) {
                    if (str == null) {
                        str3 = C1469230oKv.LIZ.LIZ;
                    } else {
                        str3 = str;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C1475280oUg c1475280oUg = (C1475280oUg) it2.next();
                        if ((c1475280oUg instanceof C1475130oUR) && C1475470oUz.LIZLLL((C1475130oUR) c1475280oUg)) {
                            c1475280oUg.LIZIZ = str3;
                            arrayList.add(c1475280oUg);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        C1475470oUz.LJFF(arrayList, str3, dataLoaderHelper);
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[preload] refresh preload mediaList size = ");
                        sbLIZ2.append(list.size());
                        sbLIZ2.append(" modelMediaList size = ");
                        sbLIZ2.append(arrayList.size());
                        sbLIZ2.append(" sceneId = ");
                        sbLIZ2.append(str3);
                        C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            } else if (!list.isEmpty()) {
                if (str == null) {
                    str2 = C1469230oKv.LIZ.LIZ;
                } else {
                    str2 = str;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C1475280oUg c1475280oUg2 = (C1475280oUg) it3.next();
                    if ((c1475280oUg2 instanceof C1475130oUR) && DataLoaderHelper.LJIIIZ((C1475130oUR) c1475280oUg2)) {
                        c1475280oUg2.LIZIZ = str2;
                        arrayList2.add(c1475280oUg2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    if (C1474810oTv.LJJIFFI()) {
                        dataLoaderHelper.LJLIIIL.getClass();
                        C1475470oUz.LJFF(arrayList2, str2, dataLoaderHelper);
                    } else if (!arrayList2.isEmpty()) {
                        if (dataLoaderHelper.LJJIJLIJ != null) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(dataLoaderHelper);
                            arrayList3.add(arrayList2);
                            arrayList3.add(str2);
                            dataLoaderHelper.LJJIJLIJ.LIZ(117, arrayList3);
                        } else {
                            dataLoaderHelper.LJI(str2, arrayList2);
                        }
                    }
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[preload] refresh preload mediaList size = ");
                    sbLIZ3.append(list.size());
                    sbLIZ3.append(" modelMediaList size = ");
                    sbLIZ3.append(arrayList2.size());
                    sbLIZ3.append(" sceneId = ");
                    sbLIZ3.append(str2);
                    C1471660oOq.LIZJ("DataLoaderHelper", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            TTVideoEngine.LJIIJJI(31224, str);
        }
    }

    public final void LIZIZ(C1475130oUR c1475130oUR, C0NI4 c0ni4, SimVideoUrlModel simVideoUrlModel) {
        int i;
        String strLJJLL;
        if (c1475130oUR != null) {
            if (c0ni4 != null) {
                int i2 = c0ni4.LIZ;
                if (i2 > 0) {
                    c1475130oUR.LIZ = i2;
                }
                int i3 = C591530NHz.LIZ[c0ni4.LIZIZ.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        i = 0;
                    } else {
                        i = 10;
                    }
                } else {
                    i = 100;
                }
                c1475130oUR.LJII = i;
                C0NIL c0nil = c0ni4.LIZJ;
                if (c0nil != null) {
                    if (!TextUtils.isEmpty(c0nil.LIZIZ)) {
                        strLJJLL = c0nil.LIZIZ;
                    } else {
                        strLJJLL = this.LIZ.LJJLL(c0nil.LIZ);
                    }
                    c1475130oUR.LJIIIIZZ = strLJJLL;
                    c1475130oUR.LJIIIZ = c0nil.LIZJ;
                }
            }
            c1475130oUR.LIZJ = new C1475200oUY(this, simVideoUrlModel, c0ni4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1475130oUR LIZJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r24, X.InterfaceC1475250oUd r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1475090oUN.LIZJ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, X.0oUd, java.lang.String):X.0oUR");
    }

    public final List LIZLLL(String str, List list, boolean z) {
        int size;
        int size2;
        List<SimVideoUrlModel> arrayList;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPreloadMedias:");
        if (list == null) {
            size = -1;
        } else {
            size = list.size();
        }
        sbLIZ.append(size);
        sbLIZ.append(", scene:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList2 = new ArrayList();
        if (list != null && list.size() > 0) {
            InterfaceC1475250oUd interfaceC1475250oUdCreateVideoUrlProcessor = this.LIZIZ.createVideoUrlProcessor();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) it2.next();
                C1475130oUR c1475130oURLIZJ = LIZJ(simVideoUrlModel, interfaceC1475250oUdCreateVideoUrlProcessor, str);
                if (c1475130oURLIZJ != null && simVideoUrlModel != null) {
                    LIZIZ(c1475130oURLIZJ, simVideoUrlModel.getPreloadTaskInfo(), simVideoUrlModel);
                    arrayList2.add(c1475130oURLIZJ);
                }
            }
        }
        C1476580oWm c1476580oWm = C1474710oTl.LIZ;
        c1476580oWm.getClass();
        if (!TextUtils.isEmpty(str)) {
            if (list != null && !list.isEmpty()) {
                arrayList = list;
            } else {
                arrayList = new ArrayList();
            }
            C1475240oUc c1475240oUc = (C1475240oUc) ((ConcurrentHashMap) c1476580oWm.LIZ).get(str);
            if (c1475240oUc == null) {
                c1475240oUc = new C1475240oUc();
                ((ConcurrentHashMap) c1476580oWm.LIZ).put(str, c1475240oUc);
            }
            if (z) {
                ((ConcurrentHashMap) c1475240oUc.LIZIZ).clear();
                ((ConcurrentHashMap) c1475240oUc.LIZJ).clear();
                ((CopyOnWriteArrayList) c1475240oUc.LIZ).clear();
            }
            for (SimVideoUrlModel simVideoUrlModel2 : arrayList) {
                if (simVideoUrlModel2 != null) {
                    ((CopyOnWriteArrayList) c1475240oUc.LIZ).add(simVideoUrlModel2);
                    if (!TextUtils.isEmpty(simVideoUrlModel2.getSourceId())) {
                        ((ConcurrentHashMap) c1475240oUc.LIZIZ).put(simVideoUrlModel2.getSourceId(), simVideoUrlModel2);
                    }
                    if (simVideoUrlModel2.hasVideoModel()) {
                        String strLJIIJJI = C1477400oY6.LJJJJI.LJIIJJI(simVideoUrlModel2.getSourceId());
                        if (TextUtils.isEmpty(strLJIIJJI)) {
                            strLJIIJJI = simVideoUrlModel2.getOriginUri();
                        }
                        if (!TextUtils.isEmpty(strLJIIJJI)) {
                            ((ConcurrentHashMap) c1475240oUc.LIZIZ).put(strLJIIJJI, simVideoUrlModel2);
                        }
                    }
                    if (!TextUtils.isEmpty(simVideoUrlModel2.getOriginUri())) {
                        ((ConcurrentHashMap) c1475240oUc.LIZJ).put(simVideoUrlModel2.getOriginUri(), simVideoUrlModel2);
                    }
                }
            }
        }
        EnginePreloader enginePreloader = this.LIZ;
        if (list == null) {
            enginePreloader.getClass();
        } else {
            enginePreloader.LJJIFFI = enginePreloader.LJJII;
            enginePreloader.LJJII = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                SimVideoUrlModel simVideoUrlModel3 = (SimVideoUrlModel) ListProtector.get(list, i);
                if (simVideoUrlModel3 != null) {
                    String sourceId = simVideoUrlModel3.getSourceId();
                    int subtitleId = simVideoUrlModel3.getSubtitleId();
                    String originalCaptionLanguageCode = simVideoUrlModel3.getOriginalCaptionLanguageCode();
                    Map<Integer, C1475370oUp> simSubtitleUrlModelMap = simVideoUrlModel3.getSimSubtitleUrlModelMap();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setPreloadSubtitlesList: payload[");
                    sbLIZ2.append(i);
                    sbLIZ2.append("]: aid=");
                    sbLIZ2.append(sourceId);
                    sbLIZ2.append(", subId=");
                    sbLIZ2.append(subtitleId);
                    sbLIZ2.append(", oriLangCode=");
                    sbLIZ2.append(originalCaptionLanguageCode);
                    sbLIZ2.append(", subIds.size=");
                    if (simSubtitleUrlModelMap == null) {
                        size2 = 0;
                    } else {
                        size2 = simSubtitleUrlModelMap.size();
                    }
                    sbLIZ2.append(size2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    if (!TextUtils.isEmpty(sourceId) && subtitleId != 0 && !TextUtils.isEmpty(originalCaptionLanguageCode) && simSubtitleUrlModelMap != null && simSubtitleUrlModelMap.size() > 0) {
                        enginePreloader.LJJII.add(new C1475220oUa(subtitleId, sourceId, originalCaptionLanguageCode, simSubtitleUrlModelMap));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final void LIZ(String str, List list, boolean z, boolean z2) {
        int size;
        String str2;
        Collection collection;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addMediasOpt:");
        if (list == null) {
            size = -1;
        } else {
            size = list.size();
        }
        sbLIZ.append(size);
        sbLIZ.append(", scene:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (list != null && list.size() != 0) {
            this.LIZ.getClass();
            if (z) {
                DataLoaderHelper dataLoaderHelper = C805420Vie.LIZ;
                dataLoaderHelper.getClass();
                if (C1474810oTv.LJJIFFI()) {
                    dataLoaderHelper.LJLIIIL.getClass();
                    if (dataLoaderHelper.LJJIJLIJ != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(dataLoaderHelper);
                        arrayList.add(str);
                        arrayList.add(Integer.valueOf(z2 ? 1 : 0));
                        dataLoaderHelper.LJJIJLIJ.LIZ(113, arrayList);
                    } else {
                        C790230UzF.LIZ.LIZJ().removeAllMedia(str, z2 ? 1 : 0);
                    }
                } else if (dataLoaderHelper.LJJIJLIJ != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(dataLoaderHelper);
                    arrayList2.add(str);
                    arrayList2.add(Integer.valueOf(z2 ? 1 : 0));
                    dataLoaderHelper.LJJIJLIJ.LIZ(113, arrayList2);
                } else {
                    C790230UzF.LIZ.LIZJ().removeAllMedia(str, z2 ? 1 : 0);
                }
            }
            if (C1474810oTv.LJLLLLLL() && ((str2 = C1469230oKv.LIZ.LIZ) == null || !str2.equals(str))) {
                if (((Boolean) C1474810oTv.Y4.getValue()).booleanValue() && (collection = (Collection) ((HashMap) this.LIZ.LJJI).get(str)) != null) {
                    list.addAll(collection);
                }
                ((HashMap) this.LIZ.LJJI).put(str, list);
                return;
            }
            TTVideoEngine.LJFF(str, list);
            TTVideoEngine.LJIIJJI(31224, str);
        }
    }
}
