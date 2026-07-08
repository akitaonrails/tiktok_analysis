package X;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.IEcosystemService;
import com.ss.android.ugc.aweme.feed.model.AnalyticsEntranceStatus;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.CreatorAnalytics;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233340iCS extends FrameLayout {
    public String LL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLILLJJLI;
    public Aweme LLILLL;

    public C1233340iCS(Context context) {
        super(context, null, 0);
        this.LL = "";
    }

    @C14EU
    public final void onAuthChangeEvent(C2036907yR c2036907yR) {
        if (c2036907yR != null && c2036907yR.LIZIZ) {
            LIZ(this.LLILLL, EnumC993280bxG.AUTHORIZE_CHANGE, "");
        }
    }

    @C14EU
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        String uid;
        if (c888460YtI == null) {
            return;
        }
        Aweme aweme = this.LLILLL;
        EnumC993280bxG enumC993280bxG = EnumC993280bxG.BLOCK_USER;
        User user = c888460YtI.LIZ;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        LIZ(aweme, enumC993280bxG, uid);
    }

    @C14EU
    public final void onOpenPrivacySetting(InterfaceC1874530ysd interfaceC1874530ysd) {
        Aweme awemeLJ = ((IEcosystemService) ServiceManager.get().getService(IEcosystemService.class)).LJ(interfaceC1874530ysd.getAwemeID());
        if (awemeLJ != null) {
            ShareDependService.LIZ.getClass();
            ShareDependServiceImpl.LJJJJI().LJIJJ(getContext(), awemeLJ, "", interfaceC1874530ysd.getEnterFrom(), interfaceC1874530ysd.getEnterMethod(), "", false, false);
        }
    }

    @C14EU
    public final void onOpenViewListAuthDialog(InterfaceC1874480ysY interfaceC1874480ysY) {
        String aid;
        Aweme awemeLJ = ((IEcosystemService) ServiceManager.get().getService(IEcosystemService.class)).LJ(interfaceC1874480ysY.getAwemeID());
        Context context = getContext();
        String enterFrom = interfaceC1874480ysY.getEnterFrom();
        String str = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        if (awemeLJ != null && (aid = awemeLJ.getAid()) != null) {
            str = aid;
        }
        C745610TMp.LIZ(context, enterFrom, false, str, new DialogInterface.OnDismissListener() { // from class: X.0iCU
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        });
    }

    @C14EU
    public final void onPrivateModelEvent(C697110RWb c697110RWb) {
        Aweme aweme;
        Aweme aweme2;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CreatorAnalytics creatorAnalytics;
        if (c697110RWb == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrivateModelEvent event= ");
        sbLIZ.append(c697110RWb.LIZJ);
        C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
        if (c697110RWb.LIZJ == 0 && (aweme = this.LLILLL) != null && (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - aweme.getCreateTime() < 31536000 && (aweme2 = this.LLILLL) != null && (contentModel = aweme2.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (creatorAnalytics = standardBusinessModel.getCreatorAnalytics()) != null) {
            creatorAnalytics.setCreatorAnalyticsEntranceStatus(Integer.valueOf(AnalyticsEntranceStatus.SHOW_ENTRANCE_WITH_PRIVACY_SETTINGS.getValue()));
        }
    }

    @C14EU
    public final void onUpdatePrivacySettingEvent(C2037307yV c2037307yV) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdatePrivacySettingEvent by ");
        if (c2037307yV != null) {
            str = c2037307yV.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
        LIZ(this.LLILLL, EnumC993280bxG.UPDATE_PRIVACY_SETTING, "");
    }

    @C14EU
    public final void onVideoViewHistoryAuthorizationPopShowEvent(C745650TMt c745650TMt) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ("viewListAuthDialogShow", new JSONObject());
        }
    }

    public final void LIZ(Aweme aweme, EnumC993280bxG enumC993280bxG, String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        if (aweme != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLJJLI) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("awemeID", aweme.getAid());
            jSONObject.put("type", enumC993280bxG.getValue());
            jSONObject.put("userID", str);
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ("refresh", jSONObject);
        }
    }
}
