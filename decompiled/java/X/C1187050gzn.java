package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.takeout.PoiTakeoutEduPopSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0gzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187050gzn {
    public static C1186680gzC LIZIZ;
    public static int LIZJ;
    public static final C1187050gzn LIZ = new C1187050gzn();
    public static final Map<String, JSONObject> LIZLLL = new LinkedHashMap();

    public static void LIZ(Context context, String str, String str2) {
        if (str == null) {
            return;
        }
        String string = UriProtector.parse("aweme://poi_third_party").buildUpon().appendQueryParameter("url", str).appendQueryParameter("need_disclaimer", "1").appendQueryParameter("mob_extra", str2).appendQueryParameter("start_time", String.valueOf(System.currentTimeMillis())).toString();
        C1367960lha.LIZ.getClass();
        C1367960lha.LIZ().LJJLIIIJLLLLLLLZ(context, string);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.0gzm] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0gzo] */
    public static void LIZIZ(final Fragment fragment, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        int iIntValue;
        String str7;
        final C19EG activity;
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowTakeoutEduDialog, showedCount: ");
        C1186950gzd.LIZ.getClass();
        Keva keva = C1186950gzd.LIZIZ;
        sbLIZ.append(keva.getInt("poi_detail_takeout_edu_dialog_showed_count", 0));
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("config ===>title: ");
        PoiTakeoutEduPopSettings.LIZ.getClass();
        sbLIZ2.append(PoiTakeoutEduPopSettings.LIZ().title);
        sbLIZ2.append(", subtitle: ");
        sbLIZ2.append(PoiTakeoutEduPopSettings.LIZ().subTitle);
        sbLIZ2.append(", btnLeft: ");
        PoiTakeoutEduPopSettings.CtaBtn ctaBtn = PoiTakeoutEduPopSettings.LIZ().btnLeft;
        if (ctaBtn != null) {
            str5 = ctaBtn.cta;
        } else {
            str5 = null;
        }
        sbLIZ2.append(str5);
        sbLIZ2.append(", btnRight: ");
        PoiTakeoutEduPopSettings.CtaBtn ctaBtn2 = PoiTakeoutEduPopSettings.LIZ().btnRight;
        if (ctaBtn2 != null) {
            str6 = ctaBtn2.cta;
        } else {
            str6 = null;
        }
        sbLIZ2.append(str6);
        C2188811AlT.LIZIZ(sbLIZ2);
        int i2 = keva.getInt("poi_detail_takeout_edu_dialog_showed_count", 0);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("config ===>maxCount: ");
        sbLIZ3.append(PoiTakeoutEduPopSettings.LIZ().lifeShowTime);
        C2188811AlT.LIZIZ(sbLIZ3);
        Integer num = PoiTakeoutEduPopSettings.LIZ().lifeShowTime;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        if (i2 < iIntValue && str2 != null && str2.length() != 0) {
            String str8 = PoiTakeoutEduPopSettings.LIZ().title;
            if (((str8 != null && str8.length() != 0) || ((str7 = PoiTakeoutEduPopSettings.LIZ().subTitle) != null && str7.length() != 0)) && (activity = fragment.getActivity()) != null) {
                FragmentManager fragmentManagerLJJI = SAFExtensionKt.LJJI(activity);
                C2197301AzA c2197301AzA = C2197301AzA.LIZ;
                ?? r4 = new InterfaceC20660615sy() { // from class: X.0gzm
                    @Override // X.InterfaceC20660615sy
                    public final boolean t2() {
                        return true;
                    }

                    @Override // X.InterfaceC20658015sY
                    public final boolean Xu() {
                        return fragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
                    }

                    @Override // X.InterfaceC20658015sY
                    public final C688120Qyw i2() {
                        return new C688120Qyw(activity, fragment, null);
                    }

                    @Override // X.InterfaceC20658015sY
                    public final String getSceneId() {
                        return C634060Otw.LIZ(this);
                    }
                };
                ?? r6 = new InterfaceC1189720h46() { // from class: X.0gzo
                    @Override // X.InterfaceC1189720h46
                    public final void LIZ() {
                        C1186950gzd.LIZ.getClass();
                        Keva keva2 = C1186950gzd.LIZIZ;
                        keva2.storeInt("poi_detail_takeout_edu_dialog_showed_count", keva2.getInt("poi_detail_takeout_edu_dialog_showed_count", 0) + 1);
                    }
                };
                Context context = fragment.getContext();
                if (context != null && C960203pA.LIZIZ(context)) {
                    i = R.drawable.cug;
                } else {
                    i = R.drawable.cuf;
                }
                JSONObject jSONObject = (JSONObject) ((LinkedHashMap) LIZLLL).get(str);
                if (jSONObject != null) {
                    if (str3 != null) {
                        jSONObject.putOpt("ttoclid", str3);
                    }
                    if (str4 != null) {
                        jSONObject.putOpt("partner_name", str4);
                    }
                } else {
                    jSONObject = null;
                }
                C1189730h47 c1189730h47 = new C1189730h47(r4, fragmentManagerLJJI, r6, str2, i, jSONObject);
                c2197301AzA.getClass();
                C2197301AzA.LIZLLL(fragment, c1189730h47, null);
            }
        }
    }
}
