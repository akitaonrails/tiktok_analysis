package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.StoryNoteInfoModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollectionKt;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.story.IStoryPublishService;
import com.ss.android.ugc.aweme.services.story.SimplePublishModelKt;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PhotoModeExposureData;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.recoverpanel.PublishFailureReason;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS125S1100000_11;
import kotlin.jvm.internal.AwS242S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.AwS96S1200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729440SjO implements SocialPublishCallback, InterfaceC1593650rZb, InterfaceC729270Sj7 {
    public final C728210ShP LL;
    public final C729300SjA LLILLJJLI;
    public float LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public String LLIZLLLIL;
    public String LLJ;
    public final AtomicBoolean LLIZ = new AtomicBoolean(false);
    public final C01GW LLJI = C452501pT.LIZIZ(new C729470SjR());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C729290Sj9(this));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C729280Sj8(this));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C729480SjS());
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C729330SjD());

    @Override // X.InterfaceC727980Sh2
    public final List<C0SPF> LIZ() {
        return null;
    }

    @Override // X.InterfaceC1581360rFm
    public final void LIZJ() {
    }

    @Override // X.InterfaceC727980Sh2
    public final C729450SjP LIZLLL(String str) {
        return null;
    }

    @Override // X.InterfaceC1593650rZb
    public final InterfaceC1593660rZc LJ() {
        return null;
    }

    @Override // X.InterfaceC727980Sh2
    public final C0SPF LJIIJ(String str) {
        return null;
    }

    @Override // X.InterfaceC1581360rFm
    public final void LJIIL(String str) {
    }

    @Override // X.C0CWQ
    public final int LJIILJJIL(UserStory userStory) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReportPublish() {
    }

    @Override // X.InterfaceC1441160nbe
    public final void updatePreviewCoverPath(String str, String str2) {
    }

    @Override // X.InterfaceC1593650rZb
    public final boolean LJIIIIZZ() {
        InterfaceC566960MLm storyService;
        IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null);
        if (iAVServiceProxy == null || (storyService = iAVServiceProxy.getStoryService()) == null) {
            return false;
        }
        return storyService.LJI() ? !C0CHQ.LIZ().getAccountService().LIZ() : storyService.LIZ();
    }

    @Override // X.InterfaceC727980Sh2
    public final List<Aweme> LJIIIZ() {
        return new ArrayList();
    }

    @Override // X.InterfaceC727980Sh2
    public final List<Aweme> LJIILL() {
        return new ArrayList();
    }

    @Override // X.InterfaceC1581360rFm
    public final boolean isPublishing() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1593650rZb
    public final boolean LIZIZ(PublishModel publishModel) {
        if (!publishModel.isStoryPublish) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1581360rFm
    public final EnumC696090RSd LJFF(String str) {
        C0SPF next;
        C729450SjP c729450SjP;
        EnumC696090RSd enumC696090RSd;
        Iterator<C0SPF> it2 = this.LL.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.creationId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0SPF c0spf = next;
        if (c0spf != null && (c729450SjP = c0spf.LIZIZ) != null && (enumC696090RSd = c729450SjP.LIZIZ) != null) {
            return enumC696090RSd;
        }
        return EnumC696090RSd.DEFAULT;
    }

    @Override // X.C0CWQ
    public final void LJIILIIL(String str) {
        LJIJJLI(str);
    }

    public final Video LJIILLIIL(PublishModel publishModel) {
        BaseShortVideoContext baseShortVideoContext;
        MusicBuzModel musicInfo;
        int width;
        int height;
        double d;
        String str;
        int width2;
        MusicObject musicObject;
        MusicObject musicObject2;
        List<SingleImageData> list;
        SingleImageData singleImageData;
        IInfoService iInfoServiceInfoService = ((IExternalService) this.LLJI.getValue()).infoService();
        SrcImageInfo srcImageInfo = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        VideoExposureData videoExposureDataConvertToExposureData = iInfoServiceInfoService.convertToExposureData(baseShortVideoContext);
        if (videoExposureDataConvertToExposureData != null) {
            musicInfo = videoExposureDataConvertToExposureData.getMusicInfo();
            PhotoModeExposureData photoModeExposureData = videoExposureDataConvertToExposureData.getPhotoModeExposureData();
            if (photoModeExposureData != null && (list = photoModeExposureData.imageList) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(list)) != null) {
                srcImageInfo = singleImageData.getSrcImageInfo();
            }
        } else {
            musicInfo = null;
        }
        Video video = new Video();
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        int height2 = 0;
        if (srcImageInfo != null) {
            width = srcImageInfo.getWidth();
        } else {
            width = 0;
        }
        videoUrlModel.setWidth(width);
        if (srcImageInfo != null) {
            height = srcImageInfo.getHeight();
        } else {
            height = 0;
        }
        videoUrlModel.setHeight(height);
        double d2 = 0.0d;
        if (musicInfo != null && (musicObject2 = musicInfo.music) != null) {
            d = musicObject2.duration;
        } else {
            d = 0.0d;
        }
        videoUrlModel.setDuration(d);
        if (musicInfo == null || (str = musicInfo.path) == null) {
            str = "";
        }
        videoUrlModel.setUri(str);
        videoUrlModel.setUrlList(Collections.singletonList(videoUrlModel.getUri()));
        videoUrlModel.setUrlKey(videoUrlModel.getUri());
        video.setPlayAddr(videoUrlModel);
        if (srcImageInfo != null) {
            width2 = srcImageInfo.getWidth();
        } else {
            width2 = 0;
        }
        video.setWidth(width2);
        if (srcImageInfo != null) {
            height2 = srcImageInfo.getHeight();
        }
        video.setHeight(height2);
        if (musicInfo != null && (musicObject = musicInfo.music) != null) {
            d2 = musicObject.duration;
        }
        video.setDuration(d2);
        return video;
    }

    public final PhotoModeImageInfo LJIIZILJ(PublishModel publishModel) {
        BaseShortVideoContext baseShortVideoContext;
        SrcImageInfo srcImageInfo;
        int width;
        int height;
        String path;
        BaseShortVideoContext baseShortVideoContext2;
        VideoPublishEditModel videoPublishEditModel;
        UrlModel urlModel;
        String str;
        PhotoModeExposureData photoModeExposureData;
        List<SingleImageData> list;
        SingleImageData singleImageData;
        IInfoService iInfoServiceInfoService = ((IExternalService) this.LLJI.getValue()).infoService();
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        VideoExposureData videoExposureDataConvertToExposureData = iInfoServiceInfoService.convertToExposureData(baseShortVideoContext);
        if (videoExposureDataConvertToExposureData != null && (photoModeExposureData = videoExposureDataConvertToExposureData.getPhotoModeExposureData()) != null && (list = photoModeExposureData.imageList) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(list)) != null) {
            srcImageInfo = singleImageData.getSrcImageInfo();
        } else {
            srcImageInfo = null;
        }
        UrlModel urlModel2 = new UrlModel();
        if (srcImageInfo != null) {
            width = srcImageInfo.getWidth();
        } else {
            width = 0;
        }
        urlModel2.setWidth(width);
        if (srcImageInfo != null) {
            height = srcImageInfo.getHeight();
        } else {
            height = 0;
        }
        urlModel2.setHeight(height);
        if (srcImageInfo != null) {
            path = srcImageInfo.getPath();
        } else {
            path = null;
        }
        urlModel2.setUri(C710930Rud.LJIIIZ(path));
        urlModel2.setUrlList(Collections.singletonList(urlModel2.getUri()));
        urlModel2.setUrlKey(urlModel2.getUri());
        PhotoModeImageInfo photoModeImageInfo = new PhotoModeImageInfo();
        PhotoModeImageUrlModel[] photoModeImageUrlModelArr = new PhotoModeImageUrlModel[1];
        PhotoModeImageUrlModel photoModeImageUrlModel = new PhotoModeImageUrlModel(urlModel2, new UrlModel(), new UrlModel(), new UrlModel(), null, null, null, null, null, null, null, null);
        if (publishModel != null) {
            baseShortVideoContext2 = publishModel.editModel;
        } else {
            baseShortVideoContext2 = null;
        }
        if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2) != null && C1428470nHB.LLFZ(videoPublishEditModel)) {
            StoryNoteInfoModel storyNoteInfoModel = videoPublishEditModel.getCreativeModel().storyModel.getStoryNoteInfoModel();
            if (storyNoteInfoModel != null && (str = storyNoteInfoModel.animatedAvatarFilePath) != null) {
                urlModel = StoryNoteDataCollectionKt.toUrlModel(str);
            } else {
                urlModel = null;
            }
            photoModeImageUrlModel.setDynamicImage(urlModel);
        }
        photoModeImageUrlModelArr[0] = photoModeImageUrlModel;
        photoModeImageInfo.setImageList(C1697810uHb.LJIILJJIL(photoModeImageUrlModelArr));
        return photoModeImageInfo;
    }

    public final C0SPF LJIJ(String str) {
        return this.LL.LIZJ(str);
    }

    public final boolean LJIJJLI(String str) {
        InterfaceC729580Sjc interfaceC729580Sjc = (InterfaceC729580Sjc) this.LLJILJILJ.getValue();
        if (interfaceC729580Sjc != null) {
            interfaceC729580Sjc.LIZ(str);
        }
        C728210ShP c728210ShP = this.LL;
        if (str == null) {
            c728210ShP.getClass();
            return false;
        }
        for (C0SPF c0spf : c728210ShP.LIZJ) {
            if (Intrinsics.LJFF(c0spf.LIZ.creationId, str)) {
                if (c0spf == null) {
                    return false;
                }
                return c728210ShP.LIZJ.remove(c0spf);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
        if (publishModel == null) {
            return;
        }
        InterfaceC729580Sjc interfaceC729580Sjc = (InterfaceC729580Sjc) this.LLJILJILJ.getValue();
        if (interfaceC729580Sjc != null) {
            interfaceC729580Sjc.LJ(publishModel.creationId);
        }
        LJIJI(Collections.singletonList(SimplePublishModelKt.convert2SimplePublishModel(publishModel)), EnumC696090RSd.UPLOADING, "", new AwS590S0100000_11(this, 436));
        this.LL.LIZJ.size();
        this.LLILZIL = true;
        this.LLILZLL = true;
        this.LLIZ.set(true);
        this.LLILLJJLI.LIZ(new AwS590S0100000_11(publishModel, 437));
    }

    public C729440SjO(C728210ShP c728210ShP, C729300SjA c729300SjA) {
        this.LL = c728210ShP;
        this.LLILLJJLI = c729300SjA;
    }

    @Override // X.C0CWQ
    public final void LJI(String str, boolean z) {
        if (str == null) {
            return;
        }
        LJIJJLI(str);
        C728210ShP c728210ShP = this.LL;
        Iterator<Aweme> it2 = c728210ShP.LIZIZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Aweme next = it2.next();
            if (TextUtils.equals(str, AwemeBizExtKt.getScheduleId(next))) {
                c728210ShP.LIZIZ().remove(next);
                break;
            }
        }
        C728210ShP c728210ShP2 = this.LL;
        ((ConcurrentHashMap) c728210ShP2.LJ.getValue()).remove(str);
        ((ConcurrentHashMap) c728210ShP2.LJFF.getValue()).remove(str);
        if (z) {
            this.LLILLJJLI.LIZ(new AwS62S1000000_11(str, 10));
        }
    }

    @Override // X.InterfaceC1581360rFm
    public final void LJII(Object obj, InterfaceC729460SjQ interfaceC729460SjQ) {
        this.LLILLJJLI.LIZ.put(obj, interfaceC729460SjQ);
    }

    @Override // X.C0CWQ
    public final void LJIIJJI(Context context, InterfaceC497601wk interfaceC497601wk) {
        if (Intrinsics.LJFF(this.LLIZLLLIL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) && this.LL.LIZIZ.getAndSet(true)) {
            return;
        }
        this.LLIZLLLIL = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C729220Sj2.LL.LIZJ();
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C729350SjF(this, context, interfaceC497601wk, null), 2);
    }

    public final void LJIJJ(EnumC696090RSd enumC696090RSd, PublishModel publishModel) {
        String uid;
        Object c098200Yq;
        String str = publishModel.creationId;
        C0SPF c0spfLJIJ = LJIJ(str);
        if (c0spfLJIJ == null) {
            return;
        }
        c0spfLJIJ.LIZIZ.LIZIZ = enumC696090RSd;
        User userLIZ = C10EU.LIZ();
        if (userLIZ != null) {
            uid = userLIZ.getUid();
        } else {
            uid = null;
        }
        if (enumC696090RSd == EnumC696090RSd.SUCCESS && !TextUtils.isEmpty(uid)) {
            this.LLILZ++;
            C1618440sDa.LIZIZ.LJJLIIIJLJLI().LIZIZ(C728090ShD.LIZ.LJIIIIZZ(), null, false);
            C718010SEl.LIZ.getClass();
            C718010SEl.LJIIIIZZ(true);
        }
        this.LLILLJJLI.LIZ(new AwS125S1100000_11(str, c0spfLJIJ, 8));
        Iterator<C0SPF> it2 = this.LL.LIZJ.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            if (it2.next().LIZIZ.LIZIZ == EnumC696090RSd.UPLOADING) {
                z = false;
            }
        }
        if (z) {
            C729220Sj2.LL.getClass();
            if (C729220Sj2.LJIJ()) {
                enumC696090RSd = EnumC696090RSd.FAILED;
            }
            this.LLILZ = 0;
            this.LLILZIL = false;
            this.LLILZLL = false;
            this.LLIZ.set(false);
            this.LLILLJJLI.LIZ(new AwS242S0000000_11(enumC696090RSd, 4));
            if (enumC696090RSd == EnumC696090RSd.SUCCESS) {
                new Object() { // from class: X.0SjU
                }.getClass();
                if (((Number) C264050AWl.LIZ.getValue()).intValue() == 1) {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    if (contextLIZ != null) {
                        try {
                            new C0ZDN(contextLIZ).LIZ(2);
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    }
                }
            }
        }
    }

    public final boolean LJIL(C19EG c19eg, C0SPF c0spf) {
        ((IStoryPublishService) this.LLJIJIL.getValue()).retryPublish(c19eg, c0spf.LIZ, new PublishFailureReason(null, false, "AVATAR", null), new AwS377S0200000_11(c0spf, this, 118));
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
        PublishModel publishModel;
        String str;
        C0SPF c0spfLJIJ;
        if (c1434900nRY == null || (publishModel = c1434900nRY.LIZJ) == null || (c0spfLJIJ = LJIJ((str = publishModel.creationId))) == null) {
            return;
        }
        if (!this.LLILZIL) {
            onPublishStart(publishModel);
        }
        c0spfLJIJ.LIZ.setPublishId(publishModel.publishId);
        C729450SjP c729450SjP = c0spfLJIJ.LIZIZ;
        c729450SjP.LIZ = i / 100.0f;
        c729450SjP.LJFF = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().isAutoRetry();
        int size = this.LL.LIZJ.size();
        int i2 = this.LLILZ;
        float f = size + i2;
        float f2 = i2 * 1.0f;
        Iterator<C0SPF> it2 = this.LL.LIZJ.iterator();
        while (it2.hasNext()) {
            f2 += it2.next().LIZIZ.LIZ;
        }
        this.LLILLL = f2 / f;
        this.LLILLJJLI.LIZ(new AwS96S1200000_11(this, str, c0spfLJIJ, 7));
        C729450SjP c729450SjP2 = c0spfLJIJ.LIZIZ;
        if (c729450SjP2.LJFF && !c729450SjP2.LJI) {
            c729450SjP2.LJI = true;
            C735840Sti.LIZ.getClass();
            C0LAB c0lab = new C0LAB();
            C1609930rzr.LIZJ(c0lab, c0spfLJIJ.LIZIZ, "head_status");
            C20684815ws.LJIILLIIL("publish_landing_status_show", c0lab.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        String str;
        C0SPF c0spfLJIJ;
        boolean z;
        if (publishModel == null) {
            return;
        }
        InterfaceC729580Sjc interfaceC729580Sjc = (InterfaceC729580Sjc) this.LLJILJILJ.getValue();
        if (interfaceC729580Sjc != null) {
            interfaceC729580Sjc.LIZ(publishModel.creationId);
        }
        String str2 = publishModel.creationId;
        BaseResponse.ServerTimeExtra serverTimeExtra = createAwemeResponse.extra;
        if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
            str = "";
        }
        Aweme aweme = createAwemeResponse.aweme;
        if (aweme != null && (c0spfLJIJ = LJIJ(str2)) != null) {
            aweme.setRequestId(str);
            AwemeBizExtKt.setScheduleId(aweme, str2);
            c0spfLJIJ.LIZIZ.LJ = aweme;
            Iterator<Aweme> it2 = this.LL.LIZIZ().iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (TextUtils.equals(str2, AwemeBizExtKt.getScheduleId(it2.next()))) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            CopyOnWriteArrayList<Aweme> copyOnWriteArrayListLIZIZ = this.LL.LIZIZ();
            if (i >= 0 && i < copyOnWriteArrayListLIZIZ.size()) {
                Aweme aweme2 = (Aweme) ListProtector.get(copyOnWriteArrayListLIZIZ, i);
                Story story = aweme.getStory();
                if (story != null) {
                    Story story2 = aweme2.getStory();
                    if (story2 != null) {
                        z = story2.viewed;
                    } else {
                        z = false;
                    }
                    story.setViewed(z);
                }
                Story story3 = aweme.getStory();
                if (story3 != null && story3.viewed) {
                    new PthreadTimer("ClassicStoryPublishManager").schedule(new C785860UsC(aweme, 3), 2000L);
                }
                C728210ShP c728210ShP = this.LL;
                if (i < c728210ShP.LIZIZ().size()) {
                    c728210ShP.LIZIZ().set(i, aweme);
                }
            }
            IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
            if (iAwemeService != null) {
                iAwemeService.LLILLL(aweme);
            }
            C728210ShP c728210ShP2 = this.LL;
            ((ConcurrentHashMap) c728210ShP2.LJ.getValue()).remove(str2);
            ((ConcurrentHashMap) c728210ShP2.LJFF.getValue()).remove(str2);
        }
        LJIJJ(EnumC696090RSd.SUCCESS, publishModel);
        ((InterfaceC1618460sDc) this.LLJILLL.getValue()).LJIILLIIL(createAwemeResponse.aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthesisSuccess(final PublishModel publishModel, final String str) {
        PhotoModeImageInfo photoModeImageInfoLJIIZILJ;
        VideoPublishEditModel videoPublishEditModel;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        UrlModel urlModel;
        String str2;
        if (publishModel == null) {
            return;
        }
        if (publishModel.isStoryPublish && publishModel.videoType == 11) {
            Aweme awemeLIZ = this.LL.LIZ(publishModel.creationId);
            if (awemeLIZ != null) {
                awemeLIZ.setVideo(LJIILLIIL(publishModel));
                BaseShortVideoContext baseShortVideoContext = publishModel.editModel;
                if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null && !imageList.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<SingleImageData> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        ImageSynthesisResult synthesisData = it2.next().getSynthesisData();
                        if (synthesisData != null && synthesisData.getPath().length() > 0) {
                            UrlModel urlModel2 = new UrlModel();
                            urlModel2.setWidth(synthesisData.getWidth());
                            urlModel2.setHeight(synthesisData.getHeight());
                            urlModel2.setUri(C710930Rud.LJIIIZ(synthesisData.getPath()));
                            urlModel2.setUrlList(Collections.singletonList(urlModel2.getUri()));
                            urlModel2.setUrlKey(urlModel2.getUri());
                            PhotoModeImageUrlModel photoModeImageUrlModel = new PhotoModeImageUrlModel(urlModel2, new UrlModel(), new UrlModel(), new UrlModel(), null, null, null, null, null, null, null, null);
                            if (C1428470nHB.LLFZ(videoPublishEditModel) && videoPublishEditModel != null) {
                                StoryNoteInfoModel storyNoteInfoModel = videoPublishEditModel.getCreativeModel().storyModel.getStoryNoteInfoModel();
                                if (storyNoteInfoModel != null && (str2 = storyNoteInfoModel.animatedAvatarFilePath) != null) {
                                    urlModel = StoryNoteDataCollectionKt.toUrlModel(str2);
                                } else {
                                    urlModel = null;
                                }
                                photoModeImageUrlModel.setDynamicImage(urlModel);
                            }
                            arrayList.add(photoModeImageUrlModel);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        photoModeImageInfoLJIIZILJ = LJIIZILJ(publishModel);
                    } else {
                        photoModeImageInfoLJIIZILJ = new PhotoModeImageInfo();
                        photoModeImageInfoLJIIZILJ.setImageList(arrayList);
                    }
                } else {
                    photoModeImageInfoLJIIZILJ = LJIIZILJ(publishModel);
                }
                awemeLIZ.setPhotoModeImageInfo(photoModeImageInfoLJIIZILJ);
                String scheduleId = AwemeBizExtKt.getScheduleId(awemeLIZ);
                if (scheduleId == null) {
                    scheduleId = "";
                }
                this.LLILLJJLI.LIZ(new AwS125S1100000_11(scheduleId, this, 9));
                return;
            }
            return;
        }
        ((IExternalService) this.LLJI.getValue()).abilityService().infoService().videoInfo(str, true, new IAVInfoService.IGetInfoCallback<int[]>() { // from class: X.0SjK
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final void finish(int[] iArr) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int[] iArr2 = iArr;
                Video video = new Video();
                String str3 = str;
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                int i6 = 0;
                if (iArr2 != null) {
                    i = iArr2[0];
                } else {
                    i = 0;
                }
                videoUrlModel.setWidth(i);
                if (iArr2 != null) {
                    i2 = iArr2[1];
                } else {
                    i2 = 0;
                }
                videoUrlModel.setHeight(i2);
                if (iArr2 != null) {
                    i3 = iArr2[10];
                } else {
                    i3 = 0;
                }
                videoUrlModel.setDuration(i3);
                videoUrlModel.setUri(str3);
                videoUrlModel.setUrlList(Collections.singletonList(videoUrlModel.getUri()));
                videoUrlModel.setUrlKey(videoUrlModel.getUri());
                video.setPlayAddr(videoUrlModel);
                if (iArr2 != null) {
                    i4 = iArr2[0];
                } else {
                    i4 = 0;
                }
                video.setWidth(i4);
                if (iArr2 != null) {
                    i5 = iArr2[1];
                } else {
                    i5 = 0;
                }
                video.setHeight(i5);
                if (iArr2 != null) {
                    i6 = iArr2[10];
                }
                video.setDuration(i6);
                Aweme awemeLIZ2 = this.LIZ.LL.LIZ(publishModel.creationId);
                if (awemeLIZ2 != null) {
                    C729440SjO c729440SjO = this.LIZ;
                    awemeLIZ2.setVideo(video);
                    String scheduleId2 = AwemeBizExtKt.getScheduleId(awemeLIZ2);
                    if (scheduleId2 == null) {
                        scheduleId2 = "";
                    }
                    c729440SjO.LLILLJJLI.LIZ(new AwS125S1100000_11(scheduleId2, c729440SjO, 9));
                }
                String str4 = publishModel.creationId;
                C729370SjH.LIZLLL.put(str4, video);
                Set setLIZ = C729370SjH.LIZ();
                if (setLIZ != null) {
                    setLIZ.add(str4);
                }
                try {
                    C729370SjH.LIZIZ().storeStringSet("key_unique_id_list", C729370SjH.LIZ());
                    C729370SjH.LIZIZ().storeStringJustDisk(str4, ((Gson) C729370SjH.LIZ.getValue()).LJIILL(video));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
        String str2;
        C0SPF c0spfLJIJ;
        if (publishModel == null || (c0spfLJIJ = LJIJ((str2 = publishModel.creationId))) == null) {
            return;
        }
        if (c1434650nR9.getOriginErrorCode() != 3013046 && c1434650nR9.getOriginErrorCode() != 3013045) {
            c0spfLJIJ.LIZIZ.LIZLLL = str;
        } else {
            C729450SjP c729450SjP = c0spfLJIJ.LIZIZ;
            C844470XAv.LIZ.getClass();
            c729450SjP.LIZLLL = C844470XAv.LIZ().getString(2131849116);
        }
        if (((Number) C287140BNg.LIZ.getValue()).intValue() == 1) {
            C728210ShP c728210ShP = this.LL;
            ((ConcurrentHashMap) c728210ShP.LJ.getValue()).remove(str2);
            ((ConcurrentHashMap) c728210ShP.LJFF.getValue()).remove(str2);
        }
        LJIJJ(EnumC696090RSd.FAILED, publishModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x002d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(java.util.List<com.ss.android.ugc.aweme.services.story.SimplePublishModel> r37, X.EnumC696090RSd r38, java.lang.String r39, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.shortvideo.publish.PublishModel, ? extends com.ss.android.ugc.aweme.feed.model.Video> r40) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C729440SjO.LJIJI(java.util.List, X.0RSd, java.lang.String, kotlin.jvm.functions.Function1):void");
    }
}
