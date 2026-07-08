package X;

import a6n.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.external.IRecordEnv;
import com.ss.android.ugc.aweme.services.external.IShortVideoContext;
import com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService;
import com.ss.android.ugc.aweme.services.external.ability.TextToImageRouteParams;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1Drm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269161Drm extends C09AY implements Function0<C572320McY> {
    public C2269161Drm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0McY] */
    @Override // kotlin.jvm.functions.Function0
    public final C572320McY invoke() {
        return new IOpenTextToImageService() { // from class: X.0McY
            public static boolean LIZJ() {
                C562670M4z.LIZ.getClass();
                Keva keva = C562670M4z.LIZIZ;
                if (keva.getBoolean("text_to_image_entrance_anim_shown", false) && ((Boolean) C282920B7a.LIZ.getValue()).booleanValue()) {
                    return false;
                }
                keva.storeBoolean("text_to_image_entrance_anim_shown", true);
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Intent LIZ(Bundle bundle, ShortVideoContext shortVideoContext) {
                char c;
                String string;
                String strLJIIJJI;
                Serializable serializable;
                Intent intent = new Intent();
                List<AVChallenge> list = C1443030nef.LJII().LIZ;
                int i = 0;
                if (TextUtils.equals(shortVideoContext.enterFrom, "open_platform_share") && (serializable = shortVideoContext.shareContext) != null) {
                    intent.putExtra("extra_share_context", serializable);
                    if (shortVideoContext.shareContext.mHashTags != null && (!r0.isEmpty())) {
                        for (String str : shortVideoContext.shareContext.mHashTags) {
                            AVChallenge aVChallenge = new AVChallenge();
                            aVChallenge.challengeName = str;
                            ((ArrayList) list).add(aVChallenge);
                        }
                    }
                }
                C0MUK.LJIIIZ(intent, shortVideoContext.creativeModel);
                C537520L6g.LIZLLL(intent, shortVideoContext.creativeInfo);
                CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
                String musicPath = shortVideoContext.getMusicPath();
                String str2 = "";
                if (musicPath == null) {
                    musicPath = "";
                }
                MusicModel musicModelLJII = C0CHQ.LIZ().LJJJJL().LJII(MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel));
                MusicModel musicModelLJII2 = C0CHQ.LIZ().LJJJJL().LJII(MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel));
                if (musicModelLJII2 != null && C2286708xd.LIZJ(shortVideoContext.getMusicPath())) {
                    String musicPath2 = shortVideoContext.getMusicPath();
                    if (musicPath2 == null) {
                        musicPath2 = "";
                    }
                    if (shortVideoContext.cameraComponentModel.mWorkspace == null) {
                        shortVideoContext.cameraComponentModel.mWorkspace = C14D2.LIZ(shortVideoContext.creativeInfo);
                    }
                    shortVideoContext.cameraComponentModel.mWorkspace.MC(musicPath2);
                    shortVideoContext.cameraComponentModel.mMusicPath = musicPath2;
                    shortVideoContext.mIsPhotoMvModeMusic = false;
                    int duration = musicModelLJII2.getDuration();
                    if (duration > 0) {
                        shortVideoContext.LJJLIIIJ(duration);
                    }
                    c = 1;
                } else {
                    c = 0;
                }
                if (musicModelLJII != null) {
                    intent.putExtra("path", musicPath);
                    intent.putExtra("music_model", musicModelLJII);
                    if (c != 0) {
                        strLJIIJJI = shortVideoContext.LJIIJJI();
                    } else {
                        strLJIIJJI = "slideshow_rec";
                    }
                    intent.putExtra("music_origin", strLJIIJJI);
                    C0MUK.LIZIZ(intent).recordEffectModel.firstStickerMusicIdsJson = GsonProtectorUtils.toJson(new Gson(), Collections.singletonList(musicModelLJII.getMusicId()));
                    intent.putExtra(FollowStatusChangeMethod.PARAM_UID, musicModelLJII.getMusicId());
                    boolean z = c ^ 1;
                    intent.putExtra("preset_music_source", z ? 1 : 0);
                    intent.putExtra("need_clean_music_when_back", z);
                }
                intent.putExtra("workspace", shortVideoContext.cameraComponentModel.mWorkspace);
                intent.putExtra("voice_volume", 0.0f);
                intent.putExtra("shoot_way", shortVideoContext.shootWay);
                creativeModelLIZIZ.recordData.shootMode = shortVideoContext.shootMode;
                if (bundle != null) {
                    i = bundle.getInt("origin", 0);
                }
                creativeModelLIZIZ.recordData.origin = i;
                DraftInfoModel draftInfoModel = creativeModelLIZIZ.draftInfoModel;
                draftInfoModel.newDraftId = shortVideoContext.newDraftId;
                draftInfoModel.draftId = shortVideoContext.draftId;
                intent.putExtra("origin", i);
                intent.putExtra("content_type", "multi_photo");
                intent.putExtra("content_source", "upload");
                creativeModelLIZIZ.eventData.enterFrom = shortVideoContext.enterFrom;
                intent.putExtra("is_private", shortVideoContext.LJIILLIIL());
                creativeModelLIZIZ.microAppModel = shortVideoContext.microAppModel;
                creativeModelLIZIZ.eventData.shootEnterMethod = shortVideoContext.enterMethod;
                creativeModelLIZIZ.creativeFlowData = shortVideoContext.creativeFlowData;
                intent.putExtra("shoot_from", shortVideoContext.mShootFrom);
                LIZIZ(shortVideoContext.creativeInfo, creativeModelLIZIZ);
                creativeModelLIZIZ.creationTypeModel.creationMode = 2;
                Text2ImageModel text2ImageModel = creativeModelLIZIZ.text2ImageModel;
                if (bundle != null && (string = bundle.getString("entrance", "")) != null) {
                    str2 = string;
                }
                text2ImageModel.entrance = str2;
                C0MUK.LJIIIZ(intent, creativeModelLIZIZ);
                creativeModelLIZIZ.text2ImageModel.showEnterAnim = LIZJ();
                creativeModelLIZIZ.text2ImageModel.curPathPage = "video_shoot_page";
                return intent;
            }

            public static void LIZIZ(CreativeInfo creativeInfo, CreativeModel creativeModel) {
                VideoFileInfo videoFileInfo = new VideoFileInfo(-1, -1, 0L, 30, 0, 0, 0, 0, 0.0f, 496, null);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C0MPK.LIZ(creativeInfo));
                sbLIZ.append(C0MPK.LIZJ(".jpg"));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C570490MZb.LJI(new C0VSJ(strLIZIZ));
                creativeModel.editModel.editPreviewInfo = new C538330L9j(-1, -1, 12).LIZ(new EditVideoSegment(strLIZIZ, null, videoFileInfo));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService
            public final void openTextToImage(Activity activity, String str, String str2, TextToImageRouteParams textToImageRouteParams) {
                boolean zLIZJ;
                boolean zBooleanValue;
                Bundle bundle = new Bundle();
                String strLIZ = textToImageRouteParams.creationId;
                if (strLIZ == null) {
                    strLIZ = C0DMI.LIZ();
                }
                CreativeInfo creativeInfo = new CreativeInfo(strLIZ, 0, null, 6, null);
                int i = -1;
                C0MUK.LJIIJ(bundle, new CreativeModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, i, i, i, i, 2097151, 0 == true ? 1 : 0));
                C537520L6g.LJFF(bundle, creativeInfo);
                C786410Ut5.LJJJI("shoot_way", textToImageRouteParams.shootWay, bundle);
                Text2ImageModel text2ImageModel = C0MUK.LIZJ(bundle).text2ImageModel;
                text2ImageModel.directToChoose = textToImageRouteParams.directToChoose;
                Boolean bool = textToImageRouteParams.showEnterAnim;
                if (bool != null) {
                    zLIZJ = bool.booleanValue();
                } else {
                    zLIZJ = LIZJ();
                }
                text2ImageModel.showEnterAnim = zLIZJ;
                text2ImageModel.text = str;
                Bundle bundle2 = textToImageRouteParams.etParams;
                text2ImageModel.etParams = bundle2;
                C572250McR.LIZ(text2ImageModel, bundle2);
                String str3 = textToImageRouteParams.cmtToPostInitialContentSource;
                if (str3 != null && (!a0.LJJJIL(str3))) {
                    text2ImageModel.cmtToPostInitialContentSource = str3;
                }
                String str4 = textToImageRouteParams.textByAi;
                if (str4 != null && (!a0.LJJJIL(str4))) {
                    text2ImageModel.textByAi = str4;
                }
                text2ImageModel.enableStory = textToImageRouteParams.enableStory;
                text2ImageModel.searchQuery = textToImageRouteParams.searchQuery;
                text2ImageModel.transToDesc = textToImageRouteParams.transTextToDesc;
                text2ImageModel.textToImageEditTitle = textToImageRouteParams.textToImageEditTitle;
                text2ImageModel.extraParams = textToImageRouteParams.extraParams;
                text2ImageModel.enableGuide = textToImageRouteParams.enableGuide;
                text2ImageModel.entrance = textToImageRouteParams.entrance;
                text2ImageModel.fromCommentId = textToImageRouteParams.fromCid;
                text2ImageModel.isCommentSeekingHelp = textToImageRouteParams.isCommentSeekingHelp();
                text2ImageModel.fromAwemeId = textToImageRouteParams.fromAid;
                text2ImageModel.fromAuthorId = textToImageRouteParams.fromUid;
                text2ImageModel.fromUserName = textToImageRouteParams.fromUserName;
                text2ImageModel.commentText = textToImageRouteParams.commentText;
                text2ImageModel.insertIds = textToImageRouteParams.insertIds;
                text2ImageModel.textTransPicStatus = textToImageRouteParams.textTransPicStatus;
                String str5 = textToImageRouteParams.prevPathPage;
                if (str5 != null) {
                    text2ImageModel.prevPathPage = str5;
                }
                String str6 = textToImageRouteParams.curPathPage;
                if (str6 != null) {
                    text2ImageModel.curPathPage = str6;
                }
                String str7 = textToImageRouteParams.curPathPageType;
                if (str7 != null) {
                    text2ImageModel.curPathPageType = str7;
                }
                PostLandingModel postLandingModel = C0MUK.LIZJ(bundle).postLandingModel;
                Boolean bool2 = textToImageRouteParams.landingBack;
                boolean zBooleanValue2 = false;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                postLandingModel.landingBack = zBooleanValue;
                PostLandingModel postLandingModel2 = C0MUK.LIZJ(bundle).postLandingModel;
                Boolean bool3 = textToImageRouteParams.backByClearTop;
                if (bool3 != null) {
                    zBooleanValue2 = bool3.booleanValue();
                }
                postLandingModel2.backByClearTop = zBooleanValue2;
                Bundle bundle3 = textToImageRouteParams.backBundle;
                if (bundle3 != null) {
                    C0MUK.LIZJ(bundle).postLandingModel.backBundle = bundle3;
                }
                C0MUK.LIZJ(bundle).postLandingModel.backUrl = textToImageRouteParams.backUrl;
                String str8 = textToImageRouteParams.searchExtra;
                if (str8 != null && (!a0.LJJJIL(str8))) {
                    C0MUK.LIZJ(bundle).commonMobModel.searchExtra = str8;
                }
                String str9 = textToImageRouteParams.shootEnterMethod;
                if (str9 != null && (!a0.LJJJIL(str9))) {
                    C0MUK.LIZJ(bundle).eventData.shootEnterMethod = str9;
                }
                LIZIZ(creativeInfo, C0MUK.LIZJ(bundle));
                C0MUK.LIZJ(bundle).creationTypeModel.creationMode = 2;
                C0MUK.LIZJ(bundle).eventData.enterFrom = str2;
                C07CG.LIZ.getClass();
                if (C07CG.LIZ() && u.LJIJI(textToImageRouteParams.shootWay, "explore_quick_entrance", true)) {
                    C0MUK.LIZJ(bundle).creativeFlowData.setShootExtraData(new ShootExtraData(str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null));
                }
                bundle.putBoolean("direct_to_choose", textToImageRouteParams.directToChoose);
                if (textToImageRouteParams.directToChoose) {
                    InterfaceC569060MTo interfaceC569060MToLIZ = C1660680tJi.LIZ();
                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                    interfaceC569060MToLIZ.LJFF(activity, intent);
                    return;
                }
                InterfaceC569060MTo interfaceC569060MToLIZ2 = C1660680tJi.LIZ();
                Intent intent2 = new Intent();
                intent2.putExtras(bundle);
                interfaceC569060MToLIZ2.LJI(activity, intent2);
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService
            public final void openTextToImageFromRecord(IRecordEnv iRecordEnv, int i, Bundle bundle, Function1<? super Boolean, Unit> function1) {
                a aVar;
                if ((iRecordEnv instanceof a) && (aVar = (a) iRecordEnv) != null) {
                    C1660680tJi.LIZ().LJI(aVar.LIZ(), LIZ(bundle, aVar.LIZLLL()));
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x02a7  */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void openTextToImage(android.app.Activity r228, java.lang.String r229, com.ss.android.ugc.aweme.feed.model.Aweme r230, java.lang.String r231) {
                /*
                    Method dump skipped, instruction units count: 682
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C572320McY.openTextToImage(android.app.Activity, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):void");
            }

            @Override // com.ss.android.ugc.aweme.services.external.ability.IOpenTextToImageService
            public final void openTextToImageWithShortVideoContext(Activity activity, IShortVideoContext iShortVideoContext, int i, Bundle bundle, Function1<? super Boolean, Unit> function1) {
                if (activity != null && (iShortVideoContext instanceof ShortVideoContext) && iShortVideoContext != null) {
                    C1660680tJi.LIZ().LJI(activity, LIZ(bundle, (ShortVideoContext) iShortVideoContext));
                }
            }
        };
    }
}
