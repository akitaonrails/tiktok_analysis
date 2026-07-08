package X;

import Y.AComparatorS41S0000000_22;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.property.StoryUploadSpeedEncodeSettings;
import com.ss.android.ugc.aweme.property.UploadSpeedEncodeSettings;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0n3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420140n3k {
    public static final String LIZIZ(UploadSpeedInfo uploadSpeedInfo) {
        boolean z;
        Object next;
        boolean z2;
        String str = null;
        if (uploadSpeedInfo == null || uploadSpeedInfo.getSpeed() <= 0) {
            return null;
        }
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "ve_synthesis_settings_by_upload_speed", "", true);
        if (strLJJ != null && strLJJ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strLJJ);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                if (jSONObject != null) {
                    int iOptInt = jSONObject.optInt("max_speed");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("setting");
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new C1420150n3l(iOptInt, C786410Ut5.J3(jSONObjectOptJSONObject)));
                    }
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((C1420150n3l) obj).LIZ > uploadSpeedInfo.getSpeed()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    int i2 = ((C1420150n3l) next).LIZ;
                    do {
                        Object next2 = it2.next();
                        int i3 = ((C1420150n3l) next2).LIZ;
                        if (i2 > i3) {
                            next = next2;
                            i2 = i3;
                        }
                    } while (it2.hasNext());
                }
            }
            C1420150n3l c1420150n3l = (C1420150n3l) next;
            if (c1420150n3l != null) {
                uploadSpeedInfo.setUsedCompilerSettingGroup(c1420150n3l.LIZ);
                str = c1420150n3l.LIZIZ;
            }
        }
        C564000MAc.LIZIZ("UploadSpeeds v1 --- speed : " + uploadSpeedInfo.getSpeed() + " ; setting : " + str);
        return str;
    }

    public static final UploadSpeedEncodeSettings LIZJ(UploadSpeedInfo uploadSpeedInfo) {
        List listLJJLL;
        Object next;
        Object objValueOf = null;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "enable_upload_speed_control_ve_encode_settings", true, false)) {
            return null;
        }
        Object[] objArr = (Object[]) C0C64.LJIILLIIL().LJJII(UploadSpeedEncodeSettings[].class, null, "ve_encode_settings_by_upload_speed", true);
        if (objArr != null && (listLJJLL = C13LQ.LJJLL(objArr)) != null && !listLJJLL.isEmpty()) {
            if (uploadSpeedInfo != null && uploadSpeedInfo.getSpeed() > 0) {
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS41S0000000_22(11), listLJJLL);
                int size = listLJLLLL.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1420160n3m) ListProtector.get(listLJLLLL, i)).setIndex(i);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJLLLL) {
                    if (((InterfaceC1420160n3m) obj).LIZ() > uploadSpeedInfo.getSpeed()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    objValueOf = it2.next();
                    if (it2.hasNext()) {
                        int iLIZ = ((InterfaceC1420160n3m) objValueOf).LIZ();
                        do {
                            Object next2 = it2.next();
                            int iLIZ2 = ((InterfaceC1420160n3m) next2).LIZ();
                            if (iLIZ > iLIZ2) {
                                objValueOf = next2;
                                iLIZ = iLIZ2;
                            }
                        } while (it2.hasNext());
                    }
                }
                objValueOf = (InterfaceC1420160n3m) objValueOf;
                C564000MAc.LIZIZ("UploadSpeeds v2 --- speed : " + uploadSpeedInfo.getSpeed() + " ; setting : " + objValueOf);
            } else {
                Iterator it3 = C13LP.LJLLLL(new AComparatorS41S0000000_22(10), listLJJLL).iterator();
                if (!it3.hasNext()) {
                    next = null;
                } else {
                    next = it3.next();
                    if (it3.hasNext()) {
                        int iLIZ3 = ((InterfaceC1420160n3m) next).LIZ();
                        do {
                            Object next3 = it3.next();
                            int iLIZ4 = ((InterfaceC1420160n3m) next3).LIZ();
                            if (iLIZ3 > iLIZ4) {
                                next = next3;
                                iLIZ3 = iLIZ4;
                            }
                        } while (it3.hasNext());
                    }
                }
                InterfaceC1420160n3m interfaceC1420160n3m = (InterfaceC1420160n3m) next;
                if (interfaceC1420160n3m != null) {
                    interfaceC1420160n3m.setIndex(-1);
                }
                StringBuilder sb = new StringBuilder("UploadSpeeds v2 --- speed : ");
                if (uploadSpeedInfo != null) {
                    objValueOf = Long.valueOf(uploadSpeedInfo.getSpeed());
                }
                sb.append(objValueOf);
                sb.append(" ; setting : ");
                sb.append(interfaceC1420160n3m);
                C564000MAc.LIZIZ(sb.toString());
                objValueOf = interfaceC1420160n3m;
            }
        }
        return (UploadSpeedEncodeSettings) objValueOf;
    }

    public static final StoryUploadSpeedEncodeSettings LIZ(Long l, List list) {
        boolean z;
        int i;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        Object next = null;
        if (z || l == null || l.longValue() <= 0) {
            return null;
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS41S0000000_22(12), list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJLLLL) {
            StoryUploadSpeedEncodeSettings storyUploadSpeedEncodeSettings = (StoryUploadSpeedEncodeSettings) obj;
            if (storyUploadSpeedEncodeSettings.maxSpeed > l.longValue() && ((i = storyUploadSpeedEncodeSettings.minSpeed) < 0 || i < l.longValue())) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int i2 = ((StoryUploadSpeedEncodeSettings) next).maxSpeed;
                do {
                    Object next2 = it2.next();
                    int i3 = ((StoryUploadSpeedEncodeSettings) next2).maxSpeed;
                    if (i2 > i3) {
                        next = next2;
                        i2 = i3;
                    }
                } while (it2.hasNext());
            }
        }
        StoryUploadSpeedEncodeSettings storyUploadSpeedEncodeSettings2 = (StoryUploadSpeedEncodeSettings) next;
        C564000MAc.LIZIZ("UploadSpeeds v2 --- speed : " + l + " ; setting : " + storyUploadSpeedEncodeSettings2);
        return storyUploadSpeedEncodeSettings2;
    }
}
