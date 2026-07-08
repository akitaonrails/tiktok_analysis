package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ko9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528550Ko9 {
    public static final void LIZ(MediaModel mediaModel, final boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaModel);
        C533730KwV c533730KwV = C533730KwV.LIZ;
        InterfaceC2471609mM interfaceC2471609mM = new InterfaceC2471609mM() { // from class: X.0KoA
            @Override // X.InterfaceC2471609mM
            public final void LIZ(boolean z2) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJFF("is_4k_enable", C2495709qF.LIZ());
                c0lab.LJFF("is_4k_video", z2);
                c0lab.LJFF("is_success", z);
                C20684815ws.LJIILLIIL("tool_performance_4k_video_select", c0lab.LIZ);
            }
        };
        c533730KwV.getClass();
        C533730KwV.LIZ(arrayList, interfaceC2471609mM);
    }

    public static final void LIZIZ(int i, String str, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
            c543670LTx.LIZ.put("scene_name", "select");
            c543670LTx.LIZ.put("type", str);
            C1637890six.LIZJ("aweme_video_import_duration", jSONObject, c543670LTx.LJ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIJ(C533790Kwb.LIZIZ, "monitorDuration error", e);
        }
    }
}
