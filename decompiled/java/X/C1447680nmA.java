package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.publish.PublishStatus;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nmA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447680nmA implements SocialPublishCallback {
    public static final C1447680nmA LL = new C1447680nmA();
    public static final Map<Object, InterfaceC1447710nmD> LLILLJJLI = new LinkedHashMap();
    public static final CopyOnWriteArrayList<C1447700nmC> LLILLL;
    public static boolean LLILZ;

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReportPublish() {
    }

    static {
        new ArrayList();
        LLILLL = new CopyOnWriteArrayList<>();
    }

    public static void LIZ(Function1 function1) {
        Iterator it2 = ((LinkedHashMap) LLILLJJLI).entrySet().iterator();
        while (it2.hasNext()) {
            function1.invoke(((Map.Entry) it2.next()).getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp.LIZ().LIZ() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        X.C1447680nmA.LL.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (X.C1447670nm9.LIZIZ(r5) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r3 = X.C1447670nm9.LJI(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r1 = X.C1447680nmA.LLILLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r1.contains(r3) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r1.add((X.C1447700nmC) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        r3 = X.C1447670nm9.LJII(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if (X.C1447670nm9.LIZIZ(r5) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r3 = X.C1447670nm9.LJI(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        X.C1447680nmA.LLILLL.add((X.C1447700nmC) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r3 = X.C1447670nm9.LJII(r5);
     */
    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPublishStart(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r5) {
        /*
            r4 = this;
            if (r5 == 0) goto Lb
            boolean r0 = r5.isStoryPublish
            if (r0 != 0) goto La
            boolean r0 = r5.LIZ
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            java.util.concurrent.CopyOnWriteArrayList<X.0nmC> r0 = X.C1447680nmA.LLILLL
            java.util.Iterator r2 = r0.iterator()
        L11:
            boolean r0 = r2.hasNext()
            r3 = 0
            if (r0 == 0) goto L30
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0nmC r0 = (X.C1447700nmC) r0
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r0.LIZ
            java.lang.String r0 = r0.creationId
            if (r5 == 0) goto L27
            java.lang.String r3 = r5.creationId
        L27:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L11
            r3 = r1
            if (r1 != 0) goto L56
        L30:
            if (r5 == 0) goto L56
            com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp$Config r0 = com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp.LIZ()
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L99
            X.0nmA r0 = X.C1447680nmA.LL
            r0.getClass()
            boolean r0 = X.C1447670nm9.LIZIZ(r5)
            if (r0 == 0) goto L94
            X.0nmC r3 = X.C1447670nm9.LJI(r5)
        L4b:
            java.util.concurrent.CopyOnWriteArrayList<X.0nmC> r1 = X.C1447680nmA.LLILLL
            boolean r0 = r1.contains(r3)
            if (r0 != 0) goto L56
            r1.add(r3)
        L56:
            X.0nmC r3 = (X.C1447700nmC) r3
            if (r3 == 0) goto L93
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZJ
            if (r0 == 0) goto L69
            com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo r1 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getPreviewData(r0)
            if (r1 == 0) goto L69
            com.ss.android.ugc.aweme.feed.model.publish.PublishStatus r0 = com.ss.android.ugc.aweme.feed.model.publish.PublishStatus.DEFAULT
            r1.setPublishStatus(r0)
        L69:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LIZJ
            if (r0 == 0) goto L84
            com.ss.android.ugc.aweme.feed.model.publish.PublishPreviewInfo r2 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getPreviewData(r0)
            if (r2 == 0) goto L84
            X.0nPf r1 = X.C1433730nPf.LIZ
            if (r5 == 0) goto L7b
            java.lang.String r0 = r5.publishId
            if (r0 != 0) goto L7d
        L7b:
            java.lang.String r0 = ""
        L7d:
            int r0 = X.C1433730nPf.LJIIJ(r1, r0)
            r2.setProgress(r0)
        L84:
            X.0nmA r2 = X.C1447680nmA.LL
            kotlin.jvm.internal.AwS388S0200000_22 r1 = new kotlin.jvm.internal.AwS388S0200000_22
            r0 = 211(0xd3, float:2.96E-43)
            r1.<init>(r5, r3, r0)
            r2.getClass()
            LIZ(r1)
        L93:
            return
        L94:
            X.0nmC r3 = X.C1447670nm9.LJII(r5)
            goto L4b
        L99:
            boolean r0 = X.C1447670nm9.LIZIZ(r5)
            if (r0 == 0) goto La9
            X.0nmC r3 = X.C1447670nm9.LJI(r5)
        La3:
            java.util.concurrent.CopyOnWriteArrayList<X.0nmC> r0 = X.C1447680nmA.LLILLL
            r0.add(r3)
            goto L56
        La9:
            X.0nmC r3 = X.C1447670nm9.LJII(r5)
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1447680nmA.onPublishStart(com.ss.android.ugc.aweme.shortvideo.publish.PublishModel):void");
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
        PublishModel publishModel;
        C1447700nmC c1447700nmC = null;
        if (c1434900nRY != null && (publishModel = c1434900nRY.LIZJ) != null && !publishModel.isStoryPublish && !publishModel.LIZ) {
            Iterator<C1447700nmC> it2 = LLILLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C1447700nmC next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.creationId, publishModel.creationId)) {
                    c1447700nmC = next;
                    break;
                }
            }
            C1447700nmC c1447700nmC2 = c1447700nmC;
            if (c1447700nmC2 != null) {
                if (c1434900nRY.LJ) {
                    i = c1434900nRY.LJFF;
                }
                PublishPreviewInfo previewData = AwemeBizExtKt.getPreviewData(c1447700nmC2.LIZJ);
                if (previewData != null) {
                    previewData.setProgress(i);
                }
                C1447680nmA c1447680nmA = LL;
                AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(publishModel, c1447700nmC2, 210);
                c1447680nmA.getClass();
                LIZ(awS388S0200000_22);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        PublishPreviewInfo previewData;
        C1447700nmC next;
        String str;
        Aweme aweme = createAwemeResponse.aweme;
        Iterator<C1447700nmC> it2 = LLILLL.iterator();
        while (true) {
            previewData = null;
            if (it2.hasNext()) {
                next = it2.next();
                String str2 = next.LIZ.creationId;
                if (publishModel != null) {
                    str = publishModel.creationId;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1447700nmC c1447700nmC = next;
        if (c1447700nmC == null) {
            return;
        }
        Aweme aweme2 = c1447700nmC.LIZJ;
        if (aweme2 != null) {
            previewData = AwemeBizExtKt.getPreviewData(aweme2);
        }
        AwemeBizExtKt.setPreviewData(aweme, previewData);
        PublishPreviewInfo previewData2 = AwemeBizExtKt.getPreviewData(aweme);
        if (previewData2 != null) {
            previewData2.setInPublishing(false);
            previewData2.setPublishStatus(PublishStatus.SUCCESS);
        }
        c1447700nmC.LIZJ = aweme;
        if (publishModel != null) {
            C1447680nmA c1447680nmA = LL;
            AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(publishModel, c1447700nmC, 212);
            c1447680nmA.getClass();
            LIZ(awS388S0200000_22);
        }
        if (EnableParallelPublishSchedulerV2Exp.LIZ().LIZ()) {
            LLILLL.remove(c1447700nmC);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthesisSuccess(final PublishModel publishModel, final String str) {
        BaseShortVideoContext baseShortVideoContext;
        BaseShortVideoContext baseShortVideoContext2;
        C1447700nmC next;
        Video video;
        VideoUrlModel videoUrlModelLIZ;
        Video video2;
        BaseShortVideoContext baseShortVideoContext3;
        VideoPublishEditModel videoPublishEditModel;
        String str2;
        VideoPublishEditModelKt videoPublishEditModelKt;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList;
        VideoPublishEditModelKt videoPublishEditModelKt2;
        ImageAlbumData imageAlbumData2;
        List<SingleImageData> imageList2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishPreviewManager -> onSynthetiseSuccess path = ");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1447700nmC c1447700nmC = null;
        Bitmap bitmap = null;
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModelKt2 = (VideoPublishEditModelKt) baseShortVideoContext) != null && (imageAlbumData2 = videoPublishEditModelKt2.getImageAlbumData()) != null && (imageList2 = imageAlbumData2.getImageList()) != null) {
            for (SingleImageData singleImageData : imageList2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PublishPreviewManager -> onSynthetiseSuccess -> path = ");
                sbLIZ2.append(singleImageData.getSynthesisData());
                C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        int i = 0;
        if (publishModel != null && C1447670nm9.LIZIZ(publishModel)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (publishModel != null) {
                baseShortVideoContext2 = publishModel.editModel;
            } else {
                baseShortVideoContext2 = null;
            }
            if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext2) != null && (imageAlbumData = videoPublishEditModelKt.getImageAlbumData()) != null && (imageList = imageAlbumData.getImageList()) != null) {
                for (SingleImageData singleImageData2 : imageList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        SingleImageData singleImageData3 = singleImageData2;
                        PhotoModeImageUrlModel photoModeImageUrlModelLJFF = C1447670nm9.LJFF(singleImageData3);
                        if (photoModeImageUrlModelLJFF != null) {
                            if (C297660Blc.LIZ()) {
                                arrayList.add(photoModeImageUrlModelLJFF);
                            } else {
                                ListProtector.add(arrayList, i, photoModeImageUrlModelLJFF);
                            }
                        }
                        PhotoModeImage photoModeImageLJ = C1447670nm9.LJ(singleImageData3);
                        if (photoModeImageLJ != null) {
                            if (C297660Blc.LIZ()) {
                                arrayList2.add(photoModeImageLJ);
                            } else {
                                ListProtector.add(arrayList2, i, photoModeImageLJ);
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            Iterator<C1447700nmC> it2 = LLILLL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str3 = next.LIZ.creationId;
                    if (publishModel != null) {
                        str2 = publishModel.creationId;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str3, str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C1447700nmC c1447700nmC2 = next;
            if (c1447700nmC2 != null) {
                Aweme aweme = c1447700nmC2.LIZJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(c1447700nmC2.LIZJ.getAid());
                sbLIZ3.append(System.currentTimeMillis());
                aweme.setAid(C2188811AlT.LIZIZ(sbLIZ3));
                Aweme aweme2 = c1447700nmC2.LIZJ;
                PhotoModeImageInfo photoModeImageInfo = new PhotoModeImageInfo();
                photoModeImageInfo.setImageList(arrayList);
                photoModeImageInfo.setPhotoModeImageList(arrayList2);
                aweme2.setPhotoModeImageInfo(photoModeImageInfo);
                PublishPreviewInfo previewData = AwemeBizExtKt.getPreviewData(c1447700nmC2.LIZJ);
                if (previewData != null) {
                    previewData.setInPublishing(true);
                    previewData.setProgress(60);
                }
                Video video3 = c1447700nmC2.LIZJ.getVideo();
                if ((video3 == null || video3.getPlayAddr() == null) && (video = c1447700nmC2.LIZJ.getVideo()) != null) {
                    if (publishModel != null) {
                        videoUrlModelLIZ = C1447670nm9.LIZ(publishModel);
                    } else {
                        videoUrlModelLIZ = null;
                    }
                    video.setPlayAddr(videoUrlModelLIZ);
                }
                if (EnableParallelPublishSchedulerV2Exp.LIZ().LIZ() && (((video2 = c1447700nmC2.LIZJ.getVideo()) == null || video2.getCover() == null) && c1447700nmC2.LIZJ.getVideo() != null)) {
                    if (publishModel != null) {
                        baseShortVideoContext3 = publishModel.editModel;
                    } else {
                        baseShortVideoContext3 = null;
                    }
                    if ((baseShortVideoContext3 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext3) != null) {
                        Video video4 = c1447700nmC2.LIZJ.getVideo();
                        if (!C1428470nHB.LJJZZI(videoPublishEditModel)) {
                            bitmap = VideoCoverBitmapHolder.LL;
                        }
                        C1447670nm9.LIZLLL(videoPublishEditModel, video4, bitmap);
                    }
                }
                c1447700nmC = c1447700nmC2;
            }
            if (publishModel != null && c1447700nmC != null) {
                LIZ(new AwS388S0200000_22(publishModel, c1447700nmC, 207));
                return;
            }
            return;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().infoService().videoInfo(str, true, new IAVInfoService.IGetInfoCallback<int[]>() { // from class: X.0nmB
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final void finish(int[] iArr) {
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                C1447700nmC c1447700nmC3;
                C1447700nmC next2;
                String str4;
                BaseShortVideoContext baseShortVideoContext4;
                VideoPublishEditModel videoPublishEditModel2;
                Bitmap bitmap2;
                String str5;
                int[] iArr2 = iArr;
                Video video5 = new Video();
                String str6 = str;
                VideoUrlModel videoUrlModel = new VideoUrlModel();
                int i8 = 0;
                if (iArr2 != null) {
                    i3 = iArr2[0];
                } else {
                    i3 = 0;
                }
                videoUrlModel.setWidth(i3);
                if (iArr2 != null) {
                    i4 = iArr2[1];
                } else {
                    i4 = 0;
                }
                videoUrlModel.setHeight(i4);
                if (iArr2 != null) {
                    i5 = iArr2[10];
                } else {
                    i5 = 0;
                }
                videoUrlModel.setDuration(i5);
                videoUrlModel.setUri(str6);
                videoUrlModel.setUrlList(Collections.singletonList(videoUrlModel.getUri()));
                videoUrlModel.setUrlKey(videoUrlModel.getUri());
                video5.setPlayAddr(videoUrlModel);
                if (iArr2 != null) {
                    i6 = iArr2[0];
                } else {
                    i6 = 0;
                }
                video5.setWidth(i6);
                if (iArr2 != null) {
                    i7 = iArr2[1];
                } else {
                    i7 = 0;
                }
                video5.setHeight(i7);
                if (iArr2 != null) {
                    i8 = iArr2[10];
                }
                video5.setDuration(i8);
                CopyOnWriteArrayList<C1447700nmC> copyOnWriteArrayList = C1447680nmA.LLILLL;
                PublishModel publishModel2 = publishModel;
                Iterator<C1447700nmC> it3 = copyOnWriteArrayList.iterator();
                while (true) {
                    c1447700nmC3 = null;
                    bitmap2 = null;
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        String str7 = next2.LIZ.creationId;
                        if (publishModel2 != null) {
                            str5 = publishModel2.creationId;
                        } else {
                            str5 = null;
                        }
                        if (Intrinsics.LJFF(str7, str5)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C1447700nmC c1447700nmC4 = next2;
                if (c1447700nmC4 != null) {
                    PublishModel publishModel3 = publishModel;
                    Aweme aweme3 = c1447700nmC4.LIZJ;
                    if (EnableParallelPublishSchedulerV2Exp.LIZ().LIZ() && video5.getCover() == null) {
                        if (publishModel3 != null) {
                            baseShortVideoContext4 = publishModel3.editModel;
                        } else {
                            baseShortVideoContext4 = null;
                        }
                        if ((baseShortVideoContext4 instanceof VideoPublishEditModel) && (videoPublishEditModel2 = (VideoPublishEditModel) baseShortVideoContext4) != null) {
                            if (!C1428470nHB.LJJZZI(videoPublishEditModel2)) {
                                bitmap2 = VideoCoverBitmapHolder.LL;
                            }
                            C1447670nm9.LIZLLL(videoPublishEditModel2, video5, bitmap2);
                        }
                    }
                    aweme3.setVideo(video5);
                    Aweme aweme4 = c1447700nmC4.LIZJ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(c1447700nmC4.LIZJ.getAid());
                    sbLIZ4.append(System.currentTimeMillis());
                    aweme4.setAid(C2188811AlT.LIZIZ(sbLIZ4));
                    PublishPreviewInfo previewData2 = AwemeBizExtKt.getPreviewData(c1447700nmC4.LIZJ);
                    if (previewData2 != null) {
                        previewData2.setInPublishing(true);
                        previewData2.setPublishStatus(PublishStatus.UPLOADING);
                        C1433730nPf c1433730nPf = C1433730nPf.LIZ;
                        if (publishModel3 == null || (str4 = publishModel3.publishId) == null) {
                            str4 = "";
                        }
                        previewData2.setProgress(C1433730nPf.LJIIJ(c1433730nPf, str4));
                    }
                    c1447700nmC3 = c1447700nmC4;
                }
                PublishModel publishModel4 = publishModel;
                if (publishModel4 != null && c1447700nmC3 != null) {
                    C1447680nmA c1447680nmA = C1447680nmA.LL;
                    AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(publishModel4, c1447700nmC3, 208);
                    c1447680nmA.getClass();
                    C1447680nmA.LIZ(awS388S0200000_22);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
        Object obj;
        C201955140j.LJ("PublishPreviewManager -> onPublishFailed");
        Iterator<C1447700nmC> it2 = LLILLL.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            C1447700nmC next = it2.next();
            String str2 = next.LIZ.creationId;
            if (publishModel != null) {
                obj = publishModel.creationId;
            }
            if (Intrinsics.LJFF(str2, obj)) {
                obj = next;
                break;
            }
        }
        C1447700nmC c1447700nmC = (C1447700nmC) obj;
        if (c1447700nmC == null) {
            return;
        }
        PublishPreviewInfo previewData = AwemeBizExtKt.getPreviewData(c1447700nmC.LIZJ);
        if (previewData != null) {
            previewData.setPublishStatus(PublishStatus.FAILED);
        }
        c1447700nmC.LJ = c1434650nR9;
        c1447700nmC.LJFF = str;
        if (publishModel != null) {
            C1447680nmA c1447680nmA = LL;
            AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(publishModel, c1447700nmC, 209);
            c1447680nmA.getClass();
            LIZ(awS388S0200000_22);
        }
        if (EnableParallelPublishSchedulerV2Exp.LIZ().LIZ()) {
            LLILLL.remove(c1447700nmC);
        }
    }
}
