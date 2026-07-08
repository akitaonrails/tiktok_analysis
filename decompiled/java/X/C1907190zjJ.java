package X;

import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907190zjJ {
    public static final C1907190zjJ LIZ = new C1907190zjJ();

    public static void LIZ(String str, List list) throws JSONException {
        C1907260zjQ c1907260zjQ;
        ArrayList<BaseNotice> arrayList;
        int i;
        if (C279910Ay5.LIZ() && (c1907260zjQ = (C1907260zjQ) C1907320zjW.LIZIZ.getValue()) != null && c1907260zjQ.LIZ) {
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((BaseNotice) obj).templateNotice == null) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (BaseNotice baseNotice : arrayList) {
                    LIZ.getClass();
                    if ((C279910Ay5.LIZIZ() & 1) == 1) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("error_reason", "not_template");
                        if (baseNotice != null) {
                            i = baseNotice.type;
                        } else {
                            i = -1;
                        }
                        c2344009Gk.LIZJ(i, "extra_type");
                        C20684815ws.LJIILLIIL("inbox_notice_error", c2344009Gk.LIZ);
                    }
                }
                LIZ.getClass();
                if ((C279910Ay5.LIZIZ() & 2) == 2 && !arrayList.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf(((BaseNotice) it2.next()).type));
                    }
                    JSONObject jSONObjectPut = jSONObject.put("error_type_list", arrayList2.toString());
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String str2 = ((BaseNotice) it3.next()).nid;
                        str2.toString();
                        arrayList3.add(str2);
                    }
                    String strJ3 = C786410Ut5.J3(jSONObjectPut.put("nid", arrayList3.toString()).put("log_pb", str).put("error_count", arrayList.size()));
                    Npth.reportBizException("inbox_notice_error", new Throwable(strJ3), strJ3, C2097608Jq.LJIIIIZZ(new Pair("error_reason", "not_template"), new Pair("error_count", String.valueOf(arrayList.size()))));
                }
            }
        }
    }

    public static void LIZIZ(GeneralTemplateNotice generalTemplateNotice, EnumC1907220zjM enumC1907220zjM, String str) throws JSONException {
        List list;
        boolean z;
        Integer num;
        Long l;
        Integer num2;
        int iIntValue;
        Integer num3;
        if (!C279910Ay5.LIZ()) {
            return;
        }
        C1907260zjQ c1907260zjQ = (C1907260zjQ) C1907320zjW.LIZIZ.getValue();
        if (c1907260zjQ == null || (list = c1907260zjQ.LIZIZ) == null) {
            list = C13BV.INSTANCE;
        }
        if (!list.contains(str)) {
            return;
        }
        if ((C279910Ay5.LIZIZ() & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("error_reason", "ui_error");
            c2344009Gk.LIZJ(enumC1907220zjM.getPosition(), "section");
            c2344009Gk.LJIIIIZZ("detail_reason", str);
            if (generalTemplateNotice != null && (num3 = generalTemplateNotice.type) != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = -1;
            }
            c2344009Gk.LIZJ(iIntValue, "extra_type");
            C20684815ws.LJIILLIIL("inbox_notice_error", c2344009Gk.LIZ);
        }
        if ((C279910Ay5.LIZIZ() & 2) == 2) {
            JSONObject jSONObject = new JSONObject();
            String string = null;
            if (generalTemplateNotice != null) {
                num = generalTemplateNotice.type;
            } else {
                num = null;
            }
            JSONObject jSONObjectPut = jSONObject.put("extra_type", num);
            if (generalTemplateNotice != null) {
                l = generalTemplateNotice.nid;
            } else {
                l = null;
            }
            String strJ3 = C786410Ut5.J3(jSONObjectPut.put("nid", l));
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("error_reason", "ui_error");
            pairArr[1] = new Pair("section", String.valueOf(enumC1907220zjM.getPosition()));
            pairArr[2] = new Pair("detail_reason", str);
            if (generalTemplateNotice != null && (num2 = generalTemplateNotice.type) != null) {
                string = num2.toString();
            }
            pairArr[3] = new Pair("extra_type", string);
            Npth.reportBizException("inbox_notice_error", new Throwable(strJ3), strJ3, C2097608Jq.LJIIIIZZ(pairArr));
        }
    }
}
