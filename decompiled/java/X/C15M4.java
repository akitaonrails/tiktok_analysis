package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.creative.model.CollectMusicModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.HashtagsModel;
import com.ss.android.ugc.aweme.creative.model.HighLightVideoParametersModel;
import com.ss.android.ugc.aweme.creative.model.ProfileParametersModel;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.AddYoursAvatarHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS158S0400000_31;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15M4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15M4 extends SimpleServiceLoadCallback {
    public final /* synthetic */ C634930OvL LIZ;
    public final /* synthetic */ C259800zU<String> LIZIZ;
    public final /* synthetic */ C259800zU<Effect> LIZJ;
    public final /* synthetic */ MusicModel LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        String text;
        String str;
        String str2;
        String str3;
        String text2;
        Object topicId;
        String musicSelectedFrom;
        boolean z;
        boolean z2;
        List<AddYoursAvatar> listLIZ;
        List<AddYoursAvatar> userAvatars;
        AddYoursStickerStruct addYoursStickerStruct;
        List<AddYoursAvatar> userAvatars2;
        String stickerIDs;
        C634930OvL c634930OvL = this.LIZ;
        c634930OvL.LIZJ.setAddYoursFromGroupContent(C0OB3.LIZ(c634930OvL.LIZIZ));
        String str4 = this.LIZIZ.element;
        AddYourRecordParam addYourRecordParam = this.LIZ.LIZJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String enterFrom = addYourRecordParam.getEnterFrom();
        String str5 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        c2344009Gk.LJFF("enter_from", enterFrom);
        String shootWay = addYourRecordParam.getShootWay();
        if (shootWay == null) {
            shootWay = "add_yours";
        }
        c2344009Gk.LJFF("shoot_way", shootWay);
        c2344009Gk.LJFF("creation_id", str4);
        String addYoursEnterMethod = addYourRecordParam.getAddYoursEnterMethod();
        if (addYoursEnterMethod == null) {
            addYoursEnterMethod = "";
        }
        c2344009Gk.LJFF("add_yours_enter_method", addYoursEnterMethod);
        AddYoursStickerStruct addYoursStickerStruct2 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct2 != null) {
            text = addYoursStickerStruct2.getText();
        } else {
            text = null;
        }
        String str6 = "1";
        if (C123100dR.LIZ(text)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_add_yours", str);
        c2344009Gk.LJ(addYourRecordParam.getTrendSource(), "trend_source");
        AddYoursStickerStruct addYoursStickerStruct3 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct3 == null || addYoursStickerStruct3.getTopicId() == null) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_initiator", str2);
        AddYoursStickerStruct addYoursStickerStruct4 = addYourRecordParam.getAddYoursStickerStruct();
        boolean zIsPhotoMode = false;
        if (addYoursStickerStruct4 != null && Intrinsics.LJFF(addYoursStickerStruct4.getViewerInvited(), Boolean.TRUE)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_invited", str3);
        AddYoursStickerStruct addYoursStickerStruct5 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct5 == null || (text2 = addYoursStickerStruct5.getText()) == null) {
            text2 = "";
        }
        c2344009Gk.LJFF("add_yours_title", text2);
        String fromGroupId = addYourRecordParam.getFromGroupId();
        if (fromGroupId == null) {
            fromGroupId = "";
        }
        c2344009Gk.LJFF("from_group_id", fromGroupId);
        AddYoursStickerStruct addYoursStickerStruct6 = addYourRecordParam.getAddYoursStickerStruct();
        if ((addYoursStickerStruct6 != null && addYoursStickerStruct6.getTopicId() != null) || C08A4.LIZ(addYourRecordParam.isOperationSet())) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_first_author", str6);
        AddYoursStickerStruct addYoursStickerStruct7 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct7 == null || (topicId = addYoursStickerStruct7.getTopicId()) == null) {
            topicId = "";
        }
        c2344009Gk.LJ(topicId, "add_yours_id");
        String followStatus = addYourRecordParam.getFollowStatus();
        if (followStatus != null) {
            str5 = followStatus;
        }
        c2344009Gk.LJFF("follow_status", str5);
        String musicSelectedFrom2 = addYourRecordParam.getMusicSelectedFrom();
        if (musicSelectedFrom2 == null || musicSelectedFrom2.length() == 0) {
            musicSelectedFrom = "add_yours";
        } else {
            musicSelectedFrom = addYourRecordParam.getMusicSelectedFrom();
        }
        c2344009Gk.LJFF("music_selected_from", musicSelectedFrom);
        c2344009Gk.LJ(addYourRecordParam.isOperationSet(), "is_operation_set");
        c2344009Gk.LJFF("group_id", C1443560nfW.LJIIIIZZ());
        String addYoursFromGroupContent = addYourRecordParam.getAddYoursFromGroupContent();
        if (addYoursFromGroupContent != null) {
            c2344009Gk.LJFF("add_yours_from_group_content", addYoursFromGroupContent);
        }
        C20684815ws.LJIILLIIL("shoot", c2344009Gk.LIZ);
        String musicSelectedFrom3 = this.LIZ.LIZJ.getMusicSelectedFrom();
        if (musicSelectedFrom3 == null || musicSelectedFrom3.length() == 0) {
            musicSelectedFrom3 = "add_yours";
        }
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(this.LIZIZ.element);
        builder.startRecordTime(System.currentTimeMillis());
        builder.decompressTime(j);
        String shootWay2 = this.LIZ.LIZJ.getShootWay();
        if (shootWay2 == null) {
            shootWay2 = "add_yours";
        }
        builder.shootWay(shootWay2);
        builder.enterMethod("add_yours");
        builder.translationType(C298070BmH.LIZ());
        builder.musicOrigin(musicSelectedFrom3);
        builder.videoLength(Integer.valueOf(this.LIZ.LJIIIZ));
        Number landingBack = this.LIZ.LIZJ.getLandingBack();
        if (landingBack != null && landingBack.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        builder.landingBack(z);
        if (this.LIZ.LIZIZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        builder.recordFromFeed(z2);
        builder.autoOpenAlbum(Boolean.valueOf(this.LIZ.LIZJ.getAutoOpenAlbum()));
        Effect effect = this.LIZJ.element;
        if (effect != null && this.LIZLLL != null) {
            builder.musicWithSticker(effect);
            Aweme aweme = this.LIZ.LIZIZ;
            if (aweme != null) {
                stickerIDs = aweme.getStickerIDs();
            } else {
                stickerIDs = null;
            }
            if (!TextUtils.isEmpty(stickerIDs)) {
                this.LIZ.getClass();
                builder.stickers(C634930OvL.LIZ(stickerIDs));
                this.LIZ.getClass();
                ArrayList arrayListLIZ = C634930OvL.LIZ(stickerIDs);
                if (!arrayListLIZ.isEmpty()) {
                    builder.musicSticker((String) ListProtector.get(arrayListLIZ, 0));
                }
            }
        }
        if (this.LIZLLL == null && this.LJ == null && C703302op.LIZ(this.LIZ.LIZJ.getMusicId())) {
            builder.musicId(this.LIZ.LIZJ.getMusicId());
            builder.permissionActivityRequired(true);
        }
        if (this.LIZJ.element == null && C703302op.LIZ(this.LIZ.LIZJ.getEffectId())) {
            builder.sticker(this.LIZ.LIZJ.getEffectId());
        }
        builder.initialInputModel(new CreativeInitialModel(new ProfileParametersModel(""), new DMCameraModel(false, null, "", false, false, false, "", null, -1, false, 0, "", -1, "", "", false, false, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, false, null, true, false, "", null, null, 0L, false, null, null, null, null), null, null, null, null, null, null, new HighLightVideoParametersModel(null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, 2097151, null), null, null, null, new WWAModel(this.LIZ.LIZJ.getCompletedEvent(), this.LIZ.LIZJ.getWwaCampaignId(), this.LIZ.LIZJ.getWwaSourcePlatformChannel(), this.LIZ.LIZJ.getWwaBackUrl(), this.LIZ.LIZJ.getWwaShowStoryButton(), false, null), new HashtagsModel(this.LIZ.LIZJ.getHashTags(), 2), null, null, null, null, null, null, null, new CollectMusicModel(null, false, false, false, false, null)));
        AddYoursStickerStruct addYoursStickerStruct8 = this.LIZ.LIZJ.getAddYoursStickerStruct();
        if (addYoursStickerStruct8 == null || (userAvatars2 = addYoursStickerStruct8.getUserAvatars()) == null || userAvatars2.isEmpty()) {
            this.LIZ.LJFF.getClass();
            List<AddYoursAvatar> list = AddYoursAvatarHelper.LIZLLL;
            if (list != null && !list.isEmpty() && (addYoursStickerStruct = this.LIZ.LIZJ.getAddYoursStickerStruct()) != null) {
                addYoursStickerStruct.setUserAvatars(list);
            }
            AddYoursStickerStruct addYoursStickerStruct9 = this.LIZ.LIZJ.getAddYoursStickerStruct();
            if (addYoursStickerStruct9 != null) {
                AddYoursStickerStruct addYoursStickerStruct10 = this.LIZ.LIZJ.getAddYoursStickerStruct();
                if (addYoursStickerStruct10 != null && (userAvatars = addYoursStickerStruct10.getUserAvatars()) != null) {
                    listLIZ = C0NSK.LIZ(userAvatars);
                } else {
                    listLIZ = null;
                }
                addYoursStickerStruct9.setUserAvatars(listLIZ);
            }
        }
        C634930OvL c634930OvL2 = this.LIZ;
        AddYourRecordParam addYourRecordParam2 = c634930OvL2.LIZJ;
        Aweme aweme2 = c634930OvL2.LIZIZ;
        if (aweme2 != null) {
            zIsPhotoMode = AwemeExtKt.isPhotoMode(aweme2);
        }
        addYourRecordParam2.setFromPhotoMode(zIsPhotoMode);
        builder.addYoursStickerParam(this.LIZ.LIZJ);
        if (this.LIZJ.element != null && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().isEffectControlGame(this.LIZJ.element)) {
            if (this.LIZ.LIZJ()) {
                this.LIZ.LIZLLL(asyncAVService, builder.build(), null, new AwS275S0300000_31(asyncAVService, this.LIZ, builder, 27));
                return;
            } else {
                LIZ(asyncAVService, this.LIZ, builder);
                return;
            }
        }
        String str7 = this.LJ;
        if (str7 != null) {
            MusicModel musicModel = this.LIZLLL;
            C634930OvL c634930OvL3 = this.LIZ;
            if (musicModel != null) {
                builder.musicPath(str7);
                Aweme aweme3 = c634930OvL3.LIZIZ;
                if (aweme3 != null) {
                    musicModel.setMusicBeginTime(aweme3.getMusicBeginTime());
                }
                Aweme aweme4 = c634930OvL3.LIZIZ;
                if (aweme4 != null) {
                    musicModel.setMusicEndTime(aweme4.getMusicEndTime());
                }
                if (c634930OvL3.LIZJ()) {
                    c634930OvL3.LIZLLL(asyncAVService, builder.build(), musicModel, new AwS158S0400000_31(asyncAVService, c634930OvL3, builder, musicModel, 1));
                } else {
                    asyncAVService.uiService().recordService().startRecord(c634930OvL3.LIZ, builder.build(), musicModel, true);
                }
            }
        }
        if (this.LIZLLL != null) {
            return;
        }
        if (this.LIZ.LIZJ()) {
            this.LIZ.LIZLLL(asyncAVService, builder.build(), null, new AwS275S0300000_31(asyncAVService, this.LIZ, builder, 28));
        } else {
            LIZ(asyncAVService, this.LIZ, builder);
        }
        C634930OvL c634930OvL4 = this.LIZ;
        if (!c634930OvL4.LJIIL) {
            return;
        }
        c634930OvL4.LIZ.finish();
    }

    public static final void LIZ(AsyncAVService asyncAVService, C634930OvL c634930OvL, RecordConfig.Builder builder) {
        asyncAVService.uiService().recordService().startRecord(c634930OvL.LIZ, builder.build());
    }

    public C15M4(C634930OvL c634930OvL, C259800zU<String> c259800zU, C259800zU<Effect> c259800zU2, MusicModel musicModel, String str) {
        this.LIZ = c634930OvL;
        this.LIZIZ = c259800zU;
        this.LIZJ = c259800zU2;
        this.LIZLLL = musicModel;
        this.LJ = str;
    }
}
