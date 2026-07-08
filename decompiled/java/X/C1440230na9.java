package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.ugc.gamora.editor.smartsynthesis.SmartSynthesisModelPath;
import com.ss.bduploader.BDUploadUtil;
import com.ss.bduploader.logupload.VideoEventEngineUploader;
import com.ss.bduploader.util.BDUrlDispatchInterface;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import m14.e;
import m14.l;
import m14.m;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0na9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440230na9 {
    public boolean LIZ;

    public final void LIZ() {
        String str;
        String str2;
        boolean zLJI = MethodIDManager.LJI(71925);
        C1440220na8 c1440220na8 = C1440220na8.LIZ;
        boolean zLJI2 = MethodIDManager.LJI(71926);
        C1440220na8.LIZIZ("init start");
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_smart_synthesis", true, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SmartSynthesisModelFetcher -> model path template: ");
            C1440220na8.LIZ.getClass();
            sbLIZ.append(InterfaceC1440260naC.LJIIJ.getModelPath());
            C1440220na8.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (C1440220na8.LIZ()) {
                List<Integer> list = C1440220na8.LIZJ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Integer> it2 = list.iterator();
                while (true) {
                    String str3 = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    int iIntValue = it2.next().intValue();
                    String[] strArr = new String[2];
                    C1440220na8.LIZ.getClass();
                    C01GW c01gw = C1440220na8.LIZIZ;
                    SmartSynthesisModelPath smartSynthesisModelPath = (SmartSynthesisModelPath) c01gw.getValue();
                    if (smartSynthesisModelPath == null || (str = smartSynthesisModelPath.smartcodec) == null) {
                        str = "";
                    }
                    strArr[0] = C1440220na8.LIZJ(iIntValue, str);
                    SmartSynthesisModelPath smartSynthesisModelPath2 = (SmartSynthesisModelPath) c01gw.getValue();
                    if (smartSynthesisModelPath2 != null && (str2 = smartSynthesisModelPath2.statics) != null) {
                        str3 = str2;
                    }
                    strArr[1] = C1440220na8.LIZJ(iIntValue, str3);
                    arrayList.add(C1697810uHb.LJIIJJI(strArr));
                }
                for (final String str4 : (ArrayList) C15438062q.LJIJJLI(arrayList)) {
                    boolean zLJI3 = MethodIDManager.LJI(137764);
                    Map<String, List<String>> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("", C1697810uHb.LJIILJJIL(str4)));
                    String[] strArr2 = {""};
                    if (DownloadableModelSupport.isInitialized()) {
                        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(strArr2, mapLJIIJ, new IFetchResourceListener() { // from class: X.0naA
                            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                            public final void onFailure(Exception exc) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("fetchSmartCompileSetting download failed: ");
                                sbLIZ2.append(exc.getMessage());
                                C1440220na8.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            }

                            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
                            public final void onSuccess(long j) {
                                String path;
                                C1440220na8.LIZIZ("fetchSmartCompileSetting download success");
                                try {
                                    path = URI.create(C13Q5.LIZ().LIZLLL().realFindResourceUri(0, null, str4)).getPath();
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                if (path.length() != 0) {
                                    if (!new C0VSJ(path).exists()) {
                                        path = "";
                                    }
                                } else {
                                    path = "";
                                }
                                if (path.length() != 0) {
                                    C1440220na8.LJ.put(str4, path);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("modelName: ==> ");
                                    sbLIZ2.append(str4);
                                    sbLIZ2.append(" \n path: ==> ");
                                    sbLIZ2.append(path);
                                    C1440220na8.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        });
                        if (zLJI3) {
                            MethodIDManager.LJ();
                        }
                    } else if (zLJI3) {
                        MethodIDManager.LJ();
                    }
                }
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            } else {
                C1440220na8.LIZIZ("SmartSynthesisModelFetcher -> init smart compile model is invalid return");
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            }
        } else {
            C1440220na8.LIZIZ("SmartSynthesisModelFetcher -> smart compile setting is disable return");
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        }
        C197078128u.LIZ.getClass();
        C197078128u.LIZIZ();
        if (this.LIZ) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        this.LIZ = true;
        BDUploadUtil.setVideoEventUpload(new VideoEventEngineUploader() { // from class: X.0jW7
            @Override // com.ss.bduploader.logupload.VideoEventEngineUploader
            public final void onEventV3(String str5, JSONObject jSONObject) {
                AppLogNewUtils.onEventV3(str5, jSONObject);
            }
        });
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_upload_sdk_native_log", true, false)) {
            C0CHQ.LIZ().LJIIJJI();
        }
        BDUploadUtil.setEnableNativeLog(false);
        BDUploadUtil.setEnableDispatch(Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_upload_sdk_host_dispatch", true, false)));
        BDUploadUtil.setDispatchImp(new BDUrlDispatchInterface() { // from class: X.0ork
            @Override // com.ss.bduploader.util.BDUrlDispatchInterface
            public final String doDispatchUrl(String str5, String str6) {
                if (!((ArrayList) l.LJ().LIZLLL).isEmpty()) {
                    e eVarLIZ = l.LJ().LIZ(new m(str5, str6));
                    if (eVarLIZ != null && !str5.equals(eVarLIZ.LIZ)) {
                        if (eVarLIZ.LIZ.length() == 0 && (!((ArrayList) eVarLIZ.LIZIZ).isEmpty())) {
                            return "";
                        }
                        if (!C2088908Gh.LIZ(eVarLIZ.LIZ)) {
                            return str5;
                        }
                        return eVarLIZ.LIZ;
                    }
                    return str5;
                }
                String strLIZLLL = l.LJ().LIZLLL(str5);
                if (str5.equals(strLIZLLL) || !C2088908Gh.LIZ(strLIZLLL)) {
                    return str5;
                }
                return strLIZLLL;
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
