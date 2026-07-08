package X;

import Y.ARunnableS13S1100000_8;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MP7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MP7 implements InterfaceC522520KeQ {
    public final C19EG LL;
    public MvThemeData LLILLL;
    public AVETParameter LLILZ;
    public ShortVideoContext LLILZIL;
    public C536880L3u LLILZLL;
    public AVChallenge LLIZ;
    public boolean LLIZLLLIL;
    public long LLJIJIL;
    public long LLJILJIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 900));
    public final Map<String, String> LLJ = new LinkedHashMap();
    public final List<MvNetFileBean> LLJI = new ArrayList();
    public final ArrayList<ImportVideoInfo> LLJILJILJ = new ArrayList<>();
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 901));

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    public final C0MPG LIZJ() {
        return (C0MPG) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
        C15O7.LIZJ(new Callable() { // from class: X.09Km
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("MvMediaProcessImpl@1cbd.quit$1");
                for (Map.Entry entry : ((LinkedHashMap) this.LL.LLJ).entrySet()) {
                    if (u.LJIIZILJ((String) entry.getValue(), ".bmp", false)) {
                        C2354709Kn.LJIJJLI((String) entry.getValue());
                    }
                }
                Iterator it2 = ((ArrayList) this.LL.LLJI).iterator();
                while (it2.hasNext()) {
                    C2354709Kn.LJIJJLI(((MvNetFileBean) it2.next()).getFilePath());
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MvMediaProcessImpl@1cbd.quit$1");
                return unit;
            }
        });
    }

    public C0MP7(C19EG c19eg) {
        this.LL = c19eg;
    }

    public final void LIZLLL(MvCreateVideoData mvCreateVideoData) {
        String strLJ;
        String strLJ2;
        String resourceId;
        List<String> music;
        C536880L3u c536880L3u;
        String strLIZLLL;
        Bundle extras;
        Bundle extras2;
        List<String> music2;
        List<String> music3;
        Effect effect;
        Effect effect2;
        C536880L3u c536880L3u2;
        String strLIZLLL2;
        C536880L3u c536880L3u3;
        String strLIZLLL3;
        C536880L3u c536880L3u4 = this.LLILZLL;
        if (c536880L3u4 == null) {
            c536880L3u4 = null;
        }
        c536880L3u4.LIZLLL = System.currentTimeMillis() - this.LLJILJIL;
        if (C0CHQ.LIZ().getAccountService() != null && C0CHQ.LIZ().getAccountService().LIZ()) {
            C536880L3u c536880L3u5 = this.LLILZLL;
            if (c536880L3u5 == null) {
                c536880L3u3 = null;
            } else {
                c536880L3u3 = c536880L3u5;
            }
            c536880L3u3.LIZ = 1;
            c536880L3u3.LIZIZ = 101;
            c536880L3u3.LIZJ = "teen mode";
            C536890L3v c536890L3v = C536890L3v.LIZ;
            if (c536880L3u5 == null) {
                c536880L3u5 = null;
            }
            MvThemeData mvThemeData = this.LLILLL;
            if (mvThemeData == null || (strLIZLLL3 = mvThemeData.LIZLLL()) == null) {
                strLIZLLL3 = "";
            }
            c536890L3v.getClass();
            C536890L3v.LIZIZ(c536880L3u5, strLIZLLL3, "", "mv");
            C0MP9.LIZ(false, this.LLILLL, new Pair(101, "teen mode"));
            return;
        }
        if (mvCreateVideoData.selectMediaList.isEmpty()) {
            C19EG c19eg = this.LL;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(this.LL.getString(R.string.khy));
            C1390380mHk.LIZ(c19eg, 3003, creativeToastBuilder);
            C536880L3u c536880L3u6 = this.LLILZLL;
            if (c536880L3u6 == null) {
                c536880L3u2 = null;
            } else {
                c536880L3u2 = c536880L3u6;
            }
            c536880L3u2.LIZ = 1;
            c536880L3u2.LIZIZ = 100;
            c536880L3u2.LIZJ = "media list is empty";
            C536890L3v c536890L3v2 = C536890L3v.LIZ;
            if (c536880L3u6 == null) {
                c536880L3u6 = null;
            }
            MvThemeData mvThemeData2 = this.LLILLL;
            if (mvThemeData2 == null || (strLIZLLL2 = mvThemeData2.LIZLLL()) == null) {
                strLIZLLL2 = "";
            }
            c536890L3v2.getClass();
            C536890L3v.LIZIZ(c536880L3u6, strLIZLLL2, "", "mv");
            C0MP9.LIZ(false, this.LLILLL, new Pair(100, "media list is empty"));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJIL;
        MvThemeData mvThemeData3 = this.LLILLL;
        if (mvThemeData3 != null) {
            strLJ = mvThemeData3.LJ();
        } else {
            strLJ = null;
        }
        boolean z = this.LLIZLLLIL;
        if (!C580130Mp9.LIZ(mvCreateVideoData.selectMediaList) && strLJ != null) {
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("duration", Long.valueOf(jCurrentTimeMillis));
            c543670LTx.LIZ.put("pictureCount", Integer.valueOf(mvCreateVideoData.selectMediaList.size()));
            c543670LTx.LIZ.put("needServer", Boolean.valueOf(z));
            c543670LTx.LIZ.put("mvID", strLJ);
            C1637890six.LJ("aweme_mv_generate_duration", 0, c543670LTx.LJ());
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", "photo");
        c0lab.LJ("upload_type", "mv");
        C20684815ws.LJIILLIIL("upload_event_next", c0lab.LIZ);
        MvThemeData mvThemeData4 = this.LLILLL;
        if (mvThemeData4 != null) {
            strLJ2 = mvThemeData4.LJ();
        } else {
            strLJ2 = null;
        }
        C574480Mg2.LIZIZ(new C1178604jI(strLJ2));
        MvThemeData mvThemeData5 = this.LLILLL;
        if (mvThemeData5 != null && (effect2 = mvThemeData5.effect) != null) {
            resourceId = effect2.getResourceId();
        } else {
            resourceId = null;
        }
        C574480Mg2.LIZIZ(new C1259004wG(resourceId));
        C574480Mg2.LIZIZ(new C1179004jM(strLJ2));
        MvThemeData mvThemeData6 = this.LLILLL;
        AVChallenge aVChallenge = this.LLIZ;
        ShortVideoContext shortVideoContext = this.LLILZIL;
        if (shortVideoContext == null) {
            shortVideoContext = null;
        }
        AVETParameter aVETParameter = this.LLILZ;
        long j = this.LLJIJIL;
        ArrayList<ImportVideoInfo> arrayList = this.LLJILJILJ;
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, shortVideoContext.creativeModel);
        if (mvThemeData6 != null && (effect = mvThemeData6.effect) != null) {
            music = effect.getMusic();
        } else {
            music = null;
        }
        mvCreateVideoData.musicIds = music;
        if (mvThemeData6 != null && !TextUtils.isEmpty(mvThemeData6.LJ())) {
            AVUploadMiscInfoStruct aVUploadMiscInfoStruct = new AVUploadMiscInfoStruct();
            aVUploadMiscInfoStruct.mvThemeId = mvThemeData6.LJ();
            EnumC1412640mre enumC1412640mre = EnumC1412640mre.MV_TEMPLATE;
            aVUploadMiscInfoStruct.mvType = enumC1412640mre.getValue();
            MvModel mvModel = new MvModel();
            mvModel.setMvId(mvThemeData6.LJ());
            mvModel.setName(mvThemeData6.effect.getName());
            mvModel.setMvAnchor(mvThemeData6.isMvAnchor);
            aVUploadMiscInfoStruct.mvInfo = mvModel;
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(mvThemeData6.effect.getIconUrl().getUrlList());
            mvModel.setIconUrl(urlModel);
            aVUploadMiscInfoStruct.sourceId = mvThemeData6.sourceId;
            C0MUK.LIZIZ(intent).uploadMiscInfoStruct = aVUploadMiscInfoStruct;
            com.ss.android.ugc.aweme.creative.model.template.MvModel mvModel2 = C0MUK.LIZIZ(intent).mvModel;
            String strLJ3 = mvThemeData6.LJ();
            if (strLJ3 == null) {
                strLJ3 = "";
            }
            mvModel2.templateId = strLJ3;
            intent.putExtra("template_type", enumC1412640mre.getValue());
            intent.putExtra("template_name", aVUploadMiscInfoStruct.mvInfo.getName());
            Effect effect3 = mvThemeData6.effect;
            if (effect3 != null) {
                music2 = effect3.getMusic();
            } else {
                music2 = null;
            }
            if (!C580130Mp9.LIZ(music2)) {
                Gson gson = new Gson();
                Effect effect4 = mvThemeData6.effect;
                if (effect4 != null) {
                    music3 = effect4.getMusic();
                } else {
                    music3 = null;
                }
                C0MUK.LIZIZ(intent).recordEffectModel.firstStickerMusicIdsJson = GsonProtectorUtils.toJson(gson, music3);
            }
            if (TextUtils.equals(mvThemeData6.LJ(), shortVideoContext.mBindMovieId)) {
                intent.putExtra("extra_bind_mv_id", shortVideoContext.mBindMovieId);
            }
            mvCreateVideoData.mvResUnzipPath = mvThemeData6.LIZJ();
            mvCreateVideoData.mvType = mvThemeData6.mvType;
            mvCreateVideoData.mvId = mvThemeData6.LJ();
            mvCreateVideoData.mvAutoSaveToast = mvThemeData6.mvAutoSaveToast;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C570490MZb.LIZJ(C0MPK.LIZ(shortVideoContext.creativeInfo)));
        sbLIZ.append(C0MPK.LIZJ(".mp4"));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C570490MZb.LJI(new C0VSJ(strLIZIZ));
        mvCreateVideoData.contactVideoPath = strLIZIZ;
        C0MUK.LIZIZ(intent).mvModel.mvCreateVideoData = mvCreateVideoData;
        C0MUK.LIZIZ(intent).creativeFlowData = shortVideoContext.creativeFlowData;
        C0MUK.LIZIZ(intent).followUpPublishTrackerModel.followUpFirstItemId = C1443560nfW.LJI;
        C0MUK.LIZIZ(intent).followUpPublishTrackerModel.followUpItemIdGroups = C1443560nfW.LJII;
        C0MUK.LIZIZ(intent).followUpPublishTrackerModel.enterRecordFromFeed = true;
        C0MUK.LIZIZ(intent).followUpPublishTrackerModel.followUpPromoId = C1443560nfW.LJIIJJI;
        intent.putExtra("key_mv_theme_enter", true);
        if (arrayList != null && !arrayList.isEmpty()) {
            C0MUK.LIZIZ(intent).albumModel.importInfoList = arrayList;
        }
        if (aVETParameter != null) {
            List arrayList2 = C1443030nef.LJII().LIZ;
            if (aVChallenge != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(aVChallenge);
            }
            C0MUK.LIZIZ(intent).editModel.editPreviewInfo = new C0MOM(720, 1280).LIZ(mvCreateVideoData);
            intent.putExtra("challenge", (Serializable) arrayList2);
            intent.putExtra("shoot_way", aVETParameter.getShootWay());
            intent.putExtra("enter_from", shortVideoContext.enterFrom);
            C537520L6g.LIZLLL(intent, shortVideoContext.creativeInfo);
            C0MUK.LIZIZ(intent).recordData.shootMode = aVETParameter.getShootMode();
            C0MUK.LIZIZ(intent).draftInfoModel.newDraftId = aVETParameter.getNewDraftId();
            C0MUK.LIZIZ(intent).draftInfoModel.draftId = aVETParameter.getDraftId();
            intent.putExtra("origin", 0);
            intent.putExtra("content_type", "mv");
            intent.putExtra("content_source", "upload");
            C0MUK.LIZIZ(intent).editStickerModel.commentVideoModel = shortVideoContext.LJFF();
            C0MUK.LIZIZ(intent).ttsVoiceModel = shortVideoContext.ttsVoiceModel;
            intent.putExtra("extra_start_enter_edit_page", j);
            C0MUK.LIZIZ(intent).microAppModel = shortVideoContext.microAppModel;
            C0MUK.LIZIZ(intent).eventData.shootEnterMethod = shortVideoContext.enterMethod;
            intent.putExtra("commerce_data_in_tools_line", shortVideoContext.extraSession.commerceData);
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            intent.putExtra("extra_music_use_in_record_page_mv", aVMusicExtractAVMusic);
        }
        C536880L3u c536880L3u7 = this.LLILZLL;
        if (c536880L3u7 == null) {
            c536880L3u = null;
        } else {
            c536880L3u = c536880L3u7;
        }
        c536880L3u.LIZ = 0;
        C536890L3v c536890L3v3 = C536890L3v.LIZ;
        if (c536880L3u7 == null) {
            c536880L3u7 = null;
        }
        MvThemeData mvThemeData7 = this.LLILLL;
        if (mvThemeData7 == null || (strLIZLLL = mvThemeData7.LIZLLL()) == null) {
            strLIZLLL = "";
        }
        c536890L3v3.getClass();
        C536890L3v.LIZIZ(c536880L3u7, strLIZLLL, "", "mv");
        ILayoutPreloadServiceForEditPage iLayoutPreloadServiceForEditPage = (ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class);
        C19EG c19eg2 = this.LL;
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            extras = null;
        }
        iLayoutPreloadServiceForEditPage.preloadLayoutFiles(c19eg2, extras);
        C19EG c19eg3 = this.LL;
        try {
            extras2 = intent.getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            extras2 = null;
        }
        C0MWH.LJIILL(c19eg3, extras2);
        C0MP9.LIZ(true, this.LLILLL, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        Serializable serializable;
        boolean z;
        String strLJ;
        String str;
        boolean z2;
        String strLJ2;
        Integer numValueOf;
        String name;
        MvThemeData mvThemeData;
        String strLIZJ;
        int i3;
        ShortVideoContext shortVideoContext;
        if (i == 10001 && i2 == -1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            this.LLJILJILJ.clear();
            int size = parcelableArrayListExtra.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                MediaModel mediaModel = (MediaModel) ListProtector.get(parcelableArrayListExtra, i4);
                if (!mediaModel.LJIILJJIL()) {
                    this.LLJILJILJ.add(new ImportVideoInfo(mediaModel.width, mediaModel.height, 0, 0, String.valueOf(i4), mediaModel.duration, mediaModel.endTime - mediaModel.startTime, "", "", 0, 0.0f, mediaModel.LJFF(), mediaModel.LJFF(), false, null, null, 0L, 122880, null));
                    i4++;
                } else {
                    this.LLJILJILJ.clear();
                    break;
                }
            }
            Bundle bundleG3 = C786410Ut5.g3(intent, "key_extra_info");
            if (bundleG3 != null) {
                serializable = bundleG3.getSerializable("Key_mv_challenge");
            } else {
                serializable = null;
            }
            this.LLIZ = (AVChallenge) serializable;
            this.LLJIJIL = intent.getLongExtra("extra_start_enter_edit_page", System.currentTimeMillis());
            final MvCreateVideoData mvCreateVideoData = new MvCreateVideoData();
            Iterator it2 = parcelableArrayListExtra.iterator();
            while (it2.hasNext()) {
                mvCreateVideoData.selectMediaList.add(((MediaModel) it2.next()).LJFF());
            }
            if (intent.getIntExtra("key_choose_scene", -1) == 31) {
                AVMusic aVMusic = (AVMusic) intent.getSerializableExtra("aweme_music");
                ShortVideoContext shortVideoContext2 = this.LLILZIL;
                if (shortVideoContext2 == null) {
                    shortVideoContext = null;
                } else {
                    shortVideoContext = shortVideoContext2;
                }
                shortVideoContext.creativeModel.musicBuzModel.musicOrigin = "single_song";
                if (shortVideoContext2 == null) {
                    shortVideoContext2 = null;
                }
                C1452640nuA.LJII(aVMusic, false, shortVideoContext2.creativeModel.musicBuzModel);
            }
            MvThemeData mvThemeData2 = (MvThemeData) intent.getParcelableExtra("key_select_mv_data");
            this.LLILLL = mvThemeData2;
            if (mvThemeData2 != null) {
                z = mvThemeData2.needServerExecute;
            } else {
                z = false;
            }
            this.LLIZLLLIL = z;
            this.LLILZIL = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
            ShortVideoContext shortVideoContext3 = this.LLILZIL;
            if (shortVideoContext3 == null) {
                shortVideoContext3 = null;
            }
            String creationId = shortVideoContext3.getCreationId();
            ShortVideoContext shortVideoContext4 = this.LLILZIL;
            if (shortVideoContext4 == null) {
                shortVideoContext4 = null;
            }
            String str2 = shortVideoContext4.shootWay;
            if (str2 == null) {
                str2 = "";
            }
            MvThemeData mvThemeData3 = this.LLILLL;
            if (mvThemeData3 == null || (strLJ = mvThemeData3.LJ()) == null) {
                strLJ = "";
            }
            this.LLILZLL = new C536880L3u(creationId, str2, strLJ);
            ShortVideoContext shortVideoContext5 = this.LLILZIL;
            if (shortVideoContext5 == null) {
                shortVideoContext5 = null;
            }
            this.LLILZ = shortVideoContext5.LJ();
            ShortVideoContext shortVideoContext6 = this.LLILZIL;
            if (shortVideoContext6 == null) {
                shortVideoContext6 = null;
            }
            String str3 = "mv";
            if (parcelableArrayListExtra.size() > 1) {
                str = "multiple_content";
            } else {
                str = "single_content";
            }
            int i5 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            int size2 = parcelableArrayListExtra.size();
            String str4 = "photo";
            if (parcelableArrayListExtra.size() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C528210Knb c528210Knb = new C528210Knb(shortVideoContext6, str3, str, i5, size2, str4, z2, C525670KjV.LIZ(parcelableArrayListExtra), objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, C530690Krb.LIZ(parcelableArrayListExtra), parcelableArrayListExtra, C523870Kgb.LIZ(intent), 1792);
            MvThemeData mvThemeData4 = this.LLILLL;
            if (mvThemeData4 != null) {
                strLJ2 = mvThemeData4.LJ();
            } else {
                strLJ2 = null;
            }
            c528210Knb.LIZJ(strLJ2);
            c528210Knb.LIZIZ.LIZ(0, "is_capcut");
            MvThemeData mvThemeData5 = this.LLILLL;
            if (mvThemeData5 != null) {
                numValueOf = Integer.valueOf(mvThemeData5.isMvAnchor);
            } else {
                numValueOf = null;
            }
            c528210Knb.LIZIZ.LIZLLL(numValueOf, "is_mv_anchor");
            MvThemeData mvThemeData6 = this.LLILLL;
            if (mvThemeData6 != null) {
                Effect effect = mvThemeData6.effect;
                if (effect == null || effect.getName() == null) {
                    name = "";
                } else {
                    name = mvThemeData6.effect.getName();
                }
            } else {
                name = null;
            }
            C0LAB c0lab = c528210Knb.LIZIZ;
            if (name == null) {
                name = "";
            }
            c0lab.LJ("mv_name", name);
            c528210Knb.LIZIZ.LJ("tt_template_type", C1412630mrd.LIZLLL(EnumC1412640mre.MV_TEMPLATE));
            c528210Knb.LIZ();
            if (!C580130Mp9.LIZ(mvCreateVideoData.selectMediaList) && (mvThemeData = this.LLILLL) != null && (strLIZJ = mvThemeData.LIZJ()) != null && strLIZJ.length() > 0) {
                this.LLJILJIL = System.currentTimeMillis();
                if (this.LLIZLLLIL) {
                    C0MPG c0mpgLIZJ = LIZJ();
                    C786410Ut5.LJLIIL(500L, c0mpgLIZJ.LLJ, new ARunnableS13S1100000_8(c0mpgLIZJ, this.LL.getString(2131821934), 1));
                } else {
                    C0MPG c0mpgLIZJ2 = LIZJ();
                    C786410Ut5.LJLIIL(500L, c0mpgLIZJ2.LLJ, new ARunnableS13S1100000_8(c0mpgLIZJ2, this.LL.getString(2131848200), 1));
                }
                final C118300cf c118300cf = new C118300cf();
                c118300cf.element = 720;
                final C118300cf c118300cf2 = new C118300cf();
                c118300cf2.element = 1280;
                final C118300cf c118300cf3 = new C118300cf();
                c118300cf3.element = 1;
                MvThemeData mvThemeData7 = this.LLILLL;
                if (mvThemeData7 != null) {
                    int i6 = mvThemeData7.resWidth;
                    if (i6 != 0 && (i3 = mvThemeData7.resHeight) != 0) {
                        c118300cf.element = i6;
                        c118300cf2.element = i3;
                        mvCreateVideoData.resDestWidth = i6;
                        mvCreateVideoData.resDestHeight = i3;
                    }
                    if (Intrinsics.LJFF("AspectFill", mvThemeData7.resFillMode)) {
                        c118300cf3.element = 1;
                    } else if (Intrinsics.LJFF("AspectFit", mvThemeData7.resFillMode)) {
                        c118300cf3.element = 3;
                    } else if (Intrinsics.LJFF("AspectWidth", mvThemeData7.resFillMode)) {
                        c118300cf3.element = 2;
                    } else if (Intrinsics.LJFF("FreeMode", mvThemeData7.resFillMode)) {
                        c118300cf3.element = 4;
                    } else if (Intrinsics.LJFF("CenterZoom", mvThemeData7.resFillMode)) {
                        c118300cf3.element = 5;
                    }
                }
                mvCreateVideoData.resFillMode = c118300cf3.element;
                mvCreateVideoData.srcSelectMediaList.clear();
                mvCreateVideoData.srcSelectMediaList.addAll(mvCreateVideoData.selectMediaList);
                C15O7.LIZJ(new Callable() { // from class: X.09IZ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Bitmap bitmapLJI;
                        C1C7U.LIZ("MvMediaProcessImpl@1cbd.resizeBitmap$2");
                        ArrayList arrayList = new ArrayList();
                        ShortVideoContext shortVideoContext7 = this.LL.LLILZIL;
                        if (shortVideoContext7 == null) {
                            shortVideoContext7 = null;
                        }
                        String strLIZIZ = C0MPK.LIZIZ(shortVideoContext7.creativeInfo);
                        C570490MZb.LJFF(new C0VSJ(strLIZIZ));
                        for (String str5 : mvCreateVideoData.selectMediaList) {
                            if (C2286708xd.LIZJ(str5)) {
                                Map<String, String> map = this.LL.LLJ;
                                str5.toString();
                                if (map.containsKey(str5) && C2286708xd.LIZJ((String) ((LinkedHashMap) this.LL.LLJ).get(str5))) {
                                    arrayList.add(((LinkedHashMap) this.LL.LLJ).get(str5));
                                } else if (C0C64.LJIILLIIL().LJIJ(31744, 0, "mv_template_support_fast_import", true) != 2 || this.LL.LLIZLLLIL) {
                                    int[] iArrLIZJ = C2475309mx.LIZJ(str5);
                                    if (iArrLIZJ == null) {
                                        arrayList.add(str5);
                                    } else {
                                        boolean z3 = iArrLIZJ[0] > 1080 || iArrLIZJ[1] > 1920;
                                        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "mv_template_support_fast_import", true) != 1 || z3 || this.LL.LLIZLLLIL) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(strLIZIZ);
                                            sbLIZ.append(C0MPK.LIZJ(".bmp"));
                                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                                            int i7 = c118300cf.element;
                                            int i8 = c118300cf2.element;
                                            int i9 = c118300cf3.element;
                                            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                                            if (C2286708xd.LIZJ(str5) && (bitmapLJI = C2475309mx.LJI(i7, i8, C2475309mx.LIZIZ(str5), i9, str5)) != null) {
                                                strLIZIZ2.toString();
                                                if (C2475309mx.LJFF(100, compressFormat, bitmapLJI, new C0VSJ(strLIZIZ2))) {
                                                    this.LL.LLJ.put(str5, strLIZIZ2);
                                                    arrayList.add(strLIZIZ2);
                                                }
                                            }
                                            arrayList.add(str5);
                                        } else {
                                            arrayList.add(str5);
                                        }
                                    }
                                } else {
                                    arrayList.add(str5);
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            mvCreateVideoData.selectMediaList.clear();
                            mvCreateVideoData.selectMediaList.addAll(arrayList);
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("MvMediaProcessImpl@1cbd.resizeBitmap$2");
                        return unit;
                    }
                }).LJ(new C581180Mqq(this, mvCreateVideoData, 1), C15O7.LJIIIIZZ, null);
            }
        }
    }
}
