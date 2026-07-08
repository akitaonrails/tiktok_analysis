package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.gamora.editor.audioservice.service.memesong.MemeSongNetRes;
import com.ss.android.ugc.gamora.editor.audioservice.service.memesong.MemeSongRequestApi;
import com.ss.android.ugc.gamora.editor.audioservice.service.memesong.MemeSongResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19540711cj extends AbstractC19524211a4 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19524011a2
    public final void LJI() {
        AbstractC19526011aM abstractC19526011aM = new AbstractC19526011aM() { // from class: X.11ck
            public final String LJIIIZ = "ClearMemeSong";

            @Override // X.AbstractC19526011aM
            public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                return false;
            }

            @Override // X.AbstractC19526011aM
            public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
            }

            @Override // X.InterfaceC19524311a5
            public final String LJIILLIIL() {
                return this.LJIIIZ;
            }

            public static void LJJIJIIJIL(File file) {
                File[] fileArrListFiles;
                try {
                    if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                        C089E c089e = new C089E(fileArrListFiles);
                        while (c089e.hasNext()) {
                            File file2 = (File) c089e.next();
                            if (file2.isDirectory()) {
                                LJJIJIIJIL(file2);
                            } else {
                                file2.delete();
                            }
                        }
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.AbstractC19526011aM
            public final Object LJIJI(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, List<? extends InterfaceC19526611aS> list2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
                String str;
                InterfaceC19526611aS interfaceC19526611aS = (InterfaceC19526611aS) C13LP.LJJJLL(interfaceC19526511aR.LLILIL());
                if (interfaceC19526611aS != null && (str = (String) LJJIII(interfaceC19526611aS, "base_download_path")) != null) {
                    LJJIJIIJIL(new C0VSJ(str));
                    return "_CONNECT_ID_DEFAULT";
                }
                return "_CONNECT_ID_TERMINATION_ERROR";
            }
        };
        if (abstractC19526011aM instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) abstractC19526011aM).LJII();
        }
        abstractC19526011aM.LJIJ("base_download_path", "base_path");
        AbstractC19526011aM abstractC19526011aM2 = new AbstractC19526011aM() { // from class: X.11cg
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
            public final String LJIIIZ = "FetchMemeSong";
            public final C19523211Zu LJIIJ = new C19523211Zu(this, "FetchMemeSong");

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C19540411cg.class, "ability", "getAbility()Lcom/ss/android/ugc/gamora/editor/audioservice/pipeline/tools/abilities/IPPFetchMemeSongAbility;", 0);
                C13LE.LIZ.getClass();
                LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // X.AbstractC19526011aM
            public final boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
                return false;
            }

            @Override // X.AbstractC19526011aM
            public final void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu) {
            }

            @Override // X.InterfaceC19524311a5
            public final String LJIILLIIL() {
                return this.LJIIIZ;
            }

            @Override // X.AbstractC19526011aM
            public final List<InterfaceC19526611aS> LJIL(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list) {
                ArrayList arrayList = new ArrayList();
                Iterator<InterfaceC19526611aS> it2 = interfaceC19526511aR.LLILIL().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                }
                return arrayList;
            }

            /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
            @Override // X.AbstractC19526011aM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJIJI(X.InterfaceC19526511aR r21, java.util.List<? extends X.InterfaceC19526611aS> r22, java.util.List<? extends X.InterfaceC19526611aS> r23, X.InterfaceC1364105Vn<? super java.lang.String> r24) {
                /*
                    Method dump skipped, instruction units count: 408
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19540411cg.LJIJI(X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
            }
        };
        if (abstractC19526011aM2 instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) abstractC19526011aM2).LJII();
        }
        abstractC19526011aM2.LJIJ("prompt", "prompt");
        abstractC19526011aM2.LJIJ("base_down_path", "base_path");
        abstractC19526011aM2.LJIJ("DOWNLOAD_URL", "download_url");
        abstractC19526011aM2.LJIJ("LOG_ID", "server_log_id");
        abstractC19526011aM2.LJIJ("MEMESONG_MODEL", "memesong_model");
        abstractC19526011aM2.LJIJ("STYLE", "meme_style");
        abstractC19526011aM2.LJIJ("TARGET_DOWNLOAD_PATH", "target_path");
        C19540011cc c19540011cc = new C19540011cc("DownloadMemeSong");
        if (c19540011cc instanceof InterfaceC19524011a2) {
            ((InterfaceC19524011a2) c19540011cc).LJII();
        }
        c19540011cc.LJIJ("DOWNLOAD_URL", "download_url");
        c19540011cc.LJIJ("SPEAKER_ID", "meme_style");
        c19540011cc.LJIJ("TARGET_PATH", "target_path");
        c19540011cc.LJIJ("VC_FILE_PATH", "downloaded_song_path");
        LJJIJIIJIL(abstractC19526011aM, "_CONNECT_ID_DEFAULT", abstractC19526011aM2);
        LJJIJIIJIL(abstractC19526011aM2, "_CONNECT_ID_DEFAULT", c19540011cc);
        LJJIZ(C1697810uHb.LJ(abstractC19526011aM));
        LJJIL(Collections.singletonList(c19540011cc), null);
    }

    @Override // X.AbstractC19524211a4
    public final void LJJIJL() {
        C19522911Zr c19522911Zr = new C19522911Zr();
        c19522911Zr.LIZIZ("FetchMemeSong", new InterfaceC19523111Zt<InterfaceC19543311d9>() { // from class: X.11d4
            @Override // X.InterfaceC19523111Zt
            public final C11ZA LJIIIIZZ() {
                return new InterfaceC19543311d9() { // from class: X.11dQ
                    @Override // X.InterfaceC19543311d9
                    public final MemeSongNetRes LJFF(String str, String str2) throws JSONException {
                        MemeSongRequestApi.Api api;
                        TypedByteArray typedByteArray;
                        byte[] bytes;
                        String str3;
                        String str4;
                        int i;
                        Integer numValueOf;
                        String str5;
                        String str6;
                        String str7;
                        int i2;
                        String str8;
                        Integer numValueOf2;
                        String str9;
                        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).isPPEEnable()) {
                            api = (MemeSongRequestApi.Api) C0CHQ.LIZ().getNetworkService().createRetrofit("https://sami-maliva.byteintlapi.com/", false, MemeSongRequestApi.Api.class);
                        } else {
                            api = (MemeSongRequestApi.Api) C0CHQ.LIZ().getNetworkService().createRetrofit("https://sami.tiktokv.com/", false, MemeSongRequestApi.Api.class);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("prompt", str);
                        JSONArray jSONArray = new JSONArray();
                        Iterator<String> it2 = MemeSongRequestApi.LIZ.iterator();
                        while (it2.hasNext()) {
                            jSONArray.put(it2.next());
                        }
                        jSONObject.put("styles", jSONArray);
                        jSONObject.put("output_format", str2);
                        jSONObject.put("response_type", 1);
                        jSONObject.put("vod_status", 0);
                        try {
                            n nVar = new n();
                            nVar.LJJIIJ("payload", C786410Ut5.J3(jSONObject));
                            C0X52 c0x52Execute = C09TY.LIZ(api, nVar).execute();
                            String str10 = null;
                            MemeSongNetRes memeSongNetRes = new MemeSongNetRes(null);
                            if (c0x52Execute.LIZJ()) {
                                MemeSongResponse memeSongResponse = (MemeSongResponse) C051R.LIZ(new String(((TypedByteArray) c0x52Execute.LIZ.LJ).getBytes(), Charsets.UTF_8), MemeSongResponse.class);
                                if (memeSongResponse != null) {
                                    str6 = memeSongResponse.payload;
                                } else {
                                    str6 = null;
                                }
                                MemeSongNetRes memeSongNetRes2 = (MemeSongNetRes) C051R.LIZ(str6, MemeSongNetRes.class);
                                if (memeSongNetRes2 == null) {
                                    memeSongNetRes2 = new MemeSongNetRes(null);
                                }
                                if (memeSongResponse == null) {
                                    str7 = null;
                                } else {
                                    str7 = memeSongResponse.statusText;
                                }
                                memeSongNetRes2.setStatusText(str7);
                                if (memeSongResponse == null) {
                                    i2 = -99;
                                } else {
                                    i2 = memeSongResponse.status_code;
                                }
                                memeSongNetRes2.setStatusCode(i2);
                                if (memeSongResponse == null) {
                                    str8 = null;
                                } else {
                                    str8 = memeSongResponse.taskId;
                                }
                                memeSongNetRes2.setTaskId(str8);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("request finished, statusCode = ");
                                if (memeSongResponse == null) {
                                    numValueOf2 = null;
                                } else {
                                    numValueOf2 = Integer.valueOf(memeSongResponse.status_code);
                                }
                                sbLIZ.append(numValueOf2);
                                sbLIZ.append(" , statusText = ");
                                if (memeSongResponse == null) {
                                    str9 = null;
                                } else {
                                    str9 = memeSongResponse.statusText;
                                }
                                sbLIZ.append(str9);
                                sbLIZ.append(" , taskId = ");
                                if (memeSongResponse != null) {
                                    str10 = memeSongResponse.taskId;
                                }
                                sbLIZ.append(str10);
                                C2188811AlT.LIZIZ(sbLIZ);
                                return memeSongNetRes2;
                            }
                            TypedInput typedInput = c0x52Execute.LIZJ;
                            if ((typedInput instanceof TypedByteArray) && (typedByteArray = (TypedByteArray) typedInput) != null && (bytes = typedByteArray.getBytes()) != null) {
                                MemeSongResponse memeSongResponse2 = (MemeSongResponse) C051R.LIZ(new String(bytes, Charsets.UTF_8), MemeSongResponse.class);
                                if (memeSongResponse2 != null) {
                                    str3 = memeSongResponse2.taskId;
                                } else {
                                    str3 = null;
                                }
                                memeSongNetRes.setTaskId(str3);
                                if (memeSongResponse2 == null) {
                                    str4 = null;
                                } else {
                                    str4 = memeSongResponse2.statusText;
                                }
                                memeSongNetRes.setStatusText(str4);
                                if (memeSongResponse2 == null) {
                                    i = -98;
                                } else {
                                    i = memeSongResponse2.status_code;
                                }
                                memeSongNetRes.setStatusCode(i);
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("net error, ");
                                if (memeSongResponse2 == null) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf(memeSongResponse2.status_code);
                                }
                                sbLIZ2.append(numValueOf);
                                sbLIZ2.append(" , ");
                                if (memeSongResponse2 == null) {
                                    str5 = null;
                                } else {
                                    str5 = memeSongResponse2.statusText;
                                }
                                sbLIZ2.append(str5);
                                sbLIZ2.append(" , taskId = ");
                                if (memeSongResponse2 != null) {
                                    str10 = memeSongResponse2.taskId;
                                }
                                sbLIZ2.append(str10);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                return memeSongNetRes;
                            }
                            return memeSongNetRes;
                        } catch (C1494450ozb e) {
                            TryCatchGuardChecker.doCheck(e);
                            return C19541911cv.LIZ("NetworkNotAvailabeException");
                        } catch (C1494690ozz e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return C19541911cv.LIZ("CronetIOException");
                        } catch (RuntimeException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            return C19541911cv.LIZ("RuntimeException");
                        }
                    }
                };
            }
        });
        c19522911Zr.LIZIZ("DownloadAudioFile", new C19542211cy());
        this.LIZLLL = c19522911Zr;
    }
}
