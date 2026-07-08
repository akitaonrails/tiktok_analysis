package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditStickerModel;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.photomode.PhotoModePostContentModel;
import com.ss.android.ugc.aweme.creative.model.record.RecordData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.onthisday.OnThisDayService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import lgo.a;

/* JADX INFO: renamed from: X.0Mdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573020Mdg {
    public final C19EG LIZ;
    public final boolean LIZIZ;
    public final C573310Me9 LIZJ;
    public long LIZLLL;
    public MvThemeData LJ;
    public AVETParameter LJFF;
    public MusicModel LJI;
    public String LJII;
    public C1DRG LJIIIIZZ;
    public ShortVideoContext LJIIIZ;
    public InterfaceC573150Mdt LJIIJ;
    public FaceStickerBean LJIIJJI;
    public ArrayList<MediaModel> LJIIL;
    public boolean LJIILIIL;
    public final C573060Mdk LJIILJJIL = new C573060Mdk();
    public Function1<? super Intent, Unit> LJIILL;

    public final boolean LIZ() {
        ShortVideoContext shortVideoContext = this.LJIIIZ;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        if (u4.LJIIJJI(shortVideoContext)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.LJIIIZ;
        if (shortVideoContext2 == null) {
            shortVideoContext2 = null;
        }
        if (d4.LJIIZILJ(shortVideoContext2)) {
            return false;
        }
        ShortVideoContext shortVideoContext3 = this.LJIIIZ;
        if ((shortVideoContext3 == null ? null : shortVideoContext3).creativeModel.editPhotoModel.isFromEditPhoto) {
            return true;
        }
        CreativeModel creativeModel = (shortVideoContext3 != null ? shortVideoContext3 : null).creativeModel;
        if (creativeModel.changeAvatarModel.isFromChangeAvatar || creativeModel.initialModel.dmCameraModel.enterFromDM || C1428470nHB.LJJJJJL(creativeModel) || creativeModel.editorProAIGCInfoModel.aiPlaygroundCameraModel.fromAiPlayground || creativeModel.onThisDayData.isFromOnThisDay()) {
            return false;
        }
        return C573570MeZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(MvCreateVideoData mvCreateVideoData) {
        ShortVideoContext shortVideoContext;
        ShortVideoContext shortVideoContext2;
        ShortVideoContext shortVideoContext3;
        ShortVideoContext shortVideoContext4;
        ShortVideoContext shortVideoContext5;
        ShortVideoContext shortVideoContext6;
        ShortVideoContext shortVideoContext7;
        String str;
        String str2;
        String str3;
        boolean z;
        List listLLIIII;
        String strLIZ;
        ShortVideoContext shortVideoContext8;
        ShortVideoContext shortVideoContext9;
        ShortVideoContext shortVideoContext10 = this.LJIIIZ;
        ShortVideoContext shortVideoContext11 = null;
        if (shortVideoContext10 != null) {
            shortVideoContext = shortVideoContext10;
        } else {
            shortVideoContext = null;
            shortVideoContext10 = null;
        }
        String creationId = shortVideoContext10.getCreationId();
        ShortVideoContext shortVideoContext12 = this.LJIIIZ;
        if (shortVideoContext12 == null) {
            shortVideoContext2 = null;
        } else {
            shortVideoContext2 = shortVideoContext12;
        }
        String str4 = shortVideoContext2.shootWay;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (shortVideoContext12 == null) {
            shortVideoContext3 = null;
        } else {
            shortVideoContext3 = shortVideoContext12;
        }
        String str6 = shortVideoContext3.creativeModel.commonMobModel.shootEnterFrom;
        if (str6 == null) {
            if (shortVideoContext12 == null) {
                shortVideoContext9 = null;
            } else {
                shortVideoContext9 = shortVideoContext12;
            }
            str6 = shortVideoContext9.enterFrom;
            if (str6 == null) {
                str6 = "";
            }
        }
        if (shortVideoContext12 == null) {
            shortVideoContext4 = null;
        } else {
            shortVideoContext4 = shortVideoContext12;
        }
        String str7 = shortVideoContext4.creativeModel.commonMobModel.shootEnterMethod;
        if (str7 == null) {
            if (shortVideoContext12 == null) {
                shortVideoContext8 = null;
            } else {
                shortVideoContext8 = shortVideoContext12;
            }
            str7 = shortVideoContext8.enterMethod;
            if (str7 == null) {
                str7 = "";
            }
        }
        if (shortVideoContext12 == null) {
            shortVideoContext5 = null;
        } else {
            shortVideoContext5 = shortVideoContext12;
        }
        String str8 = shortVideoContext5.creativeModel.albumMobModel.albumFromPage;
        if (shortVideoContext12 == null) {
            shortVideoContext6 = null;
        } else {
            shortVideoContext6 = shortVideoContext12;
        }
        String str9 = shortVideoContext6.creativeModel.albumMobModel.albumFromScene;
        if (shortVideoContext12 == null) {
            shortVideoContext7 = null;
        } else {
            shortVideoContext7 = shortVideoContext12;
        }
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        C528230Knd c528230Knd = new C528230Knd(str4, creationId, str6, str7, shortVideoContext7.creativeModel.draftInfoModel.isDraft, 0, str8, str9, false, false, false, null, null, null, null, null, null, null, null, null, 33554208);
        if (shortVideoContext12 == null) {
            shortVideoContext12 = null;
        }
        if (!Intrinsics.LJFF(shortVideoContext12.uploadMethod, "slide_mini")) {
            ShortVideoContext shortVideoContext13 = this.LJIIIZ;
            if (shortVideoContext13 != null) {
                shortVideoContext11 = shortVideoContext13;
            }
            if (d4.LJIILJJIL(shortVideoContext11)) {
                str = "now";
            } else {
                str = "slideshow";
            }
            if (mvCreateVideoData.selectMediaList.size() > 1) {
                str2 = "multiple_content";
            } else {
                str2 = "single_content";
            }
            int size = mvCreateVideoData.selectMediaList.size();
            if (mvCreateVideoData.selectMediaList.size() > 1) {
                str3 = "photo";
            } else {
                str3 = "none";
            }
            if (mvCreateVideoData.selectMediaList.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            ArrayList<MediaModel> arrayList = this.LJIIL;
            if (arrayList != null && (strLIZ = C525670KjV.LIZ(arrayList)) != null) {
                str5 = strLIZ;
            }
            int iLIZ = C530690Krb.LIZ(this.LJIIL);
            ArrayList<MediaModel> arrayList2 = this.LJIIL;
            if (arrayList2 == null || (listLLIIII = C13LP.LLIIII(arrayList2)) == null) {
                listLLIIII = C13BV.INSTANCE;
            }
            C528210Knb c528210Knb = new C528210Knb(shortVideoContext, str, str2, i, size, str3, z, str5, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, iLIZ, listLLIIII, c528230Knd, 1792);
            c528210Knb.LIZLLL(shortVideoContext);
            c528210Knb.LIZ();
        }
    }

    public final void LIZLLL(MvCreateVideoData mvCreateVideoData) {
        String str;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", "photo");
        if (mvCreateVideoData.selectMediaList.size() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        c0lab.LJ("upload_type", str);
        c0lab.LIZ(C530690Krb.LIZ(this.LJIIL), "source_is_hdr");
        ShortVideoContext shortVideoContext = this.LJIIIZ;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        C1403110mcH.LIZ(c0lab, shortVideoContext.creativeModel.initialModel.photoModeAfterFeedbackMobParams);
        C20684815ws.LJIILLIIL("upload_content_next", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(int r8) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C573020Mdg.LJFF(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0008  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r13, java.util.List r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L8
            r9 = 1
            if (r13 == r9) goto L9
            r9 = 2
            if (r13 == r9) goto L9
        L8:
            r9 = 0
        L9:
            java.lang.Class<com.ss.android.ugc.aweme.photomv.IPhotoMvResDownloadService> r0 = com.ss.android.ugc.aweme.photomv.IPhotoMvResDownloadService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r6 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.photomv.IPhotoMvResDownloadService r6 = (com.ss.android.ugc.aweme.photomv.IPhotoMvResDownloadService) r6
            if (r6 == 0) goto L35
            X.19EG r0 = r12.LIZ
            r6.LIZJ(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r12.LJIIIZ
            if (r0 != 0) goto L23
            r0 = 0
        L23:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.CreativeModel r7 = r0.LIZ()
            kotlin.jvm.internal.AwS587S0100000_8 r10 = new kotlin.jvm.internal.AwS587S0100000_8
            r0 = 587(0x24b, float:8.23E-43)
            r10.<init>(r6, r0)
            r8 = r14
            r11 = r5
            r6.LIZLLL(r7, r8, r9, r10, r11)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C573020Mdg.LJI(int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C573020Mdg.LJII(com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData, java.lang.String):void");
    }

    public C573020Mdg(C19EG c19eg, boolean z, boolean z2) {
        this.LIZ = c19eg;
        this.LIZIZ = z;
        this.LIZJ = new C573310Me9(c19eg, null, z2, 2);
    }

    public static void LJ(int i, C573060Mdk c573060Mdk, int i2) {
        String str;
        C543670LTx c543670LTx = new C543670LTx();
        if (i2 > 1) {
            str = "multi";
        } else {
            str = "single";
        }
        c543670LTx.LIZ.put("photo_import_mode", str);
        c543670LTx.LIZ.put("mvtemplate_list_download_time", Integer.valueOf(c573060Mdk.LIZ));
        c543670LTx.LIZ.put("mvtemplate_download_time", Integer.valueOf(c573060Mdk.LIZIZ));
        c543670LTx.LIZ.put("mvtemplate_use_predownload", Integer.valueOf(c573060Mdk.LIZJ));
        c543670LTx.LIZ.put("hot_music_list_download_time", Integer.valueOf(c573060Mdk.LIZLLL));
        c543670LTx.LIZ.put("hot_music_list_list_size", Integer.valueOf(c573060Mdk.LJ));
        c543670LTx.LIZ.put("music_download_time", Integer.valueOf(c573060Mdk.LJFF));
        c543670LTx.LIZ.put("music_id", c573060Mdk.LJI);
        c543670LTx.LIZ.put("error_code", Integer.valueOf(c573060Mdk.LJII));
        c543670LTx.LIZ.put("failed_step", Integer.valueOf(c573060Mdk.LJIIIZ));
        c543670LTx.LIZ.put("failed_reason", c573060Mdk.LJIIJ);
        C1637890six.LJ("aweme_photomv_synthesis_error_rate", i, c543670LTx.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(MvCreateVideoData mvCreateVideoData, Pair<Integer, Integer> pair, ArrayList<MediaModel> arrayList, String str) {
        List<String> music;
        String string;
        String effectId;
        String resourceId;
        Bundle extras;
        int size;
        ShortVideoContext shortVideoContext;
        ShortVideoContext shortVideoContext2;
        Bundle extras2;
        String string2;
        String strLIZIZ;
        ShortVideoContext shortVideoContext3;
        ShortVideoContext shortVideoContext4;
        ArrayList<ImportVideoInfo> arrayList2;
        MusicModel musicModel;
        ShortVideoContext shortVideoContext5;
        Effect effect;
        Effect effect2;
        Effect effect3;
        ArrayList<MediaModel> arrayList3 = arrayList;
        if (mvCreateVideoData.selectMediaList.isEmpty()) {
            C201955140j.LJFF("PhotoMVNext", "image_list_empty");
            C0L16.LIZ(-2, "to_image_edit", "image_list_empty");
            C19EG c19eg = this.LIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(this.LIZ.getString(R.string.khy));
            C1390380mHk.LIZ(c19eg, 3070, creativeToastBuilder);
            InterfaceC573150Mdt interfaceC573150Mdt = this.LJIIJ;
            if (interfaceC573150Mdt != null) {
                interfaceC573150Mdt.onFinish(false);
                return;
            }
            return;
        }
        a.LIZIZ.LIZIZ().LIZ(C1662150tM5.LIZIZ);
        if (C0CHQ.LIZ().getAccountService().LIZ()) {
            LIZLLL(mvCreateVideoData);
        } else {
            LIZJ(mvCreateVideoData);
        }
        Intent intent = new Intent();
        ShortVideoContext shortVideoContext6 = this.LJIIIZ;
        if (shortVideoContext6 == null) {
            shortVideoContext6 = null;
        }
        C0MUK.LJIIIZ(intent, shortVideoContext6.creativeModel);
        Function1<? super Intent, Unit> function1 = this.LJIILL;
        if (function1 != null) {
            function1.invoke(intent);
        }
        ShortVideoContext shortVideoContext7 = this.LJIIIZ;
        if (shortVideoContext7 == null) {
            shortVideoContext7 = null;
        }
        if (shortVideoContext7.creativeModel.storyModel.isShootFromSocialAlbum()) {
            intent.putExtra("is_from_social_creation_album_entrance", 1);
        }
        CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(intent);
        MvThemeData mvThemeData = this.LJ;
        if (mvThemeData != null && (effect3 = mvThemeData.effect) != null) {
            music = effect3.getMusic();
        } else {
            music = null;
        }
        mvCreateVideoData.musicIds = music;
        Bundle bundleLJIIL = C0CHQ.LIZ().LJIJJ().LJIIL(this.LIZ);
        if (bundleLJIIL != null) {
            string = bundleLJIIL.getString("extra_edit_effect_uid");
        } else {
            string = null;
        }
        intent.putExtra("extra_edit_effect_uid", string);
        if (C0EM4.LIZ()) {
            ShortVideoContext shortVideoContext8 = this.LJIIIZ;
            if (shortVideoContext8 == null) {
                shortVideoContext8 = null;
            }
            intent.putExtra("extra_video_length", shortVideoContext8.videoLength);
        }
        MvThemeData mvThemeData2 = this.LJ;
        if (mvThemeData2 != null && (effect2 = mvThemeData2.effect) != null) {
            effectId = effect2.getEffectId();
        } else {
            effectId = null;
        }
        C574480Mg2.LIZIZ(new C1178604jI(effectId));
        C574480Mg2.LIZIZ(new C1179004jM(effectId));
        MvThemeData mvThemeData3 = this.LJ;
        if (mvThemeData3 != null && (effect = mvThemeData3.effect) != null) {
            resourceId = effect.getResourceId();
        } else {
            resourceId = null;
        }
        C574480Mg2.LIZIZ(new C1259004wG(resourceId));
        MvThemeData mvThemeData4 = this.LJ;
        if (mvThemeData4 != null && !TextUtils.isEmpty(mvThemeData4.LJ())) {
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
            aVUploadMiscInfoStruct.mvThemeId = mvThemeData4.LJ();
            MvModel mvModel = new MvModel();
            mvModel.setMvId(mvThemeData4.LJ());
            mvModel.setName(mvThemeData4.effect.getName());
            mvModel.setMvAnchor(mvThemeData4.isMvAnchor);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(mvThemeData4.effect.getIconUrl().getUrlList());
            mvModel.setIconUrl(urlModel);
            aVUploadMiscInfoStruct.mvInfo = mvModel;
            aVUploadMiscInfoStruct.sourceId = mvThemeData4.sourceId;
            creativeModelLIZIZ.uploadMiscInfoStruct = aVUploadMiscInfoStruct;
            String strLJ = mvThemeData4.LJ();
            ShortVideoContext shortVideoContext9 = this.LJIIIZ;
            if (shortVideoContext9 == null) {
                shortVideoContext9 = null;
            }
            if (TextUtils.equals(strLJ, shortVideoContext9.mBindMovieId)) {
                ShortVideoContext shortVideoContext10 = this.LJIIIZ;
                if (shortVideoContext10 == null) {
                    shortVideoContext10 = null;
                }
                intent.putExtra("extra_bind_mv_id", shortVideoContext10.mBindMovieId);
            }
            mvCreateVideoData.mvResUnzipPath = mvThemeData4.LIZJ();
            mvCreateVideoData.mvType = mvThemeData4.mvType;
            mvCreateVideoData.mvAutoSaveToast = mvThemeData4.mvAutoSaveToast;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        ShortVideoContext shortVideoContext11 = this.LJIIIZ;
        if (shortVideoContext11 == null) {
            shortVideoContext11 = null;
        }
        sbLIZ.append(C570490MZb.LIZJ(C0MPK.LIZ(shortVideoContext11.creativeInfo)));
        sbLIZ.append(C0MPK.LIZJ(".mp4"));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        C570490MZb.LJI(new C0VSJ(strLIZIZ2));
        mvCreateVideoData.contactVideoPath = strLIZIZ2;
        creativeModelLIZIZ.aigcExtraModel.aiCreationId = UUID.randomUUID().toString();
        creativeModelLIZIZ.mvModel.mvCreateVideoData = mvCreateVideoData;
        intent.putExtra("key_mv_theme_enter", true);
        intent.putExtra("extra_need_add_recent", true);
        AVETParameter aVETParameter = this.LJFF;
        String str2 = "";
        if (aVETParameter != null) {
            List<AVChallenge> list = C1443030nef.LJII().LIZ;
            creativeModelLIZIZ.editModel.editPreviewInfo = new C0MOM(pair.getFirst().intValue(), pair.getSecond().intValue()).LIZ(mvCreateVideoData);
            intent.putExtra("challenge", (Serializable) list);
            ((OnThisDayService) ServiceManager.get().getService(OnThisDayService.class)).insertChallengeIfNeed(intent, C0MUK.LIZIZ(intent), this.LIZ);
            ShortVideoContext shortVideoContext12 = this.LJIIIZ;
            if (shortVideoContext12 == null) {
                shortVideoContext12 = null;
            }
            if (TextUtils.equals(shortVideoContext12.enterFrom, "open_platform_share")) {
                ShortVideoContext shortVideoContext13 = this.LJIIIZ;
                if (shortVideoContext13 == null) {
                    shortVideoContext13 = null;
                }
                intent.putExtra("shoot_way", shortVideoContext13.shootWay);
                ShortVideoContext shortVideoContext14 = this.LJIIIZ;
                if (shortVideoContext14 == null) {
                    shortVideoContext14 = null;
                }
                C537520L6g.LIZLLL(intent, shortVideoContext14.creativeInfo);
                ShortVideoContext shortVideoContext15 = this.LJIIIZ;
                if (shortVideoContext15 == null) {
                    shortVideoContext5 = null;
                } else {
                    shortVideoContext5 = shortVideoContext15;
                }
                if (shortVideoContext5.shareContext != null) {
                    if (shortVideoContext15 == null) {
                        shortVideoContext15 = null;
                    }
                    intent.putExtra("extra_share_context", shortVideoContext15.shareContext);
                }
            } else {
                ShortVideoContext shortVideoContext16 = this.LJIIIZ;
                if (shortVideoContext16 == null) {
                    shortVideoContext16 = null;
                }
                if (!TextUtils.isEmpty(shortVideoContext16.shootWay)) {
                    ShortVideoContext shortVideoContext17 = this.LJIIIZ;
                    if (shortVideoContext17 == null) {
                        shortVideoContext17 = null;
                    }
                    intent.putExtra("shoot_way", shortVideoContext17.shootWay);
                } else {
                    intent.putExtra("shoot_way", aVETParameter.getShootWay());
                }
                ShortVideoContext shortVideoContext18 = this.LJIIIZ;
                if (shortVideoContext18 == null) {
                    shortVideoContext18 = null;
                }
                C537520L6g.LIZLLL(intent, shortVideoContext18.creativeInfo);
            }
            ShortVideoContext shortVideoContext19 = this.LJIIIZ;
            if (shortVideoContext19 == null) {
                shortVideoContext19 = null;
            }
            intent.putExtra("is_private", shortVideoContext19.LJIILLIIL());
            ShortVideoContext shortVideoContext20 = this.LJIIIZ;
            if (shortVideoContext20 == null) {
                shortVideoContext20 = null;
            }
            if (shortVideoContext20.creativeModel.onThisDayData.isFromOnThisDay()) {
                ShortVideoContext shortVideoContext21 = this.LJIIIZ;
                if (shortVideoContext21 == null) {
                    shortVideoContext21 = null;
                }
                if (Intrinsics.LJFF("on_this_day_slider_edit", shortVideoContext21.creativeModel.onThisDayData.getLeftWay())) {
                    ShortVideoContext shortVideoContext22 = this.LJIIIZ;
                    if (shortVideoContext22 == null) {
                        shortVideoContext22 = null;
                    }
                    intent.putExtra("comment_setting", shortVideoContext22.creativeModel.privacySettingModel.allowComment);
                }
            }
            RecordData recordData = creativeModelLIZIZ.recordData;
            ShortVideoContext shortVideoContext23 = this.LJIIIZ;
            if (shortVideoContext23 == null) {
                shortVideoContext3 = null;
            } else {
                shortVideoContext3 = shortVideoContext23;
            }
            recordData.shootMode = shortVideoContext3.shootMode;
            if (shortVideoContext23 == null) {
                shortVideoContext23 = null;
            }
            if (shortVideoContext23.LJJJJJL()) {
                ShortVideoContext shortVideoContext24 = this.LJIIIZ;
                if (shortVideoContext24 == null) {
                    shortVideoContext24 = null;
                }
                intent.putExtra("reuse_original_sound_id", shortVideoContext24.LJIJ());
                ShortVideoContext shortVideoContext25 = this.LJIIIZ;
                if (shortVideoContext25 == null) {
                    shortVideoContext25 = null;
                }
                intent.putExtra("reuse_original_sound_url", shortVideoContext25.LJIJJ());
                ShortVideoContext shortVideoContext26 = this.LJIIIZ;
                if (shortVideoContext26 == null) {
                    shortVideoContext26 = null;
                }
                intent.putExtra("reuse_original_sound_length", shortVideoContext26.LJIJI());
            }
            creativeModelLIZIZ.draftInfoModel.newDraftId = aVETParameter.getNewDraftId();
            creativeModelLIZIZ.draftInfoModel.draftId = aVETParameter.getDraftId();
            intent.putExtra("origin", this.LIZIZ ? 1 : 0);
            if (this.LIZIZ) {
                intent.putExtra("content_type", "multi_photo");
                intent.putExtra("content_source", "shoot");
            } else {
                intent.putExtra("content_type", "slideshow");
                intent.putExtra("content_source", "upload");
            }
            ShortVideoContext shortVideoContext27 = this.LJIIIZ;
            if (shortVideoContext27 == null) {
                shortVideoContext4 = null;
            } else {
                shortVideoContext4 = shortVideoContext27;
            }
            creativeModelLIZIZ.creativeFlowData = shortVideoContext4.creativeFlowData;
            if (shortVideoContext27 == null) {
                shortVideoContext27 = null;
            }
            intent.putExtra("share_id", shortVideoContext27.mShareId);
            ShortVideoContext shortVideoContext28 = this.LJIIIZ;
            if (shortVideoContext28 == null) {
                shortVideoContext28 = null;
            }
            intent.putExtra("channel", shortVideoContext28.clientId);
            EditStickerModel editStickerModel = creativeModelLIZIZ.editStickerModel;
            ShortVideoContext shortVideoContext29 = this.LJIIIZ;
            if (shortVideoContext29 == null) {
                shortVideoContext29 = null;
            }
            editStickerModel.commentVideoModel = shortVideoContext29.LJFF();
            ShortVideoContext shortVideoContext30 = this.LJIIIZ;
            if (shortVideoContext30 == null) {
                shortVideoContext30 = null;
            }
            creativeModelLIZIZ.ttsVoiceModel = shortVideoContext30.ttsVoiceModel;
            intent.putExtra("extra_start_enter_edit_page", this.LIZLLL);
            intent.putExtra("use_music_before_edit", true);
            EventData eventData = creativeModelLIZIZ.eventData;
            ShortVideoContext shortVideoContext31 = this.LJIIIZ;
            if (shortVideoContext31 == null) {
                shortVideoContext31 = null;
            }
            eventData.enterFrom = shortVideoContext31.enterFrom;
            FaceStickerBean faceStickerBean = this.LJIIJJI;
            if (faceStickerBean != null) {
                RecordEffectModel recordEffectModel = creativeModelLIZIZ.recordEffectModel;
                String string3 = Long.valueOf(faceStickerBean.getStickerId()).toString();
                if (string3 == null) {
                    string3 = "";
                }
                recordEffectModel.stickerID = string3;
            }
            String str3 = this.LJII;
            if (str3 != null && this.LJI != null) {
                intent.putExtra("path", str3);
                intent.putExtra("music_model", this.LJI);
                String strLJIIJJI = "slideshow_rec";
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_template_music_selected_from", true, false)) {
                    if (this.LJIILIIL) {
                        ShortVideoContext shortVideoContext32 = this.LJIIIZ;
                        if (shortVideoContext32 == null) {
                            shortVideoContext32 = null;
                        }
                        strLJIIJJI = shortVideoContext32.LJIIJJI();
                    }
                    if (u.LJIJI(strLJIIJJI, "original", false) && (musicModel = this.LJI) != null && Long.valueOf(musicModel.getId()) != null) {
                        strLJIIJJI = "others";
                    }
                    intent.putExtra("music_origin", strLJIIJJI);
                } else {
                    if (this.LJIILIIL) {
                        ShortVideoContext shortVideoContext33 = this.LJIIIZ;
                        if (shortVideoContext33 == null) {
                            shortVideoContext33 = null;
                        }
                        strLJIIJJI = shortVideoContext33.LJIIJJI();
                    }
                    intent.putExtra("music_origin", strLJIIJJI);
                }
                creativeModelLIZIZ.recordEffectModel.firstStickerMusicIdsJson = GsonProtectorUtils.toJson(new Gson(), Collections.singletonList(this.LJI.getMusicId()));
                intent.putExtra(FollowStatusChangeMethod.PARAM_UID, this.LJI.getMusicId());
            }
            ShortVideoContext shortVideoContext34 = this.LJIIIZ;
            if (shortVideoContext34 == null) {
                shortVideoContext34 = null;
            }
            intent.putExtra("workspace", shortVideoContext34.cameraComponentModel.mWorkspace);
            com.ss.android.ugc.aweme.creative.model.template.MvModel mvModel2 = creativeModelLIZIZ.mvModel;
            mvModel2.isPhotoMvMode = true;
            mvModel2.isPhotoMvMode1080p = C573200Mdy.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PhotoMvGoNextImpl: enable_photo_to_1080p = ");
            sbLIZ2.append(C573200Mdy.LIZ());
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            ShortVideoContext shortVideoContext35 = this.LJIIIZ;
            if (shortVideoContext35 == null) {
                shortVideoContext35 = null;
            }
            mvModel2.isPhotoMvMusic = shortVideoContext35.mIsPhotoMvModeMusic;
            ArrayList<MediaModel> arrayList4 = this.LJIIL;
            if (arrayList4 != null) {
                arrayList2 = new ArrayList<>(C15438062q.LJIJJ(arrayList4, 10));
                int i = 0;
                for (MediaModel mediaModel : arrayList4) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        MediaModel mediaModel2 = mediaModel;
                        arrayList2.add(new ImportVideoInfo(mediaModel2.width, mediaModel2.height, 0, 0, String.valueOf(i), mediaModel2.endTime - mediaModel2.startTime, mediaModel2.duration, null, null, 0, 0.0f, mediaModel2.LJFF(), mediaModel2.LJFF(), false, null, mediaModel2.aigcInfo, 0L, 92044, null));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                extras = null;
            } else {
                extras = null;
                arrayList2 = null;
            }
            if ((arrayList2 instanceof ArrayList) && arrayList2 != null) {
                creativeModelLIZIZ.albumModel.importInfoList = arrayList2;
            }
            ShortVideoContext shortVideoContext36 = this.LJIIIZ;
            ShortVideoContext shortVideoContext37 = shortVideoContext36;
            if (shortVideoContext36 == null) {
                shortVideoContext37 = extras;
            }
            intent.putExtra("commerce_data_in_tools_line", shortVideoContext37.extraSession.commerceData);
        } else {
            extras = null;
        }
        ShortVideoContext shortVideoContext38 = this.LJIIIZ;
        ShortVideoContext shortVideoContext39 = shortVideoContext38;
        if (shortVideoContext38 == null) {
            shortVideoContext39 = extras;
        }
        if (shortVideoContext39.LJJJJZI() && C536570L2p.LIZ()) {
            ShortVideoContext shortVideoContext40 = this.LJIIIZ;
            ShortVideoContext shortVideoContext41 = shortVideoContext40;
            if (shortVideoContext40 == null) {
                shortVideoContext41 = extras;
            }
            intent.putExtra("music_start", shortVideoContext41.cameraComponentModel.mMusicStart);
            ShortVideoContext shortVideoContext42 = this.LJIIIZ;
            ShortVideoContext shortVideoContext43 = shortVideoContext42;
            if (shortVideoContext42 == null) {
                shortVideoContext43 = extras;
            }
            intent.putExtra("extra_music_end", shortVideoContext43.cameraComponentModel.musicEndTime);
        }
        if (C0BMN.LIZ() && this.LIZIZ) {
            intent.putExtra("extra_request_code", 12357);
        } else {
            intent.putExtra("extra_request_code", 12346);
        }
        AlbumModel albumModel = creativeModelLIZIZ.albumModel;
        if (arrayList3 != null) {
            size = arrayList3.size();
        } else {
            size = 0;
        }
        albumModel.photoCount = size;
        EventData eventData2 = creativeModelLIZIZ.eventData;
        ShortVideoContext shortVideoContext44 = this.LJIIIZ;
        if (shortVideoContext44 == null) {
            shortVideoContext = extras;
        } else {
            shortVideoContext = shortVideoContext44;
        }
        eventData2.shootEnterMethod = shortVideoContext.enterMethod;
        ShortVideoContext shortVideoContext45 = shortVideoContext44;
        if (shortVideoContext44 == null) {
            shortVideoContext45 = extras;
        }
        intent.putExtra("shoot_from", shortVideoContext45.mShootFrom);
        AlbumModel albumModel2 = creativeModelLIZIZ.albumModel;
        ShortVideoContext shortVideoContext46 = this.LJIIIZ;
        if (shortVideoContext46 == null) {
            shortVideoContext2 = extras;
        } else {
            shortVideoContext2 = shortVideoContext46;
        }
        String str4 = shortVideoContext2.uploadMethod;
        if (str4 == null) {
            str4 = "";
        }
        albumModel2.uploadMethod = str4;
        ShortVideoContext shortVideoContext47 = shortVideoContext46;
        if (shortVideoContext46 == null) {
            shortVideoContext47 = extras;
        }
        List<String> list2 = shortVideoContext47.uploadTabNameList;
        if (list2 != null) {
            albumModel2.uploadTabNameList = new ArrayList(list2);
        }
        if (arrayList3 == null) {
            arrayList3 = this.LJIIL;
        }
        intent.putParcelableArrayListExtra("extra_image_model_media_list", arrayList3);
        ShortVideoContext shortVideoContext48 = this.LJIIIZ;
        ShortVideoContext shortVideoContext49 = shortVideoContext48;
        if (shortVideoContext48 == null) {
            shortVideoContext49 = extras;
        }
        intent.putExtra("extra_camera_is_9_to_16", shortVideoContext49.creativeModel.imageEditModel.cameraIs9to16);
        ShortVideoContext shortVideoContext50 = this.LJIIIZ;
        ShortVideoContext shortVideoContext51 = shortVideoContext50;
        if (shortVideoContext50 == null) {
            shortVideoContext51 = extras;
        }
        String str5 = shortVideoContext51.albumPreviewNextMethod;
        if (str5 == null) {
            str5 = "";
        }
        intent.putExtra("upload_next_method", str5);
        ShortVideoContext shortVideoContext52 = this.LJIIIZ;
        ShortVideoContext shortVideoContext53 = shortVideoContext52;
        if (shortVideoContext52 == null) {
            shortVideoContext53 = extras;
        }
        DefaultPostContentModel defaultPostContentModel = shortVideoContext53.creativeModel.initialModel.defaultPostContentModel;
        if (defaultPostContentModel != null) {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 50, "photo_mode_title_max_length", true);
            if (defaultPostContentModel.defaultTitle.length() > iLJIJ) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(defaultPostContentModel.defaultTitle.substring(0, iLJIJ - 3));
                sbLIZ3.append("...");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                strLIZIZ = defaultPostContentModel.defaultTitle;
            }
            creativeModelLIZIZ.imagePublishModel.heading = strLIZIZ;
            intent.putExtra("video_title", defaultPostContentModel.defaultDescription);
        }
        ShortVideoContext shortVideoContext54 = this.LJIIIZ;
        ShortVideoContext shortVideoContext55 = shortVideoContext54;
        if (shortVideoContext54 == null) {
            shortVideoContext55 = extras;
        }
        if (shortVideoContext55.LJJJJ() && C123100dR.LIZ(str)) {
            intent.putExtra(FollowStatusChangeMethod.PARAM_UID, str);
            intent.putExtra("extra_request_code", 10087);
            ShortVideoContext shortVideoContext56 = this.LJIIIZ;
            ShortVideoContext shortVideoContext57 = shortVideoContext56;
            if (shortVideoContext56 == null) {
                shortVideoContext57 = extras;
            }
            MusicObject musicObject = shortVideoContext57.creativeModel.musicBuzModel.music;
            if (musicObject != null && (string2 = Long.valueOf(musicObject.id).toString()) != null) {
                str2 = string2;
            }
            intent.putExtra("music_id", str2);
        }
        ShortVideoContext shortVideoContext58 = this.LJIIIZ;
        ShortVideoContext shortVideoContext59 = shortVideoContext58;
        if (shortVideoContext58 == null) {
            shortVideoContext59 = extras;
        }
        PhotoModePostContentModel photoModePostContentModel = shortVideoContext59.creativeModel.initialModel.photoModePostContentModel;
        if (photoModePostContentModel != null) {
            intent.putExtra("photomode_cover", photoModePostContentModel.coverIndex);
            intent.putExtra("photomode_title", photoModePostContentModel.title);
            intent.putExtra("photomode_desc", photoModePostContentModel.description);
            intent.putExtra("photomode_hashtags", photoModePostContentModel.hashtags);
            intent.putExtra("photomode_anchors", photoModePostContentModel.anchors);
            ShortVideoContext shortVideoContext60 = this.LJIIIZ;
            ShortVideoContext shortVideoContext61 = shortVideoContext60;
            if (shortVideoContext60 == null) {
                shortVideoContext61 = extras;
            }
            intent.putExtra("open_platform_share_id", shortVideoContext61.openPlatformShareId);
            ShortVideoContext shortVideoContext62 = this.LJIIIZ;
            ShortVideoContext shortVideoContext63 = shortVideoContext62;
            if (shortVideoContext62 == null) {
                shortVideoContext63 = extras;
            }
            intent.putExtra("open_platform_key", shortVideoContext63.openPlatformClientKey);
        }
        Intent intent2 = this.LIZ.getIntent();
        if (intent2 != null) {
            try {
                String stringExtra = intent2.getStringExtra("enter_dm");
                if (stringExtra != null) {
                    intent.putExtra("enter_dm", stringExtra);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Intent intent3 = this.LIZ.getIntent();
        if (intent3 != null) {
            try {
                String stringExtra2 = intent3.getStringExtra("launch_method");
                if (stringExtra2 != null) {
                    intent.putExtra("launch_method", stringExtra2);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
        C19EG c19eg2 = this.LIZ;
        try {
            extras2 = intent.getExtras();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            extras2 = extras;
        }
        iLayoutPreloadServiceForEditPage.preloadLayoutFiles(c19eg2, extras2);
        if (LJFF(mvCreateVideoData.srcSelectMediaList.size())) {
            try {
                C19EG c19eg3 = this.LIZ;
                try {
                    extras = intent.getExtras();
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                C0MWH.LJI(c19eg3, extras);
                C524780Ki4.LIZ.step("av_image_edit", "end launchImageEdit");
                C201955140j.LJIILIIL("PhotoMVNext", "{\"event\":\"navSuccess\",\"mode\":\"image\"}");
                C0L16.LIZ(0, "to_image_edit", "success");
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("{\"event\":\"navFail\",\"mode\":\"image\",\"msg\":\"");
                sbLIZ4.append(th.getMessage());
                sbLIZ4.append("\"}");
                C201955140j.LJFF("PhotoMVNext", C2188811AlT.LIZIZ(sbLIZ4));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("fail msg:");
                sbLIZ5.append(th.getMessage());
                C0L16.LIZ(-1, "to_image_edit", C2188811AlT.LIZIZ(sbLIZ5));
                InterfaceC573150Mdt interfaceC573150Mdt2 = this.LJIIJ;
                if (interfaceC573150Mdt2 != null) {
                    interfaceC573150Mdt2.onFinish(false);
                    return;
                }
                return;
            }
        }
        try {
            C19EG c19eg4 = this.LIZ;
            try {
                extras = intent.getExtras();
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            C0MWH.LJIILLIIL(c19eg4, extras);
            C0L16.LIZ(0, "to_video_edit", "success");
            C201955140j.LJIILIIL("PhotoMVNext", "{\"event\":\"navSuccess\",\"mode\":\"mv\"}");
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("fail msg:");
            sbLIZ6.append(th2.getMessage());
            C0L16.LIZ(-1, "to_video_edit", C2188811AlT.LIZIZ(sbLIZ6));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("{\"event\":\"navFail\",\"mode\":\"mv\",\"msg\":\"");
            sbLIZ7.append(th2.getMessage());
            sbLIZ7.append("\"}");
            C201955140j.LJFF("PhotoMVNext", C2188811AlT.LIZIZ(sbLIZ7));
            InterfaceC573150Mdt interfaceC573150Mdt3 = this.LJIIJ;
            if (interfaceC573150Mdt3 != null) {
                interfaceC573150Mdt3.onFinish(false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.C573020Mdg r40, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r41, java.util.List r42, X.InterfaceC573150Mdt r43, boolean r44, com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r45, java.lang.Long r46, boolean r47, java.util.List r48, java.lang.String r49, X.C1DRG r50, kotlin.jvm.functions.Function1 r51, dmt.av.video.SingleImageCoverBitmapData r52, int r53) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C573020Mdg.LJIIIIZZ(X.0Mdg, com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.util.List, X.0Mdt, boolean, com.ss.android.ugc.aweme.sticker.model.FaceStickerBean, java.lang.Long, boolean, java.util.List, java.lang.String, X.1DRG, kotlin.jvm.functions.Function1, dmt.av.video.SingleImageCoverBitmapData, int):void");
    }
}
