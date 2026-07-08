package X;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.Charsets;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.0bau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979420bau extends FrameLayout {
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LL;
    public DataChannel LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public Integer LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public List<String> LLJ;
    public boolean LLJI;

    private final String getExtrasString() {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("avatarUrls", this.LLJ));
        Map<String, String> recommendedPlaybookData = getRecommendedPlaybookData();
        if (recommendedPlaybookData != null) {
            mapLJIIJ.put("recommended_playbook_data", recommendedPlaybookData);
        }
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, mapLJIIJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getExtrasString, newExtras: ");
        sbLIZ.append(json);
        C20441214yg.LIZIZ("RematchGuideButton", C2188811AlT.LIZIZ(sbLIZ));
        return Base64.encodeToString(json.getBytes(Charsets.UTF_8), 0);
    }

    public final void LIZ() {
        C20441214yg.LIZIZ("RematchGuideButton", "onDestroy");
        setVisibility(false);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LL = null;
    }

    private final Map<String, String> getRecommendedPlaybookData() {
        String str;
        String str2;
        Playbook playbookLIZIZ = C978340bZA.LIZIZ();
        if (playbookLIZIZ == null) {
            return null;
        }
        PlaybookContent playbookContent = playbookLIZIZ.content;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("playbook_id", String.valueOf(playbookLIZIZ.playbookId));
        String str3 = playbookContent != null ? playbookContent.title : null;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        pairArr[1] = new Pair("playbook_title", str3);
        if (playbookContent == null || (str = playbookContent.description) == null) {
            str = "";
        }
        pairArr[2] = new Pair("playbook_description", str);
        if (playbookContent != null && (str2 = playbookContent.coverUrl) != null) {
            str4 = str2;
        }
        pairArr[3] = new Pair("playbook_image_urls", str4);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    public final void LIZJ(C979440baw c979440baw) {
        Map linkedHashMap;
        int iIntValue;
        InterfaceC1541990qEH kitView;
        Map<String, Object> globalProps;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RematchButtonUpdateEvent isEnabled: ");
        sbLIZ.append(c979440baw.LIZ);
        sbLIZ.append(" numHost: ");
        sbLIZ.append(c979440baw.LIZIZ);
        sbLIZ.append(", hasGuests: ");
        sbLIZ.append(c979440baw.LIZJ);
        C20441214yg.LIZIZ("RematchGuideButton", C2188811AlT.LIZIZ(sbLIZ));
        Boolean bool = c979440baw.LIZ;
        if (bool != null) {
            this.LLIZLLLIL = bool.booleanValue();
        }
        Integer num = c979440baw.LIZIZ;
        if (num != null) {
            this.LLILLL = num.intValue();
        }
        Boolean bool2 = c979440baw.LIZJ;
        if (bool2 != null) {
            this.LLJI = bool2.booleanValue();
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        Object obj = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null && (globalProps = kitView.getGlobalProps()) != null) {
            obj = globalProps.get("queryItems");
        }
        if (!C19719512Dh.LJII(obj) || (linkedHashMap = (Map) obj) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Uri uri = UriProtector.parse(this.LLIZ);
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                String strLIZIZ = C1942307jB.LIZIZ(uri, str);
                if (strLIZIZ != null) {
                    linkedHashMap.put(str, strLIZIZ);
                }
            }
        }
        linkedHashMap.put("is_enabled", Integer.valueOf(this.LLIZLLLIL ? 1 : 0));
        linkedHashMap.put("num_host", Integer.valueOf(this.LLILLL));
        linkedHashMap.put("current_battle_type", Integer.valueOf(this.LLILZ));
        linkedHashMap.put("target_battle_type", Integer.valueOf(this.LLILZIL));
        Integer num2 = this.LLILZLL;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        linkedHashMap.put("battle_result", Integer.valueOf(iIntValue));
        linkedHashMap.put("has_guests", Integer.valueOf(this.LLJI ? 1 : 0));
        linkedHashMap.put("extras", getExtrasString());
        C13DA c13da = new C13DA();
        c13da.put("queryItems", linkedHashMap);
        Map<String, ? extends Object> mapBuild = c13da.build();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateGlobalPropsByIncrement finalMap = ");
        sbLIZ2.append(mapBuild);
        C20441214yg.LIZIZ("RematchGuideButton", C2188811AlT.LIZIZ(sbLIZ2));
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.U0(mapBuild);
        }
    }

    public final void setVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, i);
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public C979420bau(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = "";
        this.LLIZLLLIL = true;
        this.LLJ = C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(androidx.lifecycle.LifecycleOwner r14, int r15, com.bytedance.ies.sdk.datachannel.DataChannel r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C979420bau.LIZIZ(androidx.lifecycle.LifecycleOwner, int, com.bytedance.ies.sdk.datachannel.DataChannel, kotlin.jvm.functions.Function0):void");
    }
}
