package Y;

import X.C09JN;
import X.C0TME;
import X.C1172580gcS;
import X.C1389890mGx;
import X.C13LP;
import X.C19322110iZ;
import X.C197039127h;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C746640TQo;
import X.C786410Ut5;
import X.C921440a5O;
import X.InterfaceC742240T9q;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.adminsetting.LiveCommentEducationBlockKeywordsFragmentSheet;
import com.bytedance.android.livesdk.adminsetting.fastaddblockwords.LiveFastAddBlockKeywordsDialog;
import com.bytedance.android.livesdk.adminsetting.fastfiltercomment.FastFilterCommentFragmentSheet;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.serviceplugin.AddServicePluginAnchorActivity;
import com.ss.android.ugc.aweme.serviceplugin.entity.ServicePluginPageText;
import com.ss.android.ugc.aweme.serviceplugin.entity.ServicePluginUrlValidateResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.CommentFlaggedPrompt;
import webcast.api.room.RecommendSensitiveWordResp;
import webcast.api.room.SensitiveWordPromptForNewUser;

/* JADX INFO: loaded from: classes13.dex */
public class AfS45S1100000_12 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public AfS45S1100000_12(FragmentManager fragmentManager, int i) {
        this.$t = i;
        this.l1 = fragmentManager;
        this.s0 = "LiveFastAddBlockKeywordsDialog";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS45S1100000_12 afS45S1100000_12, Object obj) {
        List<Long> list;
        List<Long> list2;
        C1C7U.LIZ("AdminSettingService@d467.checkFastSuggestTools$disposable$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        FragmentManager fragmentManager = (FragmentManager) afS45S1100000_12.l1;
        if (fragmentManager != null && !fragmentManager.LJL()) {
            List<String> list3 = ((RecommendSensitiveWordResp.ResponseData) baseResponse.data).wordList;
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList(list3);
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJIL(bundle, "key_block_keywords_list", arrayList);
                SensitiveWordPromptForNewUser sensitiveWordPromptForNewUser = ((RecommendSensitiveWordResp.ResponseData) baseResponse.data).sensitiveWordPrompt;
                if (sensitiveWordPromptForNewUser != null && (list2 = sensitiveWordPromptForNewUser.commentIds) != null) {
                    bundle.putLongArray("trigger_comment_id", C13LP.LLIIIILZ(list2));
                }
                SensitiveWordPromptForNewUser sensitiveWordPromptForNewUser2 = ((RecommendSensitiveWordResp.ResponseData) baseResponse.data).sensitiveWordPrompt;
                if (sensitiveWordPromptForNewUser2 != null && sensitiveWordPromptForNewUser2.show) {
                    C19322110iZ.LIZLLL((FragmentManager) afS45S1100000_12.l1, LiveCommentEducationBlockKeywordsFragmentSheet.class, "live_comment_education_block_keywords_dialog", null, bundle);
                } else {
                    LiveFastAddBlockKeywordsDialog liveFastAddBlockKeywordsDialog = new LiveFastAddBlockKeywordsDialog();
                    liveFastAddBlockKeywordsDialog.setArguments(bundle);
                    liveFastAddBlockKeywordsDialog.show((FragmentManager) afS45S1100000_12.l1, afS45S1100000_12.s0);
                }
            } else {
                RecommendSensitiveWordResp.ResponseData responseData = (RecommendSensitiveWordResp.ResponseData) baseResponse.data;
                CommentFlaggedPrompt commentFlaggedPrompt = responseData.prompt;
                if (commentFlaggedPrompt != null) {
                    SensitiveWordPromptForNewUser sensitiveWordPromptForNewUser3 = responseData.sensitiveWordPrompt;
                    FragmentManager fragmentManager2 = (FragmentManager) afS45S1100000_12.l1;
                    Bundle bundle2 = new Bundle();
                    String string = Long.valueOf(commentFlaggedPrompt.trigger).toString();
                    String str = "";
                    if (string == null) {
                        string = "";
                    }
                    C786410Ut5.LJJJI("trigger", string, bundle2);
                    String string2 = Long.valueOf(commentFlaggedPrompt.action).toString();
                    if (string2 != null) {
                        str = string2;
                    }
                    C786410Ut5.LJJJI("action", str, bundle2);
                    if (sensitiveWordPromptForNewUser3 != null && (list = sensitiveWordPromptForNewUser3.commentIds) != null) {
                        bundle2.putLongArray("trigger_comment_id", C13LP.LLIIIILZ(list));
                    }
                    C19322110iZ.LIZLLL(fragmentManager2, FastFilterCommentFragmentSheet.class, "fast_community_flagged", null, bundle2);
                }
            }
        }
        C1C7U.LIZIZ("AdminSettingService@d467.checkFastSuggestTools$disposable$1");
    }

    public static final void accept$1(AfS45S1100000_12 afS45S1100000_12, Object obj) {
        C1C7U.LIZ("CoHostRefreshUserHelper@8ffc.handleRefreshUser$refreshUserDisposable$3");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callSource=");
        sbLIZ.append(afS45S1100000_12.s0);
        sbLIZ.append(", handleRefreshUser: onError = ");
        sbLIZ.append(((Throwable) obj).getMessage());
        C20441214yg.LJIIIZ("CoHostRefreshUserHelper", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC742240T9q interfaceC742240T9q = (InterfaceC742240T9q) afS45S1100000_12.l1;
        if (interfaceC742240T9q != null) {
            interfaceC742240T9q.LIZ();
        }
        C1C7U.LIZIZ("CoHostRefreshUserHelper@8ffc.handleRefreshUser$refreshUserDisposable$3");
    }

    public static final void accept$2(AfS45S1100000_12 afS45S1100000_12, Object obj) {
        C1C7U.LIZ("CollectionListFragmentForMineProfile@346.onClickViewHolderToCreateCollection$createCollection$1$2");
        Throwable th = (Throwable) obj;
        if (!C746640TQo.LIZ(th, (C19EG) afS45S1100000_12.l1, false)) {
            C1389890mGx c1389890mGx = new C1389890mGx((C19EG) afS45S1100000_12.l1);
            c1389890mGx.LJIIIZ(2131834207);
            c1389890mGx.LJIIJJI();
        }
        C1172580gcS.LIZIZ(afS45S1100000_12.s0, th);
        C1C7U.LIZIZ("CollectionListFragmentForMineProfile@346.onClickViewHolderToCreateCollection$createCollection$1$2");
    }

    public static final void accept$3(AfS45S1100000_12 afS45S1100000_12, Object obj) {
        C1C7U.LIZ("VoiceChatAnchorPresenter@f74d.permitCountDown$1");
        if (((long) 5) - ((Number) obj).longValue() == 1) {
            ((C921440a5O) afS45S1100000_12.l1).LLIZ.remove(afS45S1100000_12.s0);
        }
        C1C7U.LIZIZ("VoiceChatAnchorPresenter@f74d.permitCountDown$1");
    }

    public static final void accept$4(AfS45S1100000_12 afS45S1100000_12, Object obj) {
        C1C7U.LIZ("QuickFavoriteManager@2914.collectionDetailClick$2$ignore$2");
        C1389890mGx c1389890mGx = new C1389890mGx((C19EG) afS45S1100000_12.l1);
        c1389890mGx.LJIIIZ(2131834207);
        c1389890mGx.LJIIJJI();
        C1172580gcS.LIZIZ(afS45S1100000_12.s0, (Throwable) obj);
        C1C7U.LIZIZ("QuickFavoriteManager@2914.collectionDetailClick$2$ignore$2");
    }

    public static final void accept$5(AfS45S1100000_12 afS45S1100000_12, Object obj) {
        C197039127h c197039127h;
        ServicePluginPageText next;
        TuxTextView tuxTextView;
        C1C7U.LIZ("AddServicePluginAnchorActivity@a4d7.validateUrl$1");
        ServicePluginUrlValidateResponse servicePluginUrlValidateResponse = (ServicePluginUrlValidateResponse) obj;
        Boolean bool = servicePluginUrlValidateResponse.isBindable;
        if (bool != null) {
            AddServicePluginAnchorActivity addServicePluginAnchorActivity = (AddServicePluginAnchorActivity) afS45S1100000_12.l1;
            String str = afS45S1100000_12.s0;
            boolean zBooleanValue = bool.booleanValue();
            C197039127h c197039127h2 = addServicePluginAnchorActivity.LLILZ;
            if (c197039127h2 != null) {
                c197039127h2.setEnabled(zBooleanValue);
            }
            if (zBooleanValue) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("artist_id", ((IAccountUserService) addServicePluginAnchorActivity.LLJJIJI.getValue()).getCurUser().getUid());
                c2344009Gk.LJIIIIZZ("platform", addServicePluginAnchorActivity.LLJJJ);
                c2344009Gk.LJIIIIZZ("enter_from", AddServicePluginAnchorActivity.LLLLLZL(addServicePluginAnchorActivity.getIntent(), "enter_from"));
                c2344009Gk.LJIIIIZZ("validated_url", str);
                C20684815ws.LJIILLIIL("tkt_platform_confirm_show", c2344009Gk.LIZ);
            }
        }
        String str2 = servicePluginUrlValidateResponse.entityId;
        if (str2 != null) {
            ((AddServicePluginAnchorActivity) afS45S1100000_12.l1).LLJJIJIIJIL = str2;
        }
        List<ServicePluginPageText> list = servicePluginUrlValidateResponse.textList;
        ServicePluginPageText servicePluginPageText = null;
        if (list != null) {
            Iterator<ServicePluginPageText> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.key, "link_entity_hint_text")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            ServicePluginPageText servicePluginPageText2 = next;
            if (servicePluginPageText2 != null && (tuxTextView = ((AddServicePluginAnchorActivity) afS45S1100000_12.l1).LLILZIL) != null) {
                tuxTextView.setText(servicePluginPageText2.content);
            }
        }
        List<ServicePluginPageText> list2 = servicePluginUrlValidateResponse.textList;
        if (list2 != null) {
            Iterator<ServicePluginPageText> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ServicePluginPageText next2 = it3.next();
                if (Intrinsics.LJFF(next2.key, "service_plugin_confirm_button")) {
                    servicePluginPageText = next2;
                    break;
                }
            }
            ServicePluginPageText servicePluginPageText3 = servicePluginPageText;
            if (servicePluginPageText3 != null && (c197039127h = ((AddServicePluginAnchorActivity) afS45S1100000_12.l1).LLILZ) != null) {
                c197039127h.setText(servicePluginPageText3.content);
            }
        }
        C1C7U.LIZIZ("AddServicePluginAnchorActivity@a4d7.validateUrl$1");
    }

    public static final void accept$6(AfS45S1100000_12 afS45S1100000_12, Object obj) {
        C1C7U.LIZ("ProfileViewerAuthDialogTask@1c23.onDialogDismiss$1$disposable$1");
        C0TME c0tme = (C0TME) afS45S1100000_12.l1;
        String str = afS45S1100000_12.s0;
        c0tme.getClass();
        C0TME.LJIILJJIL(1, str);
        C0TME c0tme2 = (C0TME) afS45S1100000_12.l1;
        int statusCode = ((com.ss.android.ugc.aweme.network.model.BaseResponse) obj).getStatusCode();
        c0tme2.getClass();
        C0TME.LJIILIIL(1, 1, statusCode);
        C1C7U.LIZIZ("ProfileViewerAuthDialogTask@1c23.onDialogDismiss$1$disposable$1");
    }

    public AfS45S1100000_12(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
