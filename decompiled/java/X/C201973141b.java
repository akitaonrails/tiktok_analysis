package X;

import android.util.LruCache;
import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMusic;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader;
import com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.141b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201973141b implements ForwardMediaDownloader, ForwardVideoPlayerCacheProvider {
    public static final C201973141b LIZ = new C201973141b();
    public static final MentionStruct LIZIZ = new MentionStruct("", "", "", "", null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(461));
    public static final C054G LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ).plus(new C19775412Yu(CoroutineExceptionHandler.LJJLIL, 2)));

    public static ForwardMedia LIZJ(MediaModel mediaModel) {
        return new ForwardMedia("", 0, new C0MM9("", "", "", "", null), null, null, new ForwardVideo(null, null, 0, 0, 0, null, null, null, false, null, null, null, 0, null, 16383, null), 0.0f, null, null, null, mediaModel.modify, 0, null, false, null, null, null, null, false, null, mediaModel, null, null, null, null, 32504794, null);
    }

    public static MentionStruct LJFF(Aweme aweme) {
        int value;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser.getUid() != null && C729510SjV.LJJIZ(aweme, curUser.getUid())) {
            User author = aweme.getAuthor();
            String uid = author.getUid();
            String str = "";
            if (uid == null) {
                uid = "";
            }
            String secUid = author.getSecUid();
            if (secUid == null) {
                secUid = "";
            }
            String searchUserName = author.getSearchUserName();
            if (searchUserName == null) {
                searchUserName = "";
            }
            String nickname = author.getNickname();
            if (nickname != null) {
                str = nickname;
            }
            UrlModel avatarThumb = author.getAvatarThumb();
            if (avatarThumb == null) {
                avatarThumb = null;
            }
            MentionStruct mentionStruct = new MentionStruct(uid, secUid, searchUserName, str, avatarThumb);
            if (aweme.getIsTikTokStory()) {
                value = EnumC19597511lt.STORY_BACKWARDS_MENTION.getValue();
            } else {
                value = EnumC19597511lt.POST_BACKWARDS_MENTION.getValue();
            }
            mentionStruct.setScenario(value);
            return mentionStruct;
        }
        return LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJII(java.util.List r5, boolean r6) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r5, r0)
            r4.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r3 = r5.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r6 == 0) goto L33
            if (r3 == 0) goto L37
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L33
            r1 = 0
            java.lang.String r0 = "http://"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r3, r0, r1)
            if (r0 == 0) goto L3b
            com.ss.android.ugc.aweme.share.ShareExtService r0 = X.C621180OYa.LIZIZ
            r0.LJJJLIIL(r3)
        L33:
            r0 = r3
        L34:
            if (r0 == 0) goto L37
            r3 = r0
        L37:
            r4.add(r3)
            goto Lf
        L3b:
            X.0XLQ r1 = X.C0XLQ.LJIIL(r3)
            if (r1 == 0) goto L33
            java.lang.String r2 = "ss_is_p_v_ss"
            java.lang.String r0 = r1.LJIILLIIL(r2)
            if (r0 != 0) goto L33
            X.0XLP r1 = r1.LJIIJ()
            java.lang.String r0 = "1"
            r1.LJIIL(r2, r0)
            java.lang.String r0 = r1.toString()
            goto L34
        L57:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201973141b.LJII(java.util.List, boolean):java.util.List");
    }

    public static VideoShareInfoStruct LJIIIIZZ(Aweme aweme, Integer num) {
        String secUid;
        String nickname;
        int iIntValue;
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        int awemeType = aweme.getAwemeType();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        User author = aweme.getAuthor();
        if (author == null || (secUid = author.getSecUid()) == null) {
            secUid = "";
        }
        User author2 = aweme.getAuthor();
        if (author2 == null || (nickname = author2.getNickname()) == null) {
            nickname = "";
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        return new VideoShareInfoStruct(aid, awemeType, authorUid, secUid, nickname, iIntValue);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardVideoPlayerCacheProvider
    public final Object copyCache2File(final String str, SimVideoUrlModel simVideoUrlModel, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        if (simVideoUrlModel == null) {
            return null;
        }
        LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
        if (!C1478160oZK.LIZ().LJIIIIZZ(simVideoUrlModel)) {
            return null;
        }
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C1483340ohg.LJIIL(simVideoUrlModel, str, false, false, new InterfaceC1475840oVa() { // from class: X.12Ek
            @Override // X.InterfaceC1475840oVa
            public final /* synthetic */ void LIZ(long j, long j2) {
            }

            @Override // X.InterfaceC1475840oVa
            public final void LIZIZ(int i) {
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                try {
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn2.resumeWith(null);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // X.InterfaceC1475840oVa
            public final void onCopyComplete(boolean z, int i, String str2) {
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                String str3 = str;
                if (!z) {
                    str3 = null;
                }
                try {
                    C189200o6.m2constructorimpl(str3);
                    interfaceC1364105Vn2.resumeWith(str3);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static final void LIZ(ForwardVideo forwardVideo, ForwardMediaDownloader.DownloadConfig downloadConfig, boolean z, ForwardMediaDownloader.DownloadListener downloadListener, int i) {
        C201973141b c201973141b = LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadVideoWithTruncatedPreloadCache: fallback to downloadWithDownloader, type=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        c201973141b.getClass();
        forwardVideo.setDownloadStatus(2);
        LIZIZ(forwardVideo.getPlayAddressList(), downloadConfig.cacheDir, downloadConfig.fileName, z, downloadListener);
    }

    public static final void LIZIZ(List<String> list, String str, String str2, boolean z, ForwardMediaDownloader.DownloadListener downloadListener) {
        List<String> listSubList;
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        if (C2354709Kn.LIZIZ(C2188811AlT.LIZIZ(sbLIZ)) && downloadListener != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(str2);
            downloadListener.onSuccess(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (list.size() > 1) {
            listSubList = list.subList(1, list.size());
        } else {
            listSubList = C13BV.INSTANCE;
        }
        C20306414cw c20306414cw = new C20306414cw(downloadListener, 2);
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with((String) ListProtector.get(list, 0));
        abstractC2199801B7qWith.LJIIIIZZ = listSubList;
        abstractC2199801B7qWith.LIZJ = str2;
        abstractC2199801B7qWith.LJ = str;
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIJJ = 3;
        abstractC2199801B7qWith.LJIIJ = "share_to_story_scene";
        abstractC2199801B7qWith.LJJ = downloadServiceManager.isAutoRemoveListener();
        abstractC2199801B7qWith.LJIIL = c20306414cw;
        if (z) {
            C201973141b c201973141b = LIZ;
            String str3 = (String) ListProtector.get(list, 0);
            c201973141b.getClass();
            if (str3 != null && str3.length() != 0 && u.LJJIIJZLJL(str3, "https", false) && a0.LJJIIZI(str3, "policy", false)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("sessionid=");
                sbLIZ3.append(((AbstractC848400XPy) C0XQ7.LJFF()).LJIIZILJ());
                List listLJIIJJI = C1697810uHb.LJIIJJI(new HttpHeader("Cookie", C2188811AlT.LIZIZ(sbLIZ3)), new HttpHeader("X-Tt-Token", C0CHQ.LIZ().getAccountService().getUserTTToken()));
                if (listLJIIJJI != null) {
                    abstractC2199801B7qWith.LJFF(listLJIIJJI);
                }
            }
        }
        abstractC2199801B7qWith.LIZJ();
    }

    public static ForwardMedia LIZLLL(String str, String str2, String str3, Aweme aweme, Boolean bool) {
        Video video;
        List<String> urlList;
        VideoUrlModel playAddrH264;
        List<String> urlList2;
        int width;
        int height;
        String originUri;
        String nickname;
        String uid;
        String secUid;
        UrlModel avatarThumb;
        float fFloatValue;
        Float musicVolume;
        VideoUrlModel playAddrBytevc1;
        ForwardMusic forwardMusic = null;
        if (aweme.getVideo() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme.video should not be null, aweme id: ");
            sbLIZ.append(aweme.getAid());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Npth.reportBizException("onthisday|addtostory", new IllegalArgumentException(strLIZIZ), strLIZIZ, null);
        }
        Video video2 = aweme.getVideo();
        if (video2 == null) {
            video2 = new Video();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[CoverRgb] genMediaData: awemeId=");
        sbLIZ2.append(aweme.getAid());
        sbLIZ2.append(", coverRgb=");
        sbLIZ2.append(video2.getCoverRgb());
        C2188811AlT.LIZIZ(sbLIZ2);
        String aid = aweme.getAid();
        String str4 = "";
        if (aid == null) {
            aid = "";
        }
        int awemeType = aweme.getAwemeType();
        Video video3 = aweme.getVideo();
        if ((video3 == null || (playAddrBytevc1 = video3.getPlayAddrBytevc1()) == null || (urlList = playAddrBytevc1.getUrlList()) == null) && ((video = aweme.getVideo()) == null || (playAddrH264 = video.getPlayAddrH264()) == null || (urlList = playAddrH264.getUrlList()) == null)) {
            urlList = C13BV.INSTANCE;
        }
        UrlModel cover = video2.getCover();
        if (cover == null || (urlList2 = cover.getUrlList()) == null) {
            urlList2 = C13BV.INSTANCE;
        }
        if (video2.getWidth() <= 0) {
            width = 720;
        } else {
            width = video2.getWidth();
        }
        if (video2.getHeight() <= 0) {
            height = 1280;
        } else {
            height = video2.getHeight();
        }
        int duration = video2.getDuration();
        String meta = video2.getMeta();
        VideoUrlModel playAddr = video2.getPlayAddr();
        if (playAddr == null || (originUri = playAddr.getOriginUri()) == null) {
            originUri = "";
        }
        String aid2 = aweme.getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        ForwardVideo forwardVideo = new ForwardVideo(urlList, urlList2, width, height, duration, meta, originUri, aid2, video2.isNeedSetCookie(), C1483340ohg.LJFF(aweme), video2.getCachedOuterCoverUrl(), video2.getOriginCover(), 0, video2.getCoverRgb(), SpeechEngineDefines.TTS_WORK_MODE_BOTH, null);
        String desc = aweme.getDesc();
        if (desc == null) {
            desc = "";
        }
        float volLoudUnity = C607330Nrv.LIZ.LIZIZ().getVolLoudUnity();
        User author = aweme.getAuthor();
        if (author != null) {
            nickname = author.getNickname();
        } else {
            nickname = null;
        }
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            uid = author2.getUid();
        } else {
            uid = null;
        }
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            secUid = author3.getSecUid();
        } else {
            secUid = null;
        }
        User author4 = aweme.getAuthor();
        if (author4 != null) {
            C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
            C0R93.LIZ(str);
            c1243240iSQ.getClass();
            String nickname2 = author4.getNickname();
            if (nickname2 != null) {
                str4 = nickname2;
            }
        }
        User author5 = aweme.getAuthor();
        if (author5 != null) {
            avatarThumb = author5.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C0MM9 c0mm9 = new C0MM9(nickname, uid, secUid, str4, avatarThumb);
        Music music = aweme.getMusic();
        if (music != null) {
            String strValueOf = String.valueOf(music.getId());
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (musicVolume = photoModeImageInfo.getMusicVolume()) != null) {
                fFloatValue = musicVolume.floatValue();
            } else {
                fFloatValue = 0.5f;
            }
            forwardMusic = new ForwardMusic(strValueOf, fFloatValue, aweme.getMusic());
        }
        return new ForwardMedia(aid, awemeType, c0mm9, str, null, forwardVideo, volLoudUnity, forwardMusic, aweme.getPhotoModeImageInfo(), str2, aweme.getCreateTime(), aweme.aigcInfo.getAIGCLabelType(), str3, aweme.getIsTikTokStory(), desc, null, null, null, aweme.isStreaksPost(), null, null, null, bool, null, null, 29065232, null);
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader
    public final void download(ForwardVideo forwardVideo, ForwardMediaDownloader.DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, boolean z, ForwardMediaDownloader.DownloadListener downloadListener) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download started, awemeId: ");
        sbLIZ.append(forwardVideo.getAwemeId());
        sbLIZ.append(", filePath: ");
        sbLIZ.append(downloadConfig.filePath);
        C2188811AlT.LIZIZ(sbLIZ);
        List<String> playAddressList = forwardVideo.getPlayAddressList();
        if (playAddressList.isEmpty()) {
            return;
        }
        forwardVideo.setPlayAddressList(LJII(playAddressList, forwardVideo.getNeedSetCookie()));
        String str = downloadConfig.filePath;
        boolean z2 = downloadConfig.waitDownloadFinished;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("download config: waitIfCaching=");
        sbLIZ2.append(z2);
        sbLIZ2.append(", needManualAddCookie=");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJI(forwardVideo, downloadConfig, z, downloadListener, str, z2);
    }

    public static void LJI(final ForwardVideo forwardVideo, final ForwardMediaDownloader.DownloadConfig downloadConfig, final boolean z, final ForwardMediaDownloader.DownloadListener downloadListener, final String str, final boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("legacyDownload started for awemeId: ");
        sbLIZ.append(forwardVideo.getAwemeId());
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LocalVideoPlayerManager.LJ().LJIIJ(forwardVideo.getAwemeId(), str, new C14E5() { // from class: X.141X
            @Override // X.C14E5
            public final void onFailed() {
                C201973141b c201973141b = C201973141b.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("legacyDownload: local video not available, waitIfCaching=");
                sbLIZ2.append(z2);
                C2188811AlT.LIZIZ(sbLIZ2);
                c201973141b.getClass();
                if (!z2) {
                    c201973141b.getClass();
                    ForwardMediaDownloader.DownloadListener.DefaultImpls.onError$default(downloadListener, ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), null, null, null, 8, null);
                } else {
                    c201973141b.getClass();
                    List<String> playAddressList = forwardVideo.getPlayAddressList();
                    ForwardMediaDownloader.DownloadConfig downloadConfig2 = downloadConfig;
                    C201973141b.LIZIZ(playAddressList, downloadConfig2.cacheDir, downloadConfig2.fileName, z, downloadListener);
                }
            }

            @Override // X.C14E5
            public final void onSuccess(String str2) {
                forwardVideo.setDownloadStatus(0);
                C201973141b.LIZ.getClass();
                downloadListener.onSuccess(str2);
            }
        })) {
            final C259800zU c259800zU = new C259800zU();
            C1483340ohg.LJIIL(forwardVideo.getSimVideoUrlModel(), str, z2, false, new InterfaceC1475840oVa() { // from class: X.141V
                @Override // X.InterfaceC1475840oVa
                public final void LIZIZ(int i) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("legacyDownload: copy error, type=");
                    sbLIZ2.append(i);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c201973141b.getClass();
                    LIZJ(i, null);
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult] */
                @Override // X.InterfaceC1475840oVa
                public final void LIZ(long j, long j2) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("legacyDownload: file info - mediaSize=");
                    sbLIZ2.append(j);
                    sbLIZ2.append(", cacheSizeFromZero=");
                    sbLIZ2.append(j2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c201973141b.getClass();
                    c259800zU.element = new VideoDownloadPartialResult(j, j2, str);
                }

                public final void LIZJ(int i, VideoDownloadPartialResult videoDownloadPartialResult) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("legacyDownload: cache invalid, type=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", waitIfCaching=");
                    sbLIZ2.append(z2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c201973141b.getClass();
                    if (z2) {
                        c201973141b.getClass();
                        forwardVideo.setDownloadStatus(2);
                        List<String> playAddressList = forwardVideo.getPlayAddressList();
                        ForwardMediaDownloader.DownloadConfig downloadConfig2 = downloadConfig;
                        C201973141b.LIZIZ(playAddressList, downloadConfig2.cacheDir, downloadConfig2.fileName, z, downloadListener);
                        return;
                    }
                    c201973141b.getClass();
                    downloadListener.onError(i, null, null, videoDownloadPartialResult);
                }

                @Override // X.InterfaceC1475840oVa
                public final void onCopyComplete(boolean z3, int i, String str2) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("legacyDownload: copy complete, isSuccess=");
                    sbLIZ2.append(z3);
                    sbLIZ2.append(", errorCode=");
                    sbLIZ2.append(i);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c201973141b.getClass();
                    VideoDownloadPartialResult videoDownloadPartialResult = c259800zU.element;
                    if (z3) {
                        downloadListener.onSuccess(str);
                    } else {
                        LIZJ(ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), videoDownloadPartialResult);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader
    public final void downloadVideoWithTruncatedPreloadCache(final ForwardVideo forwardVideo, final ForwardMediaDownloader.DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, final boolean z, long j, final ForwardMediaDownloader.DownloadListener downloadListener) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadVideoWithTruncatedPreloadCache started, awemeId: ");
        sbLIZ.append(forwardVideo.getAwemeId());
        sbLIZ.append(", filePath: ");
        sbLIZ.append(downloadConfig.filePath);
        sbLIZ.append(", minDurationMs=");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        List<String> playAddressList = forwardVideo.getPlayAddressList();
        if (playAddressList.isEmpty()) {
            return;
        }
        forwardVideo.setPlayAddressList(LJII(playAddressList, forwardVideo.getNeedSetCookie()));
        final String str = downloadConfig.filePath;
        final SimVideoUrlModel simVideoUrlModel = forwardVideo.getSimVideoUrlModel();
        if (simVideoUrlModel == null) {
            LJI(forwardVideo, downloadConfig, z, downloadListener, str, true);
            return;
        }
        if (LocalVideoPlayerManager.LJ().LJIIJ(forwardVideo.getAwemeId(), str, new C14E5() { // from class: X.141Y
            @Override // X.C14E5
            public final void onFailed() {
                C201973141b.LIZ.getClass();
            }

            @Override // X.C14E5
            public final void onSuccess(String str2) {
                C201973141b.LIZ.getClass();
                forwardVideo.setDownloadStatus(0);
                downloadListener.onSuccess(str2);
            }
        })) {
            return;
        }
        final C259800zU c259800zU = new C259800zU();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("downloadVideoWithTruncatedPreloadCache, start preload, aweme id = ");
        sbLIZ2.append(forwardVideo.getAwemeId());
        sbLIZ2.append(", url = ");
        sbLIZ2.append(simVideoUrlModel);
        C2188811AlT.LIZIZ(sbLIZ2);
        LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
        C1478160oZK.LIZ().LJJLIIIJLLLLLLLZ(simVideoUrlModel);
        InterfaceC1475840oVa interfaceC1475840oVa = new InterfaceC1475840oVa() { // from class: X.141W
            @Override // X.InterfaceC1475840oVa
            public final void LIZIZ(int i) {
                SimVideoUrlModel simVideoUrlModel2 = simVideoUrlModel;
                LruCache<String, SimVideoUrlModel> lruCache2 = C1483340ohg.LIZ;
                if (simVideoUrlModel2 != null) {
                    C1478160oZK.LIZ().LJJJJZ(simVideoUrlModel2);
                }
                C201973141b c201973141b = C201973141b.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("downloadVideoWithTruncatedPreloadCache: copy error, type=");
                sbLIZ3.append(i);
                C2188811AlT.LIZIZ(sbLIZ3);
                c201973141b.getClass();
                C201973141b.LIZ(forwardVideo, downloadConfig, z, downloadListener, i);
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult] */
            @Override // X.InterfaceC1475840oVa
            public final void LIZ(long j2, long j3) {
                C201973141b c201973141b = C201973141b.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("downloadVideoWithTruncatedPreloadCache: file info - mediaSize=");
                sbLIZ3.append(j2);
                sbLIZ3.append(", cacheSizeFromZero=");
                sbLIZ3.append(j3);
                C2188811AlT.LIZIZ(sbLIZ3);
                c201973141b.getClass();
                c259800zU.element = new VideoDownloadPartialResult(j2, j3, str);
            }

            @Override // X.InterfaceC1475840oVa
            public final void onCopyComplete(boolean z2, int i, String str2) {
                C201973141b c201973141b = C201973141b.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("downloadVideoWithTruncatedPreloadCache: copy complete, isSuccess=");
                sbLIZ3.append(z2);
                sbLIZ3.append(", errorCode=");
                sbLIZ3.append(i);
                sbLIZ3.append(", desc=");
                sbLIZ3.append(str2);
                C2188811AlT.LIZIZ(sbLIZ3);
                c201973141b.getClass();
                SimVideoUrlModel simVideoUrlModel2 = simVideoUrlModel;
                LruCache<String, SimVideoUrlModel> lruCache2 = C1483340ohg.LIZ;
                if (simVideoUrlModel2 != null) {
                    C1478160oZK.LIZ().LJJJJZ(simVideoUrlModel2);
                }
                if (z2) {
                    forwardVideo.setDownloadStatus(1);
                    downloadListener.onSuccess(str);
                } else {
                    C201973141b.LIZ(forwardVideo, downloadConfig, z, downloadListener, ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue());
                }
            }
        };
        InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
        if (interfaceC1482870ogvLIZ != null) {
            interfaceC1482870ogvLIZ.LJJJJJL(simVideoUrlModel, str, true, j, interfaceC1475840oVa);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.forward.ForwardMediaDownloader
    public final void partialDownload(final ForwardVideo forwardVideo, final ForwardMediaDownloader.DownloadConfig downloadConfig, VideoDownloadPartialResult videoDownloadPartialResult, final boolean z, final ForwardMediaDownloader.DownloadListener downloadListener, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download started, awemeId: ");
        sbLIZ.append(forwardVideo.getAwemeId());
        sbLIZ.append(", filePath: ");
        sbLIZ.append(downloadConfig.filePath);
        C2188811AlT.LIZIZ(sbLIZ);
        List<String> playAddressList = forwardVideo.getPlayAddressList();
        if (playAddressList.isEmpty()) {
            return;
        }
        forwardVideo.setPlayAddressList(LJII(playAddressList, forwardVideo.getNeedSetCookie()));
        final String str = downloadConfig.filePath;
        final boolean z2 = downloadConfig.waitDownloadFinished;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("download config: waitIfCaching=");
        sbLIZ2.append(z2);
        sbLIZ2.append(", needManualAddCookie=");
        sbLIZ2.append(z);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (downloadConfig.useStreamingEntry) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("streamingEntryDownload started for awemeId: ");
            sbLIZ3.append(forwardVideo.getAwemeId());
            sbLIZ3.append(", filePath=");
            sbLIZ3.append(str);
            C2188811AlT.LIZIZ(sbLIZ3);
            C20186213ye.LIZ.getClass();
            String strLIZJ = C20186213ye.LIZJ((String) C13LP.LJJJLL(C20186213ye.LJ(forwardVideo, C1483410ohn.LJLJJI().getBitrate())));
            if (strLIZJ != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("streamingEntryDownload: real cache already complete (onFinished), skip all. path=");
                sbLIZ4.append(strLIZJ);
                C2188811AlT.LIZIZ(sbLIZ4);
                forwardVideo.setDownloadStatus(1);
                downloadListener.onSuccess(strLIZJ);
                return;
            }
            if (LocalVideoPlayerManager.LJ().LJIIJ(forwardVideo.getAwemeId(), str, new C14E5() { // from class: X.141a
                @Override // X.C14E5
                public final void onFailed() {
                    C201973141b.LIZ.getClass();
                }

                @Override // X.C14E5
                public final void onSuccess(String str2) {
                    C201973141b.LIZ.getClass();
                    forwardVideo.setDownloadStatus(1);
                    downloadListener.onSuccess(str2);
                }
            })) {
                return;
            }
            SimVideoUrlModel simVideoUrlModel = forwardVideo.getSimVideoUrlModel();
            if (simVideoUrlModel == null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("streamingEntryDownload: simVideoUrlModel is null, fallback (waitIfCaching=");
                sbLIZ5.append(z2);
                sbLIZ5.append(')');
                C2188811AlT.LIZIZ(sbLIZ5);
                if (z2) {
                    forwardVideo.setDownloadStatus(0);
                    LIZIZ(forwardVideo.getPlayAddressList(), downloadConfig.cacheDir, downloadConfig.fileName, z, downloadListener);
                    return;
                } else {
                    forwardVideo.setDownloadStatus(-1);
                    downloadListener.onError(ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), "simVideoUrlModel is null for streaming entry", null, null);
                    return;
                }
            }
            final C259800zU c259800zU = new C259800zU();
            C1483340ohg.LJIIL(simVideoUrlModel, str, false, true, new InterfaceC1475840oVa() { // from class: X.141T
                @Override // X.InterfaceC1475840oVa
                public final void LIZIZ(int i) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("streamingEntryDownload: copy error, type=");
                    sbLIZ6.append(i);
                    C2188811AlT.LIZIZ(sbLIZ6);
                    c201973141b.getClass();
                    LIZJ(i, null);
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult] */
                @Override // X.InterfaceC1475840oVa
                public final void LIZ(long j2, long j3) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("streamingEntryDownload: file info - mediaSize=");
                    sbLIZ6.append(j2);
                    sbLIZ6.append(", cacheSizeFromZero=");
                    sbLIZ6.append(j3);
                    C2188811AlT.LIZIZ(sbLIZ6);
                    c201973141b.getClass();
                    c259800zU.element = new VideoDownloadPartialResult(j2, j3, str);
                }

                public final void LIZJ(int i, VideoDownloadPartialResult videoDownloadPartialResult2) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("streamingEntryDownload: cache invalid, type=");
                    sbLIZ6.append(i);
                    sbLIZ6.append(", waitIfCaching=");
                    sbLIZ6.append(z2);
                    C2188811AlT.LIZIZ(sbLIZ6);
                    c201973141b.getClass();
                    C110200bM.LIZ("helper_download", "cache_invalid", C2097608Jq.LJIIIIZZ(new Pair("type", Integer.valueOf(i)), new Pair("source", "streamingEntryDownload"), new Pair("wait_if_caching", Boolean.valueOf(z2))));
                    if (z2) {
                        c201973141b.getClass();
                        forwardVideo.setDownloadStatus(0);
                        List<String> playAddressList2 = forwardVideo.getPlayAddressList();
                        ForwardMediaDownloader.DownloadConfig downloadConfig2 = downloadConfig;
                        C201973141b.LIZIZ(playAddressList2, downloadConfig2.cacheDir, downloadConfig2.fileName, z, downloadListener);
                        return;
                    }
                    c201973141b.getClass();
                    forwardVideo.setDownloadStatus(-1);
                    downloadListener.onError(i, null, null, videoDownloadPartialResult2);
                }

                @Override // X.InterfaceC1475840oVa
                public final void onCopyComplete(boolean z3, int i, String str2) {
                    boolean zLIZIZ;
                    String str3;
                    String strLJZL;
                    String str4;
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("streamingEntryDownload: copy complete, isSuccess=");
                    sbLIZ6.append(z3);
                    sbLIZ6.append(", errorCode=");
                    sbLIZ6.append(i);
                    sbLIZ6.append(", desc=");
                    sbLIZ6.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ6);
                    c201973141b.getClass();
                    VideoDownloadPartialResult videoDownloadPartialResult2 = c259800zU.element;
                    if (z3) {
                        forwardVideo.setDownloadStatus(1);
                        if (videoDownloadPartialResult2 != null) {
                            long j2 = videoDownloadPartialResult2.mediaSize;
                            if (j2 > 0 && videoDownloadPartialResult2.cacheSizeFromZero >= j2) {
                                downloadListener.onSuccess(str);
                                return;
                            }
                        }
                        C20186213ye c20186213ye = C20186213ye.LIZ;
                        ForwardVideo forwardVideo2 = forwardVideo;
                        float bitrate = C1483410ohn.LJLJJI().getBitrate();
                        c20186213ye.getClass();
                        if (C20186213ye.LIZLLL(forwardVideo2, bitrate) != null && r0.getSize() > 0) {
                            try {
                                zLIZIZ = C036E.LIZ.LIZIZ();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                zLIZIZ = false;
                            }
                            if (!zLIZIZ) {
                                C201973141b.LIZ.getClass();
                                C0CNO.LIZLLL(0L, AFwS219S0000000_30.get$arr$(337));
                                forwardVideo.setDownloadStatus(-1);
                                downloadListener.onError(ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), "partial cache + no network for streaming entry", null, videoDownloadPartialResult2);
                                return;
                            }
                            C201973141b c201973141b2 = C201973141b.LIZ;
                            ForwardVideo forwardVideo3 = forwardVideo;
                            String str5 = str;
                            ForwardMediaDownloader.DownloadListener downloadListener2 = downloadListener;
                            c201973141b2.getClass();
                            C20186213ye c20186213ye2 = C20186213ye.LIZ;
                            float bitrate2 = C1483410ohn.LJLJJI().getBitrate();
                            c20186213ye2.getClass();
                            List listLJ = C20186213ye.LJ(forwardVideo3, bitrate2);
                            String str6 = (String) C13LP.LJJJLL(listLJ);
                            if (str6 != null && (true ^ a0.LJJJIL(str6))) {
                                str3 = str6;
                            } else {
                                str3 = str5;
                            }
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("enterWithStreamingUrl: url=");
                            if (str6 != null) {
                                strLJZL = C13LN.LJZL(80, str6);
                            } else {
                                strLJZL = null;
                            }
                            sbLIZ7.append(strLJZL);
                            sbLIZ7.append(", urlCount=");
                            sbLIZ7.append(listLJ.size());
                            sbLIZ7.append(", using=");
                            if (Intrinsics.LJFF(str3, str6)) {
                                str4 = "url";
                            } else {
                                str4 = "filePath";
                            }
                            sbLIZ7.append(str4);
                            C2188811AlT.LIZIZ(sbLIZ7);
                            forwardVideo3.setDownloadStatus(0);
                            downloadListener2.onSuccess(str3);
                            C23250099c.LIZLLL(C201973141b.LIZLLL, null, null, new C20186413yg(forwardVideo3, str5, listLJ, null), 3);
                            return;
                        }
                        forwardVideo.setDownloadStatus(0);
                        List<String> playAddressList2 = forwardVideo.getPlayAddressList();
                        ForwardMediaDownloader.DownloadConfig downloadConfig2 = downloadConfig;
                        C201973141b.LIZIZ(playAddressList2, downloadConfig2.cacheDir, downloadConfig2.fileName, z, downloadListener);
                        return;
                    }
                    LIZJ(ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), videoDownloadPartialResult2);
                }
            });
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("newDownload started for awemeId: ");
        sbLIZ6.append(forwardVideo.getAwemeId());
        C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("newDownload current bitrate: ");
        sbLIZ7.append(C1483410ohn.LJLJJI().getBitrate());
        sbLIZ7.append(" filePath");
        sbLIZ7.append(str);
        C2188811AlT.LIZIZ(sbLIZ7);
        if (!LocalVideoPlayerManager.LJ().LJIIJ(forwardVideo.getAwemeId(), str, new C14E5() { // from class: X.141Z
            @Override // X.C14E5
            public final void onFailed() {
                C201973141b.LIZ.getClass();
            }

            @Override // X.C14E5
            public final void onSuccess(String str2) {
                C201973141b.LIZ.getClass();
                forwardVideo.setDownloadStatus(0);
                downloadListener.onSuccess(str2);
            }
        })) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("newDownload: trying preloader cache copy minDurationMs=");
            sbLIZ8.append(j);
            C2188811AlT.LIZIZ(sbLIZ8);
            final C259800zU c259800zU2 = new C259800zU();
            InterfaceC1475840oVa interfaceC1475840oVa = new InterfaceC1475840oVa() { // from class: X.141U
                @Override // X.InterfaceC1475840oVa
                public final void LIZIZ(int i) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("newDownload: copy error, type=");
                    sbLIZ9.append(i);
                    C2188811AlT.LIZIZ(sbLIZ9);
                    c201973141b.getClass();
                    LIZJ(i, null);
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.android.ugc.aweme.canvas.VideoDownloadPartialResult] */
                @Override // X.InterfaceC1475840oVa
                public final void LIZ(long j2, long j3) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("newDownload: file info - mediaSize=");
                    sbLIZ9.append(j2);
                    sbLIZ9.append(", cacheSizeFromZero=");
                    sbLIZ9.append(j3);
                    C2188811AlT.LIZIZ(sbLIZ9);
                    c201973141b.getClass();
                    c259800zU2.element = new VideoDownloadPartialResult(j2, j3, str);
                }

                public final void LIZJ(int i, VideoDownloadPartialResult videoDownloadPartialResult2) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("newDownload: cache invalid, type=");
                    sbLIZ9.append(i);
                    sbLIZ9.append(", waitIfCaching=");
                    sbLIZ9.append(z2);
                    C2188811AlT.LIZIZ(sbLIZ9);
                    c201973141b.getClass();
                    if (z2) {
                        c201973141b.getClass();
                        forwardVideo.setDownloadStatus(2);
                        List<String> playAddressList2 = forwardVideo.getPlayAddressList();
                        ForwardMediaDownloader.DownloadConfig downloadConfig2 = downloadConfig;
                        C201973141b.LIZIZ(playAddressList2, downloadConfig2.cacheDir, downloadConfig2.fileName, z, downloadListener);
                        return;
                    }
                    c201973141b.getClass();
                    downloadListener.onError(i, null, null, videoDownloadPartialResult2);
                }

                @Override // X.InterfaceC1475840oVa
                public final void onCopyComplete(boolean z3, int i, String str2) {
                    C201973141b c201973141b = C201973141b.LIZ;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("newDownload: copy complete, isSuccess=");
                    sbLIZ9.append(z3);
                    sbLIZ9.append(", errorCode=");
                    sbLIZ9.append(i);
                    sbLIZ9.append(", desc=");
                    sbLIZ9.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ9);
                    c201973141b.getClass();
                    VideoDownloadPartialResult videoDownloadPartialResult2 = c259800zU2.element;
                    if (z3) {
                        forwardVideo.setDownloadStatus(1);
                        downloadListener.onSuccess(str);
                    } else {
                        LIZJ(ForwardMediaDownloader.DownloadErrorType.LOCAL_FILE_UNAVAILABLE.getValue(), videoDownloadPartialResult2);
                    }
                }
            };
            SimVideoUrlModel simVideoUrlModel2 = forwardVideo.getSimVideoUrlModel();
            LruCache<String, SimVideoUrlModel> lruCache = C1483340ohg.LIZ;
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
            if (interfaceC1482870ogvLIZ != null) {
                interfaceC1482870ogvLIZ.LJJJJJL(simVideoUrlModel2, str, false, j, interfaceC1475840oVa);
            }
        }
    }
}
