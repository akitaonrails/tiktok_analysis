package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateData;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.effect.adapter.EffectProfileViewHolder;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0MqG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580820MqG extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            case 3:
                onLoad$3(this, asyncAVService, j);
                break;
            case 4:
                onLoad$4(this, asyncAVService, j);
                break;
            case 5:
                onLoad$5(this, asyncAVService, j);
                break;
            case 6:
                onLoad$6(this, asyncAVService, j);
                break;
            case 7:
                onLoad$7(this, asyncAVService, j);
                break;
            case 8:
                onLoad$8(this, asyncAVService, j);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLoad$9(this, asyncAVService, j);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onLoad$10(this, asyncAVService, j);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onLoad$11(this, asyncAVService, j);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onLoad$12(this, asyncAVService, j);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onLoad$13(this, asyncAVService, j);
                break;
            case 14:
                onLoad$14(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C580820MqG(com.ss.android.ugc.aweme.services.external.ui.RecordConfig.Builder r2, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 1: goto Le;
                case 2: goto Le;
                case 3: goto L5;
                case 4: goto L5;
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C580820MqG.<init>(com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, int):void");
    }

    public static final void onLoad$0(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().editService().startEdit((Context) c580820MqG.l0, ((EditConfig.Builder) c580820MqG.l1).build());
    }

    public static final void onLoad$1(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        String creationId;
        Context sceneContext = ((MvChoosePhotoScene) c580820MqG.l0).getSceneContext();
        if (sceneContext != null) {
            asyncAVService.uiService().recordService().startRecord(sceneContext, ((RecordConfig.Builder) c580820MqG.l1).build());
        }
        C0LAB c0lab = new C0LAB();
        ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) c580820MqG.l0).shortVideoContext;
        String str = null;
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        ShortVideoContext shortVideoContext2 = ((MvChoosePhotoScene) c580820MqG.l0).shortVideoContext;
        if (shortVideoContext2 != null) {
            str = shortVideoContext2.shootWay;
        }
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("enter_from", "upload_page");
        c0lab.LIZ(((MvChoosePhotoScene) c580820MqG.l0).isPhotoProp() ? 1 : 0, "if_photo_prop");
        C20684815ws.LJIILLIIL("click_record_entrance", c0lab.LIZ);
    }

    public static final void onLoad$10(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        IAVDraftService iAVDraftServiceDraftService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iAVDraftServiceDraftService = iExternalService.draftService()) != null) {
            iAVDraftServiceDraftService.openDraftActivity(((C0M6M) c580820MqG.l0).LL, (Bundle) c580820MqG.l1);
        }
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null) {
            iSpecActService.LJJIJ();
        }
    }

    public static final void onLoad$11(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).draftService().openDraftActivity(((C0M6E) c580820MqG.l1).LLILZIL, (Bundle) c580820MqG.l0);
        ((ISpecActService) ServiceManager.get().getService(ISpecActService.class)).LJJIJ();
    }

    public static final void onLoad$12(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((C19768312Wb) c580820MqG.l0).mActivity, (RecordConfig) c580820MqG.l1);
    }

    public static final void onLoad$13(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().editService().startEdit((Context) c580820MqG.l0, (EditConfig) c580820MqG.l1);
    }

    public static final void onLoad$14(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord((Activity) c580820MqG.l0, ((RecordConfig.Builder) c580820MqG.l1).build());
    }

    public static final void onLoad$2(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        String creationId;
        Context sceneContext = ((MvChoosePhotoScene) c580820MqG.l0).getSceneContext();
        if (sceneContext != null) {
            asyncAVService.uiService().recordService().startRecord(sceneContext, ((RecordConfig.Builder) c580820MqG.l1).build());
        }
        C0LAB c0lab = new C0LAB();
        ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) c580820MqG.l0).shortVideoContext;
        String str = null;
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        ShortVideoContext shortVideoContext2 = ((MvChoosePhotoScene) c580820MqG.l0).shortVideoContext;
        if (shortVideoContext2 != null) {
            str = shortVideoContext2.shootWay;
        }
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("enter_from", "upload_page");
        C20684815ws.LJIILLIIL("click_record_entrance", c0lab.LIZ);
    }

    public static final void onLoad$3(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        TemplateData templateData;
        CreativeModel creativeModel;
        RecordConfig.Builder builder = (RecordConfig.Builder) c580820MqG.l0;
        ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) c580820MqG.l1).shortVideoContext;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            templateData = creativeModel.templateData;
        } else {
            templateData = null;
        }
        builder.setTemplateData(templateData);
        asyncAVService.uiService().recordService().startRecord(((MvChoosePhotoScene) c580820MqG.l1).requireActivity(), ((RecordConfig.Builder) c580820MqG.l0).build(), ((MvChoosePhotoScene) c580820MqG.l1).musicModel, false);
    }

    public static final void onLoad$4(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        TemplateData templateData;
        String creationId;
        CreativeModel creativeModel;
        RecordConfig.Builder builder = (RecordConfig.Builder) c580820MqG.l0;
        ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) c580820MqG.l1).shortVideoContext;
        String str = null;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
            templateData = creativeModel.templateData;
        } else {
            templateData = null;
        }
        builder.setTemplateData(templateData);
        asyncAVService.uiService().recordService().startRecord(((MvChoosePhotoScene) c580820MqG.l1).requireActivity(), ((RecordConfig.Builder) c580820MqG.l0).build(), ((MvChoosePhotoScene) c580820MqG.l1).musicModel, false);
        C0LAB c0lab = new C0LAB();
        ShortVideoContext shortVideoContext2 = ((MvChoosePhotoScene) c580820MqG.l1).shortVideoContext;
        if (shortVideoContext2 != null) {
            creationId = shortVideoContext2.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        ShortVideoContext shortVideoContext3 = ((MvChoosePhotoScene) c580820MqG.l1).shortVideoContext;
        if (shortVideoContext3 != null) {
            str = shortVideoContext3.shootWay;
        }
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("enter_from", "upload_page");
        C531700KtE.LIZ(c0lab, ((MvChoosePhotoScene) c580820MqG.l1).shortVideoContext);
        C20684815ws.LJIILLIIL("click_record_entrance", c0lab.LIZ);
    }

    public static final void onLoad$5(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        String creationId;
        TemplateData templateData;
        CreativeModel creativeModel;
        Context sceneContext = ((MvChoosePhotoScene) c580820MqG.l0).getSceneContext();
        String str = null;
        if (sceneContext != null) {
            RecordConfig.Builder builder = (RecordConfig.Builder) c580820MqG.l1;
            ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) c580820MqG.l0).shortVideoContext;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
                templateData = creativeModel.templateData;
            } else {
                templateData = null;
            }
            builder.setTemplateData(templateData);
            asyncAVService.uiService().recordService().startRecord(sceneContext, builder.build());
        }
        C0LAB c0lab = new C0LAB();
        ShortVideoContext shortVideoContext2 = ((MvChoosePhotoScene) c580820MqG.l0).shortVideoContext;
        if (shortVideoContext2 != null) {
            creationId = shortVideoContext2.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        ShortVideoContext shortVideoContext3 = ((MvChoosePhotoScene) c580820MqG.l0).shortVideoContext;
        if (shortVideoContext3 != null) {
            str = shortVideoContext3.shootWay;
        }
        c0lab.LJ("shoot_way", str);
        c0lab.LJ("enter_from", "upload_page");
        C531700KtE.LIZ(c0lab, ((MvChoosePhotoScene) c580820MqG.l0).shortVideoContext);
        C20684815ws.LJIILLIIL("click_record_entrance", c0lab.LIZ);
    }

    public static final void onLoad$6(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((DetailFragment) c580820MqG.l1).getActivity(), ((RecordConfig.Builder) c580820MqG.l0).build());
    }

    public static final void onLoad$7(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        IAVDraftService iAVDraftServiceDraftService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iAVDraftServiceDraftService = iExternalService.draftService()) != null) {
            iAVDraftServiceDraftService.openDraftActivity(((C536350L1t) c580820MqG.l0).LIZIZ.LJJIZ(), (Bundle) c580820MqG.l1);
        }
    }

    public static final void onLoad$8(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        Activity activityLIZ = C1388190mED.LIZ(((EffectProfileViewHolder) c580820MqG.l0).itemView.getContext());
        if (activityLIZ == null) {
            return;
        }
        asyncAVService.uiService().recordService().startRecord(activityLIZ, ((RecordConfig.Builder) c580820MqG.l1).build());
    }

    public static final void onLoad$9(C580820MqG c580820MqG, AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(((EffectProfileViewHolder) c580820MqG.l0).itemView.getContext(), ((RecordConfig.Builder) c580820MqG.l1).build());
    }

    public C580820MqG(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
