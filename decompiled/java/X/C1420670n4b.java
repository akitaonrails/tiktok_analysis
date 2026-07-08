package X;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AIDubbing;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ICreativeEcommerceService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0n4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420670n4b {
    public static final String LJFF() {
        User currentUser;
        String uid;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        return (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (uid = currentUser.getUid()) == null) ? "" : uid;
    }

    public static final Keva LJIIIIZZ() {
        return Keva.getRepo("publish_privacy_settings_cache");
    }

    public static final boolean LJIILIIL() {
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceAnchorService.class));
        boolean z = iECommerceAnchorService != null && iECommerceAnchorService.LJJIZ();
        SettingsManager.LIZLLL().getClass();
        return z && (SettingsManager.LIZ("ec_sv_ai_dubbing_enable", false));
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        Boolean enableVideoAIDubbing;
        if (LJIIJJI(videoPublishEditModel)) {
            AIDubbing aIDubbing = videoPublishEditModel.creativeModel.aiDubbing;
            if (aIDubbing != null && (enableVideoAIDubbing = aIDubbing.getEnableVideoAIDubbing()) != null) {
                return enableVideoAIDubbing.booleanValue();
            }
            return true;
        }
        return false;
    }

    public static final int LIZJ(VideoPublishEditModel videoPublishEditModel) {
        int iIntValue;
        Integer numValueOf = null;
        for (CreateAnchorInfo createAnchorInfo : (ArrayList) LJ(videoPublishEditModel)) {
            if (LJIIL(createAnchorInfo.getType())) {
                try {
                    int iOptInt = new JSONObject(createAnchorInfo.getContent()).optInt("layout_type", -1);
                    if (iOptInt == 0 || iOptInt == 1) {
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = iOptInt;
                        }
                        numValueOf = Integer.valueOf(Math.max(iIntValue, iOptInt));
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        if (numValueOf != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 1)) {
            int iIntValue2 = numValueOf.intValue();
            if (iIntValue2 == 0 || iIntValue2 == 1) {
                LJIIIIZZ().storeInt(LJII(videoPublishEditModel, "_ECVideoAILayoutType"), iIntValue2);
            }
            return numValueOf.intValue();
        }
        String strLJII = LJII(videoPublishEditModel, "_ECVideoAILayoutType");
        Keva kevaLJIIIIZZ = LJIIIIZZ();
        if (!kevaLJIIIIZZ.contains(strLJII)) {
            return 0;
        }
        Integer numValueOf2 = Integer.valueOf(kevaLJIIIIZZ.getInt(strLJII, 0));
        int iIntValue3 = numValueOf2.intValue();
        if (iIntValue3 != 0 && iIntValue3 != 1) {
            return 0;
        }
        return numValueOf2.intValue();
    }

    public static final List<CreateAnchorInfo> LJ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList arrayList = new ArrayList();
        ICreativeEcommerceService iCreativeEcommerceService = (ICreativeEcommerceService) PluggableExtentionKt.pluggableSpi$default(ICreativeEcommerceService.class, false, false, false, 14, null);
        if (iCreativeEcommerceService != null) {
            iCreativeEcommerceService.LIZ(arrayList, videoPublishEditModel);
        }
        return arrayList;
    }

    public static final boolean LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        List<CreateAnchorInfo> listLJ = LJ(videoPublishEditModel);
        if (listLJ.isEmpty()) {
            return false;
        }
        for (CreateAnchorInfo createAnchorInfo : listLJ) {
            if (LJIIL(createAnchorInfo.getType())) {
                try {
                    if (new JSONObject(createAnchorInfo.getContent()).optBoolean("should_enable_ai_video_translate_option", false)) {
                        return true;
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return false;
    }

    public static final boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        List<CreateAnchorInfo> listLJ = LJ(videoPublishEditModel);
        if (listLJ.isEmpty()) {
            return false;
        }
        Iterator<CreateAnchorInfo> it2 = listLJ.iterator();
        while (it2.hasNext()) {
            if (LJIIL(it2.next().getType())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        if ((!C1428470nHB.LJJZZI(videoPublishEditModel)) && LJIIJ(videoPublishEditModel) && LJIIIZ(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIL(int i) {
        List<Integer> listLJJIL;
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommerceAnchorService.class));
        if (iECommerceAnchorService == null || (listLJJIL = iECommerceAnchorService.LJJIL()) == null) {
            listLJJIL = C13BV.INSTANCE;
        }
        return listLJJIL.contains(Integer.valueOf(i));
    }

    public static final SpannableString LIZLLL(final C19EG c19eg, final VideoPublishEditModel videoPublishEditModel) {
        SpannableString spannableString = new SpannableString(c19eg.getString(2131830353));
        String string = c19eg.getString(2131830353);
        SettingsManager.LIZLLL().getClass();
        final String str = "";
        String strLJI = SettingsManager.LJI("ec_sv_ai_dubbing_learn_more", "");
        if (strLJI != null) {
            str = strLJI;
        }
        if (str.length() != 0) {
            String string2 = c19eg.getString(2131830354);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(' ');
            sbLIZ.append(string2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            int iLJJJ = a0.LJJJ(strLIZIZ, string2, 0, false, 6);
            SpannableString spannableString2 = new SpannableString(strLIZIZ);
            C786410Ut5.p2(spannableString2, new ClickableSpan() { // from class: X.0DWX
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel2));
                    c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel2));
                    C20684815ws.LJIILLIIL("click_ai_dubbing_learn_more", c0lab.LIZ);
                    SmartRouter.buildRoute(c19eg, str).open();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setColor(C960203pA.LIZ(R.attr.a1h, c19eg));
                    textPaint.setUnderlineText(false);
                }
            }, iLJJJ, string2.length() + iLJJJ, 17);
            C786410Ut5.p2(spannableString2, new C444920HcY(62, false), iLJJJ, string2.length() + iLJJJ, 17);
            return spannableString2;
        }
        return spannableString;
    }

    public static final String LJI(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) {
        if (!(!C1428470nHB.LJJZZI(videoPublishEditModel))) {
            return c19eg.getString(2131830356);
        }
        if (!LJIIJ(videoPublishEditModel)) {
            return c19eg.getString(2131830356);
        }
        if (!LJIIIZ(videoPublishEditModel)) {
            return c19eg.getString(2131830357);
        }
        return null;
    }

    public static final String LJII(VideoPublishEditModel videoPublishEditModel, String str) {
        String strLJFF = LJFF();
        String creationId = videoPublishEditModel.getCreationId();
        if (creationId == null) {
            creationId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJFF);
        sbLIZ.append('_');
        sbLIZ.append(creationId);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJIILL(VideoPublishEditModel videoPublishEditModel, Integer num, boolean z) {
        int iIntValue;
        AIDubbing aIDubbing;
        AIDubbing aIDubbing2;
        if (!z) {
            iIntValue = 0;
        } else if (num != null || ((aIDubbing = videoPublishEditModel.creativeModel.aiDubbing) != null && (num = aIDubbing.getEnableVideoAIDubbingType()) != null)) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        AIDubbing aIDubbing3 = creativeModel.aiDubbing;
        if (aIDubbing3 == null || (aIDubbing2 = aIDubbing3.copy(Boolean.valueOf(z), Integer.valueOf(iIntValue))) == null) {
            aIDubbing2 = new AIDubbing(Boolean.valueOf(z), Integer.valueOf(iIntValue));
        }
        creativeModel.aiDubbing = aIDubbing2;
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, int i, Integer num, Boolean bool, String str) {
        boolean z;
        int iIntValue;
        LJIIIIZZ().storeInt(LJII(videoPublishEditModel, "_ECVideoAITranslateType"), i);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        LJIILL(videoPublishEditModel, Integer.valueOf(i), z);
        LJIILJJIL(videoPublishEditModel, Integer.valueOf(i), null, null, null);
        if (num != null && ((iIntValue = num.intValue()) == 0 || iIntValue == 1)) {
            LJIIIIZZ().storeInt(LJII(videoPublishEditModel, "_ECVideoAILayoutType"), iIntValue);
        }
        if (str != null && !a0.LJJJIL(str) && !a0.LJJJIL(str)) {
            LJIIIIZZ().storeString(LJII(videoPublishEditModel, "_ECVideoAITranslateProductId"), str);
        }
        LJIILJJIL(videoPublishEditModel, Integer.valueOf(i), num, bool, str);
    }

    public static final void LJIILJJIL(VideoPublishEditModel videoPublishEditModel, Integer num, Integer num2, Boolean bool, String str) {
        String strOptString;
        String str2 = videoPublishEditModel.commerceData;
        if (str2 != null && str2.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("anchors");
                if (jSONArrayOptJSONArray == null) {
                    return;
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null && LJIIL(jSONObjectOptJSONObject.optInt("type", -1)) && (strOptString = jSONObjectOptJSONObject.optString("content", null)) != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(strOptString);
                            if (num != null) {
                                jSONObject2.put("enable_ec_video_ai_translate_type", num.intValue());
                            }
                            if (num2 != null) {
                                jSONObject2.put("layout_type", num2.intValue());
                            }
                            if (bool != null) {
                                jSONObject2.put("should_enable_ai_video_translate_option", bool.booleanValue());
                            }
                            if (str != null && (!a0.LJJJIL(str))) {
                                jSONObject2.put("product_id", str);
                            }
                            jSONObjectOptJSONObject.put("content", C786410Ut5.J3(jSONObject2));
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                videoPublishEditModel.commerceData = C786410Ut5.J3(jSONObject);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }
}
