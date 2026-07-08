package X;

import Y.ARunnableS122S0100000_22;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.settings.PublishBlockUploadCancelConfig;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436830nUf implements InterfaceC729580Sjc {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1408290mkd());

    public static final List<String> LJIIJ() {
        String string = new C1436840nUg(C0CHQ.LIZ).LIZJ().getString("publish_story_draft_path", "");
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), string != null ? string : "", new TypeToken<ArrayList<String>>() { // from class: X.0M5Y
        }.getType());
        return arrayList == null ? C13BV.INSTANCE : arrayList;
    }

    public static final List<String> LJIIJJI() {
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), new C1436840nUg(C0CHQ.LIZ).LIZLLL(), new TypeToken<ArrayList<String>>() { // from class: X.0nUi
        }.getType());
        return arrayList == null ? C13BV.INSTANCE : arrayList;
    }

    public static final boolean LJIIL() {
        return new C1436840nUg(C0CHQ.LIZ).LIZJ().getBoolean("publish_story_draft_opt", false);
    }

    public static final Set<String> LJIILLIIL() {
        C0M5Z c0m5z = new C0M5Z(AFwS261S0000000_22.get$arr$(264));
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        Object objFromJson = GsonProtectorUtils.fromJson(new Gson(), c1436840nUg.LIZIZ(), new TypeToken<ArrayList<String>>() { // from class: X.0n5y
        }.getType());
        ArrayList arrayList = (ArrayList) objFromJson;
        if (arrayList == null || arrayList.isEmpty()) {
            objFromJson = null;
        }
        ArrayList arrayList2 = (ArrayList) objFromJson;
        if (arrayList2 != null) {
            c0m5z.addAll(arrayList2);
        }
        String string = c1436840nUg.LIZJ().getString("uploadRecoverPath", "");
        c0m5z.add(string != null ? string : "");
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(c0m5z, 10));
        Iterator<T> it2 = c0m5z.iterator();
        while (it2.hasNext()) {
            arrayList3.add(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZLLL(new CreativeInfo((String) it2.next(), 0, null, 6, null)));
        }
        return C13LP.LLIIJI(arrayList3);
    }

    @Override // X.InterfaceC729580Sjc
    public final void LIZJ() {
        C201955140j.LIZ("InternalPublishServiceImpl, clearUploadRecoverPath");
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        c1436840nUg.LJFF("");
        c1436840nUg.LJI("");
    }

    @Override // X.InterfaceC729580Sjc
    public final List<String> LIZLLL() {
        try {
            ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(new Gson(), new C1436840nUg(C0CHQ.LIZ).LIZIZ(), new TypeToken<ArrayList<String>>() { // from class: X.0L5M
            }.getType());
            return arrayList == null ? C13BV.INSTANCE : arrayList;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    public final Map<String, String> LJIIIZ() {
        C1408270mkb c1408270mkb = (C1408270mkb) ((C1408280mkc) this.LIZ.getValue()).LIZ.getValue();
        String string = ((Keva) c1408270mkb.LIZ.getValue()).getString("key_creation_biz_metrics", "{}");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(string);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optString(next, ""));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            ((Keva) c1408270mkb.LIZ.getValue()).clear();
        }
        return linkedHashMap;
    }

    public final void LJIIIIZZ() {
        if (C523670KgH.LIZ()) {
            C1408280mkc c1408280mkc = (C1408280mkc) this.LIZ.getValue();
            ((ExecutorService) c1408280mkc.LIZIZ.getValue()).execute(new ARunnableS122S0100000_22(c1408280mkc, 96));
        }
    }

    public static final void LJII(C572660Md6 c572660Md6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InternalPublishServiceImpl, addUploadRecoverPath:");
        sbLIZ.append(c572660Md6);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        String str = c572660Md6.LIZ;
        if (str == null) {
            return;
        }
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        String strLIZIZ = c1436840nUg.LIZIZ();
        C01GW c01gw = C262840ARu.LIZ;
        c1436840nUg.LJFF(LJI(strLIZIZ, str, ((Boolean) c01gw.getValue()).booleanValue()));
        if (c572660Md6.LIZIZ) {
            c1436840nUg.LJI(LJI(c1436840nUg.LIZLLL(), str, ((Boolean) c01gw.getValue()).booleanValue()));
        }
    }

    public static final boolean LJIILJJIL(String str) {
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        List list = (ArrayList) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), c1436840nUg.LIZLLL(), new TypeToken<ArrayList<String>>() { // from class: X.0nUk
        }.getType());
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return list.contains(str);
    }

    public static final void LJIIZILJ(String str) {
        C1439640nZC.LIZ.getClass();
        C1439640nZC.LJ(0, str);
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        Gson gson = new Gson();
        Object objFromJson = GsonProtectorUtils.fromJson(gson, c1436840nUg.LIZ(""), new TypeToken<ArrayList<String>>() { // from class: X.0nOw
        }.getType());
        if (objFromJson == null) {
            objFromJson = new ArrayList();
        }
        C19719512Dh.LIZ(objFromJson).remove(str);
        c1436840nUg.LIZJ().edit().putString("parallel_last_auto_recover_paths", GsonProtectorUtils.toJson(gson, objFromJson)).apply();
    }

    public static final void LJIJI(C572660Md6 c572660Md6) {
        Object next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InternalPublishServiceImpl, removeUploadRecoverPath:");
        sbLIZ.append(c572660Md6);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Keva keva = C1436760nUY.LIZ;
        String str = c572660Md6.LIZ;
        if (str == null) {
            str = "";
        }
        Iterator it2 = ((ArrayList) C1436760nUY.LIZIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((C1436800nUc) next).LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1436800nUc c1436800nUc = (C1436800nUc) next;
        if (c1436800nUc != null) {
            if (c1436800nUc.LIZLLL) {
                ((ArrayList) C1436760nUY.LIZIZ).remove(c1436800nUc);
            } else {
                c1436800nUc.LIZJ = true;
            }
            C1436760nUY.LIZIZ();
        }
        String str2 = c572660Md6.LIZ;
        if (str2 == null) {
            return;
        }
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        c1436840nUg.LJFF(LJIJ(c1436840nUg.LIZIZ(), str2));
        if (!((PublishBlockUploadCancelConfig) C1431900nMi.LIZIZ.getValue()).enable) {
            C1402780mbk.LIZ.getClass();
            ((Keva) C1402780mbk.LIZIZ.getValue()).erase(str2);
        }
        if (c572660Md6.LIZIZ) {
            c1436840nUg.LJI(LJIJ(c1436840nUg.LIZLLL(), str2));
        }
    }

    public static final void LJIJJ(AwemeDraft awemeDraft) {
        C365980EWm.LIZ(awemeDraft);
    }

    public static final void LJIJJLI(boolean z) {
        new C1436840nUg(C0CHQ.LIZ).LIZJ().edit().putBoolean("publish_story_draft_opt", z).apply();
    }

    public static final void LJIL(PublishModel publishModel) {
        VideoPublishEditModel videoPublishEditModel;
        String str;
        BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && !videoPublishEditModel.isStoryEditMode() && !C1444940nhk.LIZLLL(videoPublishEditModel.getCanvasVideoData()) && !videoPublishEditModel.isPcsPaidVideo()) {
            String draftPrimaryKey = videoPublishEditModel.getDraftPrimaryKey();
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            if (draftPrimaryKey == null) {
                str = "null";
            } else {
                str = draftPrimaryKey;
            }
            c1437510nVlLJJLIIIJ.LIZ("setRecoverKey", str);
            if (!TextUtils.isEmpty(draftPrimaryKey)) {
                C572660Md6 c572660Md6 = new C572660Md6(videoPublishEditModel);
                C0CHQ.LIZ().getPublishService().LJIIL();
                LJII(c572660Md6);
            }
        }
    }

    @Override // X.InterfaceC729580Sjc
    public final void LIZ(String str) {
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        String str2 = "";
        String string = c1436840nUg.LIZJ().getString("publish_story_draft_path", "");
        if (string != null) {
            str2 = string;
        }
        c1436840nUg.LIZJ().edit().putString("publish_story_draft_path", LJIJ(str2, str)).apply();
    }

    @Override // X.InterfaceC729580Sjc
    public final void LIZIZ(List<String> list) {
        for (String str : list) {
            C1439640nZC.LIZ.getClass();
            C1439640nZC.LJ(Keva.getRepo("repo_publish_auto_retry_count").getInt(str, 0) + 1, str);
        }
    }

    @Override // X.InterfaceC729580Sjc
    public final void LJ(String str) {
        C1436840nUg c1436840nUg = new C1436840nUg(C0CHQ.LIZ);
        String str2 = "";
        String string = c1436840nUg.LIZJ().getString("publish_story_draft_path", "");
        if (string != null) {
            str2 = string;
        }
        c1436840nUg.LIZJ().edit().putString("publish_story_draft_path", LJI(str2, str, true)).apply();
    }

    public final void LJJ(final Function0<C856020Xi4> function0) {
        if (C523670KgH.LIZ()) {
            final C1408280mkc c1408280mkc = (C1408280mkc) this.LIZ.getValue();
            ((ExecutorService) c1408280mkc.LIZIZ.getValue()).execute(new Runnable() { // from class: X.0mkZ
                public final void LIZ() {
                    Map<String, String> map = function0.invoke().LIZ;
                    C1408270mkb c1408270mkb = (C1408270mkb) c1408280mkc.LIZ.getValue();
                    c1408270mkb.getClass();
                    if (map.isEmpty()) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(((Keva) c1408270mkb.LIZ.getValue()).getString("key_creation_biz_metrics", "{}"));
                        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                        ((Keva) c1408270mkb.LIZ.getValue()).storeString("key_creation_biz_metrics", C786410Ut5.J3(jSONObject));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("AppExitBizMetricManager@7fa3.update$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("AppExitBizMetricManager@7fa3.update$1");
                }
            });
        }
    }

    public static final boolean LJIILIIL(String str, boolean z) {
        C1439640nZC.LIZ.getClass();
        int i = Keva.getRepo("repo_publish_auto_retry_count").getInt(str, 0);
        if (i > 0) {
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ifPathsNotRetried, retry count=");
            sbLIZ.append(i);
            sbLIZ.append(", maxCount=");
            C01GW c01gw = C0ARR.LIZ;
            sbLIZ.append(((Number) c01gw.getValue()).intValue());
            C201955140j.LIZLLL(c830690WiJ, "AutoRetry", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                if (i >= ((Number) C262760ARm.LIZ.getValue()).intValue()) {
                    return false;
                }
            } else if (i >= ((Number) c01gw.getValue()).intValue()) {
                return false;
            }
            return true;
        }
        List list = (ArrayList) GsonProtectorUtils.fromJson(new Gson(), new C1436840nUg(C0CHQ.LIZ).LIZ(""), new TypeToken<ArrayList<String>>() { // from class: X.0nUj
        }.getType());
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return !list.contains(str);
    }

    public static String LJIJ(String str, String str2) {
        try {
            Gson gson = C7740030o.LIZ().getGson();
            ArrayList arrayList = (ArrayList) gson.LJIIIIZZ(str, new TypeToken<ArrayList<String>>() { // from class: X.0nUl
            }.getType());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.remove(str2);
            str = gson.LJIILL(arrayList);
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C830690WiJ.LIZIZ, "removeTargetUploadRecoverPath error", e);
            return str;
        }
    }

    public static String LJI(String str, String str2, boolean z) {
        try {
            Gson gson = C7740030o.LIZ().getGson();
            ArrayList arrayList = (ArrayList) gson.LJIIIIZZ(str, new TypeToken<ArrayList<String>>() { // from class: X.0nUh
            }.getType());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!z && C1439650nZD.LJI && (!arrayList.isEmpty())) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
            str = gson.LJIILL(arrayList);
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C830690WiJ.LIZIZ, "addTargetUploadRecoverPath error", e);
            return str;
        }
    }

    public static final void LJIILL(C19EG c19eg, AwemeDraft awemeDraft, PublishFailureReason publishFailureReason) {
        C1439030nYD c1439030nYD = C1439030nYD.LIZ;
        C1439050nYF c1439050nYF = new C1439050nYF(awemeDraft, publishFailureReason);
        c1439030nYD.getClass();
        C1439030nYD.LJII(c19eg, c1439050nYF, false);
    }

    @Override // X.InterfaceC729580Sjc
    public final void LJFF(C19EG c19eg, AwemeDraft awemeDraft, PublishFailureReason publishFailureReason) {
        C1439030nYD c1439030nYD = C1439030nYD.LIZ;
        C1439050nYF c1439050nYF = new C1439050nYF(awemeDraft, publishFailureReason);
        c1439030nYD.getClass();
        C1439030nYD.LJII(c19eg, c1439050nYF, true);
    }
}
