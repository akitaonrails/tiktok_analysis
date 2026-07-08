package Y;

import X.C0I6Y;
import X.C0LOK;
import X.C0MU2;
import X.C0MXL;
import X.C0MXP;
import X.C0P0T;
import X.C1388190mED;
import X.C13BV;
import X.C1450080nq2;
import X.C1664600tQ2;
import X.C1DRG;
import X.C201955140j;
import X.C2188811AlT;
import X.C238400w2;
import X.C523900Kge;
import X.C525050KiV;
import X.C528230Knd;
import X.C529740Kq4;
import X.C529750Kq5;
import X.C547860LeC;
import X.C549150LgH;
import X.C549720LhC;
import X.C550740Liq;
import X.C570010MXf;
import X.C570020MXg;
import X.C570530MZf;
import X.InterfaceC522120Kdm;
import X.InterfaceC522940Kf6;
import X.InterfaceC558600LvW;
import X.InterfaceC570030MXh;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.creative.model.album.AlbumOpenApiModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumSupportTab;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratedReusedUISlot;
import com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard;
import com.ss.android.ugc.tools.chat.data.TaskInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ACListenerS75S0300000_8 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS75S0300000_8 aCListenerS75S0300000_8, View view) {
        List<TikTokMediaModel> listLIZJ;
        InterfaceC522940Kf6 interfaceC522940Kf6;
        InterfaceC522120Kdm interfaceC522120Kdm = ((MvChoosePhotoScene) aCListenerS75S0300000_8.l0).videoImageMixedController;
        if (interfaceC522120Kdm == null || (listLIZJ = interfaceC522120Kdm.LIZJ()) == null) {
            listLIZJ = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (TikTokMediaModel tikTokMediaModel : listLIZJ) {
            if (tikTokMediaModel.LJIIJ()) {
                arrayList.add(tikTokMediaModel);
            }
        }
        int size = arrayList.size();
        int size2 = listLIZJ.size() - size;
        int i = ((MvChoosePhotoScene) aCListenerS75S0300000_8.l0).supportFlags;
        C523900Kge c523900Kge = AlbumSupportTab.Companion;
        c523900Kge.getClass();
        AlbumSupportTab albumSupportTab = AlbumSupportTab.PHOTO;
        if ((albumSupportTab.flag & i) != 0 && size >= ((MvChoosePhotoScene) aCListenerS75S0300000_8.l0).maxPhotoSelectCount) {
            c523900Kge.getClass();
            i ^= albumSupportTab.flag;
        }
        c523900Kge.getClass();
        AlbumSupportTab albumSupportTab2 = AlbumSupportTab.VIDEO;
        if ((albumSupportTab2.flag & i) != 0 && size2 >= ((MvChoosePhotoScene) aCListenerS75S0300000_8.l0).maxVideoSelectCount) {
            c523900Kge.getClass();
            i ^= albumSupportTab2.flag;
        }
        c523900Kge.getClass();
        int i2 = albumSupportTab2.flag;
        c523900Kge.getClass();
        if (((i2 | albumSupportTab.flag) & i) == 0) {
            return;
        }
        ((AlbumOpenApiModel) aCListenerS75S0300000_8.l1).setSupportFlags(i);
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ((MvChoosePhotoScene) aCListenerS75S0300000_8.l0);
        if (c1drgLJIIIZ != null && (interfaceC522940Kf6 = (InterfaceC522940Kf6) c1drgLJIIIZ.LJIIL(null, InterfaceC522940Kf6.class)) != null) {
            interfaceC522940Kf6.LC();
        }
        super/*X.0KhD*/.getClickListener().onClick(view);
    }

    public static final void onClick$1(ACListenerS75S0300000_8 aCListenerS75S0300000_8, View view) {
        LivePhotoPreviewMode livePhotoPreviewMode;
        C529740Kq4 c529740Kq4 = (C529740Kq4) aCListenerS75S0300000_8.l0;
        C529750Kq5 c529750Kq5 = (C529750Kq5) aCListenerS75S0300000_8.l1;
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) aCListenerS75S0300000_8.l2;
        c529740Kq4.getClass();
        String str = null;
        if (tikTokMediaModel.LJIIJJI()) {
            LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
            if (livePhotoInfo == null) {
                livePhotoInfo = new LivePhotoInfo();
                tikTokMediaModel.livePhotoInfo = livePhotoInfo;
            }
            String livePhotoPreviewMode2 = livePhotoInfo.getLivePhotoPreviewMode();
            LivePhotoPreviewMode livePhotoPreviewMode3 = LivePhotoPreviewMode.STATIC;
            if (livePhotoPreviewMode3.name().equals(livePhotoPreviewMode2)) {
                livePhotoPreviewMode = livePhotoPreviewMode3;
                livePhotoPreviewMode3 = LivePhotoPreviewMode.LIVE_PHOTO;
            } else if (livePhotoPreviewMode3.name().equals(livePhotoPreviewMode2)) {
                livePhotoPreviewMode = livePhotoPreviewMode3;
            } else {
                livePhotoPreviewMode = LivePhotoPreviewMode.LOOP;
                if (!livePhotoPreviewMode.name().equals(livePhotoPreviewMode2)) {
                    livePhotoPreviewMode = LivePhotoPreviewMode.LIVE_PHOTO;
                }
            }
            livePhotoInfo.setLivePhotoPreviewMode(livePhotoPreviewMode3.name());
            livePhotoInfo.setHasUserClickedIcon(true);
            C528230Knd c528230Knd = c529740Kq4.LLJZ.LJII;
            String str2 = c528230Knd.LIZIZ;
            String str3 = c528230Knd.LIZ;
            if (c529740Kq4.LLJLILLLLZIIL == 35) {
                str = "comment";
            }
            C570530MZf.LIZLLL("upload_page", livePhotoPreviewMode, livePhotoPreviewMode3, str2, str3, "upload", "live", str);
            C525050KiV.LIZIZ(tikTokMediaModel, c529740Kq4.LLJ);
            int bindingAdapterPosition = c529750Kq5.getBindingAdapterPosition();
            if (bindingAdapterPosition != -1) {
                c529740Kq4.notifyItemChanged(bindingAdapterPosition);
            }
            if (c529740Kq4.LLLLIL != null) {
                C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[LivePhotoSync] handleLivePhotoIconClick: notify via SyncManager, mediaId=");
                sbLIZ.append(((MediaModel) tikTokMediaModel).id);
                sbLIZ.append(", mode=");
                sbLIZ.append(livePhotoPreviewMode3.name());
                C201955140j.LIZLLL(c1450080nq2, "livephoto", C2188811AlT.LIZIZ(sbLIZ));
                c529740Kq4.LLLLIL.LIZ(tikTokMediaModel, c529740Kq4);
                return;
            }
            C201955140j.LIZLLL(C1450080nq2.LIZIZ, "livephoto", "[LivePhotoSync] handleLivePhotoIconClick: SyncManager is null, skip sync");
        }
    }

    public static final void onClick$2(ACListenerS75S0300000_8 aCListenerS75S0300000_8, View view) {
        Activity activityLIZ;
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        IcAigcCommonMessageCard icAigcCommonMessageCard;
        TaskInfo taskInfo;
        String str;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) != null && interfaceC558600LvWLIZIZ.LJ()) {
            C0MU2 c0mu2 = C0MU2.LIZ;
            String conversationId = C0I6Y.LIZ((C0MXL) aCListenerS75S0300000_8.l1).getConversationId();
            Integer numValueOf = Integer.valueOf(((C0MXL) aCListenerS75S0300000_8.l1) instanceof C0MXP ? 1 : 0);
            c0mu2.getClass();
            C0MU2.LIZJ(numValueOf, conversationId, "generate_aitheater_video_success");
            Context context = ((AITheaterSocialGeneratedReusedUISlot) aCListenerS75S0300000_8.l0).getContext();
            if (context != null && (icAigcCommonMessageCard = (IcAigcCommonMessageCard) aCListenerS75S0300000_8.l2) != null && (taskInfo = icAigcCommonMessageCard.taskInfo) != null && (str = taskInfo.taskId) != null) {
                C547860LeC.LIZ.getClass();
                C547860LeC.LJFF().LIZLLL(context, new AIGCDraft(C0LOK.LIZ, true, str, AIGCEntranceInfo.LIZ(C550740Liq.LIZ("generate_aitheater_video_success_no_draft", AIGC.AICreationSceneName.GENERATE_AITHEATER_VIDEO_SUCCESS_NO_DRAFT.INSTANCE, AIGC.RefPageName.Chat.INSTANCE, false), null, null, 0, null, null, false, false, false, null, null, "chat", null, AIGC.RecallWay.GENERATE_AITHEATER_VIDEO_SUCCESS.INSTANCE, null, false, false, 1038335), null, null));
                return;
            }
            return;
        }
        C549150LgH c549150LgH = C549150LgH.LIZ;
        Context context2 = ((AITheaterSocialGeneratedReusedUISlot) aCListenerS75S0300000_8.l0).getContext();
        if (context2 != null) {
            activityLIZ = C1388190mED.LIZ(context2);
        } else {
            activityLIZ = null;
        }
        c549150LgH.getClass();
        C549150LgH.LIZJ(activityLIZ);
    }

    public static final void onClick$3(ACListenerS75S0300000_8 aCListenerS75S0300000_8, View view) {
        C0P0T c0p0t;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C238400w2 c238400w2 = (C238400w2) aCListenerS75S0300000_8.l0;
        if (jCurrentTimeMillis - c238400w2.element <= 500) {
            return;
        }
        c238400w2.element = System.currentTimeMillis();
        InterfaceC570030MXh interfaceC570030MXh = ((C570010MXf) aCListenerS75S0300000_8.l1).LIZLLL;
        if (interfaceC570030MXh != null) {
            interfaceC570030MXh.LIZ(((C570020MXg) aCListenerS75S0300000_8.l2).LIZIZ);
        }
        ((C570020MXg) aCListenerS75S0300000_8.l2).LJ.invoke();
        C570010MXf c570010MXf = (C570010MXf) aCListenerS75S0300000_8.l1;
        c570010MXf.LJIIIZ = true;
        if (c570010MXf.LJIIJ && (c0p0t = c570010MXf.LJIIIIZZ) != null) {
            c0p0t.dismiss();
        }
    }

    public ACListenerS75S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
