package Y;

import X.C013C;
import X.C0PEM;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C1403460mcq;
import X.C1413010msF;
import X.C1413530mt5;
import X.C1416040mx8;
import X.C1416310mxZ;
import X.C1422780n80;
import X.C1422860n88;
import X.C1422900n8C;
import X.C1423870n9l;
import X.C1424300nAS;
import X.C1425410nCF;
import X.C1426080nDK;
import X.C1426110nDN;
import X.C1426250nDb;
import X.C1426400nDq;
import X.C1426520nE2;
import X.C1428520nHG;
import X.C1441340nbw;
import X.C1448350nnF;
import X.C1450120nq6;
import X.C1451630nsX;
import X.C1455250nyN;
import X.C1455260nyO;
import X.C1460230o6P;
import X.C1463020oAu;
import X.C1463100oB2;
import X.C1465420oEm;
import X.C1466090oFr;
import X.C1697810uHb;
import X.C20102213l6;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C278680Aw6;
import X.C296510Bjl;
import X.C347650Dk3;
import X.C348100Dkm;
import X.C348350DlB;
import X.C352130DrH;
import X.C365940EWi;
import X.C385670FAf;
import X.C557050Lt1;
import X.C579440Mo2;
import X.EnumC355960DxS;
import X.EnumC356070Dxd;
import X.EnumC377550ErB;
import X.InterfaceC1413540mt6;
import X.InterfaceC1422440n7S;
import X.InterfaceC1423900n9o;
import X.InterfaceC1426280nDe;
import X.InterfaceC1441305kZ;
import X.InterfaceC1446740nke;
import X.InterfaceC1452170ntP;
import X.InterfaceC1455850nzL;
import X.InterfaceC1457250o1b;
import X.InterfaceC1460000o62;
import X.InterfaceC1461350o8D;
import X.InterfaceC1651080t4E;
import X.InterfaceC1651490t4t;
import X.InterfaceC377540ErA;
import X.InterfaceC391070FUz;
import X.InterfaceC391240FVq;
import X.InterpolatorC1357200lQE;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.LiveData;
import com.bytedance.als.h0;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.feed.model.TtsReuseModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.component.u;
import com.ss.android.ugc.aweme.sticker.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.gamora.recorder.greenscreen.e0;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class AObjectS305S0200000_22 implements InterfaceC1441305kZ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        if (((C1426110nDN) aObjectS305S0200000_22.l0).LIZIZ(1)) {
            ((C1426400nDq) aObjectS305S0200000_22.l1).show();
        } else {
            ((C1426400nDq) aObjectS305S0200000_22.l1).hide();
        }
    }

    public static final void onChanged$1(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        if (((C1426110nDN) aObjectS305S0200000_22.l0).LIZIZ(8)) {
            ((C1426520nE2) aObjectS305S0200000_22.l1).show();
        } else {
            ((C1426520nE2) aObjectS305S0200000_22.l1).hide();
        }
    }

    public static final void onChanged$10(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        if (((C1422900n8C) aObjectS305S0200000_22.l0).LIZIZ(1)) {
            ((C1425410nCF) aObjectS305S0200000_22.l1).show();
        } else {
            ((C1425410nCF) aObjectS305S0200000_22.l1).hide();
        }
    }

    public static final void onChanged$11(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        String musicId;
        VecNLETrackSPtr tracks;
        TextStickerData textStickerDataW1;
        String audioTrackFilePath;
        C348100Dkm c348100DkmLIZIZ;
        VecNLETrackSPtr tracks2;
        NLETrack next;
        String uuid;
        VecNLETrackSlotSPtr slots;
        NLENode nLENode;
        AVMusic aVMusic = (AVMusic) obj;
        if (C123100dR.LIZ(((C1465420oEm) aObjectS305S0200000_22.l0).LLIZ)) {
            if (aVMusic != null) {
                musicId = aVMusic.getMusicId();
            } else {
                musicId = null;
            }
            if (Intrinsics.LJFF(musicId, ((C1465420oEm) aObjectS305S0200000_22.l0).LLIZ)) {
                if (!((C1465420oEm) aObjectS305S0200000_22.l0).LJJJLIIL().isCurrentAutoCutMode()) {
                    List<TtsReuseModel> list = ((C1465420oEm) aObjectS305S0200000_22.l0).LJJJLIIL().creativeModel.ttsVoiceInfo.ttsReuseParamsOrigin;
                    if (list != null) {
                        NLEEditor nLEEditor = (NLEEditor) aObjectS305S0200000_22.l1;
                        C1465420oEm c1465420oEm = (C1465420oEm) aObjectS305S0200000_22.l0;
                        int i = 0;
                        for (TtsReuseModel ttsReuseModel : list) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                TtsReuseModel ttsReuseModel2 = ttsReuseModel;
                                if (ttsReuseModel2.startTime <= nLEEditor.getModel().getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) && (audioTrackFilePath = (textStickerDataW1 = c1465420oEm.W1(ttsReuseModel2)).getAudioTrackFilePath()) != null && audioTrackFilePath.length() != 0) {
                                    InterfaceC1452170ntP interfaceC1452170ntP = c1465420oEm.LLIZLLLIL;
                                    if (interfaceC1452170ntP != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP)) != null) {
                                        InterfaceC391070FUz interfaceC391070FUzLJFF = c348100DkmLIZIZ.LJFF();
                                        if (!C123100dR.LIZ(textStickerDataW1.getNleUuid()) || interfaceC391070FUzLJFF.get(textStickerDataW1.getNleUuid()) == null) {
                                            C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.TEXT_SPEAK);
                                            c347650Dk3.LIZIZ = audioTrackFilePath;
                                            c347650Dk3.LIZLLL = 0L;
                                            c347650Dk3.LJ = textStickerDataW1.getAudioTrackDuration();
                                            c347650Dk3.LJFF = textStickerDataW1.getStartTime();
                                            c347650Dk3.LJI = -2L;
                                            c347650Dk3.LJIIIZ = 1.0f;
                                            interfaceC391070FUzLJFF.LJJIJ(c347650Dk3, true);
                                            String str = c347650Dk3.LIZJ;
                                            NLEModel model = nLEEditor.getModel();
                                            if (model != null && (tracks2 = model.getTracks()) != null) {
                                                Iterator<NLETrack> it2 = tracks2.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        NLETrack nLETrack = next;
                                                        if (nLETrack != null && (slots = nLETrack.getSlots()) != null && (nLENode = (NLENode) C13LP.LJJJLL(slots)) != null) {
                                                            uuid = nLENode.getUUID();
                                                        } else {
                                                            uuid = null;
                                                        }
                                                        if (Intrinsics.LJFF(uuid, str)) {
                                                            break;
                                                        }
                                                    } else {
                                                        next = null;
                                                        break;
                                                    }
                                                }
                                                NLETrack nLETrack2 = next;
                                                if (nLETrack2 != null) {
                                                    nLETrack2.setExtra("is_tts_reuse", "1");
                                                }
                                            }
                                        }
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                    List<TtsReuseModel> list2 = ((C1465420oEm) aObjectS305S0200000_22.l0).LJJJLIIL().creativeModel.ttsVoiceInfo.ttsReuseParamsOrigin;
                    if (list2 != null) {
                        ((C1465420oEm) aObjectS305S0200000_22.l0).LJJJLIIL().creativeModel.ttsVoiceInfo.setTtsReuseParams(list2);
                        return;
                    }
                    return;
                }
                return;
            }
            NLEModel model2 = ((NLEEditor) aObjectS305S0200000_22.l1).getModel();
            if (model2 != null && (tracks = model2.getTracks()) != null) {
                NLEEditor nLEEditor2 = (NLEEditor) aObjectS305S0200000_22.l1;
                for (NLETrack nLETrack3 : tracks) {
                    if (Intrinsics.LJFF(C348350DlB.LIZ(nLETrack3), "TEXT_SPEAK") && nLETrack3.hasExtra("is_tts_reuse")) {
                        nLEEditor2.getModel().removeTrack(nLETrack3);
                    }
                }
            }
            ((C1465420oEm) aObjectS305S0200000_22.l0).LJJJLIIL().creativeModel.ttsVoiceInfo.setTtsReuseParams(C13BV.INSTANCE);
        }
    }

    public static final void onChanged$12(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        List<StickerModel> listS32;
        Object next;
        InterfaceC391240FVq interfaceC391240FVqU30;
        if (obj != null) {
            VideoPublishEditModel videoPublishEditModel = ((C1455260nyO) aObjectS305S0200000_22.l0).LLLFZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            List<StickerModel> listLJFF = C1466090oFr.LJFF(videoPublishEditModel.creativeModel.stickerModel);
            InterfaceC391240FVq interfaceC391240FVqU302 = ((InterfaceC1461350o8D) aObjectS305S0200000_22.l1).u30();
            if (interfaceC391240FVqU302 != null && (listS32 = interfaceC391240FVqU302.s32()) != null) {
                InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) aObjectS305S0200000_22.l1;
                for (StickerModel stickerModel : listS32) {
                    Iterator it2 = ((ArrayList) listLJFF).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((StickerModel) next).getId() == stickerModel.getId()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    StickerModel stickerModel2 = (StickerModel) next;
                    if (stickerModel2 != null && (interfaceC391240FVqU30 = interfaceC1461350o8D.u30()) != null) {
                        interfaceC391240FVqU30.k3(stickerModel2, EnumC356070Dxd.COMMIT);
                    }
                }
            }
            C348100Dkm c348100DkmE = ((C1455260nyO) aObjectS305S0200000_22.l0).e();
            if (c348100DkmE != null && (iNLEMediaSession = c348100DkmE.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                long duration = playerApi.getDuration();
                C1455260nyO c1455260nyO = (C1455260nyO) aObjectS305S0200000_22.l0;
                VideoPublishEditModel videoPublishEditModel2 = c1455260nyO.LLLFZ;
                if (videoPublishEditModel2 == null) {
                    videoPublishEditModel2 = null;
                }
                if (MusicBeanUtilKt.extractAVMusic(videoPublishEditModel2.creativeModel.musicBuzModel) != null) {
                    InterfaceC1457250o1b interfaceC1457250o1bLLZIL = c1455260nyO.LLZIL();
                    if (interfaceC1457250o1bLLZIL != null) {
                        interfaceC1457250o1bLLZIL.LLLL(((int) duration) / LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                    InterfaceC1446740nke interfaceC1446740nkeLLZLLIL = c1455260nyO.LLZLLIL();
                    VideoPublishEditModel videoPublishEditModel3 = c1455260nyO.LLLFZ;
                    if (videoPublishEditModel3 == null) {
                        videoPublishEditModel3 = null;
                    }
                    int mMusicStart = videoPublishEditModel3.getMMusicStart();
                    int iLJJJIL = C1428520nHG.LJJJIL(c1455260nyO.LLZLLIL());
                    VideoPublishEditModel videoPublishEditModel4 = c1455260nyO.LLLFZ;
                    if (videoPublishEditModel4 == null) {
                        videoPublishEditModel4 = null;
                    }
                    C1450120nq6 c1450120nq6 = new C1450120nq6(mMusicStart, iLJJJIL, videoPublishEditModel4.getIsSoundLoop().booleanValue());
                    VideoPublishEditModel videoPublishEditModel5 = c1455260nyO.LLLFZ;
                    if (videoPublishEditModel5 == null) {
                        videoPublishEditModel5 = null;
                    }
                    c1450120nq6.LIZLLL = C1416310mxZ.LJJJJLI(videoPublishEditModel5);
                    VideoPublishEditModel videoPublishEditModel6 = c1455260nyO.LLLFZ;
                    if (videoPublishEditModel6 == null) {
                        videoPublishEditModel6 = null;
                    }
                    c1450120nq6.LJ = C1416310mxZ.LJJL(videoPublishEditModel6, 0, null, 3);
                    interfaceC1446740nkeLLZLLIL.SX(c1450120nq6);
                }
                c1455260nyO.u(((int) duration) / LSPassThroughRecordSizeConfig.DEFAULT, true);
            }
        }
    }

    public static final void onChanged$13(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        float f;
        float f2;
        long j;
        float f3;
        final Pair pair = (Pair) obj;
        if (pair != null) {
            final boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
            ((C1460230o6P) aObjectS305S0200000_22.l0).LLLILZJ = zBooleanValue;
            Animation animation = ((View) aObjectS305S0200000_22.l1).getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            Animation animation2 = ((View) aObjectS305S0200000_22.l1).getAnimation();
            if (animation2 != null) {
                animation2.cancel();
            }
            ((View) aObjectS305S0200000_22.l1).clearAnimation();
            float f4 = 1.0f;
            if (zBooleanValue) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (zBooleanValue) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, f, 1, f2);
            translateAnimation.setInterpolator(new InterpolatorC1357200lQE() { // from class: X.0lQG
            });
            if (zBooleanValue) {
                j = 0;
            } else {
                j = 250;
            }
            translateAnimation.setDuration(j);
            if (zBooleanValue) {
                f3 = 0.0f;
            } else {
                f3 = 1.0f;
                f4 = 0.0f;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(f3, f4);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setDuration(250L);
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setFillAfter(true);
            final C1460230o6P c1460230o6P = (C1460230o6P) aObjectS305S0200000_22.l0;
            final View view = (View) aObjectS305S0200000_22.l1;
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: X.0o6Y
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation3) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation3) {
                    pair.getSecond().invoke();
                    view.clearAnimation();
                    c1460230o6P.LLLILZJ = true;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation3) {
                    if (zBooleanValue) {
                        c1460230o6P.LLLLL(true);
                    }
                }
            });
            ((View) aObjectS305S0200000_22.l1).startAnimation(animationSet);
        }
    }

    public static final void onChanged$14(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        LiveData<Boolean> liveDataHB;
        InterfaceC1413540mt6 interfaceC1413540mt6Z4;
        Integer num = (Integer) obj;
        LiveData<Boolean> liveDataHB2 = ((InterfaceC1460000o62) aObjectS305S0200000_22.l0).hB(num.intValue());
        if (liveDataHB2 != null && Intrinsics.LJFF(liveDataHB2.getValue(), Boolean.TRUE)) {
            if (num.intValue() == 1 && ((C1413530mt5) aObjectS305S0200000_22.l1).LJLILLLLZI() && (interfaceC1413540mt6Z4 = ((C1413530mt5) aObjectS305S0200000_22.l1).Z4()) != null) {
                interfaceC1413540mt6Z4.YN1();
            }
            ((C1413530mt5) aObjectS305S0200000_22.l1).bK1(new C1413010msF(false, false, null, true, false, 54));
            if (num.intValue() == 2) {
                ((C1413530mt5) aObjectS305S0200000_22.l1).be(false);
            } else {
                if (num.intValue() != 15 || (liveDataHB = ((InterfaceC1460000o62) aObjectS305S0200000_22.l0).hB(15)) == null || !Intrinsics.LJFF(liveDataHB.getValue(), Boolean.TRUE)) {
                    return;
                }
                ((C1413530mt5) aObjectS305S0200000_22.l1).be(false);
            }
        }
    }

    public static final void onChanged$15(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        new AwS601S0100000_22((h0) aObjectS305S0200000_22.l1, (h0<Boolean>) 442).invoke(((C1451630nsX) aObjectS305S0200000_22.l0).LIZ.LIZ);
    }

    public static final void onChanged$16(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        C385670FAf<InterfaceC377540ErA> c385670FAfTF;
        final InterfaceC377540ErA interfaceC377540ErA = (InterfaceC377540ErA) obj;
        if (interfaceC377540ErA != null) {
            final C1441340nbw c1441340nbw = (C1441340nbw) aObjectS305S0200000_22.l0;
            final InterfaceC1452170ntP interfaceC1452170ntP = (InterfaceC1452170ntP) aObjectS305S0200000_22.l1;
            interfaceC377540ErA.on0().LIZ((C1441340nbw) aObjectS305S0200000_22.l0, new InterfaceC1441305kZ<Pair<? extends EnumC377550ErB, ? extends Float>>() { // from class: X.0nbx
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    Object first;
                    Pair pair = (Pair) obj2;
                    if (pair != null) {
                        first = pair.getFirst();
                    } else {
                        first = null;
                    }
                    if (first == EnumC377550ErB.SLIDE_END) {
                        c1441340nbw.Z1().LJJJI(c1441340nbw.o2(), C1664590tQ1.LJII(c1441340nbw), c1441340nbw.getEditModel(), interfaceC1452170ntP);
                        interfaceC377540ErA.on0().LIZIZ(this);
                    }
                }
            });
            InterfaceC1455850nzL interfaceC1455850nzLX1 = ((C1441340nbw) aObjectS305S0200000_22.l0).X1();
            if (interfaceC1455850nzLX1 != null && (c385670FAfTF = interfaceC1455850nzLX1.TF()) != null) {
                c385670FAfTF.LJI((C1441340nbw) aObjectS305S0200000_22.l0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$17(Y.AObjectS305S0200000_22 r4, java.lang.Object r5) {
        /*
            X.0LCS r5 = (X.C0LCS) r5
            java.lang.Object r0 = r4.l0
            X.0oEd r0 = (X.C1465330oEd) r0
            X.0oEQ r0 = r0.Z1()
            android.app.Activity r0 = r0.mActivity
            if (r0 == 0) goto L5b
            if (r5 == 0) goto L5c
            T r0 = r5.LIZ
            X.0o2o r0 = (X.C1458000o2o) r0
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = r0.LIZ
            if (r0 == 0) goto L5c
            boolean r0 = r0.hasLyricCopyRight()
            r2 = 1
            if (r0 != r2) goto L5c
        L21:
            java.lang.Object r1 = r4.l1
            X.013C r1 = (X.C013C) r1
            boolean r0 = r1.element
            if (r2 == r0) goto L5b
            r1.element = r2
            java.lang.Object r0 = r4.l0
            X.0oEd r0 = (X.C1465330oEd) r0
            X.0oEQ r0 = r0.Z1()
            X.01GW r0 = r0.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            X.0sna r0 = (X.InterfaceC1640760sna) r0
            X.0n95 r5 = r0.zo1()
            boolean r0 = r5 instanceof com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel
            r4 = 0
            if (r0 == 0) goto L5b
            com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel r5 = (com.ss.android.ugc.tools.infosticker.repository.internal.InfoStickerListViewModel) r5
            if (r5 == 0) goto L5b
            X.0skJ<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, com.ss.android.ugc.effectmanager.effect.model.Effect> r3 = r5.LLJJIII
            if (r3 == 0) goto L5b
            X.1DFH r0 = X.C0PEM.LIZ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0Cx0 r1 = new X.0Cx0
            r1.<init>(r5, r3, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
        L5b:
            return
        L5c:
            r2 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS305S0200000_22.onChanged$17(Y.AObjectS305S0200000_22, java.lang.Object):void");
    }

    public static final void onChanged$18(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        InterfaceC1651080t4E toolbarApi;
        Boolean bool = (Boolean) obj;
        InterfaceC1651490t4t interfaceC1651490t4t = (InterfaceC1651490t4t) aObjectS305S0200000_22.l0;
        if (interfaceC1651490t4t != null) {
            interfaceC1651490t4t.LIZ(new AwS604S0100000_25(bool, 362));
        }
        if (bool.booleanValue()) {
            ShortVideoContext shortVideoContext = ((e0) aObjectS305S0200000_22.l1).getShortVideoContext();
            if (((Boolean) C278680Aw6.LIZ.getValue()).booleanValue() && C579440Mo2.LIZ(shortVideoContext) && !((e0) aObjectS305S0200000_22.l1).getShortVideoContext().creativeModel.newGreenScreenEffectModel.getNeedAutoSwitchMob() && ((toolbarApi = ((e0) aObjectS305S0200000_22.l1).getToolbarApi()) == null || !toolbarApi.Nq())) {
                ((e0) aObjectS305S0200000_22.l1).v5();
            }
            C1403460mcq c1403460mcq = C1403460mcq.LIZ;
            ShortVideoContext shortVideoContext2 = ((e0) aObjectS305S0200000_22.l1).getShortVideoContext();
            c1403460mcq.getClass();
            if (shortVideoContext2.creativeModel.newGreenScreenEffectModel.getNeedAutoSwitchMob()) {
                C1403460mcq.LIZJ("on", shortVideoContext2, "follow_up_auto");
                shortVideoContext2.creativeModel.newGreenScreenEffectModel.setNeedAutoSwitchMob(false);
            }
            ShortVideoContext shortVideoContext3 = ((e0) aObjectS305S0200000_22.l1).getShortVideoContext();
            if (C296510Bjl.LIZ()) {
                C20684815ws.LJIILLIIL("green_screen_portrait_icon_show", C1403460mcq.LIZLLL(shortVideoContext3).LIZ);
            }
        }
        ((e0) aObjectS305S0200000_22.l1).i3(new AwS604S0100000_25(bool, 364));
        ((e0) aObjectS305S0200000_22.l1).getShortVideoContext().creativeModel.newGreenScreenEffectModel.setGreenScreenMaterialType(GreenScreenMaterial.DEFAULT);
        ((e0) aObjectS305S0200000_22.l1).getShortVideoContext().creativeModel.newGreenScreenEffectModel.setOpenGreenScreenMode(bool.booleanValue());
    }

    public static final void onChanged$19(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        INLEMediaSession iNLEMediaSession;
        INLEPlayer playerApi;
        InterfaceC1457250o1b interfaceC1457250o1b;
        List<StickerModel> listS32;
        Object next;
        InterfaceC391240FVq interfaceC391240FVqU30;
        if (obj != null) {
            List<StickerModel> listLJFF = C1466090oFr.LJFF(((C1455250nyN) aObjectS305S0200000_22.l0).getEditModel().creativeModel.stickerModel);
            InterfaceC391240FVq interfaceC391240FVqU302 = ((InterfaceC1461350o8D) aObjectS305S0200000_22.l1).u30();
            if (interfaceC391240FVqU302 != null && (listS32 = interfaceC391240FVqU302.s32()) != null) {
                InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) aObjectS305S0200000_22.l1;
                for (StickerModel stickerModel : listS32) {
                    Iterator it2 = ((ArrayList) listLJFF).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((StickerModel) next).getId() == stickerModel.getId()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    StickerModel stickerModel2 = (StickerModel) next;
                    if (stickerModel2 != null && (interfaceC391240FVqU30 = interfaceC1461350o8D.u30()) != null) {
                        interfaceC391240FVqU30.k3(stickerModel2, EnumC356070Dxd.COMMIT);
                    }
                }
            }
            C348100Dkm c348100DkmLLLLZLLLI = ((C1455250nyN) aObjectS305S0200000_22.l0).LLLLZLLLI();
            if (c348100DkmLLLLZLLLI != null && (iNLEMediaSession = c348100DkmLLLLZLLLI.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                long duration = playerApi.getDuration();
                C1455250nyN c1455250nyN = (C1455250nyN) aObjectS305S0200000_22.l0;
                if (MusicBeanUtilKt.extractAVMusic(c1455250nyN.getEditModel().creativeModel.musicBuzModel) != null) {
                    if (c1455250nyN.LLL == null && C365940EWi.LIZLLL(c1455250nyN.getEditModel())) {
                        interfaceC1457250o1b = (InterfaceC1457250o1b) c1455250nyN.LLLF.getValue();
                    } else {
                        interfaceC1457250o1b = c1455250nyN.LLL;
                    }
                    if (interfaceC1457250o1b != null) {
                        interfaceC1457250o1b.LLLL(((int) duration) / LSPassThroughRecordSizeConfig.DEFAULT);
                    }
                    InterfaceC1446740nke interfaceC1446740nkeLLLLZLL = c1455250nyN.LLLLZLL();
                    C1450120nq6 c1450120nq6 = new C1450120nq6(c1455250nyN.getEditModel().getMMusicStart(), C1428520nHG.LJJJIL(c1455250nyN.LLLLZLL()), c1455250nyN.getEditModel().getIsSoundLoop().booleanValue());
                    c1450120nq6.LIZLLL = C1416310mxZ.LJJJJLI(c1455250nyN.getEditModel());
                    c1450120nq6.LJ = C1416310mxZ.LJJL(c1455250nyN.getEditModel(), 0, null, 3);
                    interfaceC1446740nkeLLLLZLL.SX(c1450120nq6);
                }
                c1455250nyN.LLLZZIL(((int) duration) / LSPassThroughRecordSizeConfig.DEFAULT, true);
            }
        }
    }

    public static final void onChanged$2(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        String first;
        C1426250nDb c1426250nDbBn;
        h0<Pair<String, Integer>> h0Var;
        Pair<String, Integer> pairLIZJ;
        int iIntValue = ((Number) ((Pair) obj).getFirst()).intValue();
        if (((C1426110nDN) aObjectS305S0200000_22.l0).LIZIZ(4)) {
            ((C1426080nDK) aObjectS305S0200000_22.l1).show();
            InterfaceC1426280nDe interfaceC1426280nDeO4 = ((C1426080nDK) aObjectS305S0200000_22.l1).O4();
            if (interfaceC1426280nDeO4 != null) {
                interfaceC1426280nDeO4.gR0(((C1426080nDK) aObjectS305S0200000_22.l1).LLJJIJI);
            }
            if (iIntValue == 8) {
                C1426080nDK c1426080nDK = (C1426080nDK) aObjectS305S0200000_22.l1;
                InterfaceC1426280nDe interfaceC1426280nDeO42 = c1426080nDK.O4();
                if (interfaceC1426280nDeO42 == null || (c1426250nDbBn = interfaceC1426280nDeO42.bn()) == null || (h0Var = c1426250nDbBn.LIZ) == null || (pairLIZJ = h0Var.LIZJ()) == null || (first = pairLIZJ.getFirst()) == null) {
                    first = "";
                }
                c1426080nDK.F4(first);
                return;
            }
            return;
        }
        InterfaceC1426280nDe interfaceC1426280nDeO43 = ((C1426080nDK) aObjectS305S0200000_22.l1).O4();
        if (interfaceC1426280nDeO43 != null) {
            interfaceC1426280nDeO43.pt(((C1426080nDK) aObjectS305S0200000_22.l1).LLJJIJI);
        }
        InterfaceC1426280nDe interfaceC1426280nDeO44 = ((C1426080nDK) aObjectS305S0200000_22.l1).O4();
        if (interfaceC1426280nDeO44 != null) {
            interfaceC1426280nDeO44.Vb1(false, 4);
        }
        ((C1426080nDK) aObjectS305S0200000_22.l1).hide();
    }

    public static final void onChanged$3(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        LiveData<Boolean> liveDataHB;
        Integer num = (Integer) obj;
        LiveData<Boolean> liveDataHB2 = ((InterfaceC1460000o62) aObjectS305S0200000_22.l0).hB(num.intValue());
        if (liveDataHB2 != null && Intrinsics.LJFF(liveDataHB2.getValue(), Boolean.TRUE)) {
            if (num.intValue() == 2) {
                ((C1416040mx8) aObjectS305S0200000_22.l1).be(false);
            } else {
                if (num.intValue() != 15 || (liveDataHB = ((InterfaceC1460000o62) aObjectS305S0200000_22.l0).hB(15)) == null || !Intrinsics.LJFF(liveDataHB.getValue(), Boolean.TRUE)) {
                    return;
                }
                ((C1416040mx8) aObjectS305S0200000_22.l1).be(false);
            }
        }
    }

    public static final void onChanged$4(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        String first;
        C1422860n88 c1422860n88Bn;
        h0<Pair<String, Integer>> h0Var;
        Pair<String, Integer> pairLIZJ;
        int iIntValue = ((Number) ((Pair) obj).getFirst()).intValue();
        if (((C1422900n8C) aObjectS305S0200000_22.l0).LIZIZ(4)) {
            ((C1424300nAS) aObjectS305S0200000_22.l1).show();
            if (iIntValue == 8) {
                C1424300nAS c1424300nAS = (C1424300nAS) aObjectS305S0200000_22.l1;
                InterfaceC1423900n9o interfaceC1423900n9oP4 = c1424300nAS.P4();
                if (interfaceC1423900n9oP4 == null || (c1422860n88Bn = interfaceC1423900n9oP4.bn()) == null || (h0Var = c1422860n88Bn.LIZ) == null || (pairLIZJ = h0Var.LIZJ()) == null || (first = pairLIZJ.getFirst()) == null) {
                    first = "";
                }
                c1424300nAS.K4(first);
                return;
            }
            return;
        }
        ((C1424300nAS) aObjectS305S0200000_22.l1).hide();
    }

    public static final void onChanged$5(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        AVMusic aVMusic = (AVMusic) pair.getSecond();
        C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LazyLoadStickerPointResources EditAdjustClipsLogicComponent aiMusicLoadFinishEvent: success ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(" musicModel: ");
        sbLIZ.append(aVMusic);
        C201955140j.LIZJ(c20102213l6, C2188811AlT.LIZIZ(sbLIZ));
        if (zBooleanValue) {
            if (aVMusic == null) {
                if (!((C013C) aObjectS305S0200000_22.l0).element && MusicBeanUtilKt.extractAVMusic(((C1463020oAu) aObjectS305S0200000_22.l1).getEditModel().creativeModel.musicBuzModel) == null) {
                    ((C1463020oAu) aObjectS305S0200000_22.l1).pa();
                    return;
                }
                return;
            }
            C013C c013c = (C013C) aObjectS305S0200000_22.l0;
            if (c013c.element) {
                return;
            }
            c013c.element = true;
            InterfaceC377540ErA interfaceC377540ErAW9 = ((C1463020oAu) aObjectS305S0200000_22.l1).w9();
            if (interfaceC377540ErAW9 != null && interfaceC377540ErAW9.isShowing()) {
                return;
            }
            ((C1463020oAu) aObjectS305S0200000_22.l1).LLLLLJLJLL = new C557050Lt1(false);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1463100oB2((C1463020oAu) aObjectS305S0200000_22.l1, null), 3);
            C1463020oAu c1463020oAu = (C1463020oAu) aObjectS305S0200000_22.l1;
            c1463020oAu.o8(new AwS423S0200000_22(c1463020oAu, aVMusic, 28));
        }
    }

    public static final void onChanged$6(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        C013C c013c = (C013C) aObjectS305S0200000_22.l0;
        if (!c013c.element) {
            c013c.element = true;
        } else {
            ((u) aObjectS305S0200000_22.l1).LLJJIJI = new C1448350nnF(null, System.currentTimeMillis());
        }
    }

    public static final void onChanged$7(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        if (((C1422900n8C) aObjectS305S0200000_22.l0).LIZIZ(8)) {
            ((C1422780n80) aObjectS305S0200000_22.l1).show();
        } else {
            ((C1422780n80) aObjectS305S0200000_22.l1).hide();
        }
    }

    public static final void onChanged$8(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        TemplateCategoryData templateCategoryDataY8 = ((InterfaceC1422440n7S) aObjectS305S0200000_22.l0).Y8();
        Pair pair = (Pair) ((Map) obj).get(templateCategoryDataY8);
        if (pair != null) {
            ((C1422780n80) aObjectS305S0200000_22.l1).LLJJJJ.put(templateCategoryDataY8, Long.valueOf(System.currentTimeMillis()));
            ((C1422780n80) aObjectS305S0200000_22.l1).i3(new AwS601S0100000_22(pair, (Pair<String, Integer>) 268));
        }
    }

    public static final void onChanged$9(AObjectS305S0200000_22 aObjectS305S0200000_22, Object obj) {
        if (((C1422900n8C) aObjectS305S0200000_22.l0).LIZIZ(2)) {
            ((C1423870n9l) aObjectS305S0200000_22.l1).show();
        } else {
            ((C1423870n9l) aObjectS305S0200000_22.l1).hide();
        }
    }

    public AObjectS305S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
