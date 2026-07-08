package Y;

import X.AbstractC19483511Kn;
import X.AbstractC19484711Kz;
import X.C0XQ7;
import X.C118300cf;
import X.C11M6;
import X.C11NN;
import X.C11NO;
import X.C11RO;
import X.C11S5;
import X.C1358940lT2;
import X.C1358990lT7;
import X.C1374720lsU;
import X.C1376300lv2;
import X.C1402250mat;
import X.C1701890uOB;
import X.C23112093u;
import X.C786410Ut5;
import X.InterfaceC1254030ijp;
import X.InterfaceC1487280oo2;
import X.InterfaceC300801Eo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public class AkS482S0100000_21 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return apply$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return apply$10(this, obj);
            default:
                return null;
        }
    }

    public AkS482S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        final String strLIZ = C1374720lsU.LIZ(((AwemeSharePackage) akS482S0100000_21.l0).extras.getBundle("short_link_params"), (String) obj);
        if (strLIZ == null) {
            strLIZ = "";
        }
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmk
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(strLIZ);
            }
        });
    }

    public static final Object apply$1(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        final String strLIZ = C1374720lsU.LIZ(((BaseSharePackage) akS482S0100000_21.l0).extras.getBundle("short_link_params"), (String) obj);
        if (strLIZ == null) {
            strLIZ = "";
        }
        C786410Ut5.LJJJI("share_url", strLIZ, ((BaseSharePackage) akS482S0100000_21.l0).extras);
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0loh
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(strLIZ);
            }
        });
    }

    public static final Object apply$10(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        final String strLIZ = C1374720lsU.LIZ(((BaseSharePackage) akS482S0100000_21.l0).extras.getBundle("short_link_params"), (String) obj);
        if (strLIZ == null) {
            strLIZ = "";
        }
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lrR
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(strLIZ);
            }
        });
    }

    public static final Object apply$2(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        C118300cf c118300cf;
        int i;
        Throwable th = (Throwable) obj;
        if (C1358940lT2.LJFF(th) || C1358940lT2.LJ(th) || (((th instanceof C23112093u) && ((C23112093u) th).getErrorCode() == 3017017) || C1358940lT2.LIZLLL(th) || (i = (c118300cf = (C118300cf) akS482S0100000_21.l0).element) >= 1)) {
            return C11NN.LIZLLL(th);
        }
        c118300cf.element = i + 1;
        final C11NO c11noLJIIIIZZ = C11NN.LJIIIIZZ(Unit.LIZ);
        final TimeUnit timeUnit = TimeUnit.SECONDS;
        final C11RO c11ro = C11S5.LIZIZ;
        C1701890uOB.LIZ(timeUnit, "unit is null");
        C1701890uOB.LIZ(c11ro, "scheduler is null");
        final long jMax = Math.max(0L, 1L);
        return new C11M6<T, T>(c11noLJIIIIZZ, jMax, timeUnit, c11ro) { // from class: X.11OX
            public final long LLILLL;
            public final TimeUnit LLILZ;
            public final C11RO LLILZIL;
            public final boolean LLILZLL = false;

            @Override // X.C11NN
            public final void LJIILLIIL(C11M9<? super T> c11m9) {
                C11M9<? super T> c11ph = c11m9;
                if (!this.LLILZLL) {
                    c11ph = new C11PH(c11ph);
                }
                this.LLILLJJLI.LJIILL(new C11PU(c11ph, this.LLILLL, this.LLILZ, this.LLILZIL.LIZ(), this.LLILZLL));
            }

            {
                this.LLILLL = jMax;
                this.LLILZ = timeUnit;
                this.LLILZIL = c11ro;
            }
        };
    }

    public static final Object apply$3(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        return ((C11NN) obj).LJ(new AkS482S0100000_21((C118300cf) akS482S0100000_21.l0, 2));
    }

    public static final Object apply$4(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        UpvotePublishResponse upvotePublishResponse = (UpvotePublishResponse) obj;
        ((C1358990lT7) akS482S0100000_21.l0).getClass();
        UpvoteStruct upvoteStruct = upvotePublishResponse.upvote;
        if (upvoteStruct != null && upvoteStruct.user == null) {
            return new UpvotePublishResponse(upvoteStruct.copy(upvoteStruct.upvoteId, upvoteStruct.textId, upvoteStruct.itemId, upvoteStruct.createTime, upvoteStruct.status, C0XQ7.LJFF().getCurUser(), upvoteStruct.upvoteLabelType, upvoteStruct.userList, upvoteStruct.total, upvoteStruct.bubbleHidden, upvoteStruct.likeCount, upvoteStruct.isUserLiked, upvoteStruct.text, upvoteStruct.unReadAids, upvoteStruct.textExtra, upvoteStruct.aiMojiSticker, upvoteStruct.isRecommendMaf, upvoteStruct.replyInfo, upvoteStruct.repostRelationType, upvoteStruct.repostItemSource, upvoteStruct.carrierType, upvoteStruct.carrierId, upvoteStruct.commentInfo, upvoteStruct.cacheState, upvoteStruct.publishFrom), upvotePublishResponse.repostCount, upvotePublishResponse.upvoteCarrierList);
        }
        return upvotePublishResponse;
    }

    public static final Object apply$5(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        Pair pair = (Pair) obj;
        final String str = (String) pair.getFirst();
        final String str2 = (String) pair.getSecond();
        C1376300lv2 c1376300lv2 = C1376300lv2.LIZ;
        final Aweme aweme = (Aweme) akS482S0100000_21.l0;
        c1376300lv2.getClass();
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0m1i
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<String> interfaceC2329309At) {
                int duration;
                int musicBeginTime;
                long j;
                if (C2354709Kn.LIZIZ(str) && C2354709Kn.LIZIZ(str2) && !C1376300lv2.LIZIZ) {
                    C1376300lv2.LJIIIZ = str;
                    C1376300lv2.LJIIJ = str2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C1376300lv2.LIZ.getClass();
                    C01GW c01gw = C1376300lv2.LJIILIIL;
                    sbLIZ.append((String) c01gw.getValue());
                    sbLIZ.append(C1376300lv2.LJI);
                    sbLIZ.append(".mp4");
                    C1376300lv2.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
                    int musicBeginTime2 = 0;
                    C2354709Kn.LJFF((String) c01gw.getValue(), false);
                    Music music = aweme.getMusic();
                    if (music != null) {
                        duration = music.getDuration();
                    } else {
                        duration = 0;
                    }
                    int i = duration * LSPassThroughRecordSizeConfig.DEFAULT;
                    Pair<Integer, Integer> canvasToVideoDuration = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).photoModeService().getCanvasToVideoDuration();
                    int iMin = Math.min(canvasToVideoDuration.getSecond().intValue(), Math.max(i, canvasToVideoDuration.getFirst().intValue()));
                    if (C721220SQu.LJFF(0, aweme)) {
                        IAVProcessService iAVProcessServiceProcessService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().processService();
                        String str3 = C1376300lv2.LJIIIIZZ;
                        if (!C284050BBj.LIZ()) {
                            musicBeginTime = aweme.getMusicBeginTime();
                        } else {
                            musicBeginTime = 0;
                        }
                        long j2 = iMin;
                        String str4 = str;
                        MediaExtractor mediaExtractor = new MediaExtractor();
                        try {
                            mediaExtractor.setDataSource(str4);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        int trackCount = mediaExtractor.getTrackCount();
                        while (true) {
                            if (musicBeginTime2 < trackCount) {
                                MediaFormat trackFormat = mediaExtractor.getTrackFormat(musicBeginTime2);
                                if (trackFormat.containsKey("durationUs")) {
                                    j = trackFormat.getLong("durationUs");
                                    break;
                                }
                                musicBeginTime2++;
                            } else {
                                j = 0;
                                break;
                            }
                        }
                        mediaExtractor.release();
                        int iMax = Math.max(1, (int) (j2 / (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                        final Aweme aweme2 = aweme;
                        final String str5 = str;
                        final C11KT c11kt = (C11KT) interfaceC2329309At;
                        iAVProcessServiceProcessService.convertLivePhotoToVideo(str5, str2, str3, j2, musicBeginTime, iMax, new IAVProcessService.IConvertImageToVideoCallback() { // from class: X.0m1j
                            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
                            public final void onFailure() {
                                c11kt.onSuccess("");
                            }

                            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
                            public final void onProgress(float f) {
                                if (C1376300lv2.LIZIZ) {
                                    return;
                                }
                                C1376300lv2 c1376300lv22 = C1376300lv2.LIZ;
                                Aweme aweme3 = aweme2;
                                c1376300lv22.getClass();
                                C1376300lv2.LIZIZ((int) ((f * 100.0f) / 2), aweme3);
                            }

                            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
                            public final void onSuccess(String str6) {
                                if (C1376300lv2.LIZIZ) {
                                    c11kt.onSuccess("");
                                    return;
                                }
                                if (AwemeExtKt.containC2PA(aweme2)) {
                                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().writeTransCodeC2Pa(str5, str6);
                                }
                                c11kt.onSuccess(str6);
                            }
                        });
                        return;
                    }
                    IAVProcessService iAVProcessServiceProcessService2 = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().processService();
                    String str6 = C1376300lv2.LJIIIIZZ;
                    if (!C284050BBj.LIZ()) {
                        musicBeginTime2 = aweme.getMusicBeginTime();
                    }
                    long j3 = iMin;
                    final Aweme aweme3 = aweme;
                    final String str7 = str;
                    final C11KT c11kt2 = (C11KT) interfaceC2329309At;
                    iAVProcessServiceProcessService2.convertImageToVideo(str7, str2, str6, j3, musicBeginTime2, new IAVProcessService.IConvertImageToVideoCallback() { // from class: X.0m1k
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
                        public final void onFailure() {
                            c11kt2.onSuccess("");
                        }

                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
                        public final void onProgress(float f) {
                            if (C1376300lv2.LIZIZ) {
                                return;
                            }
                            C1376300lv2 c1376300lv22 = C1376300lv2.LIZ;
                            Aweme aweme4 = aweme3;
                            c1376300lv22.getClass();
                            C1376300lv2.LIZIZ((int) ((f * 100.0f) / 2), aweme4);
                        }

                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IConvertImageToVideoCallback
                        public final void onSuccess(String str8) {
                            if (C1376300lv2.LIZIZ) {
                                c11kt2.onSuccess("");
                                return;
                            }
                            if (AwemeExtKt.containC2PA(aweme3)) {
                                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().writeTransCodeC2Pa(str7, str8);
                            }
                            c11kt2.onSuccess(str8);
                        }
                    });
                    return;
                }
                interfaceC2329309At.onSuccess("");
            }
        });
    }

    public static final Object apply$6(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        C1376300lv2 c1376300lv2 = C1376300lv2.LIZ;
        Aweme aweme = (Aweme) akS482S0100000_21.l0;
        c1376300lv2.getClass();
        return AbstractC19484711Kz.LJII(new C1402250mat(aweme, (String) obj, 0));
    }

    public static final Object apply$7(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        final String str = (String) obj;
        C786410Ut5.LJJJI("share_url", str, ((DownloadedVideoSharePackage) akS482S0100000_21.l0).extras);
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lqY
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(new C1371430lnB(str, (String) null, 6));
            }
        });
    }

    public static final Object apply$8(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        final String strLIZ = C1374720lsU.LIZ(((BaseSharePackage) akS482S0100000_21.l0).extras.getBundle("short_link_params"), (String) obj);
        if (strLIZ == null) {
            strLIZ = "";
        }
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lmu
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(strLIZ);
            }
        });
    }

    public static final Object apply$9(AkS482S0100000_21 akS482S0100000_21, Object obj) {
        final String strLIZ = C1374720lsU.LIZ(((BaseSharePackage) akS482S0100000_21.l0).extras.getBundle("short_link_params"), (String) obj);
        if (strLIZ == null) {
            strLIZ = "";
        }
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0lrQ
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(C11KY c11ky) {
                c11ky.onSuccess(strLIZ);
            }
        });
    }
}
